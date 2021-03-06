package com.coshmex.test.cucumber.stepdefs;

import com.coshmex.test.DemoApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = DemoApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
