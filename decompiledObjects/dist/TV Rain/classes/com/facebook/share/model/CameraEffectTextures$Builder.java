package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.Utility;

public class CameraEffectTextures$Builder
  implements ShareModelBuilder<CameraEffectTextures, Builder>
{
  private Bundle textures = new Bundle();
  
  private Builder putParcelableTexture(String paramString, Parcelable paramParcelable)
  {
    if ((!Utility.isNullOrEmpty(paramString)) && (paramParcelable != null)) {
      textures.putParcelable(paramString, paramParcelable);
    }
    return this;
  }
  
  public CameraEffectTextures build()
  {
    return new CameraEffectTextures(this, null);
  }
  
  public Builder putTexture(String paramString, Bitmap paramBitmap)
  {
    return putParcelableTexture(paramString, paramBitmap);
  }
  
  public Builder putTexture(String paramString, Uri paramUri)
  {
    return putParcelableTexture(paramString, paramUri);
  }
  
  public Builder readFrom(Parcel paramParcel)
  {
    return readFrom((CameraEffectTextures)paramParcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
  }
  
  public Builder readFrom(CameraEffectTextures paramCameraEffectTextures)
  {
    if (paramCameraEffectTextures != null) {
      textures.putAll(CameraEffectTextures.access$100(paramCameraEffectTextures));
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.CameraEffectTextures.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */