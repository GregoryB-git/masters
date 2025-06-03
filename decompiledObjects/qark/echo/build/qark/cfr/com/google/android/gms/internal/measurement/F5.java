/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

public abstract class F5 {
    public abstract int a(int var1, byte[] var2, int var3, int var4);

    public abstract int b(CharSequence var1, byte[] var2, int var3, int var4);

    public abstract String c(byte[] var1, int var2, int var3);

    public final boolean d(byte[] arrby, int n8, int n9) {
        if (this.a(0, arrby, n8, n9) == 0) {
            return true;
        }
        return false;
    }
}

