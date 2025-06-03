/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package A2;

import com.google.android.gms.common.api.Status;
import y2.f;

public abstract class b {
    public static y2.b a(Status status) {
        if (status.g()) {
            return new f(status);
        }
        return new y2.b(status);
    }
}

