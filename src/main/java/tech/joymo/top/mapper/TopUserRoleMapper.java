package tech.joymo.top.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tech.joymo.top.model.TopUserRole;
import tech.joymo.top.model.TopUserRoleExample;

public interface TopUserRoleMapper {
    long countByExample(TopUserRoleExample example);

    int deleteByExample(TopUserRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TopUserRole record);

    int insertSelective(TopUserRole record);

    List<TopUserRole> selectByExample(TopUserRoleExample example);

    TopUserRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TopUserRole record, @Param("example") TopUserRoleExample example);

    int updateByExample(@Param("record") TopUserRole record, @Param("example") TopUserRoleExample example);

    int updateByPrimaryKeySelective(TopUserRole record);

    int updateByPrimaryKey(TopUserRole record);
}