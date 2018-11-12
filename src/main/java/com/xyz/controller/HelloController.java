package com.xyz.controller;

import com.xyz.log.ArchivesLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("hello")
  @ArchivesLog(operationType="查询操作:",operationName="查询文件")
  public String sayHello(@RequestParam(value = "name") String name) {
    return "你好！" + name;
  }
}
