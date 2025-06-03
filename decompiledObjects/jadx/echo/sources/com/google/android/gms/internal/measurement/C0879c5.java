package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0879c5 extends AbstractC0888d5 {
    public C0879c5(int i7) {
        super(i7);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0888d5
    public final void f() {
        if (!o()) {
            if (g() > 0) {
                android.support.v4.media.a.a(h(0).getKey());
                throw null;
            }
            Iterator it = j().iterator();
            if (it.hasNext()) {
                android.support.v4.media.a.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.f();
    }
}
