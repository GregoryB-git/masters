package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import java.util.Collections;
import java.util.List;
import z2;

public abstract class Representation
{
  public static final long REVISION_ID_DEFAULT = -1L;
  public final String baseUrl;
  public final String contentId;
  public final Format format;
  public final List<Descriptor> inbandEventStreams;
  private final RangedUri initializationUri;
  public final long presentationTimeOffsetUs;
  public final long revisionId;
  
  private Representation(String paramString1, long paramLong, Format paramFormat, String paramString2, SegmentBase paramSegmentBase, List<Descriptor> paramList)
  {
    contentId = paramString1;
    revisionId = paramLong;
    format = paramFormat;
    baseUrl = paramString2;
    if (paramList == null) {
      paramString1 = Collections.emptyList();
    } else {
      paramString1 = Collections.unmodifiableList(paramList);
    }
    inbandEventStreams = paramString1;
    initializationUri = paramSegmentBase.getInitialization(this);
    presentationTimeOffsetUs = paramSegmentBase.getPresentationTimeOffsetUs();
  }
  
  public static Representation newInstance(String paramString1, long paramLong, Format paramFormat, String paramString2, SegmentBase paramSegmentBase)
  {
    return newInstance(paramString1, paramLong, paramFormat, paramString2, paramSegmentBase, null);
  }
  
  public static Representation newInstance(String paramString1, long paramLong, Format paramFormat, String paramString2, SegmentBase paramSegmentBase, List<Descriptor> paramList)
  {
    return newInstance(paramString1, paramLong, paramFormat, paramString2, paramSegmentBase, paramList, null);
  }
  
  public static Representation newInstance(String paramString1, long paramLong, Format paramFormat, String paramString2, SegmentBase paramSegmentBase, List<Descriptor> paramList, String paramString3)
  {
    if ((paramSegmentBase instanceof SegmentBase.SingleSegmentBase)) {
      return new SingleSegmentRepresentation(paramString1, paramLong, paramFormat, paramString2, (SegmentBase.SingleSegmentBase)paramSegmentBase, paramList, paramString3, -1L);
    }
    if ((paramSegmentBase instanceof SegmentBase.MultiSegmentBase)) {
      return new MultiSegmentRepresentation(paramString1, paramLong, paramFormat, paramString2, (SegmentBase.MultiSegmentBase)paramSegmentBase, paramList);
    }
    throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
  }
  
  public abstract String getCacheKey();
  
  public abstract DashSegmentIndex getIndex();
  
  public abstract RangedUri getIndexUri();
  
  public RangedUri getInitializationUri()
  {
    return initializationUri;
  }
  
  public static class MultiSegmentRepresentation
    extends Representation
    implements DashSegmentIndex
  {
    private final SegmentBase.MultiSegmentBase segmentBase;
    
    public MultiSegmentRepresentation(String paramString1, long paramLong, Format paramFormat, String paramString2, SegmentBase.MultiSegmentBase paramMultiSegmentBase, List<Descriptor> paramList)
    {
      super(paramLong, paramFormat, paramString2, paramMultiSegmentBase, paramList, null);
      segmentBase = paramMultiSegmentBase;
    }
    
    public String getCacheKey()
    {
      return null;
    }
    
    public long getDurationUs(long paramLong1, long paramLong2)
    {
      return segmentBase.getSegmentDurationUs(paramLong1, paramLong2);
    }
    
    public long getFirstSegmentNum()
    {
      return segmentBase.getFirstSegmentNum();
    }
    
    public DashSegmentIndex getIndex()
    {
      return this;
    }
    
    public RangedUri getIndexUri()
    {
      return null;
    }
    
    public int getSegmentCount(long paramLong)
    {
      return segmentBase.getSegmentCount(paramLong);
    }
    
    public long getSegmentNum(long paramLong1, long paramLong2)
    {
      return segmentBase.getSegmentNum(paramLong1, paramLong2);
    }
    
    public RangedUri getSegmentUrl(long paramLong)
    {
      return segmentBase.getSegmentUrl(this, paramLong);
    }
    
    public long getTimeUs(long paramLong)
    {
      return segmentBase.getSegmentTimeUs(paramLong);
    }
    
    public boolean isExplicit()
    {
      return segmentBase.isExplicit();
    }
  }
  
  public static class SingleSegmentRepresentation
    extends Representation
  {
    private final String cacheKey;
    public final long contentLength;
    private final RangedUri indexUri;
    private final SingleSegmentIndex segmentIndex;
    public final Uri uri;
    
    public SingleSegmentRepresentation(String paramString1, long paramLong1, Format paramFormat, String paramString2, SegmentBase.SingleSegmentBase paramSingleSegmentBase, List<Descriptor> paramList, String paramString3, long paramLong2)
    {
      super(paramLong1, paramFormat, paramString2, paramSingleSegmentBase, paramList, null);
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.Representation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */