$("#frame_refresh").click(function (event) {
    window.location.reload();
});

$("#frame_back").click(function (event) {
    window.history.go(-1);
});

$("#frame_bigger").click(function (event) {
    $("body").addClass('sidebar-collapse');
});

$("#frame_full").click(function (event) {
    fullScreen();
});

function fullScreen() {
    var el = document.documentElement;
    var rfs = el.requestFullScreen || el.webkitRequestFullScreen || el.mozRequestFullScreen || el.msRequestFullScreen;

    if (typeof rfs != "undefined" && rfs) {
        rfs.call(el);
    } else if (typeof window.ActiveXObject != "undefined") {
// for Internet Explorer
        var wscript = new ActiveXObject("WScript.Shell");
        if (wscript != null) {
            wscript.SendKeys("{F11}");
        }
    }

}