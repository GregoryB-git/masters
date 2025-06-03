/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Method
 */
package com.google.protobuf;

import com.google.protobuf.A;
import com.google.protobuf.H;
import com.google.protobuf.I;
import com.google.protobuf.J;
import com.google.protobuf.K;
import com.google.protobuf.N;
import com.google.protobuf.O;
import com.google.protobuf.S;
import com.google.protobuf.V;
import com.google.protobuf.Z;
import com.google.protobuf.a0;
import com.google.protobuf.b0;
import com.google.protobuf.g0;
import com.google.protobuf.l;
import com.google.protobuf.n;
import com.google.protobuf.q;
import com.google.protobuf.r;
import com.google.protobuf.t;
import java.lang.reflect.Method;

public final class C
implements a0 {
    public static final J b = new J(){

        @Override
        public I a(Class class_) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override
        public boolean b(Class class_) {
            return false;
        }
    };
    public final J a;

    public C() {
        this(C.b());
    }

    public C(J j8) {
        this.a = (J)t.b(j8, "messageInfoFactory");
    }

    public static J b() {
        return new b(q.c(), C.c());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static J c() {
        try {
            return (J)Class.forName((String)"com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object)null, new Object[0]);
        }
        catch (Exception exception) {
            return b;
        }
    }

    public static boolean d(I i8) {
        if (i8.b() == V.o) {
            return true;
        }
        return false;
    }

    public static Z e(Class class_, I i8) {
        if (r.class.isAssignableFrom(class_)) {
            if (C.d(i8)) {
                return N.I(class_, i8, S.b(), A.b(), b0.J(), n.b(), H.b());
            }
            return N.I(class_, i8, S.b(), A.b(), b0.J(), null, H.b());
        }
        if (C.d(i8)) {
            return N.I(class_, i8, S.a(), A.a(), b0.F(), n.a(), H.a());
        }
        return N.I(class_, i8, S.a(), A.a(), b0.G(), null, H.a());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Z a(Class object) {
        g0 g02;
        b0.H((Class)object);
        I i8 = this.a.a((Class)object);
        if (!i8.a()) return C.e((Class)object, i8);
        if (r.class.isAssignableFrom((Class)object)) {
            g02 = b0.J();
            object = n.b();
            do {
                return O.j(g02, (l)object, i8.c());
                break;
            } while (true);
        }
        g02 = b0.F();
        object = n.a();
        return O.j(g02, (l)object, i8.c());
    }

    public static class b
    implements J {
        public J[] a;

        public /* varargs */ b(J ... arrj) {
            this.a = arrj;
        }

        @Override
        public I a(Class class_) {
            for (J j8 : this.a) {
                if (!j8.b(class_)) continue;
                return j8.a(class_);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No factory is available for message type: ");
            stringBuilder.append(class_.getName());
            throw new UnsupportedOperationException(stringBuilder.toString());
        }

        @Override
        public boolean b(Class class_) {
            J[] arrj = this.a;
            int n8 = arrj.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!arrj[i8].b(class_)) continue;
                return true;
            }
            return false;
        }
    }

}

