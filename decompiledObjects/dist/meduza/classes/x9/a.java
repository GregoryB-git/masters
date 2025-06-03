package x9;

import q0.g;

public final class a
  extends d
{
  public final String a;
  public final String b;
  public final String c;
  public final f d;
  public final int e;
  
  public a(String paramString1, String paramString2, String paramString3, f paramf, int paramInt)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramf;
    e = paramInt;
  }
  
  public final f a()
  {
    return d;
  }
  
  public final String b()
  {
    return b;
  }
  
  public final String c()
  {
    return c;
  }
  
  public final int d()
  {
    return e;
  }
  
  public final String e()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof d))
    {
      paramObject = (d)paramObject;
      Object localObject = a;
      if (localObject == null ? ((d)paramObject).e() == null : ((String)localObject).equals(((d)paramObject).e()))
      {
        localObject = b;
        if (localObject == null ? ((d)paramObject).b() == null : ((String)localObject).equals(((d)paramObject).b()))
        {
          localObject = c;
          if (localObject == null ? ((d)paramObject).c() == null : ((String)localObject).equals(((d)paramObject).c()))
          {
            localObject = d;
            if (localObject == null ? ((d)paramObject).a() == null : localObject.equals(((d)paramObject).a()))
            {
              int i = e;
              int j = ((d)paramObject).d();
              if (i == 0 ? j == 0 : g.b(i, j)) {
                break label181;
              }
            }
          }
        }
      }
      bool = false;
      label181:
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = ((String)localObject).hashCode();
    }
    localObject = b;
    int k;
    if (localObject == null) {
      k = 0;
    } else {
      k = ((String)localObject).hashCode();
    }
    localObject = c;
    int m;
    if (localObject == null) {
      m = 0;
    } else {
      m = ((String)localObject).hashCode();
    }
    localObject = d;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = localObject.hashCode();
    }
    int i1 = e;
    if (i1 != 0) {
      i = g.c(i1);
    }
    return ((((j ^ 0xF4243) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n) * 1000003 ^ i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("InstallationResponse{uri=");
    localStringBuilder.append(a);
    localStringBuilder.append(", fid=");
    localStringBuilder.append(b);
    localStringBuilder.append(", refreshToken=");
    localStringBuilder.append(c);
    localStringBuilder.append(", authToken=");
    localStringBuilder.append(d);
    localStringBuilder.append(", responseCode=");
    localStringBuilder.append(f.v(e));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     x9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */