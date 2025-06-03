// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.content.Intent;
import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public interface g
{
    void a(final String p0, final LifecycleCallback p1);
    
    LifecycleCallback b(final String p0, final Class p1);
    
    Activity c();
    
    void startActivityForResult(final Intent p0, final int p1);
}
