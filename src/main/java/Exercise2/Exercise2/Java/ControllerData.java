/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2.Exercise2.Java;

import ServiceData.ServiceKTP;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author lenovo
 */
@Controller
public class ControllerData {
    ServiceKTP ser = new ServiceKTP();
    @RequestMapping("/viewData")
    @ResponseBody
    
    public ArrayList<List<String>> getData(){
        return ser.tabel();
    }
    @RequestMapping("/dataktp")
    public String view(Model pengantar){
         ArrayList<List<String>> data = new ArrayList<>();
         
         data = ser.tabel();
         
         pengantar.addAttribute("DataKTP", data);
         
         return "view.html";
    }
}
