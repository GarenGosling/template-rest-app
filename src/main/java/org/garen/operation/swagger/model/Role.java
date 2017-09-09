package org.garen.operation.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Role
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-09T13:47:35.519Z")

public class Role   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("resource_ids")
  private String resourceIds = null;

  public Role id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * 角色ID
   * @return id
  **/
  @ApiModelProperty(value = "角色ID")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Role name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 角色名称
   * @return name
  **/
  @ApiModelProperty(value = "角色名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Role resourceIds(String resourceIds) {
    this.resourceIds = resourceIds;
    return this;
  }

   /**
   * 功能权限拼串
   * @return resourceIds
  **/
  @ApiModelProperty(value = "功能权限拼串")
  public String getResourceIds() {
    return resourceIds;
  }

  public void setResourceIds(String resourceIds) {
    this.resourceIds = resourceIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.id, role.id) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.resourceIds, role.resourceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, resourceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

