package com.google.firebase.firestore;

import d9.y;
import d9.z0;
import j9.e;
import j9.i;
import j9.o;
import j9.p;
import j9.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import ka.d0;
import ka.u;
import ma.n1;
import oa.a;
import p2.m0;
import q0.g;

public final class m
{
  public final FirebaseFirestore a;
  public final d.a b;
  
  public m(FirebaseFirestore paramFirebaseFirestore, d.a parama)
  {
    a = paramFirebaseFirestore;
    b = parama;
  }
  
  public final HashMap a(Map paramMap)
  {
    HashMap localHashMap = new HashMap();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localHashMap.put((String)localEntry.getKey(), b((d0)localEntry.getValue()));
    }
    return localHashMap;
  }
  
  public final Object b(d0 paramd0)
  {
    int i = s.n(paramd0);
    Object localObject1 = null;
    int j = 0;
    long l;
    switch (i)
    {
    default: 
      localObject1 = f.l("Unknown value type: ");
      ((StringBuilder)localObject1).append(f.s(paramd0.c0()));
      x6.b.T(((StringBuilder)localObject1).toString(), new Object[0]);
      throw null;
    case 11: 
      return a(paramd0.Y().J());
    case 10: 
      paramd0 = ((d0)paramd0.Y().J().get("value")).R().h();
      localObject1 = new double[paramd0.size()];
      while (j < paramd0.size())
      {
        localObject1[j] = ((d0)paramd0.get(j)).V();
        j++;
      }
      return new z0((double[])localObject1);
    case 9: 
      localObject1 = paramd0.R();
      paramd0 = new ArrayList(((ka.b)localObject1).L());
      localObject1 = ((ka.b)localObject1).h().iterator();
      while (((Iterator)localObject1).hasNext()) {
        paramd0.add(b((d0)((Iterator)localObject1).next()));
      }
      return paramd0;
    case 8: 
      return new y(paramd0.W().J(), paramd0.W().K());
    case 7: 
      Object localObject2 = o.t(paramd0.Z());
      boolean bool;
      if ((((e)localObject2).q() > 3) && (((e)localObject2).n(0).equals("projects")) && (((e)localObject2).n(2).equals("databases"))) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.Z("Tried to parse an invalid resource name: %s", bool, new Object[] { localObject2 });
      localObject1 = ((e)localObject2).n(1);
      localObject2 = ((e)localObject2).n(3);
      j9.f localf = new j9.f((String)localObject1, (String)localObject2);
      i locali = i.h(paramd0.Z());
      paramd0 = a.c;
      if (!localf.equals(paramd0)) {
        m0.y(2, "DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", new Object[] { a, localObject1, localObject2, a, b });
      }
      return new c(locali, a);
    case 6: 
      paramd0 = paramd0.T();
      x6.b.B(paramd0, "Provided ByteString must not be null.");
      return new d9.c(paramd0);
    case 5: 
      return paramd0.a0();
    case 4: 
      j = b.ordinal();
      if (j != 1)
      {
        if (j != 2)
        {
          paramd0 = (d0)localObject1;
        }
        else
        {
          paramd0 = p.b(paramd0);
          if (paramd0 == null) {
            paramd0 = (d0)localObject1;
          } else {
            paramd0 = b(paramd0);
          }
        }
      }
      else
      {
        paramd0 = p.a(paramd0);
        l = paramd0.K();
        paramd0 = new u7.m(paramd0.J(), l);
      }
      return paramd0;
    case 3: 
      paramd0 = paramd0.b0();
      l = paramd0.K();
      return new u7.m(paramd0.J(), l);
    case 2: 
      if (g.b(paramd0.c0(), 3)) {
        paramd0 = Long.valueOf(paramd0.X());
      } else {
        paramd0 = Double.valueOf(paramd0.V());
      }
      return paramd0;
    case 1: 
      return Boolean.valueOf(paramd0.S());
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */