 $(document).ready(function() {
     
               $('#crear').unbind('click');
                $('#crear').click(function() {
                    loadModalForm(view, prefijo_div + '#modal01', $(this).attr('id'));
                });
                
 });


