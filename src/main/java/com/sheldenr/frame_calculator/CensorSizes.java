package com.sheldenr.frame_calculator;

import java.util.ArrayList;
import java.util.List;

public class CensorSizes {

    public ArrayList<String> frameSizeList = new ArrayList<>(
        List.of("Medium Format", "Full Frame", "APS-C", "MICRO 4/3")
    );

    public Integer size = frameSizeList.size();
}
