/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.text.TextUtils
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.SortedSet
 *  java.util.TreeSet
 *  java.util.concurrent.Callable
 */
package R2;

import A2.n;
import E2.e;
import R2.A2;
import R2.B2;
import R2.B5;
import R2.C;
import R2.C2;
import R2.C5;
import R2.D2;
import R2.D5;
import R2.E2;
import R2.G2;
import R2.N5;
import R2.S5;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.b6;
import R2.f;
import R2.g;
import R2.g5;
import R2.i;
import R2.l2;
import R2.m3;
import R2.p;
import R2.q3;
import R2.r;
import R2.r3;
import R2.y2;
import R2.z5;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.L1;
import com.google.android.gms.internal.measurement.O1;
import com.google.android.gms.internal.measurement.T7;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.p2;
import com.google.android.gms.internal.measurement.q2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import t.a;

public final class x2
extends C5
implements i {
    public final Map d = new a();
    public final Map e = new a();
    public final Map f = new a();
    public final Map g = new a();
    public final Map h = new a();
    public final Map i = new a();
    public final t.g j;
    public final T7 k;
    public final Map l = new a();
    public final Map m = new a();
    public final Map n = new a();

    public x2(D5 d52) {
        super(d52);
        this.j = new D2(this, 20);
        this.k = new C2(this);
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.C B(x2 x22, String string2) {
        x22.u();
        n.e(string2);
        if (!x22.W(string2)) {
            return null;
        }
        if (x22.h.containsKey((Object)string2) && x22.h.get((Object)string2) != null) {
            x22.G(string2, (L1)x22.h.get((Object)string2));
        } else {
            x22.g0(string2);
        }
        return (com.google.android.gms.internal.measurement.C)x22.j.h().get((Object)string2);
    }

    public static Map E(L1 l12) {
        a a8 = new a();
        if (l12 != null) {
            for (O1 o12 : l12.X()) {
                a8.put((Object)o12.H(), (Object)o12.I());
            }
        }
        return a8;
    }

    public static q3.a z(I1.e e8) {
        int n8 = E2.b[e8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        return null;
                    }
                    return q3.a.s;
                }
                return q3.a.r;
            }
            return q3.a.q;
        }
        return q3.a.p;
    }

    public final q3.a A(String object, q3.a a8) {
        this.n();
        this.g0((String)object);
        object = this.J((String)object);
        if (object == null) {
            return null;
        }
        for (I1.c c8 : object.K()) {
            if (a8 != x2.z(c8.I())) continue;
            return x2.z(c8.H());
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final L1 C(String string2, byte[] l8) {
        void var2_3;
        if (l8 == null) {
            return L1.P();
        }
        try {
            L1 l12 = (L1)((Y3)((L1.a)N5.H(L1.N(), (byte[])l8)).p());
            a2 a22 = this.j().K();
            boolean bl = l12.b0();
            String string3 = null;
            l8 = bl ? Long.valueOf((long)l12.L()) : null;
            if (l12.a0()) {
                string3 = l12.Q();
            }
            a22.c("Parsed config. version, gmp_app_id", (Object)l8, string3);
            return l12;
        }
        catch (RuntimeException runtimeException) {
        }
        catch (k4 k42) {}
        this.j().L().c("Unable to merge remote config. appId", Y1.v(string2), var2_3);
        return L1.P();
    }

    public final void F(String string2, L1.a a8) {
        HashSet hashSet = new HashSet();
        a a9 = new a();
        a a10 = new a();
        a a11 = new a();
        if (a8 != null) {
            Object object = a8.C().iterator();
            while (object.hasNext()) {
                hashSet.add((Object)((J1)object.next()).H());
            }
            for (int i8 = 0; i8 < a8.w(); ++i8) {
                K1.a a12 = (K1.a)a8.x(i8).x();
                if (a12.y().isEmpty()) {
                    this.j().L().a("EventConfig contained null event name");
                    continue;
                }
                String string3 = a12.y();
                String string4 = r3.b(a12.y());
                object = a12;
                if (!TextUtils.isEmpty((CharSequence)string4)) {
                    object = a12.x(string4);
                    a8.y(i8, (K1.a)object);
                }
                if (object.B() && object.z()) {
                    a9.put((Object)string3, (Object)Boolean.TRUE);
                }
                if (object.C() && object.A()) {
                    a10.put((Object)object.y(), (Object)Boolean.TRUE);
                }
                if (!object.D()) continue;
                if (object.w() >= 2 && object.w() <= 65535) {
                    a11.put((Object)object.y(), (Object)object.w());
                    continue;
                }
                this.j().L().c("Invalid sampling rate. Event name, sample rate", object.y(), object.w());
            }
        }
        this.e.put((Object)string2, (Object)hashSet);
        this.f.put((Object)string2, (Object)a9);
        this.g.put((Object)string2, (Object)a10);
        this.i.put((Object)string2, (Object)a11);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void G(String string2, L1 l12) {
        if (l12.k() == 0) {
            this.j.e(string2);
            return;
        }
        this.j().K().b("EES programs found", l12.k());
        q2 q22 = (q2)l12.W().get(0);
        try {
            Object object = new com.google.android.gms.internal.measurement.C();
            object.c("internal.remoteConfig", new y2(this, string2));
            object.c("internal.appMetadata", new B2(this, string2));
            object.c("internal.logger", new A2(this));
            object.b(q22);
            this.j.d(string2, object);
            this.j().K().c("EES program loaded for appId, activities", string2, q22.G().k());
            Iterator iterator = q22.G().I().iterator();
            do {
                if (!iterator.hasNext()) {
                    return;
                }
                object = (p2)iterator.next();
                this.j().K().b("EES program activity", object.H());
            } while (true);
        }
        catch (d0 d02) {}
        this.j().G().b("Failed to load EES program. appId", string2);
    }

    public final boolean H(String string2, byte[] arrby, String string3, String string4) {
        Object object;
        this.u();
        this.n();
        n.e(string2);
        L1.a a8 = (L1.a)this.C(string2, arrby).x();
        if (a8 == null) {
            return false;
        }
        this.F(string2, a8);
        this.G(string2, (L1)((Y3)a8.p()));
        this.h.put((Object)string2, (Object)((L1)((Y3)a8.p())));
        this.l.put((Object)string2, (Object)a8.A());
        this.m.put((Object)string2, (Object)string3);
        this.n.put((Object)string2, (Object)string4);
        this.d.put((Object)string2, (Object)x2.E((L1)((Y3)a8.p())));
        this.q().Z(string2, (List)new ArrayList((Collection)a8.B()));
        try {
            a8.z();
            object = ((L1)((Y3)a8.p())).h();
            arrby = object;
        }
        catch (RuntimeException runtimeException) {
            this.j().L().c("Unable to serialize reduced-size config. Storing full config instead. appId", Y1.v(string2), (Object)runtimeException);
        }
        object = this.q();
        n.e(string2);
        object.n();
        object.u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", arrby);
        contentValues.put("config_last_modified_time", string3);
        contentValues.put("e_tag", string4);
        try {
            if ((long)object.B().update("apps", contentValues, "app_id = ?", new String[]{string2}) == 0L) {
                object.j().G().b("Failed to update remote config (got 0). appId", Y1.v(string2));
            }
        }
        catch (SQLiteException sQLiteException) {
            object.j().G().c("Error storing remote config. appId", Y1.v(string2), (Object)sQLiteException);
        }
        this.h.put((Object)string2, (Object)((L1)((Y3)a8.p())));
        return true;
    }

    public final int I(String string2, String string3) {
        this.n();
        this.g0(string2);
        string2 = (Map)this.i.get((Object)string2);
        if (string2 != null) {
            if ((string2 = (Integer)string2.get((Object)string3)) == null) {
                return 1;
            }
            return string2.intValue();
        }
        return 1;
    }

    public final I1 J(String object) {
        this.n();
        this.g0((String)object);
        object = this.L((String)object);
        if (object != null && object.Z()) {
            return object.M();
        }
        return null;
    }

    public final boolean K(String object, q3.a a8) {
        this.n();
        this.g0((String)object);
        object = this.J((String)object);
        if (object == null) {
            return false;
        }
        for (I1.b b8 : object.J()) {
            if (a8 != x2.z(b8.I())) continue;
            if (b8.H() != I1.d.q) break;
            return true;
        }
        return false;
    }

    public final L1 L(String string2) {
        this.u();
        this.n();
        n.e(string2);
        this.g0(string2);
        return (L1)this.h.get((Object)string2);
    }

    public final boolean M(String string2, String string3) {
        this.n();
        this.g0(string2);
        if ("ecommerce_purchase".equals((Object)string3)) {
            return true;
        }
        if (!"purchase".equals((Object)string3)) {
            if ("refund".equals((Object)string3)) {
                return true;
            }
            if ((string2 = (Map)this.g.get((Object)string2)) != null) {
                if ((string2 = (Boolean)string2.get((Object)string3)) == null) {
                    return false;
                }
                return string2.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final String N(String string2) {
        this.n();
        return (String)this.n.get((Object)string2);
    }

    public final boolean O(String string2, String string3) {
        this.n();
        this.g0(string2);
        if (this.X(string2) && S5.H0(string3)) {
            return true;
        }
        if (this.Z(string2) && S5.J0(string3)) {
            return true;
        }
        if ((string2 = (Map)this.f.get((Object)string2)) != null) {
            if ((string2 = (Boolean)string2.get((Object)string3)) == null) {
                return false;
            }
            return string2.booleanValue();
        }
        return false;
    }

    public final String P(String string2) {
        this.n();
        return (String)this.m.get((Object)string2);
    }

    public final String Q(String string2) {
        this.n();
        this.g0(string2);
        return (String)this.l.get((Object)string2);
    }

    public final Set R(String string2) {
        this.n();
        this.g0(string2);
        return (Set)this.e.get((Object)string2);
    }

    public final SortedSet S(String object) {
        this.n();
        this.g0((String)object);
        TreeSet treeSet = new TreeSet();
        object = this.J((String)object);
        if (object == null) {
            return treeSet;
        }
        object = object.I().iterator();
        while (object.hasNext()) {
            treeSet.add((Object)((I1.f)object.next()).H());
        }
        return treeSet;
    }

    public final void T(String string2) {
        this.n();
        this.m.put((Object)string2, (Object)null);
    }

    public final void U(String string2) {
        this.n();
        this.h.remove((Object)string2);
    }

    public final boolean V(String object) {
        this.n();
        object = this.L((String)object);
        if (object == null) {
            return false;
        }
        return object.Y();
    }

    public final boolean W(String object) {
        if (TextUtils.isEmpty((CharSequence)object)) {
            return false;
        }
        if ((object = (L1)this.h.get(object)) == null) {
            return false;
        }
        if (object.k() != 0) {
            return true;
        }
        return false;
    }

    public final boolean X(String string2) {
        return "1".equals((Object)this.c(string2, "measurement.upload.blacklist_internal"));
    }

    public final boolean Y(String object) {
        this.n();
        this.g0((String)object);
        object = this.J((String)object);
        if (object == null) {
            return true;
        }
        if (object.M()) {
            if (object.L()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean Z(String string2) {
        return "1".equals((Object)this.c(string2, "measurement.upload.blacklist_public"));
    }

    public final boolean a0(String string2) {
        this.n();
        this.g0(string2);
        if (this.e.get((Object)string2) != null && ((Set)this.e.get((Object)string2)).contains((Object)"app_instance_id")) {
            return true;
        }
        return false;
    }

    public final boolean b0(String string2) {
        this.n();
        this.g0(string2);
        if (this.e.get((Object)string2) != null && (((Set)this.e.get((Object)string2)).contains((Object)"device_model") || ((Set)this.e.get((Object)string2)).contains((Object)"device_info"))) {
            return true;
        }
        return false;
    }

    @Override
    public final String c(String string2, String string3) {
        this.n();
        this.g0(string2);
        string2 = (Map)this.d.get((Object)string2);
        if (string2 != null) {
            return (String)string2.get((Object)string3);
        }
        return null;
    }

    public final boolean c0(String string2) {
        this.n();
        this.g0(string2);
        if (this.e.get((Object)string2) != null && ((Set)this.e.get((Object)string2)).contains((Object)"enhanced_user_id")) {
            return true;
        }
        return false;
    }

    public final boolean d0(String string2) {
        this.n();
        this.g0(string2);
        if (this.e.get((Object)string2) != null && ((Set)this.e.get((Object)string2)).contains((Object)"google_signals")) {
            return true;
        }
        return false;
    }

    public final boolean e0(String string2) {
        this.n();
        this.g0(string2);
        if (this.e.get((Object)string2) != null && (((Set)this.e.get((Object)string2)).contains((Object)"os_version") || ((Set)this.e.get((Object)string2)).contains((Object)"device_info"))) {
            return true;
        }
        return false;
    }

    public final boolean f0(String string2) {
        this.n();
        this.g0(string2);
        if (this.e.get((Object)string2) != null && ((Set)this.e.get((Object)string2)).contains((Object)"user_id")) {
            return true;
        }
        return false;
    }

    public final void g0(String string2) {
        this.u();
        this.n();
        n.e(string2);
        if (this.h.get((Object)string2) == null) {
            r r8 = this.q().E0(string2);
            if (r8 == null) {
                this.d.put((Object)string2, (Object)null);
                this.f.put((Object)string2, (Object)null);
                this.e.put((Object)string2, (Object)null);
                this.g.put((Object)string2, (Object)null);
                this.h.put((Object)string2, (Object)null);
                this.l.put((Object)string2, (Object)null);
                this.m.put((Object)string2, (Object)null);
                this.n.put((Object)string2, (Object)null);
                this.i.put((Object)string2, (Object)null);
                return;
            }
            L1.a a8 = (L1.a)this.C(string2, r8.a).x();
            this.F(string2, a8);
            this.d.put((Object)string2, (Object)x2.E((L1)((Y3)a8.p())));
            this.h.put((Object)string2, (Object)((L1)((Y3)a8.p())));
            this.G(string2, (L1)((Y3)a8.p()));
            this.l.put((Object)string2, (Object)a8.A());
            this.m.put((Object)string2, (Object)r8.b);
            this.n.put((Object)string2, (Object)r8.c);
        }
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final long y(String string2) {
        String string3 = this.c(string2, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            try {
                long l8 = Long.parseLong((String)string3);
                return l8;
            }
            catch (NumberFormatException numberFormatException) {
                this.j().L().c("Unable to parse timezone offset. appId", Y1.v(string2), (Object)numberFormatException);
            }
        }
        return 0L;
    }
}

