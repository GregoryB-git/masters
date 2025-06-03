package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;

public final class ShareVideoContent
  extends ShareContent<ShareVideoContent, Builder>
{
  public static final Parcelable.Creator<ShareVideoContent> CREATOR = new Parcelable.Creator()
  {
    public ShareVideoContent createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ShareVideoContent(paramAnonymousParcel);
    }
    
    public ShareVideoContent[] newArray(int paramAnonymousInt)
    {
      return new ShareVideoContent[paramAnonymousInt];
    }
  };
  private final String contentDescription;
  private final String contentTitle;
  private final SharePhoto previewPhoto;
  private final ShareVideo video;
  
  public ShareVideoContent(Parcel paramParcel)
  {
    super(paramParcel);
    contentDescription = paramParcel.readString();
    contentTitle = paramParcel.readString();
    SharePhoto.Builder localBuilder = new SharePhoto.Builder().readFrom(paramParcel);
    if ((localBuilder.getImageUrl() == null) && (localBuilder.getBitmap() == null)) {
      previewPhoto = null;
    } else {
      previewPhoto = localBuilder.build();
    }
    video = new ShareVideo.Builder().readFrom(paramParcel).build();
  }
  
  private ShareVideoContent(Builder paramBuilder)
  {
    super(paramBuilder);
    contentDescription = Builder.access$000(paramBuilder);
    contentTitle = Builder.access$100(paramBuilder);
    previewPhoto = Builder.access$200(paramBuilder);
    video = Builder.access$300(paramBuilder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Nullable
  public String getContentDescription()
  {
    return contentDescription;
  }
  
  @Nullable
  public String getContentTitle()
  {
    return contentTitle;
  }
  
  @Nullable
  public SharePhoto getPreviewPhoto()
  {
    return previewPhoto;
  }
  
  @Nullable
  public ShareVideo getVideo()
  {
    return video;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(contentDescription);
    paramParcel.writeString(contentTitle);
    paramParcel.writeParcelable(previewPhoto, 0);
    paramParcel.writeParcelable(video, 0);
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareVideoContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */