package com.facebook.share.model;

import android.net.Uri;

public class ShareMessengerOpenGraphMusicTemplateContent$Builder
  extends ShareContent.Builder<ShareMessengerOpenGraphMusicTemplateContent, Builder>
{
  private ShareMessengerActionButton button;
  private Uri url;
  
  public ShareMessengerOpenGraphMusicTemplateContent build()
  {
    return new ShareMessengerOpenGraphMusicTemplateContent(this, null);
  }
  
  public Builder readFrom(ShareMessengerOpenGraphMusicTemplateContent paramShareMessengerOpenGraphMusicTemplateContent)
  {
    if (paramShareMessengerOpenGraphMusicTemplateContent == null) {
      return this;
    }
    return ((Builder)super.readFrom(paramShareMessengerOpenGraphMusicTemplateContent)).setUrl(paramShareMessengerOpenGraphMusicTemplateContent.getUrl()).setButton(paramShareMessengerOpenGraphMusicTemplateContent.getButton());
  }
  
  public Builder setButton(ShareMessengerActionButton paramShareMessengerActionButton)
  {
    button = paramShareMessengerActionButton;
    return this;
  }
  
  public Builder setUrl(Uri paramUri)
  {
    url = paramUri;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */