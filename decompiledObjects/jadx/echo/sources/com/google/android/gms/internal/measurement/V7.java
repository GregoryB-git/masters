package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class V7 extends AbstractC0972n {

    /* renamed from: q, reason: collision with root package name */
    public final Callable f10695q;

    public V7(String str, Callable callable) {
        super(str);
        this.f10695q = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0972n
    public final InterfaceC1016s b(C0904f3 c0904f3, List list) {
        try {
            return AbstractC0869b4.b(this.f10695q.call());
        } catch (Exception unused) {
            return InterfaceC1016s.f11133d;
        }
    }
}
