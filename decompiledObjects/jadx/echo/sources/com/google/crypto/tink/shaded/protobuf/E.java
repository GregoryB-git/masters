package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC1110z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f11275a;

    /* renamed from: b, reason: collision with root package name */
    public static final E f11276b;

    public static final class b extends E {

        /* renamed from: c, reason: collision with root package name */
        public static final Class f11277c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        public static List f(Object obj, long j7) {
            return (List) o0.C(obj, j7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static List g(Object obj, long j7, int i7) {
            List h7;
            C c7;
            List f7 = f(obj, j7);
            if (!f7.isEmpty()) {
                if (f11277c.isAssignableFrom(f7.getClass())) {
                    ArrayList arrayList = new ArrayList(f7.size() + i7);
                    arrayList.addAll(f7);
                    c7 = arrayList;
                } else if (f7 instanceof n0) {
                    C c8 = new C(f7.size() + i7);
                    c8.addAll((n0) f7);
                    c7 = c8;
                } else {
                    if (!(f7 instanceof Y) || !(f7 instanceof AbstractC1110z.d)) {
                        return f7;
                    }
                    AbstractC1110z.d dVar = (AbstractC1110z.d) f7;
                    if (dVar.p()) {
                        return f7;
                    }
                    h7 = dVar.h(f7.size() + i7);
                }
                o0.R(obj, j7, c7);
                return c7;
            }
            h7 = f7 instanceof D ? new C(i7) : ((f7 instanceof Y) && (f7 instanceof AbstractC1110z.d)) ? ((AbstractC1110z.d) f7).h(i7) : new ArrayList(i7);
            o0.R(obj, j7, h7);
            return h7;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public void c(Object obj, long j7) {
            Object unmodifiableList;
            List list = (List) o0.C(obj, j7);
            if (list instanceof D) {
                unmodifiableList = ((D) list).m();
            } else {
                if (f11277c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof Y) && (list instanceof AbstractC1110z.d)) {
                    AbstractC1110z.d dVar = (AbstractC1110z.d) list;
                    if (dVar.p()) {
                        dVar.j();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            o0.R(obj, j7, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public void d(Object obj, Object obj2, long j7) {
            List f7 = f(obj2, j7);
            List g7 = g(obj, j7, f7.size());
            int size = g7.size();
            int size2 = f7.size();
            if (size > 0 && size2 > 0) {
                g7.addAll(f7);
            }
            if (size > 0) {
                f7 = g7;
            }
            o0.R(obj, j7, f7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public List e(Object obj, long j7) {
            return g(obj, j7, 10);
        }
    }

    public static final class c extends E {
        public c() {
            super();
        }

        public static AbstractC1110z.d f(Object obj, long j7) {
            return (AbstractC1110z.d) o0.C(obj, j7);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public void c(Object obj, long j7) {
            f(obj, j7).j();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public void d(Object obj, Object obj2, long j7) {
            AbstractC1110z.d f7 = f(obj, j7);
            AbstractC1110z.d f8 = f(obj2, j7);
            int size = f7.size();
            int size2 = f8.size();
            if (size > 0 && size2 > 0) {
                if (!f7.p()) {
                    f7 = f7.h(size2 + size);
                }
                f7.addAll(f8);
            }
            if (size > 0) {
                f8 = f7;
            }
            o0.R(obj, j7, f8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public List e(Object obj, long j7) {
            AbstractC1110z.d f7 = f(obj, j7);
            if (f7.p()) {
                return f7;
            }
            int size = f7.size();
            AbstractC1110z.d h7 = f7.h(size == 0 ? 10 : size * 2);
            o0.R(obj, j7, h7);
            return h7;
        }
    }

    static {
        f11275a = new b();
        f11276b = new c();
    }

    public E() {
    }

    public static E a() {
        return f11275a;
    }

    public static E b() {
        return f11276b;
    }

    public abstract void c(Object obj, long j7);

    public abstract void d(Object obj, Object obj2, long j7);

    public abstract List e(Object obj, long j7);
}
