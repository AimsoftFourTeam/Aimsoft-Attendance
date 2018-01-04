package jp.co.aimsoft.attendance.sample.rest.presentation.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jp.co.aimsoft.attendance.sample.rest.logic.model.ShopModel;
import jp.co.aimsoft.attendance.sample.rest.logic.service.ShopService;
import jp.co.aimsoft.attendance.sample.rest.presentation.form.ShopForm;

@RestController
@RequestMapping("api/shop/json")
public class ShopJSonRestController {

	@Autowired
	private ShopService service;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public void createOne(@RequestBody ShopForm form) {

		ShopModel model = new ShopModel();
		BeanUtils.copyProperties(form, model);
		service.register(model);
	}

	@RequestMapping(method = RequestMethod.GET, value = "{shopId}")
	@ResponseStatus(HttpStatus.OK)
	public List<ShopModel> getShop(@PathVariable String shopId) {

		ShopModel model = service.getShop(shopId);
		ShopModel model2 = new ShopModel() {
			{
				setShopId("dummyId");
				setShopName("dummyName");
			}
		};

		List<ShopModel> result = Arrays.asList(model, model2);
		return result;
	}

}
