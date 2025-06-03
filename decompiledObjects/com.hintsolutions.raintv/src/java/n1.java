/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  com.hintsolutions.raintv.video.ExoVideoView
 *  java.lang.Object
 */
import android.view.MotionEvent;
import android.view.View;
import com.hintsolutions.raintv.video.ExoVideoView;

public final class n1
implements View.OnTouchListener {
    public final ExoVideoView a;

    public /* synthetic */ n1(ExoVideoView exoVideoView) {
        this.a = exoVideoView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return ExoVideoView.b((ExoVideoView)this.a, (View)view, (MotionEvent)motionEvent);
    }
}

