Project Name : Selenium Project

Owner Name : S.Prashanth
Description : 
  We are automating the ORANGE HRM application as per the evaluation guidelines:
      1)Login to the application
      2)Enter User Management in Admin  and select users under user management
      3)In employee name type "Ranga" and select "Ranga Akunuri".
      4)Assert whether the name "James Butler is enabled or not"
      5)Logout from the application
      
Instructions to set up and run project : 
    1)Open the Spring Tool Suites
    2)Create a new project named demo_Project
    3)Create a package name demo_package
    4)Create a class named "unit3_evaluation2_orangehrm"
    5)Type the selenium script 
    6) Run as testNG

Any dependencies or prerequisites needed:
  Add these dependencies in the pom.xml file in the package created.
<project xmlns="https://maven.apache.org/POM/4.0.0" xmlns:xsi="https://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>demo_project</groupId>
  <artifactId>demo_project</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <dependencies><!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.4.0</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>
<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.8.0</version>
</dependency>
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.2</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.2</version>
</dependency>
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
</dependencies>
</project>



