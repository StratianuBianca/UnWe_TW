<?php

require_once 'principal/proiect.html';
$output;
exec("java -jar Backend-1.0-SNAPSHOT.jar ", $output);
echo $output;
?>