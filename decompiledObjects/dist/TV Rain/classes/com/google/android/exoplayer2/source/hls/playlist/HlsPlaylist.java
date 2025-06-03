package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.FilterableManifest;
import java.util.Collections;
import java.util.List;

public abstract class HlsPlaylist
  implements FilterableManifest<HlsPlaylist>
{
  public final String baseUri;
  public final boolean hasIndependentSegments;
  public final List<String> tags;
  
  public HlsPlaylist(String paramString, List<String> paramList, boolean paramBoolean)
  {
    baseUri = paramString;
    tags = Collections.unmodifiableList(paramList);
    hasIndependentSegments = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */