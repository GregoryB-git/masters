package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.facebook.internal.Utility;
import java.util.Set;

public class CameraEffectTextures
  implements ShareModel
{
  public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new Parcelable.Creator()
  {
    public CameraEffectTextures createFromParcel(Parcel paramAnonymousParcel)
    {
      return new CameraEffectTextures(paramAnonymousParcel);
    }
    
    public CameraEffectTextures[] newArray(int paramAnonymousInt)
    {
      return new CameraEffectTextures[paramAnonymousInt];
    }
  };
  private final Bundle textures;
  
  public CameraEffectTextures(Parcel paramParcel)
  {
    textures = paramParcel.readBundle(getClass().getClassLoader());
  }
  
  private CameraEffectTextures(Builder paramBuilder)
  {
    textures = Builder.access$000(paramBuilder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Nullable
  public Object get(String paramString)
  {
    return textures.get(paramString);
  }
  
  @Nullable
  public Bitmap getTextureBitmap(String paramString)
  {
    paramString = textures.get(paramString);
    if ((paramString instanceof Bitmap)) {
      return (Bitmap)paramString;
    }
    return null;
  }
  
  @Nullable
  public Uri getTextureUri(String paramString)
  {
    paramString = textures.get(paramString);
    if ((paramString instanceof Uri)) {
      return (Uri)paramString;
    }
    return null;
  }
  
  public Set<String> keySet()
  {
    return textures.keySet();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(textures);
  }
  
  public static class Builder
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
}

/* Location:
 * Qualified Name:     com.facebook.share.model.CameraEffectTextures
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */