/*Crear función get para contactar con servidor*/

var objeto = function(num1, num2, ContextPath) {
    //contexto privado
    var urlDatos = ContextPath + '/json?num1=' + num1 + '&num2=' + num2;
    return {
        //contexto público (interface)
       
        getNumber: function() {
            $.when(ajaxCallSync(urlDatos, 'GET', '')).done(function(data) {
               numeroRecogido = "<p>Número del dado: " + data + "</p>";
            });
            return numeroRecogido;
        }
    };
};
