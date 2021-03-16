package com.ivoronline.springboot_log_groups.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  Logger log = LoggerFactory.getLogger(MyController.class);

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    log.error("Controller ERROR");
    log.warn ("Controller WARN" );
    log.info ("Controller INFO" );
    log.debug("Controller DEBUG");
    log.trace("Controller TRACE");
    return "Hello from Controller";
  }

}
