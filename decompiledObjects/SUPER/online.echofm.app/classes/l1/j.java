package l1;

import X2.v;
import android.util.SparseArray;
import d0.q.b;
import g0.d;
import g0.z;
import java.util.ArrayList;
import java.util.List;

public final class j
  implements K.c
{
  public final int a;
  public final List b;
  
  public j(int paramInt)
  {
    this(paramInt, v.Y());
  }
  
  public j(int paramInt, List paramList)
  {
    a = paramInt;
    b = paramList;
  }
  
  public SparseArray a()
  {
    return new SparseArray();
  }
  
  public K b(int paramInt, K.b paramb)
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
              if (paramInt != 45)
              {
                if (paramInt != 89)
                {
                  if (paramInt != 172)
                  {
                    if (paramInt != 257)
                    {
                      if (paramInt != 138) {
                        if (paramInt != 139) {
                          switch (paramInt)
                          {
                          default: 
                            switch (paramInt)
                            {
                            default: 
                              switch (paramInt)
                              {
                              default: 
                                return null;
                              case 134: 
                                if (f(16)) {
                                  paramb = (K.b)localObject4;
                                } else {
                                  paramb = new E(new x("application/x-scte35"));
                                }
                                return paramb;
                              }
                            case 130: 
                              if (f(64)) {
                                break;
                              }
                              return null;
                            case 129: 
                              return new y(new c(b, paramb.a()));
                            }
                            break;
                          case 17: 
                            if (f(2)) {
                              paramb = (K.b)localObject1;
                            } else {
                              paramb = new y(new s(b, paramb.a()));
                            }
                            return paramb;
                          case 16: 
                            return new y(new o(d(paramb)));
                          case 15: 
                            if (f(2)) {
                              paramb = (K.b)localObject2;
                            } else {
                              paramb = new y(new i(false, b, paramb.a()));
                            }
                            return paramb;
                          }
                        } else {
                          return new y(new k(b, paramb.a(), 5408));
                        }
                      }
                      return new y(new k(b, paramb.a(), 4096));
                    }
                    return new E(new x("application/vnd.dvb.ait"));
                  }
                  return new y(new f(b, paramb.a()));
                }
                return new y(new l(d));
              }
              return new y(new u());
            }
            return new y(new q(c(paramb)));
          }
          if (f(4)) {
            paramb = (K.b)localObject3;
          } else {
            paramb = new y(new p(c(paramb), f(1), f(8)));
          }
          return paramb;
        }
        return new y(new r());
      }
      return new y(new t(b, paramb.a()));
    }
    return new y(new n(d(paramb)));
  }
  
  public final F c(K.b paramb)
  {
    return new F(e(paramb));
  }
  
  public final M d(K.b paramb)
  {
    return new M(e(paramb));
  }
  
  public final List e(K.b paramb)
  {
    if (f(32)) {
      return b;
    }
    z localz = new z(e);
    paramb = b;
    while (localz.a() > 0)
    {
      int i = localz.G();
      int j = localz.G();
      int k = localz.f();
      if (i == 134)
      {
        ArrayList localArrayList = new ArrayList();
        int m = localz.G();
        for (i = 0;; i++)
        {
          paramb = localArrayList;
          if (i >= (m & 0x1F)) {
            break;
          }
          String str = localz.D(3);
          int n = localz.G();
          boolean bool = true;
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
          int i2 = (byte)localz.G();
          localz.U(1);
          List localList;
          if (i1 != 0)
          {
            if ((i2 & 0x40) == 0) {
              bool = false;
            }
            localList = d.b(bool);
          }
          else
          {
            localList = null;
          }
          localArrayList.add(new q.b().o0(paramb).e0(str).L(n).b0(localList).K());
        }
      }
      localz.T(k + j);
    }
    return paramb;
  }
  
  public final boolean f(int paramInt)
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
 * Qualified Name:     l1.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */