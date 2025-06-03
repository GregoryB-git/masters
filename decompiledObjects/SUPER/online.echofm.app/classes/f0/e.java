package f0;

import android.os.BaseBundle;
import android.os.Bundle;
import g0.M;
import g0.a;

public final class e
{
  public static final String c = M.w0(0);
  public static final String d = M.w0(1);
  public final String a;
  public final int b;
  
  public e(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public static e a(Bundle paramBundle)
  {
    return new e((String)a.e(paramBundle.getString(c)), paramBundle.getInt(d));
  }
  
  public Bundle b()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString(c, a);
    localBundle.putInt(d, b);
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     f0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */