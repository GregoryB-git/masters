package com.google.ads.interactivemedia.v3.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class ais
{
  private final ConcurrentHashMap<aiv, List<Throwable>> a = new ConcurrentHashMap(16, 0.75F, 10);
  private final ReferenceQueue<Throwable> b = new ReferenceQueue();
  
  public final List<Throwable> a(Throwable paramThrowable, boolean paramBoolean)
  {
    for (Reference localReference = b.poll(); localReference != null; localReference = b.poll()) {
      a.remove(localReference);
    }
    paramThrowable = new aiv(paramThrowable, null);
    return (List)a.get(paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ais
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */