/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package l3;

import c3.v;
import c3.w;
import c3.x;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l3.g;

public class h
implements w {
    public static final h a = new h();

    public static void d() {
        x.n(a);
    }

    @Override
    public Class a() {
        return g.class;
    }

    @Override
    public Class c() {
        return g.class;
    }

    public g e(v v8) {
        if (v8 != null) {
            if (v8.e() != null) {
                Iterator iterator = v8.c().iterator();
                while (iterator.hasNext()) {
                    Iterator iterator2 = ((List)iterator.next()).iterator();
                    while (iterator2.hasNext()) {
                        g g8 = (g)((v.c)iterator2.next()).a();
                    }
                }
                return new b(v8, null);
            }
            throw new GeneralSecurityException("no primary in primitive set");
        }
        throw new GeneralSecurityException("primitive set must be non-null");
    }

    public static class b
    implements g {
        public final v a;

        public b(v v8) {
            this.a = v8;
        }

        public /* synthetic */ b(v v8,  a8) {
            this(v8);
        }
    }

}

