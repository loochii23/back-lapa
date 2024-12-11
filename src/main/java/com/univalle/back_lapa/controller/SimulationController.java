package com.univalle.back_lapa.controller;

import com.univalle.back_lapa.dto.SimulationStartDto;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simualtion")
public class SimulationController {
    @PostMapping(path = "/start")
    public ResponseEntity<JSONObject> save(SimulationStartDto simulationStartDto) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg", "ok");
        System.out.println(simulationStartDto);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(jsonObject);
    }
}
