package h9;

import java.math.RoundingMode;
import ma.h;

public final class c
{
  public final f a = new f();
  public final a b = new a();
  public final b c = new b();
  
  public final m.e a(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt == 2) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (paramInt != 0) {
        return c;
      }
      return b;
    }
    throw null;
  }
  
  public final class a
    extends m.e
  {
    public a()
    {
      super();
    }
    
    public final void p(h paramh)
    {
      f localf = a;
      localf.getClass();
      for (int i = 0; i < paramh.size(); i++) {
        localf.b(paramh.i(i));
      }
      localf.d((byte)0);
      localf.d((byte)1);
    }
    
    public final void q(double paramDouble)
    {
      f localf = a;
      localf.getClass();
      long l1 = Double.doubleToLongBits(paramDouble);
      if (l1 < 0L) {
        l2 = -1L;
      } else {
        l2 = Long.MIN_VALUE;
      }
      long l2 = l1 ^ l2;
      int i = e.a(64 - Long.numberOfLeadingZeros(l2), 8, RoundingMode.UP);
      localf.a(i + 1);
      byte[] arrayOfByte = a;
      int j = b;
      int k = j + 1;
      b = k;
      arrayOfByte[j] = ((byte)(byte)i);
      j = k + i;
      for (;;)
      {
        j--;
        k = b;
        if (j < k) {
          break;
        }
        a[j] = ((byte)(byte)(int)(0xFF & l2));
        l2 >>>= 8;
      }
      b = (k + i);
    }
    
    public final void r()
    {
      f localf = a;
      localf.d((byte)-1);
      localf.d((byte)-1);
    }
    
    public final void t(long paramLong)
    {
      a.f(paramLong);
    }
    
    public final void u(String paramString)
    {
      f localf = a;
      localf.getClass();
      int i = paramString.length();
      for (int j = 0; j < i; j++)
      {
        int k = paramString.charAt(j);
        if (k >= 128)
        {
          int m;
          if (k < 2048)
          {
            m = k >>> 6 | 0x3C0;
          }
          else
          {
            if ((k >= 55296) && (57343 >= k))
            {
              k = Character.codePointAt(paramString, j);
              j++;
              localf.b((byte)(k >>> 18 | 0xF0));
              m = k >>> 12 & 0x3F | 0x80;
            }
            else
            {
              m = k >>> 12 | 0x1E0;
            }
            localf.b((byte)m);
            m = k >>> 6 & 0x3F | 0x80;
          }
          localf.b((byte)m);
          k = k & 0x3F | 0x80;
        }
        localf.b((byte)k);
      }
      localf.d((byte)0);
      localf.d((byte)1);
    }
  }
  
  public final class b
    extends m.e
  {
    public b()
    {
      super();
    }
    
    public final void p(h paramh)
    {
      f localf = a;
      localf.getClass();
      for (int i = 0; i < paramh.size(); i++) {
        localf.c(paramh.i(i));
      }
      localf.e((byte)0);
      localf.e((byte)1);
    }
    
    public final void q(double paramDouble)
    {
      f localf = a;
      localf.getClass();
      long l1 = Double.doubleToLongBits(paramDouble);
      if (l1 < 0L) {
        l2 = -1L;
      } else {
        l2 = Long.MIN_VALUE;
      }
      long l2 = l1 ^ l2;
      int i = e.a(64 - Long.numberOfLeadingZeros(l2), 8, RoundingMode.UP);
      localf.a(i + 1);
      byte[] arrayOfByte = a;
      int j = b;
      int k = j + 1;
      b = k;
      arrayOfByte[j] = ((byte)(byte)i);
      k += i;
      for (;;)
      {
        k--;
        j = b;
        if (k < j) {
          break;
        }
        a[k] = ((byte)(byte)(int)(0xFF & l2));
        l2 >>>= 8;
      }
      b = (j + i);
    }
    
    public final void r()
    {
      f localf = a;
      localf.e((byte)-1);
      localf.e((byte)-1);
    }
    
    public final void t(long paramLong)
    {
      a.f(paramLong);
    }
    
    public final void u(String paramString)
    {
      f localf = a;
      localf.getClass();
      int i = paramString.length();
      for (int j = 0; j < i; j++)
      {
        int k = paramString.charAt(j);
        if (k >= 128)
        {
          int m;
          if (k < 2048)
          {
            m = k >>> 6 | 0x3C0;
          }
          else
          {
            if ((k >= 55296) && (57343 >= k))
            {
              k = Character.codePointAt(paramString, j);
              j++;
              localf.c((byte)(k >>> 18 | 0xF0));
              m = k >>> 12 & 0x3F | 0x80;
            }
            else
            {
              m = k >>> 12 | 0x1E0;
            }
            localf.c((byte)m);
            m = k >>> 6 & 0x3F | 0x80;
          }
          localf.c((byte)m);
          k = k & 0x3F | 0x80;
        }
        localf.c((byte)k);
      }
      localf.e((byte)0);
      localf.e((byte)1);
    }
  }
}

/* Location:
 * Qualified Name:     h9.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */