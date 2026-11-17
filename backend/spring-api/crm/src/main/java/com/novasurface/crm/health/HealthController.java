package com.novasurface.crm.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

  @GetMapping("/")
  public String home() {
    return "NovaSurface CRM API Running";
  }

}