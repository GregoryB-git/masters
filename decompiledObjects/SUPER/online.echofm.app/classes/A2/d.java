package A2;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import t.b;

public final class d
{
  public final Account a;
  public final Set b;
  public final Set c;
  public final Map d;
  public final int e;
  public final View f;
  public final String g;
  public final String h;
  public final S2.a i;
  public Integer j;
  
  public d(Account paramAccount, Set paramSet, Map paramMap, int paramInt, View paramView, String paramString1, String paramString2, S2.a parama, boolean paramBoolean)
  {
    a = paramAccount;
    if (paramSet == null) {
      paramAccount = Collections.emptySet();
    } else {
      paramAccount = Collections.unmodifiableSet(paramSet);
    }
    b = paramAccount;
    paramSet = paramMap;
    if (paramMap == null) {
      paramSet = Collections.emptyMap();
    }
    d = paramSet;
    f = paramView;
    e = paramInt;
    g = paramString1;
    h = paramString2;
    paramMap = parama;
    if (parama == null) {
      paramMap = S2.a.j;
    }
    i = paramMap;
    paramAccount = new HashSet(paramAccount);
    paramSet = paramSet.values().iterator();
    if (!paramSet.hasNext())
    {
      c = Collections.unmodifiableSet(paramAccount);
      return;
    }
    android.support.v4.media.a.a(paramSet.next());
    throw null;
  }
  
  public Account a()
  {
    return a;
  }
  
  public Account b()
  {
    Account localAccount = a;
    if (localAccount != null) {
      return localAccount;
    }
    return new Account("<<default account>>", "com.google");
  }
  
  public Set c()
  {
    return c;
  }
  
  public String d()
  {
    return g;
  }
  
  public Set e()
  {
    return b;
  }
  
  public final S2.a f()
  {
    return i;
  }
  
  public final Integer g()
  {
    return j;
  }
  
  public final String h()
  {
    return h;
  }
  
  public final void i(Integer paramInteger)
  {
    j = paramInteger;
  }
  
  public static final class a
  {
    public Account a;
    public b b;
    public String c;
    public String d;
    public S2.a e = S2.a.j;
    
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
}

/* Location:
 * Qualified Name:     A2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */