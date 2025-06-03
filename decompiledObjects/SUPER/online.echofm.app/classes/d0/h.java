package d0;

import g0.M;
import java.util.Arrays;

public final class h
{
  public static final h h = new b().d(1).c(2).e(3).a();
  public static final h i = new b().d(1).c(1).e(2).a();
  public static final String j = M.w0(0);
  public static final String k = M.w0(1);
  public static final String l = M.w0(2);
  public static final String m = M.w0(3);
  public static final String n = M.w0(4);
  public static final String o = M.w0(5);
  public final int a;
  public final int b;
  public final int c;
  public final byte[] d;
  public final int e;
  public final int f;
  public int g;
  
  public h(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte, int paramInt4, int paramInt5)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
    d = paramArrayOfByte;
    e = paramInt4;
    f = paramInt5;
  }
  
  public static String b(int paramInt)
  {
    Object localObject;
    if (paramInt != -1)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramInt);
      ((StringBuilder)localObject).append("bit Chroma");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "NA";
    }
    return (String)localObject;
  }
  
  public static String c(int paramInt)
  {
    if (paramInt != -1)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Undefined color range ");
          localStringBuilder.append(paramInt);
          return localStringBuilder.toString();
        }
        return "Limited range";
      }
      return "Full range";
    }
    return "Unset color range";
  }
  
  public static String d(int paramInt)
  {
    if (paramInt != -1)
    {
      if (paramInt != 6)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Undefined color space ");
            localStringBuilder.append(paramInt);
            return localStringBuilder.toString();
          }
          return "BT601";
        }
        return "BT709";
      }
      return "BT2020";
    }
    return "Unset color space";
  }
  
  public static String e(int paramInt)
  {
    if (paramInt != -1)
    {
      if (paramInt != 10)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 6)
              {
                if (paramInt != 7)
                {
                  StringBuilder localStringBuilder = new StringBuilder();
                  localStringBuilder.append("Undefined color transfer ");
                  localStringBuilder.append(paramInt);
                  return localStringBuilder.toString();
                }
                return "HLG";
              }
              return "ST2084 PQ";
            }
            return "SDR SMPTE 170M";
          }
          return "sRGB";
        }
        return "Linear";
      }
      return "Gamma 2.2";
    }
    return "Unset color transfer";
  }
  
  public static boolean h(h paramh)
  {
    boolean bool1 = true;
    if (paramh == null) {
      return true;
    }
    int i1 = a;
    if ((i1 == -1) || (i1 == 1) || (i1 == 2))
    {
      i1 = b;
      if ((i1 == -1) || (i1 == 2))
      {
        i1 = c;
        if (((i1 == -1) || (i1 == 3)) && (d == null))
        {
          i1 = f;
          if ((i1 == -1) || (i1 == 8))
          {
            i1 = e;
            bool2 = bool1;
            if (i1 == -1) {
              return bool2;
            }
            if (i1 == 8) {
              return bool1;
            }
          }
        }
      }
    }
    boolean bool2 = false;
    return bool2;
  }
  
  public static int j(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 9)
      {
        if ((paramInt != 4) && (paramInt != 5) && (paramInt != 6) && (paramInt != 7)) {
          return -1;
        }
        return 2;
      }
      return 6;
    }
    return 1;
  }
  
  public static int k(int paramInt)
  {
    if (paramInt != 1) {
      if (paramInt != 4)
      {
        if (paramInt != 13)
        {
          if (paramInt != 16)
          {
            if (paramInt != 18)
            {
              if ((paramInt != 6) && (paramInt != 7)) {
                return -1;
              }
            }
            else {
              return 7;
            }
          }
          else {
            return 6;
          }
        }
        else {
          return 2;
        }
      }
      else {
        return 10;
      }
    }
    return 3;
  }
  
  public static String l(int paramInt)
  {
    Object localObject;
    if (paramInt != -1)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramInt);
      ((StringBuilder)localObject).append("bit Luma");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "NA";
    }
    return (String)localObject;
  }
  
  public b a()
  {
    return new b(this, null);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (h.class == paramObject.getClass()))
    {
      paramObject = (h)paramObject;
      if ((a != a) || (b != b) || (c != c) || (!Arrays.equals(d, d)) || (e != e) || (f != f)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public boolean f()
  {
    boolean bool;
    if ((e != -1) && (f != -1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean g()
  {
    boolean bool;
    if ((a != -1) && (b != -1) && (c != -1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    if (g == 0) {
      g = ((((((527 + a) * 31 + b) * 31 + c) * 31 + Arrays.hashCode(d)) * 31 + e) * 31 + f);
    }
    return g;
  }
  
  public boolean i()
  {
    boolean bool;
    if ((!f()) && (!g())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public String m()
  {
    String str;
    if (g()) {
      str = M.G("%s/%s/%s", new Object[] { d(a), c(b), e(c) });
    } else {
      str = "NA/NA/NA";
    }
    Object localObject;
    if (f())
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(e);
      ((StringBuilder)localObject).append("/");
      ((StringBuilder)localObject).append(f);
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "NA/NA";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str);
    localStringBuilder.append("/");
    localStringBuilder.append((String)localObject);
    return localStringBuilder.toString();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ColorInfo(");
    localStringBuilder.append(d(a));
    localStringBuilder.append(", ");
    localStringBuilder.append(c(b));
    localStringBuilder.append(", ");
    localStringBuilder.append(e(c));
    localStringBuilder.append(", ");
    boolean bool;
    if (d != null) {
      bool = true;
    } else {
      bool = false;
    }
    localStringBuilder.append(bool);
    localStringBuilder.append(", ");
    localStringBuilder.append(l(e));
    localStringBuilder.append(", ");
    localStringBuilder.append(b(f));
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class b
  {
    public int a;
    public int b;
    public int c;
    public byte[] d;
    public int e;
    public int f;
    
    public b()
    {
      a = -1;
      b = -1;
      c = -1;
      e = -1;
      f = -1;
    }
    
    public b(h paramh)
    {
      a = a;
      b = b;
      c = c;
      d = d;
      e = e;
      f = f;
    }
    
    public h a()
    {
      return new h(a, b, c, d, e, f, null);
    }
    
    public b b(int paramInt)
    {
      f = paramInt;
      return this;
    }
    
    public b c(int paramInt)
    {
      b = paramInt;
      return this;
    }
    
    public b d(int paramInt)
    {
      a = paramInt;
      return this;
    }
    
    public b e(int paramInt)
    {
      c = paramInt;
      return this;
    }
    
    public b f(byte[] paramArrayOfByte)
    {
      d = paramArrayOfByte;
      return this;
    }
    
    public b g(int paramInt)
    {
      e = paramInt;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     d0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */