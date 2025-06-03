package V5;

import kotlin.jvm.internal.Intrinsics;

public final class f
  implements Comparable
{
  public static final a s = new a(null);
  public static final f t = g.a();
  public final int o;
  public final int p;
  public final int q;
  public final int r;
  
  public f(int paramInt1, int paramInt2, int paramInt3)
  {
    o = paramInt1;
    p = paramInt2;
    q = paramInt3;
    r = e(paramInt1, paramInt2, paramInt3);
  }
  
  public int c(f paramf)
  {
    Intrinsics.checkNotNullParameter(paramf, "other");
    return r - r;
  }
  
  public final int e(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt1 < 256) && (paramInt2 >= 0) && (paramInt2 < 256) && (paramInt3 >= 0) && (paramInt3 < 256)) {
      return (paramInt1 << 16) + (paramInt2 << 8) + paramInt3;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Version components are out of range: ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append('.');
    localStringBuilder.append(paramInt2);
    localStringBuilder.append('.');
    localStringBuilder.append(paramInt3);
    throw new IllegalArgumentException(localStringBuilder.toString().toString());
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof f)) {
      paramObject = (f)paramObject;
    } else {
      paramObject = null;
    }
    if (paramObject == null) {
      return false;
    }
    if (r != r) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return r;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(o);
    localStringBuilder.append('.');
    localStringBuilder.append(p);
    localStringBuilder.append('.');
    localStringBuilder.append(q);
    return localStringBuilder.toString();
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     V5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */