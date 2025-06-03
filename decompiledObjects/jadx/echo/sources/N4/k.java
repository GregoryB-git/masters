package N4;

import com.google.protobuf.AbstractC1154t;
import com.google.protobuf.InterfaceC1155u;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;

/* loaded from: classes.dex */
public final class k extends r implements L {
    private static final k DEFAULT_INSTANCE;
    private static volatile T PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC1155u sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private AbstractC1154t.d sessionVerbosity_ = r.y();

    public class a implements InterfaceC1155u {
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3677a;

        static {
            int[] iArr = new int[r.c.values().length];
            f3677a = iArr;
            try {
                iArr[r.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3677a[r.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3677a[r.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3677a[r.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3677a[r.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3677a[r.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3677a[r.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class c extends r.a implements L {
        public c() {
            super(k.DEFAULT_INSTANCE);
        }

        public c D(l lVar) {
            y();
            ((k) this.f12237p).W(lVar);
            return this;
        }

        public c E(String str) {
            y();
            ((k) this.f12237p).b0(str);
            return this;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        r.Q(k.class, kVar);
    }

    public static c a0() {
        return (c) DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    public final void W(l lVar) {
        lVar.getClass();
        X();
        this.sessionVerbosity_.z(lVar.g());
    }

    public final void X() {
        AbstractC1154t.d dVar = this.sessionVerbosity_;
        if (dVar.p()) {
            return;
        }
        this.sessionVerbosity_ = r.L(dVar);
    }

    public l Y(int i7) {
        l c7 = l.c(this.sessionVerbosity_.F(i7));
        return c7 == null ? l.SESSION_VERBOSITY_NONE : c7;
    }

    public int Z() {
        return this.sessionVerbosity_.size();
    }

    @Override // com.google.protobuf.r
    public final Object x(r.c cVar, Object obj, Object obj2) {
        a aVar = null;
        switch (b.f3677a[cVar.ordinal()]) {
            case 1:
                return new k();
            case 2:
                return new c(aVar);
            case 3:
                return r.O(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l.e()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t7 = PARSER;
                if (t7 == null) {
                    synchronized (k.class) {
                        try {
                            t7 = PARSER;
                            if (t7 == null) {
                                t7 = new r.b(DEFAULT_INSTANCE);
                                PARSER = t7;
                            }
                        } finally {
                        }
                    }
                }
                return t7;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
