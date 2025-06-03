// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I1;

import android.os.BaseBundle;
import O1.r;
import O1.v;
import java.util.Iterator;
import O1.P;
import java.util.Collection;
import W5.m;
import org.json.JSONArray;
import kotlin.jvm.internal.Intrinsics;
import T1.a;
import android.os.Bundle;
import java.util.List;

public final class d
{
    public static final d a;
    public static final String b;
    
    static {
        a = new d();
        b = e.class.getSimpleName();
    }
    
    public static final Bundle a(final e.a a, final String s, final List list) {
        if (a.d(d.class)) {
            return null;
        }
        Label_0096: {
            Bundle bundle;
            try {
                Intrinsics.checkNotNullParameter(a, "eventType");
                Intrinsics.checkNotNullParameter(s, "applicationId");
                Intrinsics.checkNotNullParameter(list, "appEvents");
                bundle = new Bundle();
                ((BaseBundle)bundle).putString("event", a.toString());
                ((BaseBundle)bundle).putString("app_id", s);
                if (e.a.q == a) {
                    final JSONArray b = d.a.b(list, s);
                    if (b.length() == 0) {
                        return null;
                    }
                    ((BaseBundle)bundle).putString("custom_events", b.toString());
                    return bundle;
                }
            }
            finally {
                break Label_0096;
            }
            return bundle;
        }
        final Throwable t;
        a.b(t, d.class);
        return null;
    }
    
    public final JSONArray b(List i, final String s) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            try {
                final JSONArray jsonArray = new JSONArray();
                i = m.I(i);
                D1.a.d(i);
                final boolean c = this.c(s);
                for (final y1.e e : i) {
                    if (e.g()) {
                        if (!(e.h() ^ true) && (!e.h() || !c)) {
                            continue;
                        }
                        jsonArray.put((Object)e.e());
                    }
                    else {
                        final P a = P.a;
                        P.j0(d.b, Intrinsics.i("Event with invalid checksum: ", e));
                    }
                }
                return jsonArray;
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean c(final String s) {
        if (T1.a.d(this)) {
            return false;
        }
        Label_0032: {
            try {
                final r q = v.q(s, false);
                if (q != null) {
                    return q.n();
                }
            }
            finally {
                break Label_0032;
            }
            return false;
        }
        final Throwable t;
        T1.a.b(t, this);
        return false;
    }
}
