package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

final class AutoValue_AndroidClientInfo$Builder
  extends AndroidClientInfo.Builder
{
  private String applicationBuild;
  private String country;
  private String device;
  private String fingerprint;
  private String hardware;
  private String locale;
  private String manufacturer;
  private String mccMnc;
  private String model;
  private String osBuild;
  private String product;
  private Integer sdkVersion;
  
  public AndroidClientInfo build()
  {
    return new AutoValue_AndroidClientInfo(sdkVersion, model, hardware, device, product, osBuild, manufacturer, fingerprint, locale, country, mccMnc, applicationBuild, null);
  }
  
  public AndroidClientInfo.Builder setApplicationBuild(@Nullable String paramString)
  {
    applicationBuild = paramString;
    return this;
  }
  
  public AndroidClientInfo.Builder setCountry(@Nullable String paramString)
  {
    country = paramString;
    return this;
  }
  
  public AndroidClientInfo.Builder setDevice(@Nullable String paramString)
  {
    device = paramString;
    return this;
  }
  
  public AndroidClientInfo.Builder setFingerprint(@Nullable String paramString)
  {
    fingerprint = paramString;
    return this;
  }
  
  public AndroidClientInfo.Builder setHardware(@Nullable String paramString)
  {
    hardware = paramString;
    return this;
  }
  
  public AndroidClientInfo.Builder setLocale(@Nullable String paramString)
  {
    locale = paramString;
    return this;
  }
  
  public AndroidClientInfo.Builder setManufacturer(@Nullable String paramString)
  {
    manufacturer = paramString;
    return this;
  }
  
  public AndroidClientInfo.Builder setMccMnc(@Nullable String paramString)
  {
    mccMnc = paramString;
    return this;
  }
  
  public AndroidClientInfo.Builder setModel(@Nullable String paramString)
  {
    model = paramString;
    return this;
  }
  
  public AndroidClientInfo.Builder setOsBuild(@Nullable String paramString)
  {
    osBuild = paramString;
    return this;
  }
  
  public AndroidClientInfo.Builder setProduct(@Nullable String paramString)
  {
    product = paramString;
    return this;
  }
  
  public AndroidClientInfo.Builder setSdkVersion(@Nullable Integer paramInteger)
  {
    sdkVersion = paramInteger;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */