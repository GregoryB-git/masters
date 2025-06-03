package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import java.util.Arrays;

public final class TrackGroupArray
  implements Parcelable
{
  public static final Parcelable.Creator<TrackGroupArray> CREATOR = new Parcelable.Creator()
  {
    public TrackGroupArray createFromParcel(Parcel paramAnonymousParcel)
    {
      return new TrackGroupArray(paramAnonymousParcel);
    }
    
    public TrackGroupArray[] newArray(int paramAnonymousInt)
    {
      return new TrackGroupArray[paramAnonymousInt];
    }
  };
  public static final TrackGroupArray EMPTY = new TrackGroupArray(new TrackGroup[0]);
  private int hashCode;
  public final int length;
  private final TrackGroup[] trackGroups;
  
  public TrackGroupArray(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    length = i;
    trackGroups = new TrackGroup[i];
    for (i = 0; i < length; i++) {
      trackGroups[i] = ((TrackGroup)paramParcel.readParcelable(TrackGroup.class.getClassLoader()));
    }
  }
  
  public TrackGroupArray(TrackGroup... paramVarArgs)
  {
    trackGroups = paramVarArgs;
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
    if ((paramObject != null) && (TrackGroupArray.class == paramObject.getClass()))
    {
      paramObject = (TrackGroupArray)paramObject;
      if ((length != length) || (!Arrays.equals(trackGroups, trackGroups))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public TrackGroup get(int paramInt)
  {
    return trackGroups[paramInt];
  }
  
  public int hashCode()
  {
    if (hashCode == 0) {
      hashCode = Arrays.hashCode(trackGroups);
    }
    return hashCode;
  }
  
  public int indexOf(TrackGroup paramTrackGroup)
  {
    for (int i = 0; i < length; i++) {
      if (trackGroups[i] == paramTrackGroup) {
        return i;
      }
    }
    return -1;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (length == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(length);
    for (paramInt = 0; paramInt < length; paramInt++) {
      paramParcel.writeParcelable(trackGroups[paramInt], 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.TrackGroupArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */