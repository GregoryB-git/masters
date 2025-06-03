// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class e
{
    public static AtomicBoolean a;
    
    static {
        e.a = new AtomicBoolean(false);
    }
    
    public static void a(final Context context) {
        if (e.a.getAndSet(true)) {
            return;
        }
        ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new a());
    }
    
    public static class a extends b
    {
        @Override
        public void onActivityCreated(final Activity activity, final Bundle bundle) {
            q.g(activity);
        }
        
        @Override
        public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        }
        
        @Override
        public void onActivityStopped(final Activity activity) {
        }
    }
}
