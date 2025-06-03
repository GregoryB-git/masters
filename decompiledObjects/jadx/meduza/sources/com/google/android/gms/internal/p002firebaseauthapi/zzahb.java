package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import v6.g;

/* loaded from: classes.dex */
public final class zzahb {
    private List<zzahc> zza;

    public zzahb() {
        this.zza = new ArrayList();
    }

    private zzahb(List<zzahc> list) {
        this.zza = !list.isEmpty() ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public static zzahb zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzahb(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(jSONObject == null ? new zzahc() : new zzahc(g.a(jSONObject.optString("federatedId", null)), g.a(jSONObject.optString("displayName", null)), g.a(jSONObject.optString("photoUrl", null)), g.a(jSONObject.optString(Constants.PROVIDER_ID, null)), null, g.a(jSONObject.optString("phoneNumber", null)), g.a(jSONObject.optString(Constants.EMAIL, null))));
        }
        return new zzahb(arrayList);
    }

    public final List<zzahc> zza() {
        return this.zza;
    }
}
