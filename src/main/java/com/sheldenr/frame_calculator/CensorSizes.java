package com.sheldenr.frame_calculator;

import java.util.ArrayList;
import java.util.List;

public class CensorSizes {

    public ArrayList<String> frameSizeNames = new ArrayList<>(
        List.of("Medium Format", "Full Frame", "APS-C", "MICRO 4/3")
    );

    public ArrayList<Double> focalLengths = new ArrayList<>(
        List.of(53d, 35d, 23.6d, 17d);
    )

    public ArrayList<Doub17le> cropFactors = new ArrayList<>(
        List.of(0.64d, 1d, 1.52d, 2d);
    )

    public Integer size = frameSizeNames.size();
}
