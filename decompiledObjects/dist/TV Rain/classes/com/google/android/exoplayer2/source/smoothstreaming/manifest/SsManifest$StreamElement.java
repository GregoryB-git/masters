package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.List;

public class SsManifest$StreamElement
{
  private static final String URL_PLACEHOLDER_BITRATE_1 = "{bitrate}";
  private static final String URL_PLACEHOLDER_BITRATE_2 = "{Bitrate}";
  private static final String URL_PLACEHOLDER_START_TIME_1 = "{start time}";
  private static final String URL_PLACEHOLDER_START_TIME_2 = "{start_time}";
  private final String baseUri;
  public final int chunkCount;
  private final List<Long> chunkStartTimes;
  private final long[] chunkStartTimesUs;
  private final String chunkTemplate;
  public final int displayHeight;
  public final int displayWidth;
  public final Format[] formats;
  public final String language;
  private final long lastChunkDurationUs;
  public final int maxHeight;
  public final int maxWidth;
  public final String name;
  public final String subType;
  public final long timescale;
  public final int type;
  
  public SsManifest$StreamElement(String paramString1, String paramString2, int paramInt1, String paramString3, long paramLong1, String paramString4, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString5, Format[] paramArrayOfFormat, List<Long> paramList, long paramLong2)
  {
    this(paramString1, paramString2, paramInt1, paramString3, paramLong1, paramString4, paramInt2, paramInt3, paramInt4, paramInt5, paramString5, paramArrayOfFormat, paramList, Util.scaleLargeTimestamps(paramList, 1000000L, paramLong1), Util.scaleLargeTimestamp(paramLong2, 1000000L, paramLong1));
  }
  
  private SsManifest$StreamElement(String paramString1, String paramString2, int paramInt1, String paramString3, long paramLong1, String paramString4, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString5, Format[] paramArrayOfFormat, List<Long> paramList, long[] paramArrayOfLong, long paramLong2)
  {
    baseUri = paramString1;
    chunkTemplate = paramString2;
    type = paramInt1;
    subType = paramString3;
    timescale = paramLong1;
    name = paramString4;
    maxWidth = paramInt2;
    maxHeight = paramInt3;
    displayWidth = paramInt4;
    displayHeight = paramInt5;
    language = paramString5;
    formats = paramArrayOfFormat;
    chunkStartTimes = paramList;
    chunkStartTimesUs = paramArrayOfLong;
    lastChunkDurationUs = paramLong2;
    chunkCount = paramList.size();
  }
  
  public Uri buildRequestUri(int paramInt1, int paramInt2)
  {
    Object localObject = formats;
    boolean bool1 = true;
    boolean bool2;
    if (localObject != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkState(bool2);
    if (chunkStartTimes != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkState(bool2);
    if (paramInt2 < chunkStartTimes.size()) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Assertions.checkState(bool2);
    localObject = Integer.toString(formats[paramInt1].bitrate);
    String str = ((Long)chunkStartTimes.get(paramInt2)).toString();
    localObject = chunkTemplate.replace("{bitrate}", (CharSequence)localObject).replace("{Bitrate}", (CharSequence)localObject).replace("{start time}", str).replace("{start_time}", str);
    return UriUtil.resolveToUri(baseUri, (String)localObject);
  }
  
  public StreamElement copy(Format[] paramArrayOfFormat)
  {
    return new StreamElement(baseUri, chunkTemplate, type, subType, timescale, name, maxWidth, maxHeight, displayWidth, displayHeight, language, paramArrayOfFormat, chunkStartTimes, chunkStartTimesUs, lastChunkDurationUs);
  }
  
  public long getChunkDurationUs(int paramInt)
  {
    long l;
    if (paramInt == chunkCount - 1)
    {
      l = lastChunkDurationUs;
    }
    else
    {
      long[] arrayOfLong = chunkStartTimesUs;
      l = arrayOfLong[(paramInt + 1)] - arrayOfLong[paramInt];
    }
    return l;
  }
  
  public int getChunkIndex(long paramLong)
  {
    return Util.binarySearchFloor(chunkStartTimesUs, paramLong, true, true);
  }
  
  public long getStartTimeUs(int paramInt)
  {
    return chunkStartTimesUs[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */