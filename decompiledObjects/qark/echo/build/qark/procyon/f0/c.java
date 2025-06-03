// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f0;

import android.os.BaseBundle;
import g0.a;
import android.text.Spannable;
import android.os.Bundle;
import java.util.ArrayList;
import android.text.Spanned;
import g0.M;

public abstract class c
{
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    
    static {
        a = M.w0(0);
        b = M.w0(1);
        c = M.w0(2);
        d = M.w0(3);
        e = M.w0(4);
    }
    
    public static ArrayList a(final Spanned spanned) {
        final ArrayList<Bundle> list = new ArrayList<Bundle>();
        final int length = ((CharSequence)spanned).length();
        final int n = 0;
        final e[] array = (e[])spanned.getSpans(0, length, (Class)e.class);
        for (int length2 = array.length, i = 0; i < length2; ++i) {
            final e e = array[i];
            list.add(b(spanned, e, 1, e.b()));
        }
        final g[] array2 = (g[])spanned.getSpans(0, ((CharSequence)spanned).length(), (Class)g.class);
        for (int length3 = array2.length, j = 0; j < length3; ++j) {
            final g g = array2[j];
            list.add(b(spanned, g, 2, g.b()));
        }
        final d[] array3 = (d[])spanned.getSpans(0, ((CharSequence)spanned).length(), (Class)d.class);
        for (int length4 = array3.length, k = n; k < length4; ++k) {
            list.add(b(spanned, array3[k], 3, null));
        }
        return list;
    }
    
    public static Bundle b(final Spanned spanned, final Object o, final int n, final Bundle bundle) {
        final Bundle bundle2 = new Bundle();
        ((BaseBundle)bundle2).putInt(f0.c.a, spanned.getSpanStart(o));
        ((BaseBundle)bundle2).putInt(f0.c.b, spanned.getSpanEnd(o));
        ((BaseBundle)bundle2).putInt(f0.c.c, spanned.getSpanFlags(o));
        ((BaseBundle)bundle2).putInt(f0.c.d, n);
        if (bundle != null) {
            bundle2.putBundle(f0.c.e, bundle);
        }
        return bundle2;
    }
    
    public static void c(Bundle bundle, final Spannable spannable) {
        final int int1 = ((BaseBundle)bundle).getInt(f0.c.a);
        final int int2 = ((BaseBundle)bundle).getInt(f0.c.b);
        final int int3 = ((BaseBundle)bundle).getInt(f0.c.c);
        final int int4 = ((BaseBundle)bundle).getInt(f0.c.d, -1);
        bundle = bundle.getBundle(f0.c.e);
        Object o;
        if (int4 != 1) {
            if (int4 != 2) {
                if (int4 != 3) {
                    return;
                }
                o = new d();
            }
            else {
                o = g.a((Bundle)g0.a.e(bundle));
            }
        }
        else {
            o = f0.e.a((Bundle)g0.a.e(bundle));
        }
        spannable.setSpan(o, int1, int2, int3);
    }
}
