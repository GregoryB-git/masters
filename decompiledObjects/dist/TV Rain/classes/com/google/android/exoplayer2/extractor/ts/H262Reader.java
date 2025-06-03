package com.google.android.exoplayer2.extractor.ts;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;
import java.util.Collections;

public final class H262Reader
  implements ElementaryStreamReader
{
  private static final double[] FRAME_RATE_VALUES = { 23.976023976023978D, 24.0D, 25.0D, 29.97002997002997D, 30.0D, 50.0D, 59.94005994005994D, 60.0D };
  private static final int START_EXTENSION = 181;
  private static final int START_GROUP = 184;
  private static final int START_PICTURE = 0;
  private static final int START_SEQUENCE_HEADER = 179;
  private static final int START_USER_DATA = 178;
  private final CsdBuffer csdBuffer;
  private String formatId;
  private long frameDurationUs;
  private boolean hasOutputFormat;
  private TrackOutput output;
  private long pesTimeUs;
  private final boolean[] prefixFlags;
  private boolean sampleHasPicture;
  private boolean sampleIsKeyframe;
  private long samplePosition;
  private long sampleTimeUs;
  private boolean startedFirstSample;
  private long totalBytesWritten;
  private final NalUnitTargetBuffer userData;
  private final ParsableByteArray userDataParsable;
  private final UserDataReader userDataReader;
  
  public H262Reader()
  {
    this(null);
  }
  
  public H262Reader(UserDataReader paramUserDataReader)
  {
    userDataReader = paramUserDataReader;
    prefixFlags = new boolean[4];
    csdBuffer = new CsdBuffer(128);
    if (paramUserDataReader != null)
    {
      userData = new NalUnitTargetBuffer(178, 128);
      userDataParsable = new ParsableByteArray();
    }
    else
    {
      userData = null;
      userDataParsable = null;
    }
  }
  
  private static Pair<Format, Long> parseCsdBuffer(CsdBuffer paramCsdBuffer, String paramString)
  {
    byte[] arrayOfByte = Arrays.copyOf(data, length);
    int i = arrayOfByte[4];
    int j = arrayOfByte[5] & 0xFF;
    int k = arrayOfByte[6];
    i = (i & 0xFF) << 4 | j >> 4;
    k = (j & 0xF) << 8 | k & 0xFF;
    j = (arrayOfByte[7] & 0xF0) >> 4;
    if (j != 2) {
      if (j != 3) {
        if (j == 4) {}
      }
    }
    for (float f = 1.0F;; f /= j)
    {
      break;
      f = k * 121;
      j = i * 100;
      continue;
      f = k * 16;
      j = i * 9;
      continue;
      f = k * 4;
      j = i * 3;
    }
    paramString = Format.createVideoSampleFormat(paramString, "video/mpeg2", null, -1, -1, i, k, -1.0F, Collections.singletonList(arrayOfByte), -1, f, null);
    long l1 = 0L;
    j = (arrayOfByte[7] & 0xF) - 1;
    long l2 = l1;
    if (j >= 0)
    {
      double[] arrayOfDouble = FRAME_RATE_VALUES;
      l2 = l1;
      if (j < arrayOfDouble.length)
      {
        double d1 = arrayOfDouble[j];
        i = arrayOfByte[(sequenceExtensionPosition + 9)];
        j = (i & 0x60) >> 5;
        i &= 0x1F;
        double d2 = d1;
        if (j != i) {
          d2 = d1 * ((j + 1.0D) / (i + 1));
        }
        l2 = (1000000.0D / d2);
      }
    }
    return Pair.create(paramString, Long.valueOf(l2));
  }
  
  public void consume(ParsableByteArray paramParsableByteArray)
  {
    int i = paramParsableByteArray.getPosition();
    int j = paramParsableByteArray.limit();
    byte[] arrayOfByte = data;
    totalBytesWritten += paramParsableByteArray.bytesLeft();
    output.sampleData(paramParsableByteArray, paramParsableByteArray.bytesLeft());
    for (;;)
    {
      int k = NalUnitUtil.findNalUnit(arrayOfByte, i, j, prefixFlags);
      if (k == j)
      {
        if (!hasOutputFormat) {
          csdBuffer.onData(arrayOfByte, i, j);
        }
        if (userDataReader != null) {
          userData.appendToNalUnit(arrayOfByte, i, j);
        }
        return;
      }
      Object localObject = data;
      int m = k + 3;
      int n = localObject[m] & 0xFF;
      int i1 = k - i;
      boolean bool1 = hasOutputFormat;
      boolean bool2 = false;
      if (!bool1)
      {
        if (i1 > 0) {
          csdBuffer.onData(arrayOfByte, i, k);
        }
        int i2;
        if (i1 < 0) {
          i2 = -i1;
        } else {
          i2 = 0;
        }
        if (csdBuffer.onStartCode(n, i2))
        {
          localObject = parseCsdBuffer(csdBuffer, formatId);
          output.format((Format)first);
          frameDurationUs = ((Long)second).longValue();
          hasOutputFormat = true;
        }
      }
      if (userDataReader != null)
      {
        if (i1 > 0)
        {
          userData.appendToNalUnit(arrayOfByte, i, k);
          i = 0;
        }
        else
        {
          i = -i1;
        }
        if (userData.endNalUnit(i))
        {
          localObject = userData;
          i = NalUnitUtil.unescapeStream(nalData, nalLength);
          userDataParsable.reset(userData.nalData, i);
          userDataReader.consume(sampleTimeUs, userDataParsable);
        }
        if ((n == 178) && (data[(k + 2)] == 1)) {
          userData.startNalUnit(n);
        }
      }
      if ((n != 0) && (n != 179))
      {
        if (n == 184) {
          sampleIsKeyframe = true;
        }
      }
      else
      {
        k = j - k;
        if ((startedFirstSample) && (sampleHasPicture) && (hasOutputFormat))
        {
          int i3 = sampleIsKeyframe;
          i = (int)(totalBytesWritten - samplePosition);
          output.sampleMetadata(sampleTimeUs, i3, i - k, k, null);
        }
        bool1 = startedFirstSample;
        if ((!bool1) || (sampleHasPicture))
        {
          samplePosition = (totalBytesWritten - k);
          long l = pesTimeUs;
          if (l == -9223372036854775807L) {
            if (bool1) {
              l = sampleTimeUs + frameDurationUs;
            } else {
              l = 0L;
            }
          }
          sampleTimeUs = l;
          sampleIsKeyframe = false;
          pesTimeUs = -9223372036854775807L;
          startedFirstSample = true;
        }
        if (n == 0) {
          bool2 = true;
        }
        sampleHasPicture = bool2;
      }
      i = m;
    }
  }
  
  public void createTracks(ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator)
  {
    paramTrackIdGenerator.generateNewId();
    formatId = paramTrackIdGenerator.getFormatId();
    output = paramExtractorOutput.track(paramTrackIdGenerator.getTrackId(), 2);
    UserDataReader localUserDataReader = userDataReader;
    if (localUserDataReader != null) {
      localUserDataReader.createTracks(paramExtractorOutput, paramTrackIdGenerator);
    }
  }
  
  public void packetFinished() {}
  
  public void packetStarted(long paramLong, boolean paramBoolean)
  {
    pesTimeUs = paramLong;
  }
  
  public void seek()
  {
    NalUnitUtil.clearPrefixFlags(prefixFlags);
    csdBuffer.reset();
    if (userDataReader != null) {
      userData.reset();
    }
    totalBytesWritten = 0L;
    startedFirstSample = false;
  }
  
  public static final class CsdBuffer
  {
    private static final byte[] START_CODE = { 0, 0, 1 };
    public byte[] data;
    private boolean isFilling;
    public int length;
    public int sequenceExtensionPosition;
    
    public CsdBuffer(int paramInt)
    {
      data = new byte[paramInt];
    }
    
    public void onData(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (!isFilling) {
        return;
      }
      paramInt2 -= paramInt1;
      byte[] arrayOfByte = data;
      int i = arrayOfByte.length;
      int j = length;
      if (i < j + paramInt2) {
        data = Arrays.copyOf(arrayOfByte, (j + paramInt2) * 2);
      }
      System.arraycopy(paramArrayOfByte, paramInt1, data, length, paramInt2);
      length += paramInt2;
    }
    
    public boolean onStartCode(int paramInt1, int paramInt2)
    {
      if (isFilling)
      {
        paramInt2 = length - paramInt2;
        length = paramInt2;
        if ((sequenceExtensionPosition == 0) && (paramInt1 == 181))
        {
          sequenceExtensionPosition = paramInt2;
        }
        else
        {
          isFilling = false;
          return true;
        }
      }
      else if (paramInt1 == 179)
      {
        isFilling = true;
      }
      byte[] arrayOfByte = START_CODE;
      onData(arrayOfByte, 0, arrayOfByte.length);
      return false;
    }
    
    public void reset()
    {
      isFilling = false;
      length = 0;
      sequenceExtensionPosition = 0;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.H262Reader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */