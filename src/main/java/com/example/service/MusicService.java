package com.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.pojo.Music;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MusicService extends IService<Music> {


    List<Music> getALl();
}
