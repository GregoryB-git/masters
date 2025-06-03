package e7;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import m6.j;

public final class r1
{
  public final String a;
  public boolean b;
  public String c;
  
  public r1(l1 paraml1, String paramString)
  {
    j.e(paramString);
    a = paramString;
  }
  
  public final String a()
  {
    if (!b)
    {
      b = true;
      c = d.v().getString(a, null);
    }
    return c;
  }
  
  public final void b(String paramString)
  {
    SharedPreferences.Editor localEditor = d.v().edit();
    localEditor.putString(a, paramString);
    localEditor.apply();
    c = paramString;
  }
}

/* Location:
 * Qualified Name:     e7.r1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */