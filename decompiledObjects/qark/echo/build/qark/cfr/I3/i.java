/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Map
 *  java.util.concurrent.Callable
 *  java.util.concurrent.atomic.AtomicMarkableReference
 *  java.util.concurrent.atomic.AtomicReference
 */
package I3;

import H3.n;
import I3.b;
import I3.d;
import I3.g;
import I3.h;
import V2.j;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import t0.f;

public class i {
    public final d a;
    public final n b;
    public String c;
    public final a d;
    public final a e;
    public final AtomicMarkableReference f;

    public i(String string2, M3.g g8, n n8) {
        this.d = new a(false);
        this.e = new a(true);
        this.f = new AtomicMarkableReference((Object)null, false);
        this.c = string2;
        this.a = new d(g8);
        this.b = n8;
    }

    public static /* synthetic */ Object a(i i8) {
        return i8.h();
    }

    public static i i(String string2, M3.g object, n n8) {
        d d8 = new d((M3.g)object);
        object = new i(string2, (M3.g)object, n8);
        ((b)object.d.a.getReference()).e(d8.g(string2, false));
        ((b)object.e.a.getReference()).e(d8.g(string2, true));
        object.f.set((Object)d8.h(string2), false);
        return object;
    }

    public static String j(String string2, M3.g g8) {
        return new d(g8).h(string2);
    }

    public Map e() {
        return this.d.b();
    }

    public Map f() {
        return this.e.b();
    }

    public String g() {
        return (String)this.f.getReference();
    }

    public final /* synthetic */ Object h() {
        this.k();
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void k() {
        AtomicMarkableReference atomicMarkableReference = this.f;
        // MONITORENTER : atomicMarkableReference
        boolean bl = this.f.isMarked();
        boolean bl2 = false;
        if (!bl) return;
        String string2 = this.g();
        this.f.set((Object)string2, false);
        bl2 = true;
        // MONITOREXIT : atomicMarkableReference
        if (!bl2) return;
        this.a.n(this.c, string2);
    }

    public boolean l(String string2, String string3) {
        return this.d.f(string2, string3);
    }

    public boolean m(String string2, String string3) {
        return this.e.f(string2, string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void n(String string2) {
        String string3 = this.c;
        synchronized (string3) {
            try {
                this.c = string2;
                Map map = this.d.b();
                if (this.g() != null) {
                    this.a.n(string2, this.g());
                }
                if (!map.isEmpty()) {
                    this.a.l(string2, map);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void o(String string2) {
        String string3 = b.c(string2, 1024);
        string2 = this.f;
        // MONITORENTER : string2
        if (H3.i.z(string3, (String)this.f.getReference())) {
            // MONITOREXIT : string2
            return;
        }
        this.f.set((Object)string3, true);
        // MONITOREXIT : string2
        this.b.h(new g(this));
    }

    public class a {
        public final AtomicMarkableReference a;
        public final AtomicReference b;
        public final boolean c;

        public a(boolean bl) {
            this.b = new AtomicReference((Object)null);
            this.c = bl;
            int n8 = bl ? 8192 : 1024;
            this.a = new AtomicMarkableReference((Object)new b(64, n8), false);
        }

        public static /* synthetic */ Void a(a a8) {
            return a8.c();
        }

        public Map b() {
            return ((b)this.a.getReference()).a();
        }

        public final /* synthetic */ Void c() {
            this.b.set((Object)null);
            this.e();
            return null;
        }

        public final void d() {
            h h8 = new h(this);
            if (f.a(this.b, null, h8)) {
                i.this.b.h(h8);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public final void e() {
            // MONITORENTER : this
            if (!this.a.isMarked()) return;
            Map map = ((b)this.a.getReference()).a();
            AtomicMarkableReference atomicMarkableReference = this.a;
            atomicMarkableReference.set((Object)((b)atomicMarkableReference.getReference()), false);
            // MONITOREXIT : this
            if (map == null) return;
            i.this.a.m(i.this.c, map, this.c);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public boolean f(String string2, String string3) {
            // MONITORENTER : this
            if (!((b)this.a.getReference()).d(string2, string3)) {
                // MONITOREXIT : this
                return false;
            }
            string2 = this.a;
            string2.set((Object)((b)string2.getReference()), true);
            // MONITOREXIT : this
            this.d();
            return true;
        }
    }

}

