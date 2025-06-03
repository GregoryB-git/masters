package com.facebook.share.model;

import android.net.Uri;
import androidx.annotation.Nullable;

public final class ShareMessengerURLActionButton$Builder
  extends ShareMessengerActionButton.Builder<ShareMessengerURLActionButton, Builder>
{
  private Uri fallbackUrl;
  private boolean isMessengerExtensionURL;
  private boolean shouldHideWebviewShareButton;
  private Uri url;
  private ShareMessengerURLActionButton.WebviewHeightRatio webviewHeightRatio;
  
  public ShareMessengerURLActionButton build()
  {
    return new ShareMessengerURLActionButton(this, null);
  }
  
  public Builder readFrom(ShareMessengerURLActionButton paramShareMessengerURLActionButton)
  {
    if (paramShareMessengerURLActionButton == null) {
      return this;
    }
    return setUrl(paramShareMessengerURLActionButton.getUrl()).setIsMessengerExtensionURL(paramShareMessengerURLActionButton.getIsMessengerExtensionURL()).setFallbackUrl(paramShareMessengerURLActionButton.getFallbackUrl()).setWebviewHeightRatio(paramShareMessengerURLActionButton.getWebviewHeightRatio()).setShouldHideWebviewShareButton(paramShareMessengerURLActionButton.getShouldHideWebviewShareButton());
  }
  
  public Builder setFallbackUrl(@Nullable Uri paramUri)
  {
    fallbackUrl = paramUri;
    return this;
  }
  
  public Builder setIsMessengerExtensionURL(boolean paramBoolean)
  {
    isMessengerExtensionURL = paramBoolean;
    return this;
  }
  
  public Builder setShouldHideWebviewShareButton(boolean paramBoolean)
  {
    shouldHideWebviewShareButton = paramBoolean;
    return this;
  }
  
  public Builder setUrl(@Nullable Uri paramUri)
  {
    url = paramUri;
    return this;
  }
  
  public Builder setWebviewHeightRatio(ShareMessengerURLActionButton.WebviewHeightRatio paramWebviewHeightRatio)
  {
    webviewHeightRatio = paramWebviewHeightRatio;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMessengerURLActionButton.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */