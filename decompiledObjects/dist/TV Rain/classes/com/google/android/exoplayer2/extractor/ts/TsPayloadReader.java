package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.Collections;
import java.util.List;

public abstract interface TsPayloadReader
{
  public abstract void consume(ParsableByteArray paramParsableByteArray, boolean paramBoolean)
    throws ParserException;
  
  public abstract void init(TimestampAdjuster paramTimestampAdjuster, ExtractorOutput paramExtractorOutput, TrackIdGenerator paramTrackIdGenerator);
  
  public abstract void seek();
  
  public static final class DvbSubtitleInfo
  {
    public final byte[] initializationData;
    public final String language;
    public final int type;
    
    public DvbSubtitleInfo(String paramString, int paramInt, byte[] paramArrayOfByte)
    {
      language = paramString;
      type = paramInt;
      initializationData = paramArrayOfByte;
    }
  }
  
  public static final class EsInfo
  {
    public final byte[] descriptorBytes;
    public final List<TsPayloadReader.DvbSubtitleInfo> dvbSubtitleInfos;
    public final String language;
    public final int streamType;
    
    public EsInfo(int paramInt, String paramString, List<TsPayloadReader.DvbSubtitleInfo> paramList, byte[] paramArrayOfByte)
    {
      streamType = paramInt;
      language = paramString;
      if (paramList == null) {
        paramString = Collections.emptyList();
      } else {
        paramString = Collections.unmodifiableList(paramList);
      }
      dvbSubtitleInfos = paramString;
      descriptorBytes = paramArrayOfByte;
    }
  }
  
  public static abstract interface Factory
  {
    public abstract SparseArray<TsPayloadReader> createInitialPayloadReaders();
    
    public abstract TsPayloadReader createPayloadReader(int paramInt, TsPayloadReader.EsInfo paramEsInfo);
  }
  
  public static final class TrackIdGenerator
  {
    private static final int ID_UNSET = Integer.MIN_VALUE;
    private final int firstTrackId;
    private String formatId;
    private final String formatIdPrefix;
    private int trackId;
    private final int trackIdIncrement;
    
    public TrackIdGenerator(int paramInt1, int paramInt2)
    {
      this(Integer.MIN_VALUE, paramInt1, paramInt2);
    }
    
    public TrackIdGenerator(int paramInt1, int paramInt2, int paramInt3)
    {
      Object localObject;
      if (paramInt1 != Integer.MIN_VALUE)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append("/");
        localObject = ((StringBuilder)localObject).toString();
      }
      else
      {
        localObject = "";
      }
      formatIdPrefix = ((String)localObject);
      firstTrackId = paramInt2;
      trackIdIncrement = paramInt3;
      trackId = Integer.MIN_VALUE;
    }
    
    private void maybeThrowUninitializedError()
    {
      if (trackId != Integer.MIN_VALUE) {
        return;
      }
      throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }
    
    public void generateNewId()
    {
      int i = trackId;
      if (i == Integer.MIN_VALUE) {
        i = firstTrackId;
      } else {
        i += trackIdIncrement;
      }
      trackId = i;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(formatIdPrefix);
      localStringBuilder.append(trackId);
      formatId = localStringBuilder.toString();
    }
    
    public String getFormatId()
    {
      maybeThrowUninitializedError();
      return formatId;
    }
    
    public int getTrackId()
    {
      maybeThrowUninitializedError();
      return trackId;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.TsPayloadReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */