package com.example.droolsdemoprj.controller;

import com.example.droolsdemoprj.entity.ElectricBill;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElectricBillController {

    @Autowired
    private KieContainer kieContainer;

    @RequestMapping(value = "/calculate", method = RequestMethod.GET, produces = "application/json")
    public ElectricBill calculateBill(@RequestBody ElectricBill electricBill) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(electricBill);
        kieSession.fireAllRules();
        kieSession.dispose();
        return electricBill;
    }
}
