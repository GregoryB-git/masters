package com.google.android.exoplayer2.source.dash.manifest;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import java.util.ArrayList;

public final class DashManifestParser$RepresentationInfo
{
  public final String baseUrl;
  public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;
  public final String drmSchemeType;
  public final Format format;
  public final ArrayList<Descriptor> inbandEventStreams;
  public final long revisionId;
  public final SegmentBase segmentBase;
  
  public DashManifestParser$RepresentationInfo(Format paramFormat, String paramString1, SegmentBase paramSegmentBase, String paramString2, ArrayList<DrmInitData.SchemeData> paramArrayList, ArrayList<Descriptor> paramArrayList1, long paramLong)
  {
    format = paramFormat;
    baseUrl = paramString1;
    segmentBase = paramSegmentBase;
    drmSchemeType = paramString2;
    drmSchemeDatas = paramArrayList;
    inbandEventStreams = paramArrayList1;
    revisionId = paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.RepresentationInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */