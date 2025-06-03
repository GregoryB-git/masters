package aa;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final u7.f f342a;

    /* renamed from: b, reason: collision with root package name */
    public final r f343b;

    /* renamed from: c, reason: collision with root package name */
    public final i6.c f344c;

    /* renamed from: d, reason: collision with root package name */
    public final t9.b<ca.f> f345d;

    /* renamed from: e, reason: collision with root package name */
    public final t9.b<q9.f> f346e;
    public final u9.d f;

    public o(u7.f fVar, r rVar, t9.b<ca.f> bVar, t9.b<q9.f> bVar2, u9.d dVar) {
        fVar.a();
        i6.c cVar = new i6.c(fVar.f15084a);
        this.f342a = fVar;
        this.f343b = rVar;
        this.f344c = cVar;
        this.f345d = bVar;
        this.f346e = bVar2;
        this.f = dVar;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(new m1.c(2), new io.flutter.plugins.firebase.auth.g(this, 23));
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i10;
        String str3;
        String str4;
        String str5;
        int b10;
        PackageInfo b11;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        u7.f fVar = this.f342a;
        fVar.a();
        bundle.putString("gmp_app_id", fVar.f15086c.f15097b);
        r rVar = this.f343b;
        synchronized (rVar) {
            if (rVar.f360d == 0 && (b11 = rVar.b("com.google.android.gms")) != null) {
                rVar.f360d = b11.versionCode;
            }
            i10 = rVar.f360d;
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        r rVar2 = this.f343b;
        synchronized (rVar2) {
            if (rVar2.f358b == null) {
                rVar2.d();
            }
            str3 = rVar2.f358b;
        }
        bundle.putString("app_ver", str3);
        r rVar3 = this.f343b;
        synchronized (rVar3) {
            if (rVar3.f359c == null) {
                rVar3.d();
            }
            str4 = rVar3.f359c;
        }
        bundle.putString("app_ver_name", str4);
        u7.f fVar2 = this.f342a;
        fVar2.a();
        try {
            str5 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(fVar2.f15085b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str5 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str5);
        try {
            String a10 = ((u9.h) Tasks.await(this.f.a())).a();
            if (TextUtils.isEmpty(a10)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", a10);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e10);
        }
        bundle.putString("appid", (String) Tasks.await(this.f.getId()));
        bundle.putString("cliv", "fcm-24.1.0");
        q9.f fVar3 = this.f346e.get();
        ca.f fVar4 = this.f345d.get();
        if (fVar3 == null || fVar4 == null || (b10 = fVar3.b()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(q0.g.c(b10)));
        bundle.putString("Firebase-Client", fVar4.a());
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        try {
            b(str, str2, bundle);
            return this.f344c.a(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }
}
