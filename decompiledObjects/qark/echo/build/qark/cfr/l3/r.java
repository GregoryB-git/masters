/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.logging.Logger
 */
package l3;

import c3.g;
import c3.t;
import c3.v;
import c3.w;
import c3.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import l3.p;
import l3.q;
import n3.b;
import n3.c;
import p3.I;
import q3.f;
import r3.a;

public class r
implements w {
    public static final Logger a = Logger.getLogger((String)r.class.getName());
    public static final byte[] b = new byte[]{0};
    public static final r c = new r();

    public static void f() {
        x.n(c);
    }

    @Override
    public Class a() {
        return t.class;
    }

    @Override
    public Class c() {
        return t.class;
    }

    public final void g(v object) {
        Iterator iterator = object.c().iterator();
        while (iterator.hasNext()) {
            for (Object object2 : (List)iterator.next()) {
                if (!(object2.c() instanceof p)) continue;
                object = (p)object2.c();
                if ((object2 = a.a(object2.b())).equals(object.a())) continue;
                iterator = new StringBuilder();
                iterator.append("Mac Key with parameters ");
                iterator.append((Object)object.b());
                iterator.append(" has wrong output prefix (");
                iterator.append((Object)object.a());
                iterator.append(") instead of (");
                iterator.append(object2);
                iterator.append(")");
                throw new GeneralSecurityException(iterator.toString());
            }
        }
    }

    public t h(v v8) {
        this.g(v8);
        return new b(v8, null);
    }

    public static class b
    implements t {
        public final v a;
        public final b.a b;
        public final b.a c;

        /*
         * Enabled aggressive block sorting
         */
        public b(v object) {
            this.a = object;
            if (object.i()) {
                n3.b b8 = k3.g.b().a();
                object = k3.f.a((v)object);
                this.b = b8.a((c)object, "mac", "compute");
                object = b8.a((c)object, "mac", "verify");
            } else {
                this.b = object = k3.f.a;
            }
            this.c = object;
        }

        public /* synthetic */ b(v v8,  a8) {
            this(v8);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void a(byte[] arrby, byte[] arrby2) {
            if (arrby.length <= 5) {
                this.c.a();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] arrby3 = Arrays.copyOf((byte[])arrby, (int)5);
            Object object = Arrays.copyOfRange((byte[])arrby, (int)5, (int)arrby.length);
            Iterator iterator = this.a.f(arrby3).iterator();
            while (iterator.hasNext()) {
                v.c c8 = (v.c)iterator.next();
                arrby3 = c8.f().equals((Object)I.r) ? f.a(arrby2, b) : arrby2;
                try {
                    ((t)c8.g()).a((byte[])object, arrby3);
                    this.c.b(c8.d(), arrby3.length);
                    return;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    c8 = a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("tag prefix matches a key, but cannot verify: ");
                    stringBuilder.append((Object)generalSecurityException);
                    c8.info(stringBuilder.toString());
                }
            }
            arrby3 = this.a.h().iterator();
            do {
                if (!arrby3.hasNext()) {
                    this.c.a();
                    throw new GeneralSecurityException("invalid MAC");
                }
                object = (v.c)arrby3.next();
                try {
                    ((t)object.g()).a(arrby, arrby2);
                    this.c.b(object.d(), arrby2.length);
                    return;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    continue;
                }
                break;
            } while (true);
        }

        @Override
        public byte[] b(byte[] arrby) {
            byte[] arrby2 = arrby;
            if (this.a.e().f().equals((Object)I.r)) {
                arrby2 = f.a(arrby, b);
            }
            try {
                arrby = f.a(this.a.e().b(), ((t)this.a.e().g()).b(arrby2));
                this.b.b(this.a.e().d(), arrby2.length);
                return arrby;
            }
            catch (GeneralSecurityException generalSecurityException) {
                this.b.a();
                throw generalSecurityException;
            }
        }
    }

}

