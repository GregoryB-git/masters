package R2;

import A2.n;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class r2
{
  public final String a;
  public final String b;
  public boolean c;
  public String d;
  
  public r2(l2 paraml2, String paramString1, String paramString2)
  {
    n.e(paramString1);
    a = paramString1;
    b = null;
  }
  
  public final String a()
  {
    if (!c)
    {
      c = true;
      d = e.F().getString(a, null);
    }
    return d;
  }
  
  public final void b(String paramString)
  {
    SharedPreferences.Editor localEditor = e.F().edit();
    localEditor.putString(a, paramString);
    localEditor.apply();
    d = paramString;
  }
}

/* Location:
 * Qualified Name:     R2.r2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */