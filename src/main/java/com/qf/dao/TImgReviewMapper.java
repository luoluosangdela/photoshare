package com.qf.dao;

import com.qf.pojo.TImgReview;

public interface TImgReviewMapper {
    int deleteByPrimaryKey(Integer reId);

    int insert(TImgReview record);

    int insertSelective(TImgReview record);

    TImgReview selectByPrimaryKey(Integer reId);

    int updateByPrimaryKeySelective(TImgReview record);

    int updateByPrimaryKey(TImgReview record);
}