package com.google.android.datatransport.cct;

import i3.b;
import l3.d;
import l3.h;
import l3.m;

/* loaded from: classes.dex */
public class CctBackendFactory implements d {
    @Override // l3.d
    public m create(h hVar) {
        return new b(hVar.a(), hVar.d(), hVar.c());
    }
}
