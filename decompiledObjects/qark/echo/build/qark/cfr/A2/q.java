/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  java.lang.Object
 *  java.lang.String
 */
package A2;

import A2.n;
import android.content.Context;
import android.content.res.Resources;
import x2.p;

public class q {
    public final Resources a;
    public final String b;

    public q(Context context) {
        n.i((Object)context);
        context = context.getResources();
        this.a = context;
        this.b = context.getResourcePackageName(p.a);
    }

    public String a(String string2) {
        int n8 = this.a.getIdentifier(string2, "string", this.b);
        if (n8 == 0) {
            return null;
        }
        return this.a.getString(n8);
    }
}

