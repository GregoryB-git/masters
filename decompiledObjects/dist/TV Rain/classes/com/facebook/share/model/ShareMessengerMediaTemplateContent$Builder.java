package com.facebook.share.model;

import android.net.Uri;

public class ShareMessengerMediaTemplateContent$Builder
  extends ShareContent.Builder<ShareMessengerMediaTemplateContent, Builder>
{
  private String attachmentId;
  private ShareMessengerActionButton button;
  private ShareMessengerMediaTemplateContent.MediaType mediaType;
  private Uri mediaUrl;
  
  public ShareMessengerMediaTemplateContent build()
  {
    return new ShareMessengerMediaTemplateContent(this, null);
  }
  
  public Builder readFrom(ShareMessengerMediaTemplateContent paramShareMessengerMediaTemplateContent)
  {
    if (paramShareMessengerMediaTemplateContent == null) {
      return this;
    }
    return ((Builder)super.readFrom(paramShareMessengerMediaTemplateContent)).setMediaType(paramShareMessengerMediaTemplateContent.getMediaType()).setAttachmentId(paramShareMessengerMediaTemplateContent.getAttachmentId()).setMediaUrl(paramShareMessengerMediaTemplateContent.getMediaUrl()).setButton(paramShareMessengerMediaTemplateContent.getButton());
  }
  
  public Builder setAttachmentId(String paramString)
  {
    attachmentId = paramString;
    return this;
  }
  
  public Builder setButton(ShareMessengerActionButton paramShareMessengerActionButton)
  {
    button = paramShareMessengerActionButton;
    return this;
  }
  
  public Builder setMediaType(ShareMessengerMediaTemplateContent.MediaType paramMediaType)
  {
    mediaType = paramMediaType;
    return this;
  }
  
  public Builder setMediaUrl(Uri paramUri)
  {
    mediaUrl = paramUri;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMessengerMediaTemplateContent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */