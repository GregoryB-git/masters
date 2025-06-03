package W5;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class c$a
{
  public final void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("index: ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", size: ");
    localStringBuilder.append(paramInt2);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2)) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("index: ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", size: ");
    localStringBuilder.append(paramInt2);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final void c(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 <= paramInt3))
    {
      if (paramInt1 <= paramInt2) {
        return;
      }
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("fromIndex: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" > toIndex: ");
      localStringBuilder.append(paramInt2);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("fromIndex: ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", toIndex: ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(", size: ");
    localStringBuilder.append(paramInt3);
    throw new IndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public final int d(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + (paramInt1 >> 1);
    paramInt1 = i;
    if (i - paramInt2 < 0) {
      paramInt1 = paramInt2;
    }
    i = paramInt1;
    if (paramInt1 - 2147483639 > 0) {
      if (paramInt2 > 2147483639) {
        i = Integer.MAX_VALUE;
      } else {
        i = 2147483639;
      }
    }
    return i;
  }
  
  public final boolean e(Collection paramCollection1, Collection paramCollection2)
  {
    Intrinsics.checkNotNullParameter(paramCollection1, "c");
    Intrinsics.checkNotNullParameter(paramCollection2, "other");
    if (paramCollection1.size() != paramCollection2.size()) {
      return false;
    }
    paramCollection2 = paramCollection2.iterator();
    paramCollection1 = paramCollection1.iterator();
    while (paramCollection1.hasNext()) {
      if (!Intrinsics.a(paramCollection1.next(), paramCollection2.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final int f(Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "c");
    paramCollection = paramCollection.iterator();
    int j;
    for (int i = 1; paramCollection.hasNext(); i = i * 31 + j)
    {
      Object localObject = paramCollection.next();
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     W5.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */