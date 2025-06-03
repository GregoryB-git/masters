// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m4;

import java.util.Iterator;
import java.util.Collection;
import j4.b;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.io.OutputStream;
import j4.d;
import j4.c;
import java.nio.charset.Charset;
import j4.e;

public final class f implements e
{
    public static final Charset f;
    public static final c g;
    public static final c h;
    public static final d i;
    public OutputStream a;
    public final Map b;
    public final Map c;
    public final d d;
    public final i e;
    
    static {
        f = Charset.forName("UTF-8");
        g = c.a("key").b(a.b().c(1).a()).a();
        h = c.a("value").b(a.b().c(2).a()).a();
        i = new m4.e();
    }
    
    public f(final OutputStream a, final Map b, final Map c, final d d) {
        this.e = new i(this);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static ByteBuffer p(final int capacity) {
        return ByteBuffer.allocate(capacity).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    public static m4.d u(final c c) {
        final m4.d d = (m4.d)c.c(m4.d.class);
        if (d != null) {
            return d;
        }
        throw new b("Field has no @Protobuf config");
    }
    
    public static int v(final c c) {
        final m4.d d = (m4.d)c.c(m4.d.class);
        if (d != null) {
            return d.tag();
        }
        throw new b("Field has no @Protobuf config");
    }
    
    @Override
    public e a(final c c, final double n) {
        return this.e(c, n, true);
    }
    
    public e e(final c c, final double n, final boolean b) {
        if (b && n == 0.0) {
            return this;
        }
        this.x(v(c) << 3 | 0x1);
        this.a.write(p(8).putDouble(n).array());
        return this;
    }
    
    @Override
    public e g(final c c, final Object o) {
        return this.i(c, o, true);
    }
    
    public e h(final c c, final float n, final boolean b) {
        if (b && n == 0.0f) {
            return this;
        }
        this.x(v(c) << 3 | 0x5);
        this.a.write(p(4).putFloat(n).array());
        return this;
    }
    
    public e i(final c c, final Object o, final boolean b) {
        if (o == null) {
            return this;
        }
        if (o instanceof CharSequence) {
            final CharSequence charSequence = (CharSequence)o;
            if (b && charSequence.length() == 0) {
                return this;
            }
            this.x(v(c) << 3 | 0x2);
            final byte[] bytes = charSequence.toString().getBytes(m4.f.f);
            this.x(bytes.length);
            this.a.write(bytes);
            return this;
        }
        else {
            if (o instanceof Collection) {
                final Iterator<Object> iterator = ((Collection)o).iterator();
                while (iterator.hasNext()) {
                    this.i(c, iterator.next(), false);
                }
                return this;
            }
            if (o instanceof Map) {
                final Iterator<Map.Entry<?, ?>> iterator2 = ((Map)o).entrySet().iterator();
                while (iterator2.hasNext()) {
                    this.r(m4.f.i, c, iterator2.next(), false);
                }
                return this;
            }
            if (o instanceof Double) {
                return this.e(c, (double)o, b);
            }
            if (o instanceof Float) {
                return this.h(c, (float)o, b);
            }
            if (o instanceof Number) {
                return this.m(c, ((Number)o).longValue(), b);
            }
            if (o instanceof Boolean) {
                return this.o(c, (boolean)o, b);
            }
            if (o instanceof byte[]) {
                final byte[] b2 = (byte[])o;
                if (b && b2.length == 0) {
                    return this;
                }
                this.x(v(c) << 3 | 0x2);
                this.x(b2.length);
                this.a.write(b2);
                return this;
            }
            else {
                final d d = this.b.get(o.getClass());
                if (d != null) {
                    return this.r(d, c, o, b);
                }
                final j4.f f = this.c.get(o.getClass());
                if (f != null) {
                    return this.s(f, c, o, b);
                }
                if (o instanceof m4.c) {
                    return this.j(c, ((m4.c)o).g());
                }
                if (o instanceof Enum) {
                    return this.j(c, ((Enum)o).ordinal());
                }
                return this.r(this.d, c, o, b);
            }
        }
    }
    
    public f j(final c c, final int n) {
        return this.k(c, n, true);
    }
    
    public f k(final c c, final int n, final boolean b) {
        if (b && n == 0) {
            return this;
        }
        final m4.d u = u(c);
        final int n2 = f$a.a[u.intEncoding().ordinal()];
        if (n2 == 1) {
            this.x(u.tag() << 3);
            this.x(n);
            return this;
        }
        if (n2 == 2) {
            this.x(u.tag() << 3);
            this.x(n << 1 ^ n >> 31);
            return this;
        }
        if (n2 != 3) {
            return this;
        }
        this.x(u.tag() << 3 | 0x5);
        this.a.write(p(4).putInt(n).array());
        return this;
    }
    
    public f l(final c c, final long n) {
        return this.m(c, n, true);
    }
    
    public f m(final c c, final long n, final boolean b) {
        if (b && n == 0L) {
            return this;
        }
        final m4.d u = u(c);
        final int n2 = f$a.a[u.intEncoding().ordinal()];
        if (n2 == 1) {
            this.x(u.tag() << 3);
            this.y(n);
            return this;
        }
        if (n2 == 2) {
            this.x(u.tag() << 3);
            this.y(n >> 63 ^ n << 1);
            return this;
        }
        if (n2 != 3) {
            return this;
        }
        this.x(u.tag() << 3 | 0x1);
        this.a.write(p(8).putLong(n).array());
        return this;
    }
    
    public f n(final c c, final boolean b) {
        return this.o(c, b, true);
    }
    
    public f o(final c c, final boolean b, final boolean b2) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public final long q(d d, final Object o) {
        final m4.b a = new m4.b();
        OutputStream a2;
        try {
            a2 = this.a;
            this.a = a;
            final d d2 = d;
            final Object o2 = o;
            final f f = this;
            d2.a(o2, f);
            final f f2 = this;
            final OutputStream outputStream = a2;
            f2.a = outputStream;
            final m4.b b = a;
            final long n = b.a();
            final m4.b b2 = a;
            b2.close();
            return n;
        }
        finally {
            final d d3;
            d = d3;
            try {
                a.close();
            }
            finally {
                final Throwable exception;
                ((Throwable)d).addSuppressed(exception);
            }
        }
        try {
            final d d2 = d;
            final Object o2 = o;
            final f f = this;
            d2.a(o2, f);
            final f f2 = this;
            final OutputStream outputStream = a2;
            f2.a = outputStream;
            final m4.b b = a;
            final long n = b.a();
            final m4.b b2 = a;
            b2.close();
            return n;
        }
        finally {}
    }
    
    public final f r(final d d, final c c, final Object o, final boolean b) {
        final long q = this.q(d, o);
        if (b && q == 0L) {
            return this;
        }
        this.x(v(c) << 3 | 0x2);
        this.y(q);
        d.a(o, this);
        return this;
    }
    
    public final f s(final j4.f f, final c c, final Object o, final boolean b) {
        this.e.b(c, b);
        f.a(o, this.e);
        return this;
    }
    
    public f t(final Object o) {
        if (o == null) {
            return this;
        }
        final d d = this.b.get(o.getClass());
        if (d != null) {
            d.a(o, this);
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No encoder for ");
        sb.append(o.getClass());
        throw new b(sb.toString());
    }
    
    public final void x(int n) {
        while ((n & 0xFFFFFF80) != 0x0L) {
            this.a.write((n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.a.write(n & 0x7F);
    }
    
    public final void y(long n) {
        while ((0xFFFFFFFFFFFFFF80L & n) != 0x0L) {
            this.a.write(((int)n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.a.write((int)n & 0x7F);
    }
}
