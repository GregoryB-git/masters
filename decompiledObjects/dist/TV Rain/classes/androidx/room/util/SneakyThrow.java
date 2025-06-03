package androidx.room.util;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class SneakyThrow
{
  public static void reThrow(@NonNull Exception paramException)
  {
    sneakyThrow(paramException);
  }
  
  private static <E extends Throwable> void sneakyThrow(@NonNull Throwable paramThrowable)
    throws Throwable
  {
    throw paramThrowable;
  }
}

/* Location:
 * Qualified Name:     androidx.room.util.SneakyThrow
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */