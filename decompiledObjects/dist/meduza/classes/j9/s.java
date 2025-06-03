package j9;

import b.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import ka.c;
import ka.d0;
import ka.d0.a;
import ka.u;
import ka.u.a;
import ma.a0;
import ma.h;
import ma.h.h;
import ma.n1;
import ma.n1.a;
import ma.w;
import ma.w.a;
import n9.o;
import oa.a;
import oa.a.a;
import q0.g;
import r3.j;

public final class s
{
  public static final d0 a;
  public static final d0 b;
  public static final d0 c;
  public static final d0 d;
  public static final d0 e;
  public static final d0 f;
  public static final d0 g;
  public static d0 h;
  public static d0 i;
  public static d0 j;
  public static d0 k;
  public static d0 l;
  public static d0 m;
  public static d0 n;
  public static d0 o;
  public static d0 p;
  
  static
  {
    Object localObject1 = d0.d0();
    ((d0.a)localObject1).q(NaN.0D);
    a = (d0)((w.a)localObject1).k();
    localObject1 = d0.d0();
    ((w.a)localObject1).m();
    d0.N((d0)b);
    localObject1 = (d0)((w.a)localObject1).k();
    b = (d0)localObject1;
    c = (d0)localObject1;
    localObject1 = d0.d0();
    ((d0.a)localObject1).v("__max__");
    Object localObject2 = (d0)((w.a)localObject1).k();
    d = (d0)localObject2;
    localObject1 = d0.d0();
    Object localObject3 = u.M();
    ((u.a)localObject3).p((d0)localObject2, "__type__");
    ((d0.a)localObject1).t((u.a)localObject3);
    e = (d0)((w.a)localObject1).k();
    localObject1 = d0.d0();
    ((d0.a)localObject1).v("__vector__");
    localObject2 = (d0)((w.a)localObject1).k();
    f = (d0)localObject2;
    localObject3 = d0.d0();
    localObject1 = u.M();
    ((u.a)localObject1).p((d0)localObject2, "__type__");
    localObject2 = d0.d0();
    ((d0.a)localObject2).p(ka.b.M());
    ((u.a)localObject1).p((d0)((w.a)localObject2).k(), "value");
    ((d0.a)localObject3).t((u.a)localObject1);
    g = (d0)((w.a)localObject3).k();
    localObject1 = d0.d0();
    ((w.a)localObject1).m();
    d0.O((d0)b, false);
    h = (d0)((w.a)localObject1).k();
    localObject1 = d0.d0();
    ((d0.a)localObject1).q(NaN.0D);
    i = (d0)((w.a)localObject1).k();
    localObject3 = d0.d0();
    localObject1 = n1.L();
    ((n1.a)localObject1).p(Long.MIN_VALUE);
    ((d0.a)localObject3).w((n1.a)localObject1);
    j = (d0)((w.a)localObject3).k();
    localObject1 = d0.d0();
    ((d0.a)localObject1).v("");
    k = (d0)((w.a)localObject1).k();
    localObject1 = d0.d0();
    localObject3 = h.b;
    ((w.a)localObject1).m();
    d0.I((d0)b, (h)localObject3);
    l = (d0)((w.a)localObject1).k();
    localObject3 = i.g();
    localObject1 = d0.d0();
    localObject3 = String.format("projects/%s/databases/%s/documents/%s", new Object[] { "", "", ((i)localObject3).toString() });
    ((w.a)localObject1).m();
    d0.J((d0)b, (String)localObject3);
    m = (d0)((w.a)localObject1).k();
    localObject1 = d0.d0();
    localObject3 = a.L();
    ((w.a)localObject3).m();
    a.G((a)b, -90.0D);
    ((w.a)localObject3).m();
    a.H((a)b, -180.0D);
    ((d0.a)localObject1).r((a.a)localObject3);
    n = (d0)((w.a)localObject1).k();
    localObject1 = d0.d0();
    localObject3 = ka.b.J();
    ((w.a)localObject1).m();
    d0.L((ka.b)localObject3, (d0)b);
    o = (d0)((w.a)localObject1).k();
    localObject1 = d0.d0();
    ((d0.a)localObject1).u(u.H());
    p = (d0)((w.a)localObject1).k();
  }
  
  public static String a(d0 paramd0)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    b(localStringBuilder, paramd0);
    return localStringBuilder.toString();
  }
  
  public static void b(StringBuilder paramStringBuilder, d0 paramd0)
  {
    int i1 = g.c(paramd0.c0());
    int i2 = 1;
    int i3 = 0;
    switch (i1)
    {
    default: 
      paramStringBuilder = f.l("Invalid value type: ");
      paramStringBuilder.append(f.s(paramd0.c0()));
      x6.b.T(paramStringBuilder.toString(), new Object[0]);
      throw null;
    case 10: 
      paramd0 = paramd0.Y();
      Object localObject = new ArrayList(paramd0.J().keySet());
      Collections.sort((List)localObject);
      paramStringBuilder.append("{");
      Iterator localIterator = ((ArrayList)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        if (i2 == 0) {
          paramStringBuilder.append(",");
        } else {
          i2 = 0;
        }
        paramStringBuilder.append((String)localObject);
        paramStringBuilder.append(":");
        b(paramStringBuilder, paramd0.L((String)localObject));
      }
      paramStringBuilder.append("}");
      break;
    case 9: 
      paramd0 = paramd0.R();
      paramStringBuilder.append("[");
      for (i2 = i3; i2 < paramd0.L(); i2++)
      {
        b(paramStringBuilder, paramd0.K(i2));
        if (i2 != paramd0.L() - 1) {
          paramStringBuilder.append(",");
        }
      }
      paramStringBuilder.append("]");
      break;
    case 8: 
      paramd0 = paramd0.W();
      paramStringBuilder.append(String.format("geo(%s,%s)", new Object[] { Double.valueOf(paramd0.J()), Double.valueOf(paramd0.K()) }));
      break;
    case 7: 
      x6.b.Z("Value should be a ReferenceValue", k(paramd0), new Object[0]);
      paramStringBuilder.append(i.h(paramd0.Z()));
      break;
    case 6: 
      paramd0 = o.i(paramd0.T());
      break;
    case 5: 
      paramd0 = paramd0.a0();
      break;
    case 4: 
      paramd0 = paramd0.b0();
      paramStringBuilder.append(String.format("time(%s,%s)", new Object[] { Long.valueOf(paramd0.K()), Integer.valueOf(paramd0.J()) }));
      break;
    case 3: 
      paramStringBuilder.append(paramd0.V());
      break;
    case 2: 
      paramStringBuilder.append(paramd0.X());
      break;
    case 1: 
      paramStringBuilder.append(paramd0.S());
      break;
    case 0: 
      paramd0 = "null";
    }
    paramStringBuilder.append(paramd0);
  }
  
  public static int c(d0 paramd01, d0 paramd02)
  {
    int i1 = n(paramd01);
    int i2 = n(paramd02);
    if (i1 != i2) {
      return o.d(i1, i2);
    }
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    i2 = i4;
    if (i1 != Integer.MAX_VALUE)
    {
      i2 = i4;
      Object localObject1;
      boolean bool1;
      boolean bool2;
      label368:
      double d1;
      double d2;
      switch (i1)
      {
      default: 
        x6.b.T(f.h("Invalid value type: ", i1), new Object[0]);
        throw null;
      case 11: 
        paramd01 = paramd01.Y();
        paramd02 = paramd02.Y();
        paramd01 = new TreeMap(paramd01.J()).entrySet().iterator();
        localObject1 = new TreeMap(paramd02.J()).entrySet().iterator();
        while ((paramd01.hasNext()) && (((Iterator)localObject1).hasNext()))
        {
          Map.Entry localEntry = (Map.Entry)paramd01.next();
          paramd02 = (Map.Entry)((Iterator)localObject1).next();
          String str1 = (String)localEntry.getKey();
          String str2 = (String)paramd02.getKey();
          Object localObject2 = o.a;
          localObject2 = h.b;
          localObject2 = a0.a;
          i2 = o.c(new h.h(str1.getBytes((Charset)localObject2)), new h.h(str2.getBytes((Charset)localObject2)));
          if (i2 != 0) {
            break label368;
          }
          i2 = c((d0)localEntry.getValue(), (d0)paramd02.getValue());
          if (i2 != 0) {
            break label368;
          }
        }
        bool1 = paramd01.hasNext();
        bool2 = ((Iterator)localObject1).hasNext();
        paramd01 = o.a;
        if (bool1 == bool2) {
          i2 = i5;
        } else if (bool1) {
          i2 = 1;
        } else {
          i2 = -1;
        }
        return i2;
      case 10: 
        paramd01 = paramd01.Y();
        paramd02 = paramd02.Y();
        paramd01 = paramd01.J();
        paramd02 = paramd02.J();
        paramd01 = ((d0)paramd01.get("value")).R();
        paramd02 = ((d0)paramd02.get("value")).R();
        i2 = o.d(paramd01.L(), paramd02.L());
        if (i2 == 0) {
          i2 = d(paramd01, paramd02);
        }
        return i2;
      case 9: 
        return d(paramd01.R(), paramd02.R());
      case 8: 
        paramd01 = paramd01.W();
        localObject1 = paramd02.W();
        d1 = paramd01.J();
        d2 = ((a)localObject1).J();
        paramd02 = o.a;
        i5 = z.j(d1, d2);
        i2 = i5;
        if (i5 == 0) {
          i2 = z.j(paramd01.K(), ((a)localObject1).K());
        }
        return i2;
      case 7: 
        paramd01 = paramd01.Z();
        paramd02 = paramd02.Z();
        paramd01 = paramd01.split("/", -1);
        paramd02 = paramd02.split("/", -1);
        i4 = Math.min(paramd01.length, paramd02.length);
        for (i2 = i3; i2 < i4; i2++)
        {
          i5 = paramd01[i2].compareTo(paramd02[i2]);
          if (i5 != 0)
          {
            i2 = i5;
            break label601;
          }
        }
        i2 = o.d(paramd01.length, paramd02.length);
        return i2;
      case 6: 
        return o.c(paramd01.T(), paramd02.T());
      case 5: 
        paramd01 = paramd01.a0();
        paramd02 = paramd02.a0();
        localObject1 = o.a;
        localObject1 = h.b;
        localObject1 = a0.a;
        return o.c(new h.h(paramd01.getBytes((Charset)localObject1)), new h.h(paramd02.getBytes((Charset)localObject1)));
      case 4: 
        return e(p.a(paramd01), p.a(paramd02));
      case 3: 
        return e(paramd01.b0(), paramd02.b0());
      case 2: 
        if (paramd01.c0() == 4)
        {
          d2 = paramd01.V();
          if (paramd02.c0() == 4)
          {
            d1 = paramd02.V();
            paramd01 = o.a;
            i2 = z.j(d2, d1);
          }
          else
          {
            if (paramd02.c0() != 3) {
              break label823;
            }
            i2 = o.e(d2, paramd02.X());
          }
        }
        else
        {
          if (paramd01.c0() != 3) {
            break label823;
          }
          long l1 = paramd01.X();
          if (paramd02.c0() == 3)
          {
            long l2 = paramd02.X();
            paramd01 = o.a;
            i2 = Long.compare(l1, l2);
          }
          else
          {
            if (paramd02.c0() != 4) {
              break label823;
            }
            i2 = o.e(paramd02.V(), l1) * -1;
          }
        }
        return i2;
        x6.b.T("Unexpected values: %s vs %s", new Object[] { paramd01, paramd02 });
        throw null;
      case 1: 
        label601:
        label823:
        bool2 = paramd01.S();
        bool1 = paramd02.S();
        paramd01 = o.a;
        if (bool2 == bool1) {
          i2 = i4;
        } else if (bool2) {
          i2 = 1;
        } else {
          i2 = -1;
        }
        break;
      }
    }
    return i2;
  }
  
  public static int d(ka.b paramb1, ka.b paramb2)
  {
    int i1 = Math.min(paramb1.L(), paramb2.L());
    for (int i2 = 0; i2 < i1; i2++)
    {
      int i3 = c(paramb1.K(i2), paramb2.K(i2));
      if (i3 != 0) {
        return i3;
      }
    }
    return o.d(paramb1.L(), paramb2.L());
  }
  
  public static int e(n1 paramn11, n1 paramn12)
  {
    long l1 = paramn11.K();
    long l2 = paramn12.K();
    j localj = o.a;
    int i1 = Long.compare(l1, l2);
    if (i1 != 0) {
      return i1;
    }
    return o.d(paramn11.J(), paramn12.J());
  }
  
  public static boolean f(c paramc, d0 paramd0)
  {
    paramc = paramc.h().iterator();
    while (paramc.hasNext()) {
      if (g((d0)paramc.next(), paramd0)) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean g(d0 paramd01, d0 paramd02)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    if (paramd01 == paramd02) {
      return true;
    }
    boolean bool4 = false;
    boolean bool5 = bool4;
    if (paramd01 != null) {
      if (paramd02 == null)
      {
        bool5 = bool4;
      }
      else
      {
        int i1 = n(paramd01);
        if (i1 != n(paramd02)) {
          return false;
        }
        if (i1 != 2)
        {
          if (i1 != 4)
          {
            bool5 = bool1;
            if (i1 != Integer.MAX_VALUE)
            {
              switch (i1)
              {
              default: 
                return paramd01.equals(paramd02);
              case 10: 
              case 11: 
                Object localObject = paramd01.Y();
                paramd01 = paramd02.Y();
                if (((u)localObject).I() == paramd01.I())
                {
                  localObject = ((u)localObject).J().entrySet().iterator();
                  d0 locald0;
                  do
                  {
                    bool5 = bool3;
                    if (!((Iterator)localObject).hasNext()) {
                      break;
                    }
                    paramd02 = (Map.Entry)((Iterator)localObject).next();
                    locald0 = (d0)paramd01.J().get(paramd02.getKey());
                  } while (g((d0)paramd02.getValue(), locald0));
                }
                bool5 = false;
                return bool5;
              }
              paramd01 = paramd01.R();
              paramd02 = paramd02.R();
              if (paramd01.L() == paramd02.L()) {}
              for (i1 = 0;; i1++)
              {
                bool5 = bool1;
                if (i1 >= paramd01.L()) {
                  break;
                }
                if (!g(paramd01.K(i1), paramd02.K(i1)))
                {
                  bool5 = false;
                  break;
                }
              }
            }
            return bool5;
          }
          return p.a(paramd01).equals(p.a(paramd02));
        }
        if ((paramd01.c0() == 3) && (paramd02.c0() == 3))
        {
          if (paramd01.X() == paramd02.X())
          {
            bool5 = bool2;
            break label390;
          }
        }
        else
        {
          bool5 = bool4;
          if (paramd01.c0() != 4) {
            break label390;
          }
          bool5 = bool4;
          if (paramd02.c0() != 4) {
            break label390;
          }
          if (Double.doubleToLongBits(paramd01.V()) == Double.doubleToLongBits(paramd02.V()))
          {
            bool5 = bool2;
            break label390;
          }
        }
        bool5 = false;
      }
    }
    label390:
    return bool5;
  }
  
  public static boolean h(d0 paramd0)
  {
    boolean bool;
    if ((paramd0 != null) && (paramd0.c0() == 10)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean i(d0 paramd0)
  {
    boolean bool;
    if ((paramd0 != null) && (paramd0.c0() == 4)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean j(d0 paramd0)
  {
    boolean bool;
    if ((paramd0 != null) && (paramd0.c0() == 3)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean k(d0 paramd0)
  {
    boolean bool;
    if ((paramd0 != null) && (paramd0.c0() == 8)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean l(d0 paramd0)
  {
    return f.equals(paramd0.Y().J().get("__type__"));
  }
  
  public static d0 m(f paramf, i parami)
  {
    d0.a locala = d0.d0();
    paramf = String.format("projects/%s/databases/%s/documents/%s", new Object[] { a, b, parami.toString() });
    locala.m();
    d0.J((d0)b, paramf);
    return (d0)locala.k();
  }
  
  public static int n(d0 paramd0)
  {
    switch (g.c(paramd0.c0()))
    {
    default: 
      StringBuilder localStringBuilder = f.l("Invalid value type: ");
      localStringBuilder.append(f.s(paramd0.c0()));
      x6.b.T(localStringBuilder.toString(), new Object[0]);
      throw null;
    case 10: 
      if (p.c(paramd0)) {
        return 4;
      }
      if (d.equals(paramd0.Y().J().get("__type__"))) {
        return Integer.MAX_VALUE;
      }
      if (l(paramd0)) {
        return 10;
      }
      return 11;
    case 9: 
      return 9;
    case 8: 
      return 8;
    case 7: 
      return 7;
    case 6: 
      return 6;
    case 5: 
      return 5;
    case 4: 
      return 3;
    case 2: 
    case 3: 
      return 2;
    case 1: 
      return 1;
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     j9.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */