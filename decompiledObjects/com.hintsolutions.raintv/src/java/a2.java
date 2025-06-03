/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaDrm
 *  android.media.MediaDrm$OnKeyStatusChangeListener
 *  com.google.android.exoplayer2.drm.ExoMediaDrm$OnKeyStatusChangeListener
 *  com.google.android.exoplayer2.drm.FrameworkMediaDrm
 *  java.lang.Object
 *  java.util.List
 */
import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.FrameworkMediaDrm;
import java.util.List;

public final class a2
implements MediaDrm.OnKeyStatusChangeListener {
    public final FrameworkMediaDrm a;
    public final ExoMediaDrm.OnKeyStatusChangeListener b;

    public /* synthetic */ a2(FrameworkMediaDrm frameworkMediaDrm, ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener) {
        this.a = frameworkMediaDrm;
        this.b = onKeyStatusChangeListener;
    }

    public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] byArray, List list, boolean bl) {
        FrameworkMediaDrm.b((FrameworkMediaDrm)this.a, (ExoMediaDrm.OnKeyStatusChangeListener)this.b, (MediaDrm)mediaDrm, (byte[])byArray, (List)list, (boolean)bl);
    }
}

