/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A CreateMediaItemRequest request object
 */
@ApiModel(description = "A CreateMediaItemRequest request object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-04T12:02:08.868+02:00")
public class CreateMediaItemRequest {
  @JsonProperty("fileId")
  private String fileId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("transformAngle")
  private Integer transformAngle = null;

  public CreateMediaItemRequest fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * The Name
   * @return fileId
  **/
  @ApiModelProperty(value = "The Name")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public CreateMediaItemRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The Description
   * @return description
  **/
  @ApiModelProperty(value = "The Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateMediaItemRequest transformAngle(Integer transformAngle) {
    this.transformAngle = transformAngle;
    return this;
  }

   /**
   * 
   * @return transformAngle
  **/
  @ApiModelProperty(value = "")
  public Integer getTransformAngle() {
    return transformAngle;
  }

  public void setTransformAngle(Integer transformAngle) {
    this.transformAngle = transformAngle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMediaItemRequest createMediaItemRequest = (CreateMediaItemRequest) o;
    return Objects.equals(this.fileId, createMediaItemRequest.fileId) &&
        Objects.equals(this.description, createMediaItemRequest.description) &&
        Objects.equals(this.transformAngle, createMediaItemRequest.transformAngle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, description, transformAngle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMediaItemRequest {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transformAngle: ").append(toIndentedString(transformAngle)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

