package tech.joymo.top.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tech.joymo.top.model.TopUser;
import tech.joymo.top.model.TopUserExample;

public interface TopUserMapper {
    long countByExample(TopUserExample example);

    int deleteByExample(TopUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TopUser record);

    int insertSelective(TopUser record);

    List<TopUser> selectByExample(TopUserExample example);

    TopUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TopUser record, @Param("example") TopUserExample example);

    int updateByExample(@Param("record") TopUser record, @Param("example") TopUserExample example);

    int updateByPrimaryKeySelective(TopUser record);

    int updateByPrimaryKey(TopUser record);
}