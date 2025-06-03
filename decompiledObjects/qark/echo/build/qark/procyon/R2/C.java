// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.accounts.AuthenticatorException;
import java.io.IOException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import android.accounts.AccountManagerCallback;
import android.accounts.Account;
import x.a;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import E2.e;
import android.content.Context;
import android.accounts.AccountManager;

public final class C extends l3
{
    public long c;
    public String d;
    public AccountManager e;
    public Boolean f;
    public long g;
    
    public C(final N2 n2) {
        super(n2);
    }
    
    @Override
    public final boolean s() {
        final Calendar instance = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(instance.get(15) + instance.get(16), TimeUnit.MILLISECONDS);
        final Locale default1 = Locale.getDefault();
        final String language = default1.getLanguage();
        final Locale english = Locale.ENGLISH;
        final String lowerCase = language.toLowerCase(english);
        final String lowerCase2 = default1.getCountry().toLowerCase(english);
        final StringBuilder sb = new StringBuilder();
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.d = sb.toString();
        return false;
    }
    
    public final long u() {
        this.n();
        return this.g;
    }
    
    public final long v() {
        this.o();
        return this.c;
    }
    
    public final String w() {
        this.o();
        return this.d;
    }
    
    public final void x() {
        this.n();
        this.f = null;
        this.g = 0L;
    }
    
    public final boolean y() {
        this.n();
        final long a = this.b().a();
        if (a - this.g > 86400000L) {
            this.f = null;
        }
        final Boolean f = this.f;
        if (f != null) {
            return f;
        }
        Label_0070: {
            if (x.a.a(this.a(), "android.permission.GET_ACCOUNTS") != 0) {
                this.j().N().a("Permission error checking for dasher/unicorn accounts");
            }
            else {
                if (this.e == null) {
                    this.e = AccountManager.get(this.a());
                }
                while (true) {
                    try {
                        final Account[] array = (Account[])this.e.getAccountsByTypeAndFeatures("com.google", new String[] { "service_HOSTED" }, (AccountManagerCallback)null, (Handler)null).getResult();
                        if (array != null && array.length > 0) {
                            this.f = Boolean.TRUE;
                            this.g = a;
                            return true;
                        }
                        final Account[] array2 = (Account[])this.e.getAccountsByTypeAndFeatures("com.google", new String[] { "service_uca" }, (AccountManagerCallback)null, (Handler)null).getResult();
                        if (array2 != null && array2.length > 0) {
                            this.f = Boolean.TRUE;
                            this.g = a;
                            return true;
                        }
                        break Label_0070;
                        final OperationCanceledException ex;
                        this.j().I().b("Exception checking account types", ex);
                    }
                    catch (OperationCanceledException ex) {
                        continue;
                    }
                    catch (IOException ex) {
                        continue;
                    }
                    catch (AuthenticatorException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
        this.g = a;
        this.f = Boolean.FALSE;
        return false;
    }
}
