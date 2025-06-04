package com.example.projectsamsung;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.PlacesClient;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private SearchView searchInput;

    private PlacesClient placesClient;
    private Markers markers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
        markers = new Markers();

        if (!Places.isInitialized()) {
            Places.initialize(getApplicationContext(), "@string/google_maps_key");
        }
        placesClient = Places.createClient(this);

        searchInput = findViewById(R.id.input);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_fragm);
        mapFragment.getMapAsync(this);

        searchInput.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                mMap.clear();
                switch (s.toLowerCase()) {
                    case "пэт":
                        markers.showMarkers("ПЭТ", mMap);
                        break;
                    case "пвд":
                        markers.showMarkers("ПВД", mMap);
                        break;
                    case "пвх":
                        markers.showMarkers("ПВХ", mMap);
                        break;
                    case "пнд":
                        markers.showMarkers("ПНД", mMap);
                        break;
                    case "пп":
                        markers.showMarkers("ПП", mMap);
                        break;
                    case "пс":
                        markers.showMarkers("ПС", mMap);
                        break;
                    case "картон":
                    case "бумага":
                    case "макулатура":
                        markers.showMarkers("макулатура", mMap);
                        break;
                    case "металл":
                        markers.showMarkers("металл", mMap);
                        break;
                    case "батарейки":
                        markers.showMarkers("батарейки", mMap);
                        break;
                    case "аккумуляторы":
                        markers.showMarkers("аккумуляторы", mMap);
                        break;
                    case "стекло":
                    case "стеклотара":
                        markers.showMarkers("стекло", mMap);
                        break;
                    case "жидкости":
                        markers.showMarkers("жидкости", mMap);
                        break;
                    case "пластик":
                        markers.showMarkers("пластик", mMap);
                        break;
                    default:
                        String location = searchInput.getQuery().toString();
                        List<Address> addressList = null;
                        if (location != null) {
                            Geocoder geocoder = new Geocoder(MapsActivity.this);
                            try {
                                addressList = geocoder.getFromLocationName(location, 1);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            Address address = addressList.get(0);
                            LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
                            mMap.addMarker(new MarkerOptions().position(latLng).title(location));
                            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 10));
                        }
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        LatLng defaultLocation = new LatLng(48.7, 44.5);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(defaultLocation, 10));
    }
}