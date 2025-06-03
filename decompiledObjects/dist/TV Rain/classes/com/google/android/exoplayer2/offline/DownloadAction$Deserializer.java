package com.google.android.exoplayer2.offline;

import java.io.DataInputStream;
import java.io.IOException;

public abstract class DownloadAction$Deserializer
{
  public final String type;
  public final int version;
  
  public DownloadAction$Deserializer(String paramString, int paramInt)
  {
    type = paramString;
    version = paramInt;
  }
  
  public abstract DownloadAction readFromStream(int paramInt, DataInputStream paramDataInputStream)
    throws IOException;
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.DownloadAction.Deserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */