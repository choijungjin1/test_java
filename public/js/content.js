
$(function(){
    //1
    $("#btn1").click(function(){ 
        $("#txt1").remove();
    });
    $("#btn2").click(function(){ 
        $("#content").html("<p id=txt1>"+ $("#txt2").text() +"</p>"+"<p id=txt2>"+ $("#txt2").text() +"</p>"); 
        
    });     
    $("#btn3").click(function(){ 
        $("#txt1").text($("#txt1").text()+$("#txt2").text());
    });
    
    //2
    $("#g_name").click(function(){
        
        $("#result").text($("#name").attr('name')+" "+$("#comment").attr('name')+" "+$("#sel").attr('name'));
    });
    $("#g_comment").click(function(){ 
        $("#result").text($("#name").val()+" "+$("#comment").val());
    });     
    $("#g_city").click(function(){ 
        $("#result").text($("#sel option:selected").text());
    });

    //3

    $("#reverse").click(function(){
        $("input:checkbox[name='cbox']").each(function(){
            if($(this).is(":checked") == true) {
                $(this).prop("checked",false);
            }else{
                $(this).prop("checked",true);
            }
        });
    });
    $("#all").click(function(){
        $("input:checkbox[name='cbox']").each(function(){
            $(this).prop("checked",true);
        });
    });

});