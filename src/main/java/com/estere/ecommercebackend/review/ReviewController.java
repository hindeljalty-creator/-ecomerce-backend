package com.estere.ecommercebackend.review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin(origins = "http://localhost:3000")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @GetMapping("/product/{productId}")
    public List<ProductReview> getByProduct(@PathVariable Long productId) {
        return reviewRepository.findByProductId(productId);
    }

    @PostMapping
    public ProductReview add(@RequestBody ProductReview review) {
        return reviewRepository.save(review);
    }
}
