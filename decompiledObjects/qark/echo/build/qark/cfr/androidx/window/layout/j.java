/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package androidx.window.layout;

import android.content.Context;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowInfoTrackerDecorator;

public abstract class j {
    static {
        WindowInfoTracker.Companion companion = WindowInfoTracker.Companion;
    }

    public static WindowInfoTracker a(Context context) {
        return WindowInfoTracker.Companion.getOrCreate(context);
    }

    public static void b(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        WindowInfoTracker.Companion.overrideDecorator(windowInfoTrackerDecorator);
    }

    public static void c() {
        WindowInfoTracker.Companion.reset();
    }
}

