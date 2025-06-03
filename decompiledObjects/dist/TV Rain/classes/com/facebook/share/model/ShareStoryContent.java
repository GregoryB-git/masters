package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ShareStoryContent
  extends ShareContent<ShareStoryContent, Builder>
{
  public static final Parcelable.Creator<ShareStoryContent> CREATOR = new Parcelable.Creator()
  {
    public ShareStoryContent createFromParcel(Parcel paramAnonymousParcel)
    {
      return new ShareStoryContent(paramAnonymousParcel);
    }
    
    public ShareStoryContent[] newArray(int paramAnonymousInt)
    {
      return new ShareStoryContent[paramAnonymousInt];
    }
  };
  private final String mAttributionLink;
  private final ShareMedia mBackgroundAsset;
  @Nullable
  private final List<String> mBackgroundColorList;
  private final SharePhoto mStickerAsset;
  
  public ShareStoryContent(Parcel paramParcel)
  {
    super(paramParcel);
    mBackgroundAsset = ((ShareMedia)paramParcel.readParcelable(ShareMedia.class.getClassLoader()));
    mStickerAsset = ((SharePhoto)paramParcel.readParcelable(SharePhoto.class.getClassLoader()));
    mBackgroundColorList = readUnmodifiableStringList(paramParcel);
    mAttributionLink = paramParcel.readString();
  }
  
  private ShareStoryContent(Builder paramBuilder)
  {
    super(paramBuilder);
    mBackgroundAsset = Builder.access$000(paramBuilder);
    mStickerAsset = Builder.access$100(paramBuilder);
    mBackgroundColorList = Builder.access$200(paramBuilder);
    mAttributionLink = Builder.access$300(paramBuilder);
  }
  
  @Nullable
  private List<String> readUnmodifiableStringList(Parcel paramParcel)
  {
    ArrayList localArrayList = new ArrayList();
    paramParcel.readStringList(localArrayList);
    if (localArrayList.isEmpty()) {
      paramParcel = null;
    } else {
      paramParcel = Collections.unmodifiableList(localArrayList);
    }
    return paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getAttributionLink()
  {
    return mAttributionLink;
  }
  
  public ShareMedia getBackgroundAsset()
  {
    return mBackgroundAsset;
  }
  
  @Nullable
  public List<String> getBackgroundColorList()
  {
    List localList = mBackgroundColorList;
    if (localList == null) {
      localList = null;
    } else {
      localList = Collections.unmodifiableList(localList);
    }
    return localList;
  }
  
  public SharePhoto getStickerAsset()
  {
    return mStickerAsset;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(mBackgroundAsset, 0);
    paramParcel.writeParcelable(mStickerAsset, 0);
    paramParcel.writeStringList(mBackgroundColorList);
    paramParcel.writeString(mAttributionLink);
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareStoryContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */