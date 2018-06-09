package com.zpy.dao;



import java.util.HashMap;

public interface ClientsMapper {
    //@Select("select * from clients where client_id=#{id}")
    HashMap selectClient(/*@Param("id")*/ String id);
}
