package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class K implements Comparator {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0972n f10453o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0904f3 f10454p;

    public K(AbstractC0972n abstractC0972n, C0904f3 c0904f3) {
        this.f10453o = abstractC0972n;
        this.f10454p = c0904f3;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC1016s interfaceC1016s = (InterfaceC1016s) obj;
        InterfaceC1016s interfaceC1016s2 = (InterfaceC1016s) obj2;
        AbstractC0972n abstractC0972n = this.f10453o;
        C0904f3 c0904f3 = this.f10454p;
        if (interfaceC1016s instanceof C1078z) {
            return !(interfaceC1016s2 instanceof C1078z) ? 1 : 0;
        }
        if (interfaceC1016s2 instanceof C1078z) {
            return -1;
        }
        return abstractC0972n == null ? interfaceC1016s.g().compareTo(interfaceC1016s2.g()) : (int) C2.a(abstractC0972n.b(c0904f3, Arrays.asList(interfaceC1016s, interfaceC1016s2)).f().doubleValue());
    }
}
