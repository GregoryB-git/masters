package com.google.android.gms.internal.p002firebaseauthapi;

import a8.a;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import m6.j;
import q9.e;
import u7.f;

/* loaded from: classes.dex */
public final class zzaef {
    private Context zza;
    private zzaey zzb;
    private String zzc;
    private final f zzd;
    private boolean zze;
    private String zzf;

    public zzaef(Context context, f fVar, String str) {
        this.zze = false;
        j.i(context);
        this.zza = context;
        j.i(fVar);
        this.zzd = fVar;
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzaef(f fVar, String str) {
        this(fVar.f15084a, fVar, str);
        fVar.a();
    }

    private static String zza(f fVar) {
        a aVar = FirebaseAuth.getInstance(fVar).f3076v.get();
        if (aVar == null) {
            return null;
        }
        try {
            z7.a aVar2 = (z7.a) Tasks.await(aVar.a());
            if (aVar2.a() != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(aVar2.a()));
            }
            return aVar2.b();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e10.getMessage());
            return null;
        }
    }

    private static String zzb(f fVar) {
        e eVar = FirebaseAuth.getInstance(fVar).f3077w.get();
        if (eVar != null) {
            try {
                return (String) Tasks.await(eVar.a());
            } catch (InterruptedException | ExecutionException e10) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e10.getMessage());
            }
        }
        return null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    public final void zza(URLConnection uRLConnection) {
        StringBuilder l10;
        String str;
        if (this.zze) {
            l10 = defpackage.f.l(this.zzc);
            str = "/FirebaseUI-Android";
        } else {
            l10 = defpackage.f.l(this.zzc);
            str = "/FirebaseCore-Android";
        }
        l10.append(str);
        String sb2 = l10.toString();
        if (this.zzb == null) {
            this.zzb = new zzaey(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzaee.zza());
        uRLConnection.setRequestProperty("X-Client-Version", sb2);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        f fVar = this.zzd;
        fVar.a();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", fVar.f15086c.f15097b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza = zza(this.zzd);
        if (!TextUtils.isEmpty(zza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza);
        }
        this.zzf = null;
    }
}
