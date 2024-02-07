/* (C) 2024 */
package com.nha.abdm.wrapper.hip.hrp.dataTransfer.requests.callback.helpers.HealthInformationHiRequest;

import com.nha.abdm.wrapper.hip.hrp.dataTransfer.requests.callback.helpers.HealthInformationHiRequest.HealthInformationkeyMaterial.HealthInformationKeyMaterial;
import com.nha.abdm.wrapper.hiu.hrp.consent.requests.DateRange;
import com.nha.abdm.wrapper.hiu.hrp.consent.requests.callback.OnFetchConsentManager;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class HealthInformationRequest {
  public OnFetchConsentManager consent;
  public String dataPushUrl;
  public DateRange dateRange;
  public HealthInformationKeyMaterial keyMaterial;
}