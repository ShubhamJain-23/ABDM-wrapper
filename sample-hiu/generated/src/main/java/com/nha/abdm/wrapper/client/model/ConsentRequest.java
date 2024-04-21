/*
 * Swagger HIU Facade - OpenAPI 3.0
 * This is a set of interfaces based on the OpenAPI 3.0 specification for a wrapper client
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.nha.abdm.wrapper.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.nha.abdm.wrapper.client.model.ConsentCareContext;
import com.nha.abdm.wrapper.client.model.ConsentRequester;
import com.nha.abdm.wrapper.client.model.HiTypeEnum;
import com.nha.abdm.wrapper.client.model.IdRequest;
import com.nha.abdm.wrapper.client.model.Permission;
import com.nha.abdm.wrapper.client.model.Purpose;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.nha.abdm.wrapper.client.invoker.JSON;

/**
 * ConsentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-21T21:07:52.071456600+05:30[Asia/Calcutta]")
public class ConsentRequest {
  public static final String SERIALIZED_NAME_PURPOSE = "purpose";
  @SerializedName(SERIALIZED_NAME_PURPOSE)
  private Purpose purpose;

  public static final String SERIALIZED_NAME_PATIENT = "patient";
  @SerializedName(SERIALIZED_NAME_PATIENT)
  private IdRequest patient;

  public static final String SERIALIZED_NAME_HIP = "hip";
  @SerializedName(SERIALIZED_NAME_HIP)
  private IdRequest hip;

  public static final String SERIALIZED_NAME_CARE_CONTEXTS = "careContexts";
  @SerializedName(SERIALIZED_NAME_CARE_CONTEXTS)
  private List<ConsentCareContext> careContexts;

  public static final String SERIALIZED_NAME_HIU = "hiu";
  @SerializedName(SERIALIZED_NAME_HIU)
  private IdRequest hiu;

  public static final String SERIALIZED_NAME_REQUESTER = "requester";
  @SerializedName(SERIALIZED_NAME_REQUESTER)
  private ConsentRequester requester;

  public static final String SERIALIZED_NAME_HI_TYPES = "hiTypes";
  @SerializedName(SERIALIZED_NAME_HI_TYPES)
  private List<HiTypeEnum> hiTypes = new ArrayList<>();

  public static final String SERIALIZED_NAME_PERMISSION = "permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private Permission permission;

  public ConsentRequest() {
  }

  public ConsentRequest purpose(Purpose purpose) {
    
    this.purpose = purpose;
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  @javax.annotation.Nonnull
  public Purpose getPurpose() {
    return purpose;
  }


  public void setPurpose(Purpose purpose) {
    this.purpose = purpose;
  }


  public ConsentRequest patient(IdRequest patient) {
    
    this.patient = patient;
    return this;
  }

   /**
   * Get patient
   * @return patient
  **/
  @javax.annotation.Nonnull
  public IdRequest getPatient() {
    return patient;
  }


  public void setPatient(IdRequest patient) {
    this.patient = patient;
  }


  public ConsentRequest hip(IdRequest hip) {
    
    this.hip = hip;
    return this;
  }

   /**
   * Get hip
   * @return hip
  **/
  @javax.annotation.Nullable
  public IdRequest getHip() {
    return hip;
  }


  public void setHip(IdRequest hip) {
    this.hip = hip;
  }


  public ConsentRequest careContexts(List<ConsentCareContext> careContexts) {
    
    this.careContexts = careContexts;
    return this;
  }

  public ConsentRequest addCareContextsItem(ConsentCareContext careContextsItem) {
    if (this.careContexts == null) {
      this.careContexts = new ArrayList<>();
    }
    this.careContexts.add(careContextsItem);
    return this;
  }

   /**
   * Get careContexts
   * @return careContexts
  **/
  @javax.annotation.Nullable
  public List<ConsentCareContext> getCareContexts() {
    return careContexts;
  }


  public void setCareContexts(List<ConsentCareContext> careContexts) {
    this.careContexts = careContexts;
  }


  public ConsentRequest hiu(IdRequest hiu) {
    
    this.hiu = hiu;
    return this;
  }

   /**
   * Get hiu
   * @return hiu
  **/
  @javax.annotation.Nonnull
  public IdRequest getHiu() {
    return hiu;
  }


  public void setHiu(IdRequest hiu) {
    this.hiu = hiu;
  }


  public ConsentRequest requester(ConsentRequester requester) {
    
    this.requester = requester;
    return this;
  }

   /**
   * Get requester
   * @return requester
  **/
  @javax.annotation.Nonnull
  public ConsentRequester getRequester() {
    return requester;
  }


  public void setRequester(ConsentRequester requester) {
    this.requester = requester;
  }


  public ConsentRequest hiTypes(List<HiTypeEnum> hiTypes) {
    
    this.hiTypes = hiTypes;
    return this;
  }

  public ConsentRequest addHiTypesItem(HiTypeEnum hiTypesItem) {
    if (this.hiTypes == null) {
      this.hiTypes = new ArrayList<>();
    }
    this.hiTypes.add(hiTypesItem);
    return this;
  }

   /**
   * Get hiTypes
   * @return hiTypes
  **/
  @javax.annotation.Nonnull
  public List<HiTypeEnum> getHiTypes() {
    return hiTypes;
  }


  public void setHiTypes(List<HiTypeEnum> hiTypes) {
    this.hiTypes = hiTypes;
  }


  public ConsentRequest permission(Permission permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @javax.annotation.Nonnull
  public Permission getPermission() {
    return permission;
  }


  public void setPermission(Permission permission) {
    this.permission = permission;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequest consentRequest = (ConsentRequest) o;
    return Objects.equals(this.purpose, consentRequest.purpose) &&
        Objects.equals(this.patient, consentRequest.patient) &&
        Objects.equals(this.hip, consentRequest.hip) &&
        Objects.equals(this.careContexts, consentRequest.careContexts) &&
        Objects.equals(this.hiu, consentRequest.hiu) &&
        Objects.equals(this.requester, consentRequest.requester) &&
        Objects.equals(this.hiTypes, consentRequest.hiTypes) &&
        Objects.equals(this.permission, consentRequest.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purpose, patient, hip, careContexts, hiu, requester, hiTypes, permission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRequest {\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("    hip: ").append(toIndentedString(hip)).append("\n");
    sb.append("    careContexts: ").append(toIndentedString(careContexts)).append("\n");
    sb.append("    hiu: ").append(toIndentedString(hiu)).append("\n");
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("    hiTypes: ").append(toIndentedString(hiTypes)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("purpose");
    openapiFields.add("patient");
    openapiFields.add("hip");
    openapiFields.add("careContexts");
    openapiFields.add("hiu");
    openapiFields.add("requester");
    openapiFields.add("hiTypes");
    openapiFields.add("permission");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("purpose");
    openapiRequiredFields.add("patient");
    openapiRequiredFields.add("hiu");
    openapiRequiredFields.add("requester");
    openapiRequiredFields.add("hiTypes");
    openapiRequiredFields.add("permission");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConsentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConsentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConsentRequest is not found in the empty JSON string", ConsentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConsentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConsentRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConsentRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `purpose`
      Purpose.validateJsonObject(jsonObj.getAsJsonObject("purpose"));
      // validate the required field `patient`
      IdRequest.validateJsonObject(jsonObj.getAsJsonObject("patient"));
      // validate the optional field `hip`
      if (jsonObj.get("hip") != null && !jsonObj.get("hip").isJsonNull()) {
        IdRequest.validateJsonObject(jsonObj.getAsJsonObject("hip"));
      }
      if (jsonObj.get("careContexts") != null && !jsonObj.get("careContexts").isJsonNull()) {
        JsonArray jsonArraycareContexts = jsonObj.getAsJsonArray("careContexts");
        if (jsonArraycareContexts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("careContexts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `careContexts` to be an array in the JSON string but got `%s`", jsonObj.get("careContexts").toString()));
          }

          // validate the optional field `careContexts` (array)
          for (int i = 0; i < jsonArraycareContexts.size(); i++) {
            ConsentCareContext.validateJsonObject(jsonArraycareContexts.get(i).getAsJsonObject());
          };
        }
      }
      // validate the required field `hiu`
      IdRequest.validateJsonObject(jsonObj.getAsJsonObject("hiu"));
      // validate the required field `requester`
      ConsentRequester.validateJsonObject(jsonObj.getAsJsonObject("requester"));
      // ensure the required json array is present
      if (jsonObj.get("hiTypes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("hiTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `hiTypes` to be an array in the JSON string but got `%s`", jsonObj.get("hiTypes").toString()));
      }
      // validate the required field `permission`
      Permission.validateJsonObject(jsonObj.getAsJsonObject("permission"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConsentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConsentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConsentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConsentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ConsentRequest>() {
           @Override
           public void write(JsonWriter out, ConsentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConsentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConsentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConsentRequest
  * @throws IOException if the JSON string is invalid with respect to ConsentRequest
  */
  public static ConsentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConsentRequest.class);
  }

 /**
  * Convert an instance of ConsentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

