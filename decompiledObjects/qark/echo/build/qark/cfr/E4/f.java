/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package E4;

import E4.a;
import com.google.firebase.perf.config.RemoteConfigManager;
import q5.b;

public final class f
implements U5.a {
    public final a a;

    public f(a a8) {
        this.a = a8;
    }

    public static f a(a a8) {
        return new f(a8);
    }

    public static RemoteConfigManager c(a a8) {
        return (RemoteConfigManager)b.c(a8.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public RemoteConfigManager b() {
        return f.c(this.a);
    }
}

