<#import "/spring.ftl" as spring />
<#import "/macro/pagination.ftl" as pagination/>
<script src="/webjars/jquery/1.12.3/jquery.min.js"></script>
<script src="/webjars/jquery-ui/1.11.4/jquery-ui.min.js"></script>
<script src="/webjars/jquery-form/3.51/jquery.form.js"></script>
<script src="/webjars/jquery-validation/1.15.0/jquery.validate.min.js"></script>
<script src="/js/search.js"></script>
<@layout javascript=javascriptContent>

<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">책 검색</h1>
        </div>


        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        DataTables Advanced Tables
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTables_wrapper form-inline dt-bootstrap no-footer" id="dataTables-example_wrapper">

                            <form id = "bookSearch name = "bookSearch">
                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="dataTables_filter" id="dataTables-example_filter">
                                            <#--<select name="seedType" onchange="goChg(this)">-->
                                                <#--<option value="이름" </select>-->
                                                <#--<option value="시간" </select>-->
                                            <#--</select>-->
                                            <label>Search:
                                                <#--<input class="form-control input-sm" id ="inputSearch" name ="inputSearch" aria-controls="dataTables-example" type="text" placeholder=""></label>-->
                                            <input id ="inputSearch">
                                            </label>
                                        </div>
                                    </div>
                                </div>


                            </form>

                            <div class="row">
                                <div class="col-sm-12">
                                    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                                        <thead>
                                        <tr>
                                            <th>책제목</th>
                                            <th>작가</th>
                                            <th>출판사</th>
                                            <th>도서정가</th>
                                            <th>판매가</th>
                                        </tr>
                                        </thead>
                                        <tbody>

                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Mozilla 1.3</td>
                                            <td>Win 95+ / OSX.1+</td>
                                            <td class="center">1.3</td>
                                            <td class="center">A</td>
                                        </tr>
                                        <tr class="gradeA">
                                            <td>Gecko</td>
                                            <td>Mozilla 1.4</td>
                                            <td>Win 95+ / OSX.1+</td>
                                            <td class="center">1.4</td>
                                            <td class="center">A</td>
                                        </tr>


                                        </tbody>
                                    </table>

                                    <div class="col-sm-6">
                                        <@pagination.doPaginationJs pagedata "go"/>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>

    </div>
</div>



</@layout>