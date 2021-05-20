<?php

require_once 'principal/proiect.html';
$JAVA_HOME = "\jdk-11.0.11";
$PATH = "$JAVA_HOME/bin:".getenv('PATH');
putenv("JAVA_HOME=$JAVA_HOME");
putenv("PATH=$PATH");
shell_exec("javac  Main.java  2>&1");
$OUTPUT = shell_exec("java  Main 2>&1");
echo $OUTPUT;
?>