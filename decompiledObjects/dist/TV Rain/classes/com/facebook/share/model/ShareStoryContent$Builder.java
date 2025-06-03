package com.facebook.share.model;

import java.util.List;

public final class ShareStoryContent$Builder
  extends ShareContent.Builder<ShareStoryContent, Builder>
{
  public static final String TAG = "Builder";
  private String mAttributionLink;
  private ShareMedia mBackgroundAsset;
  private List<String> mBackgroundColorList;
  private SharePhoto mStickerAsset;
  
  public ShareStoryContent build()
  {
    return new ShareStoryContent(this, null);
  }
  
  public Builder readFrom(ShareStoryContent paramShareStoryContent)
  {
    if (paramShareStoryContent == null) {
      return this;
    }
    return ((Builder)super.readFrom(paramShareStoryContent)).setBackgroundAsset(paramShareStoryContent.getBackgroundAsset()).setStickerAsset(paramShareStoryContent.getStickerAsset()).setBackgroundColorList(paramShareStoryContent.getBackgroundColorList()).setAttributionLink(paramShareStoryContent.getAttributionLink());
  }
  
  public Builder setAttributionLink(String paramString)
  {
    mAttributionLink = paramString;
    return this;
  }
  
  public Builder setBackgroundAsset(ShareMedia paramShareMedia)
  {
    mBackgroundAsset = paramShareMedia;
    return this;
  }
  
  public Builder setBackgroundColorList(List<String> paramList)
  {
    mBackgroundColorList = paramList;
    return this;
  }
  
  public Builder setStickerAsset(SharePhoto paramSharePhoto)
  {
    mStickerAsset = paramSharePhoto;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareStoryContent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */