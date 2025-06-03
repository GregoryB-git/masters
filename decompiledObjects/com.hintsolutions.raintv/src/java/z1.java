/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaDrm
 *  android.media.MediaDrm$OnEventListener
 *  com.google.android.exoplayer2.drm.ExoMediaDrm$OnEventListener
 *  com.google.android.exoplayer2.drm.FrameworkMediaDrm
 *  java.lang.Object
 */
import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.FrameworkMediaDrm;

public final class z1
implements MediaDrm.OnEventListener {
    public final FrameworkMediaDrm a;
    public final ExoMediaDrm.OnEventListener b;

    public /* synthetic */ z1(FrameworkMediaDrm frameworkMediaDrm, ExoMediaDrm.OnEventListener onEventListener) {
        this.a = frameworkMediaDrm;
        this.b = onEventListener;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] byArray, int n, int n2, byte[] byArray2) {
        FrameworkMediaDrm.a((FrameworkMediaDrm)this.a, (ExoMediaDrm.OnEventListener)this.b, (MediaDrm)mediaDrm, (byte[])byArray, (int)n, (int)n2, (byte[])byArray2);
    }
}

