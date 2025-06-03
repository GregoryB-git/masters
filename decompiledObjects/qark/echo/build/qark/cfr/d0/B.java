/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.Throwable
 */
package d0;

import android.os.Bundle;
import g0.M;

public abstract class B
extends Exception {
    public static final String r = M.w0(0);
    public static final String s = M.w0(1);
    public static final String t = M.w0(2);
    public static final String u = M.w0(3);
    public static final String v = M.w0(4);
    public static final String w = M.w0(5);
    public final int o;
    public final long p;
    public final Bundle q;

    public B(String string2, Throwable throwable, int n8, Bundle bundle, long l8) {
        super(string2, throwable);
        this.o = n8;
        this.q = bundle;
        this.p = l8;
    }
}

