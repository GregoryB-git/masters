/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.concurrent.Callable
 */
package R2;

import R2.I2;
import R2.p;
import R2.x2;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class z2
implements Callable {
    public /* synthetic */ x2 o;
    public /* synthetic */ String p;

    public /* synthetic */ z2(x2 x22, String string2) {
        this.o = x22;
        this.p = string2;
    }

    public final Object call() {
        Object object = this.o;
        String string2 = this.p;
        object = object.q().D0(string2);
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"platform", (Object)"android");
        hashMap.put((Object)"package_name", (Object)string2);
        hashMap.put((Object)"gmp_version", (Object)82001L);
        if (object != null) {
            string2 = object.h();
            if (string2 != null) {
                hashMap.put((Object)"app_version", (Object)string2);
            }
            hashMap.put((Object)"app_version_int", (Object)object.z());
            hashMap.put((Object)"dynamite_version", (Object)object.c0());
        }
        return hashMap;
    }
}

