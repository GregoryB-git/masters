// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T5;

import m.b;
import android.os.Build$VERSION;
import android.os.Handler;
import android.os.Looper;

public abstract class a
{
    public static Handler a(final Looper looper) {
        if (Build$VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        return new Handler(looper);
    }
}
