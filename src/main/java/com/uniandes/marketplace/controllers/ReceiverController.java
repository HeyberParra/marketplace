package com.uniandes.marketplace.controllers;

import java.io.IOException;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uniandes.marketplace.models.Pedido;

/**
 * This controller provides the access for the receiver end point
 *
 */
@Controller
@EnableAutoConfiguration
public class ReceiverController {
		
	
	//private ReceptionerService receptionerService;
		
	/**
	 *
	 * @param message the message
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
    @RequestMapping(value = "/receiver", method = RequestMethod.POST)
    @ResponseBody
    String encode(@RequestBody Pedido trace)  {
    	
    //	this.receptionerService.recepcionerTrace(trace);
    	
    	return "Pedido realizado";
    }
}