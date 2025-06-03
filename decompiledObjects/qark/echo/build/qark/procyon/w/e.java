// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w;

import androidx.lifecycle.d;
import androidx.lifecycle.q;
import android.os.Bundle;
import android.view.View;
import android.view.Window$Callback;
import android.view.KeyEvent;
import androidx.lifecycle.i;
import I.f;
import androidx.lifecycle.h;
import android.app.Activity;

public abstract class e extends Activity implements h, a
{
    public t.h o;
    public i p;
    
    public e() {
        this.o = new t.h();
        this.p = new i(this);
    }
    
    public boolean b(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        return (decorView != null && f.d(decorView, keyEvent)) || f.e((f.a)this, decorView, (Window$Callback)this, keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        return (decorView != null && f.d(decorView, keyEvent)) || super.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        q.g(this);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        this.p.j(androidx.lifecycle.d.c.q);
        super.onSaveInstanceState(bundle);
    }
}
