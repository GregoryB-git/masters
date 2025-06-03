// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import E2.e;
import android.content.Context;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Set;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.p2;
import java.util.concurrent.Callable;
import com.google.android.gms.internal.measurement.q2;
import com.google.android.gms.internal.measurement.K4;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.J1;
import java.util.HashSet;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.I1;
import java.util.Iterator;
import com.google.android.gms.internal.measurement.O1;
import com.google.android.gms.internal.measurement.L1;
import A2.n;
import com.google.android.gms.internal.measurement.C;
import t.a;
import com.google.android.gms.internal.measurement.T7;
import t.g;
import java.util.Map;

public final class x2 extends C5 implements i
{
    public final Map d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final Map i;
    public final g j;
    public final T7 k;
    public final Map l;
    public final Map m;
    public final Map n;
    
    public x2(final D5 d5) {
        super(d5);
        this.d = new a();
        this.e = new a();
        this.f = new a();
        this.g = new a();
        this.h = new a();
        this.l = new a();
        this.m = new a();
        this.n = new a();
        this.i = new a();
        this.j = new D2(this, 20);
        this.k = new C2(this);
    }
    
    public static Map E(final L1 l1) {
        final a a = new a();
        if (l1 != null) {
            for (final O1 o1 : l1.X()) {
                a.put(o1.H(), o1.I());
            }
        }
        return a;
    }
    
    public static q3.a z(final I1.e e) {
        final int n = E2.b[e.ordinal()];
        if (n == 1) {
            return q3.a.p;
        }
        if (n == 2) {
            return q3.a.q;
        }
        if (n == 3) {
            return q3.a.r;
        }
        if (n != 4) {
            return null;
        }
        return q3.a.s;
    }
    
    public final q3.a A(final String s, final q3.a a) {
        this.n();
        this.g0(s);
        final I1 j = this.J(s);
        if (j == null) {
            return null;
        }
        for (final I1.c c : j.K()) {
            if (a == z(c.I())) {
                return z(c.H());
            }
        }
        return null;
    }
    
    public final L1 C(final String s, final byte[] array) {
        if (array == null) {
            return L1.P();
        }
        while (true) {
            while (true) {
                Label_0121: {
                    while (true) {
                        try {
                            final L1 l1 = (L1)((Y3.b)N5.H(L1.N(), array)).p();
                            final a2 k = this.j().K();
                            final boolean b0 = l1.b0();
                            Object q = null;
                            if (b0) {
                                final Long value = l1.L();
                                if (l1.a0()) {
                                    q = l1.Q();
                                }
                                k.c("Parsed config. version, gmp_app_id", value, q);
                                return l1;
                            }
                            break Label_0121;
                            final RuntimeException ex;
                            this.j().L().c("Unable to merge remote config. appId", Y1.v(s), ex);
                            return L1.P();
                        }
                        catch (RuntimeException ex) {
                            continue;
                        }
                        catch (k4 ex) {
                            continue;
                        }
                        break;
                    }
                }
                final Long value = null;
                continue;
            }
        }
    }
    
