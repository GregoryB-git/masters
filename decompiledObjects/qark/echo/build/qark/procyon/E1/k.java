// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E1;

import android.os.BaseBundle;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import kotlin.text.i;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import O1.n;
import T1.a;
import java.util.concurrent.atomic.AtomicBoolean;

public final class k
{
    public static final k a;
    public static final AtomicBoolean b;
    
    static {
        a = new k();
        b = new AtomicBoolean(false);
    }
    
    public static final void a() {
        if (T1.a.d(k.class)) {
            return;
        }
        try {
            k.b.set(true);
            b();
        }
        finally {
            final Throwable t;
            T1.a.b(t, k.class);
        }
    }
    
    public static final void b() {
        if (T1.a.d(k.class)) {
            return;
        }
        while (true) {
            try {
                if (k.b.get()) {
                    if (k.a.c()) {
                        final n a = n.a;
                        if (n.g(n.b.H)) {
                            final f a2 = f.a;
                            f.d(B.l());
                            return;
                        }
                    }
                    E1.a.g();
                }
                return;
                final Throwable t;
                T1.a.b(t, k.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean c() {
        final boolean d = T1.a.d(this);
        boolean b = false;
        if (d) {
            return false;
        }
        try {
            final Context l = B.l();
            final ApplicationInfo applicationInfo = l.getPackageManager().getApplicationInfo(l.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            final String string = ((BaseBundle)applicationInfo.metaData).getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return false;
            }
            if (Integer.parseInt((String)i.V(string, new String[] { "." }, false, 3, 2, null).get(0)) >= 2) {
                b = true;
            }
            return b;
        }
        catch (Exception ex) {
            return false;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return false;
        }
    }
}
