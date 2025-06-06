package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Collections;
import java.util.List;

public class AdaptationSet
{
  public static final int ID_UNSET = -1;
  public final List<Descriptor> accessibilityDescriptors;
  public final int id;
  public final List<Representation> representations;
  public final List<Descriptor> supplementalProperties;
  public final int type;
  
  public AdaptationSet(int paramInt1, int paramInt2, List<Representation> paramList, List<Descriptor> paramList1, List<Descriptor> paramList2)
  {
    id = paramInt1;
    type = paramInt2;
    representations = Collections.unmodifiableList(paramList);
    if (paramList1 == null) {
      paramList = Collections.emptyList();
    } else {
      paramList = Collections.unmodifiableList(paramList1);
    }
    accessibilityDescriptors = paramList;
    if (paramList2 == null) {
      paramList = Collections.emptyList();
    } else {
      paramList = Collections.unmodifiableList(paramList2);
    }
    supplementalProperties = paramList;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.AdaptationSet
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */