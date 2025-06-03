package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.NalUnitUtil.PpsData;
import com.google.android.exoplayer2.util.NalUnitUtil.SpsData;
import com.google.android.exoplayer2.util.ParsableNalUnitBitArray;
import java.util.Arrays;

final class H264Reader$SampleReader
{
  private static final int DEFAULT_BUFFER_SIZE = 128;
  private static final int NAL_UNIT_TYPE_AUD = 9;
  private static final int NAL_UNIT_TYPE_IDR = 5;
  private static final int NAL_UNIT_TYPE_NON_IDR = 1;
  private static final int NAL_UNIT_TYPE_PARTITION_A = 2;
  private final boolean allowNonIdrKeyframes;
  private final ParsableNalUnitBitArray bitArray;
  private byte[] buffer;
  private int bufferLength;
  private final boolean detectAccessUnits;
  private boolean isFilling;
  private long nalUnitStartPosition;
  private long nalUnitTimeUs;
  private int nalUnitType;
  private final TrackOutput output;
  private final SparseArray<NalUnitUtil.PpsData> pps;
  private SliceHeaderData previousSliceHeader;
  private boolean readingSample;
  private boolean sampleIsKeyframe;
  private long samplePosition;
  private long sampleTimeUs;
  private SliceHeaderData sliceHeader;
  private final SparseArray<NalUnitUtil.SpsData> sps;
  
  public H264Reader$SampleReader(TrackOutput paramTrackOutput, boolean paramBoolean1, boolean paramBoolean2)
  {
    output = paramTrackOutput;
    allowNonIdrKeyframes = paramBoolean1;
    detectAccessUnits = paramBoolean2;
    sps = new SparseArray();
    pps = new SparseArray();
    previousSliceHeader = new SliceHeaderData(null);
    sliceHeader = new SliceHeaderData(null);
    paramTrackOutput = new byte[''];
    buffer = paramTrackOutput;
    bitArray = new ParsableNalUnitBitArray(paramTrackOutput, 0, 0);
    reset();
  }
  
  private void outputSample(int paramInt)
  {
    int i = sampleIsKeyframe;
    int j = (int)(nalUnitStartPosition - samplePosition);
    output.sampleMetadata(sampleTimeUs, i, j, paramInt, null);
  }
  
  public void appendToNalUnit(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!isFilling) {
      return;
    }
    int i = paramInt2 - paramInt1;
    Object localObject = buffer;
    int j = localObject.length;
    paramInt2 = bufferLength;
    if (j < paramInt2 + i) {
      buffer = Arrays.copyOf((byte[])localObject, (paramInt2 + i) * 2);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, buffer, bufferLength, i);
    paramInt1 = bufferLength + i;
    bufferLength = paramInt1;
    bitArray.reset(buffer, 0, paramInt1);
    if (!bitArray.canReadBits(8)) {
      return;
    }
    bitArray.skipBit();
    int k = bitArray.readBits(2);
    bitArray.skipBits(5);
    if (!bitArray.canReadExpGolombCodedNum()) {
      return;
    }
    bitArray.readUnsignedExpGolombCodedInt();
    if (!bitArray.canReadExpGolombCodedNum()) {
      return;
    }
    int m = bitArray.readUnsignedExpGolombCodedInt();
    if (!detectAccessUnits)
    {
      isFilling = false;
      sliceHeader.setSliceType(m);
      return;
    }
    if (!bitArray.canReadExpGolombCodedNum()) {
      return;
    }
    int n = bitArray.readUnsignedExpGolombCodedInt();
    if (pps.indexOfKey(n) < 0)
    {
      isFilling = false;
      return;
    }
    localObject = (NalUnitUtil.PpsData)pps.get(n);
    paramArrayOfByte = (NalUnitUtil.SpsData)sps.get(seqParameterSetId);
    if (separateColorPlaneFlag)
    {
      if (!bitArray.canReadBits(2)) {
        return;
      }
      bitArray.skipBits(2);
    }
    if (!bitArray.canReadBits(frameNumLength)) {
      return;
    }
    int i1 = bitArray.readBits(frameNumLength);
    boolean bool1;
    if (!frameMbsOnlyFlag)
    {
      if (!bitArray.canReadBits(1)) {
        return;
      }
      bool1 = bitArray.readBit();
      if (bool1)
      {
        if (!bitArray.canReadBits(1)) {
          return;
        }
        bool2 = bitArray.readBit();
        bool3 = true;
        break label388;
      }
    }
    else
    {
      bool1 = false;
    }
    boolean bool3 = false;
    boolean bool2 = false;
    label388:
    boolean bool4;
    if (nalUnitType == 5) {
      bool4 = true;
    } else {
      bool4 = false;
    }
    int i2;
    if (bool4)
    {
      if (!bitArray.canReadExpGolombCodedNum()) {
        return;
      }
      i2 = bitArray.readUnsignedExpGolombCodedInt();
    }
    else
    {
      i2 = 0;
    }
    paramInt1 = picOrderCountType;
    if (paramInt1 == 0)
    {
      if (!bitArray.canReadBits(picOrderCntLsbLength)) {
        return;
      }
      paramInt2 = bitArray.readBits(picOrderCntLsbLength);
      if ((bottomFieldPicOrderInFramePresentFlag) && (!bool1))
      {
        if (!bitArray.canReadExpGolombCodedNum()) {
          return;
        }
        j = bitArray.readSignedExpGolombCodedInt();
        paramInt1 = 0;
        break label605;
      }
    }
    else
    {
      if ((paramInt1 == 1) && (!deltaPicOrderAlwaysZeroFlag))
      {
        if (!bitArray.canReadExpGolombCodedNum()) {
          return;
        }
        i = bitArray.readSignedExpGolombCodedInt();
        if ((bottomFieldPicOrderInFramePresentFlag) && (!bool1))
        {
          if (!bitArray.canReadExpGolombCodedNum()) {
            return;
          }
          i3 = bitArray.readSignedExpGolombCodedInt();
          paramInt1 = 0;
          j = paramInt1;
          break label613;
        }
        paramInt1 = 0;
        j = paramInt1;
        i3 = j;
        break label613;
      }
      paramInt2 = 0;
    }
    j = 0;
    paramInt1 = 0;
    label605:
    int i3 = paramInt1;
    i = paramInt1;
    paramInt1 = paramInt2;
    label613:
    sliceHeader.setAll(paramArrayOfByte, k, m, i1, n, bool1, bool3, bool2, bool4, i2, paramInt1, j, i, i3);
    isFilling = false;
  }
  
  public void endNalUnit(long paramLong, int paramInt)
  {
    int i = nalUnitType;
    int j = 0;
    if ((i == 9) || ((detectAccessUnits) && (SliceHeaderData.access$100(sliceHeader, previousSliceHeader))))
    {
      if (readingSample) {
        outputSample(paramInt + (int)(paramLong - nalUnitStartPosition));
      }
      samplePosition = nalUnitStartPosition;
      sampleTimeUs = nalUnitTimeUs;
      sampleIsKeyframe = false;
      readingSample = true;
    }
    int k = sampleIsKeyframe;
    i = nalUnitType;
    if (i != 5)
    {
      paramInt = j;
      if (allowNonIdrKeyframes)
      {
        paramInt = j;
        if (i == 1)
        {
          paramInt = j;
          if (!sliceHeader.isISlice()) {}
        }
      }
    }
    else
    {
      paramInt = 1;
    }
    sampleIsKeyframe = (k | paramInt);
  }
  
  public boolean needsSpsPps()
  {
    return detectAccessUnits;
  }
  
  public void putPps(NalUnitUtil.PpsData paramPpsData)
  {
    pps.append(picParameterSetId, paramPpsData);
  }
  
  public void putSps(NalUnitUtil.SpsData paramSpsData)
  {
    sps.append(seqParameterSetId, paramSpsData);
  }
  
  public void reset()
  {
    isFilling = false;
    readingSample = false;
    sliceHeader.clear();
  }
  
  public void startNalUnit(long paramLong1, int paramInt, long paramLong2)
  {
    nalUnitType = paramInt;
    nalUnitTimeUs = paramLong2;
    nalUnitStartPosition = paramLong1;
    if (((allowNonIdrKeyframes) && (paramInt == 1)) || ((detectAccessUnits) && ((paramInt == 5) || (paramInt == 1) || (paramInt == 2))))
    {
      SliceHeaderData localSliceHeaderData = previousSliceHeader;
      previousSliceHeader = sliceHeader;
      sliceHeader = localSliceHeaderData;
      localSliceHeaderData.clear();
      bufferLength = 0;
      isFilling = true;
    }
  }
  
  public static final class SliceHeaderData
  {
    private static final int SLICE_TYPE_ALL_I = 7;
    private static final int SLICE_TYPE_I = 2;
    private boolean bottomFieldFlag;
    private boolean bottomFieldFlagPresent;
    private int deltaPicOrderCnt0;
    private int deltaPicOrderCnt1;
    private int deltaPicOrderCntBottom;
    private boolean fieldPicFlag;
    private int frameNum;
    private boolean hasSliceType;
    private boolean idrPicFlag;
    private int idrPicId;
    private boolean isComplete;
    private int nalRefIdc;
    private int picOrderCntLsb;
    private int picParameterSetId;
    private int sliceType;
    private NalUnitUtil.SpsData spsData;
    
    private boolean isFirstVclNalUnitOfPicture(SliceHeaderData paramSliceHeaderData)
    {
      boolean bool1 = isComplete;
      boolean bool2 = true;
      if (bool1)
      {
        bool1 = bool2;
        if (!isComplete) {
          return bool1;
        }
        bool1 = bool2;
        if (frameNum != frameNum) {
          return bool1;
        }
        bool1 = bool2;
        if (picParameterSetId != picParameterSetId) {
          return bool1;
        }
        bool1 = bool2;
        if (fieldPicFlag != fieldPicFlag) {
          return bool1;
        }
        if ((bottomFieldFlagPresent) && (bottomFieldFlagPresent))
        {
          bool1 = bool2;
          if (bottomFieldFlag != bottomFieldFlag) {
            return bool1;
          }
        }
        int i = nalRefIdc;
        int j = nalRefIdc;
        if (i != j)
        {
          bool1 = bool2;
          if (i == 0) {
            return bool1;
          }
          bool1 = bool2;
          if (j == 0) {
            return bool1;
          }
        }
        j = spsData.picOrderCountType;
        if ((j == 0) && (spsData.picOrderCountType == 0))
        {
          bool1 = bool2;
          if (picOrderCntLsb != picOrderCntLsb) {
            return bool1;
          }
          bool1 = bool2;
          if (deltaPicOrderCntBottom != deltaPicOrderCntBottom) {
            return bool1;
          }
        }
        if ((j == 1) && (spsData.picOrderCountType == 1))
        {
          bool1 = bool2;
          if (deltaPicOrderCnt0 != deltaPicOrderCnt0) {
            return bool1;
          }
          bool1 = bool2;
          if (deltaPicOrderCnt1 != deltaPicOrderCnt1) {
            return bool1;
          }
        }
        boolean bool3 = idrPicFlag;
        boolean bool4 = idrPicFlag;
        bool1 = bool2;
        if (bool3 != bool4) {
          return bool1;
        }
        if ((bool3) && (bool4) && (idrPicId != idrPicId)) {
          return bool2;
        }
      }
      bool1 = false;
      return bool1;
    }
    
    public void clear()
    {
      hasSliceType = false;
      isComplete = false;
    }
    
    public boolean isISlice()
    {
      if (hasSliceType)
      {
        int i = sliceType;
        if ((i == 7) || (i == 2)) {
          return true;
        }
      }
      boolean bool = false;
      return bool;
    }
    
    public void setAll(NalUnitUtil.SpsData paramSpsData, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
    {
      spsData = paramSpsData;
      nalRefIdc = paramInt1;
      sliceType = paramInt2;
      frameNum = paramInt3;
      picParameterSetId = paramInt4;
      fieldPicFlag = paramBoolean1;
      bottomFieldFlagPresent = paramBoolean2;
      bottomFieldFlag = paramBoolean3;
      idrPicFlag = paramBoolean4;
      idrPicId = paramInt5;
      picOrderCntLsb = paramInt6;
      deltaPicOrderCntBottom = paramInt7;
      deltaPicOrderCnt0 = paramInt8;
      deltaPicOrderCnt1 = paramInt9;
      isComplete = true;
      hasSliceType = true;
    }
    
    public void setSliceType(int paramInt)
    {
      sliceType = paramInt;
      hasSliceType = true;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.H264Reader.SampleReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */