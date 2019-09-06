/**
 * Create Date:2019年9月2日
 */
package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.service.MyService;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:唐缘缘
 * <br>Date:2019年9月2日
 */
@Controller
public class MyController {
  @Autowired
  private MyService ser;

  @RequestMapping("list.do")
  public String list(Model model) {
    List list = ser.list();
    model.addAttribute("list", list);
    return "list";
  }
}
