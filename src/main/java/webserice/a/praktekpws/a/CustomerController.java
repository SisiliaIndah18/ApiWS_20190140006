/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webserice.a.praktekpws.a;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@CrossOrigin
@RestController
@RequestMapping("/database")
public class CustomerController {
    @Autowired
    private ErialbRepository erialb;
    
    @GetMapping("/erialb")
    public List<Erialb> getAllErialb(){
        return erialb.findAll();
    }
    
    @GetMapping ("/erialb/{idcust}")
    public Erialb getErialbById(@PathVariable String idcust){
        return erialb.findById(idcust).get();
    }
    
    @PostMapping ("/erialb")
    public Erialb saveErialbDetails(@RequestBody Erialb e){
        return erialb.save(e);
    }
    
    @PutMapping("/erialb")
    public Erialb updateErialb(@RequestBody Erialb e){
        return erialb.save(e);
    }
    
    
    @DeleteMapping("/erialb/{idcust}")
    public ResponseEntity<HttpStatus> deleteErialbById(@PathVariable String idcust){
        erialb.deleteById(idcust);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

