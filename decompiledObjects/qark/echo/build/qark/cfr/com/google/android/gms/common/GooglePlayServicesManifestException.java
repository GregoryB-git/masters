/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.String
 */
package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public abstract class GooglePlayServicesManifestException
extends IllegalStateException {
    public final int o;

    public GooglePlayServicesManifestException(int n8, String string2) {
        super(string2);
        this.o = n8;
    }
}

