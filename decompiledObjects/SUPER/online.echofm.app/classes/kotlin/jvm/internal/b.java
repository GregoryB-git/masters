package kotlin.jvm.internal;

import java.util.Iterator;

public abstract class b
{
  public static final Iterator a(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    return new a(paramArrayOfObject);
  }
}

/* Location:
 * Qualified Name:     kotlin.jvm.internal.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */