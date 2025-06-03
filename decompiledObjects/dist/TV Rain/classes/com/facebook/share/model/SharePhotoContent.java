package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class SharePhotoContent
  extends ShareContent<SharePhotoContent, Builder>
{
  public static final Parcelable.Creator<SharePhotoContent> CREATOR = new Parcelable.Creator()
  {
    public SharePhotoContent createFromParcel(Parcel paramAnonymousParcel)
    {
      return new SharePhotoContent(paramAnonymousParcel);
    }
    
    public SharePhotoContent[] newArray(int paramAnonymousInt)
    {
      return new SharePhotoContent[paramAnonymousInt];
    }
  };
  private final List<SharePhoto> photos;
  
  public SharePhotoContent(Parcel paramParcel)
  {
    super(paramParcel);
    photos = Collections.unmodifiableList(SharePhoto.Builder.readPhotoListFrom(paramParcel));
  }
  
  private SharePhotoContent(Builder paramBuilder)
  {
    super(paramBuilder);
    photos = Collections.unmodifiableList(Builder.access$000(paramBuilder));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Nullable
  public List<SharePhoto> getPhotos()
  {
    return photos;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    SharePhoto.Builder.writePhotoListTo(paramParcel, paramInt, photos);
  }
  
  public static class Builder
    extends ShareContent.Builder<SharePhotoContent, Builder>
  {
    private final List<SharePhoto> photos = new ArrayList();
    
    public Builder addPhoto(@Nullable SharePhoto paramSharePhoto)
    {
      if (paramSharePhoto != null) {
        photos.add(new SharePhoto.Builder().readFrom(paramSharePhoto).build());
      }
      return this;
    }
    
    public Builder addPhotos(@Nullable List<SharePhoto> paramList)
    {
      if (paramList != null)
      {
        paramList = paramList.iterator();
        while (paramList.hasNext()) {
          addPhoto((SharePhoto)paramList.next());
        }
      }
      return this;
    }
    
    public SharePhotoContent build()
    {
      return new SharePhotoContent(this, null);
    }
    
    public Builder readFrom(SharePhotoContent paramSharePhotoContent)
    {
      if (paramSharePhotoContent == null) {
        return this;
      }
      return ((Builder)super.readFrom(paramSharePhotoContent)).addPhotos(paramSharePhotoContent.getPhotos());
    }
    
    public Builder setPhotos(@Nullable List<SharePhoto> paramList)
    {
      photos.clear();
      addPhotos(paramList);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.SharePhotoContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */