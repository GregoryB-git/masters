package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.Metadata.Entry;
import z2;

public abstract class SpliceCommand
  implements Metadata.Entry
{
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("SCTE-35 splice command: type=");
    localStringBuilder.append(getClass().getSimpleName());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.SpliceCommand
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */