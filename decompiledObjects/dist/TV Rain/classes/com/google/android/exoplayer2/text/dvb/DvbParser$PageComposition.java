package com.google.android.exoplayer2.text.dvb;

import android.util.SparseArray;

final class DvbParser$PageComposition
{
  public final SparseArray<DvbParser.PageRegion> regions;
  public final int state;
  public final int timeOutSecs;
  public final int version;
  
  public DvbParser$PageComposition(int paramInt1, int paramInt2, int paramInt3, SparseArray<DvbParser.PageRegion> paramSparseArray)
  {
    timeOutSecs = paramInt1;
    version = paramInt2;
    state = paramInt3;
    regions = paramSparseArray;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.dvb.DvbParser.PageComposition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */