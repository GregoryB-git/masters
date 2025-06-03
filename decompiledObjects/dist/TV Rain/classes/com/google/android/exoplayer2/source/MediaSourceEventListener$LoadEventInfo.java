package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.util.List;
import java.util.Map;

public final class MediaSourceEventListener$LoadEventInfo
{
  public final long bytesLoaded;
  public final DataSpec dataSpec;
  public final long elapsedRealtimeMs;
  public final long loadDurationMs;
  public final Map<String, List<String>> responseHeaders;
  public final Uri uri;
  
  public MediaSourceEventListener$LoadEventInfo(DataSpec paramDataSpec, Uri paramUri, Map<String, List<String>> paramMap, long paramLong1, long paramLong2, long paramLong3)
  {
    dataSpec = paramDataSpec;
    uri = paramUri;
    responseHeaders = paramMap;
    elapsedRealtimeMs = paramLong1;
    loadDurationMs = paramLong2;
    bytesLoaded = paramLong3;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */