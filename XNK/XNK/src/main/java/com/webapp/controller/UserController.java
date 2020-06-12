package com.webapp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webapp.entity.Good;
import com.webapp.model.GoodModel;
import com.webapp.model.SupplierModel;
import com.webapp.service.GoodService;
import com.webapp.service.SupplierService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	GoodService goodsService;
	
	@Autowired
	SupplierService supplierService;
	
	@GetMapping("")
	public String index() {
		return "userIndex";
	}

	@GetMapping("/add-good")
	public String addGood(Model model) {
		model.addAttribute("good", new GoodModel());
		return "userAddGood";
	}

	@PostMapping("/add-good")
	public String postAdd(Model model, @Validated @ModelAttribute("good") GoodModel goodsModel, BindingResult errors) {
		if(errors.hasErrors()) {
			model.addAttribute("good", goodsModel);
			return "userAddGood"; 
		}
		if(goodsService.insert(goodsModel)) {
			model.addAttribute("msgSuccess","Thêm mới thành công!");
			return "redirect:/user/add-good";
		}
		else {
			model.addAttribute("msgError", "Thêm mới thất bại!");
		}
		model.addAttribute("good", goodsModel);
		return "userAddGood";
	}
	@GetMapping("/add-supplier")
	public String getAddSuppiler(Model model) {
		model.addAttribute("supplier", new SupplierModel());
		return "userAddSupplier";
	}
	@PostMapping("/add-supplier")
	public String postAddSupplier(Model model, @Validated @ModelAttribute("supplier") SupplierModel supplierModel, BindingResult errors){
		if(errors.hasErrors()) {
			model.addAttribute("supplier", supplierModel);
			return "userAddSupplier"; 
		}
		if(supplierService.insert(supplierModel)) {
			model.addAttribute("msgSuccess","Thêm mới thành công!");
			return "redirect:/user/add-supplier";
		}
		else {
			model.addAttribute("msgError", "Thêm mới thất bại!");
		}
		model.addAttribute("supplier", supplierModel);
		return "userAddSupplier";
	}

	@GetMapping("/good-info")
	public String product(Model model) {
		List<Good> list = goodsService.findAll();
		model.addAttribute("goods", list);
		return "userGoodInfo";
	}
}
