<!-- %@page import="flatinfo.rest.mvc.*"%-->

<html>
<head>
<meta name="viewport" content="initial-scale=1.0, user-scalable=no"/>
<meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
<title>Google Maps JavaScript API v3 Example: Geocoding Simple</title>
<script type="text/javascript" src="http://maps.google.com/maps/api/js?key=AIzaSyAjLRARztZSP1qDqGklKcMXD27qCkb9-60&sensor=false"></script>
<script type="text/javascript">
  var geocoder;
  var map;
  var address = "${address}";
  function initialize() {
    geocoder = new google.maps.Geocoder();
    var myOptions = {
      zoom: 20,
      //center: latlng,
    mapTypeControl: true,
    mapTypeControlOptions: {style: google.maps.MapTypeControlStyle.DROPDOWN_MENU},
    navigationControl: true,
      mapTypeId: google.maps.MapTypeId.ROADMAP
    };
    map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);
    if (geocoder) {
      geocoder.geocode( { 'address': address}, function(results, status) {
        if (status == google.maps.GeocoderStatus.OK) {
          if (status != google.maps.GeocoderStatus.ZERO_RESULTS) {
          map.setCenter(results[0].geometry.location);

            var infowindow = new google.maps.InfoWindow(
                { content: '<b>'+address+'</b>',
                  size: new google.maps.Size(150,50)
                });

            var marker = new google.maps.Marker({
                position: results[0].geometry.location,
                map: map, 
                title:address
            }); 
            google.maps.event.addListener(marker, 'click', function() {
                infowindow.open(map,marker);
            });

          } else {
            alert("No results found");
          }
        } else {
          alert("Geocode was not successful for the following reason: " + status);
        }
      });
    }
  }
</script>
</head>
<body style="margin:0px; padding:0px;" onload="initialize()">
 <div id="map_canvas" style="width:50%; height:50%">
</body>
</html>