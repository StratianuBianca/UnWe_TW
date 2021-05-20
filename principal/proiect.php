<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Proiect</title>
    <link rel="stylesheet" href="./principalPage.css">
    <link rel="stylesheet" href="../header&footer/header&footer.css">
</head>

<body>
    <header>
        <div class="headerNormalView">
            <a href="../principal/proiect.html" class="classForLogo">
                <img alt="Logo" src="../header&footer/logo.png" id="imgLogo">
                <p class="text_hf" id="headerTitle"> Date șomaj România</p>
            </a>
            <div id="space"></div>
            <div class="headerBtn">
                <a href="../viewPage/viewPage.html" class="text_hf header-Btn" id="viewButton">Vizualizare</a>
                <a href="../criterialView/criterialView.html" class="text_hf header-Btn" id="compareButton">Comparare</a>
                <a href="../about/despre.html" class="text_hf header-Btn" id="aboutButton">Despre</a>
            </div>
            <div class="phone_header_menu">
                <nav class="phone_meniu" id="phone__menu">
                    <p class="menu_title" id="menu_title">Meniu</p>
                    <div class="menuBtn">
                        <a href="../viewPage/viewPage.html" class="header-Btn text_hf text_menu" id="viewMenu">Vizualizare</a>
                        <a href="./criterialView/criterialView.html" class="header-Btn text_hf text_menu" id="compareMenu">Comparare</a>
                        <a href="../about/despre.html" class="header-Btn text_hf text_menu" id="aboutMenu">Despre</a>
                    </div>
                </nav>
                <button type="button" class="header-Btn" id="phone_meniu_btn">Meniu</button>
            </div>
        </div>
    </header>
    <main id="menuPanel">
        <h1 class="title" id="title">DATE SOMAJ ROMANIA</h1>
        <section class="buttonsMain" id="buttonsMain">
            <a href="../viewPage/viewPage.html" class="viewButtonMain">Vizualizare</a>
            <a href="../criterialView/criterialView.html" class="compareButtonMain">Comparare</a>
        </section>
    </main>
    <footer>
        <section class="footerElem">
            <div class="resource text_hf"> Resurse: </div>
            <a href=https://data.gov.ro class="text_hf"> DATA.GOV.RO</a>
        </section>
        <div class="aboutFtr footerElem">
            <p class="text_hf" id="about"> Despre </p>
            <a href="../about/despre.html" class=" text_hf" id="aboutWe"> Date somaj Romania </a>
        </div>
        <section class=" footerElem languageChange">
            <div class="lang text_hf">Limba:</div>
            <div class="langBtn" id="langBtn">
                <button type="button" lang="ro" class="languageButton text_hf">RO</button>
                <button type="button" lang="en" class="languageButton text_hf">EN</button>
            </div>
        </section>
        <div class="footer2">
            <h6 class="text_hf">Lazar Catalina</h6>
            <h6 class="text_hf">Stratianu Bianca</h6>
        </div>
    </footer>
</body>
<script src="../header&footer/header&footer.js"></script>
<script src="./principalPage.js"></script>

</html>
