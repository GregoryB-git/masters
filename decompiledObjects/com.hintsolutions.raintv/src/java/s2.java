/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.hintsolutions.raintv.video.LiveActivity
 *  com.hintsolutions.raintv.video.LocalVideoActivity
 *  com.hintsolutions.raintv.video.PlaylistActivity
 *  com.hintsolutions.raintv.video.VideoActivity
 *  com.hintsolutions.raintv.video.VideoStreamActivity
 *  java.lang.Object
 *  java.util.concurrent.Callable
 */
import com.hintsolutions.raintv.video.LiveActivity;
import com.hintsolutions.raintv.video.LocalVideoActivity;
import com.hintsolutions.raintv.video.PlaylistActivity;
import com.hintsolutions.raintv.video.VideoActivity;
import com.hintsolutions.raintv.video.VideoStreamActivity;
import java.util.concurrent.Callable;

public final class s2
implements Callable {
    public final int a;
    public final VideoStreamActivity b;

    public /* synthetic */ s2(VideoStreamActivity videoStreamActivity, int n) {
        this.a = n;
        this.b = videoStreamActivity;
    }

    public final Object call() {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                return PlaylistActivity.F((PlaylistActivity)((PlaylistActivity)this.b));
            }
            case 1: {
                return LocalVideoActivity.F((LocalVideoActivity)((LocalVideoActivity)this.b));
            }
            case 0: {
                return LiveActivity.I((LiveActivity)((LiveActivity)this.b));
            }
        }
        return VideoActivity.K((VideoActivity)((VideoActivity)this.b));
    }
}

