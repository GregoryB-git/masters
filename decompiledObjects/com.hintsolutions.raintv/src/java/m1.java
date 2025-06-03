/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider
 *  com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate
 *  java.lang.Object
 *  java.lang.Override
 */
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.hintsolutions.raintv.video.ExoVideoView;

public final class m1
implements OnCompletionListener,
ContentProgressProvider {
    public final ExoVideoView a;

    public /* synthetic */ m1(ExoVideoView exoVideoView) {
        this.a = exoVideoView;
    }

    public final VideoProgressUpdate getContentProgress() {
        return ExoVideoView.f(this.a);
    }

    @Override
    public final void onCompletion() {
        ExoVideoView.d(this.a);
    }
}

