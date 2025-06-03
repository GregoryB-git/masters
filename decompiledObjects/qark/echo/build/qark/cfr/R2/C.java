/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.AccountManager
 *  android.accounts.AccountManagerCallback
 *  android.accounts.AccountManagerFuture
 *  android.accounts.AuthenticatorException
 *  android.accounts.OperationCanceledException
 *  android.content.Context
 *  android.os.Handler
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Calendar
 *  java.util.Locale
 *  java.util.concurrent.TimeUnit
 */
package R2;

import E2.e;
import R2.G2;
import R2.N2;
import R2.S5;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.f;
import R2.g;
import R2.l2;
import R2.l3;
import R2.m3;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Handler;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import x.a;

public final class C
extends l3 {
    public long c;
    public String d;
    public AccountManager e;
    public Boolean f;
    public long g;

    public C(N2 n22) {
        super(n22);
    }

    @Override
    public final boolean s() {
        Object object = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert((long)(object.get(15) + object.get(16)), TimeUnit.MILLISECONDS);
        Object object2 = Locale.getDefault();
        object = object2.getLanguage();
        Locale locale = Locale.ENGLISH;
        object = object.toLowerCase(locale);
        object2 = object2.getCountry().toLowerCase(locale);
        locale = new StringBuilder();
        locale.append((String)object);
        locale.append("-");
        locale.append((String)object2);
        this.d = locale.toString();
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean y() {
        long l8;
        block11 : {
            Account[] arraccount;
            this.n();
            l8 = this.b().a();
            if (l8 - this.g > 86400000L) {
                this.f = null;
            }
            if ((arraccount = this.f) != null) {
                return arraccount.booleanValue();
            }
            if (a.a(this.a(), "android.permission.GET_ACCOUNTS") != 0) {
                this.j().N().a("Permission error checking for dasher/unicorn accounts");
            } else {
                void var3_3;
                if (this.e == null) {
                    this.e = AccountManager.get((Context)this.a());
                }
                try {
                    arraccount = (Account[])this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                    if (arraccount != null && arraccount.length > 0) {
                        this.f = Boolean.TRUE;
                        this.g = l8;
                        return true;
                    }
                    arraccount = (Account[])this.e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                    if (arraccount != null && arraccount.length > 0) {
                        this.f = Boolean.TRUE;
                        this.g = l8;
                        return true;
                    }
                    break block11;
                }
                catch (OperationCanceledException operationCanceledException) {
                }
                catch (IOException iOException) {
                }
                catch (AuthenticatorException authenticatorException) {}
                this.j().I().b("Exception checking account types", var3_3);
            }
        }
        this.g = l8;
        this.f = Boolean.FALSE;
        return false;
    }
}

