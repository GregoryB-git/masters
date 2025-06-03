package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import java.util.List;
import z2;

public class Representation$SingleSegmentRepresentation
  extends Representation
{
  private final String cacheKey;
  public final long contentLength;
  private final RangedUri indexUri;
  private final SingleSegmentIndex segmentIndex;
  public final Uri uri;
  
  public Representation$SingleSegmentRepresentation(String paramString1, long paramLong1, Format paramFormat, String paramString2, SegmentBase.SingleSegmentBase paramSingleSegmentBase, List<Descriptor> paramList, String paramString3, long paramLong2)
  {
    super(paramString1, paramLong1, paramFormat, paramString2, paramSingleSegmentBase, paramList, null);
    uri = Uri.parse(paramString2);
    paramSingleSegmentBase = paramSingleSegmentBase.getIndex();
    indexUri = paramSingleSegmentBase;
    paramString2 = null;
    if (paramString3 != null)
    {
      paramString1 = paramString3;
    }
    else if (paramString1 != null)
    {
      paramString1 = z2.u(paramString1, ".");
      paramString1.append(id);
      paramString1.append(".");
      paramString1.append(paramLong1);
      paramString1 = paramString1.toString();
    }
    else
    {
      paramString1 = null;
    }
    cacheKey = paramString1;
    contentLength = paramLong2;
    if (paramSingleSegmentBase != null) {
      paramString1 = paramString2;
    } else {
      paramString1 = new SingleSegmentIndex(new RangedUri(null, 0L, paramLong2));
    }
    segmentIndex = paramString1;
  }
  
  public static SingleSegmentRepresentation newInstance(String paramString1, long paramLong1, Format paramFormat, String paramString2, long paramLong2, long paramLong3, long paramLong4, long paramLong5, List<Descriptor> paramList, String paramString3, long paramLong6)
  {
    return new SingleSegmentRepresentation(paramString1, paramLong1, paramFormat, paramString2, new SegmentBase.SingleSegmentBase(new RangedUri(null, paramLong2, paramLong3 - paramLong2 + 1L), 1L, 0L, paramLong4, paramLong5 - paramLong4 + 1L), paramList, paramString3, paramLong6);
  }
  
  public String getCacheKey()
  {
    return cacheKey;
  }
  
  public DashSegmentIndex getIndex()
  {
    return segmentIndex;
  }
  
  public RangedUri getIndexUri()
  {
    return indexUri;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.Representation.SingleSegmentRepresentation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */