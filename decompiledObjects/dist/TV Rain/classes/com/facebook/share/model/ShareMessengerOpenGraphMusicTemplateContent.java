package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

@Deprecated
public final class ShareMessengerOpenGraphMusicTemplateContent
  extends ShareContent<ShareMessengerOpenGraphMusicTemplateContent, Builder>
{
  public static final Parcelable.Creator<ShareMessengerOpenGraphMusicTemplateContent> CREATOR = new Parcelable.Creator()
  {
    public ShareMessengerOpenGraphMusicTemplateContent createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ShareMessengerOpenGraphMusicTemplateContent(paramAnonymousParcel);
    }
    
    public ShareMessengerOpenGraphMusicTemplateContent[] newArray(int paramAnonymousInt)
    {
      return new ShareMessengerOpenGraphMusicTemplateContent[paramAnonymousInt];
    }
  };
  private final ShareMessengerActionButton button;
  private final Uri url;
  
  public ShareMessengerOpenGraphMusicTemplateContent(Parcel paramParcel)
  {
    super(paramParcel);
    url = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
    button = ((ShareMessengerActionButton)paramParcel.readParcelable(ShareMessengerActionButton.class.getClassLoader()));
  }
  
  private ShareMessengerOpenGraphMusicTemplateContent(Builder paramBuilder)
  {
    super(paramBuilder);
    url = Builder.access$000(paramBuilder);
    button = Builder.access$100(paramBuilder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public ShareMessengerActionButton getButton()
  {
    return button;
  }
  
  public Uri getUrl()
  {
    return url;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(url, paramInt);
    paramParcel.writeParcelable(button, paramInt);
  }
  
  public static class Builder
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
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */