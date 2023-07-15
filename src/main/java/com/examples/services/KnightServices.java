package com.examples.services;

import com.examples.knights.Knight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KnightServices {

    @Autowired
    private Knight knight;


    public void killKnight(){
        knight.embarkOnQuest();
    }
}
