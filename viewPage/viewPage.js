//insert Map
var map = new ol.Map({
    target: 'map',
    layers: [
      new ol.layer.Tile({
        source: new ol.source.OSM()
      })
    ],view: new ol.View({
        center: ol.proj.fromLonLat([24.75,46.14]),
        zoom: 6
      })
});

//Arrow on county
const fillStyle = new ol.style.Fill({
    color: [245,49,49,0.8],
})
const strokeStyle = new ol.style.Stroke({
    color: [46, 45, 45, 0.3],
    width: 1.2
}) 
const arrowStyle = new ol.style.Style({
    fill: fillStyle,
    stroke: strokeStyle,
    image: new ol.style.RegularShape({
        fill: fillStyle,
        stroke: strokeStyle,
        points: 3,
        radius: 13,
        rotation: Math.PI / 3,
        angle: 0,
        displacement:[-11,7],
      })
})

const countyList = new ol.layer.VectorImage({
    source: new ol.source.Vector({
        url:'libs/map.geojson',
        format: new ol.format.GeoJSON()
    }),
    visible:true,
    title: 'Rata șomajului la nivelul fiecărui județ',
    style: arrowStyle,
})

map.addLayer(countyList)


//Show Info

const overlayContainer = document.querySelector('.overlay-container');
const overlayInfo = new ol.Overlay({
    element: overlayContainer
})
map.addOverlay(overlayInfo);

const overlayCounty = document.getElementById('overlay-county-name');
const overlayCountyInfo = document.getElementById('overlay-county-info');

map.on('click', showInfo)

function showInfo(event){
    overlayInfo.setPosition(undefined);
    map.forEachFeatureAtPixel(event.pixel, function(feature, layer){
       let coordinate = event.coordinate;
       let countyName = feature.get('Name');
       let countyInfo = feature.get('Info'); 
       overlayInfo.setPosition(coordinate);
       overlayCounty.innerHTML= countyName;
       overlayCountyInfo.innerHTML = countyInfo;
    })
}


/*Last 12 months*/

let months = {
    "ro": {0: "Ianuarie", 1: "Februarie", 2: "Martie", 3:"Aprilie", 4:"Mai", 5:"Iunie", 6:"Iulie", 7:"August", 8:"Septembrie", 9:"Octombrie", 10:"Noiembrie", 11:"Decembrie"},
    "en": {0:"January", 1:"February", 2:"March", 3:"April", 4:"May", 5:"June", 6:"July", 7:"August", 8:"September", 9:"October", 10:"November", 11:"December"}}
var d = new Date();
var currentMonth = d.getMonth();
var currentYear = d.getFullYear()

for(var i=0 ; i <15; i++){
     var option = document.createElement('option');
     option.innerHTML=months["ro"][currentMonth].concat(' ').concat(currentYear.toString());
     var select = document.getElementById("drop-perioada");
     option.classList.add("text");
     option.classList.add("text_option");
     select.insertAdjacentElement("beforeend",option);
    currentMonth = currentMonth-1;
    if(currentMonth == -1){
        currentMonth = 11;
        currentYear = currentYear-1;
    }
 }

/*Romanian-English*/
function changeMonth(lang){
    var currentMonthCh = d.getMonth();
    var currentYearCh = d.getFullYear();
    let mySelect = document.getElementById("drop-perioada");
    let selectLen = mySelect.length;
    for(var j=0; j < selectLen ; j++){
       mySelect.options[j].innerHTML = months[lang][currentMonthCh].concat(' ').concat(currentYearCh.toString()); 
       currentMonthCh = currentMonthCh-1;
    if(currentMonthCh == -1){
        currentMonthCh = 11;
        currentYearCh = currentYearCh-1;
    }
  }
}


let langViewPage = {
    "en": {
        "month": "Select a month:",
        "category": "Select a category:",
        "genderOpt": 'Gender',
        "studiesOpt": 'Studies level',
        "envOpt": 'Environment',
        "ageOpt": 'Age range',
        "woman" : "Woman",
        "man": "Man",
        "noStudies": "No studies",
        "primarySchool": "Primary education",
        "secondarySchool": "Secondary education",
        "highschool": "Highschool education",
        "postsecodarySchool": "Postsecondary education",
        "vocationalEducation": "Vocational education",
        "universityEducation": "University education",
        "under": "under 25",
        "over": "over 50"
    },
    "ro": { 
        "month": "Selectează luna:",
        "category": "Selectează categoria:",
        "genderOpt": 'Gen',
        "studiesOpt": 'Studii',
        "envOpt": 'Mediu',
        "ageOpt": 'Categorii de vârsta',
        "woman" : "Femeie",
        "man": "Bărbat",
        "noStudies": "Fără studii",
        "primarySchool": "Învățământ primar",
        "secondarySchool": "Învățământ gimnazial",
        "highschool": "Învățământ liceal",
        "postsecodarySchool": "Învățământ postliceal",
        "vocationalEducation": "Învățământ profesional/arte și meserii",
        "universityEducation": "Învățământ universitar",
        "under": "sub 25",
        "over": "peste 50"
   
    }
}

let month = document.getElementById("month");
let category = document.getElementById("category");
let genderOpt = document.getElementById("genderOpt");
let studiesOpt = document.getElementById("studiesOpt");
let envOpt = document.getElementById("envOpt");
let ageOpt = document.getElementById("ageOpt");
let woman = document.getElementById("woman");
let man = document.getElementById("man");
let noStudies = document.getElementById("noStudies");
let primarySchool = document.getElementById("primarySchool");
let secondarySchool = document.getElementById("secondarySchool");
let highschool = document.getElementById("highschool");
let postsecodarySchool = document.getElementById("postsecondarySchool");
let vocationalEducation = document.getElementById("vocationalEducation");
let universityEducation = document.getElementById("universityEducation");
let under = document.getElementById("under");
let over = document.getElementById("over");

link.forEach(e1 => {
    e1.addEventListener("click", () => {
        let a = e1.getAttribute("lang");
        
        month.textContent = langViewPage[a].month;
        category.textContent = langViewPage[a].category;
        genderOpt.setAttribute('label',langViewPage[a].genderOpt);
        studiesOpt.setAttribute('label', langViewPage[a].studiesOpt);
        envOpt.setAttribute('label', langViewPage[a].envOpt);
        ageOpt.setAttribute('label', langViewPage[a].ageOpt);
        woman.textContent = langViewPage[a].woman;
        man.textContent = langViewPage[a].man;
        noStudies.textContent = langViewPage[a].noStudies;
        primarySchool.textContent = langViewPage[a].primarySchool;
        secondarySchool.textContent = langViewPage[a].secondarySchool;
        highschool.textContent = langViewPage[a].highschool;
        postsecodarySchool.textContent = langViewPage[a].postsecodarySchool;
        vocationalEducation.textContent = langViewPage[a].vocationalEducation;
        universityEducation.textContent = langViewPage[a].universityEducation;
        over.textContent = langViewPage[a].over;
        under.textContent = langViewPage[a].under;
        changeMonth(a);
    });

})