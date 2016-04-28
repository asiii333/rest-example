package rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Asia on 2016-04-26.
 */
@Api(basePath = "/greeting", value = "Greeting", description = "Example opertaion", produces = "application/json")
@RequestMapping("/greeting")
@RestController
public class FirstControler {


    @RequestMapping(method = GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Random r = new Random();
        return new Greeting(r.nextInt(1000), name);
    }

    @RequestMapping(method = POST)
    public Greeting greeting2(@RequestParam(value="name", defaultValue="World") String name) {
        Random r = new Random();
        return new Greeting(r.nextInt(1000), name);
    }

    @RequestMapping(method = POST, path="/from")
    public SpecialGreeting specialGreting(@RequestParam(value="name") String name) {
        Random r = new Random();
        return new SpecialGreeting(r.nextInt(1000), name, "all the best");
    }
}
