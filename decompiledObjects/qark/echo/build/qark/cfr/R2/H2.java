/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import A2.n;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import x2.p;

public final class H2 {
    public final Resources a;
    public final String b;

    public H2(Context context, String string2) {
        n.i((Object)context);
        this.a = context.getResources();
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            this.b = string2;
            return;
        }
        this.b = H2.a(context);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(p.a);
        }
        catch (Resources.NotFoundException notFoundException) {
            return context.getPackageName();
        }
    }

    public final String b(String string2) {
        int n8 = this.a.getIdentifier(string2, "string", this.b);
        if (n8 == 0) {
            return null;
        }
        try {
            string2 = this.a.getString(n8);
            return string2;
        }
        catch (Resources.NotFoundException notFoundException) {
            return null;
        }
    }
}

