package androidx.core.util;

import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

public class ObjectsCompat
{
  public static boolean equals(@Nullable Object paramObject1, @Nullable Object paramObject2)
  {
    return Api19Impl.equals(paramObject1, paramObject2);
  }
  
  public static int hash(@Nullable Object... paramVarArgs)
  {
    return Api19Impl.hash(paramVarArgs);
  }
  
  public static int hashCode(@Nullable Object paramObject)
  {
    int i;
    if (paramObject != null) {
      i = paramObject.hashCode();
    } else {
      i = 0;
    }
    return i;
  }
  
  @NonNull
  public static <T> T requireNonNull(@Nullable T paramT)
  {
    paramT.getClass();
    return paramT;
  }
  
  @NonNull
  public static <T> T requireNonNull(@Nullable T paramT, @NonNull String paramString)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(paramString);
  }
  
  @Nullable
  public static String toString(@Nullable Object paramObject, @Nullable String paramString)
  {
    if (paramObject != null) {
      paramString = paramObject.toString();
    }
    return paramString;
  }
  
  @RequiresApi(19)
  public static class Api19Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.util.ObjectsCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */