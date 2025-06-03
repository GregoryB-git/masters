/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 *  java.util.List
 *  rx.functions.Action1
 */
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.hintsolutions.raintv.video.PlaylistActivity;
import java.util.List;
import rx.functions.Action1;

public final class s3
implements Action1,
OnPreparedListener,
OnCompletionListener {
    public final int a;
    public final PlaylistActivity b;

    public /* synthetic */ s3(PlaylistActivity playlistActivity, int n4) {
        this.a = n4;
        this.b = playlistActivity;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 1: {
                PlaylistActivity.G(this.b, (List)object);
                return;
            }
            case 0: {
                PlaylistActivity.K(this.b, (Long)object);
                return;
            }
        }
        PlaylistActivity.J(this.b, (Throwable)object);
    }

    @Override
    public final void onCompletion() {
        PlaylistActivity.I(this.b);
    }

    @Override
    public final void onPrepared() {
        PlaylistActivity.H(this.b);
    }
}

