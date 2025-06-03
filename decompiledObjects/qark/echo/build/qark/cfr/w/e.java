/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.Window
 *  android.view.Window$Callback
 */
package w;

import I.f;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.q;

public abstract class e
extends Activity
implements h,
f.a {
    public t.h o = new t.h();
    public i p;

    public e() {
        this.p = new i(this);
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View view = this.getWindow().getDecorView();
        if (view != null && f.d(view, keyEvent)) {
            return true;
        }
        return f.e(this, view, (Window.Callback)this, keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View view = this.getWindow().getDecorView();
        if (view != null && f.d(view, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q.g(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.p.j(d.c.q);
        super.onSaveInstanceState(bundle);
    }
}

