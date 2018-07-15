<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>My Books</title>

    <!-- Bootstrap Core CSS -->
    <link href="/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <#--<link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">-->

    <!-- Custom CSS -->
    <link href="/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>

    <!--<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>-->
    <!--<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>-->
    <![endif]-->

</head>

<body>

<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Please Sign In</h3>
                </div>
                <div class="panel-body">
                    <form name="loginForm" id="loginForm" action="/loginAct" method="POST">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" placeholder="id" name="id" type="id" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control" placeholder="Password" id ="password" name="password" type="password" value="">
                            </div>
                            <#--<div class="checkbox">-->
                                <#--<label>-->
                                    <#--<input name="remember" type="checkbox" value="Remember Me">Remember Me-->
                                <#--</label>-->
                            <#--</div>-->
                            <!-- Change this to a button or input when using this as a form -->
                            <#--<a href="index.html" class="btn btn-lg btn-success btn-block">Login</a>-->
                            <a href="#" class="btn btn-lg btn-success btn-block" id="btnLogin">로그인</a>
                            <a href="/join" class="btn btn-lg btn-success btn-block">회원가입</a>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- jQuery -->
<#--<script src="../vendor/jquery/jquery.min.js"></script>-->

<!-- Bootstrap Core JavaScript -->
<#--<script src="/js/bootstrap.min.js"></script>-->

<!-- Metis Menu Plugin JavaScript -->
<#--<script src="../vendor/metisMenu/metisMenu.min.js"></script>-->

<!-- Custom Theme JavaScript -->
<#--<script src="../dist/js/sb-admin-2.js"></script>-->
<script src="/webjars/jquery/1.12.3/jquery.min.js"></script>
<script src="/webjars/jquery-form/3.51/jquery.form.js"></script>
<script src="/webjars/jquery-ui/1.11.4/jquery-ui.min.js"></script>

<script>
    $(function() {
        $("#btnLogin").click(function(){
            $("#loginForm").submit();
        });
    });
</script>

</body>

</html>
