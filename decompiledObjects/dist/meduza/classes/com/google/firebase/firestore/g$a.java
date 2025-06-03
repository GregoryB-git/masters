package com.google.firebase.firestore;

import d9.e0;
import d9.f0;
import d9.l0;

public final class g$a
{
  public String a = "firestore.googleapis.com";
  public boolean b = true;
  public boolean c = true;
  public long d = 104857600L;
  public e0 e;
  public boolean f = false;
  
  public final g a()
  {
    if ((!b) && (a.equals("firestore.googleapis.com"))) {
      throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
    }
    return new g(this);
  }
  
  public final void b(e0 parame0)
  {
    if (!f)
    {
      if ((!(parame0 instanceof f0)) && (!(parame0 instanceof l0))) {
        throw new IllegalArgumentException("Only MemoryCacheSettings and PersistentCacheSettings are accepted");
      }
      e = parame0;
      return;
    }
    throw new IllegalStateException("Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first.");
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */