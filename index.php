<?php

require_once 'principal/proiect.html';
exec("java -cp  ./Backend/src/main/java/edu/tw/Main Hello 2>&1", $output);
print_r($output);
?>