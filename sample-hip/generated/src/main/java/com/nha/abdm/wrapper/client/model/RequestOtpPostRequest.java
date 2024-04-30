/*
 * Swagger HIP Facade - OpenAPI 3.0
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
import java.io.IOException;

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
 * RequestOtpPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-22T00:27:32.411905600+05:30[Asia/Calcutta]")
public class RequestOtpPostRequest {
  public static final String SERIALIZED_NAME_ABHA_ADDRESS = "abhaAddress";
  @SerializedName(SERIALIZED_NAME_ABHA_ADDRESS)
  private String abhaAddress;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_PATIENT_REFERENCE = "patientReference";
  @SerializedName(SERIALIZED_NAME_PATIENT_REFERENCE)
  private String patientReference;

  public RequestOtpPostRequest() {
  }

  public RequestOtpPostRequest abhaAddress(String abhaAddress) {
    
    this.abhaAddress = abhaAddress;
    return this;
  }

   /**
   * Hint for the abhaAddress of the patient
   * @return abhaAddress
  **/
  @javax.annotation.Nonnull
  public String getAbhaAddress() {
    return abhaAddress;
  }


  public void setAbhaAddress(String abhaAddress) {
    this.abhaAddress = abhaAddress;
  }


  public RequestOtpPostRequest requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Unique identifier for the request
   * @return requestId
  **/
  @javax.annotation.Nonnull
  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public RequestOtpPostRequest patientReference(String patientReference) {
    
    this.patientReference = patientReference;
    return this;
  }

   /**
   * patient reference for the particular facility
   * @return patientReference
  **/
  @javax.annotation.Nonnull
  public String getPatientReference() {
    return patientReference;
  }


  public void setPatientReference(String patientReference) {
    this.patientReference = patientReference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestOtpPostRequest requestOtpPostRequest = (RequestOtpPostRequest) o;
    return Objects.equals(this.abhaAddress, requestOtpPostRequest.abhaAddress) &&
        Objects.equals(this.requestId, requestOtpPostRequest.requestId) &&
        Objects.equals(this.patientReference, requestOtpPostRequest.patientReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abhaAddress, requestId, patientReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestOtpPostRequest {\n");
    sb.append("    abhaAddress: ").append(toIndentedString(abhaAddress)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    patientReference: ").append(toIndentedString(patientReference)).append("\n");
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
    openapiFields.add("abhaAddress");
    openapiFields.add("requestId");
    openapiFields.add("patientReference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("abhaAddress");
    openapiRequiredFields.add("requestId");
    openapiRequiredFields.add("patientReference");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RequestOtpPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RequestOtpPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RequestOtpPostRequest is not found in the empty JSON string", RequestOtpPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RequestOtpPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RequestOtpPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RequestOtpPostRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("abhaAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `abhaAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("abhaAddress").toString()));
      }
      if (!jsonObj.get("requestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestId").toString()));
      }
      if (!jsonObj.get("patientReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patientReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patientReference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RequestOtpPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RequestOtpPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RequestOtpPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RequestOtpPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RequestOtpPostRequest>() {
           @Override
           public void write(JsonWriter out, RequestOtpPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RequestOtpPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RequestOtpPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RequestOtpPostRequest
  * @throws IOException if the JSON string is invalid with respect to RequestOtpPostRequest
  */
  public static RequestOtpPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RequestOtpPostRequest.class);
  }

 /**
  * Convert an instance of RequestOtpPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
