/**
 * Create Date:2019年9月2日
 */
package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.dao.MyDao;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:唐缘缘
 * <br>Date:2019年9月2日
 */
@Service
public class MyServiceImp implements MyService {
  @Autowired
  private MyDao dao;

  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:唐缘缘
   * <br>Date:2019年9月2日
   * @see com.bw.service.MyService#list()
   */
  @Override
  public List list() {
    // TODO Auto-generated method stub
    return dao.list();
  }

}
