package com.example.controller;

import com.example.pojo.Music;
import com.example.result.Result;
import com.example.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class MusicController {

  @Autowired
  private MusicService musicService;
  @GetMapping("/musicList")
  public Result getMusic(){

      List<Music> musicList = musicService.getALl();
      return Result.success(musicList);
 }









}
