package k7;

import a0.j;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import g;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class d
{
  public final String a;
  
  public d(String paramString)
  {
    int i = Process.myUid();
    int j = Process.myPid();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("UID: [");
    localStringBuilder.append(i);
    localStringBuilder.append("]  PID: [");
    localStringBuilder.append(j);
    localStringBuilder.append("] ");
    a = localStringBuilder.toString().concat(paramString);
  }
  
  public static String c(String paramString1, String paramString2, Object... paramVarArgs)
  {
    String str1 = paramString2;
    String str2;
    if (paramVarArgs.length > 0) {
      try
      {
        str1 = String.format(Locale.US, paramString2, paramVarArgs);
      }
      catch (IllegalFormatException localIllegalFormatException)
      {
        Log.e("PlayCore", "Unable to format ".concat(String.valueOf(paramString2)), localIllegalFormatException);
        str2 = j.k(paramString2, " [", TextUtils.join(", ", paramVarArgs), "]");
      }
    }
    return g.e(paramString1, " : ", str2);
  }
  
  public final void a(String paramString, Object... paramVarArgs)
  {
    if (Log.isLoggable("PlayCore", 4)) {
      Log.i("PlayCore", c(a, paramString, paramVarArgs));
    }
  }
  
  public final void b(String paramString, Object... paramVarArgs)
  {
    if (Log.isLoggable("PlayCore", 5)) {
      Log.w("PlayCore", c(a, paramString, paramVarArgs));
    }
  }
}

/* Location:
 * Qualified Name:     k7.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */