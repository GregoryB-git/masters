package m6;

import android.accounts.Account;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r.d;

public final class a
{
  public final Account a;
  public final Set b;
  public final Set c;
  public final Map d;
  public final String e;
  public final String f;
  public final g7.a g;
  public Integer h;
  
  public a(Account paramAccount, d paramd, String paramString1, String paramString2)
  {
    a = paramAccount;
    if (paramd == null) {
      paramAccount = Collections.emptySet();
    } else {
      paramAccount = Collections.unmodifiableSet(paramd);
    }
    b = paramAccount;
    paramd = Collections.emptyMap();
    d = paramd;
    e = paramString1;
    f = paramString2;
    g = locala;
    paramAccount = new HashSet(paramAccount);
    paramd = paramd.values().iterator();
    while (paramd.hasNext())
    {
      ((p)paramd.next()).getClass();
      paramAccount.addAll(null);
    }
    c = Collections.unmodifiableSet(paramAccount);
  }
  
  public static final class a
  {
    public Account a;
    public d b;
    public String c;
    public String d;
  }
}

/* Location:
 * Qualified Name:     m6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */