// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.os.Build$VERSION;
import android.view.View;

public abstract class Z
{
    public static void a(final View view, final CharSequence charSequence) {
        if (Build$VERSION.SDK_INT >= 26) {
            Y.a(view, charSequence);
            return;
        }
        a0.f(view, charSequence);
    }
}
