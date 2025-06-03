/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package A2;

import A2.c;
import android.util.Log;
import java.util.ArrayList;

public abstract class V {
    public Object a;
    public boolean b;
    public final /* synthetic */ c c;

    public V(c c8, Object object) {
        this.c = c8;
        this.a = object;
        this.b = false;
    }

    public abstract void a(Object var1);

    public abstract void b();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c() {
        block8 : {
            // MONITORENTER : this
            Object object = this.a;
            if (this.b) {
                String string2 = this.toString();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Callback proxy ");
                stringBuilder.append(string2);
                stringBuilder.append(" being reused. This is not safe.");
                Log.w((String)"GmsClient", (String)stringBuilder.toString());
            }
            // MONITOREXIT : this
            if (object == null) break block8;
            this.a(object);
        }
        // MONITORENTER : this
        this.b = true;
        // MONITOREXIT : this
        this.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        synchronized (this) {
            this.a = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        this.d();
        ArrayList arrayList = c.Y(this.c);
        synchronized (arrayList) {
            c.Y(this.c).remove((Object)this);
            return;
        }
    }
}

