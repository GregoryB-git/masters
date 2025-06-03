package com.facebook.share.model;

public final class ShareCameraEffectContent$Builder
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

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareCameraEffectContent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */