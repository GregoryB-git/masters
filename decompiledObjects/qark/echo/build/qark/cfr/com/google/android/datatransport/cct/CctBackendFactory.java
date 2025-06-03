/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import d2.d;
import g2.h;
import g2.m;
import p2.a;

@Keep
public class CctBackendFactory
implements g2.d {
    @Override
    public m create(h h8) {
        return new d(h8.b(), h8.e(), h8.d());
    }
}

