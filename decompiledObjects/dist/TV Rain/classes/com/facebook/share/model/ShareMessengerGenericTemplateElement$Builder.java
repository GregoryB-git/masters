package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

public class ShareMessengerGenericTemplateElement$Builder
  implements ShareModelBuilder<ShareMessengerGenericTemplateElement, Builder>
{
  private ShareMessengerActionButton button;
  private ShareMessengerActionButton defaultAction;
  private Uri imageUrl;
  private String subtitle;
  private String title;
  
  public ShareMessengerGenericTemplateElement build()
  {
    return new ShareMessengerGenericTemplateElement(this, null);
  }
  
  public Builder readFrom(Parcel paramParcel)
  {
    return readFrom((ShareMessengerGenericTemplateElement)paramParcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader()));
  }
  
  public Builder readFrom(ShareMessengerGenericTemplateElement paramShareMessengerGenericTemplateElement)
  {
    if (paramShareMessengerGenericTemplateElement == null) {
      return this;
    }
    return setTitle(ShareMessengerGenericTemplateElement.access$1000(paramShareMessengerGenericTemplateElement)).setSubtitle(ShareMessengerGenericTemplateElement.access$900(paramShareMessengerGenericTemplateElement)).setImageUrl(ShareMessengerGenericTemplateElement.access$800(paramShareMessengerGenericTemplateElement)).setDefaultAction(ShareMessengerGenericTemplateElement.access$700(paramShareMessengerGenericTemplateElement)).setButton(ShareMessengerGenericTemplateElement.access$600(paramShareMessengerGenericTemplateElement));
  }
  
  public Builder setButton(ShareMessengerActionButton paramShareMessengerActionButton)
  {
    button = paramShareMessengerActionButton;
    return this;
  }
  
  public Builder setDefaultAction(ShareMessengerActionButton paramShareMessengerActionButton)
  {
    defaultAction = paramShareMessengerActionButton;
    return this;
  }
  
  public Builder setImageUrl(Uri paramUri)
  {
    imageUrl = paramUri;
    return this;
  }
  
  public Builder setSubtitle(String paramString)
  {
    subtitle = paramString;
    return this;
  }
  
  public Builder setTitle(String paramString)
  {
    title = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMessengerGenericTemplateElement.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */