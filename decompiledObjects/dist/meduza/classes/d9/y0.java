package d9;

import com.google.firebase.firestore.FirebaseFirestore;
import e7.p3;
import g;
import g9.o0;
import g9.p0;
import j9.l;
import j9.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import k9.a.b;
import k9.d;
import k9.p;
import ka.b.a;
import ka.d0;
import ka.d0.a;
import ka.u;
import ka.u.a;
import ma.h;
import ma.n1;
import ma.n1.a;
import ma.w.a;
import n9.e.b;
import oa.a;
import r3.a0;
import u7.m;

public final class y0
{
  public final j9.f a;
  
  public y0(j9.f paramf)
  {
    a = paramf;
  }
  
  public static d0 g(m paramm)
  {
    int i = b / 1000;
    d0.a locala = d0.d0();
    n1.a locala1 = n1.L();
    locala1.p(a);
    locala1.m();
    n1.H((n1)b, i * 1000);
    locala.w(locala1);
    return (d0)locala.k();
  }
  
  public final j9.n a(Map paramMap, o0 paramo0)
  {
    if (!paramMap.getClass().isArray())
    {
      paramo0 = c(n9.e.b(paramMap, e.b.d), paramo0);
      if (paramo0.c0() == 11) {
        return new j9.n(paramo0);
      }
      paramo0 = g.g("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was ", "of type: ");
      paramo0.append(n9.o.j(paramMap));
      throw new IllegalArgumentException(paramo0.toString());
    }
    throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
  }
  
  public final ArrayList b(List paramList)
  {
    p3 localp3 = new p3(p0.d);
    ArrayList localArrayList = new ArrayList(paramList.size());
    for (int i = 0; i < paramList.size(); i++)
    {
      Object localObject = paramList.get(i);
      o0 localo0 = new o0(aa, null, true);
      localArrayList.add(c(n9.e.b(localObject, e.b.d), localo0));
    }
    return localArrayList;
  }
  
  public final d0 c(Object paramObject, o0 paramo0)
  {
    boolean bool1 = paramObject instanceof Map;
    boolean bool2 = true;
    int i = 0;
    Object localObject2;
    Object localObject3;
    if (bool1)
    {
      paramObject = (Map)paramObject;
      if (((Map)paramObject).isEmpty())
      {
        paramObject = b;
        if ((paramObject != null) && (!((j9.e)paramObject).o())) {
          paramo0.a(b);
        }
        paramObject = d0.d0();
        ((d0.a)paramObject).u(u.H());
      }
      else
      {
        localObject1 = u.M();
        localObject2 = ((Map)paramObject).entrySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          paramObject = (Map.Entry)((Iterator)localObject2).next();
          if ((((Map.Entry)paramObject).getKey() instanceof String))
          {
            localObject3 = (String)((Map.Entry)paramObject).getKey();
            Object localObject4 = ((Map.Entry)paramObject).getValue();
            paramObject = b;
            if (paramObject == null) {
              paramObject = null;
            } else {
              paramObject = (l)((j9.e)paramObject).g((String)localObject3);
            }
            paramObject = new o0(a, (l)paramObject, false);
            ((o0)paramObject).e((String)localObject3);
            paramObject = c(localObject4, (o0)paramObject);
            if (paramObject != null) {
              ((u.a)localObject1).p((d0)paramObject, (String)localObject3);
            }
          }
          else
          {
            throw paramo0.c(String.format("Non-String Map key (%s) is not allowed", new Object[] { ((Map.Entry)paramObject).getValue() }));
          }
        }
        paramObject = d0.d0();
        ((d0.a)paramObject).t((u.a)localObject1);
      }
      return (d0)((w.a)paramObject).k();
    }
    if ((paramObject instanceof o))
    {
      paramObject = (o)paramObject;
      if (paramo0.d())
      {
        localObject1 = b;
        if (localObject1 != null)
        {
          if ((paramObject instanceof o.c))
          {
            paramObject = a.b;
            if ((p0)paramObject == p0.b)
            {
              paramo0.a((l)localObject1);
            }
            else
            {
              if ((p0)paramObject == p0.c)
              {
                if (((j9.e)localObject1).q() <= 0) {
                  bool2 = false;
                }
                x6.b.Z("FieldValue.delete() at the top level should have already been handled.", bool2, new Object[0]);
                throw paramo0.c("FieldValue.delete() can only appear at the top level of your update data");
              }
              throw paramo0.c("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
            }
          }
          else
          {
            if ((paramObject instanceof o.e))
            {
              localObject2 = k9.n.a;
              paramObject = (ArrayList)a.d;
              paramo0 = new k9.e((l)localObject1, (p)localObject2);
            }
            else
            {
              if ((paramObject instanceof o.b))
              {
                paramObject = new a.b(b(c));
              }
              else if ((paramObject instanceof o.a))
              {
                paramObject = new k9.a.a(b(c));
              }
              else
              {
                if (!(paramObject instanceof o.d)) {
                  break label526;
                }
                paramObject = new k9.j(e(c, false));
              }
              localObject1 = b;
              paramo0 = (ArrayList)a.d;
              localObject1 = new k9.e((l)localObject1, (p)paramObject);
              paramObject = paramo0;
              paramo0 = (o0)localObject1;
            }
            ((ArrayList)paramObject).add(paramo0);
          }
          return null;
          label526:
          x6.b.T("Unknown FieldValue type: %s", new Object[] { n9.o.j(paramObject) });
          throw null;
        }
        throw paramo0.c(String.format("%s() is not currently supported inside arrays", new Object[] { ((o)paramObject).a() }));
      }
      throw paramo0.c(String.format("%s() can only be used with set() and update()", new Object[] { ((o)paramObject).a() }));
    }
    Object localObject1 = b;
    if (localObject1 != null) {
      paramo0.a((l)localObject1);
    }
    if ((paramObject instanceof List))
    {
      if ((c) && ((p0)a.b != p0.e)) {
        throw paramo0.c("Nested arrays are not supported");
      }
      paramObject = (List)paramObject;
      localObject2 = ka.b.M();
      localObject3 = ((List)paramObject).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = c(((Iterator)localObject3).next(), new o0(a, null, true));
        paramObject = localObject1;
        if (localObject1 == null)
        {
          paramObject = d0.d0();
          ((w.a)paramObject).m();
          d0.N((d0)b);
          paramObject = (d0)((w.a)paramObject).k();
        }
        ((w.a)localObject2).m();
        ka.b.G((ka.b)b, (d0)paramObject);
      }
      paramObject = d0.d0();
      ((d0.a)paramObject).p((b.a)localObject2);
      return (d0)((w.a)paramObject).k();
    }
    if (paramObject == null)
    {
      paramObject = d0.d0();
      ((w.a)paramObject).m();
      d0.N((d0)b);
      paramObject = ((w.a)paramObject).k();
    }
    else
    {
      long l;
      if ((paramObject instanceof Integer))
      {
        paramo0 = d0.d0();
        l = ((Integer)paramObject).intValue();
        paramObject = paramo0;
      }
      else
      {
        if (!(paramObject instanceof Long)) {
          break label860;
        }
        paramo0 = d0.d0();
        l = ((Long)paramObject).longValue();
        paramObject = paramo0;
      }
      ((d0.a)paramObject).s(l);
      break label1301;
      label860:
      double d;
      if ((paramObject instanceof Float))
      {
        paramo0 = d0.d0();
        d = ((Float)paramObject).doubleValue();
        paramObject = paramo0;
      }
      else
      {
        if (!(paramObject instanceof Double)) {
          break label916;
        }
        paramo0 = d0.d0();
        d = ((Double)paramObject).doubleValue();
        paramObject = paramo0;
      }
      ((d0.a)paramObject).q(d);
      break label1301;
      label916:
      if ((paramObject instanceof Boolean))
      {
        paramo0 = d0.d0();
        bool2 = ((Boolean)paramObject).booleanValue();
        paramo0.m();
        d0.O((d0)b, bool2);
        paramObject = paramo0;
      }
      else if ((paramObject instanceof String))
      {
        paramo0 = d0.d0();
        paramo0.v((String)paramObject);
        paramObject = paramo0;
      }
      else
      {
        if ((paramObject instanceof Date))
        {
          paramObject = g(new m((Date)paramObject));
          break label1423;
        }
        if ((paramObject instanceof m))
        {
          paramObject = g((m)paramObject);
          break label1423;
        }
        if ((paramObject instanceof y))
        {
          paramo0 = (y)paramObject;
          paramObject = d0.d0();
          localObject1 = a.L();
          d = a;
          ((w.a)localObject1).m();
          a.G((a)b, d);
          d = b;
          ((w.a)localObject1).m();
          a.H((a)b, d);
          ((d0.a)paramObject).r((oa.a.a)localObject1);
        }
        else if ((paramObject instanceof c))
        {
          paramo0 = d0.d0();
          paramObject = a;
          paramo0.m();
          d0.I((d0)b, (h)paramObject);
          paramObject = paramo0;
        }
        else
        {
          if (!(paramObject instanceof com.google.firebase.firestore.c)) {
            break label1314;
          }
          localObject1 = (com.google.firebase.firestore.c)paramObject;
          paramObject = b;
          if (paramObject != null)
          {
            localObject2 = c;
            if (!((j9.f)localObject2).equals(a))
            {
              paramObject = a;
              localObject2 = b;
              localObject1 = a;
              throw paramo0.c(String.format("Document reference is for database %s/%s but should be for database %s/%s", new Object[] { paramObject, localObject2, a, b }));
            }
          }
          paramObject = d0.d0();
          paramo0 = a;
          paramo0 = String.format("projects/%s/databases/%s/documents/%s", new Object[] { a, b, ((com.google.firebase.firestore.c)localObject1).c() });
          ((w.a)paramObject).m();
          d0.J((d0)b, paramo0);
        }
      }
      label1301:
      paramObject = ((w.a)paramObject).k();
    }
    paramObject = (d0)paramObject;
    label1314:
    if ((paramObject instanceof z0))
    {
      localObject1 = (z0)paramObject;
      paramObject = u.M();
      ((u.a)paramObject).p(s.f, "__type__");
      localObject2 = new ArrayList(a.length);
      for (;;)
      {
        localObject3 = a;
        if (i >= localObject3.length) {
          break;
        }
        ((ArrayList)localObject2).add(i, Double.valueOf(localObject3[i]));
        i++;
      }
      ((u.a)paramObject).p(c(localObject2, paramo0), "value");
      paramo0 = d0.d0();
      paramo0.t((u.a)paramObject);
      paramObject = (d0)paramo0.k();
      label1423:
      return (d0)paramObject;
    }
    if (paramObject.getClass().isArray()) {
      throw paramo0.c("Arrays are not supported; use a List instead");
    }
    localObject1 = f.l("Unsupported type: ");
    ((StringBuilder)localObject1).append(n9.o.j(paramObject));
    throw paramo0.c(((StringBuilder)localObject1).toString());
  }
  
  public final a0 d(Map paramMap, d paramd)
  {
    Object localObject1 = new p3(p0.b);
    paramMap = a(paramMap, ((p3)localObject1).a());
    if (paramd != null)
    {
      Iterator localIterator1 = a.iterator();
      int i;
      Object localObject3;
      label159:
      do
      {
        boolean bool = localIterator1.hasNext();
        i = 1;
        if (!bool) {
          break;
        }
        localObject2 = (l)localIterator1.next();
        localObject3 = ((Set)c).iterator();
        while (((Iterator)localObject3).hasNext()) {
          if (((j9.e)localObject2).p((l)((Iterator)localObject3).next())) {
            break label159;
          }
        }
        localObject3 = ((ArrayList)d).iterator();
        while (((Iterator)localObject3).hasNext()) {
          if (((j9.e)localObject2).p(nexta)) {
            break label159;
          }
        }
        i = 0;
      } while (i != 0);
      paramMap = f.l("Field '");
      paramMap.append(((l)localObject2).h());
      paramMap.append("' is specified in your field mask but not in your input data.");
      throw new IllegalArgumentException(paramMap.toString());
      Object localObject2 = new ArrayList();
      Iterator localIterator2 = ((ArrayList)d).iterator();
      while (localIterator2.hasNext())
      {
        localObject3 = (k9.e)localIterator2.next();
        localObject1 = a;
        localIterator1 = a.iterator();
        while (localIterator1.hasNext()) {
          if (((l)localIterator1.next()).p((j9.e)localObject1))
          {
            i = 1;
            break label300;
          }
        }
        i = 0;
        label300:
        if (i != 0) {
          ((ArrayList)localObject2).add(localObject3);
        }
      }
      return new a0(paramMap, paramd, Collections.unmodifiableList((List)localObject2));
    }
    return new a0(paramMap, new d((Set)c), Collections.unmodifiableList((ArrayList)d));
  }
  
  public final d0 e(Object paramObject, boolean paramBoolean)
  {
    if (paramBoolean) {
      localObject = p0.e;
    } else {
      localObject = p0.d;
    }
    Object localObject = new p3((p0)localObject);
    o0 localo0 = ((p3)localObject).a();
    paramObject = c(n9.e.b(paramObject, e.b.d), localo0);
    if (paramObject != null) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    x6.b.Z("Parsed data should not be null.", paramBoolean, new Object[0]);
    x6.b.Z("Field transforms should have been disallowed.", ((ArrayList)d).isEmpty(), new Object[0]);
    return (d0)paramObject;
  }
  
  public final a0 f(Map paramMap)
  {
    p3 localp3 = new p3(p0.a);
    return new a0(a(paramMap, localp3.a()), null, Collections.unmodifiableList((ArrayList)d));
  }
  
  public final l3.j h(Map<String, Object> paramMap)
  {
    p3 localp3 = new p3(p0.c);
    o0 localo0 = localp3.a();
    j9.n localn = new j9.n();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject1 = (Map.Entry)paramMap.next();
      l locall = agetKeya;
      Object localObject2 = ((Map.Entry)localObject1).getValue();
      if ((localObject2 instanceof o.c))
      {
        localo0.a(locall);
      }
      else
      {
        localObject1 = localo0.b(locall);
        localObject1 = c(n9.e.b(localObject2, e.b.d), (o0)localObject1);
        if (localObject1 != null)
        {
          localo0.a(locall);
          localn.f(locall, (d0)localObject1);
        }
      }
    }
    return new l3.j(localn, new d((Set)c), Collections.unmodifiableList((ArrayList)d));
  }
}

/* Location:
 * Qualified Name:     d9.y0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */