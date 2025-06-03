package f0;

import android.os.BaseBundle;
import android.os.Bundle;
import g0.M;

public final class g
{
  public static final String d = M.w0(0);
  public static final String e = M.w0(1);
  public static final String f = M.w0(2);
  public int a;
  public int b;
  public final int c;
  
  public g(int paramInt1, int paramInt2, int paramInt3)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
  }
  
  public static g a(Bundle paramBundle)
  {
    return new g(paramBundle.getInt(d), paramBundle.getInt(e), paramBundle.getInt(f));
  }
  
  public Bundle b()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt(d, a);
    localBundle.putInt(e, b);
    localBundle.putInt(f, c);
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     f0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */