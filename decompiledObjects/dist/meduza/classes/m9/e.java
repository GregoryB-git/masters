package m9;

import a0.j;
import f;

public final class e
  extends m0.a
{
  public final g a;
  public final boolean b;
  public final int c;
  public final int d;
  public final int e;
  
  public e(g paramg, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    a = paramg;
    b = paramBoolean;
    c = paramInt1;
    d = paramInt2;
    e = paramInt3;
  }
  
  public final boolean a()
  {
    return b;
  }
  
  public final int b()
  {
    return d;
  }
  
  public final g c()
  {
    return a;
  }
  
  public final int d()
  {
    return c;
  }
  
  public final int e()
  {
    return e;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof m0.a))
    {
      m0.a locala = (m0.a)paramObject;
      paramObject = a;
      if ((paramObject == null ? locala.c() != null : !paramObject.equals(locala.c())) || (b != locala.a()) || (c != locala.d()) || (d != locala.b()) || (e != locala.e())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    g localg = a;
    int i;
    if (localg == null) {
      i = 0;
    } else {
      i = localg.hashCode();
    }
    int j;
    if (b) {
      j = 1231;
    } else {
      j = 1237;
    }
    return ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ c) * 1000003 ^ d) * 1000003 ^ e;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ExistenceFilterBloomFilterInfo{bloomFilter=");
    localStringBuilder.append(a);
    localStringBuilder.append(", applied=");
    localStringBuilder.append(b);
    localStringBuilder.append(", hashCount=");
    localStringBuilder.append(c);
    localStringBuilder.append(", bitmapLength=");
    localStringBuilder.append(d);
    localStringBuilder.append(", padding=");
    return j.m(localStringBuilder, e, "}");
  }
}

/* Location:
 * Qualified Name:     m9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */