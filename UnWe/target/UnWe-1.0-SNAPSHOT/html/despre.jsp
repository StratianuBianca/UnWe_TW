<%--
  Created by IntelliJ IDEA.
  User: strat
  Date: 5/20/2021
  Time: 11:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About</title>
    <link rel="stylesheet" href="../css/stilizareAbout.css">
    <link rel="stylesheet" href="../css/header&footer.css">
</head>

<body>
<header>
    <div class="headerNormalView">
        <a href="../html/proiect.jsp" class="classForLogo">
            <img alt="Logo" src="../resources/logo.png" id="imgLogo">
            <p class="text_hf" id="headerTitle"> Date șomaj România</p>
        </a>
        <div id="space"></div>
        <div class="headerBtn">
            <a href="../html/viewPage.jsp" class="text_hf header-Btn" id="viewButton">Vizualizare</a>
            <a href="../html/criterialView.jsp" class="text_hf header-Btn" id="compareButton">Comparare</a>
            <a href="../html/despre.jsp" class="text_hf header-Btn" id="aboutButton">Despre</a>
        </div>
        <div class="phone_header_menu">
            <nav class="phone_meniu" id="phone__menu">
                <p class="menu_title" id="menu_title">Meniu</p>
                <div class="menuBtn">
                    <a href="../html/viewPage.jsp" class="header-Btn text_hf text_menu" id="viewMenu">Vizualizare</a>
                    <a href="../html/criterialView.jsp" class="header-Btn text_hf text_menu" id="compareMenu">Comparare</a>
                    <a href="./despre.jsp" class="header-Btn text_hf text_menu" id="aboutMenu">Despre</a>
                </div>
            </nav>
            <button type="button" class="header-Btn" id="phone_meniu_btn">Meniu</button>
        </div>
    </div>
</header>
<main>
    <section class="words">
        <p class="start">
            Aceasta pagina Web ajuta la vizualizarea si compararea multi-criteria a datelor publice referitoare la somajul din Romania pe ultimele 15 luni. Vizualizarile sunt in 4 maniere, iar statisticile vor putea fi exportate in formare CSV, SVG si PDF.
        </p>
        <section class="images">
            <img alt="chart" src="../resources/chart1.png" class="imgChart">
            <img alt="chart" src="../resources/chart2.png" class="imgChart">
            <img alt="chart" src="../resources/chart3.png" class="imgChart">
            <img alt="chart" src="../resources/chart4.png" class="imgChart">
        </section>
        <section class="criteria">
            <p class="criteriaText">Mai jos sunt criteriile dupa care pot fi selectate statisticile.</p>
            <img alt="chart" src="../resources/criteria.png" id="imgCriteria">
        </section>
        <section class="viewChart">
            <p class="viewText">
                Pentru modul de vizualizare am pus la dispozitie o harta in care puteti selecta orasul pentru care vreti sa vizualizati datele:
            </p>
            <img alt="chart" src="../resources/vizualizare.png" id="imgView">
        </section>
        <div class="raport">
            <a href="../html/raport.html" class="raportText"> Aici </a> avem un raport in care am descris tehnicile utilizate, dar si modul de lucru.
        </div>
    </section>
</main>
<footer>
    <section class="footerElem">
        <div class="resource text_hf"> Resurse: </div>
        <a href=https://data.gov.ro class="text_hf"> DATA.GOV.RO</a>
    </section>
    <div class="aboutFtr footerElem">
        <p class="text_hf" id="about"> Despre </p>
        <a href="../html/despre.jsp" class=" text_hf" id="aboutWe"> Date somaj Romania </a>
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
<script src="../js/about.js"></script>
<script src="../js/header&footer.js"></script>
</html>
