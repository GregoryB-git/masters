package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSpec;

public final class DefaultDashChunkSource$RepresentationSegmentIterator
  extends BaseMediaChunkIterator
{
  private final DefaultDashChunkSource.RepresentationHolder representationHolder;
  
  public DefaultDashChunkSource$RepresentationSegmentIterator(DefaultDashChunkSource.RepresentationHolder paramRepresentationHolder, long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2);
    representationHolder = paramRepresentationHolder;
  }
  
  public long getChunkEndTimeUs()
  {
    checkInBounds();
    return representationHolder.getSegmentEndTimeUs(getCurrentIndex());
  }
  
  public long getChunkStartTimeUs()
  {
    checkInBounds();
    return representationHolder.getSegmentStartTimeUs(getCurrentIndex());
  }
  
  public DataSpec getDataSpec()
  {
    checkInBounds();
    Object localObject1 = representationHolder;
    Object localObject2 = representation;
    RangedUri localRangedUri = ((DefaultDashChunkSource.RepresentationHolder)localObject1).getSegmentUrl(getCurrentIndex());
    localObject1 = localRangedUri.resolveUri(baseUrl);
    localObject2 = ((Representation)localObject2).getCacheKey();
    return new DataSpec((Uri)localObject1, start, length, (String)localObject2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationSegmentIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */