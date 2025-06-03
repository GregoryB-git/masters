package a6;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class d
  implements Serializable
{
  public static final a p = new a(null);
  private static final long serialVersionUID = 0L;
  public final Class o;
  
  public d(Enum[] paramArrayOfEnum)
  {
    paramArrayOfEnum = paramArrayOfEnum.getClass().getComponentType();
    Intrinsics.b(paramArrayOfEnum);
    o = paramArrayOfEnum;
  }
  
  private final Object readResolve()
  {
    Object[] arrayOfObject = o.getEnumConstants();
    Intrinsics.checkNotNullExpressionValue(arrayOfObject, "getEnumConstants(...)");
    return b.a((Enum[])arrayOfObject);
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     a6.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */