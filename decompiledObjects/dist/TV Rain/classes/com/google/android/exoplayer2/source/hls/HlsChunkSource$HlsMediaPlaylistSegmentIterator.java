package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist.Segment;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.UriUtil;
import java.util.List;

final class HlsChunkSource$HlsMediaPlaylistSegmentIterator
  extends BaseMediaChunkIterator
{
  private final HlsMediaPlaylist playlist;
  private final long startOfPlaylistInPeriodUs;
  
  public HlsChunkSource$HlsMediaPlaylistSegmentIterator(HlsMediaPlaylist paramHlsMediaPlaylist, long paramLong, int paramInt)
  {
    super(paramInt, segments.size() - 1);
    playlist = paramHlsMediaPlaylist;
    startOfPlaylistInPeriodUs = paramLong;
  }
  
  public long getChunkEndTimeUs()
  {
    checkInBounds();
    HlsMediaPlaylist.Segment localSegment = (HlsMediaPlaylist.Segment)playlist.segments.get((int)getCurrentIndex());
    return startOfPlaylistInPeriodUs + relativeStartTimeUs + durationUs;
  }
  
  public long getChunkStartTimeUs()
  {
    checkInBounds();
    HlsMediaPlaylist.Segment localSegment = (HlsMediaPlaylist.Segment)playlist.segments.get((int)getCurrentIndex());
    return startOfPlaylistInPeriodUs + relativeStartTimeUs;
  }
  
  public DataSpec getDataSpec()
  {
    checkInBounds();
    HlsMediaPlaylist.Segment localSegment = (HlsMediaPlaylist.Segment)playlist.segments.get((int)getCurrentIndex());
    return new DataSpec(UriUtil.resolveToUri(playlist.baseUri, url), byterangeOffset, byterangeLength, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsChunkSource.HlsMediaPlaylistSegmentIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */