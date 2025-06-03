package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.SegmentDownloadAction.SegmentDownloadActionDeserializer;
import com.google.android.exoplayer2.offline.StreamKey;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;

final class HlsDownloadAction$1
  extends SegmentDownloadAction.SegmentDownloadActionDeserializer
{
  public HlsDownloadAction$1(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  public DownloadAction createDownloadAction(Uri paramUri, boolean paramBoolean, byte[] paramArrayOfByte, List<StreamKey> paramList)
  {
    return new HlsDownloadAction(paramUri, paramBoolean, paramArrayOfByte, paramList);
  }
  
  public StreamKey readKey(int paramInt, DataInputStream paramDataInputStream)
    throws IOException
  {
    if (paramInt > 0) {
      return super.readKey(paramInt, paramDataInputStream);
    }
    return new StreamKey(paramDataInputStream.readInt(), paramDataInputStream.readInt());
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.offline.HlsDownloadAction.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */