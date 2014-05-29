<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<!-- MASTER -->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <title>Dado</title>
    </head>
    <body>
        <div> 

            <div>
                <form class="form-horizontal" action="#" id="formulario" name="formulario">
                    <h2>Introduzca dos números entre 1 y 6</h2>
                    <div class="control-group">
                        <label class="control-label" for="inputId">Número 1</label>
                        <div class="controls">
                            <input type="text" id="num1" name="num1" placeholder="número 1" />
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label"  for="inputNombre">Número 2</label>
                        <div class="controls">
                            <input type="text" id="num2" name="num2" placeholder="número 2" />
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <button type="submit" id="submitForm" class="btn submitForm">Submit</button>
                        </div>
                    </div>
                </form>
            </div> 
            <!--<div>
                <button class="btn" id="crear">Crear</button>
            </div>-->
        </div> 
        <div>
            <div id="indexContenido">


            </div><!-- tabla donde se irán saltando los números-->

        </div>
        <div> <!-- El número que ha sacado el dado ha sido-->

        </div>
        <script src="js/main.js"></script>
        <script src="js/util.js"></script>
        <script>


            $(document).ready(function() {

                /*  $('#crear').unbind('click');
                 $('#crear').click(function() {
                 var numero = objeto('1', '6', '<%--<%=request.getContextPath()%>--%>');
                 //var numeroView = vista(numero, '<%--<%=request.getContextPath()%>--%>'); // per a que pasarli el getContextPath() si podries sacarlo del objecte
                 $('#indexContenido').empty().append(numero.getNumber());
                 });*/
                $('#submitForm').unbind('click');
                $('#submitForm').click(function(event) {
                    var num1 = $('#num1').val();
                    var num2 = $('#num2').val();
                    var numero = objeto(num1, num2, '<%=request.getContextPath()%>');
                    $('#indexContenido').empty().append(numero.getNumber());
                    return false;
                });


            });
        </script>
    </body>
</html>
