package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import java.util.Arrays;

public final class DefaultTrackSelector$SelectionOverride
  implements Parcelable
{
  public static final Parcelable.Creator<SelectionOverride> CREATOR = new Parcelable.Creator()
  {
    public DefaultTrackSelector.SelectionOverride createFromParcel(Parcel paramAnonymousParcel)
    {
      return new DefaultTrackSelector.SelectionOverride(paramAnonymousParcel);
    }
    
    public DefaultTrackSelector.SelectionOverride[] newArray(int paramAnonymousInt)
    {
      return new DefaultTrackSelector.SelectionOverride[paramAnonymousInt];
    }
  };
  public final int groupIndex;
  public final int length;
  public final int[] tracks;
  
  public DefaultTrackSelector$SelectionOverride(int paramInt, int... paramVarArgs)
  {
    groupIndex = paramInt;
    int[] arrayOfInt = Arrays.copyOf(paramVarArgs, paramVarArgs.length);
    tracks = arrayOfInt;
    length = paramVarArgs.length;
    Arrays.sort(arrayOfInt);
  }
  
  public DefaultTrackSelector$SelectionOverride(Parcel paramParcel)
  {
    groupIndex = paramParcel.readInt();
    int i = paramParcel.readByte();
    length = i;
    int[] arrayOfInt = new int[i];
    tracks = arrayOfInt;
    paramParcel.readIntArray(arrayOfInt);
  }
  
  public boolean containsTrack(int paramInt)
  {
    int[] arrayOfInt = tracks;
    int i = arrayOfInt.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfInt[j] == paramInt) {
        return true;
      }
    }
    return false;
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
    if ((paramObject != null) && (SelectionOverride.class == paramObject.getClass()))
    {
      paramObject = (SelectionOverride)paramObject;
      if ((groupIndex != groupIndex) || (!Arrays.equals(tracks, tracks))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = groupIndex;
    return Arrays.hashCode(tracks) + i * 31;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(groupIndex);
    paramParcel.writeInt(tracks.length);
    paramParcel.writeIntArray(tracks);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */