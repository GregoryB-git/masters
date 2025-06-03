package m9;

public final class f
  extends m0.b
{
  public final int a;
  public final int b;
  public final String c;
  public final String d;
  public final m0.a e;
  
  public f(int paramInt1, int paramInt2, String paramString1, String paramString2, e parame)
  {
    a = paramInt1;
    b = paramInt2;
    if (paramString1 != null)
    {
      c = paramString1;
      if (paramString2 != null)
      {
        d = paramString2;
        e = parame;
        return;
      }
      throw new NullPointerException("Null databaseId");
    }
    throw new NullPointerException("Null projectId");
  }
  
  public final m0.a a()
  {
    return e;
  }
  
  public final String b()
  {
    return d;
  }
  
  public final int c()
  {
    return b;
  }
  
  public final int d()
  {
    return a;
  }
  
  public final String e()
  {
    return c;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof m0.b))
    {
      Object localObject = (m0.b)paramObject;
      if ((a == ((m0.b)localObject).d()) && (b == ((m0.b)localObject).c()) && (c.equals(((m0.b)localObject).e())) && (d.equals(((m0.b)localObject).b())))
      {
        paramObject = e;
        localObject = ((m0.b)localObject).a();
        if (paramObject == null ? localObject == null : paramObject.equals(localObject)) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    int j = b;
    int k = c.hashCode();
    int m = d.hashCode();
    m0.a locala = e;
    int n;
    if (locala == null) {
      n = 0;
    } else {
      n = locala.hashCode();
    }
    return ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m) * 1000003 ^ n;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ExistenceFilterMismatchInfo{localCacheCount=");
    localStringBuilder.append(a);
    localStringBuilder.append(", existenceFilterCount=");
    localStringBuilder.append(b);
    localStringBuilder.append(", projectId=");
    localStringBuilder.append(c);
    localStringBuilder.append(", databaseId=");
    localStringBuilder.append(d);
    localStringBuilder.append(", bloomFilter=");
    localStringBuilder.append(e);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m9.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */