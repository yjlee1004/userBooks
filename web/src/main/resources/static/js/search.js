
$(function() {
    // Search.init();
    $("#inputSearch").autocomplete({
        source : function( request, response ) {
            var searchWord = $("#inputSearch").val();
            $.ajax({
                type: 'post',
                url: "/history",
                dataType: "json",

                data: { "seachWord" : searchWord },
                success: function(data) {

                    response(
                        $.map(data, function(item) {
                            return {
                                label: item.word,
                                value: item.word
                            }
                        })

                    );
                }

            });
        },

        minLength: 2,
        select: function( event, ui ) {
            $("#autocomplete").val(ui.item.value)
        }
    })
});


var Search = (function () {

});

function go(page){
    $("#page").val(page);
    Search.submit();
}
