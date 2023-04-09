package com.planifcarbon.backend.dtos;

import com.planifcarbon.backend.config.ExcludeFromJacocoGeneratedReport;

import java.util.Collections;
import java.util.List;

@ExcludeFromJacocoGeneratedReport
public class MetroScheduleDTO {
    private final String line;
    private final String station;
    private final List<Integer> schedules;

    public MetroScheduleDTO(String metroName, String terminus, List<Integer> schedules) {
        this.line = metroName;
        this.station = terminus;
        this.schedules = schedules;
        Collections.sort(this.schedules);
    }

    public List<Integer> getSchedules() {
        return schedules;
    }

    public String getLine() {
        return line;
    }

    public String getTerminus() {
        return station;
    }
}
