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
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.E;
import com.google.crypto.tink.shaded.protobuf.L;
import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.N;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.T;
import com.google.crypto.tink.shaded.protobuf.W;
import com.google.crypto.tink.shaded.protobuf.Z;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.f0;
import com.google.crypto.tink.shaded.protobuf.g0;
import com.google.crypto.tink.shaded.protobuf.k0;
import com.google.crypto.tink.shaded.protobuf.q;
import com.google.crypto.tink.shaded.protobuf.s;
import com.google.crypto.tink.shaded.protobuf.w;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.z;
import java.lang.reflect.Method;

public final class G
implements f0 {
    public static final N b = new N(){

        @Override
        public M a(Class class_) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override
        public boolean b(Class class_) {
            return false;
        }
    };
    public final N a;

    public G() {
        this(G.b());
    }

    public G(N n8) {
        this.a = (N)z.b(n8, "messageInfoFactory");
    }

    public static N b() {
        return new b(w.c(), G.c());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static N c() {
        try {
            return (N)Class.forName((String)"com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object)null, new Object[0]);
        }
        catch (Exception exception) {
            return b;
        }
    }

    public static boolean d(M m8) {
        if (m8.b() == Z.o) {
            return true;
        }
        return false;
    }

    public static e0 e(Class class_, M m8) {
        if (x.class.isAssignableFrom(class_)) {
            if (G.d(m8)) {
                return S.T(class_, m8, W.b(), E.b(), g0.L(), s.b(), L.b());
            }
            return S.T(class_, m8, W.b(), E.b(), g0.L(), null, L.b());
        }
        if (G.d(m8)) {
            return S.T(class_, m8, W.a(), E.a(), g0.G(), s.a(), L.a());
        }
        return S.T(class_, m8, W.a(), E.a(), g0.H(), null, L.a());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public e0 a(Class object) {
        k0 k02;
        g0.I((Class)object);
        M m8 = this.a.a((Class)object);
        if (!m8.a()) return G.e((Class)object, m8);
        if (x.class.isAssignableFrom((Class)object)) {
            k02 = g0.L();
            object = s.b();
            do {
                return T.m(k02, (q)object, m8.c());
                break;
            } while (true);
        }
        k02 = g0.G();
        object = s.a();
        return T.m(k02, (q)object, m8.c());
    }

    public static class b
    implements N {
        public N[] a;

        public /* varargs */ b(N ... arrn) {
            this.a = arrn;
        }

        @Override
        public M a(Class class_) {
            for (N n8 : this.a) {
                if (!n8.b(class_)) continue;
                return n8.a(class_);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No factory is available for message type: ");
            stringBuilder.append(class_.getName());
            throw new UnsupportedOperationException(stringBuilder.toString());
        }

        @Override
        public boolean b(Class class_) {
            N[] arrn = this.a;
            int n8 = arrn.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!arrn[i8].b(class_)) continue;
                return true;
            }
            return false;
        }
    }

}

