package com.google.protobuf;

import com.google.protobuf.AbstractC1154t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f11960a;

    /* renamed from: b, reason: collision with root package name */
    public static final A f11961b;

    public static final class b extends A {

        /* renamed from: c, reason: collision with root package name */
        public static final Class f11962c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        public static List e(Object obj, long j7) {
            return (List) k0.C(obj, j7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static List f(Object obj, long j7, int i7) {
            List h7;
            C1159y c1159y;
            List e7 = e(obj, j7);
            if (!e7.isEmpty()) {
                if (f11962c.isAssignableFrom(e7.getClass())) {
                    ArrayList arrayList = new ArrayList(e7.size() + i7);
                    arrayList.addAll(e7);
                    c1159y = arrayList;
                } else if (e7 instanceof j0) {
                    C1159y c1159y2 = new C1159y(e7.size() + i7);
                    c1159y2.addAll((j0) e7);
                    c1159y = c1159y2;
                } else {
                    if (!(e7 instanceof U) || !(e7 instanceof AbstractC1154t.e)) {
                        return e7;
                    }
                    AbstractC1154t.e eVar = (AbstractC1154t.e) e7;
                    if (eVar.p()) {
                        return e7;
                    }
                    h7 = eVar.h(e7.size() + i7);
                }
                k0.R(obj, j7, c1159y);
                return c1159y;
            }
            h7 = e7 instanceof InterfaceC1160z ? new C1159y(i7) : ((e7 instanceof U) && (e7 instanceof AbstractC1154t.e)) ? ((AbstractC1154t.e) e7).h(i7) : new ArrayList(i7);
            k0.R(obj, j7, h7);
            return h7;
        }

        @Override // com.google.protobuf.A
        public void c(Object obj, long j7) {
            Object unmodifiableList;
            List list = (List) k0.C(obj, j7);
            if (list instanceof InterfaceC1160z) {
                unmodifiableList = ((InterfaceC1160z) list).m();
            } else {
                if (f11962c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof U) && (list instanceof AbstractC1154t.e)) {
                    AbstractC1154t.e eVar = (AbstractC1154t.e) list;
                    if (eVar.p()) {
                        eVar.j();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            k0.R(obj, j7, unmodifiableList);
        }

        @Override // com.google.protobuf.A
        public void d(Object obj, Object obj2, long j7) {
            List e7 = e(obj2, j7);
            List f7 = f(obj, j7, e7.size());
            int size = f7.size();
            int size2 = e7.size();
            if (size > 0 && size2 > 0) {
                f7.addAll(e7);
            }
            if (size > 0) {
                e7 = f7;
            }
            k0.R(obj, j7, e7);
        }
    }

    public static final class c extends A {
        public c() {
            super();
        }

        public static AbstractC1154t.e e(Object obj, long j7) {
            return (AbstractC1154t.e) k0.C(obj, j7);
        }

        @Override // com.google.protobuf.A
        public void c(Object obj, long j7) {
            e(obj, j7).j();
        }

        @Override // com.google.protobuf.A
        public void d(Object obj, Object obj2, long j7) {
            AbstractC1154t.e e7 = e(obj, j7);
            AbstractC1154t.e e8 = e(obj2, j7);
            int size = e7.size();
            int size2 = e8.size();
            if (size > 0 && size2 > 0) {
                if (!e7.p()) {
                    e7 = e7.h(size2 + size);
                }
                e7.addAll(e8);
            }
            if (size > 0) {
                e8 = e7;
            }
            k0.R(obj, j7, e8);
        }
    }

    static {
        f11960a = new b();
        f11961b = new c();
    }

    public A() {
    }

    public static A a() {
        return f11960a;
    }

    public static A b() {
        return f11961b;
    }

    public abstract void c(Object obj, long j7);

    public abstract void d(Object obj, Object obj2, long j7);
}
