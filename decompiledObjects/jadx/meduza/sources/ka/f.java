package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;

/* loaded from: classes.dex */
public final class f extends ma.w<f, a> implements t0 {
    public static final int BITMAP_FIELD_NUMBER = 1;
    private static final f DEFAULT_INSTANCE;
    public static final int PADDING_FIELD_NUMBER = 2;
    private static volatile b1<f> PARSER;
    private ma.h bitmap_ = ma.h.f10961b;
    private int padding_;

    public static final class a extends w.a<f, a> implements t0 {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        ma.w.D(f.class, fVar);
    }

    public static f H() {
        return DEFAULT_INSTANCE;
    }

    public final ma.h G() {
        return this.bitmap_;
    }

    public final int I() {
        return this.padding_;
    }

    @Override // ma.w
    public final Object t(w.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new f1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"bitmap_", "padding_"});
            case NEW_MUTABLE_INSTANCE:
                return new f();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                b1<f> b1Var = PARSER;
                if (b1Var == null) {
                    synchronized (f.class) {
                        b1Var = PARSER;
                        if (b1Var == null) {
                            b1Var = new w.b<>(DEFAULT_INSTANCE);
                            PARSER = b1Var;
                        }
                    }
                }
                return b1Var;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
