// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import y2.f;
import com.google.android.gms.common.api.Status;

public abstract class b
{
    public static y2.b a(final Status status) {
        if (status.g()) {
            return new f(status);
        }
        return new y2.b(status);
    }
}
