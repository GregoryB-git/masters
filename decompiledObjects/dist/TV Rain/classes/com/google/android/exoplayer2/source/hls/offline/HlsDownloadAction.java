package com.google.android.exoplayer2.source.hls.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadAction.Deserializer;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloadAction;
import com.google.android.exoplayer2.offline.SegmentDownloadAction.SegmentDownloadActionDeserializer;
import com.google.android.exoplayer2.offline.StreamKey;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public final class HlsDownloadAction
  extends SegmentDownloadAction
{
  public static final DownloadAction.Deserializer DESERIALIZER = new SegmentDownloadAction.SegmentDownloadActionDeserializer("hls", 1)
  {
    public DownloadAction createDownloadAction(Uri paramAnonymousUri, boolean paramAnonymousBoolean, byte[] paramAnonymousArrayOfByte, List<StreamKey> paramAnonymousList)
    {
      return new HlsDownloadAction(paramAnonymousUri, paramAnonymousBoolean, paramAnonymousArrayOfByte, paramAnonymousList);
    }
    
    public StreamKey readKey(int paramAnonymousInt, DataInputStream paramAnonymousDataInputStream)
      throws IOException
    {
      if (paramAnonymousInt > 0) {
        return super.readKey(paramAnonymousInt, paramAnonymousDataInputStream);
      }
      return new StreamKey(paramAnonymousDataInputStream.readInt(), paramAnonymousDataInputStream.readInt());
    }
  };
  private static final String TYPE = "hls";
  private static final int VERSION = 1;
  
  @Deprecated
  public HlsDownloadAction(Uri paramUri, boolean paramBoolean, @Nullable byte[] paramArrayOfByte, List<StreamKey> paramList)
  {
    super("hls", 1, paramUri, paramBoolean, paramArrayOfByte, paramList);
  }
  
  public static HlsDownloadAction createDownloadAction(Uri paramUri, @Nullable byte[] paramArrayOfByte, List<StreamKey> paramList)
  {
    return new HlsDownloadAction(paramUri, false, paramArrayOfByte, paramList);
  }
  
  public static HlsDownloadAction createRemoveAction(Uri paramUri, @Nullable byte[] paramArrayOfByte)
  {
    return new HlsDownloadAction(paramUri, true, paramArrayOfByte, Collections.emptyList());
  }
  
  public HlsDownloader createDownloader(DownloaderConstructorHelper paramDownloaderConstructorHelper)
  {
    return new HlsDownloader(uri, keys, paramDownloaderConstructorHelper);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.offline.HlsDownloadAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */