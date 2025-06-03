package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

@Deprecated
public final class ShareMessengerGenericTemplateElement
  implements ShareModel
{
  public static final Parcelable.Creator<ShareMessengerGenericTemplateElement> CREATOR = new Parcelable.Creator()
  {
    public ShareMessengerGenericTemplateElement createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ShareMessengerGenericTemplateElement(paramAnonymousParcel);
    }
    
    public ShareMessengerGenericTemplateElement[] newArray(int paramAnonymousInt)
    {
      return new ShareMessengerGenericTemplateElement[paramAnonymousInt];
    }
  };
  private final ShareMessengerActionButton button;
  private final ShareMessengerActionButton defaultAction;
  private final Uri imageUrl;
  private final String subtitle;
  private final String title;
  
  public ShareMessengerGenericTemplateElement(Parcel paramParcel)
  {
    title = paramParcel.readString();
    subtitle = paramParcel.readString();
    imageUrl = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
    defaultAction = ((ShareMessengerActionButton)paramParcel.readParcelable(ShareMessengerActionButton.class.getClassLoader()));
    button = ((ShareMessengerActionButton)paramParcel.readParcelable(ShareMessengerActionButton.class.getClassLoader()));
  }
  
  private ShareMessengerGenericTemplateElement(Builder paramBuilder)
  {
    title = Builder.access$000(paramBuilder);
    subtitle = Builder.access$100(paramBuilder);
    imageUrl = Builder.access$200(paramBuilder);
    defaultAction = Builder.access$300(paramBuilder);
    button = Builder.access$400(paramBuilder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public ShareMessengerActionButton getButton()
  {
    return button;
  }
  
  public ShareMessengerActionButton getDefaultAction()
  {
    return defaultAction;
  }
  
  public Uri getImageUrl()
  {
    return imageUrl;
  }
  
  public String getSubtitle()
  {
    return subtitle;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(title);
    paramParcel.writeString(subtitle);
    paramParcel.writeParcelable(imageUrl, paramInt);
    paramParcel.writeParcelable(defaultAction, paramInt);
    paramParcel.writeParcelable(button, paramInt);
  }
  
  public static class Builder
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
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMessengerGenericTemplateElement
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */