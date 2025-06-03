package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class ShareCameraEffectContent
  extends ShareContent<ShareCameraEffectContent, Builder>
{
  public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new Parcelable.Creator()
  {
    public ShareCameraEffectContent createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ShareCameraEffectContent(paramAnonymousParcel);
    }
    
    public ShareCameraEffectContent[] newArray(int paramAnonymousInt)
    {
      return new ShareCameraEffectContent[paramAnonymousInt];
    }
  };
  private CameraEffectArguments arguments;
  private String effectId;
  private CameraEffectTextures textures;
  
  public ShareCameraEffectContent(Parcel paramParcel)
  {
    super(paramParcel);
    effectId = paramParcel.readString();
    arguments = new CameraEffectArguments.Builder().readFrom(paramParcel).build();
    textures = new CameraEffectTextures.Builder().readFrom(paramParcel).build();
  }
  
  private ShareCameraEffectContent(Builder paramBuilder)
  {
    super(paramBuilder);
    effectId = Builder.access$000(paramBuilder);
    arguments = Builder.access$100(paramBuilder);
    textures = Builder.access$200(paramBuilder);
  }
  
  public CameraEffectArguments getArguments()
  {
    return arguments;
  }
  
  public String getEffectId()
  {
    return effectId;
  }
  
  public CameraEffectTextures getTextures()
  {
    return textures;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(effectId);
    paramParcel.writeParcelable(arguments, 0);
    paramParcel.writeParcelable(textures, 0);
  }
  
  public static final class Builder
    extends ShareContent.Builder<ShareCameraEffectContent, Builder>
  {
    private CameraEffectArguments arguments;
    private String effectId;
    private CameraEffectTextures textures;
    
    public ShareCameraEffectContent build()
    {
      return new ShareCameraEffectContent(this, null);
    }
    
    public Builder readFrom(ShareCameraEffectContent paramShareCameraEffectContent)
    {
      if (paramShareCameraEffectContent == null) {
        return this;
      }
      return ((Builder)super.readFrom(paramShareCameraEffectContent)).setEffectId(effectId).setArguments(arguments);
    }
    
    public Builder setArguments(CameraEffectArguments paramCameraEffectArguments)
    {
      arguments = paramCameraEffectArguments;
      return this;
    }
    
    public Builder setEffectId(String paramString)
    {
      effectId = paramString;
      return this;
    }
    
    public Builder setTextures(CameraEffectTextures paramCameraEffectTextures)
    {
      textures = paramCameraEffectTextures;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareCameraEffectContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */