package com.wsw.cloudtest.mapper;

import com.wsw.cloudtest.domain.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author WangSongWen
 * @Date: Created in 17:24 2020/10/27
 * @Description:
 */
@Mapper
public interface StorageMapper {
    /**
     * 减库存
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

    List<Storage> selectStorages();

    Storage selectStorageById(Long id);
}
