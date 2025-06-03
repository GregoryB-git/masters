/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 */
package S5;

import A5.a;
import E5.c;
import S5.g;
import S5.i;
import android.app.Activity;
import android.content.Context;
import android.util.Log;

public final class j
implements a,
B5.a {
    public i a;

    @Override
    public void onAttachedToActivity(B5.c c8) {
        i i8 = this.a;
        if (i8 == null) {
            Log.wtf((String)"UrlLauncherPlugin", (String)"urlLauncher was never set.");
            return;
        }
        i8.l(c8.c());
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.a = new i(b8.a());
        g.g(b8.b(), this.a);
    }

    @Override
    public void onDetachedFromActivity() {
        i i8 = this.a;
        if (i8 == null) {
            Log.wtf((String)"UrlLauncherPlugin", (String)"urlLauncher was never set.");
            return;
        }
        i8.l(null);
    }

    @Override
    public void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        if (this.a == null) {
            Log.wtf((String)"UrlLauncherPlugin", (String)"Already detached from the engine.");
            return;
        }
        g.g(b8.b(), null);
        this.a = null;
    }

    @Override
    public void onReattachedToActivityForConfigChanges(B5.c c8) {
        this.onAttachedToActivity(c8);
    }
}

