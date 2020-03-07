package fii.practic.yonder.demo.controller;

import fii.practic.yonder.demo.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    @RequestMapping(value = "/test")
    public String getTestMessage(){
        return testService.getTestMessage();
    }

    @GetMapping
    public String getNames(){
        return testService.getAll();
    }

    @PostMapping
    public void save(@RequestBody String name) {
            testService.save(name);
        }

        @PutMapping(value = "/{id}")
    public void update(@PathVariable Integer id, @RequestBody String newValue){
        testService.update(id, newValue);
        }

        @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id){
        testService.delete(id);
        }

}
