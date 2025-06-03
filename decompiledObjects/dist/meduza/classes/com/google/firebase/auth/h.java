package com.google.firebase.auth;

import c8.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class h
  implements Runnable
{
  public final void run()
  {
    Iterator localIterator = a.c.iterator();
    while (localIterator.hasNext()) {
      ((a)localIterator.next()).a();
    }
    localIterator = a.b.iterator();
    while (localIterator.hasNext()) {
      ((FirebaseAuth.b)localIterator.next()).a(a);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.auth.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */