function ajaxPostToken(url,data,success){
    jQuery.support.cors = true;  
    data.User_Token = window.localStorage.getItem('User_Token')
    $.ajax({
        type:"post",    
        url:url,
        data:data,
        async:true,
        cache:false,
        dataType: "json",
        crossDomain: true == !(document.all),
        success: function(res) {
            success(res)
        },
        error:function(res) { 
       }   
    });        
}