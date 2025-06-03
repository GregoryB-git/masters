package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.NalUnitUtil.SpsData;

final class H264Reader$SampleReader$SliceHeaderData
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.H264Reader.SampleReader.SliceHeaderData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */