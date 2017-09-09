package org.garen.operation.swagger.api;


import io.swagger.annotations.*;
import org.garen.operation.swagger.model.Role;
import org.garen.operation.swagger.model.SuccessModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-09T13:47:35.519Z")

@Api(value = "role", description = "the role API")
public interface RoleApi {

    @ApiOperation(value = "删除角色", notes = "删除角色 ", response = SuccessModel.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SuccessModel.class),
        @ApiResponse(code = 200, message = "unexpected error", response = SuccessModel.class) })
    @RequestMapping(value = "/role",
        method = RequestMethod.DELETE)
    ResponseEntity<SuccessModel> deleteRole(@ApiParam(value = "Pet object that needs to be added to the store") @RequestBody Role body);


    @ApiOperation(value = "分页查询", notes = "分页查询 ", response = SuccessModel.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SuccessModel.class),
        @ApiResponse(code = 200, message = "unexpected error", response = SuccessModel.class) })
    @RequestMapping(value = "/role/page",
        method = RequestMethod.GET)
    ResponseEntity<SuccessModel> getByPage(@ApiParam(value = "开始") @RequestParam(value = "start", required = false) Integer start,
                                           @ApiParam(value = "查询长度") @RequestParam(value = "limit", required = false) Integer limit,
                                           @ApiParam(value = "角色名称") @RequestParam(value = "roleName", required = false) String roleName);


    @ApiOperation(value = "获取角色", notes = "获取角色 ", response = SuccessModel.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SuccessModel.class),
        @ApiResponse(code = 200, message = "unexpected error", response = SuccessModel.class) })
    @RequestMapping(value = "/role/{roleId}",
        method = RequestMethod.GET)
    ResponseEntity<SuccessModel> getRole(@ApiParam(value = "组编号", required = true) @PathVariable("roleId") Long roleId);


    @ApiOperation(value = "获取角色", notes = "获取角色 ", response = SuccessModel.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SuccessModel.class),
        @ApiResponse(code = 200, message = "unexpected error", response = SuccessModel.class) })
    @RequestMapping(value = "/role",
        method = RequestMethod.GET)
    ResponseEntity<SuccessModel> getRoles();


    @ApiOperation(value = "新增角色", notes = "新增角色 ", response = SuccessModel.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SuccessModel.class),
        @ApiResponse(code = 200, message = "unexpected error", response = SuccessModel.class) })
    @RequestMapping(value = "/role",
        method = RequestMethod.POST)
    ResponseEntity<SuccessModel> postRole(@ApiParam(value = "Pet object that needs to be added to the store") @RequestBody Role body);


    @ApiOperation(value = "修改角色", notes = "修改角色 ", response = SuccessModel.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SuccessModel.class),
        @ApiResponse(code = 200, message = "unexpected error", response = SuccessModel.class) })
    @RequestMapping(value = "/role",
        method = RequestMethod.PUT)
    ResponseEntity<SuccessModel> putRole(@ApiParam(value = "Pet object that needs to be added to the store") @RequestBody Role body);

}
