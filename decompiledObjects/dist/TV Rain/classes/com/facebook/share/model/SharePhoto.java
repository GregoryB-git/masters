package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SharePhoto
  extends ShareMedia
{
  public static final Parcelable.Creator<SharePhoto> CREATOR = new Parcelable.Creator()
  {
    public SharePhoto createFromParcel(Parcel paramAnonymousParcel)
    {
      return new SharePhoto(paramAnonymousParcel);
    }
    
    public SharePhoto[] newArray(int paramAnonymousInt)
    {
      return new SharePhoto[paramAnonymousInt];
    }
  };
  private final Bitmap bitmap;
  private final String caption;
  private final Uri imageUrl;
  private final boolean userGenerated;
  
  public SharePhoto(Parcel paramParcel)
  {
    super(paramParcel);
    bitmap = ((Bitmap)paramParcel.readParcelable(Bitmap.class.getClassLoader()));
    imageUrl = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
    boolean bool;
    if (paramParcel.readByte() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    userGenerated = bool;
    caption = paramParcel.readString();
  }
  
  private SharePhoto(Builder paramBuilder)
  {
    super(paramBuilder);
    bitmap = Builder.access$000(paramBuilder);
    imageUrl = Builder.access$100(paramBuilder);
    userGenerated = Builder.access$200(paramBuilder);
    caption = Builder.access$300(paramBuilder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Nullable
  public Bitmap getBitmap()
  {
    return bitmap;
  }
  
  public String getCaption()
  {
    return caption;
  }
  
  @Nullable
  public Uri getImageUrl()
  {
    return imageUrl;
  }
  
  public ShareMedia.Type getMediaType()
  {
    return ShareMedia.Type.PHOTO;
  }
  
  public boolean getUserGenerated()
  {
    return userGenerated;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(bitmap, 0);
    paramParcel.writeParcelable(imageUrl, 0);
    paramParcel.writeByte((byte)userGenerated);
    paramParcel.writeString(caption);
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     com.facebook.share.model.SharePhoto
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */