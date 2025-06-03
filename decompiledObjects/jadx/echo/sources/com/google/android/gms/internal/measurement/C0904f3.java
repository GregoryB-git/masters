package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904f3 {

    /* renamed from: a, reason: collision with root package name */
    public final C0904f3 f10947a;

    /* renamed from: b, reason: collision with root package name */
    public E f10948b;

    /* renamed from: c, reason: collision with root package name */
    public Map f10949c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public Map f10950d = new HashMap();

    public C0904f3(C0904f3 c0904f3, E e7) {
        this.f10947a = c0904f3;
        this.f10948b = e7;
    }

    public final InterfaceC1016s a(C0909g c0909g) {
        InterfaceC1016s interfaceC1016s = InterfaceC1016s.f11133d;
        Iterator Z6 = c0909g.Z();
        while (Z6.hasNext()) {
            interfaceC1016s = this.f10948b.a(this, c0909g.M(((Integer) Z6.next()).intValue()));
            if (interfaceC1016s instanceof C0954l) {
                break;
            }
        }
        return interfaceC1016s;
    }

    public final InterfaceC1016s b(InterfaceC1016s interfaceC1016s) {
        return this.f10948b.a(this, interfaceC1016s);
    }

    public final InterfaceC1016s c(String str) {
        C0904f3 c0904f3 = this;
        while (!c0904f3.f10949c.containsKey(str)) {
            c0904f3 = c0904f3.f10947a;
            if (c0904f3 == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return (InterfaceC1016s) c0904f3.f10949c.get(str);
    }

    public final C0904f3 d() {
        return new C0904f3(this, this.f10948b);
    }

    public final void e(String str, InterfaceC1016s interfaceC1016s) {
        if (this.f10950d.containsKey(str)) {
            return;
        }
        if (interfaceC1016s == null) {
            this.f10949c.remove(str);
        } else {
            this.f10949c.put(str, interfaceC1016s);
        }
    }

    public final void f(String str, InterfaceC1016s interfaceC1016s) {
        e(str, interfaceC1016s);
        this.f10950d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        C0904f3 c0904f3 = this;
        while (!c0904f3.f10949c.containsKey(str)) {
            c0904f3 = c0904f3.f10947a;
            if (c0904f3 == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, InterfaceC1016s interfaceC1016s) {
        C0904f3 c0904f3;
        C0904f3 c0904f32 = this;
        while (!c0904f32.f10949c.containsKey(str) && (c0904f3 = c0904f32.f10947a) != null && c0904f3.g(str)) {
            c0904f32 = c0904f32.f10947a;
        }
        if (c0904f32.f10950d.containsKey(str)) {
            return;
        }
        if (interfaceC1016s == null) {
            c0904f32.f10949c.remove(str);
        } else {
            c0904f32.f10949c.put(str, interfaceC1016s);
        }
    }
}
