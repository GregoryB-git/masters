package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class S7 extends AbstractC0972n {

    /* renamed from: q, reason: collision with root package name */
    public boolean f10586q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10587r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P7 f10588s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7(P7 p7, boolean z7, boolean z8) {
        super("log");
        this.f10588s = p7;
        this.f10586q = z7;
        this.f10587r = z8;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0972n
    public final InterfaceC1016s b(C0904f3 c0904f3, List list) {
        List arrayList;
        T7 t7;
        T7 t72;
        C2.k("log", 1, list);
        if (list.size() == 1) {
            t72 = this.f10588s.f10545q;
            t72.a(Q7.INFO, c0904f3.b((InterfaceC1016s) list.get(0)).g(), Collections.emptyList(), this.f10586q, this.f10587r);
        } else {
            Q7 c7 = Q7.c(C2.i(c0904f3.b((InterfaceC1016s) list.get(0)).f().doubleValue()));
            String g7 = c0904f3.b((InterfaceC1016s) list.get(1)).g();
            if (list.size() == 2) {
                t7 = this.f10588s.f10545q;
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList();
                for (int i7 = 2; i7 < Math.min(list.size(), 5); i7++) {
                    arrayList.add(c0904f3.b((InterfaceC1016s) list.get(i7)).g());
                }
                t7 = this.f10588s.f10545q;
            }
            t7.a(c7, g7, arrayList, this.f10586q, this.f10587r);
        }
        return InterfaceC1016s.f11133d;
    }
}
