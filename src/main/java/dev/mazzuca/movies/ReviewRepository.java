package dev.mazzuca.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {





    Review findById(String imdbId);

    Review deleteById(Review review);

    Review deleteById();
}
