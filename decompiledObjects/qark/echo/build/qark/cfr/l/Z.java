/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package l;

import android.os.Build;
import android.view.View;
import l.Y;
import l.a0;

public abstract class Z {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Y.a(view, charSequence);
            return;
        }
        a0.f(view, charSequence);
    }
}

