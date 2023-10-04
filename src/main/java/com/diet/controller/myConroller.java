package com.diet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import com.diet.exerciseRepository;
import com.diet.jpaRepository;
import com.diet.entities.exercise;

@Controller
public class myConroller {
	@Autowired
	private jpaRepository jpaRepo;
	
	@Autowired
	private exerciseRepository exerciseRepo;
	
	
	
	
	@RequestMapping("/diet")
	public String diet(Model model) {
		model.addAttribute("diets", jpaRepo.findAll());
		
		return "diet";
	}
	
	
	@RequestMapping("/model/{id}")
	public String displayImage(@PathVariable int id, Model model) {
	    
	    System.out.println(id);
	    
	    com.diet.entities.diet d = jpaRepo.findById(id);
	    
	    model.addAttribute("title", d.getTitle());
	    model.addAttribute("instruction",java.util.Arrays.asList(StringUtils.split(d.getInstruction(), ".")) );
	    model.addAttribute("ingredients", d.getIngredients());
	    


	    return "Model";
	}
	
	@RequestMapping("/display/{type}")
	public String display_video(@PathVariable String type , Model model) {
		
		System.out.println(type);
		model.addAttribute("type", type);
		
		return "display";
	}
	
	@RequestMapping("/exercise")
	public String exercise(Model model) {
		
		List<exercise> e  = exerciseRepo.findAll();
		model.addAttribute("title", e);
		
		
		
		return "exercise";
	}
	
	@RequestMapping("/healthCalculator")
	public String fieldForm() {
		return "fieldForm";
	}

	
	@RequestMapping("/displayScore")
	public String displayScore(@RequestParam("member_age") int age,
			@RequestParam("member_weight") int weight,
			@RequestParam("member_height_in") int height,
			@RequestParam("member_waist_in") int waist,
			@RequestParam("member_score_sleep") int sleep,
			@RequestParam("member_score_exercise") int exercise,
			@RequestParam("member_score_alcohol") int alcohol,
			@RequestParam("member_score_smoking") int smocking,
			@RequestParam("member_score_diet") int diet,
			@RequestParam("member_score_nutrition") int nutrition,
			@RequestParam("member_score_emotional") int emotional,
			Model model ) {
		
		// Define weights for each factor (you can adjust these as needed)
        double weightWeight = 0.1;
        double heightWeight = 0.05;
        double ageWeight = 0.1;
        double waistSizeWeight = 0.1;
        double sleepingHoursWeight = 0.05;
        double exerciseHoursWeight = 0.1;
        double alcoholUsageWeight = 0.05;
        double smokingHistoryWeight = 0.05;
        double dietQualityWeight = 0.1;
        double nutritionQualityWeight = 0.1;
        double emotionalWellBeingWeight = 0.1;
        
     // Calculate the health score using the weighted sum of factors
        double healthScore = 
            (weight * weightWeight )+
            height * heightWeight +
            age * ageWeight +
            waist * waistSizeWeight +
            sleep  +
            exercise  +
            alcohol  +
            smocking  +
            diet  +
            nutrition  +
            emotional ;
		
		System.out.println(healthScore);
		model.addAttribute("title", "HealthScore");
		model.addAttribute("healthScore", healthScore);
		return "diplayHealthScore";
	}

}
