package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.controllers.HelloWorldController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// Indica que solo se cargará el controlador HelloWorldController
@WebMvcTest(HelloWorldController.class)
public class HelloWorldControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testIndexEndpoint() throws Exception {
        mockMvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string(org.hamcrest.Matchers.containsString("http://localhost:8080/hello")));
    }

    @Test
    public void testHelloEndpoint() throws Exception {
        mockMvc.perform(get("/hello"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello, World!"));
    }

    @Test
    public void testHello2Endpoint() throws Exception {
        mockMvc.perform(get("/hello2"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello, World2!"));
    }

    @Test
    public void testHello3Endpoint() throws Exception {
        mockMvc.perform(get("/hello3"))
            .andExpect(status().isOk())
            .andExpect(content().string("Hello, World3!"));
    }
}
