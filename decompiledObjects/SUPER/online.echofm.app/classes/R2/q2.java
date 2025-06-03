package R2;

import A2.n;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class q2
{
  public final String a;
  public final long b;
  public boolean c;
  public long d;
  
  public q2(l2 paraml2, String paramString, long paramLong)
  {
    n.e(paramString);
    a = paramString;
    b = paramLong;
  }
  
  public final long a()
  {
    if (!c)
    {
      c = true;
      d = e.F().getLong(a, b);
    }
    return d;
  }
  
  public final void b(long paramLong)
  {
    SharedPreferences.Editor localEditor = e.F().edit();
    localEditor.putLong(a, paramLong);
    localEditor.apply();
    d = paramLong;
  }
}

/* Location:
 * Qualified Name:     R2.q2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */