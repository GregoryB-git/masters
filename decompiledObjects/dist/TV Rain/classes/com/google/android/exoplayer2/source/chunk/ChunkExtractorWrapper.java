package com.google.android.exoplayer2.source.chunk;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput.CryptoData;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

public final class ChunkExtractorWrapper
  implements ExtractorOutput
{
  private final SparseArray<BindingTrackOutput> bindingTrackOutputs;
  private long endTimeUs;
  public final Extractor extractor;
  private boolean extractorInitialized;
  private final Format primaryTrackManifestFormat;
  private final int primaryTrackType;
  private Format[] sampleFormats;
  private SeekMap seekMap;
  private TrackOutputProvider trackOutputProvider;
  
  public ChunkExtractorWrapper(Extractor paramExtractor, int paramInt, Format paramFormat)
  {
    extractor = paramExtractor;
    primaryTrackType = paramInt;
    primaryTrackManifestFormat = paramFormat;
    bindingTrackOutputs = new SparseArray();
  }
  
  public void endTracks()
  {
    Format[] arrayOfFormat = new Format[bindingTrackOutputs.size()];
    for (int i = 0; i < bindingTrackOutputs.size(); i++) {
      arrayOfFormat[i] = bindingTrackOutputs.valueAt(i)).sampleFormat;
    }
    sampleFormats = arrayOfFormat;
  }
  
  public Format[] getSampleFormats()
  {
    return sampleFormats;
  }
  
  public SeekMap getSeekMap()
  {
    return seekMap;
  }
  
  public void init(@Nullable TrackOutputProvider paramTrackOutputProvider, long paramLong1, long paramLong2)
  {
    trackOutputProvider = paramTrackOutputProvider;
    endTimeUs = paramLong2;
    if (!extractorInitialized)
    {
      extractor.init(this);
      if (paramLong1 != -9223372036854775807L) {
        extractor.seek(0L, paramLong1);
      }
      extractorInitialized = true;
    }
    else
    {
      Extractor localExtractor = extractor;
      long l = paramLong1;
      if (paramLong1 == -9223372036854775807L) {
        l = 0L;
      }
      localExtractor.seek(0L, l);
      for (int i = 0; i < bindingTrackOutputs.size(); i++) {
        ((BindingTrackOutput)bindingTrackOutputs.valueAt(i)).bind(paramTrackOutputProvider, paramLong2);
      }
    }
  }
  
  public void seekMap(SeekMap paramSeekMap)
  {
    seekMap = paramSeekMap;
  }
  
  public TrackOutput track(int paramInt1, int paramInt2)
  {
    BindingTrackOutput localBindingTrackOutput = (BindingTrackOutput)bindingTrackOutputs.get(paramInt1);
    Object localObject = localBindingTrackOutput;
    if (localBindingTrackOutput == null)
    {
      boolean bool;
      if (sampleFormats == null) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      if (paramInt2 == primaryTrackType) {
        localObject = primaryTrackManifestFormat;
      } else {
        localObject = null;
      }
      localObject = new BindingTrackOutput(paramInt1, paramInt2, (Format)localObject);
      ((BindingTrackOutput)localObject).bind(trackOutputProvider, endTimeUs);
      bindingTrackOutputs.put(paramInt1, localObject);
    }
    return (TrackOutput)localObject;
  }
  
  public static final class BindingTrackOutput
    implements TrackOutput
  {
    private final DummyTrackOutput dummyTrackOutput;
    private long endTimeUs;
    private final int id;
    private final Format manifestFormat;
    public Format sampleFormat;
    private TrackOutput trackOutput;
    private final int type;
    
    public BindingTrackOutput(int paramInt1, int paramInt2, Format paramFormat)
    {
      id = paramInt1;
      type = paramInt2;
      manifestFormat = paramFormat;
      dummyTrackOutput = new DummyTrackOutput();
    }
    
    public void bind(ChunkExtractorWrapper.TrackOutputProvider paramTrackOutputProvider, long paramLong)
    {
      if (paramTrackOutputProvider == null)
      {
        trackOutput = dummyTrackOutput;
        return;
      }
      endTimeUs = paramLong;
      paramTrackOutputProvider = paramTrackOutputProvider.track(id, type);
      trackOutput = paramTrackOutputProvider;
      Format localFormat = sampleFormat;
      if (localFormat != null) {
        paramTrackOutputProvider.format(localFormat);
      }
    }
    
    public void format(Format paramFormat)
    {
      Format localFormat1 = manifestFormat;
      Format localFormat2 = paramFormat;
      if (localFormat1 != null) {
        localFormat2 = paramFormat.copyWithManifestFormatInfo(localFormat1);
      }
      sampleFormat = localFormat2;
      trackOutput.format(localFormat2);
    }
    
    public int sampleData(ExtractorInput paramExtractorInput, int paramInt, boolean paramBoolean)
      throws IOException, InterruptedException
    {
      return trackOutput.sampleData(paramExtractorInput, paramInt, paramBoolean);
    }
    
    public void sampleData(ParsableByteArray paramParsableByteArray, int paramInt)
    {
      trackOutput.sampleData(paramParsableByteArray, paramInt);
    }
    
    public void sampleMetadata(long paramLong, int paramInt1, int paramInt2, int paramInt3, TrackOutput.CryptoData paramCryptoData)
    {
      long l = endTimeUs;
      if ((l != -9223372036854775807L) && (paramLong >= l)) {
        trackOutput = dummyTrackOutput;
      }
      trackOutput.sampleMetadata(paramLong, paramInt1, paramInt2, paramInt3, paramCryptoData);
    }
  }
  
  public static abstract interface TrackOutputProvider
  {
    public abstract TrackOutput track(int paramInt1, int paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */