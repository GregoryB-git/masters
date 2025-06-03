package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import z2;

public final class TextInformationFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Parcelable.Creator()
  {
    public TextInformationFrame createFromParcel(Parcel paramAnonymousParcel)
    {
      return new TextInformationFrame(paramAnonymousParcel);
    }
    
    public TextInformationFrame[] newArray(int paramAnonymousInt)
    {
      return new TextInformationFrame[paramAnonymousInt];
    }
  };
  @Nullable
  public final String description;
  public final String value;
  
  public TextInformationFrame(Parcel paramParcel)
  {
    super((String)Util.castNonNull(paramParcel.readString()));
    description = paramParcel.readString();
    value = ((String)Util.castNonNull(paramParcel.readString()));
  }
  
  public TextInformationFrame(String paramString1, @Nullable String paramString2, String paramString3)
  {
    super(paramString1);
    description = paramString2;
    value = paramString3;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (TextInformationFrame.class == paramObject.getClass()))
    {
      paramObject = (TextInformationFrame)paramObject;
      if ((!id.equals(id)) || (!Util.areEqual(description, description)) || (!Util.areEqual(value, value))) {
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
    str = value;
    if (str != null) {
      j = str.hashCode();
    }
    return (i + k) * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(id);
    localStringBuilder.append(": value=");
    localStringBuilder.append(value);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(id);
    paramParcel.writeString(description);
    paramParcel.writeString(value);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.TextInformationFrame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */