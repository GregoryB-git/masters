package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import android.view.Surface;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class afv
  implements da
{
  public afv(afs paramafs) {}
  
  private final void a(AdMediaInfo paramAdMediaInfo)
  {
    if ((paramAdMediaInfo != null) && (!afs.b(a).contains(paramAdMediaInfo)))
    {
      Iterator localIterator = afs.c(a).iterator();
      while (localIterator.hasNext()) {
        ((VideoAdPlayer.VideoAdPlayerCallback)localIterator.next()).onEnded(paramAdMediaInfo);
      }
      afs.b(a).add(paramAdMediaInfo);
    }
  }
  
  public final void a(int paramInt)
  {
    AdMediaInfo localAdMediaInfo = afs.f(a);
    if (localAdMediaInfo == null) {
      return;
    }
    if (paramInt != 2)
    {
      if (paramInt != 3)
      {
        if (paramInt == 4) {
          a(localAdMediaInfo);
        }
        return;
      }
      localIterator = afs.c(a).iterator();
      while (localIterator.hasNext()) {
        ((VideoAdPlayer.VideoAdPlayerCallback)localIterator.next()).onLoaded(localAdMediaInfo);
      }
      return;
    }
    Iterator localIterator = afs.c(a).iterator();
    while (localIterator.hasNext()) {
      ((VideoAdPlayer.VideoAdPlayerCallback)localIterator.next()).onBuffering(localAdMediaInfo);
    }
  }
  
  public final void a(cz paramcz) {}
  
  public final void a(cz paramcz, int paramInt) {}
  
  public final void a(cz paramcz, int paramInt1, int paramInt2) {}
  
  public final void a(cz paramcz, int paramInt1, int paramInt2, int paramInt3, float paramFloat) {}
  
  public final void a(cz paramcz, int paramInt, long paramLong) {}
  
  public final void a(cz paramcz, int paramInt, long paramLong1, long paramLong2) {}
  
  public final void a(cz paramcz, int paramInt, bw parambw) {}
  
  public final void a(cz paramcz, int paramInt, fa paramfa) {}
  
  public final void a(cz paramcz, int paramInt, String paramString, long paramLong) {}
  
  public final void a(cz paramcz, Surface paramSurface) {}
  
  public final void a(cz paramcz, ba paramba)
  {
    paramcz = afs.a(a, a);
    afs.b(a).add(paramcz);
    Iterator localIterator = afs.c(a).iterator();
    while (localIterator.hasNext()) {
      ((VideoAdPlayer.VideoAdPlayerCallback)localIterator.next()).onError(paramcz);
    }
    paramba = String.valueOf(paramba);
    paramcz = new StringBuilder(paramba.length() + 13);
    paramcz.append("Player Error:");
    paramcz.append(paramba);
    Log.e("IMASDK", paramcz.toString());
  }
  
  public final void a(cz paramcz, cg paramcg) {}
  
  public final void a(cz paramcz, ng paramng) {}
  
  public final void a(cz paramcz, nh paramnh, ng paramng) {}
  
  public final void a(cz paramcz, nh paramnh, ng paramng, IOException paramIOException, boolean paramBoolean) {}
  
  public final void a(cz paramcz, of paramof, td paramtd) {}
  
  public final void a(cz paramcz, boolean paramBoolean) {}
  
  public final void b(int paramInt)
  {
    if (paramInt != 0) {
      return;
    }
    if (afs.d(a) == null)
    {
      Log.d("IMASDK", "Position discontinuity occurred when there is no active media source.");
      return;
    }
    int i = afs.e(a).e();
    for (paramInt = 0; paramInt < i; paramInt++) {
      a(afs.a(a, paramInt));
    }
    AdMediaInfo localAdMediaInfo = afs.a(a, i);
    if (localAdMediaInfo != null)
    {
      Iterator localIterator = afs.c(a).iterator();
      while (localIterator.hasNext())
      {
        VideoAdPlayer.VideoAdPlayerCallback localVideoAdPlayerCallback = (VideoAdPlayer.VideoAdPlayerCallback)localIterator.next();
        localVideoAdPlayerCallback.onLoaded(localAdMediaInfo);
        localVideoAdPlayerCallback.onPlay(localAdMediaInfo);
      }
    }
  }
  
  public final void b(cz paramcz) {}
  
  public final void b(cz paramcz, int paramInt) {}
  
  public final void b(cz paramcz, int paramInt, long paramLong1, long paramLong2) {}
  
  public final void b(cz paramcz, int paramInt, fa paramfa) {}
  
  public final void b(cz paramcz, ng paramng) {}
  
  public final void b(cz paramcz, nh paramnh, ng paramng) {}
  
  public final void c(cz paramcz) {}
  
  public final void c(cz paramcz, nh paramnh, ng paramng) {}
  
  public final void d(cz paramcz) {}
  
  public final void e(cz paramcz) {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */