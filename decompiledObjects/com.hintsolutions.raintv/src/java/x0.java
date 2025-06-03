/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.upstream.BandwidthMeter$EventListener
 *  com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
 *  com.google.android.exoplayer2.util.EventDispatcher$Event
 *  java.lang.Object
 */
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.util.EventDispatcher;

public final class x0
implements EventDispatcher.Event {
    public final int a;
    public final long b;
    public final long c;

    public /* synthetic */ x0(int n, long l, long l2) {
        this.a = n;
        this.b = l;
        this.c = l2;
    }

    public final void sendTo(Object object) {
        DefaultBandwidthMeter.a((int)this.a, (long)this.b, (long)this.c, (BandwidthMeter.EventListener)((BandwidthMeter.EventListener)object));
    }
}

