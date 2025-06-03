package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import androidx.annotation.Nullable;

public final class ShareLinkContent
  extends ShareContent<ShareLinkContent, Builder>
{
  public static final Parcelable.Creator<ShareLinkContent> CREATOR = new Parcelable.Creator()
  {
    public ShareLinkContent createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ShareLinkContent(paramAnonymousParcel);
    }
    
    public ShareLinkContent[] newArray(int paramAnonymousInt)
    {
      return new ShareLinkContent[paramAnonymousInt];
    }
  };
  @Deprecated
  private final String contentDescription;
  @Deprecated
  private final String contentTitle;
  @Deprecated
  private final Uri imageUrl;
  private final String quote;
  
  public ShareLinkContent(Parcel paramParcel)
  {
    super(paramParcel);
    contentDescription = paramParcel.readString();
    contentTitle = paramParcel.readString();
    imageUrl = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
    quote = paramParcel.readString();
  }
  
  private ShareLinkContent(Builder paramBuilder)
  {
    super(paramBuilder);
    contentDescription = Builder.access$000(paramBuilder);
    contentTitle = Builder.access$100(paramBuilder);
    imageUrl = Builder.access$200(paramBuilder);
    quote = Builder.access$300(paramBuilder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Deprecated
  public String getContentDescription()
  {
    return contentDescription;
  }
  
  @Deprecated
  @Nullable
  public String getContentTitle()
  {
    return contentTitle;
  }
  
  @Deprecated
  @Nullable
  public Uri getImageUrl()
  {
    return imageUrl;
  }
  
  @Nullable
  public String getQuote()
  {
    return quote;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(contentDescription);
    paramParcel.writeString(contentTitle);
    paramParcel.writeParcelable(imageUrl, 0);
    paramParcel.writeString(quote);
  }
  
  public static final class Builder
    extends ShareContent.Builder<ShareLinkContent, Builder>
  {
    public static final String TAG = "Builder";
    @Deprecated
    private String contentDescription;
    @Deprecated
    private String contentTitle;
    @Deprecated
    private Uri imageUrl;
    private String quote;
    
    public ShareLinkContent build()
    {
      return new ShareLinkContent(this, null);
    }
    
    public Builder readFrom(ShareLinkContent paramShareLinkContent)
    {
      if (paramShareLinkContent == null) {
        return this;
      }
      return ((Builder)super.readFrom(paramShareLinkContent)).setContentDescription(paramShareLinkContent.getContentDescription()).setImageUrl(paramShareLinkContent.getImageUrl()).setContentTitle(paramShareLinkContent.getContentTitle()).setQuote(paramShareLinkContent.getQuote());
    }
    
    @Deprecated
    public Builder setContentDescription(@Nullable String paramString)
    {
      Log.w(TAG, "This method does nothing. ContentDescription is deprecated in Graph API 2.9.");
      return this;
    }
    
    @Deprecated
    public Builder setContentTitle(@Nullable String paramString)
    {
      Log.w(TAG, "This method does nothing. ContentTitle is deprecated in Graph API 2.9.");
      return this;
    }
    
    @Deprecated
    public Builder setImageUrl(@Nullable Uri paramUri)
    {
      Log.w(TAG, "This method does nothing. ImageUrl is deprecated in Graph API 2.9.");
      return this;
    }
    
    public Builder setQuote(@Nullable String paramString)
    {
      quote = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareLinkContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */