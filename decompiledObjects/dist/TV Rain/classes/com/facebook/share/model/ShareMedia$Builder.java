package com.facebook.share.model;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public abstract class ShareMedia$Builder<M extends ShareMedia, B extends Builder>
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

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMedia.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */