package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

public final class TrackGroup
  implements Parcelable
{
  public static final Parcelable.Creator<TrackGroup> CREATOR = new Parcelable.Creator()
  {
    public TrackGroup createFromParcel(Parcel paramAnonymousParcel)
    {
      return new TrackGroup(paramAnonymousParcel);
    }
    
    public TrackGroup[] newArray(int paramAnonymousInt)
    {
      return new TrackGroup[paramAnonymousInt];
    }
  };
  private final Format[] formats;
  private int hashCode;
  public final int length;
  
  public TrackGroup(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    length = i;
    formats = new Format[i];
    for (i = 0; i < length; i++) {
      formats[i] = ((Format)paramParcel.readParcelable(Format.class.getClassLoader()));
    }
  }
  
  public TrackGroup(Format... paramVarArgs)
  {
    boolean bool;
    if (paramVarArgs.length > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    formats = paramVarArgs;
    length = paramVarArgs.length;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (TrackGroup.class == paramObject.getClass()))
    {
      paramObject = (TrackGroup)paramObject;
      if ((length != length) || (!Arrays.equals(formats, formats))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public Format getFormat(int paramInt)
  {
    return formats[paramInt];
  }
  
  public int hashCode()
  {
    if (hashCode == 0) {
      hashCode = (527 + Arrays.hashCode(formats));
    }
    return hashCode;
  }
  
  public int indexOf(Format paramFormat)
  {
    for (int i = 0;; i++)
    {
      Format[] arrayOfFormat = formats;
      if (i >= arrayOfFormat.length) {
        break;
      }
      if (paramFormat == arrayOfFormat[i]) {
        return i;
      }
    }
    return -1;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(length);
    for (paramInt = 0; paramInt < length; paramInt++) {
      paramParcel.writeParcelable(formats[paramInt], 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.TrackGroup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */