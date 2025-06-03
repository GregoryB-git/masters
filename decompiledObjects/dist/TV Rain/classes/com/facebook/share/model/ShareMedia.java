package com.facebook.share.model;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public abstract class ShareMedia
  implements ShareModel
{
  private final Bundle params;
  
  public ShareMedia(Parcel paramParcel)
  {
    params = paramParcel.readBundle();
  }
  
  public ShareMedia(Builder paramBuilder)
  {
    params = new Bundle(Builder.access$000(paramBuilder));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public abstract Type getMediaType();
  
  @Deprecated
  public Bundle getParameters()
  {
    return new Bundle(params);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(params);
  }
  
  public static abstract class Builder<M extends ShareMedia, B extends Builder>
    implements ShareModelBuilder<M, B>
  {
    private Bundle params = new Bundle();
    
    public static List<ShareMedia> readListFrom(Parcel paramParcel)
    {
      Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(ShareMedia.class.getClassLoader());
      paramParcel = new ArrayList(arrayOfParcelable.length);
      int i = arrayOfParcelable.length;
      for (int j = 0; j < i; j++) {
        paramParcel.add((ShareMedia)arrayOfParcelable[j]);
      }
      return paramParcel;
    }
    
    public static void writeListTo(Parcel paramParcel, int paramInt, List<ShareMedia> paramList)
    {
      paramParcel.writeParcelableArray((ShareMedia[])paramList.toArray(), paramInt);
    }
    
    public B readFrom(M paramM)
    {
      if (paramM == null) {
        return this;
      }
      return setParameters(paramM.getParameters());
    }
    
    @Deprecated
    public B setParameter(String paramString1, String paramString2)
    {
      params.putString(paramString1, paramString2);
      return this;
    }
    
    @Deprecated
    public B setParameters(Bundle paramBundle)
    {
      params.putAll(paramBundle);
      return this;
    }
  }
  
  public static enum Type
  {
    static
    {
      Type localType1 = new Type("PHOTO", 0);
      PHOTO = localType1;
      Type localType2 = new Type("VIDEO", 1);
      VIDEO = localType2;
      $VALUES = new Type[] { localType1, localType2 };
    }
    
    private Type() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMedia
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */