package com.reggie.controller;

import com.reggie.result.R;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

  @GetMapping("/hostname")
  public R<String> hostname() {
    try {
      String hostName = InetAddress.getLocalHost().getHostName();
      return R.success(hostName);
    } catch (UnknownHostException e) {
      return R.error(e.getMessage());
    }
  }
}
