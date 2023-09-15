Spring MVC
1. Create a Spring project
    [new module, SpringInitializr,  maven project, select spring web dependency;
    group and package name:com.cydeo; Artifact: Spring-03-MVC,
    Project SDK and Java: same version, packaging: Jar;
    Developer Tools: Lombok; Web: Spring Web; Template Engine: Thymeleaf

    add pom.xml and src to git; pom.xml add as Maven project]
2. Create html files (in template folder for dynamic webpage)
    -Welcome
    -Employees
3. Create controller package and controller class
4. Label class with @Controller annotation
5. Add a method to class with returning html file as String
6. Label method with @RequestMapping annotation and provide path
7. on the html file:
<html lang="en" xmlns:th="http://www.thymeleaf.org">
has to be added and  <li th:text="${employeeName}"></li>
has to match with:  model.addAttribute("employeeName", "Max");
in the corresponding Controller file
8. add a POJO in model package and create an object in Controller
   and add the object to the model and use attribute name in the html file
