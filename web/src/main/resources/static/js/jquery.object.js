/*
* jQuery plugin for ActiveX Objects
*/

(function($) {


    /**
    * objectUdsExcel - 주소록용 ActiveX
    * param options{}
    *     height: number, 엑셀 높이
    *      width: number, 엑셀 폭
    *   excelrow: number, 입력가능한 줄수
    *       nhic: number, 주소록형태 (0:일반주소록, 2:발송제한목록)
    *
    * $('#UdsExcelObject').objectUdsExcel({ nhic:0 });
    * $('#UdsExcelObject').objectUdsExcel({ height:300, width:600, excelrow:15000, nhic:2 });
    */
    $.fn.objectUdsExcel = function(options) {

        var settings = jQuery.extend({
            id:'PPurioAddress',
            codebase:'/include/plugin/UdsExcel3_0_2_9.cab#version=3,0,2,9',
            height:320,
            width:635,
            excelrow:10000,
            nhic:0
        }, options);

        str =  '<OBJECT ID="'+ settings.id +'" CLASSID="clsid:7C94CDB9-A47B-4DB4-91C1-4E89BBE61939" CODEBASE="'+ settings.codebase +'" HEIGHT="'+ settings.height +'" WIDTH="'+ settings.width +'">';
        str += '<param name="HEIGHT" value="'+ settings.height +'">';
        str += '<param name="WIDTH" value="'+ settings.width +'">';
        str += '<param name="ExcelRow" value="'+ settings.excelrow +'">';
        str += '<param name="NHIC" value="'+ settings.nhic +'">';
        str += '</OBJECT>';

        $(this).html(str);

        return this;

    };


    /**
    * objectUdsMulti - 엑셀 다른내용뿌리기용 ActiveX
    * param options{}
    *       height: number, 엑셀 높이
    *        width: number, 엑셀 폭
    *     excelrow: number, 입력가능한 줄수
    *       msglen: number, 메시지 컬럼 입력시 알림창 띄울 바이트수
    *  servicetype: string, 서비스형태 ('SMS','FAX')
    *
    * $('#UdsMultiObject').objectUdsMulti({ servicetype:'FAX' });
    * $('#UdsMultiObject').objectUdsMulti({ height:300, width:600, excelrow:15000, servicetype:'SMS', msglen:90 });
    */
    $.fn.objectUdsMulti = function(options) {

        var settings = jQuery.extend({
            id:'ExcelMultiForm',
            name:'Address',
            codebase:'/include/plugin/UdsMulti3_0_2_8.cab#version=3,0,2,8',
            height:320,
            width:609,
            excelrow:10000,
            msglen:80,
            servicetype:'SMS'
        }, options);

        str =  '<OBJECT ID="'+ settings.id +'" NAME="'+ settings.name +'" CLASSID="clsid:D89D56F5-B105-494f-993A-925C826E41F5" CODEBASE="'+ settings.codebase +'" HEIGHT="'+ settings.height +'" WIDTH="'+ settings.width +'">';
        str += '<param name="HEIGHT" value="'+ settings.height +'">';
        str += '<param name="WIDTH" value="'+ settings.width +'">';
        str += '<param name="ExcelRow" value="'+ settings.excelrow +'">';
        str += '<param name="MsgLen" value="'+ settings.msglen +'">';
        str += '<param name="ServiceType" value="'+ settings.servicetype +'">';
        str += '</OBJECT>';

        $(this).html(str);

        return this;
    };

    /**
     * objectUdsReplace - 엑셀 일부바꿔뿌리기용 ActiveX
     * param options{}
     *     height: number, 엑셀 높이
     *      width: number, 엑셀 폭
     *   excelrow: number, 입력가능한 줄수
     *    msgtype: number, 메시지형태 (0:SMS, 1:MMS)
     *
     * $('#UdsReplaceObject').objectUdsReplace({ msgtype:0 });
     * $('#UdsReplaceObject').objectUdsReplace({ height:300, width:600, excelrow:15000, msgtype:1 });
     */
     $.fn.objectUdsReplace = function(options) {

         var settings = jQuery.extend({
             id:'ExcelReplaceForm',
             name:'EPF',
             codebase:'/include/plugin/UdsReplace3_0_2_1.cab#version=3,0,2,1',
             height:325,
             width:609,
             excelrow:10000,
             msgtype:0
         }, options);

         str =  '<OBJECT ID="'+ settings.id +'" NAME="'+ settings.name +'" CLASSID="clsid:86E956B7-732A-4e1e-ADFF-200D8E11AA9D" CODEBASE="'+ settings.codebase +'" HEIGHT="'+ settings.height +'" WIDTH="'+ settings.width +'">';
         str += '<param name="HEIGHT" value="'+ settings.height +'">';
         str += '<param name="WIDTH" value="'+ settings.width +'">';
         str += '<param name="ExcelRow" value="'+ settings.excelrow +'">';
         str += '<param name="MsgType" value="'+ settings.msgtype +'">';
         str += '</OBJECT>';

         $(this).html(str);

         return this;
     };

})(jQuery);
