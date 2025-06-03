package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class TrackSelectionArray
{
  private int hashCode;
  public final int length;
  private final TrackSelection[] trackSelections;
  
  public TrackSelectionArray(TrackSelection... paramVarArgs)
  {
    trackSelections = paramVarArgs;
    length = paramVarArgs.length;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (TrackSelectionArray.class == paramObject.getClass()))
    {
      paramObject = (TrackSelectionArray)paramObject;
      return Arrays.equals(trackSelections, trackSelections);
    }
    return false;
  }
  
  @Nullable
  public TrackSelection get(int paramInt)
  {
    return trackSelections[paramInt];
  }
  
  public TrackSelection[] getAll()
  {
    return (TrackSelection[])trackSelections.clone();
  }
  
  public int hashCode()
  {
    if (hashCode == 0) {
      hashCode = (527 + Arrays.hashCode(trackSelections));
    }
    return hashCode;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.trackselection.TrackSelectionArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */