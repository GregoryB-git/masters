package e7;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import b.z;
import d2.q;
import m6.j;

public final class p1
{
  public final String a;
  public final String b;
  public final String c;
  public final long d;
  
  public p1(l1 paraml1, long paramLong)
  {
    j.e("health_monitor");
    boolean bool;
    if (paramLong > 0L) {
      bool = true;
    } else {
      bool = false;
    }
    j.b(bool);
    a = "health_monitor:start";
    b = "health_monitor:count";
    c = "health_monitor:value";
    d = paramLong;
  }
  
  public final void a()
  {
    e.l();
    ((z)e.zzb()).getClass();
    long l = System.currentTimeMillis();
    SharedPreferences.Editor localEditor = e.v().edit();
    localEditor.remove(b);
    localEditor.remove(c);
    localEditor.putLong(a, l);
    localEditor.apply();
  }
}

/* Location:
 * Qualified Name:     e7.p1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */