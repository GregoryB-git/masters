// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S5;

import android.app.Activity;
import android.util.Log;
import B5.c;
import A5.a;

public final class j implements a, B5.a
{
    public i a;
    
    @Override
    public void onAttachedToActivity(final c c) {
        final i a = this.a;
        if (a == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
            return;
        }
        a.l(c.c());
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.a = new i(b.a());
        g.g(b.b(), this.a);
    }
    
    @Override
    public void onDetachedFromActivity() {
        final i a = this.a;
        if (a == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
            return;
        }
        a.l(null);
    }
    
    @Override
    public void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        if (this.a == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        g.g(b.b(), null);
        this.a = null;
    }
    
    @Override
    public void onReattachedToActivityForConfigChanges(final c c) {
        this.onAttachedToActivity(c);
    }
}
