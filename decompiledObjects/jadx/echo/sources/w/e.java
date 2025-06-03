package w;

import I.AbstractC0409f;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.d;
import androidx.lifecycle.q;

/* loaded from: classes.dex */
public abstract class e extends Activity implements androidx.lifecycle.h, AbstractC0409f.a {

    /* renamed from: o, reason: collision with root package name */
    public t.h f20201o = new t.h();

    /* renamed from: p, reason: collision with root package name */
    public androidx.lifecycle.i f20202p = new androidx.lifecycle.i(this);

    @Override // I.AbstractC0409f.a
    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC0409f.d(decorView, keyEvent)) {
            return AbstractC0409f.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC0409f.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q.g(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f20202p.j(d.c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
