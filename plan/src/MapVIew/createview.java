package MapVIew;

public class createview {
	
	
	public static void main(String args[]){
		
		String str="<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
    <style type="text/css">
      html { height: 100% }
      body { height: 100%; margin: 0; padding: 0 }
      #map-canvas { height: 100% }
    </style>
    <script type="text/javascript"
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVpZda5rGOAPlnvtrErYs2dr6EPhHgmko">
    </script>
    <script type="text/javascript">
      







function initialize() {

  var mapOptions = {
    zoom: 10,
    center: new google.maps.LatLng(17.37,78.47),
    mapTypeId: google.maps.MapTypeId.TERRAIN
  };

var map = new google.maps.Map(document.getElementById('map-canvas'),
      mapOptions);


 var myLatlng1 = new google.maps.LatLng(17.3730308,78.476601);


  

  var flightPlanCoordinates1 = [   
new google.maps.LatLng(17.3730308,78.476601),
    new google.maps.LatLng(17.3768188,78.4822982),
 
  ];


  var flightPath1 = new google.maps.Polyline({  
  path:flightPlanCoordinates1,
    geodesic: true,
    strokeColor: '#FF0000',
    strokeOpacity: 1.0,
    strokeWeight: 69
  });



  flightPath1.setMap(map);

 var marker1 = new google.maps.Marker({
      position: myLatlng1,
      map: map,
      title: 'Afzalgunj Bus Stop'
  });

}

     google.maps.event.addDomListener(window, 'load', initialize);
    

</script>
  </head>
  <body>
    <div id="map-canvas"/>
  </body>
</html>";
		


FileWriter write = new FileWriter("C://Users//Abhinavpatluri//Desktop//viewer.html");



	}

}
