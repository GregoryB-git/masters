package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class X5 extends r {

    /* renamed from: p, reason: collision with root package name */
    public final C0882d f10712p;

    public X5(C0882d c0882d) {
        this.f10712p = c0882d;
    }

    @Override // com.google.android.gms.internal.measurement.r, com.google.android.gms.internal.measurement.InterfaceC1016s
    public final InterfaceC1016s s(String str, C0904f3 c0904f3, List list) {
        str.hashCode();
        switch (str) {
            case "getEventName":
                C2.g("getEventName", 0, list);
                return new C1034u(this.f10712p.d().e());
            case "getTimestamp":
                C2.g("getTimestamp", 0, list);
                return new C0945k(Double.valueOf(this.f10712p.d().a()));
            case "getParamValue":
                C2.g("getParamValue", 1, list);
                return AbstractC0869b4.b(this.f10712p.d().b(c0904f3.b((InterfaceC1016s) list.get(0)).g()));
            case "getParams":
                C2.g("getParams", 0, list);
                Map g7 = this.f10712p.d().g();
                r rVar = new r();
                for (String str2 : g7.keySet()) {
                    rVar.a(str2, AbstractC0869b4.b(g7.get(str2)));
                }
                return rVar;
            case "setParamValue":
                C2.g("setParamValue", 2, list);
                String g8 = c0904f3.b((InterfaceC1016s) list.get(0)).g();
                InterfaceC1016s b7 = c0904f3.b((InterfaceC1016s) list.get(1));
                this.f10712p.d().d(g8, C2.d(b7));
                return b7;
            case "setEventName":
                C2.g("setEventName", 1, list);
                InterfaceC1016s b8 = c0904f3.b((InterfaceC1016s) list.get(0));
                if (InterfaceC1016s.f11133d.equals(b8) || InterfaceC1016s.f11134e.equals(b8)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                this.f10712p.d().f(b8.g());
                return new C1034u(b8.g());
            default:
                return super.s(str, c0904f3, list);
        }
    }
}
