/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent$Callback
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.hintsolutions.raintv.video.ExoVideoView
 *  com.hintsolutions.raintv.video.LocalVideoActivity
 *  com.hintsolutions.raintv.video.PlaylistActivity
 *  com.hintsolutions.raintv.video.VideoActivity
 *  com.hintsolutions.raintv.video.VideoStreamActivity
 *  java.lang.Object
 */
import android.view.KeyEvent;
import android.view.View;
import com.hintsolutions.raintv.video.ExoVideoView;
import com.hintsolutions.raintv.video.LocalVideoActivity;
import com.hintsolutions.raintv.video.PlaylistActivity;
import com.hintsolutions.raintv.video.VideoActivity;
import com.hintsolutions.raintv.video.VideoStreamActivity;

public final class o1
implements View.OnClickListener {
    public final int a;
    public final KeyEvent.Callback b;

    public /* synthetic */ o1(KeyEvent.Callback callback, int n) {
        this.a = n;
        this.b = callback;
    }

    public final void onClick(View view) {
        switch (this.a) {
            default: {
                break;
            }
            case 3: {
                VideoActivity.N((VideoActivity)((VideoActivity)this.b), (View)view);
                return;
            }
            case 2: {
                PlaylistActivity.L((PlaylistActivity)((PlaylistActivity)this.b), (View)view);
                return;
            }
            case 1: {
                LocalVideoActivity.G((LocalVideoActivity)((LocalVideoActivity)this.b), (View)view);
                return;
            }
            case 0: {
                ExoVideoView.c((ExoVideoView)((ExoVideoView)this.b), (View)view);
                return;
            }
        }
        VideoStreamActivity.D((VideoStreamActivity)((VideoStreamActivity)this.b), (View)view);
    }
}

