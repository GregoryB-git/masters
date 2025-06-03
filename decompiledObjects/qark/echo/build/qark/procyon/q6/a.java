// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q6;

import kotlin.jvm.internal.g;
import android.os.Looper;
import p6.B0;
import java.util.List;
import u6.t;

public final class a implements t
{
    @Override
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
    
    @Override
    public B0 b(final List list) {
        final Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
    
    @Override
    public int c() {
        return 1073741823;
    }
}
