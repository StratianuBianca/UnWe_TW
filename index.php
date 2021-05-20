<?php

require_once 'principal/proiect.html';
exec("java -jar Backend-1.0-SNAPSHOT.jar https://database-unwe.herokuapp.com 2>&1", $output);
print_r($output);
?>