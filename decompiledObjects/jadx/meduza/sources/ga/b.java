package ga;

import android.content.Context;
import android.os.Bundle;
import p2.m0;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f6106a;

    public b(Context context) {
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f6106a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // ga.j
    public final Boolean a() {
        if (this.f6106a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f6106a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // ga.j
    public final mc.a b() {
        if (this.f6106a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new mc.a(m0.c0(this.f6106a.getInt("firebase_sessions_sessions_restart_timeout"), mc.c.f11158d));
        }
        return null;
    }

    @Override // ga.j
    public final Double c() {
        if (this.f6106a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f6106a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // ga.j
    public final Object d(ub.e<? super rb.h> eVar) {
        return rb.h.f13851a;
    }
}
