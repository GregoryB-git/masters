// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public final class H5 extends IllegalArgumentException
{
    public H5(final int i, final int j) {
        final StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(j);
        super(sb.toString());
    }
}
