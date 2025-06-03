package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

@Deprecated
public final class ShareMessengerMediaTemplateContent
  extends ShareContent<ShareMessengerMediaTemplateContent, Builder>
{
  public static final Parcelable.Creator<ShareMessengerMediaTemplateContent> CREATOR = new Parcelable.Creator()
  {
    public ShareMessengerMediaTemplateContent createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ShareMessengerMediaTemplateContent(paramAnonymousParcel);
    }
    
    public ShareMessengerMediaTemplateContent[] newArray(int paramAnonymousInt)
    {
      return new ShareMessengerMediaTemplateContent[paramAnonymousInt];
    }
  };
  private final String attachmentId;
  private final ShareMessengerActionButton button;
  private final MediaType mediaType;
  private final Uri mediaUrl;
  
  public ShareMessengerMediaTemplateContent(Parcel paramParcel)
  {
    super(paramParcel);
    mediaType = ((MediaType)paramParcel.readSerializable());
    attachmentId = paramParcel.readString();
    mediaUrl = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
    button = ((ShareMessengerActionButton)paramParcel.readParcelable(ShareMessengerActionButton.class.getClassLoader()));
  }
  
  private ShareMessengerMediaTemplateContent(Builder paramBuilder)
  {
    super(paramBuilder);
    mediaType = Builder.access$000(paramBuilder);
    attachmentId = Builder.access$100(paramBuilder);
    mediaUrl = Builder.access$200(paramBuilder);
    button = Builder.access$300(paramBuilder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAttachmentId()
  {
    return attachmentId;
  }
  
  public ShareMessengerActionButton getButton()
  {
    return button;
  }
  
  public MediaType getMediaType()
  {
    return mediaType;
  }
  
  public Uri getMediaUrl()
  {
    return mediaUrl;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeSerializable(mediaType);
    paramParcel.writeString(attachmentId);
    paramParcel.writeParcelable(mediaUrl, paramInt);
    paramParcel.writeParcelable(button, paramInt);
  }
  
  public static class Builder
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
  
  public static enum MediaType
  {
    static
    {
      MediaType localMediaType1 = new MediaType("IMAGE", 0);
      IMAGE = localMediaType1;
      MediaType localMediaType2 = new MediaType("VIDEO", 1);
      VIDEO = localMediaType2;
      $VALUES = new MediaType[] { localMediaType1, localMediaType2 };
    }
    
    private MediaType() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMessengerMediaTemplateContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */