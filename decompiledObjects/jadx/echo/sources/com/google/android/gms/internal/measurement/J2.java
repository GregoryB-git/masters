package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes.dex */
public final class J2 implements E2 {

    /* renamed from: c, reason: collision with root package name */
    public static J2 f10440c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10441a;

    /* renamed from: b, reason: collision with root package name */
    public final ContentObserver f10442b;

    public J2() {
        this.f10441a = null;
        this.f10442b = null;
    }

    public static J2 a(Context context) {
        J2 j22;
        synchronized (J2.class) {
            try {
                if (f10440c == null) {
                    f10440c = x.b.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new J2(context) : new J2();
                }
                j22 = f10440c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j22;
    }

    public static synchronized void b() {
        Context context;
        synchronized (J2.class) {
            try {
                J2 j22 = f10440c;
                if (j22 != null && (context = j22.f10441a) != null && j22.f10442b != null) {
                    context.getContentResolver().unregisterContentObserver(f10440c.f10442b);
                }
                f10440c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ String c(String str) {
        return AbstractC1028t2.a(this.f10441a.getContentResolver(), str, null);
    }

    @Override // com.google.android.gms.internal.measurement.E2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String i(final String str) {
        Context context = this.f10441a;
        if (context != null && !AbstractC1081z2.b(context)) {
            try {
                return (String) H2.a(new G2() { // from class: com.google.android.gms.internal.measurement.I2
                    @Override // com.google.android.gms.internal.measurement.G2
                    public final Object a() {
                        return J2.this.c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e7) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e7);
            }
        }
        return null;
    }

    public J2(Context context) {
        this.f10441a = context;
        L2 l22 = new L2(this, null);
        this.f10442b = l22;
        context.getContentResolver().registerContentObserver(AbstractC1028t2.f11153a, true, l22);
    }
}
