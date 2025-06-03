package com.yandex.metrica;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import java.util.List;
import java.util.Map;

public class IParamsCallback$Result
{
  @Nullable
  private final Map<String, String> clids;
  @Nullable
  private final Map<String, List<String>> customSdkHosts;
  @Nullable
  private final String deviceId;
  @Nullable
  private final String deviceIdHash;
  @NonNull
  private final FeaturesResult features;
  @Nullable
  private final String getUrl;
  @Nullable
  private final String reportUrl;
  @Nullable
  private final String uuid;
  
  public IParamsCallback$Result(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, @Nullable String paramString5, @Nullable Map<String, String> paramMap, @Nullable Map<String, List<String>> paramMap1, @NonNull FeaturesResult paramFeaturesResult)
  {
    deviceId = paramString1;
    uuid = paramString2;
    reportUrl = paramString3;
    getUrl = paramString4;
    deviceIdHash = paramString5;
    clids = paramMap;
    customSdkHosts = paramMap1;
    features = paramFeaturesResult;
  }
  
  @Nullable
  public Map<String, String> getClids()
  {
    return clids;
  }
  
  @Nullable
  public Map<String, List<String>> getCustomSdkHosts()
  {
    return customSdkHosts;
  }
  
  @Nullable
  public String getDeviceId()
  {
    return deviceId;
  }
  
  @Nullable
  public String getDeviceIdHash()
  {
    return deviceIdHash;
  }
  
  @NonNull
  public FeaturesResult getFeatures()
  {
    return features;
  }
  
  @Nullable
  public String getGetUrl()
  {
    return getUrl;
  }
  
  @Nullable
  public String getReportUrl()
  {
    return reportUrl;
  }
  
  @Nullable
  public String getUuid()
  {
    return uuid;
  }
  
  public boolean hasClids()
  {
    return A2.b(clids) ^ true;
  }
  
  public boolean hasCustomSdkHosts()
  {
    return A2.b(customSdkHosts) ^ true;
  }
  
  public boolean hasDeviceId()
  {
    return TextUtils.isEmpty(deviceId) ^ true;
  }
  
  public boolean hasDeviceIdHash()
  {
    return TextUtils.isEmpty(deviceIdHash) ^ true;
  }
  
  public boolean hasGetUrl()
  {
    return TextUtils.isEmpty(getUrl) ^ true;
  }
  
  public boolean hasReportUrl()
  {
    return TextUtils.isEmpty(reportUrl) ^ true;
  }
  
  public boolean hasUuid()
  {
    return TextUtils.isEmpty(uuid) ^ true;
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.IParamsCallback.Result
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */