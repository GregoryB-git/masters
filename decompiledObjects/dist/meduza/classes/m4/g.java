package m4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v3.i0;
import v3.i0.a;
import v5.u;

public final class g
  implements d0.c
{
  public final int a;
  public final List<i0> b;
  
  public g(int paramInt, List<i0> paramList)
  {
    a = paramInt;
    b = paramList;
  }
  
  public final d0 a(int paramInt, d0.b paramb)
  {
    if (paramInt != 2)
    {
      if ((paramInt != 3) && (paramInt != 4))
      {
        if (paramInt != 21)
        {
          Object localObject1 = null;
          Object localObject2 = null;
          Object localObject3 = null;
          Object localObject4 = null;
          if (paramInt != 27)
          {
            if (paramInt != 36)
            {
              if (paramInt != 89)
              {
                if (paramInt != 138) {
                  if (paramInt != 172)
                  {
                    if (paramInt != 257)
                    {
                      if (paramInt != 134)
                      {
                        if (paramInt != 135)
                        {
                          switch (paramInt)
                          {
                          default: 
                            switch (paramInt)
                            {
                            default: 
                              return null;
                            }
                          case 17: 
                            if (c(2)) {
                              paramb = (d0.b)localObject4;
                            } else {
                              paramb = new t(new p(a));
                            }
                            return paramb;
                          case 16: 
                            return new t(new l(new e0(b(paramb))));
                          }
                          if (c(2)) {
                            paramb = (d0.b)localObject1;
                          } else {
                            paramb = new t(new f(a, false));
                          }
                          return paramb;
                          if (!c(64)) {
                            return null;
                          }
                        }
                        else
                        {
                          return new t(new b(a));
                        }
                      }
                      else
                      {
                        if (c(16)) {
                          paramb = (d0.b)localObject2;
                        } else {
                          paramb = new y(new s("application/x-scte35"));
                        }
                        return paramb;
                      }
                    }
                    else {
                      return new y(new s("application/vnd.dvb.ait"));
                    }
                  }
                  else {
                    return new t(new d(a));
                  }
                }
                return new t(new h(a));
              }
              return new t(new i(b));
            }
            return new t(new n(new z(b(paramb))));
          }
          if (c(4)) {
            paramb = (d0.b)localObject3;
          } else {
            paramb = new t(new m(new z(b(paramb)), c(1), c(8)));
          }
          return paramb;
        }
        return new t(new o());
      }
      return new t(new q(a));
    }
    return new t(new k(new e0(b(paramb))));
  }
  
  public final List<i0> b(d0.b paramb)
  {
    if (c(32)) {
      return b;
    }
    u localu = new u(c);
    paramb = b;
    while (c - b > 0)
    {
      int i = localu.v();
      int j = localu.v();
      int k = b;
      if (i == 134)
      {
        ArrayList localArrayList = new ArrayList();
        int m = localu.v();
        for (i = 0;; i++)
        {
          paramb = localArrayList;
          if (i >= (m & 0x1F)) {
            break;
          }
          String str = localu.s(3);
          int n = localu.v();
          int i1;
          if ((n & 0x80) != 0) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          if (i1 != 0)
          {
            n &= 0x3F;
            paramb = "application/cea-708";
          }
          else
          {
            paramb = "application/cea-608";
            n = 1;
          }
          int i2 = (byte)localu.v();
          localu.H(1);
          Object localObject = null;
          if (i1 != 0)
          {
            if ((i2 & 0x40) != 0) {
              i1 = 1;
            } else {
              i1 = 0;
            }
            if (i1 != 0)
            {
              localObject = new byte[1];
              localObject[0] = ((byte)1);
            }
            else
            {
              localObject = new byte[1];
              localObject[0] = ((byte)0);
            }
            localObject = Collections.singletonList(localObject);
          }
          i0.a locala = new i0.a();
          k = paramb;
          c = str;
          C = n;
          m = ((List)localObject);
          localArrayList.add(new i0(locala));
        }
      }
      localu.G(k + j);
    }
    return paramb;
  }
  
  public final boolean c(int paramInt)
  {
    boolean bool;
    if ((paramInt & a) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     m4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */