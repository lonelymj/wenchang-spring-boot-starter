package com.yuanchuang.wenchang.config;

import com.yuanchuang.wenchang.dto.nft.GetClassDto;
import com.yuanchuang.wenchang.service.NftService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WenChangAutoConfigurationTest {
    @Autowired
    WenChangProperties wenChangProperties;

    @Autowired
    NftService nftService;
    @Test
    public void test(){
        System.out.println(wenChangProperties.getApiUrl());
    }

    @Test
    public void getClazz(){
        GetClassDto getClassDto = new GetClassDto();
        getClassDto.setId("avataojs4a2f21mwlpr9ysoqyyenqm2r");
        nftService.getClass(getClassDto);
    }
}