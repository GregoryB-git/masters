package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jk
{
  private final int a;
  private final List<bw> b;
  
  public jk()
  {
    this(0);
  }
  
  public jk(int paramInt)
  {
    this(paramInt, Collections.singletonList(bw.a(null, "application/cea-608", 0, null)));
  }
  
  public jk(int paramInt, List<bw> paramList)
  {
    a = paramInt;
    b = paramList;
  }
  
  private jb a(jl paramjl)
  {
    return new jb(c(paramjl));
  }
  
  private boolean a(int paramInt)
  {
    return (paramInt & a) != 0;
  }
  
  private jm b(jl paramjl)
  {
    return new jm(c(paramjl));
  }
  
  private List<bw> c(jl paramjl)
  {
    if (a(32)) {
      return b;
    }
    vy localvy = new vy(d);
    paramjl = b;
    while (localvy.b() > 0)
    {
      int i = localvy.e();
      int j = localvy.e();
      int k = localvy.d();
      if (i == 134)
      {
        ArrayList localArrayList = new ArrayList();
        int m = localvy.e();
        for (i = 0;; i++)
        {
          paramjl = localArrayList;
          if (i >= (m & 0x1F)) {
            break;
          }
          String str = localvy.e(3);
          int n = localvy.e();
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
            paramjl = "application/cea-708";
          }
          else
          {
            paramjl = "application/cea-608";
            n = 1;
          }
          int i2 = (byte)localvy.e();
          localvy.d(1);
          List localList;
          if (i1 != 0)
          {
            if ((i2 & 0x40) == 0) {
              bool = false;
            }
            localList = rp.a(bool);
          }
          else
          {
            localList = null;
          }
          localArrayList.add(bw.a(null, paramjl, null, -1, 0, str, n, null, Long.MAX_VALUE, localList));
        }
      }
      localvy.c(k + j);
    }
    return paramjl;
  }
  
  public SparseArray<jj> a()
  {
    return new SparseArray();
  }
  
  public jj a(int paramInt, jl paramjl)
  {
    if (paramInt != 2)
    {
      if ((paramInt != 3) && (paramInt != 4))
      {
        if (paramInt != 15)
        {
          if (paramInt != 17)
          {
            if (paramInt != 21)
            {
              if (paramInt != 27)
              {
                if (paramInt != 36)
                {
                  if (paramInt != 89)
                  {
                    if (paramInt != 138) {
                      if (paramInt != 172)
                      {
                        if (paramInt != 129) {
                          if (paramInt != 130)
                          {
                            if (paramInt != 134)
                            {
                              if (paramInt != 135) {
                                return null;
                              }
                            }
                            else
                            {
                              if (a(16)) {
                                return null;
                              }
                              return new iy(new ja());
                            }
                          }
                          else
                          {
                            if (a(64)) {
                              break label170;
                            }
                            return null;
                          }
                        }
                        return new iw(new if(b));
                      }
                      else
                      {
                        return new iw(new ih(b));
                      }
                    }
                    label170:
                    return new iw(new ii(b));
                  }
                  return new iw(new il(c));
                }
                return new iw(new iq(a(paramjl)));
              }
              if (a(4)) {
                return null;
              }
              return new iw(new ip(a(paramjl), a(1), a(8)));
            }
            return new iw(new is());
          }
          if (a(2)) {
            return null;
          }
          return new iw(new iv(b));
        }
        if (a(2)) {
          return null;
        }
        return new iw(new ij(false, b));
      }
      return new iw(new iu(b));
    }
    return new iw(new in(b(paramjl)));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.jk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */