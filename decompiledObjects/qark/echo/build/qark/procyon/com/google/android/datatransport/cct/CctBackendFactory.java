// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.datatransport.cct;

import g2.m;
import g2.h;
import androidx.annotation.Keep;
import g2.d;

@Keep
public class CctBackendFactory implements d
{
    @Override
    public m create(final h h) {
        return new d2.d(h.b(), h.e(), h.d());
    }
}
