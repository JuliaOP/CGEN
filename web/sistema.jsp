<%-- 
    Document   : sistema
    Created on : 07/06/2018, 21:51:11
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Foundation Starter Template</title>
        <link rel="stylesheet" href="foundation-6.4.2/css/foundation.css" />
        <link rel="stylesheet" href="foundation-6.4.2/css/foundation.min.css" />
        <link rel="stylesheet" href="foundation-6.4.2/css/custom.css" />

    </head>
    <body>       
        <!-- TOPO DA PÁGINA-->
        <div id="topo">
            <%@include file="topo.jsp" %>
        </div>
        <!-- CORPO DA PÁGINA-->
        <div id="conteudo">
            <%@include file="conteudo.jsp" %>
        </div>
        <!-- RODAPÉ DA PÁGINA-->
        <div id="rodape">
            <%@include file="rodape.jsp" %>
        </div>

        <script src="foundation-6.4.2/js/app.js"></script>
        <script src="foundation-6.4.2/js/vendor/jquery.js"></script>
        <script src="foundation-6.4.2/js/vendor/what-input.js"></script>
        <script src="foundation-6.4.2/js/vendor/foundation.min.js"></script>
        <script>
            $(document).foundation();
        </script>

    </body>
</html>