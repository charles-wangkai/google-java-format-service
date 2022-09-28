package com.example.googlejavaformatservice;

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class GoogleJavaFormatServiceApplication {
  Formatter formatter = new Formatter();

  public static void main(String[] args) {
    SpringApplication.run(GoogleJavaFormatServiceApplication.class, args);
  }

  @PostMapping
  public Object format(@RequestBody String code) throws FormatterException {
    return formatter.formatSourceAndFixImports(code);
  }
}
