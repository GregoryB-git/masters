package com.facebook.share.model;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;

public class CameraEffectArguments$Builder
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

/* Location:
 * Qualified Name:     com.facebook.share.model.CameraEffectArguments.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */