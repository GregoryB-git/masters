package com.google.android.exoplayer2.text.dvb;

import android.util.SparseArray;

final class DvbParser$SubtitleService
{
  public final SparseArray<DvbParser.ClutDefinition> ancillaryCluts = new SparseArray();
  public final SparseArray<DvbParser.ObjectData> ancillaryObjects = new SparseArray();
  public final int ancillaryPageId;
  public final SparseArray<DvbParser.ClutDefinition> cluts = new SparseArray();
  public DvbParser.DisplayDefinition displayDefinition;
  public final SparseArray<DvbParser.ObjectData> objects = new SparseArray();
  public DvbParser.PageComposition pageComposition;
  public final SparseArray<DvbParser.RegionComposition> regions = new SparseArray();
  public final int subtitlePageId;
  
  public DvbParser$SubtitleService(int paramInt1, int paramInt2)
  {
    subtitlePageId = paramInt1;
    ancillaryPageId = paramInt2;
  }
  
  public void reset()
  {
    regions.clear();
    cluts.clear();
    objects.clear();
    ancillaryCluts.clear();
    ancillaryObjects.clear();
    displayDefinition = null;
    pageComposition = null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.dvb.DvbParser.SubtitleService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */