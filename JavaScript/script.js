$(document).ready(function() {
    $("#apiButton").click(function() {
        $.get("http://127.0.0.1:8080/hotels", function(data) {
            $("#hotels").text(JSON.stringify(data));
        });
        $.get("http://127.0.0.1:8080/flights", function(data) {
            $("#flights").text(JSON.stringify(data));
        });
    });
});