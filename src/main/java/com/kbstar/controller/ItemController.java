package com.kbstar.controller;

import com.github.pagehelper.PageInfo;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.service.CartService;
import com.kbstar.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    @Autowired
    CartService cartService;

    String dir = "item/";

    @RequestMapping("")
    public String main(Model model){
        model.addAttribute("left",dir+"left");
        model.addAttribute("center",dir+"center");
        return "index";
    }
    @RequestMapping("/add")
    public String add(Model model){
        model.addAttribute("left",dir+"left");
        model.addAttribute("center",dir+"add");
        return "index";
    }

    @RequestMapping("/get")
    public String get(Model model, Integer id) throws Exception {
        Item item = null;
        item = itemService.get(id);
        model.addAttribute("gitem",item);
        model.addAttribute("left","left");
        model.addAttribute("center", "center");
        return "index";
    }


    @RequestMapping("/allcart")
    public String allcart(Model model, String id) throws Exception {
        List<Cart> list = null;

        try {
            list = cartService.getMyCart(id);
        } catch (Exception e) {
            throw new Exception("시스템장애: ER0002");
        }
        model.addAttribute("allcart",list);
        model.addAttribute("center","cart");
        return "index";
    }

    @RequestMapping("/addcart")
    public String addcart(Model model, Cart cart) throws Exception {
        cartService.register(cart);
        return "redirect:/item/allcart?id="+cart.getCust_id();
    }

    @RequestMapping("/delcart")
    public String delcart(Model model, Integer id, HttpSession session) throws Exception {
        cartService.remove(id);
        //세션이 사라질지 모름. 반드시!
        if(session != null){
            Cust cust = (Cust) session.getAttribute("logincust");
            return "redirect:/item/allcart?id="+cust.getId();
        }
        return "redirect:/";
    }
    @RequestMapping("/top")
    public String top(Model model) throws Exception {
        List<Item> list = null;
        list = itemService.getTopcate(100);
        log.info(list.toString());
        model.addAttribute("allitem",list);
        model.addAttribute("left",dir+"topleft");
        model.addAttribute("center",dir+"top");
        return "index";
    }
    @RequestMapping("/bottom")
    public String bottom(Model model) throws Exception {
        List<Item> list = null;
        list = itemService.getTopcate(200);
        log.info(list.toString());
        model.addAttribute("allitem",list);
        model.addAttribute("left",dir+"bottomleft");
        model.addAttribute("center",dir+"bottom");
        return "index";
    }
    @RequestMapping("/shoes")
    public String shoes(Model model) throws Exception {
        List<Item> list = null;
        list = itemService.getTopcate(300);
        log.info(list.toString());
        model.addAttribute("allitem",list);
        model.addAttribute("left",dir+"shoesleft");
        model.addAttribute("center",dir+"shoes");
        return "index";
    }

    @RequestMapping("/tshirt")
    public String tshirt(Model model) throws Exception {
        List<Item> list = null;
        list = itemService.getCateid(110);
        model.addAttribute("allitem",list);
        model.addAttribute("left",dir+"topleft");
        model.addAttribute("center",dir+"tshirt");
        return "index";
    }
    @RequestMapping("/jacket")
    public String jacket(Model model) throws Exception {
        List<Item> list = null;
        list = itemService.getCateid(120);
        model.addAttribute("allitem",list);
        model.addAttribute("left",dir+"topleft");
        model.addAttribute("center",dir+"jacket");
        return "index";
    }
    @RequestMapping("/shirt")
    public String shirt(Model model) throws Exception {
        List<Item> list = null;
        list = itemService.getCateid(130);
        model.addAttribute("allitem",list);
        model.addAttribute("left",dir+"topleft");
        model.addAttribute("center",dir+"shirt");
        return "index";
    }
    @RequestMapping("/jeans")
    public String jeans(Model model) throws Exception {
        List<Item> list = null;
        list = itemService.getCateid(210);
        model.addAttribute("allitem",list);
        model.addAttribute("left",dir+"bottomleft");
        model.addAttribute("center",dir+"jeans");
        return "index";
    }
    @RequestMapping("/half")
    public String half(Model model) throws Exception {
        List<Item> list = null;
        list = itemService.getCateid(220);
        model.addAttribute("allitem",list);
        model.addAttribute("left",dir+"bottomleft");
        model.addAttribute("center",dir+"half");
        return "index";
    }
    @RequestMapping("/skirt")
    public String skirt(Model model) throws Exception {
        List<Item> list = null;
        list = itemService.getCateid(230);
        model.addAttribute("allitem",list);
        model.addAttribute("left",dir+"bottomleft");
        model.addAttribute("center",dir+"skirt");
        return "index";
    }
    @RequestMapping("/sneakers")
    public String sneakers(Model model) throws Exception {
        List<Item> list = null;
        list = itemService.getCateid(310);
        model.addAttribute("allitem",list);
        model.addAttribute("left",dir+"shoesleft");
        model.addAttribute("center",dir+"sneakers");
        return "index";
    }
    @RequestMapping("/slipper")
    public String slipper(Model model) throws Exception {
        List<Item> list = null;
        list = itemService.getCateid(320);
        model.addAttribute("allitem",list);
        model.addAttribute("left",dir+"shoesleft");
        model.addAttribute("center",dir+"slipper");
        return "index";
    }
    @RequestMapping("/loafers")
    public String loafers(Model model) throws Exception {
        List<Item> list = null;
        list = itemService.getCateid(330);
        model.addAttribute("allitem",list);
        model.addAttribute("left",dir+"shoesleft");
        model.addAttribute("center",dir+"loafers");
        return "index";
    }

}
