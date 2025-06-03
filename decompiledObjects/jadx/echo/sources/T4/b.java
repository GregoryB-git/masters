package T4;

import T4.h;
import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final a f6219b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f6220a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f6220a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // T4.h
    public Boolean a() {
        if (this.f6220a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f6220a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // T4.h
    public Double b() {
        if (this.f6220a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f6220a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // T4.h
    public Object c(X5.d dVar) {
        return h.a.a(this, dVar);
    }

    @Override // T4.h
    public o6.a d() {
        if (this.f6220a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return o6.a.h(o6.c.o(this.f6220a.getInt("firebase_sessions_sessions_restart_timeout"), o6.d.f18207s));
        }
        return null;
    }
}
