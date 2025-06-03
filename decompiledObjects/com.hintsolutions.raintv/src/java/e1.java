/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  androidx.core.view.DragStartHelper
 *  java.lang.Object
 */
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.DragStartHelper;

public final class e1
implements View.OnTouchListener {
    public final DragStartHelper a;

    public /* synthetic */ e1(DragStartHelper dragStartHelper) {
        this.a = dragStartHelper;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.onTouch(view, motionEvent);
    }
}

