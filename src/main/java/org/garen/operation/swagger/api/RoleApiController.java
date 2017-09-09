package org.garen.operation.swagger.api;


import io.swagger.annotations.ApiParam;
import org.garen.operation.swagger.model.Role;
import org.garen.operation.swagger.model.SuccessModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-09T13:47:35.519Z")

@Controller
public class RoleApiController implements RoleApi {

    public ResponseEntity<SuccessModel> deleteRole(@ApiParam(value = "Pet object that needs to be added to the store"  ) @RequestBody Role body) {
        // do some magic!
        return new ResponseEntity<SuccessModel>(HttpStatus.OK);
    }

    public ResponseEntity<SuccessModel> getByPage(@ApiParam(value = "开始") @RequestParam(value = "start", required = false) Integer start,
        @ApiParam(value = "查询长度") @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "角色名称") @RequestParam(value = "roleName", required = false) String roleName) {
        // do some magic!
        System.out.println("hello");
        SuccessModel successModel = new SuccessModel();
        successModel.setCode(400);
        successModel.setMessage("无访问权限");
        successModel.setData("sssssss");
        return new ResponseEntity<SuccessModel>(successModel, HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<SuccessModel> getRole(@ApiParam(value = "组编号",required=true ) @PathVariable("roleId") Long roleId) {
        // do some magic!
        return new ResponseEntity<SuccessModel>(HttpStatus.OK);
    }

    public ResponseEntity<SuccessModel> getRoles() {
        // do some magic!
        return new ResponseEntity<SuccessModel>(HttpStatus.OK);
    }

    public ResponseEntity<SuccessModel> postRole(@ApiParam(value = "Pet object that needs to be added to the store"  ) @RequestBody Role body) {
        // do some magic!
        return new ResponseEntity<SuccessModel>(HttpStatus.OK);
    }

    public ResponseEntity<SuccessModel> putRole(@ApiParam(value = "Pet object that needs to be added to the store"  ) @RequestBody Role body) {
        // do some magic!
        return new ResponseEntity<SuccessModel>(HttpStatus.OK);
    }

}
