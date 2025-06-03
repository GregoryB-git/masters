package com.google.android.gms.internal.measurement;

import android.util.Log;

/* loaded from: classes.dex */
public final class V2 extends S2 {
    public V2(C0859a3 c0859a3, String str, Boolean bool, boolean z7) {
        super(c0859a3, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.S2
    public final /* synthetic */ Object h(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (AbstractC1028t2.f11155c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (AbstractC1028t2.f11156d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.k() + ": " + String.valueOf(obj));
        return null;
    }
}
