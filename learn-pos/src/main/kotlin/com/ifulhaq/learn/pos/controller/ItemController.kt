package com.ifulhaq.learn.pos.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("item")
class ItemController {
    fun list: String = "list"
}