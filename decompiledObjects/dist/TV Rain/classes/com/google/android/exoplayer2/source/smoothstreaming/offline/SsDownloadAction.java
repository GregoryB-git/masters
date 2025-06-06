package com.google.android.exoplayer2.source.smoothstreaming.offline;

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

public final class SsDownloadAction
  extends SegmentDownloadAction
{
  public static final DownloadAction.Deserializer DESERIALIZER = new SegmentDownloadAction.SegmentDownloadActionDeserializer("ss", 1)
  {
    public DownloadAction createDownloadAction(Uri paramAnonymousUri, boolean paramAnonymousBoolean, byte[] paramAnonymousArrayOfByte, List<StreamKey> paramAnonymousList)
    {
      return new SsDownloadAction(paramAnonymousUri, paramAnonymousBoolean, paramAnonymousArrayOfByte, paramAnonymousList);
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
  private static final String TYPE = "ss";
  private static final int VERSION = 1;
  
  @Deprecated
  public SsDownloadAction(Uri paramUri, boolean paramBoolean, @Nullable byte[] paramArrayOfByte, List<StreamKey> paramList)
  {
    super("ss", 1, paramUri, paramBoolean, paramArrayOfByte, paramList);
  }
  
  public static SsDownloadAction createDownloadAction(Uri paramUri, @Nullable byte[] paramArrayOfByte, List<StreamKey> paramList)
  {
    return new SsDownloadAction(paramUri, false, paramArrayOfByte, paramList);
  }
  
  public static SsDownloadAction createRemoveAction(Uri paramUri, @Nullable byte[] paramArrayOfByte)
  {
    return new SsDownloadAction(paramUri, true, paramArrayOfByte, Collections.emptyList());
  }
  
  public SsDownloader createDownloader(DownloaderConstructorHelper paramDownloaderConstructorHelper)
  {
    return new SsDownloader(uri, keys, paramDownloaderConstructorHelper);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloadAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */