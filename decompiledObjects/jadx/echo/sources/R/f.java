package R;

import androidx.datastore.preferences.protobuf.AbstractC0775w;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.r0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends AbstractC0775w implements P {
    private static final f DEFAULT_INSTANCE;
    private static volatile X PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private I preferences_ = I.f();

    public static final class a extends AbstractC0775w.a implements P {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }

        public a A(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            v();
            ((f) this.f9187p).J().put(str, hVar);
            return this;
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final H f4506a = H.d(r0.b.f9094y, "", r0.b.f9077A, h.Q());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0775w.F(f.class, fVar);
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static f O(InputStream inputStream) {
        return (f) AbstractC0775w.D(DEFAULT_INSTANCE, inputStream);
    }

    public final Map J() {
        return L();
    }

    public Map K() {
        return Collections.unmodifiableMap(M());
    }

    public final I L() {
        if (!this.preferences_.n()) {
            this.preferences_ = this.preferences_.s();
        }
        return this.preferences_;
    }

    public final I M() {
        return this.preferences_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0775w
    public final Object s(AbstractC0775w.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f4505a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0775w.C(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f4506a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 == null) {
                    synchronized (f.class) {
                        try {
                            x7 = PARSER;
                            if (x7 == null) {
                                x7 = new AbstractC0775w.b(DEFAULT_INSTANCE);
                                PARSER = x7;
                            }
                        } finally {
                        }
                    }
                }
                return x7;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
