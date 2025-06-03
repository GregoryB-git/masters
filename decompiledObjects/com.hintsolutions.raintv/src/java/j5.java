/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  rx.functions.Action1
 */
import com.hintsolutions.raintv.video.VideoStreamActivity;
import rx.functions.Action1;

public final class j5
implements Action1 {
    public final int a;
    public final VideoStreamActivity b;

    public /* synthetic */ j5(VideoStreamActivity videoStreamActivity, int n4) {
        this.a = n4;
        this.b = videoStreamActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                VideoStreamActivity.E(this.b, (Long)object);
                return;
            }
        }
        VideoStreamActivity.C(this.b, (Long)object);
    }
}

