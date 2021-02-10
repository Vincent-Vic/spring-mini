package cn.bugio.spring.mini.rest.mapping;

import java.lang.reflect.Method;

/**
 * @author Vincent Vic
 * @version 1.0
 * @Description 请求映射策略上下文类
 * @since 2021/1/23
 */

public final class RequestMappingRegisterContext {
    
    private RequestMappingRegisterStrategy strategy;

    public RequestMappingRegisterContext(RequestMappingRegisterStrategy strategy) {
        this.strategy = strategy;  
    }
    
    /**
     * 注册 Mapping
     * @param clazz
     * @param baseUrl
     * @param method
     */
    public void registerMapping(Class<?> clazz, String baseUrl, Method method) {
        if(this.strategy == null) {
            return;
        }
        this.strategy.register(clazz, baseUrl, method);
    }
    
}
