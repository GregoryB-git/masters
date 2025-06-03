/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.os.Bundle
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package E1;

import E1.a;
import E1.f;
import O1.n;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import x1.B;

public final class k {
    public static final k a = new k();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static final void a() {
        if (T1.a.d(k.class)) {
            return;
        }
        try {
            b.set(true);
            k.b();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, k.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b() {
        if (T1.a.d(k.class)) {
            return;
        }
        try {
            if (b.get()) {
                if (a.c()) {
                    Object object = n.a;
                    if (n.g(n.b.H)) {
                        object = f.a;
                        f.d(B.l());
                        return;
                    }
                }
                a.g();
            }
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, k.class);
    }

    public final boolean c() {
        Object object;
        boolean bl;
        block6 : {
            boolean bl2 = T1.a.d(this);
            bl = false;
            if (bl2) {
                return false;
            }
            object = B.l();
            object = object.getPackageManager().getApplicationInfo(object.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(object, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            object = object.metaData.getString("com.google.android.play.billingclient.version");
            if (object != null) break block6;
            return false;
        }
        try {
            int n8 = Integer.parseInt((String)((String)i.V((CharSequence)object, new String[]{"."}, false, 3, 2, null).get(0)));
            if (n8 >= 2) {
                bl = true;
            }
            return bl;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return false;
        }
        catch (Exception exception) {
            return false;
        }
    }
}

