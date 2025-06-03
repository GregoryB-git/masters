/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.source.dash.DashMediaSource
 *  java.lang.Object
 *  java.lang.Runnable
 */
import com.google.android.exoplayer2.source.dash.DashMediaSource;

public final class v0
implements Runnable {
    public final int a;
    public final DashMediaSource b;

    public /* synthetic */ v0(DashMediaSource dashMediaSource, int n) {
        this.a = n;
        this.b = dashMediaSource;
    }

    public final void run() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                DashMediaSource.a((DashMediaSource)this.b);
                return;
            }
        }
        DashMediaSource.b((DashMediaSource)this.b);
    }
}

