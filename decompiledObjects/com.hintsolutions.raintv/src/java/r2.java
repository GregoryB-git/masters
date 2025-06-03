/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  ru.tvrain.core.data.Live
 *  rx.functions.Action1
 */
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.hintsolutions.raintv.video.LiveActivity;
import ru.tvrain.core.data.Live;
import rx.functions.Action1;

public final class r2
implements Action1,
OnPreparedListener,
OnCompletionListener {
    public final int a;
    public final LiveActivity b;

    public /* synthetic */ r2(LiveActivity liveActivity, int n4) {
        this.a = n4;
        this.b = liveActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                LiveActivity.F(this.b, (Throwable)object);
                return;
            }
            case 0: {
                LiveActivity.K(this.b, (Live)object);
                return;
            }
        }
        LiveActivity.H(this.b, (Live)object);
    }

    @Override
    public final void onCompletion() {
        LiveActivity.L(this.b);
    }

    @Override
    public final void onPrepared() {
        LiveActivity.J(this.b);
    }
}

