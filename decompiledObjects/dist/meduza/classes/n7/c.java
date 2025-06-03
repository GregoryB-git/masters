package n7;

import f;
import x6.b;

public abstract class c
  implements j<Character>
{
  public int a(int paramInt, CharSequence paramCharSequence)
  {
    int i = paramCharSequence.length();
    b.D(paramInt, i);
    while (paramInt < i)
    {
      if (b(paramCharSequence.charAt(paramInt))) {
        return paramInt;
      }
      paramInt++;
    }
    return -1;
  }
  
  public abstract boolean b(char paramChar);
  
  public static abstract class a
    extends c
  {
    @Deprecated
    public final boolean apply(Object paramObject)
    {
      return b(((Character)paramObject).charValue());
    }
  }
  
  public static final class b
    extends c.a
  {
    public final char a;
    
    public b(char paramChar)
    {
      a = ((char)paramChar);
    }
    
    public final boolean b(char paramChar)
    {
      boolean bool;
      if (paramChar == a) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("CharMatcher.is('");
      int i = a;
      char[] arrayOfChar = new char[6];
      char[] tmp17_16 = arrayOfChar;
      tmp17_16[0] = 92;
      char[] tmp22_17 = tmp17_16;
      tmp22_17[1] = 117;
      char[] tmp27_22 = tmp22_17;
      tmp27_22[2] = 0;
      char[] tmp32_27 = tmp27_22;
      tmp32_27[3] = 0;
      char[] tmp37_32 = tmp32_27;
      tmp37_32[4] = 0;
      char[] tmp42_37 = tmp37_32;
      tmp42_37[5] = 0;
      tmp42_37;
      for (int j = 0; j < 4; j++)
      {
        arrayOfChar[(5 - j)] = "0123456789ABCDEF".charAt(i & 0xF);
        i = (char)(i >> 4);
      }
      localStringBuilder.append(String.copyValueOf(arrayOfChar));
      localStringBuilder.append("')");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class c
    extends c.a
  {
    public final String a;
    
    public c(String paramString)
    {
      a = paramString;
    }
    
    public final String toString()
    {
      return a;
    }
  }
  
  public static final class d
    extends c.c
  {
    public static final d b = new d();
    
    public d()
    {
      super();
    }
    
    public final int a(int paramInt, CharSequence paramCharSequence)
    {
      b.D(paramInt, paramCharSequence.length());
      return -1;
    }
    
    public final boolean b(char paramChar)
    {
      return false;
    }
  }
  
  public static final class e
    extends c.c
  {
    public static final int b = Integer.numberOfLeadingZeros(31);
    public static final e c = new e();
    
    public e()
    {
      super();
    }
    
    public final boolean b(char paramChar)
    {
      boolean bool;
      if (" 　\r   　 \013　   　 \t     \f 　 　　 \n 　".charAt(1682554634 * paramChar >>> b) == paramChar) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     n7.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */