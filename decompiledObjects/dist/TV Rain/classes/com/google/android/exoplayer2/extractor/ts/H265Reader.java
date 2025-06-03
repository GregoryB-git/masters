package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.ParsableNalUnitBitArray;
import java.util.Collections;

public final class H265Reader
  implements ElementaryStreamReader
{
  private static final int BLA_W_LP = 16;
  private static final int CRA_NUT = 21;
  private static final int PPS_NUT = 34;
  private static final int PREFIX_SEI_NUT = 39;
  private static final int RASL_R = 9;
  private static final int SPS_NUT = 33;
  private static final int SUFFIX_SEI_NUT = 40;
  private static final String TAG = "H265Reader";
  private static final int VPS_NUT = 32;
  private String formatId;
  private boolean hasOutputFormat;
  private TrackOutput output;
  private long pesTimeUs;
  private final NalUnitTargetBuffer pps;
  private final boolean[] prefixFlags;
  private final NalUnitTargetBuffer prefixSei;
  private SampleReader sampleReader;
  private final SeiReader seiReader;
  private final ParsableByteArray seiWrapper;
  private final NalUnitTargetBuffer sps;
  private final NalUnitTargetBuffer suffixSei;
  private long totalBytesWritten;
  private final NalUnitTargetBuffer vps;
  
  public H265Reader(SeiReader paramSeiReader)
  {
    seiReader = paramSeiReader;
    prefixFlags = new boolean[3];
    vps = new NalUnitTargetBuffer(32, 128);
    sps = new NalUnitTargetBuffer(33, 128);
    pps = new NalUnitTargetBuffer(34, 128);
    prefixSei = new NalUnitTargetBuffer(39, 128);
    suffixSei = new NalUnitTargetBuffer(40, 128);
    seiWrapper = new ParsableByteArray();
  }
  
  private void endNalUnit(long paramLong1, int paramInt1, int paramInt2, long paramLong2)
  {
    if (hasOutputFormat)
    {
      sampleReader.endNalUnit(paramLong1, paramInt1);
    }
    else
    {
      vps.endNalUnit(paramInt2);
      sps.endNalUnit(paramInt2);
      pps.endNalUnit(paramInt2);
      if ((vps.isCompleted()) && (sps.isCompleted()) && (pps.isCompleted()))
      {
        output.format(parseMediaFormat(formatId, vps, sps, pps));
        hasOutputFormat = true;
      }
    }
    NalUnitTargetBuffer localNalUnitTargetBuffer;
    if (prefixSei.endNalUnit(paramInt2))
    {
      localNalUnitTargetBuffer = prefixSei;
      paramInt1 = NalUnitUtil.unescapeStream(nalData, nalLength);
      seiWrapper.reset(prefixSei.nalData, paramInt1);
      seiWrapper.skipBytes(5);
      seiReader.consume(paramLong2, seiWrapper);
    }
    if (suffixSei.endNalUnit(paramInt2))
    {
      localNalUnitTargetBuffer = suffixSei;
      paramInt1 = NalUnitUtil.unescapeStream(nalData, nalLength);
      seiWrapper.reset(suffixSei.nalData, paramInt1);
      seiWrapper.skipBytes(5);
      seiReader.consume(paramLong2, seiWrapper);
    }
  }
  
  private void nalUnitData(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (hasOutputFormat)
    {
      sampleReader.readNalUnitData(paramArrayOfByte, paramInt1, paramInt2);
    }
    else
    {
      vps.appendToNalUnit(paramArrayOfByte, paramInt1, paramInt2);
      sps.appendToNalUnit(paramArrayOfByte, paramInt1, paramInt2);
      pps.appendToNalUnit(paramArrayOfByte, paramInt1, paramInt2);
    }
    prefixSei.appendToNalUnit(paramArrayOfByte, paramInt1, paramInt2);
    suffixSei.appendToNalUnit(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  private static Format parseMediaFormat(String paramString, NalUnitTargetBuffer paramNalUnitTargetBuffer1, NalUnitTargetBuffer paramNalUnitTargetBuffer2, NalUnitTargetBuffer paramNalUnitTargetBuffer3)
  {
    int i = nalLength;
    byte[] arrayOfByte1 = new byte[nalLength + i + nalLength];
    byte[] arrayOfByte2 = nalData;
    int j = 0;
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, i);
    System.arraycopy(nalData, 0, arrayOfByte1, nalLength, nalLength);
    System.arraycopy(nalData, 0, arrayOfByte1, nalLength + nalLength, nalLength);
    paramNalUnitTargetBuffer1 = new ParsableNalUnitBitArray(nalData, 0, nalLength);
    paramNalUnitTargetBuffer1.skipBits(44);
    int k = paramNalUnitTargetBuffer1.readBits(3);
    paramNalUnitTargetBuffer1.skipBit();
    paramNalUnitTargetBuffer1.skipBits(88);
    paramNalUnitTargetBuffer1.skipBits(8);
    int m = 0;
    int n = m;
    while (m < k)
    {
      i = n;
      if (paramNalUnitTargetBuffer1.readBit()) {
        i = n + 89;
      }
      n = i;
      if (paramNalUnitTargetBuffer1.readBit()) {
        n = i + 8;
      }
      m++;
    }
    paramNalUnitTargetBuffer1.skipBits(n);
    if (k > 0) {
      paramNalUnitTargetBuffer1.skipBits((8 - k) * 2);
    }
    paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    int i1 = paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    if (i1 == 3) {
      paramNalUnitTargetBuffer1.skipBit();
    }
    int i2 = paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    int i3 = paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    m = i2;
    n = i3;
    if (paramNalUnitTargetBuffer1.readBit())
    {
      int i4 = paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
      m = paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
      int i5 = paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
      int i6 = paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
      if ((i1 != 1) && (i1 != 2)) {
        i = 1;
      } else {
        i = 2;
      }
      if (i1 == 1) {
        n = 2;
      } else {
        n = 1;
      }
      m = i2 - (i4 + m) * i;
      n = i3 - (i5 + i6) * n;
    }
    paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    i3 = paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    if (paramNalUnitTargetBuffer1.readBit()) {
      i = 0;
    }
    for (i = k; i <= k; i++)
    {
      paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
      paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
      paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    }
    paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
    if ((paramNalUnitTargetBuffer1.readBit()) && (paramNalUnitTargetBuffer1.readBit())) {
      skipScalingList(paramNalUnitTargetBuffer1);
    }
    paramNalUnitTargetBuffer1.skipBits(2);
    if (paramNalUnitTargetBuffer1.readBit())
    {
      paramNalUnitTargetBuffer1.skipBits(8);
      paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
      paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt();
      paramNalUnitTargetBuffer1.skipBit();
    }
    skipShortTermRefPicSets(paramNalUnitTargetBuffer1);
    if (paramNalUnitTargetBuffer1.readBit()) {
      for (i = j; i < paramNalUnitTargetBuffer1.readUnsignedExpGolombCodedInt(); i++) {
        paramNalUnitTargetBuffer1.skipBits(i3 + 4 + 1);
      }
    }
    paramNalUnitTargetBuffer1.skipBits(2);
    float f1 = 1.0F;
    float f2 = f1;
    if (paramNalUnitTargetBuffer1.readBit())
    {
      f2 = f1;
      if (paramNalUnitTargetBuffer1.readBit())
      {
        i = paramNalUnitTargetBuffer1.readBits(8);
        if (i == 255)
        {
          j = paramNalUnitTargetBuffer1.readBits(16);
          i = paramNalUnitTargetBuffer1.readBits(16);
          f2 = f1;
          if (j != 0)
          {
            f2 = f1;
            if (i != 0) {
              f2 = j / i;
            }
          }
        }
        else
        {
          paramNalUnitTargetBuffer1 = NalUnitUtil.ASPECT_RATIO_IDC_VALUES;
          if (i < paramNalUnitTargetBuffer1.length)
          {
            f2 = paramNalUnitTargetBuffer1[i];
          }
          else
          {
            paramNalUnitTargetBuffer1 = new StringBuilder();
            paramNalUnitTargetBuffer1.append("Unexpected aspect_ratio_idc value: ");
            paramNalUnitTargetBuffer1.append(i);
            Log.w("H265Reader", paramNalUnitTargetBuffer1.toString());
            f2 = f1;
          }
        }
      }
    }
    return Format.createVideoSampleFormat(paramString, "video/hevc", null, -1, -1, m, n, -1.0F, Collections.singletonList(arrayOfByte1), -1, f2, null);
  }
  
  private static void skipScalingList(ParsableNalUnitBitArray paramParsableNalUnitBitArray)
  {
    for (int i = 0; i < 4; i++)
    {
      int j = 0;
      while (j < 6)
      {
        boolean bool = paramParsableNalUnitBitArray.readBit();
        int k = 1;
        if (!bool)
        {
          paramParsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        else
        {
          int m = Math.min(64, 1 << (i << 1) + 4);
          if (i > 1) {
            paramParsableNalUnitBitArray.readSignedExpGolombCodedInt();
          }
          for (n = 0; n < m; n++) {
            paramParsableNalUnitBitArray.readSignedExpGolombCodedInt();
          }
        }
        int n = k;
        if (i == 3) {
          n = 3;
        }
        j += n;
      }
    }
  }
  
  private static void skipShortTermRefPicSets(ParsableNalUnitBitArray paramParsableNalUnitBitArray)
  {
    int i = paramParsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
    int j = 0;
    int k = j;
    int m = k;
    int n = k;
    k = j;
    while (k < i)
    {
      boolean bool;
      if (k != 0) {
        bool = paramParsableNalUnitBitArray.readBit();
      }
      if (bool)
      {
        paramParsableNalUnitBitArray.skipBit();
        paramParsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (i1 = 0;; i1++)
        {
          j = m;
          if (i1 > m) {
            break;
          }
          if (paramParsableNalUnitBitArray.readBit()) {
            paramParsableNalUnitBitArray.skipBit();
          }
        }
      }
      int i1 = paramParsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
      j = paramParsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
      for (m = 0; m < i1; m++)
      {
        paramParsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        paramParsableNalUnitBitArray.skipBit();
      }
      for (m = 0; m < j; m++)
      {
        paramParsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        paramParsableNalUnitBitArray.skipBit();
      }
      j = i1 + j;
      k++;
      m = j;
    }
  }
  
  private void startNalUnit(long paramLong1, int paramInt1, int paramInt2, long paramLong2)
  {
    if (hasOutputFormat)
    {
      sampleReader.startNalUnit(paramLong1, paramInt1, paramInt2, paramLong2);
    }
    else
    {
      vps.startNalUnit(paramInt2);
      sps.startNalUnit(paramInt2);
      pps.startNalUnit(paramInt2);
    }
    prefixSei.startNalUnit(paramInt2);
    suffixSei.startNalUnit(paramInt2);
  }
  
  public void consume(ParsableByteArray paramParsableByteArray)
  {
    if (paramParsableByteArray.bytesLeft() > 0)
    {
      int i = paramParsableByteArray.getPosition();
      int j = paramParsableByteArray.limit();
      byte[] arrayOfByte = data;
      totalBytesWritten += paramParsableByteArray.bytesLeft();
      output.sampleData(paramParsableByteArray, paramParsableByteArray.bytesLeft());
      while (i < j)
      {
        int k = NalUnitUtil.findNalUnit(arrayOfByte, i, j, prefixFlags);
        if (k == j)
        {
          nalUnitData(arrayOfByte, i, j);
          return;
        }
        int m = NalUnitUtil.getH265NalUnitType(arrayOfByte, k);
        int n = k - i;
        if (n > 0) {
          nalUnitData(arrayOfByte, i, k);
        }
        int i1 = j - k;
        long l = totalBytesWritten - i1;
        if (n < 0) {
          i = -n;
        } else {
          i = 0;
        }
        endNalUnit(l, i1, i, pesTimeUs);
        startNalUnit(l, i1, m, pesTimeUs);
        i = k + 3;
      }
    }
  }
  
  public void createTracks(ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator)
  {
    paramTrackIdGenerator.generateNewId();
    formatId = paramTrackIdGenerator.getFormatId();
    TrackOutput localTrackOutput = paramExtractorOutput.track(paramTrackIdGenerator.getTrackId(), 2);
    output = localTrackOutput;
    sampleReader = new SampleReader(localTrackOutput);
    seiReader.createTracks(paramExtractorOutput, paramTrackIdGenerator);
  }
  
  public void packetFinished() {}
  
  public void packetStarted(long paramLong, boolean paramBoolean)
  {
    pesTimeUs = paramLong;
  }
  
  public void seek()
  {
    NalUnitUtil.clearPrefixFlags(prefixFlags);
    vps.reset();
    sps.reset();
    pps.reset();
    prefixSei.reset();
    suffixSei.reset();
    sampleReader.reset();
    totalBytesWritten = 0L;
  }
  
  public static final class SampleReader
  {
    private static final int FIRST_SLICE_FLAG_OFFSET = 2;
    private boolean isFirstParameterSet;
    private boolean isFirstSlice;
    private boolean lookingForFirstSliceFlag;
    private int nalUnitBytesRead;
    private boolean nalUnitHasKeyframeData;
    private long nalUnitStartPosition;
    private long nalUnitTimeUs;
    private final TrackOutput output;
    private boolean readingSample;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean writingParameterSets;
    
    public SampleReader(TrackOutput paramTrackOutput)
    {
      output = paramTrackOutput;
    }
    
    private void outputSample(int paramInt)
    {
      int i = sampleIsKeyframe;
      int j = (int)(nalUnitStartPosition - samplePosition);
      output.sampleMetadata(sampleTimeUs, i, j, paramInt, null);
    }
    
    public void endNalUnit(long paramLong, int paramInt)
    {
      if ((writingParameterSets) && (isFirstSlice))
      {
        sampleIsKeyframe = nalUnitHasKeyframeData;
        writingParameterSets = false;
      }
      else if ((isFirstParameterSet) || (isFirstSlice))
      {
        if (readingSample) {
          outputSample(paramInt + (int)(paramLong - nalUnitStartPosition));
        }
        samplePosition = nalUnitStartPosition;
        sampleTimeUs = nalUnitTimeUs;
        readingSample = true;
        sampleIsKeyframe = nalUnitHasKeyframeData;
      }
    }
    
    public void readNalUnitData(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      if (lookingForFirstSliceFlag)
      {
        int i = nalUnitBytesRead;
        int j = paramInt1 + 2 - i;
        if (j < paramInt2)
        {
          boolean bool;
          if ((paramArrayOfByte[j] & 0x80) != 0) {
            bool = true;
          } else {
            bool = false;
          }
          isFirstSlice = bool;
          lookingForFirstSliceFlag = false;
        }
        else
        {
          nalUnitBytesRead = (paramInt2 - paramInt1 + i);
        }
      }
    }
    
    public void reset()
    {
      lookingForFirstSliceFlag = false;
      isFirstSlice = false;
      isFirstParameterSet = false;
      readingSample = false;
      writingParameterSets = false;
    }
    
    public void startNalUnit(long paramLong1, int paramInt1, int paramInt2, long paramLong2)
    {
      boolean bool1 = false;
      isFirstSlice = false;
      isFirstParameterSet = false;
      nalUnitTimeUs = paramLong2;
      nalUnitBytesRead = 0;
      nalUnitStartPosition = paramLong1;
      if (paramInt2 >= 32)
      {
        if ((!writingParameterSets) && (readingSample))
        {
          outputSample(paramInt1);
          readingSample = false;
        }
        if (paramInt2 <= 34)
        {
          isFirstParameterSet = (writingParameterSets ^ true);
          writingParameterSets = true;
        }
      }
      boolean bool2;
      if ((paramInt2 >= 16) && (paramInt2 <= 21)) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      nalUnitHasKeyframeData = bool2;
      if (!bool2)
      {
        bool2 = bool1;
        if (paramInt2 > 9) {}
      }
      else
      {
        bool2 = true;
      }
      lookingForFirstSliceFlag = bool2;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.H265Reader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */