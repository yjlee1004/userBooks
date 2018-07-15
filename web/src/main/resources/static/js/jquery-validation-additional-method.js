'use strict';

/*
 * englishwordNumber
 * 영문자,숫자
 */
$.validator.addMethod( "englishwordNumber", function( value, element ) {
	return this.optional( element ) || /(^[a-zA-Z0-9]+$)/.test( value );
}, "영문자,숫자만 입력 가능합니다." );

/*
 * koreanword
 * 한글
 */
$.validator.addMethod( "koreanword", function( value, element ) {
	return this.optional( element ) || /(^[ㄱ-ㅎ가-힣]+$)/.test( value );
}, "한글만 입력 가능합니다." );

/*
 * password
 * 영어, 숫자, 특수문자 중 2가지 경우가 포함
 *
 */
$.validator.addMethod( "password", function( value, element ) {
	var sum = /[0-9]/.test(value) + /[a-zA-Z]/i.test(value) + /[\{\}\[\]\/?.,;:|\)*~`!^\-_+<>@\#$%&\\\=\(\'\"]/gi.test(value);
	return this.optional(element) || sum == 3;
}, "영문, 숫자, 특수문자 중 2가지가 포함되어야 합니다." );
	
/*
 * zipcode
 * 숫자 5~6자리
 */
$.validator.addMethod( "zipcode", function( value, element ) {
	return this.optional( element ) || /^\d{5,6}$/.test( value );
}, "우편번호 형식이 올바르지 않습니다." );

/*
 * phoneNumber
 *
 * 일반전화번호
 */
$.validator.addMethod( "phoneNumber", function( value, element ) {
	var pattern1 = /^(02|0[3-6]\d|070|080|007)\-?\d{3,4}\-?\d{4,5}$/;
	return this.optional(element) || pattern1.test(value);
}, "일반전화번호 형식이 올바르지 않습니다." );

/*
 * faxNumber
 * fax번호
 */
$.validator.addMethod( "faxNumber", function( value, element ) {
	var pattern1 = /^(070|0502|0503|0504|0505|0506|0507)\-?\d{3,4}\-?\d{4}$/;
	return this.optional(element) || pattern1.test(value);
}, "FAX번호 형식이 올바르지 않습니다." );

/*
 * dashNumber
 * 숫자, -
 */
$.validator.addMethod( "dashNumber", function( value, element ) {
	return this.optional( element ) || /(^[0-9\-]+$)/.test( value );
}, "숫자,-만 입력 가능합니다." );

/*
 * andUnder
 * 값 비교
 */
$.validator.addMethod( "andUnder", function( value,element,param ) {
	return this.optional( element ) || (value > param ? true : false);
}, "입력값이 올바르지 않습니다." );
