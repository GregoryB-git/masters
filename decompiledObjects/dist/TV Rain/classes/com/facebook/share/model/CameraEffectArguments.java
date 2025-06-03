package com.facebook.share.model;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import java.util.Set;

public class CameraEffectArguments
  implements ShareModel
{
  public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new Parcelable.Creator()
  {
    public CameraEffectArguments createFromParcel(Parcel paramAnonymousParcel)
    {
      return new CameraEffectArguments(paramAnonymousParcel);
    }
    
    public CameraEffectArguments[] newArray(int paramAnonymousInt)
    {
      return new CameraEffectArguments[paramAnonymousInt];
    }
  };
  private final Bundle params;
  
  public CameraEffectArguments(Parcel paramParcel)
  {
    params = paramParcel.readBundle(getClass().getClassLoader());
  }
  
  private CameraEffectArguments(Builder paramBuilder)
  {
    params = Builder.access$000(paramBuilder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Nullable
  public Object get(String paramString)
  {
    return params.get(paramString);
  }
  
  @Nullable
  public String getString(String paramString)
  {
    return params.getString(paramString);
  }
  
  @Nullable
  public String[] getStringArray(String paramString)
  {
    return params.getStringArray(paramString);
  }
  
  public Set<String> keySet()
  {
    return params.keySet();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(params);
  }
  
  public static class Builder
    implements ShareModelBuilder<CameraEffectArguments, Builder>
  {
    private Bundle params = new Bundle();
    
    public CameraEffectArguments build()
    {
      return new CameraEffectArguments(this, null);
    }
    
    public Builder putArgument(String paramString1, String paramString2)
    {
      params.putString(paramString1, paramString2);
      return this;
    }
    
    public Builder putArgument(String paramString, String[] paramArrayOfString)
    {
      params.putStringArray(paramString, paramArrayOfString);
      return this;
    }
    
    public Builder readFrom(Parcel paramParcel)
    {
      return readFrom((CameraEffectArguments)paramParcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
    }
    
    public Builder readFrom(CameraEffectArguments paramCameraEffectArguments)
    {
      if (paramCameraEffectArguments != null) {
        params.putAll(CameraEffectArguments.access$100(paramCameraEffectArguments));
      }
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.CameraEffectArguments
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */