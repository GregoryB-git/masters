package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import b8.h;
import io.flutter.plugins.firebase.auth.Constants;
import m6.d;
import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzafy implements zzaeb {
    private static final String zza = "zzafy";
    private final String zzb;
    private final String zzc;
    private final h zzd;
    private final String zze;
    private final String zzf;

    static {
        String[] strArr = new String[0];
        if (strArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
            sb2.append("] ");
        }
        new d(zza, null);
        for (int i10 = 2; i10 <= 7 && !Log.isLoggable(zza, i10); i10++) {
        }
    }

    public zzafy(h hVar, String str, String str2) {
        j.i(hVar);
        this.zzd = hVar;
        String str3 = hVar.f2080a;
        j.e(str3);
        this.zzb = str3;
        String str4 = hVar.f2082c;
        j.e(str4);
        this.zzc = str4;
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        b8.d dVar;
        String str = this.zzc;
        zzan<String, Integer> zzanVar = b8.d.f2065d;
        j.e(str);
        try {
            dVar = new b8.d(str);
        } catch (IllegalArgumentException unused) {
            dVar = null;
        }
        String str2 = dVar != null ? dVar.f2066a : null;
        String str3 = dVar != null ? dVar.f2068c : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.EMAIL, this.zzb);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put(Constants.ID_TOKEN, str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzail.zza(jSONObject, "captchaResp", str5);
        } else {
            zzail.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final h zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
