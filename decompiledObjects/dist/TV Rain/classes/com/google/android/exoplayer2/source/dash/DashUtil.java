package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.List;

public final class DashUtil
{
  @Nullable
  private static Representation getFirstRepresentation(Period paramPeriod, int paramInt)
  {
    paramInt = paramPeriod.getAdaptationSetIndex(paramInt);
    Object localObject = null;
    if (paramInt == -1) {
      return null;
    }
    paramPeriod = adaptationSets.get(paramInt)).representations;
    if (paramPeriod.isEmpty()) {
      paramPeriod = (Period)localObject;
    } else {
      paramPeriod = (Representation)paramPeriod.get(0);
    }
    return paramPeriod;
  }
  
  @Nullable
  public static ChunkIndex loadChunkIndex(DataSource paramDataSource, int paramInt, Representation paramRepresentation)
    throws IOException, InterruptedException
  {
    paramDataSource = loadInitializationData(paramDataSource, paramInt, paramRepresentation, true);
    if (paramDataSource == null) {
      paramDataSource = null;
    } else {
      paramDataSource = (ChunkIndex)paramDataSource.getSeekMap();
    }
    return paramDataSource;
  }
  
  @Nullable
  public static DrmInitData loadDrmInitData(DataSource paramDataSource, Period paramPeriod)
    throws IOException, InterruptedException
  {
    int i = 2;
    Representation localRepresentation = getFirstRepresentation(paramPeriod, 2);
    Object localObject = localRepresentation;
    if (localRepresentation == null)
    {
      i = 1;
      paramPeriod = getFirstRepresentation(paramPeriod, 1);
      localObject = paramPeriod;
      if (paramPeriod == null) {
        return null;
      }
    }
    paramPeriod = format;
    paramDataSource = loadSampleFormat(paramDataSource, i, (Representation)localObject);
    if (paramDataSource == null) {
      paramDataSource = drmInitData;
    } else {
      paramDataSource = copyWithManifestFormatInfodrmInitData;
    }
    return paramDataSource;
  }
  
  @Nullable
  private static ChunkExtractorWrapper loadInitializationData(DataSource paramDataSource, int paramInt, Representation paramRepresentation, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    RangedUri localRangedUri1 = paramRepresentation.getInitializationUri();
    if (localRangedUri1 == null) {
      return null;
    }
    ChunkExtractorWrapper localChunkExtractorWrapper = newWrappedExtractor(paramInt, format);
    Object localObject = localRangedUri1;
    if (paramBoolean)
    {
      RangedUri localRangedUri2 = paramRepresentation.getIndexUri();
      if (localRangedUri2 == null) {
        return null;
      }
      localObject = localRangedUri1.attemptMerge(localRangedUri2, baseUrl);
      if (localObject == null)
      {
        loadInitializationData(paramDataSource, paramRepresentation, localChunkExtractorWrapper, localRangedUri1);
        localObject = localRangedUri2;
      }
    }
    loadInitializationData(paramDataSource, paramRepresentation, localChunkExtractorWrapper, (RangedUri)localObject);
    return localChunkExtractorWrapper;
  }
  
  private static void loadInitializationData(DataSource paramDataSource, Representation paramRepresentation, ChunkExtractorWrapper paramChunkExtractorWrapper, RangedUri paramRangedUri)
    throws IOException, InterruptedException
  {
    new InitializationChunk(paramDataSource, new DataSpec(paramRangedUri.resolveUri(baseUrl), start, length, paramRepresentation.getCacheKey()), format, 0, null, paramChunkExtractorWrapper).load();
  }
  
  public static DashManifest loadManifest(DataSource paramDataSource, Uri paramUri)
    throws IOException
  {
    return (DashManifest)ParsingLoadable.load(paramDataSource, new DashManifestParser(), paramUri, 4);
  }
  
  @Nullable
  public static Format loadSampleFormat(DataSource paramDataSource, int paramInt, Representation paramRepresentation)
    throws IOException, InterruptedException
  {
    paramDataSource = loadInitializationData(paramDataSource, paramInt, paramRepresentation, false);
    if (paramDataSource == null) {
      paramDataSource = null;
    } else {
      paramDataSource = paramDataSource.getSampleFormats()[0];
    }
    return paramDataSource;
  }
  
  private static ChunkExtractorWrapper newWrappedExtractor(int paramInt, Format paramFormat)
  {
    Object localObject = containerMimeType;
    int i;
    if ((localObject != null) && ((((String)localObject).startsWith("video/webm")) || (((String)localObject).startsWith("audio/webm")))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      localObject = new MatroskaExtractor();
    } else {
      localObject = new FragmentedMp4Extractor();
    }
    return new ChunkExtractorWrapper((Extractor)localObject, paramInt, paramFormat);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */