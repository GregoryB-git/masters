package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025t extends AbstractC0972n implements InterfaceC0963m {

    /* renamed from: q, reason: collision with root package name */
    public final List f11147q;

    /* renamed from: r, reason: collision with root package name */
    public final List f11148r;

    /* renamed from: s, reason: collision with root package name */
    public C0904f3 f11149s;

    public C1025t(C1025t c1025t) {
        super(c1025t.f11052o);
        ArrayList arrayList = new ArrayList(c1025t.f11147q.size());
        this.f11147q = arrayList;
        arrayList.addAll(c1025t.f11147q);
        ArrayList arrayList2 = new ArrayList(c1025t.f11148r.size());
        this.f11148r = arrayList2;
        arrayList2.addAll(c1025t.f11148r);
        this.f11149s = c1025t.f11149s;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0972n
    public final InterfaceC1016s b(C0904f3 c0904f3, List list) {
        String str;
        InterfaceC1016s interfaceC1016s;
        C0904f3 d7 = this.f11149s.d();
        for (int i7 = 0; i7 < this.f11147q.size(); i7++) {
            if (i7 < list.size()) {
                str = (String) this.f11147q.get(i7);
                interfaceC1016s = c0904f3.b((InterfaceC1016s) list.get(i7));
            } else {
                str = (String) this.f11147q.get(i7);
                interfaceC1016s = InterfaceC1016s.f11133d;
            }
            d7.e(str, interfaceC1016s);
        }
        for (InterfaceC1016s interfaceC1016s2 : this.f11148r) {
            InterfaceC1016s b7 = d7.b(interfaceC1016s2);
            if (b7 instanceof C1043v) {
                b7 = d7.b(interfaceC1016s2);
            }
            if (b7 instanceof C0954l) {
                return ((C0954l) b7).a();
            }
        }
        return InterfaceC1016s.f11133d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0972n, com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s c() {
        return new C1025t(this);
    }

    public C1025t(String str, List list, List list2, C0904f3 c0904f3) {
        super(str);
        this.f11147q = new ArrayList();
        this.f11149s = c0904f3;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f11147q.add(((InterfaceC1016s) it.next()).g());
            }
        }
        this.f11148r = new ArrayList(list2);
    }
}
