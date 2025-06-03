/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package u5;

import H.a;
import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import java.util.concurrent.Executor;

public class Q {
    public final WindowInfoTrackerCallbackAdapter a;

    public Q(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.a = windowInfoTrackerCallbackAdapter;
    }

    public void a(Activity activity, Executor executor, a a8) {
        this.a.addWindowLayoutInfoListener(activity, executor, a8);
    }

    public void b(a a8) {
        this.a.removeWindowLayoutInfoListener(a8);
    }
}

