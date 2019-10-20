package cn.microservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.microservice.pojo.item;
import cn.microservice.service.itemService;

@Controller
@ResponseBody
public class ItemController {
	@Autowired
	private itemService itemservice;
    //@RequestMapping(value="/item/{id}",method =RequestMethod.GET )
    @GetMapping(value="/item/{id}")
	public item queryItemById(@PathVariable(name="id") Long id)
	{
		return itemservice.queryItemById(id);
	}
}
