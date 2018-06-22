package com.taotao.controller;

import javax.print.attribute.standard.PrinterLocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

@Controller
public class ItemController {
@Autowired
private ItemService itemService;
private final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
@RequestMapping(value = "/item/{itemId}", produces = "application/json;charset=UTF-8")
@ResponseBody
public String getItemById(@PathVariable long itemId){
	TbItem tbItem = itemService.getItemById(itemId);
	System.out.println(tbItem.getTitle());
	System.out.println("testOnefiles");
	return gson.toJson(tbItem);
}
}
