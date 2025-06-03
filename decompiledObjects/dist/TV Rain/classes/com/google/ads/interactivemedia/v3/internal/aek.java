package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z2;

public final class aek
{
  private final List<AdErrorEvent.AdErrorListener> a = new ArrayList(1);
  
  public final void a(AdErrorEvent.AdErrorListener paramAdErrorListener)
  {
    a.add(paramAdErrorListener);
  }
  
  public final void a(AdErrorEvent paramAdErrorEvent)
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((AdErrorEvent.AdErrorListener)localIterator.next()).onAdError(paramAdErrorEvent);
    }
  }
  
  public final void b(AdErrorEvent.AdErrorListener paramAdErrorListener)
  {
    a.remove(paramAdErrorListener);
  }
  
  public final String toString()
  {
    String str = String.valueOf(a);
    return z2.l(str.length() + 38, "ErrorListenerSupport [errorListeners=", str, "]");
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aek
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */