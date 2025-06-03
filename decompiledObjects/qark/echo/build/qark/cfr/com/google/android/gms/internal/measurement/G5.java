/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.k4;

public abstract class G5 {
    public static /* synthetic */ void a(byte by, byte by2, byte by3, byte by4, char[] arrc, int n8) {
        if (!(G5.e(by2) || (by << 28) + (by2 + 112) >> 30 != 0 || G5.e(by3) || G5.e(by4))) {
            by = (byte)((by & 7) << 18 | (by2 & 63) << 12 | (by3 & 63) << 6 | by4 & 63);
            arrc[n8] = (char)((by >>> 10) + 55232);
            arrc[n8 + 1] = (char)((by & 1023) + 56320);
            return;
        }
        throw k4.c();
    }

    public static /* synthetic */ void b(byte by, byte by2, byte by3, char[] arrc, int n8) {
        if (!(G5.e(by2) || by == -32 && by2 < -96 || by == -19 && by2 >= -96 || G5.e(by3))) {
            arrc[n8] = (char)((by & 15) << 12 | (by2 & 63) << 6 | by3 & 63);
            return;
        }
        throw k4.c();
    }

    public static /* synthetic */ void c(byte by, byte by2, char[] arrc, int n8) {
        if (by >= -62 && !G5.e(by2)) {
            arrc[n8] = (char)((by & 31) << 6 | by2 & 63);
            return;
        }
        throw k4.c();
    }

    public static /* synthetic */ void d(byte by, char[] arrc, int n8) {
        arrc[n8] = (char)by;
    }

    public static boolean e(byte by) {
        if (by > -65) {
            return true;
        }
        return false;
    }
}

