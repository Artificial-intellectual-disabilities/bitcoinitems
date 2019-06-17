package com.bitcoin.bitcoinitems.controller;

import com.bitcoin.bitcoinitems.dto.BlockGetDto;
import com.bitcoin.bitcoinitems.dto.BlockListDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/block")
public class BlockController {


    @GetMapping("/getRecentBlocks")
    public List<BlockListDto> getRecentBlocks(){

        ArrayList<BlockListDto> blockListDtos  = new ArrayList<>();

        BlockListDto blockListDto = new BlockListDto();

        blockListDto.setBlockhash("0000000000000000001f1c6fbb49e1200577f453e5a47dbff26e1d7d269141eb");
        blockListDto.setHeight(580981);
        blockListDto.setSize(1246393);
        blockListDto.setTime(new Date());
        blockListDto.setTxsize((short)2702);
        blockListDtos.add(blockListDto);

        BlockListDto blockListDto2 = new BlockListDto();
        blockListDto2.setBlockhash("0000000000000000001f1c6fbb49e1200577f453e5a47dbff26e1d7d269141eb");
        blockListDto2.setHeight(580980);
        blockListDto2.setSize(1246392);
        blockListDto2.setTime(new Date());
        blockListDto2.setTxsize((short)2703);
        blockListDtos.add(blockListDto);

        return blockListDtos;
    }

    @GetMapping("/getByHeight")
    public BlockGetDto getByBlockhash(@RequestParam String blockhash){

        return null;
    }

    @GetMapping("/getByHeight")
    public BlockGetDto getByHeight(@RequestParam Integer height){

        return null;
    }


}
