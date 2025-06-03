/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$OnUnhandledKeyEventListener
 *  androidx.core.view.ViewCompat$OnUnhandledKeyEventListenerCompat
 *  java.lang.Object
 */
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.ViewCompat;

public final class n5
implements View.OnUnhandledKeyEventListener {
    public final ViewCompat.OnUnhandledKeyEventListenerCompat a;

    public /* synthetic */ n5(ViewCompat.OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
        this.a = onUnhandledKeyEventListenerCompat;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return this.a.onUnhandledKeyEvent(view, keyEvent);
    }
}

