package S4;

import kotlin.jvm.internal.Intrinsics;
import y6.a;

public final class a$a
{
  public final a a;
  public b b;
  
  public a$a(a parama, b paramb)
  {
    a = parama;
    b = paramb;
  }
  
  public final a a()
  {
    return a;
  }
  
  public final b b()
  {
    return b;
  }
  
  public final void c(b paramb)
  {
    b = paramb;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    if (!Intrinsics.a(a, a)) {
      return false;
    }
    return Intrinsics.a(b, b);
  }
  
  public int hashCode()
  {
    int i = a.hashCode();
    b localb = b;
    int j;
    if (localb == null) {
      j = 0;
    } else {
      j = localb.hashCode();
    }
    return i * 31 + j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Dependency(mutex=");
    localStringBuilder.append(a);
    localStringBuilder.append(", subscriber=");
    localStringBuilder.append(b);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     S4.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */