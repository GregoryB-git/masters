package r8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.h0;
import g.s;
import j8.w;
import java.util.concurrent.atomic.AtomicReference;
import nc.g0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13797a;

    /* renamed from: b, reason: collision with root package name */
    public final i f13798b;

    /* renamed from: c, reason: collision with root package name */
    public final s f13799c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f13800d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f13801e;
    public final j f;

    /* renamed from: g, reason: collision with root package name */
    public final w f13802g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference<c> f13803h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference<TaskCompletionSource<c>> f13804i;

    public f(Context context, i iVar, g0 g0Var, s sVar, h0 h0Var, b bVar, w wVar) {
        AtomicReference<c> atomicReference = new AtomicReference<>();
        this.f13803h = atomicReference;
        this.f13804i = new AtomicReference<>(new TaskCompletionSource());
        this.f13797a = context;
        this.f13798b = iVar;
        this.f13800d = g0Var;
        this.f13799c = sVar;
        this.f13801e = h0Var;
        this.f = bVar;
        this.f13802g = wVar;
        atomicReference.set(a.b(g0Var));
    }

    public static void c(JSONObject jSONObject, String str) {
        StringBuilder l10 = defpackage.f.l(str);
        l10.append(jSONObject.toString());
        String sb2 = l10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, null);
        }
    }

    public final c a(int i10) {
        c cVar = null;
        try {
            if (!q0.g.b(2, i10)) {
                JSONObject l10 = this.f13801e.l();
                if (l10 != null) {
                    c d10 = this.f13799c.d(l10);
                    if (d10 != null) {
                        c(l10, "Loaded cached settings: ");
                        this.f13800d.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!q0.g.b(3, i10)) {
                            if (d10.f13787c < currentTimeMillis) {
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                                }
                            }
                        }
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            cVar = d10;
                        } catch (Exception e10) {
                            e = e10;
                            cVar = d10;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return cVar;
                        }
                    } else {
                        Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", null);
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        return cVar;
    }

    public final c b() {
        return this.f13803h.get();
    }
}
