package e7;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import m6.j;

public final class q1
{
  public final String a;
  public final long b;
  public boolean c;
  public long d;
  
  public q1(l1 paraml1, String paramString, long paramLong)
  {
    j.e(paramString);
    a = paramString;
    b = paramLong;
  }
  
  public final long a()
  {
    if (!c)
    {
      c = true;
      d = e.v().getLong(a, b);
    }
    return d;
  }
  
  public final void b(long paramLong)
  {
    SharedPreferences.Editor localEditor = e.v().edit();
    localEditor.putLong(a, paramLong);
    localEditor.apply();
    d = paramLong;
  }
}

/* Location:
 * Qualified Name:     e7.q1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */