package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;

@Deprecated
public final class ShareMessengerURLActionButton
  extends ShareMessengerActionButton
{
  public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new Parcelable.Creator()
  {
    public ShareMessengerURLActionButton createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ShareMessengerURLActionButton(paramAnonymousParcel);
    }
    
    public ShareMessengerURLActionButton[] newArray(int paramAnonymousInt)
    {
      return new ShareMessengerURLActionButton[paramAnonymousInt];
    }
  };
  private final Uri fallbackUrl;
  private final boolean isMessengerExtensionURL;
  private final boolean shouldHideWebviewShareButton;
  private final Uri url;
  private final WebviewHeightRatio webviewHeightRatio;
  
  public ShareMessengerURLActionButton(Parcel paramParcel)
  {
    super(paramParcel);
    url = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
    int i = paramParcel.readByte();
    boolean bool1 = true;
    boolean bool2;
    if (i != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    isMessengerExtensionURL = bool2;
    fallbackUrl = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
    webviewHeightRatio = ((WebviewHeightRatio)paramParcel.readSerializable());
    if (paramParcel.readByte() != 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    shouldHideWebviewShareButton = bool2;
  }
  
  private ShareMessengerURLActionButton(Builder paramBuilder)
  {
    super(paramBuilder);
    url = Builder.access$000(paramBuilder);
    isMessengerExtensionURL = Builder.access$100(paramBuilder);
    fallbackUrl = Builder.access$200(paramBuilder);
    webviewHeightRatio = Builder.access$300(paramBuilder);
    shouldHideWebviewShareButton = Builder.access$400(paramBuilder);
  }
  
  @Nullable
  public Uri getFallbackUrl()
  {
    return fallbackUrl;
  }
  
  public boolean getIsMessengerExtensionURL()
  {
    return isMessengerExtensionURL;
  }
  
  public boolean getShouldHideWebviewShareButton()
  {
    return shouldHideWebviewShareButton;
  }
  
  public Uri getUrl()
  {
    return url;
  }
  
  @Nullable
  public WebviewHeightRatio getWebviewHeightRatio()
  {
    return webviewHeightRatio;
  }
  
  public static final class Builder
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
  
  public static enum WebviewHeightRatio
  {
    static
    {
      WebviewHeightRatio localWebviewHeightRatio1 = new WebviewHeightRatio("WebviewHeightRatioFull", 0);
      WebviewHeightRatioFull = localWebviewHeightRatio1;
      WebviewHeightRatio localWebviewHeightRatio2 = new WebviewHeightRatio("WebviewHeightRatioTall", 1);
      WebviewHeightRatioTall = localWebviewHeightRatio2;
      WebviewHeightRatio localWebviewHeightRatio3 = new WebviewHeightRatio("WebviewHeightRatioCompact", 2);
      WebviewHeightRatioCompact = localWebviewHeightRatio3;
      $VALUES = new WebviewHeightRatio[] { localWebviewHeightRatio1, localWebviewHeightRatio2, localWebviewHeightRatio3 };
    }
    
    private WebviewHeightRatio() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMessengerURLActionButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */