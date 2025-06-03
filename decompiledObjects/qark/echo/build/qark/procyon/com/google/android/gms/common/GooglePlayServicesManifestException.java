// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public abstract class GooglePlayServicesManifestException extends IllegalStateException
{
    public final int o;
    
    public GooglePlayServicesManifestException(final int o, final String s) {
        super(s);
        this.o = o;
    }
}
