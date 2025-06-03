// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F1;

import android.os.BaseBundle;
import O1.r;
import x1.B;
import O1.v;
import org.json.JSONArray;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import java.util.ArrayList;
import android.os.Bundle;
import g6.a;
import V5.i;
import java.util.HashSet;
import V5.h;

public final class c
{
    public static final c a;
    public static boolean b;
    public static final h c;
    public static HashSet d;
    
    static {
        a = new c();
        c = i.a(c$a.o);
    }
    
    public static final void b() {
        if (T1.a.d(c.class)) {
            return;
        }
        try {
            F1.c.b = true;
            F1.c.a.d();
        }
        finally {
            final Throwable t;
            T1.a.b(t, c.class);
        }
    }
    
    public static final void e(final Bundle bundle) {
        if (T1.a.d(c.class)) {
            return;
        }
        while (true) {
            try {
                if (F1.c.b && bundle != null && !((BaseBundle)bundle).isEmpty()) {
                    if (F1.c.d == null) {
                        return;
                    }
                    final ArrayList<String> list = new ArrayList<String>();
                    final Set keySet = ((BaseBundle)bundle).keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "parameters.keySet()");
                    for (final String o : keySet) {
                        final HashSet d = F1.c.d;
                        Intrinsics.b(d);
                        if (!d.contains(o)) {
                            Intrinsics.checkNotNullExpressionValue(o, "param");
                            list.add(o);
                        }
                    }
                    final Iterator<Object> iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        bundle.remove((String)iterator2.next());
                    }
                    ((BaseBundle)bundle).putString("pm", "1");
                }
                return;
                final Throwable t;
                T1.a.b(t, c.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final HashSet a(final JSONArray jsonArray) {
        if (T1.a.d(this)) {
            return null;
        }
        if (jsonArray != null) {
            Label_0091: {
                HashSet<String> set;
                try {
                    if (jsonArray.length() == 0) {
                        return null;
                    }
                    set = new HashSet<String>();
                    final int length = jsonArray.length();
                    if (length > 0) {
                        int n = 0;
                        while (true) {
                            final int n2 = n + 1;
                            final String string = jsonArray.getString(n);
                            Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                            set.add(string);
                            if (n2 >= length) {
                                break;
                            }
                            n = n2;
                        }
                        return set;
                    }
                }
                finally {
                    break Label_0091;
                }
                return set;
            }
            final Throwable t;
            T1.a.b(t, this);
        }
        return null;
    }
    
    public final HashSet c() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return (HashSet)F1.c.c.getValue();
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final void d() {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final v a = v.a;
                final r q = v.q(B.m(), false);
                if (q == null) {
                    return;
                }
                HashSet d;
                if ((d = this.a(q.g())) == null) {
                    d = this.c();
                }
                F1.c.d = d;
                return;
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
}
