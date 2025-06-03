package A2;

import S2.a;
import android.accounts.Account;
import java.util.Collection;
import t.b;

public final class d$a
{
  public Account a;
  public b b;
  public String c;
  public String d;
  public a e = a.j;
  
  public d a()
  {
    return new d(a, b, null, 0, null, c, d, e, false);
  }
  
  public a b(String paramString)
  {
    c = paramString;
    return this;
  }
  
  public final a c(Collection paramCollection)
  {
    if (b == null) {
      b = new b();
    }
    b.addAll(paramCollection);
    return this;
  }
  
  public final a d(Account paramAccount)
  {
    a = paramAccount;
    return this;
  }
  
  public final a e(String paramString)
  {
    d = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     A2.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */