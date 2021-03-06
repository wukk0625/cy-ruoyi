package com.cy.ruoyi.admin.sys.controller;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.cy.ruoyi.admin.sys.base.entity.SysConfig;
import com.cy.ruoyi.admin.sys.base.service.ISysConfigService;
import com.cy.ruoyi.common.core.basic.controller.BaseController;
import com.cy.ruoyi.common.sql.page.PageDomain;
import com.cy.ruoyi.common.sql.page.PageUtils;
import com.cy.ruoyi.common.utils.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 参数配置 提供者
 */
@RestController
@RequestMapping("config")
@Api(value = "SysConfigController",description = "参数配置")
public class SysConfigController extends BaseController
{

	private static final Log log = LogFactory.get();

	@Autowired
	private ISysConfigService sysConfigService;
	
	/**
	 * 查询参数配置
	 */
	@GetMapping("get/{configId}")
	@ApiOperation(value = "查询参数配置")
	@SentinelResource("get/{configId}")
	public SysConfig get(@PathVariable("configId") Long configId)
	{
		return sysConfigService.selectConfigById(configId);
		
	}
	
	/**
	 * 查询参数配置列表
	 */
	@GetMapping("list")
	@ApiOperation(value = "查询参数配置列表")
	@SentinelResource("list")
	public R list(SysConfig sysConfig)
	{
		PageDomain pageDomain = getPageInfo();
		log.info("开始查询第[{}]页[{}]条的数据!",pageDomain.getPageNum(), pageDomain.getPageSize());
		PageUtils page = sysConfigService.selectConfigList(pageDomain, sysConfig);
		return R.ok(page);
	}
	
	
	/**
	 * 新增保存参数配置
	 */
	@PostMapping("save")
	@ApiOperation(value = "新增保存参数配置")
	@SentinelResource("save")
	public R addSave(@RequestBody SysConfig sysConfig)
	{		
		return toAjax(sysConfigService.save(sysConfig));
	}

	/**
	 * 修改保存参数配置
	 */
	@PostMapping("update")
	@ApiOperation(value = "修改保存参数配置")
	@SentinelResource("update")
	public R editSave(@RequestBody SysConfig sysConfig)
	{		
		return toAjax(sysConfigService.saveOrUpdate(sysConfig));
	}
	
	/**
	 * 删除参数配置
	 */
	@PostMapping("remove")
	@ApiOperation(value = "删除参数配置")
	@SentinelResource("remove")
	public R remove(String ids)
	{		
		return toAjax(sysConfigService.deleteConfigByIds(ids));
	}
	
}
