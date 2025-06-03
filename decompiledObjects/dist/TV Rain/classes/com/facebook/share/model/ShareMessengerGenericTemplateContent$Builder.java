package com.facebook.share.model;

public class ShareMessengerGenericTemplateContent$Builder
  extends ShareContent.Builder<ShareMessengerGenericTemplateContent, Builder>
{
  private ShareMessengerGenericTemplateElement genericTemplateElement;
  private ShareMessengerGenericTemplateContent.ImageAspectRatio imageAspectRatio;
  private boolean isSharable;
  
  public ShareMessengerGenericTemplateContent build()
  {
    return new ShareMessengerGenericTemplateContent(this);
  }
  
  public Builder readFrom(ShareMessengerGenericTemplateContent paramShareMessengerGenericTemplateContent)
  {
    if (paramShareMessengerGenericTemplateContent == null) {
      return this;
    }
    return ((Builder)super.readFrom(paramShareMessengerGenericTemplateContent)).setIsSharable(paramShareMessengerGenericTemplateContent.getIsSharable()).setImageAspectRatio(paramShareMessengerGenericTemplateContent.getImageAspectRatio()).setGenericTemplateElement(paramShareMessengerGenericTemplateContent.getGenericTemplateElement());
  }
  
  public Builder setGenericTemplateElement(ShareMessengerGenericTemplateElement paramShareMessengerGenericTemplateElement)
  {
    genericTemplateElement = paramShareMessengerGenericTemplateElement;
    return this;
  }
  
  public Builder setImageAspectRatio(ShareMessengerGenericTemplateContent.ImageAspectRatio paramImageAspectRatio)
  {
    imageAspectRatio = paramImageAspectRatio;
    return this;
  }
  
  public Builder setIsSharable(boolean paramBoolean)
  {
    isSharable = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMessengerGenericTemplateContent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */