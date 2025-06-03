package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;

public final class InternalFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<InternalFrame> CREATOR = new Parcelable.Creator()
  {
    public InternalFrame createFromParcel(Parcel paramAnonymousParcel)
    {
      return new InternalFrame(paramAnonymousParcel);
    }
    
    public InternalFrame[] newArray(int paramAnonymousInt)
    {
      return new InternalFrame[paramAnonymousInt];
    }
  };
  public static final String ID = "----";
  public final String description;
  public final String domain;
  public final String text;
  
  public InternalFrame(Parcel paramParcel)
  {
    super("----");
    domain = ((String)Util.castNonNull(paramParcel.readString()));
    description = ((String)Util.castNonNull(paramParcel.readString()));
    text = ((String)Util.castNonNull(paramParcel.readString()));
  }
  
  public InternalFrame(String paramString1, String paramString2, String paramString3)
  {
    super("----");
    domain = paramString1;
    description = paramString2;
    text = paramString3;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (InternalFrame.class == paramObject.getClass()))
    {
      paramObject = (InternalFrame)paramObject;
      if ((!Util.areEqual(description, description)) || (!Util.areEqual(domain, domain)) || (!Util.areEqual(text, text))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    String str = domain;
    int i = 0;
    int j;
    if (str != null) {
      j = str.hashCode();
    } else {
      j = 0;
    }
    str = description;
    int k;
    if (str != null) {
      k = str.hashCode();
    } else {
      k = 0;
    }
    str = text;
    if (str != null) {
      i = str.hashCode();
    }
    return ((527 + j) * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(id);
    localStringBuilder.append(": domain=");
    localStringBuilder.append(domain);
    localStringBuilder.append(", description=");
    localStringBuilder.append(description);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(id);
    paramParcel.writeString(domain);
    paramParcel.writeString(text);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.InternalFrame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */