package test.controller;


import org.springframework.web.bind.annotation.*;
import test.model.UserRequest;
import test.model.UserResponse;

@RestController
public class TestController {

    @RequestMapping("/")
    public String home() {
        return "Spring boot is working!";
    }

    @PostMapping(path = "/userdetails")
    public UserResponse getUserDetails(@RequestBody UserRequest request ) {
        if(request != null) {
            UserResponse response = new UserResponse();
            response.setUser_id(request.getUser_name());
//            response.setPassword("password");
            response.setUsername(request.getUser_name());
            response.setStatus_code(123);
            response.setStatus_message("sample message");
            return response;
        }
        return null;
    }

}