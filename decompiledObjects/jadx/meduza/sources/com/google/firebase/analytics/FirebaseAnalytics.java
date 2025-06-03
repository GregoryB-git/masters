package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.tasks.Tasks;
import e7.j4;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m6.j;
import u7.f;
import u9.d;
import v7.c;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: c, reason: collision with root package name */
    public static volatile FirebaseAnalytics f3046c;

    /* renamed from: a, reason: collision with root package name */
    public final zzed f3047a;

    /* renamed from: b, reason: collision with root package name */
    public v7.b f3048b;

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

    public FirebaseAnalytics(zzed zzedVar) {
        j.i(zzedVar);
        this.f3047a = zzedVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f3046c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f3046c == null) {
                    f3046c = new FirebaseAnalytics(zzed.zza(context));
                }
            }
        }
        return f3046c;
    }

    public static j4 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzed zza = zzed.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zza == null) {
            return null;
        }
        return new c(zza);
    }

    public final void a(HashMap hashMap) {
        Bundle bundle = new Bundle();
        a aVar = (a) hashMap.get(b.AD_STORAGE);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) hashMap.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) hashMap.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int ordinal3 = aVar3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = (a) hashMap.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int ordinal4 = aVar4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f3047a.zzc(bundle);
    }

    public final ExecutorService b() {
        v7.b bVar;
        synchronized (FirebaseAnalytics.class) {
            if (this.f3048b == null) {
                this.f3048b = new v7.b(TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            bVar = this.f3048b;
        }
        return bVar;
    }

    public final String getFirebaseInstanceId() {
        try {
            Object obj = u9.c.f15111m;
            return (String) Tasks.await(((u9.c) f.e().c(d.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.f3047a.zza(activity, str, str2);
    }
}
