package tech.joymo.top.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tech.joymo.top.model.TopRole;
import tech.joymo.top.model.TopRoleExample;

public interface TopRoleMapper {
    long countByExample(TopRoleExample example);

    int deleteByExample(TopRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TopRole record);

    int insertSelective(TopRole record);

    List<TopRole> selectByExample(TopRoleExample example);

    TopRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TopRole record, @Param("example") TopRoleExample example);

    int updateByExample(@Param("record") TopRole record, @Param("example") TopRoleExample example);

    int updateByPrimaryKeySelective(TopRole record);

    int updateByPrimaryKey(TopRole record);
}