package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import m6.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

/* loaded from: classes.dex */
public class zzagt implements zzaea<zzagt> {
    private static final String zza = "zzagt";
    private String zzb;
    private zzaj<zzahe> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaea
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzagt zza(String str) {
        zzaj<zzahe> zza2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = g.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzam zzg = zzaj.zzg();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        zzg.zza(jSONObject2 == null ? zzahe.zza(null, null) : zzahe.zza(g.a(jSONObject2.optString("provider")), g.a(jSONObject2.optString("enforcementState"))));
                    }
                    zza2 = zzg.zza();
                    this.zzc = zza2;
                }
                zza2 = zzaj.zza(new ArrayList());
                this.zzc = zza2;
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzail.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb(String str) {
        j.e(str);
        zzaj<zzahe> zzajVar = this.zzc;
        if (zzajVar == null || zzajVar.isEmpty()) {
            return null;
        }
        zzaj<zzahe> zzajVar2 = this.zzc;
        int size = zzajVar2.size();
        int i10 = 0;
        while (i10 < size) {
            zzahe zzaheVar = zzajVar2.get(i10);
            i10++;
            zzahe zzaheVar2 = zzaheVar;
            String zza2 = zzaheVar2.zza();
            String zzb = zzaheVar2.zzb();
            if (zza2 != null && zzb != null && zzb.equals(str)) {
                return zzaheVar2.zza();
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        return zzb.equals("ENFORCE") || zzb.equals("AUDIT");
    }
}
