package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.SegmentDownloadAction.SegmentDownloadActionDeserializer;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.List;

final class DashDownloadAction$1
  extends SegmentDownloadAction.SegmentDownloadActionDeserializer
{
  public DashDownloadAction$1(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }
  
  public DownloadAction createDownloadAction(Uri paramUri, boolean paramBoolean, byte[] paramArrayOfByte, List<StreamKey> paramList)
  {
    return new DashDownloadAction(paramUri, paramBoolean, paramArrayOfByte, paramList);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.offline.DashDownloadAction.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */