package com.bitcoin.bitcoinitems.Api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "bitcoinitems", url = "http://localhost:18332")
public interface BitcoinItemsApi {

         @GetMapping("/")
         JSONObject getChainJson();

}
