package com.google.firebase.firestore;

import g9.s0;
import j9.g;
import java.util.Iterator;
import t8.e;
import t8.e.a;

public final class k$a
  implements Iterator<j>
{
  public final Iterator<g> a;
  
  public k$a(k paramk, e.a parama)
  {
    a = parama;
  }
  
  public final boolean hasNext()
  {
    return a.hasNext();
  }
  
  public final Object next()
  {
    Object localObject = b;
    g localg = (g)a.next();
    FirebaseFirestore localFirebaseFirestore = c;
    localObject = b;
    boolean bool1 = e;
    boolean bool2 = f.contains(localg.getKey());
    return new j(localFirebaseFirestore, localg.getKey(), localg, bool1, bool2);
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */