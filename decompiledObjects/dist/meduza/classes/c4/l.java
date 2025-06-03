package c4;

import v5.e0;
import v5.u;

public final class l
{
  public static boolean a(u paramu, o paramo, int paramInt, a parama)
  {
    int i = b;
    long l1 = paramu.w();
    long l2 = l1 >>> 16;
    if (l2 != paramInt) {
      return false;
    }
    if ((l2 & 1L) == 1L) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    int j = (int)(l1 >> 12 & 0xF);
    int k = (int)(l1 >> 8 & 0xF);
    int m = (int)(0xF & l1 >> 4);
    int n = (int)(l1 >> 1 & 0x7);
    int i1;
    if ((l1 & 1L) == 1L) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if (m <= 7 ? m == g - 1 : (m <= 10) && (g == 2)) {
      m = 1;
    } else {
      m = 0;
    }
    if (m != 0)
    {
      if ((n == 0) || (n == i)) {
        m = 1;
      } else {
        m = 0;
      }
      if ((m != 0) && (i1 == 0))
      {
        try
        {
          l1 = paramu.B();
          if (paramInt == 0) {
            l1 *= b;
          }
          a = l1;
          paramInt = 1;
        }
        catch (NumberFormatException parama)
        {
          paramInt = 0;
        }
        if (paramInt != 0)
        {
          paramInt = b(j, paramu);
          if ((paramInt != -1) && (paramInt <= b)) {
            paramInt = 1;
          } else {
            paramInt = 0;
          }
          if (paramInt != 0)
          {
            m = e;
            if (k != 0) {
              if (k <= 11)
              {
                if (k != f) {
                  break label363;
                }
              }
              else if (k == 12)
              {
                if (paramu.v() * 1000 != m) {
                  break label363;
                }
              }
              else
              {
                if (k > 14) {
                  break label363;
                }
                i1 = paramu.A();
                paramInt = i1;
                if (k == 14) {
                  paramInt = i1 * 10;
                }
                if (paramInt != m) {
                  break label363;
                }
              }
            }
            paramInt = 1;
            break label365;
            label363:
            paramInt = 0;
            label365:
            if (paramInt != 0)
            {
              m = paramu.v();
              k = b;
              paramu = a;
              paramInt = 0;
              for (i1 = i; i1 < k - 1; i1++) {
                paramInt = e0.o[(paramInt ^ paramu[i1] & 0xFF)];
              }
              i1 = e0.a;
              if (m == paramInt) {
                paramInt = 1;
              } else {
                paramInt = 0;
              }
              if (paramInt != 0)
              {
                bool = true;
                break label453;
              }
            }
          }
        }
      }
    }
    boolean bool = false;
    label453:
    return bool;
  }
  
  public static int b(int paramInt, u paramu)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
      return 256 << paramInt - 8;
    case 7: 
      return paramu.A() + 1;
    case 6: 
      return paramu.v() + 1;
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      return 576 << paramInt - 2;
    }
    return 192;
  }
  
  public static final class a
  {
    public long a;
  }
}

/* Location:
 * Qualified Name:     c4.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */