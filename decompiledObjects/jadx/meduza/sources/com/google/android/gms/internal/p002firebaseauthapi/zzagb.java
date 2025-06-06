package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagb implements zzaea<zzagb> {
    private static final String zza = "zzagb";
    private String zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagb zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString(Constants.ID_TOKEN, null);
            this.zzc = jSONObject.optString("refreshToken", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzail.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
