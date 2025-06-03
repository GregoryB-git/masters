package d4;

import Y3.m;

public class b
  implements Comparable
{
  public static final b p = new b("[MIN_NAME]");
  public static final b q = new b("[MAX_KEY]");
  public static final b r = new b(".priority");
  public static final b s = new b(".info");
  public final String o;
  
  public b(String paramString)
  {
    o = paramString;
  }
  
  public static b j(String paramString)
  {
    Integer localInteger = m.k(paramString);
    if (localInteger != null) {
      return new b(paramString, localInteger.intValue());
    }
    if (paramString.equals(".priority")) {
      return r;
    }
    m.f(paramString.contains("/") ^ true);
    return new b(paramString);
  }
  
  public static b l()
  {
    return s;
  }
  
  public static b m()
  {
    return q;
  }
  
  public static b n()
  {
    return p;
  }
  
  public static b o()
  {
    return r;
  }
  
  public String e()
  {
    return o;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    paramObject = (b)paramObject;
    return o.equals(o);
  }
  
  public int h(b paramb)
  {
    if (this == paramb) {
      return 0;
    }
    if ((!o.equals("[MIN_NAME]")) && (!o.equals("[MAX_KEY]")))
    {
      if ((!o.equals("[MIN_NAME]")) && (!o.equals("[MAX_KEY]")))
      {
        if (r())
        {
          if (paramb.r())
          {
            int i = m.a(p(), paramb.p());
            int j = i;
            if (i == 0) {
              j = m.a(o.length(), o.length());
            }
            return j;
          }
          return -1;
        }
        if (paramb.r()) {
          return 1;
        }
        return o.compareTo(o);
      }
      return 1;
    }
    return -1;
  }
  
  public int hashCode()
  {
    return o.hashCode();
  }
  
  public int p()
  {
    return 0;
  }
  
  public boolean r()
  {
    return false;
  }
  
  public boolean s()
  {
    return equals(r);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ChildKey(\"");
    localStringBuilder.append(o);
    localStringBuilder.append("\")");
    return localStringBuilder.toString();
  }
  
  public static class b
    extends b
  {
    public final int t;
    
    public b(String paramString, int paramInt)
    {
      super(null);
      t = paramInt;
    }
    
    public int p()
    {
      return t;
    }
    
    public boolean r()
    {
      return true;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("IntegerChildName(\"");
      localStringBuilder.append(b.c(this));
      localStringBuilder.append("\")");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     d4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */