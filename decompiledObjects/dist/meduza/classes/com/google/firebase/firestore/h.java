package com.google.firebase.firestore;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import m9.l;
import m9.z;
import u7.f;
import u7.g;

public final class h
  implements g, FirebaseFirestore.a
{
  public final HashMap a = new HashMap();
  public final f b;
  public final Context c;
  public final t9.a<c8.b> d;
  public final t9.a<a8.a> e;
  public final z f;
  
  public h(Context paramContext, f paramf, t9.a parama1, t9.a parama2, l paraml)
  {
    c = paramContext;
    b = paramf;
    d = parama1;
    e = parama2;
    f = paraml;
    paramf.a();
    j.add(this);
  }
  
  public final void a()
  {
    try
    {
      Object localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>(a.entrySet());
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject1).next();
        ((FirebaseFirestore)localEntry.getValue()).i();
        boolean bool;
        if (!a.containsKey(localEntry.getKey())) {
          bool = true;
        } else {
          bool = false;
        }
        x6.b.Z("terminate() should have removed its entry from `instances` for key: %s", bool, new Object[] { localEntry.getKey() });
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */