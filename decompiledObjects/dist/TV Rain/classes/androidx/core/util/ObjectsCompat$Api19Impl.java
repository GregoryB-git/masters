package androidx.core.util;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Objects;

@RequiresApi(19)
class ObjectsCompat$Api19Impl
{
  @DoNotInline
  public static boolean equals(Object paramObject1, Object paramObject2)
  {
    return Objects.equals(paramObject1, paramObject2);
  }
  
  @DoNotInline
  public static int hash(Object... paramVarArgs)
  {
    return Objects.hash(paramVarArgs);
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.ObjectsCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */