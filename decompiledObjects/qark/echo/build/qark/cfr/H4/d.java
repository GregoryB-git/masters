/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package H4;

import F4.a;
import H4.e;
import M4.b;
import N4.m;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d
extends e {
    public static final a b = a.e();
    public final m a;

    public d(m m8) {
        this.a = m8;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean c() {
        block4 : {
            String string2;
            StringBuilder stringBuilder;
            a a8;
            block3 : {
                block2 : {
                    if (this.o(this.a, 0)) break block2;
                    a8 = b;
                    stringBuilder = new StringBuilder();
                    string2 = "Invalid Trace:";
                    break block3;
                }
                if (!this.j(this.a) || this.h(this.a)) break block4;
                a8 = b;
                stringBuilder = new StringBuilder();
                string2 = "Invalid Counters for Trace:";
            }
            stringBuilder.append(string2);
            stringBuilder.append(this.a.r0());
            a8.j(stringBuilder.toString());
            return false;
        }
        return true;
    }

    public final boolean g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                e.d((String)entry.getKey(), (String)entry.getValue());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                b.j(illegalArgumentException.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    public final boolean h(m m8) {
        return this.i(m8, 0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean i(m var1_1, int var2_2) {
        if (var1_1 == null) {
            return false;
        }
        if (var2_2 <= 1) {
            var3_3 = var1_1.l0().entrySet().iterator();
        } else {
            var1_1 = d.b;
            var3_3 = "Exceed MAX_SUBTRACE_DEEP:1";
lbl8: // 2 sources:
            do {
                var1_1.j(var3_3);
                return false;
                break;
            } while (true);
        }
        while (var3_3.hasNext()) {
            var4_4 = (Map.Entry)var3_3.next();
            if (!this.l((String)var4_4.getKey())) {
                var1_1 = d.b;
                var3_3 = new StringBuilder();
                var3_3.append("invalid CounterId:");
                var3_3.append((String)var4_4.getKey());
            } else {
                if (this.m((Long)var4_4.getValue())) continue;
                var1_1 = d.b;
                var3_3 = new StringBuilder();
                var3_3.append("invalid CounterValue:");
                var3_3.append(var4_4.getValue());
            }
            var3_3 = var3_3.toString();
            ** continue;
lbl26: // 1 sources:
            ** GOTO lbl8
        }
        var1_1 = var1_1.t0().iterator();
        do {
            if (var1_1.hasNext() == false) return true;
        } while (this.i((m)var1_1.next(), var2_2 + 1));
        return false;
    }

    public final boolean j(m m8) {
        if (m8.k0() > 0) {
            return true;
        }
        m8 = m8.t0().iterator();
        while (m8.hasNext()) {
            if (((m)m8.next()).k0() <= 0) continue;
            return true;
        }
        return false;
    }

    public final boolean k(m m8) {
        return m8.r0().startsWith("_st_");
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean l(String string2) {
        a a8;
        if (string2 == null) {
            return false;
        }
        if ((string2 = string2.trim()).isEmpty()) {
            a8 = b;
            string2 = "counterId is empty";
        } else {
            if (string2.length() <= 100) {
                return true;
            }
            a8 = b;
            string2 = "counterId exceeded max length 100";
        }
        a8.j(string2);
        return false;
    }

    public final boolean m(Long l8) {
        if (l8 != null) {
            return true;
        }
        return false;
    }

    public final boolean n(m m8) {
        if ((m8 = (Long)m8.l0().get((Object)b.s.toString())) != null && m8.compareTo(Long.valueOf((long)0L)) > 0) {
            return true;
        }
        return false;
    }

    public final boolean o(m m8, int n8) {
        if (m8 == null) {
            b.j("TraceMetric is null");
            return false;
        }
        if (n8 > 1) {
            b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!this.q(m8.r0())) {
            a a8 = b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid TraceId:");
            stringBuilder.append(m8.r0());
            a8.j(stringBuilder.toString());
            return false;
        }
        if (!this.p(m8)) {
            a a9 = b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid TraceDuration:");
            stringBuilder.append(m8.o0());
            a9.j(stringBuilder.toString());
            return false;
        }
        if (!m8.u0()) {
            b.j("clientStartTimeUs is null.");
            return false;
        }
        if (this.k(m8) && !this.n(m8)) {
            a a10 = b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("non-positive totalFrames in screen trace ");
            stringBuilder.append(m8.r0());
            a10.j(stringBuilder.toString());
            return false;
        }
        Iterator iterator = m8.t0().iterator();
        while (iterator.hasNext()) {
            if (this.o((m)iterator.next(), n8 + 1)) continue;
            return false;
        }
        if (!this.g(m8.m0())) {
            return false;
        }
        return true;
    }

    public final boolean p(m m8) {
        if (m8 != null && m8.o0() > 0L) {
            return true;
        }
        return false;
    }

    public final boolean q(String string2) {
        boolean bl = false;
        if (string2 == null) {
            return false;
        }
        string2 = string2.trim();
        boolean bl2 = bl;
        if (!string2.isEmpty()) {
            bl2 = bl;
            if (string2.length() <= 100) {
                bl2 = true;
            }
        }
        return bl2;
    }
}

