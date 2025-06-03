package com.google.android.exoplayer2.text.dvb;

import android.util.SparseArray;

final class DvbParser$RegionComposition
{
  public final int clutId;
  public final int depth;
  public final boolean fillFlag;
  public final int height;
  public final int id;
  public final int levelOfCompatibility;
  public final int pixelCode2Bit;
  public final int pixelCode4Bit;
  public final int pixelCode8Bit;
  public final SparseArray<DvbParser.RegionObject> regionObjects;
  public final int width;
  
  public DvbParser$RegionComposition(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, SparseArray<DvbParser.RegionObject> paramSparseArray)
  {
    id = paramInt1;
    fillFlag = paramBoolean;
    width = paramInt2;
    height = paramInt3;
    levelOfCompatibility = paramInt4;
    depth = paramInt5;
    clutId = paramInt6;
    pixelCode8Bit = paramInt7;
    pixelCode4Bit = paramInt8;
    pixelCode2Bit = paramInt9;
    regionObjects = paramSparseArray;
  }
  
  public void mergeFrom(RegionComposition paramRegionComposition)
  {
    if (paramRegionComposition == null) {
      return;
    }
    paramRegionComposition = regionObjects;
    for (int i = 0; i < paramRegionComposition.size(); i++) {
      regionObjects.put(paramRegionComposition.keyAt(i), paramRegionComposition.valueAt(i));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.dvb.DvbParser.RegionComposition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */