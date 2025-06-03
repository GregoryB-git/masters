/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 */
package T4;

import T4.h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import o6.c;
import o6.d;

public final class b
implements h {
    public static final a b = new a(null);
    public final Bundle a;

    public b(Context context) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo((String)context.getPackageName(), (int)128).metaData;
        context = bundle;
        if (bundle == null) {
            context = Bundle.EMPTY;
        }
        this.a = context;
    }

    @Override
    public Boolean a() {
        if (this.a.containsKey("firebase_sessions_enabled")) {
            return this.a.getBoolean("firebase_sessions_enabled");
        }
        return null;
    }

    @Override
    public Double b() {
        if (this.a.containsKey("firebase_sessions_sampling_rate")) {
            return this.a.getDouble("firebase_sessions_sampling_rate");
        }
        return null;
    }

    @Override
    public Object c(X5.d d8) {
        return h.a.a(this, d8);
    }

    @Override
    public o6.a d() {
        if (this.a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return o6.a.h(c.o(this.a.getInt("firebase_sessions_sessions_restart_timeout"), d.s));
        }
        return null;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

