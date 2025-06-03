package com.google.android.exoplayer2.offline;

import android.net.Uri;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class SegmentDownloadAction$SegmentDownloadActionDeserializer
  extends DownloadAction.Deserializer
{
  public SegmentDownloadAction$SegmentDownloadActionDeserializer(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  public abstract DownloadAction createDownloadAction(Uri paramUri, boolean paramBoolean, byte[] paramArrayOfByte, List<StreamKey> paramList);
  
  public final DownloadAction readFromStream(int paramInt, DataInputStream paramDataInputStream)
    throws IOException
  {
    Uri localUri = Uri.parse(paramDataInputStream.readUTF());
    boolean bool = paramDataInputStream.readBoolean();
    byte[] arrayOfByte = new byte[paramDataInputStream.readInt()];
    paramDataInputStream.readFully(arrayOfByte);
    int i = paramDataInputStream.readInt();
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++) {
      localArrayList.add(readKey(paramInt, paramDataInputStream));
    }
    return createDownloadAction(localUri, bool, arrayOfByte, localArrayList);
  }
  
  public StreamKey readKey(int paramInt, DataInputStream paramDataInputStream)
    throws IOException
  {
    return new StreamKey(paramDataInputStream.readInt(), paramDataInputStream.readInt(), paramDataInputStream.readInt());
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.SegmentDownloadAction.SegmentDownloadActionDeserializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */