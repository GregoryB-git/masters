package com.google.android.exoplayer2.extractor.amr;

import a;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import z2;
import z3;

public final class AmrExtractor
  implements Extractor
{
  public static final ExtractorsFactory FACTORY = new z3(12);
  public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
  private static final int MAX_FRAME_SIZE_BYTES = arrayOfInt[8];
  private static final int NUM_SAME_SIZE_CONSTANT_BIT_RATE_THRESHOLD = 20;
  private static final int SAMPLE_RATE_NB = 8000;
  private static final int SAMPLE_RATE_WB = 16000;
  private static final int SAMPLE_TIME_PER_FRAME_US = 20000;
  private static final byte[] amrSignatureNb;
  private static final byte[] amrSignatureWb;
  private static final int[] frameSizeBytesByTypeNb = { 13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1 };
  private static final int[] frameSizeBytesByTypeWb;
  private int currentSampleBytesRemaining;
  private int currentSampleSize;
  private long currentSampleTimeUs;
  private ExtractorOutput extractorOutput;
  private long firstSamplePosition;
  private int firstSampleSize;
  private final int flags;
  private boolean hasOutputFormat;
  private boolean hasOutputSeekMap;
  private boolean isWideBand;
  private int numSamplesWithSameSize;
  private final byte[] scratch;
  @Nullable
  private SeekMap seekMap;
  private long timeOffsetUs;
  private TrackOutput trackOutput;
  
  static
  {
    int[] arrayOfInt = new int[16];
    arrayOfInt[0] = 18;
    arrayOfInt[1] = 24;
    arrayOfInt[2] = 33;
    arrayOfInt[3] = 37;
    arrayOfInt[4] = 41;
    arrayOfInt[5] = 47;
    arrayOfInt[6] = 51;
    arrayOfInt[7] = 59;
    arrayOfInt[8] = 61;
    arrayOfInt[9] = 6;
    arrayOfInt[10] = 1;
    arrayOfInt[11] = 1;
    arrayOfInt[12] = 1;
    arrayOfInt[13] = 1;
    arrayOfInt[14] = 1;
    arrayOfInt[15] = 1;
    arrayOfInt;
    frameSizeBytesByTypeWb = arrayOfInt;
    amrSignatureNb = Util.getUtf8Bytes("#!AMR\n");
    amrSignatureWb = Util.getUtf8Bytes("#!AMR-WB\n");
  }
  
  public AmrExtractor()
  {
    this(0);
  }
  
  public AmrExtractor(int paramInt)
  {
    flags = paramInt;
    scratch = new byte[1];
    firstSampleSize = -1;
  }
  
  public static byte[] amrSignatureNb()
  {
    byte[] arrayOfByte = amrSignatureNb;
    return Arrays.copyOf(arrayOfByte, arrayOfByte.length);
  }
  
  public static byte[] amrSignatureWb()
  {
    byte[] arrayOfByte = amrSignatureWb;
    return Arrays.copyOf(arrayOfByte, arrayOfByte.length);
  }
  
  public static int frameSizeBytesByTypeNb(int paramInt)
  {
    return frameSizeBytesByTypeNb[paramInt];
  }
  
  public static int frameSizeBytesByTypeWb(int paramInt)
  {
    return frameSizeBytesByTypeWb[paramInt];
  }
  
  private static int getBitrateFromFrameSize(int paramInt, long paramLong)
  {
    return (int)(paramInt * 8 * 1000000L / paramLong);
  }
  
  private SeekMap getConstantBitrateSeekMap(long paramLong)
  {
    int i = getBitrateFromFrameSize(firstSampleSize, 20000L);
    return new ConstantBitrateSeekMap(paramLong, firstSamplePosition, i, firstSampleSize);
  }
  
  private int getFrameSizeInBytes(int paramInt)
    throws ParserException
  {
    if (!isValidFrameType(paramInt))
    {
      StringBuilder localStringBuilder = z2.t("Illegal AMR ");
      String str;
      if (isWideBand) {
        str = "WB";
      } else {
        str = "NB";
      }
      localStringBuilder.append(str);
      localStringBuilder.append(" frame type ");
      localStringBuilder.append(paramInt);
      throw new ParserException(localStringBuilder.toString());
    }
    if (isWideBand) {
      paramInt = frameSizeBytesByTypeWb[paramInt];
    } else {
      paramInt = frameSizeBytesByTypeNb[paramInt];
    }
    return paramInt;
  }
  
  private boolean isNarrowBandValidFrameType(int paramInt)
  {
    boolean bool;
    if ((!isWideBand) && ((paramInt < 12) || (paramInt > 14))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isValidFrameType(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= 15) && ((isWideBandValidFrameType(paramInt)) || (isNarrowBandValidFrameType(paramInt)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isWideBandValidFrameType(int paramInt)
  {
    boolean bool;
    if ((isWideBand) && ((paramInt < 10) || (paramInt > 13))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void maybeOutputFormat()
  {
    if (!hasOutputFormat)
    {
      hasOutputFormat = true;
      boolean bool = isWideBand;
      String str;
      if (bool) {
        str = "audio/amr-wb";
      } else {
        str = "audio/3gpp";
      }
      int i;
      if (bool) {
        i = 16000;
      } else {
        i = 8000;
      }
      trackOutput.format(Format.createAudioSampleFormat(null, str, null, -1, MAX_FRAME_SIZE_BYTES, 1, i, -1, null, null, 0, null));
    }
  }
  
  private void maybeOutputSeekMap(long paramLong, int paramInt)
  {
    if (hasOutputSeekMap) {
      return;
    }
    if (((flags & 0x1) != 0) && (paramLong != -1L))
    {
      int i = firstSampleSize;
      if ((i == -1) || (i == currentSampleSize))
      {
        if ((numSamplesWithSameSize < 20) && (paramInt != -1)) {
          return;
        }
        localObject = getConstantBitrateSeekMap(paramLong);
        seekMap = ((SeekMap)localObject);
        extractorOutput.seekMap((SeekMap)localObject);
        hasOutputSeekMap = true;
        return;
      }
    }
    Object localObject = new SeekMap.Unseekable(-9223372036854775807L);
    seekMap = ((SeekMap)localObject);
    extractorOutput.seekMap((SeekMap)localObject);
    hasOutputSeekMap = true;
  }
  
  private boolean peekAmrSignature(ExtractorInput paramExtractorInput, byte[] paramArrayOfByte)
    throws IOException, InterruptedException
  {
    paramExtractorInput.resetPeekPosition();
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    paramExtractorInput.peekFully(arrayOfByte, 0, paramArrayOfByte.length);
    return Arrays.equals(arrayOfByte, paramArrayOfByte);
  }
  
  private int peekNextSampleSize(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    paramExtractorInput.resetPeekPosition();
    paramExtractorInput.peekFully(scratch, 0, 1);
    int i = scratch[0];
    if ((i & 0x83) <= 0) {
      return getFrameSizeInBytes(i >> 3 & 0xF);
    }
    throw new ParserException(a.f("Invalid padding bits for frame header ", i));
  }
  
  private boolean readAmrHeader(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    byte[] arrayOfByte = amrSignatureNb;
    if (peekAmrSignature(paramExtractorInput, arrayOfByte))
    {
      isWideBand = false;
      paramExtractorInput.skipFully(arrayOfByte.length);
      return true;
    }
    arrayOfByte = amrSignatureWb;
    if (peekAmrSignature(paramExtractorInput, arrayOfByte))
    {
      isWideBand = true;
      paramExtractorInput.skipFully(arrayOfByte.length);
      return true;
    }
    return false;
  }
  
  private int readSample(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    if (currentSampleBytesRemaining == 0) {
      try
      {
        i = peekNextSampleSize(paramExtractorInput);
        currentSampleSize = i;
        currentSampleBytesRemaining = i;
        if (firstSampleSize == -1)
        {
          firstSamplePosition = paramExtractorInput.getPosition();
          firstSampleSize = currentSampleSize;
        }
        if (firstSampleSize == currentSampleSize) {
          numSamplesWithSameSize += 1;
        }
      }
      catch (EOFException paramExtractorInput)
      {
        return -1;
      }
    }
    int i = trackOutput.sampleData(paramExtractorInput, currentSampleBytesRemaining, true);
    if (i == -1) {
      return -1;
    }
    i = currentSampleBytesRemaining - i;
    currentSampleBytesRemaining = i;
    if (i > 0) {
      return 0;
    }
    trackOutput.sampleMetadata(timeOffsetUs + currentSampleTimeUs, 1, currentSampleSize, 0, null);
    currentSampleTimeUs += 20000L;
    return 0;
  }
  
  public void init(ExtractorOutput paramExtractorOutput)
  {
    extractorOutput = paramExtractorOutput;
    trackOutput = paramExtractorOutput.track(0, 1);
    paramExtractorOutput.endTracks();
  }
  
  public int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    if ((paramExtractorInput.getPosition() == 0L) && (!readAmrHeader(paramExtractorInput))) {
      throw new ParserException("Could not find AMR header.");
    }
    maybeOutputFormat();
    int i = readSample(paramExtractorInput);
    maybeOutputSeekMap(paramExtractorInput.getLength(), i);
    return i;
  }
  
  public void release() {}
  
  public void seek(long paramLong1, long paramLong2)
  {
    currentSampleTimeUs = 0L;
    currentSampleSize = 0;
    currentSampleBytesRemaining = 0;
    if (paramLong1 != 0L)
    {
      SeekMap localSeekMap = seekMap;
      if ((localSeekMap instanceof ConstantBitrateSeekMap))
      {
        timeOffsetUs = ((ConstantBitrateSeekMap)localSeekMap).getTimeUsAtPosition(paramLong1);
        return;
      }
    }
    timeOffsetUs = 0L;
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    return readAmrHeader(paramExtractorInput);
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Flags {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.amr.AmrExtractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */