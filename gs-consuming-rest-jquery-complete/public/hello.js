$(document).ready(function() {
    $.ajax({
        url: "http://127.0.0.1:8081/greeting"
    }).then(function(data) {
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.content);
    }, function(data) {
       $('.greeting-id').append(data);
       $('.greeting-content').append(" error1");
    });
});
