package R2;

import A2.n;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class o2
{
  public final String a;
  public final boolean b;
  public boolean c;
  public boolean d;
  
  public o2(l2 paraml2, String paramString, boolean paramBoolean)
  {
    n.e(paramString);
    a = paramString;
    b = paramBoolean;
  }
  
  public final void a(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = e.F().edit();
    localEditor.putBoolean(a, paramBoolean);
    localEditor.apply();
    d = paramBoolean;
  }
  
  public final boolean b()
  {
    if (!c)
    {
      c = true;
      d = e.F().getBoolean(a, b);
    }
    return d;
  }
}

/* Location:
 * Qualified Name:     R2.o2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */