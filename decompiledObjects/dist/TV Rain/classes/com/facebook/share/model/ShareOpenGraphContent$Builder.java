package com.facebook.share.model;

import androidx.annotation.Nullable;

public final class ShareOpenGraphContent$Builder
  extends ShareContent.Builder<ShareOpenGraphContent, Builder>
{
  private ShareOpenGraphAction action;
  private String previewPropertyName;
  
  public ShareOpenGraphContent build()
  {
    return new ShareOpenGraphContent(this, null);
  }
  
  public Builder readFrom(ShareOpenGraphContent paramShareOpenGraphContent)
  {
    if (paramShareOpenGraphContent == null) {
      return this;
    }
    return ((Builder)super.readFrom(paramShareOpenGraphContent)).setAction(paramShareOpenGraphContent.getAction()).setPreviewPropertyName(paramShareOpenGraphContent.getPreviewPropertyName());
  }
  
  public Builder setAction(@Nullable ShareOpenGraphAction paramShareOpenGraphAction)
  {
    if (paramShareOpenGraphAction == null) {
      paramShareOpenGraphAction = null;
    } else {
      paramShareOpenGraphAction = new ShareOpenGraphAction.Builder().readFrom(paramShareOpenGraphAction).build();
    }
    action = paramShareOpenGraphAction;
    return this;
  }
  
  public Builder setPreviewPropertyName(@Nullable String paramString)
  {
    previewPropertyName = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareOpenGraphContent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */