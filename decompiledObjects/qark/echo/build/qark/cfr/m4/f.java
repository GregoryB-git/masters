/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.NoSuchFieldError
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.annotation.Annotation
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.charset.Charset
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package m4;

import j4.c;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m4.a;
import m4.b;
import m4.c;
import m4.d;
import m4.e;
import m4.i;

public final class f
implements j4.e {
    public static final Charset f = Charset.forName((String)"UTF-8");
    public static final j4.c g = j4.c.a("key").b(a.b().c(1).a()).a();
    public static final j4.c h = j4.c.a("value").b(a.b().c(2).a()).a();
    public static final j4.d i = new e();
    public OutputStream a;
    public final Map b;
    public final Map c;
    public final j4.d d;
    public final i e;

    public f(OutputStream outputStream, Map map, Map map2, j4.d d8) {
        this.e = new i(this);
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = d8;
    }

    public static /* synthetic */ void d(Map.Entry entry, j4.e e8) {
        f.w(entry, e8);
    }

    public static ByteBuffer p(int n8) {
        return ByteBuffer.allocate((int)n8).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static d u(j4.c object) {
        if ((object = (d)object.c(d.class)) != null) {
            return object;
        }
        throw new j4.b("Field has no @Protobuf config");
    }

    public static int v(j4.c object) {
        if ((object = (d)object.c(d.class)) != null) {
            return object.tag();
        }
        throw new j4.b("Field has no @Protobuf config");
    }

    public static /* synthetic */ void w(Map.Entry entry, j4.e e8) {
        e8.g(g, entry.getKey());
        e8.g(h, entry.getValue());
    }

    @Override
    public j4.e a(j4.c c8, double d8) {
        return this.e(c8, d8, true);
    }

    public j4.e e(j4.c c8, double d8, boolean bl) {
        if (bl && d8 == 0.0) {
            return this;
        }
        this.x(f.v(c8) << 3 | 1);
        this.a.write(f.p(8).putDouble(d8).array());
        return this;
    }

    @Override
    public j4.e g(j4.c c8, Object object) {
        return this.i(c8, object, true);
    }

    public j4.e h(j4.c c8, float f8, boolean bl) {
        if (bl && f8 == 0.0f) {
            return this;
        }
        this.x(f.v(c8) << 3 | 5);
        this.a.write(f.p(4).putFloat(f8).array());
        return this;
    }

    public j4.e i(j4.c arrby, Object arrby2, boolean bl) {
        if (arrby2 == null) {
            return this;
        }
        if (arrby2 instanceof CharSequence) {
            arrby2 = (CharSequence)arrby2;
            if (bl && arrby2.length() == 0) {
                return this;
            }
            this.x(f.v((j4.c)arrby) << 3 | 2);
            arrby = arrby2.toString().getBytes(f);
            this.x(arrby.length);
            this.a.write(arrby);
            return this;
        }
        if (arrby2 instanceof Collection) {
            arrby2 = ((Collection)arrby2).iterator();
            while (arrby2.hasNext()) {
                this.i((j4.c)arrby, arrby2.next(), false);
            }
            return this;
        }
        if (arrby2 instanceof Map) {
            for (Map.Entry entry : ((Map)arrby2).entrySet()) {
                this.r(i, (j4.c)arrby, (Object)entry, false);
            }
            return this;
        }
        if (arrby2 instanceof Double) {
            return this.e((j4.c)arrby, (Double)arrby2, bl);
        }
        if (arrby2 instanceof Float) {
            return this.h((j4.c)arrby, ((Float)arrby2).floatValue(), bl);
        }
        if (arrby2 instanceof Number) {
            return this.m((j4.c)arrby, ((Number)arrby2).longValue(), bl);
        }
        if (arrby2 instanceof Boolean) {
            return this.o((j4.c)arrby, (Boolean)arrby2, bl);
        }
        if (arrby2 instanceof byte[]) {
            arrby2 = arrby2;
            if (bl && arrby2.length == 0) {
                return this;
            }
            this.x(f.v((j4.c)arrby) << 3 | 2);
            this.x(arrby2.length);
            this.a.write(arrby2);
            return this;
        }
        Object object = (j4.d)this.b.get((Object)arrby2.getClass());
        if (object != null) {
            return this.r((j4.d)object, (j4.c)arrby, arrby2, bl);
        }
        object = (j4.f)this.c.get((Object)arrby2.getClass());
        if (object != null) {
            return this.s((j4.f)object, (j4.c)arrby, arrby2, bl);
        }
        if (arrby2 instanceof c) {
            return this.j((j4.c)arrby, ((c)arrby2).g());
        }
        if (arrby2 instanceof Enum) {
            return this.j((j4.c)arrby, ((Enum)arrby2).ordinal());
        }
        return this.r(this.d, (j4.c)arrby, arrby2, bl);
    }

    public f j(j4.c c8, int n8) {
        return this.k(c8, n8, true);
    }

    public f k(j4.c object, int n8, boolean bl) {
        if (bl && n8 == 0) {
            return this;
        }
        int n9 = .a[(object = f.u((j4.c)object)).intEncoding().ordinal()];
        if (n9 != 1) {
            if (n9 != 2) {
                if (n9 != 3) {
                    return this;
                }
                this.x(object.tag() << 3 | 5);
                this.a.write(f.p(4).putInt(n8).array());
                return this;
            }
            this.x(object.tag() << 3);
            this.x(n8 << 1 ^ n8 >> 31);
            return this;
        }
        this.x(object.tag() << 3);
        this.x(n8);
        return this;
    }

    public f l(j4.c c8, long l8) {
        return this.m(c8, l8, true);
    }

    public f m(j4.c object, long l8, boolean bl) {
        if (bl && l8 == 0L) {
            return this;
        }
        int n8 = .a[(object = f.u((j4.c)object)).intEncoding().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return this;
                }
                this.x(object.tag() << 3 | 1);
                this.a.write(f.p(8).putLong(l8).array());
                return this;
            }
            this.x(object.tag() << 3);
            this.y(l8 >> 63 ^ l8 << 1);
            return this;
        }
        this.x(object.tag() << 3);
        this.y(l8);
        return this;
    }

    public f n(j4.c c8, boolean bl) {
        return this.o(c8, bl, true);
    }

    public f o(j4.c c8, boolean bl, boolean bl2) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final long q(j4.d d8, Object object) {
        Throwable throwable222;
        b b8 = new b();
        OutputStream outputStream = this.a;
        this.a = b8;
        {
            catch (Throwable throwable222) {}
        }
        d8.a(object, this);
        this.a = outputStream;
        long l8 = b8.a();
        b8.close();
        return l8;
        catch (Throwable throwable3) {
            this.a = outputStream;
            throw throwable3;
        }
        try {
            b8.close();
            throw throwable222;
        }
        catch (Throwable throwable4) {
            throwable222.addSuppressed(throwable4);
        }
        throw throwable222;
    }

    public final f r(j4.d d8, j4.c c8, Object object, boolean bl) {
        long l8 = this.q(d8, object);
        if (bl && l8 == 0L) {
            return this;
        }
        this.x(f.v(c8) << 3 | 2);
        this.y(l8);
        d8.a(object, this);
        return this;
    }

    public final f s(j4.f f8, j4.c c8, Object object, boolean bl) {
        this.e.b(c8, bl);
        f8.a(object, this.e);
        return this;
    }

    public f t(Object object) {
        if (object == null) {
            return this;
        }
        j4.d d8 = (j4.d)this.b.get((Object)object.getClass());
        if (d8 != null) {
            d8.a(object, this);
            return this;
        }
        d8 = new StringBuilder();
        d8.append("No encoder for ");
        d8.append((Object)object.getClass());
        throw new j4.b(d8.toString());
    }

    public final void x(int n8) {
        while ((long)(n8 & -128) != 0L) {
            this.a.write(n8 & 127 | 128);
            n8 >>>= 7;
        }
        this.a.write(n8 & 127);
    }

    public final void y(long l8) {
        while ((-128L & l8) != 0L) {
            this.a.write((int)l8 & 127 | 128);
            l8 >>>= 7;
        }
        this.a.write((int)l8 & 127);
    }

}

