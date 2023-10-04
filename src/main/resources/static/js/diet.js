
// isotope filter
var $flex = $(".flex").isotope({
    itemSelector : '.card',
    layoutMode : 'fitRows'
});

// filter items on button click
$(".button-group").on("click", "button", function(){
    var filterValue = $(this).attr('data-filter');
    $flex.isotope({ filter: filterValue});
})
