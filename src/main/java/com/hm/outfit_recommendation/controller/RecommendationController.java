package com.hm.outfit_recommendation.controller;

import com.hm.outfit_recommendation.model.CategoryRecommendation;
import com.hm.outfit_recommendation.model.Recommendation;
import com.hm.outfit_recommendation.model.User;
import com.hm.outfit_recommendation.model.UserInput;
import com.hm.outfit_recommendation.service.RecommendationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {

    private final RecommendationService recommendationService;

    public RecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @PostMapping
    @Operation(summary = "Clothes recommendation")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Recommendations returned",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Recommendation.class))}),})
    public ResponseEntity<Recommendation> handleRecommendationPost(@RequestBody final UserInput userInput) {
        userInput.setUser(new User());
        userInput.setDate(new Date());
        List<CategoryRecommendation> categoryRecommendations = recommendationService.createRecommendations(userInput);

        Recommendation recommendation = new Recommendation();
        recommendation.setUserInput(userInput);
        recommendation.setRecommendations(categoryRecommendations);

        return ResponseEntity.ok(recommendation);
    }
}
