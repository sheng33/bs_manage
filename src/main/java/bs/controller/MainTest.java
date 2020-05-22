package bs.controller;

import bs.config.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.websocket.server.PathParam;

@Controller("/sendMessage")
public class MainTest {
    @Autowired
    private WebSocketServerController socketServer;

    @GetMapping("/user")
    public AjaxResult<?> test(@PathParam(value="id") String id){
        System.out.println("sss");

        socketServer.sendAllMessage("test1");
        socketServer.sendTextMessage(id,"test");
        return  AjaxResult.me().setSuccess(true).setMsg("success");
    };
}
