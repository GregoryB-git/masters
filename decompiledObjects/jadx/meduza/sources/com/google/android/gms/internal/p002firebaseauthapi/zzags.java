package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

/* loaded from: classes.dex */
public class zzags implements zzaea<zzags> {
    private static final String zza = "zzags";
    private String zzb;

    public zzags() {
    }

    public zzags(String str) {
        this.zzb = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzags zza(String str) {
        try {
            this.zzb = g.a(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzail.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
