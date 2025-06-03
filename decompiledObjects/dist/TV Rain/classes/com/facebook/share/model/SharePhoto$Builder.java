package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SharePhoto$Builder
  extends ShareMedia.Builder<SharePhoto, Builder>
{
  private Bitmap bitmap;
  private String caption;
  private Uri imageUrl;
  private boolean userGenerated;
  
  public static List<SharePhoto> readPhotoListFrom(Parcel paramParcel)
  {
    Object localObject = ShareMedia.Builder.readListFrom(paramParcel);
    paramParcel = new ArrayList();
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (ShareMedia)localIterator.next();
      if ((localObject instanceof SharePhoto)) {
        paramParcel.add((SharePhoto)localObject);
      }
    }
    return paramParcel;
  }
  
  public static void writePhotoListTo(Parcel paramParcel, int paramInt, List<SharePhoto> paramList)
  {
    ShareMedia[] arrayOfShareMedia = new ShareMedia[paramList.size()];
    for (int i = 0; i < paramList.size(); i++) {
      arrayOfShareMedia[i] = ((ShareMedia)paramList.get(i));
    }
    paramParcel.writeParcelableArray(arrayOfShareMedia, paramInt);
  }
  
  public SharePhoto build()
  {
    return new SharePhoto(this, null);
  }
  
  public Bitmap getBitmap()
  {
    return bitmap;
  }
  
  public Uri getImageUrl()
  {
    return imageUrl;
  }
  
  public Builder readFrom(Parcel paramParcel)
  {
    return readFrom((SharePhoto)paramParcel.readParcelable(SharePhoto.class.getClassLoader()));
  }
  
  public Builder readFrom(SharePhoto paramSharePhoto)
  {
    if (paramSharePhoto == null) {
      return this;
    }
    return ((Builder)super.readFrom(paramSharePhoto)).setBitmap(paramSharePhoto.getBitmap()).setImageUrl(paramSharePhoto.getImageUrl()).setUserGenerated(paramSharePhoto.getUserGenerated()).setCaption(paramSharePhoto.getCaption());
  }
  
  public Builder setBitmap(@Nullable Bitmap paramBitmap)
  {
    bitmap = paramBitmap;
    return this;
  }
  
  public Builder setCaption(@Nullable String paramString)
  {
    caption = paramString;
    return this;
  }
  
  public Builder setImageUrl(@Nullable Uri paramUri)
  {
    imageUrl = paramUri;
    return this;
  }
  
  public Builder setUserGenerated(boolean paramBoolean)
  {
    userGenerated = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.SharePhoto.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */