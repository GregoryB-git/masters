package com.google.firebase.firestore;

import d9.j0;
import d9.u0;
import f;
import g9.f0;
import g9.f0.a;
import g9.i.a;
import g9.s0;
import j9.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import t8.c;
import x6.b;

public final class k
  implements Iterable<j>
{
  public final i a;
  public final s0 b;
  public final FirebaseFirestore c;
  public List<d9.e> d;
  public j0 e;
  public final u0 f;
  
  public k(i parami, s0 params0, FirebaseFirestore paramFirebaseFirestore)
  {
    a = parami;
    params0.getClass();
    b = params0;
    paramFirebaseFirestore.getClass();
    c = paramFirebaseFirestore;
    f = new u0(f.a.isEmpty() ^ true, e);
  }
  
  public final List<d9.e> a()
  {
    j0 localj0 = j0.a;
    if ((j0.b.equals(localj0)) && (b.h)) {
      throw new IllegalArgumentException("To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener().");
    }
    if ((d == null) || (e != localj0))
    {
      FirebaseFirestore localFirebaseFirestore = c;
      s0 locals0 = b;
      Object localObject1 = d9.e.a.c;
      d9.e.a locala = d9.e.a.a;
      ArrayList localArrayList = new ArrayList();
      Object localObject2;
      int i;
      Object localObject3;
      boolean bool1;
      boolean bool2;
      if (c.a.isEmpty())
      {
        localObject1 = d.iterator();
        localObject2 = null;
        for (i = 0; ((Iterator)localObject1).hasNext(); i++)
        {
          localObject3 = (g9.i)((Iterator)localObject1).next();
          localObject4 = b;
          bool1 = e;
          bool2 = f.contains(((g)localObject4).getKey());
          localObject5 = new j(localFirebaseFirestore, ((g)localObject4).getKey(), (g)localObject4, bool1, bool2);
          if (a == i.a.b) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          b.Z("Invalid added event for first snapshot", bool1, new Object[0]);
          if ((localObject2 != null) && (a.a().compare(localObject2, localObject4) >= 0)) {
            bool1 = false;
          } else {
            bool1 = true;
          }
          b.Z("Got added events in wrong order", bool1, new Object[0]);
          localArrayList.add(new d9.e((j)localObject5, locala, -1, i));
          localObject2 = localObject4;
        }
      }
      Object localObject4 = c;
      Object localObject5 = d.iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject2 = (g9.i)((Iterator)localObject5).next();
        if (a != i.a.d)
        {
          Object localObject6 = b;
          bool2 = e;
          bool1 = f.contains(((g)localObject6).getKey());
          localObject3 = new j(localFirebaseFirestore, ((g)localObject6).getKey(), (g)localObject6, bool2, bool1);
          i = a.ordinal();
          bool2 = true;
          if (i != 0)
          {
            if (i != 1)
            {
              if ((i != 2) && (i != 3))
              {
                localObject4 = f.l("Unknown view change type: ");
                ((StringBuilder)localObject4).append(a);
                throw new IllegalArgumentException(((StringBuilder)localObject4).toString());
              }
              localObject2 = d9.e.a.b;
            }
            else
            {
              localObject2 = locala;
            }
          }
          else {
            localObject2 = localObject1;
          }
          int j;
          if (localObject2 != locala)
          {
            Object localObject7 = ((g)localObject6).getKey();
            localObject7 = (g)a.h(localObject7);
            if (localObject7 == null) {
              i = -1;
            } else {
              i = b.a.m((g)localObject7);
            }
            if (i >= 0) {
              bool1 = true;
            } else {
              bool1 = false;
            }
            b.Z("Index for document not found", bool1, new Object[0]);
            localObject4 = ((j9.j)localObject4).h(((g)localObject6).getKey());
            j = i;
          }
          else
          {
            j = -1;
          }
          if (localObject2 != localObject1)
          {
            localObject4 = ((j9.j)localObject4).a((g)localObject6);
            localObject6 = ((g)localObject6).getKey();
            localObject6 = (g)a.h(localObject6);
            if (localObject6 == null) {
              i = -1;
            } else {
              i = b.a.m((g)localObject6);
            }
            if (i >= 0) {
              bool1 = bool2;
            } else {
              bool1 = false;
            }
            b.Z("Index for document not found", bool1, new Object[0]);
          }
          else
          {
            i = -1;
          }
          localArrayList.add(new d9.e((j)localObject3, (d9.e.a)localObject2, j, i));
        }
      }
      d = Collections.unmodifiableList(localArrayList);
      e = localj0;
    }
    return d;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof k)) {
      return false;
    }
    paramObject = (k)paramObject;
    if ((!c.equals(c)) || (!a.equals(a)) || (!b.equals(b)) || (!f.equals(f))) {
      bool = false;
    }
    return bool;
  }
  
  public final ArrayList h()
  {
    ArrayList localArrayList = new ArrayList(b.b.size());
    Iterator localIterator = b.b.iterator();
    for (;;)
    {
      Object localObject = (t8.e.a)localIterator;
      if (!((t8.e.a)localObject).hasNext()) {
        break;
      }
      localObject = (g)((t8.e.a)localObject).next();
      FirebaseFirestore localFirebaseFirestore = c;
      s0 locals0 = b;
      boolean bool1 = e;
      boolean bool2 = f.contains(((g)localObject).getKey());
      localArrayList.add(new j(localFirebaseFirestore, ((g)localObject).getKey(), (g)localObject, bool1, bool2));
    }
    return localArrayList;
  }
  
  public final int hashCode()
  {
    int i = c.hashCode();
    int j = a.hashCode();
    int k = b.hashCode();
    return f.hashCode() + (k + (j + i * 31) * 31) * 31;
  }
  
  public final Iterator<j> iterator()
  {
    return new a((t8.e.a)b.b.iterator());
  }
  
  public final class a
    implements Iterator<j>
  {
    public final Iterator<g> a;
    
    public a(t8.e.a parama)
    {
      a = parama;
    }
    
    public final boolean hasNext()
    {
      return a.hasNext();
    }
    
    public final Object next()
    {
      Object localObject = k.this;
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
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */