package gb;

import f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import x6.b;

public final class m1
{
  public static final Logger a = Logger.getLogger(m1.class.getName());
  
  public static Object a(la.a parama)
  {
    b.I(parama.I(), "unexpected end of JSON");
    int i = q0.g.c(parama.i0());
    boolean bool = false;
    label278:
    label540:
    label610:
    Object localObject2;
    if (i != 0)
    {
      char c1 = '"';
      if (i != 2)
      {
        if (i != 5)
        {
          if (i != 6)
          {
            if (i != 7)
            {
              if (i == 8)
              {
                j = o;
                i = j;
                if (j == 0) {
                  i = parama.g();
                }
                if (i == 7)
                {
                  o = 0;
                  localObject1 = v;
                  i = t - 1;
                  localObject1[i] += 1;
                  return null;
                }
                localObject1 = f.l("Expected null but was ");
                ((StringBuilder)localObject1).append(g.s(parama.i0()));
                ((StringBuilder)localObject1).append(parama.Q());
                throw new IllegalStateException(((StringBuilder)localObject1).toString());
              }
              localObject1 = f.l("Bad token: ");
              ((StringBuilder)localObject1).append(parama.H());
              throw new IllegalStateException(((StringBuilder)localObject1).toString());
            }
            j = o;
            i = j;
            if (j == 0) {
              i = parama.g();
            }
            if (i == 5)
            {
              o = 0;
              localObject1 = v;
              i = t - 1;
              localObject1[i] += 1;
              bool = true;
            }
            else
            {
              if (i != 6) {
                break label278;
              }
              o = 0;
              localObject1 = v;
              i = t - 1;
              localObject1[i] += 1;
            }
            return Boolean.valueOf(bool);
            localObject1 = f.l("Expected a boolean but was ");
            ((StringBuilder)localObject1).append(g.s(parama.i0()));
            ((StringBuilder)localObject1).append(parama.Q());
            throw new IllegalStateException(((StringBuilder)localObject1).toString());
          }
          j = o;
          i = j;
          if (j == 0) {
            i = parama.g();
          }
          double d;
          if (i == 15)
          {
            o = 0;
            localObject1 = v;
            i = t - 1;
            localObject1[i] += 1;
            d = p;
          }
          else
          {
            if (i == 16)
            {
              r = new String(b, c, q);
              c += q;
            }
            else
            {
              if ((i != 8) && (i != 9))
              {
                if (i == 10)
                {
                  localObject1 = parama.h0();
                }
                else
                {
                  if (i == 11) {
                    break label540;
                  }
                  localObject1 = f.l("Expected a double but was ");
                  ((StringBuilder)localObject1).append(g.s(parama.i0()));
                  ((StringBuilder)localObject1).append(parama.Q());
                  throw new IllegalStateException(((StringBuilder)localObject1).toString());
                }
              }
              else
              {
                char c2 = c1;
                if (i == 8)
                {
                  i = 39;
                  c2 = i;
                }
                localObject1 = parama.c0(c2);
              }
              r = ((String)localObject1);
            }
            o = 11;
            d = Double.parseDouble(r);
            if ((Double.isNaN(d)) || (Double.isInfinite(d))) {
              break label610;
            }
            r = null;
            o = 0;
            localObject1 = v;
            i = t - 1;
            localObject1[i] += 1;
          }
          return Double.valueOf(d);
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("JSON forbids NaN and infinities: ");
          ((StringBuilder)localObject1).append(d);
          ((StringBuilder)localObject1).append(parama.Q());
          throw new y3.a(((StringBuilder)localObject1).toString());
        }
        j = o;
        i = j;
        if (j == 0) {
          i = parama.g();
        }
        if (i == 10)
        {
          localObject1 = parama.h0();
        }
        else if (i == 8)
        {
          localObject1 = parama.c0('\'');
        }
        else if (i == 9)
        {
          localObject1 = parama.c0('"');
        }
        else if (i == 11)
        {
          localObject1 = r;
          r = null;
        }
        else if (i == 15)
        {
          localObject1 = Long.toString(p);
        }
        else
        {
          if (i != 16) {
            break label835;
          }
          localObject1 = new String(b, c, q);
          c += q;
        }
        o = 0;
        localObject2 = v;
        i = t - 1;
        localObject2[i] += 1;
        return localObject1;
        label835:
        localObject1 = f.l("Expected a string but was ");
        ((StringBuilder)localObject1).append(g.s(parama.i0()));
        ((StringBuilder)localObject1).append(parama.Q());
        throw new IllegalStateException(((StringBuilder)localObject1).toString());
      }
      j = o;
      i = j;
      if (j == 0) {
        i = parama.g();
      }
      if (i == 1)
      {
        parama.k0(3);
        o = 0;
        localObject2 = new LinkedHashMap();
        while (parama.I())
        {
          j = o;
          i = j;
          if (j == 0) {
            i = parama.g();
          }
          if (i == 14)
          {
            localObject1 = parama.h0();
          }
          else if (i == 12)
          {
            localObject1 = parama.c0('\'');
          }
          else
          {
            if (i != 13) {
              break label1028;
            }
            localObject1 = parama.c0('"');
          }
          o = 0;
          u[(t - 1)] = localObject1;
          ((Map)localObject2).put(localObject1, a(parama));
          continue;
          label1028:
          localObject1 = f.l("Expected a name but was ");
          ((StringBuilder)localObject1).append(g.s(parama.i0()));
          ((StringBuilder)localObject1).append(parama.Q());
          throw new IllegalStateException(((StringBuilder)localObject1).toString());
        }
        if (parama.i0() == 4) {
          bool = true;
        } else {
          bool = false;
        }
        localObject1 = f.l("Bad token: ");
        ((StringBuilder)localObject1).append(parama.H());
        b.I(bool, ((StringBuilder)localObject1).toString());
        j = o;
        i = j;
        if (j == 0) {
          i = parama.g();
        }
        if (i == 2)
        {
          i = t - 1;
          t = i;
          u[i] = null;
          localObject1 = v;
          i--;
          localObject1[i] += 1;
          o = 0;
          return Collections.unmodifiableMap((Map)localObject2);
        }
        localObject1 = f.l("Expected END_OBJECT but was ");
        ((StringBuilder)localObject1).append(g.s(parama.i0()));
        ((StringBuilder)localObject1).append(parama.Q());
        throw new IllegalStateException(((StringBuilder)localObject1).toString());
      }
      localObject1 = f.l("Expected BEGIN_OBJECT but was ");
      ((StringBuilder)localObject1).append(g.s(parama.i0()));
      ((StringBuilder)localObject1).append(parama.Q());
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    int j = o;
    i = j;
    if (j == 0) {
      i = parama.g();
    }
    if (i == 3)
    {
      parama.k0(1);
      v[(t - 1)] = 0;
      o = 0;
      localObject1 = new ArrayList();
      while (parama.I()) {
        ((ArrayList)localObject1).add(a(parama));
      }
      if (parama.i0() == 2) {
        bool = true;
      } else {
        bool = false;
      }
      localObject2 = f.l("Bad token: ");
      ((StringBuilder)localObject2).append(parama.H());
      b.I(bool, ((StringBuilder)localObject2).toString());
      j = o;
      i = j;
      if (j == 0) {
        i = parama.g();
      }
      if (i == 4)
      {
        i = t - 1;
        t = i;
        localObject2 = v;
        i--;
        localObject2[i] += 1;
        o = 0;
        return Collections.unmodifiableList((List)localObject1);
      }
      localObject1 = f.l("Expected END_ARRAY but was ");
      ((StringBuilder)localObject1).append(g.s(parama.i0()));
      ((StringBuilder)localObject1).append(parama.Q());
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    Object localObject1 = f.l("Expected BEGIN_ARRAY but was ");
    ((StringBuilder)localObject1).append(g.s(parama.i0()));
    ((StringBuilder)localObject1).append(parama.Q());
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
}

/* Location:
 * Qualified Name:     gb.m1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */