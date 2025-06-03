/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.Spannable
 *  android.text.Spanned
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package f0;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import f0.d;
import f0.e;
import f0.g;
import g0.M;
import g0.a;
import java.util.ArrayList;

public abstract class c {
    public static final String a = M.w0(0);
    public static final String b = M.w0(1);
    public static final String c = M.w0(2);
    public static final String d = M.w0(3);
    public static final String e = M.w0(4);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        int n8 = spanned.length();
        int n9 = 0;
        for (e e8 : (e[])spanned.getSpans(0, n8, e.class)) {
            arrayList.add((Object)c.b(spanned, e8, 1, e8.b()));
        }
        for (e e8 : (g[])spanned.getSpans(0, spanned.length(), g.class)) {
            arrayList.add((Object)c.b(spanned, e8, 2, e8.b()));
        }
        e[] arre = (d[])spanned.getSpans(0, spanned.length(), d.class);
        int n10 = arre.length;
        for (n8 = n9; n8 < n10; ++n8) {
            arrayList.add((Object)c.b(spanned, arre[n8], 3, null));
        }
        return arrayList;
    }

    public static Bundle b(Spanned spanned, Object object, int n8, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a, spanned.getSpanStart(object));
        bundle2.putInt(b, spanned.getSpanEnd(object));
        bundle2.putInt(c, spanned.getSpanFlags(object));
        bundle2.putInt(d, n8);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void c(Bundle object, Spannable spannable) {
        int n8 = object.getInt(a);
        int n9 = object.getInt(b);
        int n10 = object.getInt(c);
        int n11 = object.getInt(d, -1);
        object = object.getBundle(e);
        if (n11 != 1) {
            if (n11 != 2) {
                if (n11 != 3) {
                    return;
                }
                object = new d();
            } else {
                object = g.a((Bundle)a.e(object));
            }
        } else {
            object = e.a((Bundle)a.e(object));
        }
        spannable.setSpan(object, n8, n9, n10);
    }
}

