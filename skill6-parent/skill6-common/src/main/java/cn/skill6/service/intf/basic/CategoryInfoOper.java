package cn.skill6.service.intf.basic;

import java.util.List;

import cn.skill6.common.entity.po.CategoryInfo;

/**
 * 目录信息操作接口
 *
 * @author 何明胜
 * @version 1.0.1
 * @since 2018年8月24日 上午12:28:03
 */
public interface CategoryInfoOper {
  int deleteByCategoryId(Long categoryId);

  int addCategoryInfo(CategoryInfo categoryInfo);

  CategoryInfo selectByCategoryId(Long categoryId);

  List<CategoryInfo> findAll();

  int modifyByCategoryId(CategoryInfo categoryInfo);
}