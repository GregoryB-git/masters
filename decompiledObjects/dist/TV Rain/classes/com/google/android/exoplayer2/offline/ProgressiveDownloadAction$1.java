package com.google.android.exoplayer2.offline;

import android.net.Uri;
import java.io.DataInputStream;
import java.io.IOException;

final class ProgressiveDownloadAction$1
  extends DownloadAction.Deserializer
{
  public ProgressiveDownloadAction$1(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  public ProgressiveDownloadAction readFromStream(int paramInt, DataInputStream paramDataInputStream)
    throws IOException
  {
    Uri localUri = Uri.parse(paramDataInputStream.readUTF());
    boolean bool = paramDataInputStream.readBoolean();
    byte[] arrayOfByte = new byte[paramDataInputStream.readInt()];
    paramDataInputStream.readFully(arrayOfByte);
    if (paramDataInputStream.readBoolean()) {
      paramDataInputStream = paramDataInputStream.readUTF();
    } else {
      paramDataInputStream = null;
    }
    return new ProgressiveDownloadAction(localUri, bool, arrayOfByte, paramDataInputStream);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.ProgressiveDownloadAction.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */