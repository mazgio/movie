package dev.mazzuca.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload){
    return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }

   /* @DeleteMapping("/api/v1/reviews/delete/{id}")
    public ResponseEntity<Review> deleteReview(@PathVariable ObjectId id){
        return new ResponseEntity<Review>(reviewService.deleteReview(id), HttpStatus.CREATED);
    }*/
}
