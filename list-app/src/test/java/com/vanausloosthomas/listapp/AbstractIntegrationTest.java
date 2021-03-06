package com.vanausloosthomas.listapp;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ListAppApplication.class, webEnvironment = RANDOM_PORT)
public abstract class AbstractIntegrationTest {

}
