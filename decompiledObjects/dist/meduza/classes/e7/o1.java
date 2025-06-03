package e7;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import m6.j;

public final class o1
{
  public final String a;
  public final boolean b;
  public boolean c;
  public boolean d;
  
  public o1(l1 paraml1, String paramString, boolean paramBoolean)
  {
    j.e(paramString);
    a = paramString;
    b = paramBoolean;
  }
  
  public final void a(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = e.v().edit();
    localEditor.putBoolean(a, paramBoolean);
    localEditor.apply();
    d = paramBoolean;
  }
  
  public final boolean b()
  {
    if (!c)
    {
      c = true;
      d = e.v().getBoolean(a, b);
    }
    return d;
  }
}

/* Location:
 * Qualified Name:     e7.o1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */