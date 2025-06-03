package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import z2;

public final class UrlLinkFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new Parcelable.Creator()
  {
    public UrlLinkFrame createFromParcel(Parcel paramAnonymousParcel)
    {
      return new UrlLinkFrame(paramAnonymousParcel);
    }
    
    public UrlLinkFrame[] newArray(int paramAnonymousInt)
    {
      return new UrlLinkFrame[paramAnonymousInt];
    }
  };
  @Nullable
  public final String description;
  public final String url;
  
  public UrlLinkFrame(Parcel paramParcel)
  {
    super((String)Util.castNonNull(paramParcel.readString()));
    description = paramParcel.readString();
    url = ((String)Util.castNonNull(paramParcel.readString()));
  }
  
  public UrlLinkFrame(String paramString1, @Nullable String paramString2, String paramString3)
  {
    super(paramString1);
    description = paramString2;
    url = paramString3;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (UrlLinkFrame.class == paramObject.getClass()))
    {
      paramObject = (UrlLinkFrame)paramObject;
      if ((!id.equals(id)) || (!Util.areEqual(description, description)) || (!Util.areEqual(url, url))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = z2.c(id, 527, 31);
    String str = description;
    int j = 0;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = url;
    if (str != null) {
      j = str.hashCode();
    }
    return (i + k) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(id);
    localStringBuilder.append(": url=");
    localStringBuilder.append(url);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(id);
    paramParcel.writeString(description);
    paramParcel.writeString(url);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.UrlLinkFrame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */