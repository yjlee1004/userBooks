<#macro doPaginationJs p funcName>
	<#assign totalPages=p.totalPage currentPage=p.currentPage startPage=p.viewStartPage endPage=p.viewLastPage >

	<#if (totalPages > 0)>
		<div id="pagination" class="dataTables_paginate paging_simple_numbers">
			<#-- Previous page -->
			<#if (currentPage > 0)>
				<a class="paginate_button previous disabled" href="javascript:${funcName}(${currentPage-1})">이전으로</a>
			</#if>
		    
			<#-- Page number -->
			<#list startPage .. endPage as pageNumber>
				<#if (pageNumber == currentPage)>
					<span class="paginate_button active">${pageNumber+1}</span>
				<#elseif (pageNumber < totalPages)>
					<a href="javascript:${funcName}(${pageNumber})"><span>${pageNumber+1}</span></a>
				</#if>
				
			</#list>
		    
			<#-- Next page -->  
			<#if (currentPage < totalPages-1)>
				<a class="paginate_button next" href="javascript:${funcName}(${currentPage+1})">다음으로</a>
			</#if>  
		</div>
	<#else>
 		1
 	</#if>
</#macro>