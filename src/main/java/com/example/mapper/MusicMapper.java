package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.Music;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicMapper extends BaseMapper<Music> {
}
