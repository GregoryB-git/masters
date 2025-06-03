/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.internal.measurement;

public final class H5
extends IllegalArgumentException {
    public H5(int n8, int n9) {
        StringBuilder stringBuilder = new StringBuilder("Unpaired surrogate at index ");
        stringBuilder.append(n8);
        stringBuilder.append(" of ");
        stringBuilder.append(n9);
        super(stringBuilder.toString());
    }
}

