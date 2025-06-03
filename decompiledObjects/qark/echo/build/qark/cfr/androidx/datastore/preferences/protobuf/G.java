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
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.M;
import androidx.datastore.preferences.protobuf.N;
import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.Z;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.f0;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.r;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.y;
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
        this.a = (N)y.b(n8, "messageInfoFactory");
    }

    public static N b() {
        return new b(v.c(), G.c());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static N c() {
        try {
            return (N)Class.forName((String)"androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object)null, new Object[0]);
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
        if (w.class.isAssignableFrom(class_)) {
            if (G.d(m8)) {
                return S.M(class_, m8, W.b(), E.b(), g0.L(), r.b(), L.b());
            }
            return S.M(class_, m8, W.b(), E.b(), g0.L(), null, L.b());
        }
        if (G.d(m8)) {
            return S.M(class_, m8, W.a(), E.a(), g0.G(), r.a(), L.a());
        }
        return S.M(class_, m8, W.a(), E.a(), g0.H(), null, L.a());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public e0 a(Class object) {
        l0 l02;
        g0.I((Class)object);
        M m8 = this.a.a((Class)object);
        if (!m8.a()) return G.e((Class)object, m8);
        if (w.class.isAssignableFrom((Class)object)) {
            l02 = g0.L();
            object = r.b();
            do {
                return T.l(l02, (p)object, m8.c());
                break;
            } while (true);
        }
        l02 = g0.G();
        object = r.a();
        return T.l(l02, (p)object, m8.c());
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

