package com.cy.ruoyi.admin.sys.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cy.ruoyi.admin.sys.base.entity.SysLogininfor;
import com.cy.ruoyi.common.sql.page.PageDomain;
import com.cy.ruoyi.common.sql.page.PageUtils;

import java.util.List;

public interface ISysLogininforService extends IService<SysLogininfor> {

    /**
     * 新增系统登录日志
     *
     * @param logininfor 访问日志对象
     */
    void insertLogininfor(SysLogininfor logininfor);

    /**
     * 查询系统登录日志集合
     *
     * @param logininfor 访问日志对象
     * @return 登录记录集合
     */
    List<SysLogininfor> selectLogininforList(SysLogininfor logininfor);

    /**
     * 批量删除系统登录日志
     *
     * @param ids 需要删除的数据
     * @return
     */
    int deleteLogininforByIds(String ids);

    /**
     * 清空系统登录日志
     */
    void cleanLogininfor();

    //****************************************************************************
    /**
     * 根据条件分页查询
     */
    PageUtils selectLogininforList(PageDomain pageDomain, SysLogininfor logininfor);


}
