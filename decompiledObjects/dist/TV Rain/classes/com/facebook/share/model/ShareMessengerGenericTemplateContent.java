package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@Deprecated
public final class ShareMessengerGenericTemplateContent
  extends ShareContent<ShareMessengerGenericTemplateContent, Builder>
{
  public static final Parcelable.Creator<ShareMessengerGenericTemplateContent> CREATOR = new Parcelable.Creator()
  {
    public ShareMessengerGenericTemplateContent createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ShareMessengerGenericTemplateContent(paramAnonymousParcel);
    }
    
    public ShareMessengerGenericTemplateContent[] newArray(int paramAnonymousInt)
    {
      return new ShareMessengerGenericTemplateContent[paramAnonymousInt];
    }
  };
  private final ShareMessengerGenericTemplateElement genericTemplateElement;
  private final ImageAspectRatio imageAspectRatio;
  private final boolean isSharable;
  
  public ShareMessengerGenericTemplateContent(Parcel paramParcel)
  {
    super(paramParcel);
    boolean bool;
    if (paramParcel.readByte() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    isSharable = bool;
    imageAspectRatio = ((ImageAspectRatio)paramParcel.readSerializable());
    genericTemplateElement = ((ShareMessengerGenericTemplateElement)paramParcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader()));
  }
  
  public ShareMessengerGenericTemplateContent(Builder paramBuilder)
  {
    super(paramBuilder);
    isSharable = Builder.access$000(paramBuilder);
    imageAspectRatio = Builder.access$100(paramBuilder);
    genericTemplateElement = Builder.access$200(paramBuilder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public ShareMessengerGenericTemplateElement getGenericTemplateElement()
  {
    return genericTemplateElement;
  }
  
  public ImageAspectRatio getImageAspectRatio()
  {
    return imageAspectRatio;
  }
  
  public boolean getIsSharable()
  {
    return isSharable;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeByte((byte)isSharable);
    paramParcel.writeSerializable(imageAspectRatio);
    paramParcel.writeParcelable(genericTemplateElement, paramInt);
  }
  
  public static class Builder
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
  
  public static enum ImageAspectRatio
  {
    static
    {
      ImageAspectRatio localImageAspectRatio1 = new ImageAspectRatio("HORIZONTAL", 0);
      HORIZONTAL = localImageAspectRatio1;
      ImageAspectRatio localImageAspectRatio2 = new ImageAspectRatio("SQUARE", 1);
      SQUARE = localImageAspectRatio2;
      $VALUES = new ImageAspectRatio[] { localImageAspectRatio1, localImageAspectRatio2 };
    }
    
    private ImageAspectRatio() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMessengerGenericTemplateContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */