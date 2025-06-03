package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020s3 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC1003q3 abstractC1003q3 = (AbstractC1003q3) obj;
        AbstractC1003q3 abstractC1003q32 = (AbstractC1003q3) obj2;
        InterfaceC1056w3 interfaceC1056w3 = (InterfaceC1056w3) abstractC1003q3.iterator();
        InterfaceC1056w3 interfaceC1056w32 = (InterfaceC1056w3) abstractC1003q32.iterator();
        while (interfaceC1056w3.hasNext() && interfaceC1056w32.hasNext()) {
            int compareTo = Integer.valueOf(AbstractC1003q3.f(interfaceC1056w3.a())).compareTo(Integer.valueOf(AbstractC1003q3.f(interfaceC1056w32.a())));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(abstractC1003q3.S()).compareTo(Integer.valueOf(abstractC1003q32.S()));
    }
}
