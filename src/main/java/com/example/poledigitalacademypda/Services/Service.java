package com.example.poledigitalacademypda.Services;

import com.example.poledigitalacademypda.Repository.Repository;
import lombok.Data;

@Data
public abstract class Service {
    private Repository repository;
}
