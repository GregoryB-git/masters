package R2;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public final class C extends AbstractC0550l3 {

    /* renamed from: c, reason: collision with root package name */
    public long f4560c;

    /* renamed from: d, reason: collision with root package name */
    public String f4561d;

    /* renamed from: e, reason: collision with root package name */
    public AccountManager f4562e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f4563f;

    /* renamed from: g, reason: collision with root package name */
    public long f4564g;

    public C(N2 n22) {
        super(n22);
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0511g f() {
        return super.f();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C g() {
        return super.g();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ X1 h() {
        return super.h();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0549l2 i() {
        return super.i();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Y1 j() {
        return super.j();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ S5 k() {
        return super.k();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // R2.AbstractC0550l3
    public final boolean s() {
        Calendar calendar = Calendar.getInstance();
        this.f4560c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f4561d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    public final long u() {
        n();
        return this.f4564g;
    }

    public final long v() {
        o();
        return this.f4560c;
    }

    public final String w() {
        o();
        return this.f4561d;
    }

    public final void x() {
        n();
        this.f4563f = null;
        this.f4564g = 0L;
    }

    public final boolean y() {
        n();
        long a7 = b().a();
        if (a7 - this.f4564g > 86400000) {
            this.f4563f = null;
        }
        Boolean bool = this.f4563f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (AbstractC2112a.a(a(), "android.permission.GET_ACCOUNTS") != 0) {
            j().N().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f4562e == null) {
                this.f4562e = AccountManager.get(a());
            }
            try {
                Account[] result = this.f4562e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
                if (result != null && result.length > 0) {
                    this.f4563f = Boolean.TRUE;
                    this.f4564g = a7;
                    return true;
                }
                Account[] result2 = this.f4562e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f4563f = Boolean.TRUE;
                    this.f4564g = a7;
                    return true;
                }
            } catch (AuthenticatorException e7) {
                e = e7;
                j().I().b("Exception checking account types", e);
                this.f4564g = a7;
                this.f4563f = Boolean.FALSE;
                return false;
            } catch (OperationCanceledException e8) {
                e = e8;
                j().I().b("Exception checking account types", e);
                this.f4564g = a7;
                this.f4563f = Boolean.FALSE;
                return false;
            } catch (IOException e9) {
                e = e9;
                j().I().b("Exception checking account types", e);
                this.f4564g = a7;
                this.f4563f = Boolean.FALSE;
                return false;
            }
        }
        this.f4564g = a7;
        this.f4563f = Boolean.FALSE;
        return false;
    }
}
