package com.mzy.dao;

import com.mzy.entity.Columnist;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ColumnistMapper {

    List<Columnist> findColumnistAll();

    List<Columnist> findColumnistByCondition(Map<String, Object> map);

    int insertColumnist(Columnist columnist);

    int updateColumnist(Columnist columnist);
}
