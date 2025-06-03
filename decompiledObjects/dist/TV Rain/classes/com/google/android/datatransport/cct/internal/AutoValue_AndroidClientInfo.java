package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import z2;

final class AutoValue_AndroidClientInfo
  extends AndroidClientInfo
{
  private final String applicationBuild;
  private final String country;
  private final String device;
  private final String fingerprint;
  private final String hardware;
  private final String locale;
  private final String manufacturer;
  private final String mccMnc;
  private final String model;
  private final String osBuild;
  private final String product;
  private final Integer sdkVersion;
  
  private AutoValue_AndroidClientInfo(@Nullable Integer paramInteger, @Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, @Nullable String paramString5, @Nullable String paramString6, @Nullable String paramString7, @Nullable String paramString8, @Nullable String paramString9, @Nullable String paramString10, @Nullable String paramString11)
  {
    sdkVersion = paramInteger;
    model = paramString1;
    hardware = paramString2;
    device = paramString3;
    product = paramString4;
    osBuild = paramString5;
    manufacturer = paramString6;
    fingerprint = paramString7;
    locale = paramString8;
    country = paramString9;
    mccMnc = paramString10;
    applicationBuild = paramString11;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof AndroidClientInfo))
    {
      paramObject = (AndroidClientInfo)paramObject;
      Object localObject = sdkVersion;
      if (localObject == null ? ((AndroidClientInfo)paramObject).getSdkVersion() == null : ((Integer)localObject).equals(((AndroidClientInfo)paramObject).getSdkVersion()))
      {
        localObject = model;
        if (localObject == null ? ((AndroidClientInfo)paramObject).getModel() == null : ((String)localObject).equals(((AndroidClientInfo)paramObject).getModel()))
        {
          localObject = hardware;
          if (localObject == null ? ((AndroidClientInfo)paramObject).getHardware() == null : ((String)localObject).equals(((AndroidClientInfo)paramObject).getHardware()))
          {
            localObject = device;
            if (localObject == null ? ((AndroidClientInfo)paramObject).getDevice() == null : ((String)localObject).equals(((AndroidClientInfo)paramObject).getDevice()))
            {
              localObject = product;
              if (localObject == null ? ((AndroidClientInfo)paramObject).getProduct() == null : ((String)localObject).equals(((AndroidClientInfo)paramObject).getProduct()))
              {
                localObject = osBuild;
                if (localObject == null ? ((AndroidClientInfo)paramObject).getOsBuild() == null : ((String)localObject).equals(((AndroidClientInfo)paramObject).getOsBuild()))
                {
                  localObject = manufacturer;
                  if (localObject == null ? ((AndroidClientInfo)paramObject).getManufacturer() == null : ((String)localObject).equals(((AndroidClientInfo)paramObject).getManufacturer()))
                  {
                    localObject = fingerprint;
                    if (localObject == null ? ((AndroidClientInfo)paramObject).getFingerprint() == null : ((String)localObject).equals(((AndroidClientInfo)paramObject).getFingerprint()))
                    {
                      localObject = locale;
                      if (localObject == null ? ((AndroidClientInfo)paramObject).getLocale() == null : ((String)localObject).equals(((AndroidClientInfo)paramObject).getLocale()))
                      {
                        localObject = country;
                        if (localObject == null ? ((AndroidClientInfo)paramObject).getCountry() == null : ((String)localObject).equals(((AndroidClientInfo)paramObject).getCountry()))
                        {
                          localObject = mccMnc;
                          if (localObject == null ? ((AndroidClientInfo)paramObject).getMccMnc() == null : ((String)localObject).equals(((AndroidClientInfo)paramObject).getMccMnc()))
                          {
                            localObject = applicationBuild;
                            if (localObject == null ? ((AndroidClientInfo)paramObject).getApplicationBuild() == null : ((String)localObject).equals(((AndroidClientInfo)paramObject).getApplicationBuild())) {
                              break label386;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      bool = false;
      label386:
      return bool;
    }
    return false;
  }
  
  @Nullable
  public String getApplicationBuild()
  {
    return applicationBuild;
  }
  
  @Nullable
  public String getCountry()
  {
    return country;
  }
  
  @Nullable
  public String getDevice()
  {
    return device;
  }
  
  @Nullable
  public String getFingerprint()
  {
    return fingerprint;
  }
  
  @Nullable
  public String getHardware()
  {
    return hardware;
  }
  
  @Nullable
  public String getLocale()
  {
    return locale;
  }
  
  @Nullable
  public String getManufacturer()
  {
    return manufacturer;
  }
  
  @Nullable
  public String getMccMnc()
  {
    return mccMnc;
  }
  
  @Nullable
  public String getModel()
  {
    return model;
  }
  
  @Nullable
  public String getOsBuild()
  {
    return osBuild;
  }
  
  @Nullable
  public String getProduct()
  {
    return product;
  }
  
  @Nullable
  public Integer getSdkVersion()
  {
    return sdkVersion;
  }
  
  public int hashCode()
  {
    Object localObject = sdkVersion;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = ((Integer)localObject).hashCode();
    }
    localObject = model;
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = ((String)localObject).hashCode();
    }
    localObject = hardware;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = ((String)localObject).hashCode();
    }
    localObject = device;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = ((String)localObject).hashCode();
    }
    localObject = product;
    int i1;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = ((String)localObject).hashCode();
    }
    localObject = osBuild;
    int i2;
    if (localObject == null) {
      i2 = 0;
    } else {
      i2 = ((String)localObject).hashCode();
    }
    localObject = manufacturer;
    int i3;
    if (localObject == null) {
      i3 = 0;
    } else {
      i3 = ((String)localObject).hashCode();
    }
    localObject = fingerprint;
    int i4;
    if (localObject == null) {
      i4 = 0;
    } else {
      i4 = ((String)localObject).hashCode();
    }
    localObject = locale;
    int i5;
    if (localObject == null) {
      i5 = 0;
    } else {
      i5 = ((String)localObject).hashCode();
    }
    localObject = country;
    int i6;
    if (localObject == null) {
      i6 = 0;
    } else {
      i6 = ((String)localObject).hashCode();
    }
    localObject = mccMnc;
    int i7;
    if (localObject == null) {
      i7 = 0;
    } else {
      i7 = ((String)localObject).hashCode();
    }
    localObject = applicationBuild;
    if (localObject != null) {
      i = ((String)localObject).hashCode();
    }
    return (((((((((((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i3) * 1000003 ^ i4) * 1000003 ^ i5) * 1000003 ^ i6) * 1000003 ^ i7) * 1000003 ^ i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("AndroidClientInfo{sdkVersion=");
    localStringBuilder.append(sdkVersion);
    localStringBuilder.append(", model=");
    localStringBuilder.append(model);
    localStringBuilder.append(", hardware=");
    localStringBuilder.append(hardware);
    localStringBuilder.append(", device=");
    localStringBuilder.append(device);
    localStringBuilder.append(", product=");
    localStringBuilder.append(product);
    localStringBuilder.append(", osBuild=");
    localStringBuilder.append(osBuild);
    localStringBuilder.append(", manufacturer=");
    localStringBuilder.append(manufacturer);
    localStringBuilder.append(", fingerprint=");
    localStringBuilder.append(fingerprint);
    localStringBuilder.append(", locale=");
    localStringBuilder.append(locale);
    localStringBuilder.append(", country=");
    localStringBuilder.append(country);
    localStringBuilder.append(", mccMnc=");
    localStringBuilder.append(mccMnc);
    localStringBuilder.append(", applicationBuild=");
    return z2.s(localStringBuilder, applicationBuild, "}");
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */