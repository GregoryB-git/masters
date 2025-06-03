package com.google.firebase.firestore;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d9.b0;
import d9.n;
import d9.n0;
import d9.o0;
import d9.p0;
import d9.v0;
import d9.y0;
import g9.d;
import g9.e0;
import g9.f0;
import g9.k.a;
import g9.l.a;
import g9.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ka.d0;
import ka.d0.a;
import m.a;
import ma.w.a;

public class i
{
  public final f0 a;
  public final FirebaseFirestore b;
  
  public i(f0 paramf0, FirebaseFirestore paramFirebaseFirestore)
  {
    paramf0.getClass();
    a = paramf0;
    paramFirebaseFirestore.getClass();
    b = paramFirebaseFirestore;
  }
  
  public static void i(Object paramObject, l.a parama)
  {
    if (((paramObject instanceof List)) && (((List)paramObject).size() != 0)) {
      return;
    }
    throw new IllegalArgumentException(g.f(f.l("Invalid Query. A non-empty array is required for '"), a, "' filters."));
  }
  
  public final g9.e a(String paramString, boolean paramBoolean, Object[] paramArrayOfObject)
  {
    List localList = a.a;
    if (paramArrayOfObject.length <= localList.size())
    {
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i < paramArrayOfObject.length; i++)
      {
        Object localObject = paramArrayOfObject[i];
        if (getb.equals(j9.l.b))
        {
          if ((localObject instanceof String))
          {
            localObject = (String)localObject;
            int j;
            if (a.g != null) {
              j = 1;
            } else {
              j = 0;
            }
            if ((j == 0) && (((String)localObject).contains("/")))
            {
              paramArrayOfObject = new StringBuilder();
              paramArrayOfObject.append("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to ");
              paramArrayOfObject.append(paramString);
              paramArrayOfObject.append("() must be a plain document ID, but '");
              paramArrayOfObject.append((String)localObject);
              paramArrayOfObject.append("' contains a slash.");
              throw new IllegalArgumentException(paramArrayOfObject.toString());
            }
            localObject = (j9.o)a.f.f(j9.o.t((String)localObject));
            if (j9.i.l((j9.o)localObject))
            {
              localObject = new j9.i((j9.o)localObject);
              localObject = j9.s.m(b.c, (j9.i)localObject);
            }
            else
            {
              paramArrayOfObject = new StringBuilder();
              paramArrayOfObject.append("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to ");
              paramArrayOfObject.append(paramString);
              paramArrayOfObject.append("() must result in a valid document path, but '");
              paramArrayOfObject.append(localObject);
              paramArrayOfObject.append("' is not because it contains an odd number of segments.");
              throw new IllegalArgumentException(paramArrayOfObject.toString());
            }
          }
          else
          {
            paramArrayOfObject = new StringBuilder();
            paramArrayOfObject.append("Invalid query. Expected a string for document ID in ");
            paramArrayOfObject.append(paramString);
            paramArrayOfObject.append("(), but got ");
            paramArrayOfObject.append(localObject);
            paramArrayOfObject.append(".");
            throw new IllegalArgumentException(paramArrayOfObject.toString());
          }
        }
        else {
          localObject = b.h.e(localObject, false);
        }
        localArrayList.add(localObject);
      }
      return new g9.e(localArrayList, paramBoolean);
    }
    throw new IllegalArgumentException(g.e("Too many arguments provided to ", paramString, "(). The number of arguments must be less than or equal to the number of orderBy() clauses."));
  }
  
  public final Task<k> b(v0 paramv0)
  {
    j();
    if (paramv0 == v0.c) {
      return ((Task)b.a(new d9.s(this, 2))).continueWith(n9.f.b, new e(this, 8));
    }
    TaskCompletionSource localTaskCompletionSource1 = new TaskCompletionSource();
    TaskCompletionSource localTaskCompletionSource2 = new TaskCompletionSource();
    k.a locala = new k.a();
    a = true;
    b = true;
    c = true;
    a locala1 = n9.f.b;
    paramv0 = new n0(localTaskCompletionSource1, localTaskCompletionSource2, paramv0);
    j();
    paramv0 = new d(locala1, new o0(0, this, paramv0));
    localTaskCompletionSource2.setResult((b0)b.a(new p0(this, locala, paramv0)));
    return localTaskCompletionSource1.getTask();
  }
  
  public final i c(long paramLong)
  {
    if (paramLong > 0L) {
      return new i(a.f(paramLong), b);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Invalid Query. Query limit (");
    localStringBuilder.append(paramLong);
    localStringBuilder.append(") is invalid. Limit must be positive.");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public final i d(long paramLong)
  {
    if (paramLong > 0L)
    {
      localObject = a;
      return new i(new f0(f, g, e, a, paramLong, 2, j, k), b);
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Invalid Query. Query limitToLast (");
    ((StringBuilder)localObject).append(paramLong);
    ((StringBuilder)localObject).append(") is invalid. Limit must be positive.");
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public final i e(n paramn, int paramInt)
  {
    if (paramn != null)
    {
      Object localObject = a;
      f.o(paramInt, "Provided direction must not be null.");
      paramn = a;
      if (j == null)
      {
        if (k == null)
        {
          if (paramInt == 1) {
            paramInt = 1;
          } else {
            paramInt = 2;
          }
          e0 locale0 = new e0(paramInt, (j9.l)localObject);
          x6.b.Z("No ordering is allowed for document query", paramn.e() ^ true, new Object[0]);
          localObject = new ArrayList(a);
          ((ArrayList)localObject).add(locale0);
          return new i(new f0(f, g, e, (List)localObject, h, i, j, k), b);
        }
        throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
      }
      throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
    }
    throw new NullPointerException("Provided field path must not be null.");
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof i)) {
      return false;
    }
    paramObject = (i)paramObject;
    if ((!a.equals(a)) || (!b.equals(b))) {
      bool = false;
    }
    return bool;
  }
  
  public final m f(e.a parama)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      m localm = h((e)localIterator.next());
      if (!localm.b().isEmpty()) {
        localArrayList.add(localm);
      }
    }
    if (localArrayList.size() == 1) {
      return (m)localArrayList.get(0);
    }
    return new g9.g(localArrayList, b);
  }
  
  public final d0 g(Object paramObject)
  {
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
      if (!((String)paramObject).isEmpty())
      {
        int i;
        if (a.g != null) {
          i = 1;
        } else {
          i = 0;
        }
        if ((i == 0) && (((String)paramObject).contains("/"))) {
          throw new IllegalArgumentException(g.e("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '", (String)paramObject, "' contains a '/' character."));
        }
        localObject = (j9.o)a.f.f(j9.o.t((String)paramObject));
        if (j9.i.l((j9.o)localObject)) {
          return j9.s.m(b.c, new j9.i((j9.o)localObject));
        }
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '");
        ((StringBuilder)paramObject).append(localObject);
        ((StringBuilder)paramObject).append("' is not because it has an odd number of segments (");
        ((StringBuilder)paramObject).append(((j9.e)localObject).q());
        ((StringBuilder)paramObject).append(").");
        throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
      }
      throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
    }
    if ((paramObject instanceof c))
    {
      paramObject = (c)paramObject;
      return j9.s.m(b.c, a);
    }
    Object localObject = f.l("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: ");
    ((StringBuilder)localObject).append(n9.o.j(paramObject));
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public final m h(e parame)
  {
    boolean bool1 = parame instanceof e.b;
    boolean bool2 = true;
    boolean bool3;
    if ((!bool1) && (!(parame instanceof e.a))) {
      bool3 = false;
    } else {
      bool3 = true;
    }
    x6.b.Z("Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", bool3, new Object[0]);
    if (bool1)
    {
      Object localObject1 = (e.b)parame;
      Object localObject2 = l.a.q;
      Object localObject3 = l.a.r;
      parame = l.a.s;
      n localn = a;
      l.a locala = b;
      localObject1 = c;
      x6.b.B(localn, "Provided field path must not be null.");
      x6.b.B(locala, "Provided op must not be null.");
      if (a.u())
      {
        if ((locala != l.a.p) && (locala != localObject2))
        {
          if ((locala != localObject3) && (locala != parame))
          {
            parame = g(localObject1);
          }
          else
          {
            i(localObject1, locala);
            parame = ka.b.M();
            localObject1 = ((List)localObject1).iterator();
            while (((Iterator)localObject1).hasNext())
            {
              localObject3 = g(((Iterator)localObject1).next());
              parame.m();
              ka.b.G((ka.b)b, (d0)localObject3);
            }
            localObject3 = d0.d0();
            ((d0.a)localObject3).p(parame);
            parame = (d0)((w.a)localObject3).k();
          }
        }
        else {
          throw new IllegalArgumentException(g.f(f.l("Invalid query. You can't perform '"), a, "' queries on FieldPath.documentId()."));
        }
      }
      else
      {
        if ((locala == localObject3) || (locala == parame) || (locala == localObject2)) {
          i(localObject1, locala);
        }
        localObject2 = b.h;
        bool3 = bool2;
        if (locala != localObject3) {
          if (locala == parame) {
            bool3 = bool2;
          } else {
            bool3 = false;
          }
        }
        parame = ((y0)localObject2).e(localObject1, bool3);
      }
      return g9.l.e(a, locala, parame);
    }
    return f((e.a)parame);
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    return b.hashCode() + i * 31;
  }
  
  public final void j()
  {
    if ((q0.g.b(a.i, 2)) && (a.a.isEmpty())) {
      throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
    }
  }
  
  public final i k(e parame)
  {
    m localm = h(parame);
    if (localm.b().isEmpty()) {
      return this;
    }
    Object localObject1 = a;
    Iterator localIterator1 = localm.c().iterator();
    while (localIterator1.hasNext())
    {
      g9.l locall = (g9.l)localIterator1.next();
      l.a locala = a;
      Object localObject2 = e;
      Object localObject3 = l.a.e;
      parame = l.a.s;
      int i = locala.ordinal();
      if (i != 3)
      {
        if ((i != 7) && (i != 8))
        {
          if (i != 9) {
            parame = new ArrayList();
          } else {
            parame = Arrays.asList(new l.a[] { l.a.q, l.a.r, parame, localObject3 });
          }
        }
        else {
          parame = Arrays.asList(new l.a[] { parame });
        }
      }
      else {
        parame = Arrays.asList(new l.a[] { localObject3, parame });
      }
      Iterator localIterator2 = ((List)localObject2).iterator();
      do
      {
        while (!((Iterator)localObject3).hasNext())
        {
          if (!localIterator2.hasNext()) {
            break;
          }
          localObject3 = ((m)localIterator2.next()).c().iterator();
        }
        localObject2 = (g9.l)((Iterator)localObject3).next();
      } while (!parame.contains(a));
      parame = a;
      break label275;
      parame = null;
      label275:
      if (parame != null)
      {
        if (parame == locala) {
          throw new IllegalArgumentException(g.f(f.l("Invalid Query. You cannot use more than one '"), a, "' filter."));
        }
        localObject1 = f.l("Invalid Query. You cannot use '");
        ((StringBuilder)localObject1).append(a);
        ((StringBuilder)localObject1).append("' filters with '");
        throw new IllegalArgumentException(g.f((StringBuilder)localObject1, a, "' filters."));
      }
      localObject1 = ((f0)localObject1).b(locall);
    }
    return new i(a.b(localm), b);
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */