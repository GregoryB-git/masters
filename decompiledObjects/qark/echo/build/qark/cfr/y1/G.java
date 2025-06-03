/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package y1;

import W5.m;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class G
implements Serializable {
    public static final a p = new a(null);
    private static final long serialVersionUID = 20160629001L;
    public final HashMap o;

    public G() {
        this.o = new HashMap();
    }

    public G(HashMap hashMap) {
        HashMap hashMap2;
        Intrinsics.checkNotNullParameter((Object)hashMap, "appEventMap");
        this.o = hashMap2 = new HashMap();
        hashMap2.putAll((Map)hashMap);
    }

    private final Object writeReplace() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            b b8 = new b(this.o);
            return b8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(y1.a a8, List list) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(a8, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter((Object)list, "appEvents");
            if (!this.o.containsKey((Object)a8)) {
                this.o.put((Object)a8, (Object)m.I((Collection)list));
                return;
            }
            if ((a8 = (List)this.o.get((Object)a8)) == null) {
                return;
            }
            a8.addAll((Collection)list);
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
    }

    public final Set b() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Set set = this.o.entrySet();
            Intrinsics.checkNotNullExpressionValue((Object)set, "events.entries");
            return set;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return null;
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static final class b
    implements Serializable {
        public static final a p = new a(null);
        private static final long serialVersionUID = 20160629001L;
        public final HashMap o;

        public b(HashMap hashMap) {
            Intrinsics.checkNotNullParameter((Object)hashMap, "proxyEvents");
            this.o = hashMap;
        }

        private final Object readResolve() {
            return new G(this.o);
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }
        }

    }

}

