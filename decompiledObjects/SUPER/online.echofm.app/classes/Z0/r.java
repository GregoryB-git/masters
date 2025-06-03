package Z0;

import F0.Q;
import F0.s;
import g0.z;

public abstract class r
{
  public static final int[] a = { 1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686 };
  
  public static boolean a(int paramInt, boolean paramBoolean)
  {
    if (paramInt >>> 8 == 3368816) {
      return true;
    }
    if ((paramInt == 1751476579) && (paramBoolean)) {
      return true;
    }
    int[] arrayOfInt = a;
    int i = arrayOfInt.length;
    for (int j = 0; j < i; j++) {
      if (arrayOfInt[j] == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  public static Q b(s params)
  {
    return c(params, true, false);
  }
  
  public static Q c(s params, boolean paramBoolean1, boolean paramBoolean2)
  {
    long l1 = params.a();
    boolean bool1 = l1 < -1L;
    long l2 = 4096L;
    long l3 = l2;
    if (bool1) {
      if (l1 > 4096L) {
        l3 = l2;
      } else {
        l3 = l1;
      }
    }
    int i = (int)l3;
    z localz = new z(64);
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool3;
    if (bool3 < i)
    {
      localz.P(8);
      if (!params.l(localz.e(), bool2, 8, true)) {}
    }
    else
    {
      l2 = localz.I();
      boolean bool5 = localz.p();
      int j;
      if (l2 == 1L)
      {
        params.n(localz.e(), 8, 8);
        j = 16;
        localz.S(16);
        l3 = localz.z();
      }
      for (;;)
      {
        break;
        l3 = l2;
        if (l2 == 0L)
        {
          long l4 = params.a();
          l3 = l2;
          if (l4 != -1L) {
            l3 = l4 - params.m() + 8;
          }
        }
        j = 8;
      }
      l2 = j;
      if (l3 < l2) {
        return new c(bool5, l3, j);
      }
      boolean bool7 = bool3 + j;
      boolean bool6;
      if (bool5 == 1836019574)
      {
        int m = i + (int)l3;
        l3 = l1;
        i = m;
        bool6 = bool2;
        bool3 = bool7;
        bool5 = bool4;
        if (bool1)
        {
          l3 = l1;
          i = m;
          bool6 = bool2;
          bool3 = bool7;
          bool5 = bool4;
          if (m > l1)
          {
            i = (int)l1;
            bool5 = bool4;
            bool3 = bool7;
            bool6 = bool2;
            l3 = l1;
          }
        }
      }
      for (;;)
      {
        l1 = l3;
        bool2 = bool6;
        bool4 = bool5;
        break;
        if ((bool5 == 1836019558) || (bool5 == 1836475768)) {
          break label625;
        }
        if (bool5 == 1835295092) {
          bool4 = true;
        }
        if (bool7 + l3 - l2 >= i)
        {
          bool2 = false;
          break label631;
        }
        int k = (int)(l3 - l2);
        bool3 = bool7 + k;
        if (bool5 == 1718909296)
        {
          if (k < 8) {
            return new c(bool5, k, 8);
          }
          localz.P(k);
          params.n(localz.e(), 0, k);
          k = localz.p();
          if (a(k, paramBoolean2)) {
            bool4 = true;
          }
          localz.U(4);
          bool5 = localz.a() / 4;
          int[] arrayOfInt;
          if ((!bool4) && (bool5))
          {
            arrayOfInt = new int[bool5];
            for (bool2 = false; bool2 < bool5; bool2++)
            {
              bool7 = localz.p();
              arrayOfInt[bool2] = bool7;
              if (a(bool7, paramBoolean2))
              {
                bool4 = true;
                break;
              }
            }
          }
          else
          {
            arrayOfInt = null;
          }
          if (!bool4) {
            return new w(k, arrayOfInt);
          }
          bool2 = bool4;
        }
        else
        {
          bool2 = bool4;
          if (k != 0)
          {
            params.o(k);
            bool2 = bool4;
          }
        }
        k = 0;
        l3 = l1;
        bool5 = bool2;
      }
      label625:
      bool2 = true;
    }
    label631:
    if (!bool4) {
      return n.a;
    }
    if (paramBoolean1 != bool2)
    {
      if (bool2) {
        params = i.b;
      } else {
        params = i.c;
      }
      return params;
    }
    return null;
  }
  
  public static Q d(s params, boolean paramBoolean)
  {
    return c(params, false, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     Z0.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */