// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T4;

import android.os.BaseBundle;
import o6.c;
import o6.a;
import X5.d;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import kotlin.jvm.internal.g;
import android.os.Bundle;

public final class b implements h
{
    public static final a b;
    public final Bundle a;
    
    static {
        b = new a(null);
    }
    
    public b(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle a;
        if ((a = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData) == null) {
            a = Bundle.EMPTY;
        }
        this.a = a;
    }
    
    @Override
    public Boolean a() {
        if (((BaseBundle)this.a).containsKey("firebase_sessions_enabled")) {
            return ((BaseBundle)this.a).getBoolean("firebase_sessions_enabled");
        }
        return null;
    }
    
    @Override
    public Double b() {
        if (((BaseBundle)this.a).containsKey("firebase_sessions_sampling_rate")) {
            return ((BaseBundle)this.a).getDouble("firebase_sessions_sampling_rate");
        }
        return null;
    }
    
    @Override
    public Object c(final d d) {
        return h.a.a(this, d);
    }
    
    @Override
    public o6.a d() {
        if (((BaseBundle)this.a).containsKey("firebase_sessions_sessions_restart_timeout")) {
            return o6.a.h(c.o(((BaseBundle)this.a).getInt("firebase_sessions_sessions_restart_timeout"), o6.d.s));
        }
        return null;
    }
    
    public static final class a
    {
    }
}
