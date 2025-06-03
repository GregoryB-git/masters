package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.Set;
import java.util.SortedSet;

public final class aei
  implements afh
{
  private final SortedSet<Float> a;
  private afc b;
  private String c;
  private float d = 0.0F;
  
  public aei(afc paramafc, SortedSet<Float> paramSortedSet, String paramString)
  {
    b = paramafc;
    c = paramString;
    a = paramSortedSet;
  }
  
  public final void a(VideoProgressUpdate paramVideoProgressUpdate)
  {
    if ((paramVideoProgressUpdate != null) && (paramVideoProgressUpdate.getDuration() >= 0.0F))
    {
      float f1 = paramVideoProgressUpdate.getCurrentTime();
      float f2 = d;
      SortedSet localSortedSet;
      if (f2 < f1) {
        localSortedSet = a.subSet(Float.valueOf(f2), Float.valueOf(f1));
      } else {
        localSortedSet = a.subSet(Float.valueOf(f1), Float.valueOf(d));
      }
      boolean bool = localSortedSet.isEmpty();
      d = paramVideoProgressUpdate.getCurrentTime();
      if ((bool ^ true)) {
        b.b(new aeq(aes.contentTimeUpdate, aer.contentTimeUpdate, c, paramVideoProgressUpdate));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aei
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */