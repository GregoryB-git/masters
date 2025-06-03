package j3;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import c3.AbstractC0825c;
import c3.C0824b;
import c3.C0834l;
import c3.C0836n;
import c3.C0837o;
import c3.InterfaceC0823a;
import c3.InterfaceC0839q;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import q3.AbstractC1895k;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1371a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f15433d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final String f15434e = "a";

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0839q f15435a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0823a f15436b;

    /* renamed from: c, reason: collision with root package name */
    public C0837o f15437c;

    /* renamed from: j3.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Context f15438a = null;

        /* renamed from: b, reason: collision with root package name */
        public String f15439b = null;

        /* renamed from: c, reason: collision with root package name */
        public String f15440c = null;

        /* renamed from: d, reason: collision with root package name */
        public String f15441d = null;

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC0823a f15442e = null;

        /* renamed from: f, reason: collision with root package name */
        public boolean f15443f = true;

        /* renamed from: g, reason: collision with root package name */
        public C0834l f15444g = null;

        /* renamed from: h, reason: collision with root package name */
        public C0837o f15445h;

        public static byte[] h(Context context, String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return AbstractC1895k.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        public synchronized C1371a f() {
            C0837o i7;
            C1371a c1371a;
            try {
                if (this.f15439b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (C1371a.f15433d) {
                    try {
                        byte[] h7 = h(this.f15438a, this.f15439b, this.f15440c);
                        if (h7 == null) {
                            if (this.f15441d != null) {
                                this.f15442e = k();
                            }
                            i7 = g();
                        } else {
                            if (this.f15441d != null && C1371a.e()) {
                                i7 = j(h7);
                            }
                            i7 = i(h7);
                        }
                        this.f15445h = i7;
                        c1371a = new C1371a(this);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return c1371a;
        }

        public final C0837o g() {
            if (this.f15444g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            C0837o a7 = C0837o.i().a(this.f15444g);
            C0837o h7 = a7.h(a7.d().i().Z(0).Z());
            C1374d c1374d = new C1374d(this.f15438a, this.f15439b, this.f15440c);
            if (this.f15442e != null) {
                h7.d().r(c1374d, this.f15442e);
            } else {
                AbstractC0825c.b(h7.d(), c1374d);
            }
            return h7;
        }

        public final C0837o i(byte[] bArr) {
            return C0837o.j(AbstractC0825c.a(C0824b.b(bArr)));
        }

        public final C0837o j(byte[] bArr) {
            try {
                this.f15442e = new C1373c().a(this.f15441d);
                try {
                    return C0837o.j(C0836n.n(C0824b.b(bArr), this.f15442e));
                } catch (IOException | GeneralSecurityException e7) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e7;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e8) {
                try {
                    C0837o i7 = i(bArr);
                    Log.w(C1371a.f15434e, "cannot use Android Keystore, it'll be disabled", e8);
                    return i7;
                } catch (IOException unused2) {
                    throw e8;
                }
            }
        }

        public final InterfaceC0823a k() {
            if (!C1371a.e()) {
                Log.w(C1371a.f15434e, "Android Keystore requires at least Android M");
                return null;
            }
            C1373c c1373c = new C1373c();
            try {
                boolean d7 = C1373c.d(this.f15441d);
                try {
                    return c1373c.a(this.f15441d);
                } catch (GeneralSecurityException | ProviderException e7) {
                    if (!d7) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f15441d), e7);
                    }
                    Log.w(C1371a.f15434e, "cannot use Android Keystore, it'll be disabled", e7);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e8) {
                Log.w(C1371a.f15434e, "cannot use Android Keystore, it'll be disabled", e8);
                return null;
            }
        }

        public b l(C0834l c0834l) {
            this.f15444g = c0834l;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f15443f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f15441d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f15438a = context;
            this.f15439b = str;
            this.f15440c = str2;
            return this;
        }
    }

    public C1371a(b bVar) {
        this.f15435a = new C1374d(bVar.f15438a, bVar.f15439b, bVar.f15440c);
        this.f15436b = bVar.f15442e;
        this.f15437c = bVar.f15445h;
    }

    public static boolean e() {
        return true;
    }

    public synchronized C0836n d() {
        return this.f15437c.d();
    }
}
