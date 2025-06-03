package com.google.firebase.analytics;

import A2.AbstractC0328n;
import R2.InterfaceC0558m4;
import V2.AbstractC0659j;
import V2.m;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.J0;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s4.h;
import v3.C2053b;
import v3.C2054c;
import v3.CallableC2052a;
import v3.CallableC2055d;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f11562c;

    /* renamed from: a, reason: collision with root package name */
    public final J0 f11563a;

    /* renamed from: b, reason: collision with root package name */
    public ExecutorService f11564b;

    public enum a {
        GRANTED,
        DENIED
    }

    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(J0 j02) {
        AbstractC0328n.i(j02);
        this.f11563a = j02;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f11562c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f11562c == null) {
                        f11562c = new FirebaseAnalytics(J0.e(context));
                    }
                } finally {
                }
            }
        }
        return f11562c;
    }

    @Keep
    public static InterfaceC0558m4 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        J0 f7 = J0.f(context, null, null, null, bundle);
        if (f7 == null) {
            return null;
        }
        return new C2054c(f7);
    }

    public final AbstractC0659j a() {
        try {
            return m.c(l(), new CallableC2052a(this));
        } catch (RuntimeException e7) {
            this.f11563a.i(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return m.d(e7);
        }
    }

    public final AbstractC0659j b() {
        try {
            return m.c(l(), new CallableC2055d(this));
        } catch (RuntimeException e7) {
            this.f11563a.i(5, "Failed to schedule task for getSessionId", null, null, null);
            return m.d(e7);
        }
    }

    public final void c(String str, Bundle bundle) {
        this.f11563a.t(str, bundle);
    }

    public final void d() {
        this.f11563a.R();
    }

    public final void e(boolean z7) {
        this.f11563a.r(Boolean.valueOf(z7));
    }

    public final void f(Map map) {
        Bundle bundle = new Bundle();
        a aVar = (a) map.get(b.AD_STORAGE);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int ordinal3 = aVar3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = (a) map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int ordinal4 = aVar4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f11563a.G(bundle);
    }

    public final void g(Bundle bundle) {
        this.f11563a.K(bundle);
    }

    @NonNull
    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) m.b(h.t().a(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            throw new IllegalStateException(e7);
        } catch (ExecutionException e8) {
            throw new IllegalStateException(e8.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public final void h(long j7) {
        this.f11563a.j(j7);
    }

    public final void i(String str) {
        this.f11563a.L(str);
    }

    public final void j(String str, String str2) {
        this.f11563a.C(str, str2);
    }

    public final ExecutorService l() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            try {
                if (this.f11564b == null) {
                    this.f11564b = new C2053b(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.f11564b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    @Keep
    @Deprecated
    public final void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        this.f11563a.l(activity, str, str2);
    }
}
