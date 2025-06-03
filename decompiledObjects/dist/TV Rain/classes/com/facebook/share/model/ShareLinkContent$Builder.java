package com.facebook.share.model;

import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;

public final class ShareLinkContent$Builder
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

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareLinkContent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */