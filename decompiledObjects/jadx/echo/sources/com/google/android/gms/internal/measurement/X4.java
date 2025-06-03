package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class X4 {

    /* renamed from: a, reason: collision with root package name */
    public Map f10711a = new HashMap();

    public final InterfaceC1016s a(String str) {
        if (!this.f10711a.containsKey(str)) {
            return InterfaceC1016s.f11133d;
        }
        try {
            return (InterfaceC1016s) ((Callable) this.f10711a.get(str)).call();
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to create API implementation: " + str);
        }
    }

    public final void b(String str, Callable callable) {
        this.f10711a.put(str, callable);
    }
}
