package com.cy.ruoyi.admin.sys.controller;

import com.cy.ruoyi.common.core.basic.controller.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 岗位 提供者
 */
@RestController
@RequestMapping("/sys/sysPost")
@Api(value = "SysPostClient",description = "岗位")
public class SysPostClient extends BaseController
{

//	private static final Log log = LogFactory.get();
//
//	@Autowired
//	private ISysPostService sysPostService;
//
//	/**
//	 * 查询岗位
//	 */
//	@GetMapping("get/{postId}")
//	@ApiOperation(value = "查询岗位")
//	public SysPost get(@PathVariable("postId") Long postId)
//	{
//		return sysPostService.selectPostById(postId);
//
//	}
//
//	/**
//	 * 查询岗位列表
//	 */
//	@PostMapping("list")
//	@ApiOperation(value = "查询岗位列表")
//	public List<SysPost> list(SysPost sysPost)
//	{
////        return sysPostService.selectPostList(sysPost);
//        return null;
//	}
//
//
//	/**
//	 * 新增保存岗位
//	 */
//	@PostMapping("save")
//	@ApiOperation(value = "新增保存岗位")
//	public int addSave(SysPost sysPost)
//	{
//		return sysPostService.insertPost(sysPost);
//	}
//
//	/**
//	 * 修改保存岗位
//	 */
//	@PostMapping("update")
//	@ApiOperation(value = "修改保存岗位")
//	public int editSave(SysPost sysPost)
//	{
//		return sysPostService.updatePost(sysPost);
//	}
//
//	/**
//	 * 删除岗位
//	 * @throws Exception
//	 */
//	@PostMapping("remove")
//	@ApiOperation(value = "删除岗位")
//	public int remove(String ids) throws Exception
//	{
//		return sysPostService.deletePostByIds(ids);
//	}
	
}