    public final void F(final String s, final L1.a a) {
        final HashSet<String> set = new HashSet<String>();
        final a a2 = new a();
        final a a3 = new a();
        final a a4 = new a();
        if (a != null) {
            final Iterator<J1> iterator = (Iterator<J1>)a.C().iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next().H());
            }
            for (int i = 0; i < a.w(); ++i) {
                final K1.a a5 = (K1.a)a.x(i).x();
                if (a5.y().isEmpty()) {
                    this.j().L().a("EventConfig contained null event name");
                }
                else {
                    final String y = a5.y();
                    final String b = r3.b(a5.y());
                    K4 x = a5;
                    if (!TextUtils.isEmpty((CharSequence)b)) {
                        x = a5.x(b);
                        a.y(i, (K1.a)x);
                    }
                    if (((K1.a)x).B() && ((K1.a)x).z()) {
                        a2.put(y, Boolean.TRUE);
                    }
                    if (((K1.a)x).C() && ((K1.a)x).A()) {
                        a3.put(((K1.a)x).y(), Boolean.TRUE);
                    }
                    if (((K1.a)x).D()) {
                        if (((K1.a)x).w() >= 2 && ((K1.a)x).w() <= 65535) {
                            a4.put(((K1.a)x).y(), ((K1.a)x).w());
                        }
                        else {
                            this.j().L().c("Invalid sampling rate. Event name, sample rate", ((K1.a)x).y(), ((K1.a)x).w());
                        }
                    }
                }
            }
        }
        this.e.put(s, set);
        this.f.put(s, a2);
        this.g.put(s, a3);
        this.i.put(s, a4);
    }
    
    public final void G(final String s, final L1 l1) {
        if (l1.k() == 0) {
            this.j.e(s);
            return;
        }
        this.j().K().b("EES programs found", l1.k());
        final q2 q2 = l1.W().get(0);
        while (true) {
            try {
                final C c = new C();
                c.c("internal.remoteConfig", new y2(this, s));
                c.c("internal.appMetadata", new B2(this, s));
                c.c("internal.logger", new A2(this));
                c.b(q2);
                this.j.d(s, c);
                this.j().K().c("EES program loaded for appId, activities", s, q2.G().k());
                final Iterator iterator = q2.G().I().iterator();
                while (iterator.hasNext()) {
                    this.j().K().b("EES program activity", iterator.next().H());
                }
                return;
                this.j().G().b("Failed to load EES program. appId", s);
            }
            catch (d0 d0) {
                continue;
            }
            break;
        }
    }
    
    public final boolean H(final String s, byte[] h, final String s2, final String s3) {
        this.u();
        this.n();
        A2.n.e(s);
        final L1.a a = (L1.a)this.C(s, h).x();
        if (a == null) {
            return false;
        }
        this.F(s, a);
        this.G(s, (L1)((Y3.b)a).p());
        this.h.put(s, ((Y3.b)a).p());
        this.l.put(s, a.A());
        this.m.put(s, s2);
        this.n.put(s, s3);
        this.d.put(s, E((L1)((Y3.b)a).p()));
        this.q().Z(s, new ArrayList(a.B()));
        try {
            a.z();
            h = ((L1)((Y3.b)a).p()).h();
        }
        catch (RuntimeException ex) {
            this.j().L().c("Unable to serialize reduced-size config. Storing full config instead. appId", Y1.v(s), ex);
        }
        final p q = this.q();
        A2.n.e(s);
        q.n();
        q.u();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", h);
        contentValues.put("config_last_modified_time", s2);
        contentValues.put("e_tag", s3);
        try {
            if (q.B().update("apps", contentValues, "app_id = ?", new String[] { s }) == 0L) {
                q.j().G().b("Failed to update remote config (got 0). appId", Y1.v(s));
            }
        }
        catch (SQLiteException ex2) {
            q.j().G().c("Error storing remote config. appId", Y1.v(s), ex2);
        }
        this.h.put(s, ((Y3.b)a).p());
        return true;
    }
    
    public final int I(final String s, final String s2) {
        this.n();
        this.g0(s);
        final Map<Object, Integer> map = this.i.get(s);
        if (map == null) {
            return 1;
        }
        final Integer n = map.get(s2);
        if (n == null) {
            return 1;
        }
        return n;
    }
    
    public final I1 J(final String s) {
        this.n();
        this.g0(s);
        final L1 l = this.L(s);
        if (l != null && l.Z()) {
            return l.M();
        }
        return null;
    }
    
    public final boolean K(final String s, final q3.a a) {
        this.n();
        this.g0(s);
        final I1 j = this.J(s);
        if (j == null) {
            return false;
        }
        for (final I1.b b : j.J()) {
            if (a == z(b.I())) {
                if (b.H() == I1.d.q) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
    
    public final L1 L(final String s) {
        this.u();
        this.n();
        A2.n.e(s);
        this.g0(s);
        return this.h.get(s);
    }
    
    public final boolean M(final String s, final String anObject) {
        this.n();
        this.g0(s);
        if ("ecommerce_purchase".equals(anObject)) {
            return true;
        }
        if ("purchase".equals(anObject)) {
            return true;
        }
        if ("refund".equals(anObject)) {
            return true;
        }
        final Map<Object, Boolean> map = this.g.get(s);
        if (map != null) {
            final Boolean b = map.get(anObject);
            return b != null && b;
        }
        return false;
    }
    
    public final String N(final String s) {
        this.n();
        return this.n.get(s);
    }
    
    public final boolean O(final String s, final String s2) {
        this.n();
        this.g0(s);
        if (this.X(s) && S5.H0(s2)) {
            return true;
        }
        if (this.Z(s) && S5.J0(s2)) {
            return true;
        }
        final Map<Object, Boolean> map = this.f.get(s);
        if (map != null) {
            final Boolean b = map.get(s2);
            return b != null && b;
        }
        return false;
    }
    
    public final String P(final String s) {
        this.n();
        return this.m.get(s);
    }
    
    public final String Q(final String s) {
        this.n();
        this.g0(s);
        return this.l.get(s);
    }
    
    public final Set R(final String s) {
        this.n();
        this.g0(s);
        return this.e.get(s);
    }
    
    public final SortedSet S(final String s) {
        this.n();
        this.g0(s);
        final TreeSet<String> set = new TreeSet<String>();
        final I1 j = this.J(s);
        if (j == null) {
            return set;
        }
        final Iterator iterator = j.I().iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next().H());
        }
        return set;
    }
    
    public final void T(final String s) {
        this.n();
        this.m.put(s, null);
    }
    
    public final void U(final String s) {
        this.n();
        this.h.remove(s);
    }
    
    public final boolean V(final String s) {
        this.n();
        final L1 l = this.L(s);
        return l != null && l.Y();
    }
    
    public final boolean W(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        final L1 l1 = this.h.get(s);
        return l1 != null && l1.k() != 0;
    }
    
    public final boolean X(final String s) {
        return "1".equals(this.c(s, "measurement.upload.blacklist_internal"));
    }
    
    public final boolean Y(final String s) {
        this.n();
        this.g0(s);
        final I1 j = this.J(s);
        return j == null || !j.M() || j.L();
    }
    
    public final boolean Z(final String s) {
        return "1".equals(this.c(s, "measurement.upload.blacklist_public"));
    }
    
    public final boolean a0(final String s) {
        this.n();
        this.g0(s);
        return this.e.get(s) != null && this.e.get(s).contains("app_instance_id");
    }
    
    public final boolean b0(final String s) {
        this.n();
        this.g0(s);
        return this.e.get(s) != null && (this.e.get(s).contains("device_model") || this.e.get(s).contains("device_info"));
    }
    
    @Override
    public final String c(final String s, final String s2) {
        this.n();
        this.g0(s);
        final Map<Object, String> map = this.d.get(s);
        if (map != null) {
            return map.get(s2);
        }
        return null;
    }
    
    public final boolean c0(final String s) {
        this.n();
        this.g0(s);
        return this.e.get(s) != null && this.e.get(s).contains("enhanced_user_id");
    }
    
    public final boolean d0(final String s) {
        this.n();
        this.g0(s);
        return this.e.get(s) != null && this.e.get(s).contains("google_signals");
    }
    
    public final boolean e0(final String s) {
        this.n();
        this.g0(s);
        return this.e.get(s) != null && (this.e.get(s).contains("os_version") || this.e.get(s).contains("device_info"));
    }
    
    public final boolean f0(final String s) {
        this.n();
        this.g0(s);
        return this.e.get(s) != null && this.e.get(s).contains("user_id");
    }
    
    public final void g0(final String s) {
        this.u();
        this.n();
        A2.n.e(s);
        if (this.h.get(s) == null) {
            final r e0 = this.q().E0(s);
            if (e0 == null) {
                this.d.put(s, null);
                this.f.put(s, null);
                this.e.put(s, null);
                this.g.put(s, null);
                this.h.put(s, null);
                this.l.put(s, null);
                this.m.put(s, null);
                this.n.put(s, null);
                this.i.put(s, null);
                return;
            }
            final L1.a a = (L1.a)this.C(s, e0.a).x();
            this.F(s, a);
            this.d.put(s, E((L1)((Y3.b)a).p()));
            this.h.put(s, ((Y3.b)a).p());
            this.G(s, (L1)((Y3.b)a).p());
            this.l.put(s, a.A());
            this.m.put(s, e0.b);
            this.n.put(s, e0.c);
        }
    }
    
    @Override
    public final boolean x() {
        return false;
    }
    
    public final long y(final String s) {
        final String c = this.c(s, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty((CharSequence)c)) {
            try {
                return Long.parseLong(c);
            }
            catch (NumberFormatException ex) {
                this.j().L().c("Unable to parse timezone offset. appId", Y1.v(s), ex);
            }
        }
        return 0L;
    }
}
