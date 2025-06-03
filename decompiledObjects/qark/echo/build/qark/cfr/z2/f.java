/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 */
package z2;

import A2.n;
import android.app.Activity;
import androidx.fragment.app.e;

public class f {
    public final Object a;

    public f(Activity activity) {
        n.j((Object)activity, "Activity must not be null");
        this.a = activity;
    }

    public final Activity a() {
        return (Activity)this.a;
    }

    public final e b() {
        return (e)this.a;
    }

    public final boolean c() {
        return this.a instanceof Activity;
    }

    public final boolean d() {
        return this.a instanceof e;
    }
}

