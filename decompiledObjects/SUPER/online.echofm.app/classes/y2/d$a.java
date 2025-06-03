package y2;

import android.accounts.Account;
import android.os.Looper;
import z2.a;
import z2.l;

public class d$a
{
  public static final a c = new a().a();
  public final l a;
  public final Looper b;
  
  public d$a(l paraml, Account paramAccount, Looper paramLooper)
  {
    a = paraml;
    b = paramLooper;
  }
  
  public static class a
  {
    public l a;
    public Looper b;
    
    public d.a a()
    {
      if (a == null) {
        a = new a();
      }
      if (b == null) {
        b = Looper.getMainLooper();
      }
      return new d.a(a, null, b, null);
    }
  }
}

/* Location:
 * Qualified Name:     y2.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */