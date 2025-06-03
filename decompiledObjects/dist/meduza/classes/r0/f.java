package r0;

import ec.i;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import n7.w;
import o0.m;
import o0.q.b;
import q0.e;
import q0.e.a;
import rb.h;
import s0.i0;
import s0.j;
import s0.j.a;
import s0.j.d;
import s0.v;
import s0.v.a;
import s0.y;
import sb.q;
import x6.b;

public final class f
  implements m<d>
{
  public static final f a = new f();
  
  public final a a()
  {
    return new a(true, 1);
  }
  
  public final a b(FileInputStream paramFileInputStream)
  {
    try
    {
      Object localObject = q0.d.t(paramFileInputStream);
      a locala = new a(false, 1);
      paramFileInputStream = (d.b[])Arrays.copyOf(new d.b[0], 0);
      i.e(paramFileInputStream, "pairs");
      locala.c();
      if (paramFileInputStream.length <= 0)
      {
        paramFileInputStream = ((q0.d)localObject).r();
        i.d(paramFileInputStream, "preferencesProto.preferencesMap");
        Iterator localIterator = paramFileInputStream.entrySet().iterator();
        while (localIterator.hasNext())
        {
          localObject = (Map.Entry)localIterator.next();
          paramFileInputStream = (String)((Map.Entry)localObject).getKey();
          q0.f localf = (q0.f)((Map.Entry)localObject).getValue();
          i.d(paramFileInputStream, "name");
          i.d(localf, "value");
          int i = localf.F();
          if (i == 0) {
            i = -1;
          } else {
            i = a.a[q0.g.c(i)];
          }
          switch (i)
          {
          case 0: 
          default: 
            throw new w();
          case 8: 
            throw new o0.a("Value not set.");
          case 7: 
            localObject = new d.a(paramFileInputStream);
            paramFileInputStream = localf.E().s();
            i.d(paramFileInputStream, "value.stringSet.stringsList");
            paramFileInputStream = q.x(paramFileInputStream);
            break;
          case 6: 
            paramFileInputStream = b.u0(paramFileInputStream);
            localObject = localf.D();
            i.d(localObject, "value.string");
            break;
          case 5: 
            localObject = new d.a(paramFileInputStream);
            paramFileInputStream = Long.valueOf(localf.C());
            break;
          case 4: 
            localObject = new d.a(paramFileInputStream);
            paramFileInputStream = Integer.valueOf(localf.B());
            break;
          case 3: 
            localObject = new d.a(paramFileInputStream);
            paramFileInputStream = Double.valueOf(localf.z());
            break;
          case 2: 
            localObject = new d.a(paramFileInputStream);
            paramFileInputStream = Float.valueOf(localf.A());
            locala.e((d.a)localObject, paramFileInputStream);
            break;
          case 1: 
            paramFileInputStream = b.j(paramFileInputStream);
            localObject = Boolean.valueOf(localf.x());
            locala.e(paramFileInputStream, localObject);
            break;
          case -1: 
            throw new o0.a("Value case is null.");
          }
        }
        return new a(new LinkedHashMap(locala.a()), true);
      }
      paramFileInputStream[0].getClass();
      locala.e(null, null);
      throw null;
    }
    catch (y paramFileInputStream)
    {
      throw new o0.a(paramFileInputStream);
    }
  }
  
  public final h c(Object paramObject, q.b paramb)
  {
    paramObject = ((d)paramObject).a();
    Object localObject1 = q0.d.s();
    Iterator localIterator = ((Map)paramObject).entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      paramObject = (d.a)((Map.Entry)localObject2).getKey();
      Object localObject3 = ((Map.Entry)localObject2).getValue();
      localObject2 = a;
      if ((localObject3 instanceof Boolean))
      {
        paramObject = q0.f.G();
        boolean bool = ((Boolean)localObject3).booleanValue();
        ((v.a)paramObject).j();
        q0.f.u((q0.f)b, bool);
      }
      else if ((localObject3 instanceof Float))
      {
        paramObject = q0.f.G();
        float f = ((Number)localObject3).floatValue();
        ((v.a)paramObject).j();
        q0.f.v((q0.f)b, f);
      }
      else if ((localObject3 instanceof Double))
      {
        paramObject = q0.f.G();
        double d = ((Number)localObject3).doubleValue();
        ((v.a)paramObject).j();
        q0.f.s((q0.f)b, d);
      }
      else if ((localObject3 instanceof Integer))
      {
        paramObject = q0.f.G();
        i = ((Number)localObject3).intValue();
        ((v.a)paramObject).j();
        q0.f.w((q0.f)b, i);
      }
      else if ((localObject3 instanceof Long))
      {
        paramObject = q0.f.G();
        long l = ((Number)localObject3).longValue();
        ((v.a)paramObject).j();
        q0.f.p((q0.f)b, l);
      }
      else if ((localObject3 instanceof String))
      {
        paramObject = q0.f.G();
        localObject3 = (String)localObject3;
        ((v.a)paramObject).j();
        q0.f.q((q0.f)b, (String)localObject3);
      }
      else
      {
        if (!(localObject3 instanceof Set)) {
          break label417;
        }
        paramObject = q0.f.G();
        e.a locala = e.t();
        localObject3 = (Set)localObject3;
        locala.j();
        e.q((e)b, (Set)localObject3);
        ((v.a)paramObject).j();
        q0.f.r((q0.f)b, locala);
      }
      paramObject = (q0.f)((v.a)paramObject).h();
      localObject1.getClass();
      localObject2.getClass();
      ((v.a)localObject1).j();
      q0.d.q((q0.d)b).put(localObject2, paramObject);
      continue;
      label417:
      throw new IllegalStateException(i.h(localObject3.getClass().getName(), "PreferencesSerializer does not support type: "));
    }
    paramObject = (q0.d)((v.a)localObject1).h();
    int j = ((v)paramObject).d();
    localObject1 = j.c;
    int i = j;
    if (j > 4096) {
      i = 4096;
    }
    paramb = new j.d(paramb, i);
    ((v)paramObject).g(paramb);
    if (g > 0) {
      paramb.u0();
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     r0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */