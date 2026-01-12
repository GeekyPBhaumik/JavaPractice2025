package com.corejavapractice.JavaPractice.exceptionhandling.centralizedexceptionhandling;

import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController{
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable String id) {
        UserDTO user1 = null; // Simulating a database lookup that failed
        if(ObjectUtils.isEmpty(user1)) {
            // Because this is a @RestController,
            // Spring will intercept this throw and send it to your @RestControllerAdvice
            throw new ResourceNotFoundException("User Not Found with ID: " + id);
        }
        return ResponseEntity.ok(user1);
    }
//expected output:
//{
//   "status": 404,
//   "message": "User Not Found",
//   "timestamp": 1705052400000
//}
}
