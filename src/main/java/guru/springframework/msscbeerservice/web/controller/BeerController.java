package guru.springframework.msscbeerservice.web.controller;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    //private final BeerService beerService;


    //private final BeerService beerService;
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){

        System.out.println("saveNewBeer: " + beerDto.toString());
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
