$(document).ready(function() {
  var $horizontal = $('#hero-first');

  $(window).scroll(function() {
    var s = $(this).scrollTop(),
      d = $(document).height(),
      c = $(this).height();

    scrollPercent = (s / (d - c));

    var position = (scrollPercent * ($(document).width() - $horizontal.width()));

    $horizontal.css({
      'left': position
    });
  });
});