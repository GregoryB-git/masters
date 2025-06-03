package e2;

public final class c
  extends a
{
  public final Integer a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final String f;
  public final String g;
  public final String h;
  public final String i;
  public final String j;
  public final String k;
  public final String l;
  
  public c(Integer paramInteger, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11)
  {
    a = paramInteger;
    b = paramString1;
    c = paramString2;
    d = paramString3;
    e = paramString4;
    f = paramString5;
    g = paramString6;
    h = paramString7;
    i = paramString8;
    j = paramString9;
    k = paramString10;
    l = paramString11;
  }
  
  public String b()
  {
    return l;
  }
  
  public String c()
  {
    return j;
  }
  
  public String d()
  {
    return d;
  }
  
  public String e()
  {
    return h;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      Object localObject = a;
      if (localObject == null ? ((a)paramObject).m() == null : ((Integer)localObject).equals(((a)paramObject).m()))
      {
        localObject = b;
        if (localObject == null ? ((a)paramObject).j() == null : ((String)localObject).equals(((a)paramObject).j()))
        {
          localObject = c;
          if (localObject == null ? ((a)paramObject).f() == null : ((String)localObject).equals(((a)paramObject).f()))
          {
            localObject = d;
            if (localObject == null ? ((a)paramObject).d() == null : ((String)localObject).equals(((a)paramObject).d()))
            {
              localObject = e;
              if (localObject == null ? ((a)paramObject).l() == null : ((String)localObject).equals(((a)paramObject).l()))
              {
                localObject = f;
                if (localObject == null ? ((a)paramObject).k() == null : ((String)localObject).equals(((a)paramObject).k()))
                {
                  localObject = g;
                  if (localObject == null ? ((a)paramObject).h() == null : ((String)localObject).equals(((a)paramObject).h()))
                  {
                    localObject = h;
                    if (localObject == null ? ((a)paramObject).e() == null : ((String)localObject).equals(((a)paramObject).e()))
                    {
                      localObject = i;
                      if (localObject == null ? ((a)paramObject).g() == null : ((String)localObject).equals(((a)paramObject).g()))
                      {
                        localObject = j;
                        if (localObject == null ? ((a)paramObject).c() == null : ((String)localObject).equals(((a)paramObject).c()))
                        {
                          localObject = k;
                          if (localObject == null ? ((a)paramObject).i() == null : ((String)localObject).equals(((a)paramObject).i()))
                          {
                            localObject = l;
                            paramObject = ((a)paramObject).b();
                            if (localObject == null ? paramObject == null : ((String)localObject).equals(paramObject)) {
                              break label385;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      bool = false;
      label385:
      return bool;
    }
    return false;
  }
  
  public String f()
  {
    return c;
  }
  
  public String g()
  {
    return i;
  }
  
  public String h()
  {
    return g;
  }
  
  public int hashCode()
  {
    Object localObject = a;
    int m = 0;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = ((Integer)localObject).hashCode();
    }
    localObject = b;
    int i1;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = ((String)localObject).hashCode();
    }
    localObject = c;
    int i2;
    if (localObject == null) {
      i2 = 0;
    } else {
      i2 = ((String)localObject).hashCode();
    }
    localObject = d;
    int i3;
    if (localObject == null) {
      i3 = 0;
    } else {
      i3 = ((String)localObject).hashCode();
    }
    localObject = e;
    int i4;
    if (localObject == null) {
      i4 = 0;
    } else {
      i4 = ((String)localObject).hashCode();
    }
    localObject = f;
    int i5;
    if (localObject == null) {
      i5 = 0;
    } else {
      i5 = ((String)localObject).hashCode();
    }
    localObject = g;
    int i6;
    if (localObject == null) {
      i6 = 0;
    } else {
      i6 = ((String)localObject).hashCode();
    }
    localObject = h;
    int i7;
    if (localObject == null) {
      i7 = 0;
    } else {
      i7 = ((String)localObject).hashCode();
    }
    localObject = i;
    int i8;
    if (localObject == null) {
      i8 = 0;
    } else {
      i8 = ((String)localObject).hashCode();
    }
    localObject = j;
    int i9;
    if (localObject == null) {
      i9 = 0;
    } else {
      i9 = ((String)localObject).hashCode();
    }
    localObject = k;
    int i10;
    if (localObject == null) {
      i10 = 0;
    } else {
      i10 = ((String)localObject).hashCode();
    }
    localObject = l;
    if (localObject != null) {
      m = ((String)localObject).hashCode();
    }
    return (((((((((((n ^ 0xF4243) * 1000003 ^ i1) * 1000003 ^ i2) * 1000003 ^ i3) * 1000003 ^ i4) * 1000003 ^ i5) * 1000003 ^ i6) * 1000003 ^ i7) * 1000003 ^ i8) * 1000003 ^ i9) * 1000003 ^ i10) * 1000003 ^ m;
  }
  
  public String i()
  {
    return k;
  }
  
  public String j()
  {
    return b;
  }
  
  public String k()
  {
    return f;
  }
  
  public String l()
  {
    return e;
  }
  
  public Integer m()
  {
    return a;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AndroidClientInfo{sdkVersion=");
    localStringBuilder.append(a);
    localStringBuilder.append(", model=");
    localStringBuilder.append(b);
    localStringBuilder.append(", hardware=");
    localStringBuilder.append(c);
    localStringBuilder.append(", device=");
    localStringBuilder.append(d);
    localStringBuilder.append(", product=");
    localStringBuilder.append(e);
    localStringBuilder.append(", osBuild=");
    localStringBuilder.append(f);
    localStringBuilder.append(", manufacturer=");
    localStringBuilder.append(g);
    localStringBuilder.append(", fingerprint=");
    localStringBuilder.append(h);
    localStringBuilder.append(", locale=");
    localStringBuilder.append(i);
    localStringBuilder.append(", country=");
    localStringBuilder.append(j);
    localStringBuilder.append(", mccMnc=");
    localStringBuilder.append(k);
    localStringBuilder.append(", applicationBuild=");
    localStringBuilder.append(l);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends a.a
  {
    public Integer a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    
    public a a()
    {
      return new c(a, b, c, d, e, f, g, h, i, j, k, l, null);
    }
    
    public a.a b(String paramString)
    {
      l = paramString;
      return this;
    }
    
    public a.a c(String paramString)
    {
      j = paramString;
      return this;
    }
    
    public a.a d(String paramString)
    {
      d = paramString;
      return this;
    }
    
    public a.a e(String paramString)
    {
      h = paramString;
      return this;
    }
    
    public a.a f(String paramString)
    {
      c = paramString;
      return this;
    }
    
    public a.a g(String paramString)
    {
      i = paramString;
      return this;
    }
    
    public a.a h(String paramString)
    {
      g = paramString;
      return this;
    }
    
    public a.a i(String paramString)
    {
      k = paramString;
      return this;
    }
    
    public a.a j(String paramString)
    {
      b = paramString;
      return this;
    }
    
    public a.a k(String paramString)
    {
      f = paramString;
      return this;
    }
    
    public a.a l(String paramString)
    {
      e = paramString;
      return this;
    }
    
    public a.a m(Integer paramInteger)
    {
      a = paramInteger;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     e2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */