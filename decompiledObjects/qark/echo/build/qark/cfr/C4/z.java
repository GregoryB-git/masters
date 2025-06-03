/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 */
package C4;

import V2.f;
import com.google.firebase.perf.config.RemoteConfigManager;

public final class z
implements f {
    public final /* synthetic */ RemoteConfigManager a;

    public /* synthetic */ z(RemoteConfigManager remoteConfigManager) {
        this.a = remoteConfigManager;
    }

    @Override
    public final void d(Exception exception) {
        RemoteConfigManager.a(this.a, exception);
    }
}

