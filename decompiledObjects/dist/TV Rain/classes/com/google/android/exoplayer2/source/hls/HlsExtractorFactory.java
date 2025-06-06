package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public abstract interface HlsExtractorFactory
{
  public static final HlsExtractorFactory DEFAULT = new DefaultHlsExtractorFactory();
  
  public abstract Pair<Extractor, Boolean> createExtractor(Extractor paramExtractor, Uri paramUri, Format paramFormat, List<Format> paramList, DrmInitData paramDrmInitData, TimestampAdjuster paramTimestampAdjuster, Map<String, List<String>> paramMap, ExtractorInput paramExtractorInput)
    throws InterruptedException, IOException;
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsExtractorFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */