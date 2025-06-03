package R;

import androidx.datastore.preferences.protobuf.AbstractC0754a;
import androidx.datastore.preferences.protobuf.AbstractC0775w;
import androidx.datastore.preferences.protobuf.AbstractC0777y;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends AbstractC0775w implements P {
    private static final g DEFAULT_INSTANCE;
    private static volatile X PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC0777y.b strings_ = AbstractC0775w.t();

    public static final class a extends AbstractC0775w.a implements P {
        public a() {
            super(g.DEFAULT_INSTANCE);
        }

        public a A(Iterable iterable) {
            v();
            ((g) this.f9187p).J(iterable);
            return this;
        }

        public /* synthetic */ a(e eVar) {
            this();
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0775w.F(g.class, gVar);
    }

    public static g L() {
        return DEFAULT_INSTANCE;
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public final void J(Iterable iterable) {
        K();
        AbstractC0754a.e(iterable, this.strings_);
    }

    public final void K() {
        if (this.strings_.p()) {
            return;
        }
        this.strings_ = AbstractC0775w.A(this.strings_);
    }

    public List M() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0775w
    public final Object s(AbstractC0775w.d dVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f4505a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0775w.C(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x7 = PARSER;
                if (x7 == null) {
                    synchronized (g.class) {
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
