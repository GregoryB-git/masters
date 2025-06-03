package W2;

public abstract class d
  implements n
{
  public static d d(char paramChar)
  {
    return new b(paramChar);
  }
  
  public static d f()
  {
    return d.p;
  }
  
  public static String g(char paramChar)
  {
    char c = '\000';
    char[] arrayOfChar = new char[6];
    char[] tmp8_7 = arrayOfChar;
    tmp8_7[0] = 92;
    char[] tmp13_8 = tmp8_7;
    tmp13_8[1] = 117;
    char[] tmp18_13 = tmp13_8;
    tmp18_13[2] = 0;
    char[] tmp23_18 = tmp18_13;
    tmp23_18[3] = 0;
    char[] tmp28_23 = tmp23_18;
    tmp28_23[4] = 0;
    char[] tmp33_28 = tmp28_23;
    tmp33_28[5] = 0;
    tmp33_28;
    int i = paramChar;
    for (paramChar = c; paramChar < '\004'; paramChar++)
    {
      arrayOfChar[('\005' - paramChar)] = "0123456789ABCDEF".charAt(i & 0xF);
      i = (char)(i >> 4);
    }
    return String.copyValueOf(arrayOfChar);
  }
  
  public boolean b(Character paramCharacter)
  {
    return e(paramCharacter.charValue());
  }
  
  public int c(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    m.l(paramInt, i);
    while (paramInt < i)
    {
      if (e(paramCharSequence.charAt(paramInt))) {
        return paramInt;
      }
      paramInt++;
    }
    return -1;
  }
  
  public abstract boolean e(char paramChar);
  
  public static abstract class a
    extends d
  {}
  
  public static final class b
    extends d.a
  {
    public final char o;
    
    public b(char paramChar)
    {
      o = ((char)paramChar);
    }
    
    public boolean e(char paramChar)
    {
      boolean bool;
      if (paramChar == o) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("CharMatcher.is('");
      localStringBuilder.append(d.a(o));
      localStringBuilder.append("')");
      return localStringBuilder.toString();
    }
  }
  
  public static abstract class c
    extends d.a
  {
    public final String o;
    
    public c(String paramString)
    {
      o = ((String)m.j(paramString));
    }
    
    public final String toString()
    {
      return o;
    }
  }
  
  public static final class d
    extends d.c
  {
    public static final d p = new d();
    
    public d()
    {
      super();
    }
    
    public int c(CharSequence paramCharSequence, int paramInt)
    {
      m.l(paramInt, paramCharSequence.length());
      return -1;
    }
    
    public boolean e(char paramChar)
    {
      return false;
    }
  }
}

/* Location:
 * Qualified Name:     W2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */