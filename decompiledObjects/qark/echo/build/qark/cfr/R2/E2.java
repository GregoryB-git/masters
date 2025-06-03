/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 */
package R2;

import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.Q7;

public abstract class E2 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] arrn;
        arrn = new int[I1.e.values().length];
        b = arrn;
        try {
            arrn[I1.e.q.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            E2.b[I1.e.r.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            E2.b[I1.e.s.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            E2.b[I1.e.t.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        arrn = new int[Q7.values().length];
        a = arrn;
        try {
            arrn[Q7.p.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            E2.a[Q7.q.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            E2.a[Q7.t.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            E2.a[Q7.s.ordinal()] = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

