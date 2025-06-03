package r9;

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
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final u7.f f13817a;

    /* renamed from: b, reason: collision with root package name */
    public final h f13818b;

    /* renamed from: c, reason: collision with root package name */
    public final i6.c f13819c;

    /* renamed from: d, reason: collision with root package name */
    public final t9.b<ca.f> f13820d;

    /* renamed from: e, reason: collision with root package name */
    public final t9.b<q9.f> f13821e;
    public final u9.d f;

    public e(u7.f fVar, h hVar, t9.b<ca.f> bVar, t9.b<q9.f> bVar2, u9.d dVar) {
        fVar.a();
        i6.c cVar = new i6.c(fVar.f15084a);
        this.f13817a = fVar;
        this.f13818b = hVar;
        this.f13819c = cVar;
        this.f13820d = bVar;
        this.f13821e = bVar2;
        this.f = dVar;
    }

    public final Task a(Bundle bundle, String str, String str2, String str3) {
        int i10;
        String str4;
        String str5;
        String str6;
        int b10;
        PackageInfo b11;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        u7.f fVar = this.f13817a;
        fVar.a();
        bundle.putString("gmp_app_id", fVar.f15086c.f15097b);
        h hVar = this.f13818b;
        synchronized (hVar) {
            if (hVar.f13826d == 0 && (b11 = hVar.b("com.google.android.gms")) != null) {
                hVar.f13826d = b11.versionCode;
            }
            i10 = hVar.f13826d;
        }
        bundle.putString("gmsv", Integer.toString(i10));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        h hVar2 = this.f13818b;
        synchronized (hVar2) {
            if (hVar2.f13824b == null) {
                hVar2.c();
            }
            str4 = hVar2.f13824b;
        }
        bundle.putString("app_ver", str4);
        h hVar3 = this.f13818b;
        synchronized (hVar3) {
            if (hVar3.f13825c == null) {
                hVar3.c();
            }
            str5 = hVar3.f13825c;
        }
        bundle.putString("app_ver_name", str5);
        u7.f fVar2 = this.f13817a;
        fVar2.a();
        try {
            str6 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(fVar2.f15085b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str6 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str6);
        try {
            String a10 = ((u9.h) Tasks.await(this.f.a())).a();
            if (TextUtils.isEmpty(a10)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", a10);
            }
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e10);
        }
        bundle.putString("cliv", "fiid-21.1.0");
        q9.f fVar3 = this.f13821e.get();
        ca.f fVar4 = this.f13820d.get();
        if (fVar3 != null && fVar4 != null && (b10 = fVar3.b()) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(q0.g.c(b10)));
            bundle.putString("Firebase-Client", fVar4.a());
        }
        return this.f13819c.a(bundle);
    }
}
