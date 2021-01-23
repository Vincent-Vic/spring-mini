package cn.bugio.spring.demo.service;

import cn.bugio.spring.mini.annotation.*;
import cn.bugio.spring.mini.bean.BeanNameAware;
import cn.bugio.spring.mini.bean.InitializingBean;
import cn.bugio.spring.mini.constant.RequestMethod;
import lombok.Data;

/**
 * @author Vincent Vic
 * @version 1.0
 * @Description
 * @since 2021/1/17 20:20
 */
@Controller("userService")
@Data
public class UserService implements BeanNameAware, InitializingBean {

    @Autowired
    private User user;

    private String beanName;

    private String userName;

    @RequestMapping(value = "/app",method = RequestMethod.POST)
    public void test(){
        System.out.println(user);
    }

    @RequestMapping(value = "/app2",method = RequestMethod.POST)
    public void test2(String name){
        System.out.println(user);
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void afterPropertiesSet() {
        userName = user.getName();
    }
}
