package com.example;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class DataController {

    @GetMapping("/data")
    public String getData() throws IOException {
        Resource resource = new ClassPathResource("data.json");
        return Files.lines(Paths.get(resource.getURI()))
                .collect(Collectors.joining("\n"));
    }
}
