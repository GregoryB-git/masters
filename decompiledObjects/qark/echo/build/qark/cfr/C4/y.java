/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 */
package C4;

import V2.g;
import com.google.firebase.perf.config.RemoteConfigManager;

public final class y
implements g {
    public final /* synthetic */ RemoteConfigManager a;

    public /* synthetic */ y(RemoteConfigManager remoteConfigManager) {
        this.a = remoteConfigManager;
    }

    @Override
    public final void a(Object object) {
        RemoteConfigManager.b(this.a, (Boolean)object);
    }
}

