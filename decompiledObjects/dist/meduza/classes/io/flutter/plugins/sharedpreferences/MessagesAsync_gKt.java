package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import f;
import java.util.List;
import va.a;

public final class MessagesAsync_gKt
{
  private static final List<Object> wrapError(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof SharedPreferencesError))
    {
      paramThrowable = (SharedPreferencesError)paramThrowable;
      return a.g(new Object[] { paramThrowable.getCode(), paramThrowable.getMessage(), paramThrowable.getDetails() });
    }
    String str1 = paramThrowable.getClass().getSimpleName();
    String str2 = paramThrowable.toString();
    StringBuilder localStringBuilder = f.l("Cause: ");
    localStringBuilder.append(paramThrowable.getCause());
    localStringBuilder.append(", Stacktrace: ");
    localStringBuilder.append(Log.getStackTraceString(paramThrowable));
    return a.g(new String[] { str1, str2, localStringBuilder.toString() });
  }
  
  private static final List<Object> wrapResult(Object paramObject)
  {
    return a.f(paramObject);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.MessagesAsync_gKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */