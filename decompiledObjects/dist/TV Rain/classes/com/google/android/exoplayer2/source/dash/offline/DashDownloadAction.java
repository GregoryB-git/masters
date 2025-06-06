package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadAction.Deserializer;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloadAction;
import com.google.android.exoplayer2.offline.SegmentDownloadAction.SegmentDownloadActionDeserializer;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.Collections;
import java.util.List;

public final class DashDownloadAction
  extends SegmentDownloadAction
{
  public static final DownloadAction.Deserializer DESERIALIZER = new SegmentDownloadAction.SegmentDownloadActionDeserializer("dash", 0)
  {
    public DownloadAction createDownloadAction(Uri paramAnonymousUri, boolean paramAnonymousBoolean, byte[] paramAnonymousArrayOfByte, List<StreamKey> paramAnonymousList)
    {
      return new DashDownloadAction(paramAnonymousUri, paramAnonymousBoolean, paramAnonymousArrayOfByte, paramAnonymousList);
    }
  };
  private static final String TYPE = "dash";
  private static final int VERSION = 0;
  
  @Deprecated
  public DashDownloadAction(Uri paramUri, boolean paramBoolean, @Nullable byte[] paramArrayOfByte, List<StreamKey> paramList)
  {
    super("dash", 0, paramUri, paramBoolean, paramArrayOfByte, paramList);
  }
  
  public static DashDownloadAction createDownloadAction(Uri paramUri, @Nullable byte[] paramArrayOfByte, List<StreamKey> paramList)
  {
    return new DashDownloadAction(paramUri, false, paramArrayOfByte, paramList);
  }
  
  public static DashDownloadAction createRemoveAction(Uri paramUri, @Nullable byte[] paramArrayOfByte)
  {
    return new DashDownloadAction(paramUri, true, paramArrayOfByte, Collections.emptyList());
  }
  
  public DashDownloader createDownloader(DownloaderConstructorHelper paramDownloaderConstructorHelper)
  {
    return new DashDownloader(uri, keys, paramDownloaderConstructorHelper);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.offline.DashDownloadAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */