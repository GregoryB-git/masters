// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import H.a;
import java.util.concurrent.Executor;
import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;

public class Q
{
    public final WindowInfoTrackerCallbackAdapter a;
    
    public Q(final WindowInfoTrackerCallbackAdapter a) {
        this.a = a;
    }
    
    public void a(final Activity activity, final Executor executor, final a a) {
        this.a.addWindowLayoutInfoListener(activity, executor, a);
    }
    
    public void b(final a a) {
        this.a.removeWindowLayoutInfoListener(a);
    }
}
