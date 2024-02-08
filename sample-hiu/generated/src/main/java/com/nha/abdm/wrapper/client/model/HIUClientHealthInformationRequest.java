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
 * HIUClientHealthInformationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-08T13:20:50.774805979Z[Etc/UTC]")
public class HIUClientHealthInformationRequest {
  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_CONSENT_ID = "consentId";
  @SerializedName(SERIALIZED_NAME_CONSENT_ID)
  private String consentId;

  public static final String SERIALIZED_NAME_FROM_DATE = "fromDate";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private String fromDate;

  public static final String SERIALIZED_NAME_TO_DATE = "toDate";
  @SerializedName(SERIALIZED_NAME_TO_DATE)
  private String toDate;

  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private String expiry;

  public HIUClientHealthInformationRequest() {
  }

  public HIUClientHealthInformationRequest requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public HIUClientHealthInformationRequest consentId(String consentId) {
    
    this.consentId = consentId;
    return this;
  }

   /**
   * Get consentId
   * @return consentId
  **/
  @javax.annotation.Nullable
  public String getConsentId() {
    return consentId;
  }


  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }


  public HIUClientHealthInformationRequest fromDate(String fromDate) {
    
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @javax.annotation.Nullable
  public String getFromDate() {
    return fromDate;
  }


  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }


  public HIUClientHealthInformationRequest toDate(String toDate) {
    
    this.toDate = toDate;
    return this;
  }

   /**
   * Get toDate
   * @return toDate
  **/
  @javax.annotation.Nullable
  public String getToDate() {
    return toDate;
  }


  public void setToDate(String toDate) {
    this.toDate = toDate;
  }


  public HIUClientHealthInformationRequest expiry(String expiry) {
    
    this.expiry = expiry;
    return this;
  }

   /**
   * Get expiry
   * @return expiry
  **/
  @javax.annotation.Nullable
  public String getExpiry() {
    return expiry;
  }


  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HIUClientHealthInformationRequest hiUClientHealthInformationRequest = (HIUClientHealthInformationRequest) o;
    return Objects.equals(this.requestId, hiUClientHealthInformationRequest.requestId) &&
        Objects.equals(this.consentId, hiUClientHealthInformationRequest.consentId) &&
        Objects.equals(this.fromDate, hiUClientHealthInformationRequest.fromDate) &&
        Objects.equals(this.toDate, hiUClientHealthInformationRequest.toDate) &&
        Objects.equals(this.expiry, hiUClientHealthInformationRequest.expiry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, consentId, fromDate, toDate, expiry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HIUClientHealthInformationRequest {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
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
    openapiFields.add("requestId");
    openapiFields.add("consentId");
    openapiFields.add("fromDate");
    openapiFields.add("toDate");
    openapiFields.add("expiry");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HIUClientHealthInformationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HIUClientHealthInformationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HIUClientHealthInformationRequest is not found in the empty JSON string", HIUClientHealthInformationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HIUClientHealthInformationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HIUClientHealthInformationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("requestId") != null && !jsonObj.get("requestId").isJsonNull()) && !jsonObj.get("requestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestId").toString()));
      }
      if ((jsonObj.get("consentId") != null && !jsonObj.get("consentId").isJsonNull()) && !jsonObj.get("consentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consentId").toString()));
      }
      if ((jsonObj.get("fromDate") != null && !jsonObj.get("fromDate").isJsonNull()) && !jsonObj.get("fromDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fromDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fromDate").toString()));
      }
      if ((jsonObj.get("toDate") != null && !jsonObj.get("toDate").isJsonNull()) && !jsonObj.get("toDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `toDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("toDate").toString()));
      }
      if ((jsonObj.get("expiry") != null && !jsonObj.get("expiry").isJsonNull()) && !jsonObj.get("expiry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiry").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HIUClientHealthInformationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HIUClientHealthInformationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HIUClientHealthInformationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HIUClientHealthInformationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<HIUClientHealthInformationRequest>() {
           @Override
           public void write(JsonWriter out, HIUClientHealthInformationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HIUClientHealthInformationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HIUClientHealthInformationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HIUClientHealthInformationRequest
  * @throws IOException if the JSON string is invalid with respect to HIUClientHealthInformationRequest
  */
  public static HIUClientHealthInformationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HIUClientHealthInformationRequest.class);
  }

 /**
  * Convert an instance of HIUClientHealthInformationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
