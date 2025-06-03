package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.List;

public final class ProgressiveDownloadHelper
  extends DownloadHelper
{
  @Nullable
  private final String customCacheKey;
  private final Uri uri;
  
  public ProgressiveDownloadHelper(Uri paramUri)
  {
    this(paramUri, null);
  }
  
  public ProgressiveDownloadHelper(Uri paramUri, @Nullable String paramString)
  {
    uri = paramUri;
    customCacheKey = paramString;
  }
  
  public ProgressiveDownloadAction getDownloadAction(@Nullable byte[] paramArrayOfByte, List<TrackKey> paramList)
  {
    return ProgressiveDownloadAction.createDownloadAction(uri, paramArrayOfByte, customCacheKey);
  }
  
  public int getPeriodCount()
  {
    return 1;
  }
  
  public ProgressiveDownloadAction getRemoveAction(@Nullable byte[] paramArrayOfByte)
  {
    return ProgressiveDownloadAction.createRemoveAction(uri, paramArrayOfByte, customCacheKey);
  }
  
  public TrackGroupArray getTrackGroups(int paramInt)
  {
    return TrackGroupArray.EMPTY;
  }
  
  public void prepareInternal() {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.offline.ProgressiveDownloadHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */