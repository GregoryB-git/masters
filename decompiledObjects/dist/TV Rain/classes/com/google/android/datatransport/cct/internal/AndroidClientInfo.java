package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
public abstract class AndroidClientInfo
{
  @NonNull
  public static Builder builder()
  {
    return new AutoValue_AndroidClientInfo.Builder();
  }
  
  @Nullable
  public abstract String getApplicationBuild();
  
  @Nullable
  public abstract String getCountry();
  
  @Nullable
  public abstract String getDevice();
  
  @Nullable
  public abstract String getFingerprint();
  
  @Nullable
  public abstract String getHardware();
  
  @Nullable
  public abstract String getLocale();
  
  @Nullable
  public abstract String getManufacturer();
  
  @Nullable
  public abstract String getMccMnc();
  
  @Nullable
  public abstract String getModel();
  
  @Nullable
  public abstract String getOsBuild();
  
  @Nullable
  public abstract String getProduct();
  
  @Nullable
  public abstract Integer getSdkVersion();
  
  @AutoValue.Builder
  public static abstract class Builder
  {
    @NonNull
    public abstract AndroidClientInfo build();
    
    @NonNull
    public abstract Builder setApplicationBuild(@Nullable String paramString);
    
    @NonNull
    public abstract Builder setCountry(@Nullable String paramString);
    
    @NonNull
    public abstract Builder setDevice(@Nullable String paramString);
    
    @NonNull
    public abstract Builder setFingerprint(@Nullable String paramString);
    
    @NonNull
    public abstract Builder setHardware(@Nullable String paramString);
    
    @NonNull
    public abstract Builder setLocale(@Nullable String paramString);
    
    @NonNull
    public abstract Builder setManufacturer(@Nullable String paramString);
    
    @NonNull
    public abstract Builder setMccMnc(@Nullable String paramString);
    
    @NonNull
    public abstract Builder setModel(@Nullable String paramString);
    
    @NonNull
    public abstract Builder setOsBuild(@Nullable String paramString);
    
    @NonNull
    public abstract Builder setProduct(@Nullable String paramString);
    
    @NonNull
    public abstract Builder setSdkVersion(@Nullable Integer paramInteger);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AndroidClientInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */