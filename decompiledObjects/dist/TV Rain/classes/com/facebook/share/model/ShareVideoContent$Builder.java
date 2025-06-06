package com.facebook.share.model;

import androidx.annotation.Nullable;

public final class ShareVideoContent$Builder
  extends ShareContent.Builder<ShareVideoContent, Builder>
{
  private String contentDescription;
  private String contentTitle;
  private SharePhoto previewPhoto;
  private ShareVideo video;
  
  public ShareVideoContent build()
  {
    return new ShareVideoContent(this, null);
  }
  
  public Builder readFrom(ShareVideoContent paramShareVideoContent)
  {
    if (paramShareVideoContent == null) {
      return this;
    }
    return ((Builder)super.readFrom(paramShareVideoContent)).setContentDescription(paramShareVideoContent.getContentDescription()).setContentTitle(paramShareVideoContent.getContentTitle()).setPreviewPhoto(paramShareVideoContent.getPreviewPhoto()).setVideo(paramShareVideoContent.getVideo());
  }
  
  public Builder setContentDescription(@Nullable String paramString)
  {
    contentDescription = paramString;
    return this;
  }
  
  public Builder setContentTitle(@Nullable String paramString)
  {
    contentTitle = paramString;
    return this;
  }
  
  public Builder setPreviewPhoto(@Nullable SharePhoto paramSharePhoto)
  {
    if (paramSharePhoto == null) {
      paramSharePhoto = null;
    } else {
      paramSharePhoto = new SharePhoto.Builder().readFrom(paramSharePhoto).build();
    }
    previewPhoto = paramSharePhoto;
    return this;
  }
  
  public Builder setVideo(@Nullable ShareVideo paramShareVideo)
  {
    if (paramShareVideo == null) {
      return this;
    }
    video = new ShareVideo.Builder().readFrom(paramShareVideo).build();
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareVideoContent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */