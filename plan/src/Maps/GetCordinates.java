package Maps;

public class GetCordinates {

	public static void main(String args[]){
		
		String place="Musheerabad,Hyderabad";
	
        try {
            Geocoder selected_place_geocoder = new Geocoder(context);
            List<Address> address;

            address = selected_place_geocoder.getFromLocationName(place, 5);

            if (address == null) {
                d.dismiss();
            } else {
                Address location = address.get(0);
                           Latitude lat= location.getLatitude();
            Longitude lng = location.getLongitude();

            }

        } catch (Exception e) {
            e.printStackTrace();
fetchLatLongFromService fetch_latlng_from_service_abc = new fetchLatLongFromService(
                    place.replaceAll("\\s+", ""));
            fetch_latlng_from_service_abc.execute();

        }

    }


//Sometimes happens that device gives location = null

public class fetchLatLongFromService extends
            AsyncTask<Void, Void, StringBuilder> {
        String place;


        public fetchLatLongFromService(String place) {
            super();
            this.place = place;

        }

        @Override
        protected void onCancelled() {
            // TODO Auto-generated method stub
            super.onCancelled();
            this.cancel(true);
        }

        @Override
        protected StringBuilder doInBackground(Void... params) {
            // TODO Auto-generated method stub
            try {
                HttpURLConnection conn = null;
                StringBuilder jsonResults = new StringBuilder();
                String googleMapUrl = "http://maps.googleapis.com/maps/api/geocode/json?address="
                        + this.place + "&sensor=false";

                URL url = new URL(googleMapUrl);
                conn = (HttpURLConnection) url.openConnection();
                InputStreamReader in = new InputStreamReader(
                        conn.getInputStream());
                int read;
                char[] buff = new char[1024];
                while ((read = in.read(buff)) != -1) {
                    jsonResults.append(buff, 0, read);
                }
                String a = "";
                return jsonResults;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;

        }

    @Override
    protected void onPostExecute(StringBuilder result) {
        // TODO Auto-generated method stub
        super.onPostExecute(result);
        try {
            JSONObject jsonObj = new JSONObject(result.toString());
            JSONArray resultJsonArray = jsonObj.getJSONArray("results");

            // Extract the Place descriptions from the results
            // resultList = new ArrayList<String>(resultJsonArray.length());

            JSONObject before_geometry_jsonObj = resultJsonArray
                    .getJSONObject(0);

            JSONObject geometry_jsonObj = before_geometry_jsonObj
                    .getJSONObject("geometry");

            JSONObject location_jsonObj = geometry_jsonObj
                    .getJSONObject("location");

            String lat_helper = location_jsonObj.getString("lat");
            double lat = Double.valueOf(lat_helper);


            String lng_helper = location_jsonObj.getString("lng");
            double lng = Double.valueOf(lng_helper);


            LatLng point = new LatLng(lat, lng);


        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
}
