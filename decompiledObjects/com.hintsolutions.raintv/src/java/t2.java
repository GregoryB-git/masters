/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.hintsolutions.raintv.video.LocalVideoActivity;

public final class t2
implements OnPreparedListener,
OnCompletionListener {
    public final LocalVideoActivity a;

    public /* synthetic */ t2(LocalVideoActivity localVideoActivity) {
        this.a = localVideoActivity;
    }

    @Override
    public final void onCompletion() {
        LocalVideoActivity.J(this.a);
    }

    @Override
    public final void onPrepared() {
        LocalVideoActivity.H(this.a);
    }
}

