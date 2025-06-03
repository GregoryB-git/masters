/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package y6;

import V5.t;
import X5.g;
import Z5.h;
import g6.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p6.M;
import p6.P0;
import p6.l;
import p6.m;
import p6.o;
import u6.C;
import y6.c;
import y6.d;

public class b
extends d
implements y6.a {
    public static final AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, (String)"owner");
    public final q h;
    private volatile Object owner;

    public b(boolean bl) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public static /* synthetic */ Object o(b object, Object object2, X5.d d8) {
        if (object.q(object2)) {
            return t.a;
        }
        if ((object = object.p(object2, d8)) == Y5.b.c()) {
            return object;
        }
        return t.a;
    }

    @Override
    public Object a(Object object, X5.d d8) {
        return b.o(this, object, d8);
    }

    @Override
    public void b(Object object) {
        while (this.c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object object2 = atomicReferenceFieldUpdater.get((Object)this);
            if (object2 == c.c()) continue;
            if (object2 != object && object != null) {
                atomicReferenceFieldUpdater = new StringBuilder();
                atomicReferenceFieldUpdater.append("This mutex is locked by ");
                atomicReferenceFieldUpdater.append(object2);
                atomicReferenceFieldUpdater.append(", but ");
                atomicReferenceFieldUpdater.append(object);
                atomicReferenceFieldUpdater.append(" is expected");
                throw new IllegalStateException(atomicReferenceFieldUpdater.toString().toString());
            }
            if (!u.b.a(atomicReferenceFieldUpdater, this, object2, c.c())) continue;
            this.i();
            return;
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    @Override
    public boolean c() {
        if (this.h() == 0) {
            return true;
        }
        return false;
    }

    public boolean n(Object object) {
        Object object2;
        boolean bl;
        do {
            boolean bl2 = this.c();
            bl = false;
            if (bl2) continue;
            return false;
        } while ((object2 = i.get((Object)this)) == c.c());
        if (object2 == object) {
            bl = true;
        }
        return bl;
    }

    public final Object p(Object object, X5.d d8) {
        m m8 = o.b(Y5.b.b(d8));
        try {
            this.d(new a(m8, object));
        }
        catch (Throwable throwable) {
            m8.I();
            throw throwable;
        }
        object = m8.w();
        if (object == Y5.b.c()) {
            h.c(d8);
        }
        if (object == Y5.b.c()) {
            return object;
        }
        return t.a;
    }

    public boolean q(Object object) {
        int n8 = this.r(object);
        boolean bl = true;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    throw new IllegalStateException("unexpected".toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("This mutex is already locked by the specified owner: ");
                stringBuilder.append(object);
                throw new IllegalStateException(stringBuilder.toString().toString());
            }
            bl = false;
        }
        return bl;
    }

    public final int r(Object object) {
        do {
            if (this.j()) {
                i.set((Object)this, object);
                return 0;
            }
            if (object == null) break;
            if (!this.n(object)) continue;
            return 2;
        } while (!this.c());
        return 1;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Mutex@");
        stringBuilder.append(M.b(this));
        stringBuilder.append("[isLocked=");
        stringBuilder.append(this.c());
        stringBuilder.append(",owner=");
        stringBuilder.append(i.get((Object)this));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final class a
    implements l,
    P0 {
        public final m o;
        public final Object p;

        public a(m m8, Object object) {
            this.o = m8;
            this.p = object;
        }

        @Override
        public void a(C c8, int n8) {
            this.o.a(c8, n8);
        }

        public void b(t t8, g6.l l8) {
            i.set((Object)b.this, this.p);
            this.o.j(t8, new g6.l(b.this, this){
                public final /* synthetic */ b o;
                public final /* synthetic */ a p;
                {
                    this.o = b8;
                    this.p = a8;
                    super(1);
                }

                public final void a(Throwable throwable) {
                    this.o.b(this.p.p);
                }
            });
        }

        public Object c(t object, Object object2, g6.l object3) {
            object3 = b.this;
            if ((object = this.o.g(object, object2, new g6.l((b)object3, this){
                public final /* synthetic */ b o;
                public final /* synthetic */ a p;
                {
                    this.o = b8;
                    this.p = a8;
                    super(1);
                }

                public final void a(Throwable throwable) {
                    i.set((Object)this.o, this.p.p);
                    this.o.b(this.p.p);
                }
            })) != null) {
                i.set((Object)b.this, this.p);
            }
            return object;
        }

        @Override
        public void d(g6.l l8) {
            this.o.d(l8);
        }

        @Override
        public g getContext() {
            return this.o.getContext();
        }

        @Override
        public boolean o(Throwable throwable) {
            return this.o.o(throwable);
        }

        @Override
        public void p(Object object) {
            this.o.p(object);
        }

        @Override
        public void resumeWith(Object object) {
            this.o.resumeWith(object);
        }

    }

}

