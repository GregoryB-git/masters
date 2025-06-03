/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 */
package E5;

import E5.e;
import E5.j;
import E5.l;
import E5.p;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import t5.b;

public final class q
implements l {
    public static final q b = new q(p.a);
    public final p a;

    public q(p p8) {
        this.a = p8;
    }

    @Override
    public ByteBuffer a(Object object) {
        p.a a8 = new p.a();
        a8.write(0);
        this.a.p(a8, object);
        object = ByteBuffer.allocateDirect((int)a8.size());
        object.put(a8.a(), 0, a8.size());
        return object;
    }

    @Override
    public ByteBuffer b(String string2, String string3, Object object, String string4) {
        p.a a8 = new p.a();
        a8.write(1);
        this.a.p(a8, string2);
        this.a.p(a8, string3);
        if (object instanceof Throwable) {
            this.a.p(a8, b.d((Throwable)object));
        } else {
            this.a.p(a8, object);
        }
        this.a.p(a8, string4);
        string2 = ByteBuffer.allocateDirect((int)a8.size());
        string2.put(a8.a(), 0, a8.size());
        return string2;
    }

    @Override
    public ByteBuffer c(j j8) {
        p.a a8 = new p.a();
        this.a.p(a8, j8.a);
        this.a.p(a8, j8.b);
        j8 = ByteBuffer.allocateDirect((int)a8.size());
        j8.put(a8.a(), 0, a8.size());
        return j8;
    }

    @Override
    public ByteBuffer d(String string2, String string3, Object object) {
        p.a a8 = new p.a();
        a8.write(1);
        this.a.p(a8, string2);
        this.a.p(a8, string3);
        if (object instanceof Throwable) {
            this.a.p(a8, b.d((Throwable)object));
        } else {
            this.a.p(a8, object);
        }
        string2 = ByteBuffer.allocateDirect((int)a8.size());
        string2.put(a8.a(), 0, a8.size());
        return string2;
    }

    @Override
    public j e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object object = this.a.f(byteBuffer);
        Object object2 = this.a.f(byteBuffer);
        if (object instanceof String && !byteBuffer.hasRemaining()) {
            return new j((String)object, object2);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    @Override
    public Object f(ByteBuffer byteBuffer) {
        block3 : {
            Object object;
            block4 : {
                block2 : {
                    byteBuffer.order(ByteOrder.nativeOrder());
                    byte by = byteBuffer.get();
                    if (by == 0) break block2;
                    if (by != 1) break block3;
                    break block4;
                }
                object = this.a.f(byteBuffer);
                if (!byteBuffer.hasRemaining()) {
                    return object;
                }
            }
            object = this.a.f(byteBuffer);
            Object object2 = this.a.f(byteBuffer);
            Object object3 = this.a.f(byteBuffer);
            if (object instanceof String && (object2 == null || object2 instanceof String) && !byteBuffer.hasRemaining()) {
                throw new e((String)object, (String)object2, object3);
            }
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}

