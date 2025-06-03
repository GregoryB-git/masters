/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.AudioRouting
 *  android.media.AudioRouting$OnRoutingChangedListener
 *  java.lang.Object
 */
package m0;

import android.media.AudioRouting;
import m0.N;

public final class W
implements AudioRouting.OnRoutingChangedListener {
    public final /* synthetic */ N.k a;

    public /* synthetic */ W(N.k k8) {
        this.a = k8;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        N.k.a(this.a, audioRouting);
    }
}

