package R2;

import E2.e;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import x.a;

public final class C
  extends l3
{
  public long c;
  public String d;
  public AccountManager e;
  public Boolean f;
  public long g;
  
  public C(N2 paramN2)
  {
    super(paramN2);
  }
  
  public final boolean s()
  {
    Object localObject1 = Calendar.getInstance();
    c = TimeUnit.MINUTES.convert(((Calendar)localObject1).get(15) + ((Calendar)localObject1).get(16), TimeUnit.MILLISECONDS);
    Object localObject2 = Locale.getDefault();
    localObject1 = ((Locale)localObject2).getLanguage();
    Object localObject3 = Locale.ENGLISH;
    localObject1 = ((String)localObject1).toLowerCase((Locale)localObject3);
    localObject2 = ((Locale)localObject2).getCountry().toLowerCase((Locale)localObject3);
    localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append((String)localObject1);
    ((StringBuilder)localObject3).append("-");
    ((StringBuilder)localObject3).append((String)localObject2);
    d = ((StringBuilder)localObject3).toString();
    return false;
  }
  
  public final long u()
  {
    n();
    return g;
  }
  
  public final long v()
  {
    o();
    return c;
  }
  
  public final String w()
  {
    o();
    return d;
  }
  
  public final void x()
  {
    n();
    f = null;
    g = 0L;
  }
  
  public final boolean y()
  {
    n();
    long l = b().a();
    if (l - g > 86400000L) {
      f = null;
    }
    Object localObject = f;
    if (localObject != null) {
      return ((Boolean)localObject).booleanValue();
    }
    if (a.a(a(), "android.permission.GET_ACCOUNTS") != 0) {
      j().N().a("Permission error checking for dasher/unicorn accounts");
    }
    for (;;)
    {
      g = l;
      f = Boolean.FALSE;
      return false;
      if (e == null) {
        e = AccountManager.get(a());
      }
      try
      {
        localObject = (Account[])e.getAccountsByTypeAndFeatures("com.google", new String[] { "service_HOSTED" }, null, null).getResult();
        if ((localObject != null) && (localObject.length > 0))
        {
          f = Boolean.TRUE;
          g = l;
          return true;
        }
      }
      catch (OperationCanceledException localOperationCanceledException) {}catch (IOException localIOException) {}catch (AuthenticatorException localAuthenticatorException) {}
      Account[] arrayOfAccount = (Account[])e.getAccountsByTypeAndFeatures("com.google", new String[] { "service_uca" }, null, null).getResult();
      if ((arrayOfAccount != null) && (arrayOfAccount.length > 0))
      {
        f = Boolean.TRUE;
        g = l;
        return true;
        j().I().b("Exception checking account types", arrayOfAccount);
      }
    }
  }
}

/* Location:
 * Qualified Name:     R2.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */