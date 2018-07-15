<#import "/spring.ftl" as spring />

<#--<#assign javascriptContent>-->
<script src="/webjars/jquery/1.12.3/jquery.min.js"></script>
<script src="/webjars/jquery-ui/1.11.4/jquery-ui.min.js"></script>
<script src="/webjars/jquery-form/3.51/jquery.form.js"></script>
<script src="/webjars/jquery-validation/1.15.0/jquery.validate.min.js"></script>
<script src="/js/jquery.serializeToJSON.js"></script>
<script src="/js/jquery-validation-additional-method.js"></script>
<script src="/js/jquery.object.js"></script>
<script src="/js/join.js"></script>
<#--</#assign>-->

<@layout javascript=javascriptContent>

<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">회원가입</h1>
        </div>

    </div>
    <!-- /.row -->

    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    회원 정보 입력
                </div>

                <div class="panel-body">
                    <div class="row">
                        <div class="col-lg-6">
                            <form role="form" id = "join" name = "join" >
                                <div class="form-group">
                                    <label>아이디</label>
                                    <input class="form-control" name ="id" value="">

                                </div>
                                <div class="form-group">
                                    <label>이름</label>
                                    <input class="form-control" name ="name" value="">

                                </div>
                                <div class="form-group">
                                        <label>비밀번호</label>
                                    <input class="form-control" id="info_pw" name="password" value ="" placeholder="비밀번호">

                                </div>
                                <div class="form-group">
                                    <label>비밀번호 재확인</label>
                                    <input class="form-control" name="rePassword" , id = "rePassword" value = "" placeholder="비밀번호 재입력">

                                </div>
                                <#--<buttontype="submit" class="btn btn-primary">가입하기</button>-->
                            </form>
                            <a class="btn btn-primary" id="joinBtn" name ="joinBtn">가입하기</a>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>







</div>
<!-- /#page-wrapper -->

</@layout>