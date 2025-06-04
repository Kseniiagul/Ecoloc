package com.example.projectsamsung;

import android.util.Pair;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Markers {

    List<String> types = Arrays.asList("ПЭТ", "ПВД", "ПВХ", "ПНД", "ПП", "макулатура", "металл", "батарейки", "аккумуляторы", "стекло", "жидкости");
    Map<String, List<Pair<Double, Double>>> coords = new HashMap<>();
    Markers() {
        for (String type : types) {
            System.out.println(type);
            List<Pair<Double, Double>> curr = new ArrayList<>();
            switch (type) {
                case "ПЭТ":
                    curr.add(new Pair<>(48.822193, 44.604528));
                    curr.add(new Pair<>(48.700609, 44.489802));
                    curr.add(new Pair<>(48.712746, 44.513779));
                    curr.add(new Pair<>(48.712486, 44.513613));
                    curr.add(new Pair<>(48.523512, 44.576710));
                    curr.add(new Pair<>(48.518921, 44.539253));
                    curr.add(new Pair<>(48.606532, 44.420034));
                    curr.add(new Pair<>(48.659806, 44.415869));
                    curr.add(new Pair<>(48.661746, 44.417415));
                    curr.add(new Pair<>(48.662661, 44.415341));
                    curr.add(new Pair<>(48.664201, 44.457650));
                    curr.add(new Pair<>(48.676225, 44.477846));
                    curr.add(new Pair<>(48.680162, 44.463649));
                    curr.add(new Pair<>(48.688509, 44.488940));
                    curr.add(new Pair<>(48.690783, 44.484572));
                    curr.add(new Pair<>(48.754994, 44.490746));
                    curr.add(new Pair<>(48.757872, 44.501836));
                    curr.add(new Pair<>(48.724383, 44.516517));
                    break;
                case "ПВД":
                    curr.add(new Pair<>(48.602641, 44.413394));
                    curr.add(new Pair<>(48.606530, 44.420016));
                    curr.add(new Pair<>(48.724383, 44.516517));
                    break;
                case "ПВХ":
                case "ПНД":
                    curr.add(new Pair<>(48.724383, 44.516517));
                    break;
                case "ПП":
                    curr.add(new Pair<>(48.724383, 44.516517));
                    curr.add(new Pair<>(48.606530, 44.420016));
                    break;
                case "макулатура":
                    curr.add(new Pair<>(48.690808, 44.484568));
                    curr.add(new Pair<>(48.766550, 44.509065));
                    curr.add(new Pair<>(48.503067, 44.584586));
                    curr.add(new Pair<>(48.782060, 44.476325));
                    curr.add(new Pair<>(48.775629, 44.475856));
                    curr.add(new Pair<>(48.602639, 44.413395));
                    curr.add(new Pair<>(48.606530, 44.420016));
                    curr.add(new Pair<>(48.543211, 44.469607));
                    curr.add(new Pair<>(48.523532, 44.576718));
                    curr.add(new Pair<>(48.602641, 44.413394));
                    break;
                case "металл":
                    curr.add(new Pair<>(48.497857, 44.590416));
                    curr.add(new Pair<>(48.570792, 44.443282));
                    curr.add(new Pair<>(48.499029, 44.554049));
                    curr.add(new Pair<>(48.503067, 44.584586));
                    curr.add(new Pair<>(48.497063, 44.592632));
                    curr.add(new Pair<>(48.492592, 44.587301));
                    curr.add(new Pair<>(48.777920, 44.503008));
                    curr.add(new Pair<>(48.760451, 44.474592));
                    curr.add(new Pair<>(48.774018, 44.386380));
                    curr.add(new Pair<>(48.680166, 44.463650));
                    curr.add(new Pair<>(48.830783, 44.643184));
                    curr.add(new Pair<>(48.835712, 44.645310));
                    curr.add(new Pair<>(48.843613, 44.640986));
                    curr.add(new Pair<>(48.821456, 44.525170));
                    curr.add(new Pair<>(48.592989, 44.431403));
                    curr.add(new Pair<>(48.543211, 44.469607));
                    curr.add(new Pair<>(48.526505, 44.573943));
                    curr.add(new Pair<>(48.472533, 44.629126));
                    break;
                case "батарейки":
                    curr.add(new Pair<>(48.763336, 44.508970));
                    curr.add(new Pair<>(48.697105, 44.502271));
                    curr.add(new Pair<>(48.753161, 44.477135));
                    curr.add(new Pair<>(48.753899, 44.478552));
                    curr.add(new Pair<>(48.754096, 44.476992));
                    curr.add(new Pair<>(48.745310, 44.502728));
                    curr.add(new Pair<>(48.745098, 44.518297));
                    curr.add(new Pair<>(48.729552, 44.504305));
                    curr.add(new Pair<>(48.639498, 44.432859));
                    curr.add(new Pair<>(48.637243, 44.436054));
                    curr.add(new Pair<>(48.635692, 44.435619));
                    curr.add(new Pair<>(48.516353, 44.534344));
                    curr.add(new Pair<>(48.512346, 44.542547));
                    curr.add(new Pair<>(48.819880, 44.634797));
                    curr.add(new Pair<>(48.772492, 44.465428));
                    curr.add(new Pair<>(48.768672, 44.474439));
                    curr.add(new Pair<>(48.671887, 44.469140));
                    break;
                case "аккумуляторы":
                    curr.add(new Pair<>(48.570792, 44.443282));
                    curr.add(new Pair<>(48.499029, 44.554049));
                    curr.add(new Pair<>(48.497063, 44.592632));
                    curr.add(new Pair<>(48.819880, 44.634797));
                    curr.add(new Pair<>(48.592989, 44.431403));
                    curr.add(new Pair<>(48.543211, 44.469607));
                    curr.add(new Pair<>(48.602637, 44.413388));
                case "стекло":
                    curr.add(new Pair<>(48.729556, 44.504305));
                    curr.add(new Pair<>(48.602640, 44.413386));
                    curr.add(new Pair<>(48.590364, 44.432449));
                    curr.add(new Pair<>(48.690808, 44.484568));
                    curr.add(new Pair<>(48.700611, 44.489791));
                    curr.add(new Pair<>(48.724400, 44.515311));
                    curr.add(new Pair<>(48.725475, 44.524623));
                    curr.add(new Pair<>(48.766550, 44.509065));
                    curr.add(new Pair<>(48.680161, 44.463647));
                    curr.add(new Pair<>(48.606530, 44.420016));
                    break;
                case "жидкости":
                    curr.add(new Pair<>(48.753321, 44.452322));
                    curr.add(new Pair<>(48.827617, 44.642421));
                    curr.add(new Pair<>(48.645020, 44.444823));
            }
            coords.put(type, curr);
        }
    }
    void showMarkers(String type, GoogleMap mMap) {
        if (type == "пластик") {
            for (int i = 0; i < 5; ++i) {
                for (Pair<Double, Double> mark : coords.get(types.get(i))) {
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(mark.first, mark.second))
                            .title(types.get(i)));
                }
            }
        } else {
            for (Pair<Double, Double> mark : coords.get(type)) {
                mMap.addMarker(new MarkerOptions()
                        .position(new LatLng(mark.first, mark.second))
                        .title(type));
            }
        }
    }
}
