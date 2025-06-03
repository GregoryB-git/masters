package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class U extends A {
    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1016s b(String str, C0904f3 c0904f3, List list) {
        if (str == null || str.isEmpty() || !c0904f3.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC1016s c7 = c0904f3.c(str);
        if (c7 instanceof AbstractC0972n) {
            return ((AbstractC0972n) c7).b(c0904f3, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
