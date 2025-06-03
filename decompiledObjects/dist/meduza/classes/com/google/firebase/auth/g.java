package com.google.firebase.auth;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class g
  implements Runnable
{
  public final void run()
  {
    Iterator localIterator = a.d.iterator();
    while (localIterator.hasNext()) {
      ((FirebaseAuth.a)localIterator.next()).a(a);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.auth.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */