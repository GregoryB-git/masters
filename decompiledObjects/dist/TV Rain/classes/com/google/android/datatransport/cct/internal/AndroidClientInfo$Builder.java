package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue.Builder;

@AutoValue.Builder
public abstract class AndroidClientInfo$Builder
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

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */