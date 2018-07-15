

$(function() {
    joinModule.init();
});

var joinModule = {
    init : function(){
        var joinModule = this;
        // joinModule.validate();

        $("#joinBtn").click(function(event){

            event.preventDefault();
            var $form = $("#join");

            if($form.valid()){
                joinModule.join();
            }
        });
    },

    join : function(){
        var userJoinDto = JSON.stringify($("#join").serializeToJSON({associativeArrays: false}));
        console.log(userJoinDto)

        $.ajax({
            type : "POST",
            url : "/join",
            contentType : "application/json;charset=UTF-8",
            data : userJoinDto,
            dataType : "json",
            success : function(data) {
                if(data.result == "OK"){
                    alert("가입에 성공했습니다 축하드립니다. 로그인 해주세요")
                    location.replace("/login");
                }else{
                    alert(data.msg);
                }
            },
            error : function(){
                alert("잠시후 다시 시도해 주세요");
            }
        });
    },
    validate : function(){
        var $form = $("#join"),
            validator = $form.validate({
                rules : {
                    "id" : {
                        required : true,
                        minlength : 4,
                        maxlength : 20,
                        englishwordNumber : true
                    },
                    "password" : {
                        required : true,
                        minlength : 8,
                        maxlength : 20,
                        password_strong : true
                    }
                    ,
                    "rePassword" : {
                        equalTo : "#info_pw"
                    },
                    "name" : {
                        minlength : 3,
                        maxlength : 10,
                        koreanword : true
                    }
                },
                messages : {
                    "id" : {
                        required: "id를 입력해 주세요.",
                        minlength : "id는 최소 {0}글자 입니다.",
                        maxlength : "id는 최대 {0}글자 입니다.",
                        englishwordNumber : "id는 영문자,숫자만 가능합니다."
                    },
                    "password" : {
                        required : "비밀번호를 입력해 주세요.",
                        minlength : "비밀번호는 최소 {0}글자 입니다.",
                        maxlength : "비밀번호는 최대 {0}글자 입니다."
                    },
                    // ,
                    "rePassword" : {
                        equalTo : "비밀번호가 일치하지 않습니다."
                    },
                    "name" : {
                        minlength : "이름은 최소 {0}글자 입니다.",
                        maxlength : "이름은 최대 {0}글자 입니다."
                    }
                },
                errorPlacement : function(error, element){
                    // 에러 메시지 우측 표시 제거
                },
                invalidHandler : function(form, validator){
                    var errors = validator.numberOfInvalids();
                    if(errors){
                        alert(validator.errorList[0].message);
                        validator.errorList[0].element.focus();
                    }
                }
            });
    }
}