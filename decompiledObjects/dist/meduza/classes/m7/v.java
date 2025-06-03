package m7;

import a0.j;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import g;
import java.util.IllegalFormatException;
import java.util.Locale;

public final class v
{
  public final String a;
  
  public v(String paramString)
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
        Log.e("PlayCore", "Unable to format ".concat(paramString2), localIllegalFormatException);
        str2 = j.k(paramString2, " [", TextUtils.join(", ", paramVarArgs), "]");
      }
    }
    return g.e(paramString1, " : ", str2);
  }
  
  public final void a(String paramString, RemoteException paramRemoteException, Object... paramVarArgs)
  {
    if (Log.isLoggable("PlayCore", 6)) {
      Log.e("PlayCore", c(a, paramString, paramVarArgs), paramRemoteException);
    }
  }
  
  public final void b(String paramString, Object... paramVarArgs)
  {
    if (Log.isLoggable("PlayCore", 4)) {
      Log.i("PlayCore", c(a, paramString, paramVarArgs));
    }
  }
}

/* Location:
 * Qualified Name:     m7.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */