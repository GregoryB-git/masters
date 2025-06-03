/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaDrm
 *  android.media.MediaDrm$OnEventListener
 *  java.lang.Object
 */
package p0;

import android.media.MediaDrm;
import p0.F;
import p0.N;

public final class I
implements MediaDrm.OnEventListener {
    public final /* synthetic */ N a;
    public final /* synthetic */ F.b b;

    public /* synthetic */ I(N n8, F.b b8) {
        this.a = n8;
        this.b = b8;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] arrby, int n8, int n9, byte[] arrby2) {
        N.o(this.a, this.b, mediaDrm, arrby, n8, n9, arrby2);
    }
}

