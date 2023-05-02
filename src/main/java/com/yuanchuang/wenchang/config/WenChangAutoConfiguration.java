package com.yuanchuang.wenchang.config;

import com.yuanchuang.wenchang.service.AccountService;
import com.yuanchuang.wenchang.service.NftService;
import com.yuanchuang.wenchang.service.OrderService;
import com.yuanchuang.wenchang.service.TxService;
import com.yuanchuang.wenchang.service.impl.AccountServiceImpl;
import com.yuanchuang.wenchang.service.impl.NftServiceImpl;
import com.yuanchuang.wenchang.service.impl.OrderServiceImpl;
import com.yuanchuang.wenchang.service.impl.TxServiceImpl;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = WenChangProperties.class)
public class WenChangAutoConfiguration {

    @Bean
    public AccountService accountService(){
        return new AccountServiceImpl();
    }

    @Bean
    public NftService nftService(){
        return new NftServiceImpl();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl();
    }

    @Bean
    public TxService txService(){
        return new TxServiceImpl();
    }
}
