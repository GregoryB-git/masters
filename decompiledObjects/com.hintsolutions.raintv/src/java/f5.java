/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  rx.functions.Action1
 */
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.hintsolutions.raintv.video.VideoActivity;
import java.util.ArrayList;
import rx.functions.Action1;

public final class f5
implements OnPreparedListener,
OnCompletionListener,
Action1 {
    public final int a;
    public final VideoActivity b;

    public /* synthetic */ f5(VideoActivity videoActivity, int n4) {
        this.a = n4;
        this.b = videoActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 2: {
                VideoActivity.G(this.b, (ArrayList)object);
                return;
            }
        }
        VideoActivity.F(this.b, (Throwable)object);
    }

    @Override
    public final void onCompletion() {
        VideoActivity.J(this.b);
    }

    @Override
    public final void onPrepared() {
        VideoActivity.M(this.b);
    }
}

