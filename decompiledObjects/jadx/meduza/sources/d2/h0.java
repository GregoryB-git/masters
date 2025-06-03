package d2;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import c8.a1;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import e7.j2;
import e7.k4;
import e7.r6;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h0 implements c5.c, l6.n, k4, OnSuccessListener, i9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3362a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3363b;

    public h0(int i10) {
        this.f3362a = i10;
        if (i10 != 8) {
            this.f3363b = new SparseArray();
        } else {
            this.f3363b = ma.h.f10961b;
        }
    }

    @Override // c5.c
    public final long a(long j10) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l6.n
    public final void accept(Object obj, Object obj2) {
        k6.a aVar = o6.c.f11932a;
        o6.a aVar2 = (o6.a) ((o6.d) obj).getService();
        m6.m mVar = (m6.m) this.f3363b;
        Parcel zaa = aVar2.zaa();
        zac.zac(zaa, mVar);
        aVar2.zad(1, zaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // c5.c
    public final long b(long j10, long j11) {
        return j11;
    }

    @Override // e7.k4
    public final void c(String str, int i10, Throwable th, byte[] bArr, Map map) {
        boolean z10;
        j2 j2Var = (j2) this.f3363b;
        if (!((i10 == 200 || i10 == 204 || i10 == 304) && th == null)) {
            j2Var.zzj().f4063r.d("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
            return;
        }
        j2Var.j().D.a(true);
        if (bArr == null || bArr.length == 0) {
            j2Var.zzj().f4066v.b("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            if (TextUtils.isEmpty(optString)) {
                j2Var.zzj().f4066v.b("Deferred Deep Link is empty.");
                return;
            }
            String optString2 = jSONObject.optString("gclid", "");
            String optString3 = jSONObject.optString("gbraid", "");
            String optString4 = jSONObject.optString("gad_source", "");
            double optDouble = jSONObject.optDouble(Constants.TIMESTAMP, 0.0d);
            Bundle bundle = new Bundle();
            r6 m10 = j2Var.m();
            if (TextUtils.isEmpty(optString)) {
                z10 = false;
            } else {
                z10 = false;
                List<ResolveInfo> queryIntentActivities = m10.zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                    z10 = true;
                }
            }
            if (!z10) {
                j2Var.zzj().f4063r.a(optString2, optString3, optString, "Deferred Deep Link validation failed. gclid, gbraid, deep link");
                return;
            }
            if (!TextUtils.isEmpty(optString3)) {
                bundle.putString("gbraid", optString3);
            }
            if (!TextUtils.isEmpty(optString4)) {
                bundle.putString("gad_source", optString4);
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            j2Var.f4373x.Q("auto", "_cmp", bundle);
            r6 m11 = j2Var.m();
            if (TextUtils.isEmpty(optString) || !m11.U(optString, optDouble)) {
                return;
            }
            m11.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e10) {
            j2Var.zzj().f4060o.c("Failed to parse the Deferred Deep Link response. exception", e10);
        }
    }

    @Override // c5.c
    public final long d(long j10, long j11) {
        return 0L;
    }

    @Override // c5.c
    public final long e(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // c5.c
    public final d5.i f(long j10) {
        return (d5.i) this.f3363b;
    }

    @Override // c5.c
    public final long g(long j10, long j11) {
        return 0L;
    }

    @Override // c5.c
    public final boolean h() {
        return true;
    }

    @Override // c5.c
    public final long i() {
        return 0L;
    }

    @Override // c5.c
    public final long j(long j10) {
        return 1L;
    }

    @Override // c5.c
    public final long k(long j10, long j11) {
        return 1L;
    }

    public final JSONObject l() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f3363b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(j8.g.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        j8.g.b(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    j8.g.b(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            j8.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            j8.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        ((TaskCompletionSource) this.f3363b).setResult(new a1(null, null, (String) obj));
    }

    public final String toString() {
        switch (this.f3362a) {
            case 9:
                return '<' + ((String) this.f3363b) + '>';
            default:
                return super.toString();
        }
    }

    public h0(TaskCompletionSource taskCompletionSource) {
        this.f3362a = 6;
        this.f3363b = taskCompletionSource;
    }

    public /* synthetic */ h0(Object obj, int i10) {
        this.f3362a = i10;
        this.f3363b = obj;
    }

    public h0(p8.e eVar) {
        this.f3362a = 7;
        this.f3363b = new File(eVar.f13042c, "com.crashlytics.settings.json");
    }
}
