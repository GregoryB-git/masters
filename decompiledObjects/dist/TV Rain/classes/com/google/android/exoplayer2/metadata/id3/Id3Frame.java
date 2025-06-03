package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata.Entry;

public abstract class Id3Frame
  implements Metadata.Entry
{
  public final String id;
  
  public Id3Frame(String paramString)
  {
    id = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return id;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.Id3Frame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */