/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 *  java.util.UUID
 */
package d0;

import X2.v;
import android.net.Uri;
import android.os.Bundle;
import d0.w;
import d0.z;
import g0.M;
import g0.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class u {
    public static final u i = new c().a();
    public static final String j = M.w0(0);
    public static final String k = M.w0(1);
    public static final String l = M.w0(2);
    public static final String m = M.w0(3);
    public static final String n = M.w0(4);
    public static final String o = M.w0(5);
    public final String a;
    public final h b;
    public final h c;
    public final g d;
    public final w e;
    public final d f;
    public final e g;
    public final i h;

    public u(String string2, e e8, h h8, g g8, w w8, i i8) {
        this.a = string2;
        this.b = h8;
        this.c = h8;
        this.d = g8;
        this.e = w8;
        this.f = e8;
        this.g = e8;
        this.h = i8;
    }

    public /* synthetic */ u(String string2, e e8, h h8, g g8, w w8, i i8,  a8) {
        this(string2, e8, h8, g8, w8, i8);
    }

    public c a() {
        return new c(this, null);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof u)) {
            return false;
        }
        object = (u)object;
        if (M.c(this.a, object.a) && this.f.equals(object.f) && M.c(this.b, object.b) && M.c(this.d, object.d) && M.c(this.e, object.e) && M.c(this.h, object.h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        h h8 = this.b;
        int n9 = h8 != null ? h8.hashCode() : 0;
        return ((((n8 * 31 + n9) * 31 + this.d.hashCode()) * 31 + this.f.hashCode()) * 31 + this.e.hashCode()) * 31 + this.h.hashCode();
    }

    public static final abstract class b {
    }

    public static final class c {
        public String a;
        public Uri b;
        public String c;
        public d.a d = new d.a();
        public f.a e = new f.a(null);
        public List f = Collections.emptyList();
        public String g;
        public v h = v.Y();
        public Object i;
        public long j = -9223372036854775807L;
        public w k;
        public g.a l = new g.a();
        public i m = i.d;

        public c() {
        }

        public c(u object) {
            this();
            this.d = object.f.a();
            this.a = object.a;
            this.k = object.e;
            this.l = object.d.a();
            this.m = object.h;
            h h8 = object.b;
            if (h8 != null) {
                this.g = h8.e;
                this.c = h8.b;
                this.b = h8.a;
                this.f = h8.d;
                this.h = h8.f;
                this.i = h8.h;
                object = h8.c;
                object = object != null ? object.b() : new f.a(null);
                this.e = object;
                this.j = h8.i;
            }
        }

        public /* synthetic */ c(u u8,  a8) {
            this(u8);
        }

        public u a() {
            Object object;
            g g8;
            Object object2;
            e e8;
            Object object3;
            block4 : {
                boolean bl = this.e.b == null || this.e.a != null;
                a.f(bl);
                object3 = this.b;
                object2 = null;
                if (object3 != null) {
                    object = this.c;
                    if (this.e.a != null) {
                        object2 = this.e.i();
                    }
                    object2 = new h((Uri)object3, (String)object, (f)object2, null, this.f, this.g, this.h, this.i, this.j, null);
                } else {
                    object2 = null;
                }
                object3 = this.a;
                if (object3 == null) {
                    object3 = "";
                }
                e8 = this.d.g();
                g8 = this.l.f();
                object = this.k;
                if (object != null) break block4;
                object = w.H;
            }
            return new u((String)object3, e8, (h)object2, g8, (w)object, this.m, null);
        }

        public c b(String string2) {
            this.a = (String)a.e(string2);
            return this;
        }

        public c c(String string2) {
            this.c = string2;
            return this;
        }

        public c d(Object object) {
            this.i = object;
            return this;
        }

        public c e(Uri uri) {
            this.b = uri;
            return this;
        }
    }

    public static class d {
        public static final d h = new a().f();
        public static final String i = M.w0(0);
        public static final String j = M.w0(1);
        public static final String k = M.w0(2);
        public static final String l = M.w0(3);
        public static final String m = M.w0(4);
        public static final String n = M.w0(5);
        public static final String o = M.w0(6);
        public final long a;
        public final long b;
        public final long c;
        public final long d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public d(a a8) {
            this.a = M.i1(a8.a);
            this.c = M.i1(a8.b);
            this.b = a8.a;
            this.d = a8.b;
            this.e = a8.c;
            this.f = a8.d;
            this.g = a8.e;
        }

        public /* synthetic */ d(a a8,  a9) {
            this(a8);
        }

        public a a() {
            return new a(this, null);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof d)) {
                return false;
            }
            object = (d)object;
            if (this.b == object.b && this.d == object.d && this.e == object.e && this.f == object.f && this.g == object.g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public static final class a {
            public long a;
            public long b;
            public boolean c;
            public boolean d;
            public boolean e;

            public a() {
                this.b = Long.MIN_VALUE;
            }

            public a(d d8) {
                this.a = d8.b;
                this.b = d8.d;
                this.c = d8.e;
                this.d = d8.f;
                this.e = d8.g;
            }

            public /* synthetic */ a(d d8,  a8) {
                this(d8);
            }

            public d f() {
                return new d(this, null);
            }

            public e g() {
                return new e(this, null);
            }
        }

    }

    public static final class e
    extends d {
        public static final e p = new d.a().g();

        public e(d.a a8) {
            super(a8, null);
        }

        public /* synthetic */ e(d.a a8,  a9) {
            this(a8);
        }
    }

    public static final class f {
        public static final String l = M.w0(0);
        public static final String m = M.w0(1);
        public static final String n = M.w0(2);
        public static final String o = M.w0(3);
        public static final String p = M.w0(4);
        public static final String q = M.w0(5);
        public static final String r = M.w0(6);
        public static final String s = M.w0(7);
        public final UUID a;
        public final UUID b;
        public final Uri c;
        public final X2.w d;
        public final X2.w e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final v i;
        public final v j;
        public final byte[] k;

        public f(a arrby) {
            UUID uUID;
            boolean bl = !((a)arrby).f || ((a)arrby).b != null;
            g0.a.f(bl);
            this.a = uUID = (UUID)g0.a.e((Object)((a)arrby).a);
            this.b = uUID;
            this.c = ((a)arrby).b;
            this.d = ((a)arrby).c;
            this.e = ((a)arrby).c;
            this.f = ((a)arrby).d;
            this.h = ((a)arrby).f;
            this.g = ((a)arrby).e;
            this.i = ((a)arrby).g;
            this.j = ((a)arrby).g;
            arrby = ((a)arrby).h != null ? Arrays.copyOf((byte[])((a)arrby).h, (int)((a)arrby).h.length) : null;
            this.k = arrby;
        }

        public /* synthetic */ f(a a8,  a9) {
            this(a8);
        }

        public a b() {
            return new a(this, null);
        }

        public byte[] c() {
            byte[] arrby = this.k;
            if (arrby != null) {
                return Arrays.copyOf((byte[])arrby, (int)arrby.length);
            }
            return null;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof f)) {
                return false;
            }
            object = (f)object;
            if (this.a.equals((Object)object.a) && M.c((Object)this.c, (Object)object.c) && M.c(this.e, object.e) && this.f == object.f && this.h == object.h && this.g == object.g && this.j.equals((Object)object.j) && Arrays.equals((byte[])this.k, (byte[])object.k)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            RuntimeException runtimeException;
            super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
            throw runtimeException;
        }

        public static final class a {
            public UUID a;
            public Uri b;
            public X2.w c;
            public boolean d;
            public boolean e;
            public boolean f;
            public v g;
            public byte[] h;

            public a() {
                this.c = X2.w.j();
                this.e = true;
                this.g = v.Y();
            }

            public /* synthetic */ a( a8) {
                this();
            }

            public a(f f8) {
                this.a = f8.a;
                this.b = f8.c;
                this.c = f8.e;
                this.d = f8.f;
                this.e = f8.g;
                this.f = f8.h;
                this.g = f8.j;
                this.h = f8.k;
            }

            public /* synthetic */ a(f f8,  a8) {
                this(f8);
            }

            public f i() {
                return new f(this, null);
            }
        }

    }

    public static final class g {
        public static final g f = new a().f();
        public static final String g = M.w0(0);
        public static final String h = M.w0(1);
        public static final String i = M.w0(2);
        public static final String j = M.w0(3);
        public static final String k = M.w0(4);
        public final long a;
        public final long b;
        public final long c;
        public final float d;
        public final float e;

        public g(long l8, long l9, long l10, float f8, float f9) {
            this.a = l8;
            this.b = l9;
            this.c = l10;
            this.d = f8;
            this.e = f9;
        }

        public g(a a8) {
            this(a8.a, a8.b, a8.c, a8.d, a8.e);
        }

        public /* synthetic */ g(a a8,  a9) {
            this(a8);
        }

        public a a() {
            return new a(this, null);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof g)) {
                return false;
            }
            object = (g)object;
            if (this.a == object.a && this.b == object.b && this.c == object.c && this.d == object.d && this.e == object.e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long l8 = this.a;
            int n8 = (int)(l8 ^ l8 >>> 32);
            l8 = this.b;
            int n9 = (int)(l8 ^ l8 >>> 32);
            l8 = this.c;
            int n10 = (int)(l8 >>> 32 ^ l8);
            float f8 = this.d;
            int n11 = 0;
            int n12 = f8 != 0.0f ? Float.floatToIntBits((float)f8) : 0;
            f8 = this.e;
            if (f8 != 0.0f) {
                n11 = Float.floatToIntBits((float)f8);
            }
            return (((n8 * 31 + n9) * 31 + n10) * 31 + n12) * 31 + n11;
        }

        public static final class a {
            public long a;
            public long b;
            public long c;
            public float d;
            public float e;

            public a() {
                this.a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }

            public a(g g8) {
                this.a = g8.a;
                this.b = g8.b;
                this.c = g8.c;
                this.d = g8.d;
                this.e = g8.e;
            }

            public /* synthetic */ a(g g8,  a8) {
                this(g8);
            }

            public g f() {
                return new g(this, null);
            }

            public a g(long l8) {
                this.c = l8;
                return this;
            }

            public a h(float f8) {
                this.e = f8;
                return this;
            }

            public a i(long l8) {
                this.b = l8;
                return this;
            }

            public a j(float f8) {
                this.d = f8;
                return this;
            }

            public a k(long l8) {
                this.a = l8;
                return this;
            }
        }

    }

    public static final class h {
        public static final String j = M.w0(0);
        public static final String k = M.w0(1);
        public static final String l = M.w0(2);
        public static final String m = M.w0(3);
        public static final String n = M.w0(4);
        public static final String o = M.w0(5);
        public static final String p = M.w0(6);
        public static final String q = M.w0(7);
        public final Uri a;
        public final String b;
        public final f c;
        public final List d;
        public final String e;
        public final v f;
        public final List g;
        public final Object h;
        public final long i;

        public h(Uri object, String string2, f f8, b b8, List list, String string3, v v8, Object object2, long l8) {
            this.a = object;
            this.b = z.t(string2);
            this.c = f8;
            this.d = list;
            this.e = string3;
            this.f = v8;
            object = v.M();
            for (int i8 = 0; i8 < v8.size(); ++i8) {
                object.h(((k)v8.get(i8)).a().b());
            }
            this.g = object.k();
            this.h = object2;
            this.i = l8;
        }

        public /* synthetic */ h(Uri uri, String string2, f f8, b b8, List list, String string3, v v8, Object object, long l8,  a8) {
            this(uri, string2, f8, b8, list, string3, v8, object, l8);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof h)) {
                return false;
            }
            object = (h)object;
            if (this.a.equals((Object)object.a) && M.c(this.b, object.b) && M.c(this.c, object.c) && M.c(null, null) && this.d.equals((Object)object.d) && M.c(this.e, object.e) && this.f.equals((Object)object.f) && M.c(this.h, object.h) && M.c(this.i, object.i)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int n8 = this.a.hashCode();
            Object object = this.b;
            int n9 = 0;
            int n10 = object == null ? 0 : object.hashCode();
            object = this.c;
            int n11 = object == null ? 0 : object.hashCode();
            int n12 = this.d.hashCode();
            object = this.e;
            int n13 = object == null ? 0 : object.hashCode();
            int n14 = this.f.hashCode();
            object = this.h;
            if (object != null) {
                n9 = object.hashCode();
            }
            return (int)((long)((((((n8 * 31 + n10) * 31 + n11) * 961 + n12) * 31 + n13) * 31 + n14) * 31 + n9) * 31L + this.i);
        }
    }

    public static final class i {
        public static final i d = new a().d();
        public static final String e = M.w0(0);
        public static final String f = M.w0(1);
        public static final String g = M.w0(2);
        public final Uri a;
        public final String b;
        public final Bundle c;

        public i(a a8) {
            this.a = a8.a;
            this.b = a8.b;
            this.c = a8.c;
        }

        public /* synthetic */ i(a a8,  a9) {
            this(a8);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof i)) {
                return false;
            }
            object = (i)object;
            if (M.c((Object)this.a, (Object)object.a) && M.c(this.b, object.b)) {
                boolean bl = this.c == null;
                boolean bl2 = object.c == null;
                if (bl == bl2) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object object = this.a;
            int n8 = 0;
            int n9 = object == null ? 0 : object.hashCode();
            object = this.b;
            int n10 = object == null ? 0 : object.hashCode();
            if (this.c != null) {
                n8 = 1;
            }
            return (n9 * 31 + n10) * 31 + n8;
        }

        public static final class a {
            public Uri a;
            public String b;
            public Bundle c;

            public i d() {
                return new i(this, null);
            }
        }

    }

    public static final abstract class j
    extends k {
    }

    public static abstract class k {
        public abstract a a();

        public static final abstract class a {
            public abstract j b();
        }

    }

}

