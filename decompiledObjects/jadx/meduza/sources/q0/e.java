package q0;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import s0.a1;
import s0.d0;
import s0.p0;
import s0.v;
import s0.w0;
import s0.x;
import s0.x0;
import s0.z0;

/* loaded from: classes.dex */
public final class e extends v<e, a> implements p0 {
    private static final e DEFAULT_INSTANCE;
    private static volatile w0<e> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private x.c<String> strings_ = z0.f14135d;

    public static final class a extends v.a<e, a> implements p0 {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        v.o(e.class, eVar);
    }

    public static void q(e eVar, Set set) {
        if (!eVar.strings_.g()) {
            x.c<String> cVar = eVar.strings_;
            int size = cVar.size();
            eVar.strings_ = cVar.c(size == 0 ? 10 : size * 2);
        }
        List list = eVar.strings_;
        Charset charset = x.f14119a;
        set.getClass();
        if (set instanceof d0) {
            List<?> d10 = ((d0) set).d();
            d0 d0Var = (d0) list;
            int size2 = list.size();
            for (Object obj : d10) {
                if (obj == null) {
                    StringBuilder l10 = defpackage.f.l("Element at index ");
                    l10.append(d0Var.size() - size2);
                    l10.append(" is null.");
                    String sb2 = l10.toString();
                    int size3 = d0Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size2) {
                            throw new NullPointerException(sb2);
                        }
                        d0Var.remove(size3);
                    }
                } else if (obj instanceof s0.g) {
                    d0Var.w((s0.g) obj);
                } else {
                    d0Var.add((String) obj);
                }
            }
            return;
        }
        if (set instanceof x0) {
            list.addAll(set);
            return;
        }
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(set.size() + list.size());
        }
        int size4 = list.size();
        for (Object obj2 : set) {
            if (obj2 == null) {
                StringBuilder l11 = defpackage.f.l("Element at index ");
                l11.append(list.size() - size4);
                l11.append(" is null.");
                String sb3 = l11.toString();
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size4) {
                        throw new NullPointerException(sb3);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    public static e r() {
        return DEFAULT_INSTANCE;
    }

    public static a t() {
        return (a) ((v.a) DEFAULT_INSTANCE.k(v.f.NEW_BUILDER));
    }

    @Override // s0.v
    public final Object k(v.f fVar) {
        switch (fVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return new a1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case NEW_MUTABLE_INSTANCE:
                return new e();
            case NEW_BUILDER:
                return new a();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                w0<e> w0Var = PARSER;
                if (w0Var == null) {
                    synchronized (e.class) {
                        try {
                            w0Var = PARSER;
                            if (w0Var == null) {
                                w0Var = new v.b<>(DEFAULT_INSTANCE);
                                PARSER = w0Var;
                            }
                        } finally {
                        }
                    }
                }
                return w0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final x.c s() {
        return this.strings_;
    }
}
