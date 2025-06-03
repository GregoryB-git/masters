package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995p4 extends AbstractC1004q4 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f11099c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public C0995p4() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List e(Object obj, long j7, int i7) {
        List e7;
        C0986o4 c0986o4;
        List f7 = f(obj, j7);
        if (!f7.isEmpty()) {
            if (f11099c.isAssignableFrom(f7.getClass())) {
                ArrayList arrayList = new ArrayList(f7.size() + i7);
                arrayList.addAll(f7);
                c0986o4 = arrayList;
            } else if (f7 instanceof C1076y5) {
                C0986o4 c0986o42 = new C0986o4(f7.size() + i7);
                c0986o42.addAll((C1076y5) f7);
                c0986o4 = c0986o42;
            } else {
                if (!(f7 instanceof S4) || !(f7 instanceof InterfaceC0923h4)) {
                    return f7;
                }
                InterfaceC0923h4 interfaceC0923h4 = (InterfaceC0923h4) f7;
                if (interfaceC0923h4.c()) {
                    return f7;
                }
                e7 = interfaceC0923h4.e(f7.size() + i7);
            }
            D5.j(obj, j7, c0986o4);
            return c0986o4;
        }
        e7 = f7 instanceof InterfaceC0977n4 ? new C0986o4(i7) : ((f7 instanceof S4) && (f7 instanceof InterfaceC0923h4)) ? ((InterfaceC0923h4) f7).e(i7) : new ArrayList(i7);
        D5.j(obj, j7, e7);
        return e7;
    }

    public static List f(Object obj, long j7) {
        return (List) D5.B(obj, j7);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1004q4
    public final void b(Object obj, Object obj2, long j7) {
        List f7 = f(obj2, j7);
        List e7 = e(obj, j7, f7.size());
        int size = e7.size();
        int size2 = f7.size();
        if (size > 0 && size2 > 0) {
            e7.addAll(f7);
        }
        if (size > 0) {
            f7 = e7;
        }
        D5.j(obj, j7, f7);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1004q4
    public final void d(Object obj, long j7) {
        Object unmodifiableList;
        List list = (List) D5.B(obj, j7);
        if (list instanceof InterfaceC0977n4) {
            unmodifiableList = ((InterfaceC0977n4) list).w();
        } else {
            if (f11099c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof S4) && (list instanceof InterfaceC0923h4)) {
                InterfaceC0923h4 interfaceC0923h4 = (InterfaceC0923h4) list;
                if (interfaceC0923h4.c()) {
                    interfaceC0923h4.G();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        D5.j(obj, j7, unmodifiableList);
    }
}
