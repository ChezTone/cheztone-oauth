/**
 * Created by 20004507 on 15/09/2015.
 */
$(function () {
    var token = $("meta[name='_csrf']").attr("content");
    var header = $("meta[name='_csrf_header']").attr("content");
    $(document).ajaxSend(function(e, xhr, options) {
        xhr.setRequestHeader(header, token);
    });
});

function getToken(csrf) {
    $.ajax({
        url : 'oauth/authorize?grant_type=client_credentials&client_id=my-client-with-secret&client_secret=secret&response_type=token',
        method : 'post',
        headers : {
            'Authorization' : 'Basic dG9uZTp0b25l'
        }
    });
}
