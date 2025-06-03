package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import d2.d;
import g2.InterfaceC1317d;
import g2.h;
import g2.m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC1317d {
    @Override // g2.InterfaceC1317d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
