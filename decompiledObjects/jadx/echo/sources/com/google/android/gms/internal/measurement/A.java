package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public final List f10287a = new ArrayList();

    public final InterfaceC1016s a(String str) {
        if (!this.f10287a.contains(C2.c(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + str);
    }

    public abstract InterfaceC1016s b(String str, C0904f3 c0904f3, List list);
}
