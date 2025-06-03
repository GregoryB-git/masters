/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 */
package com.google.firebase.perf.network;

import B6.a;
import B6.b;
import B6.e;
import B6.g;
import I4.i;
import I4.j;
import L4.k;
import M4.l;
import androidx.annotation.Keep;
import java.io.IOException;

public class FirebasePerfOkHttpClient {
    public static void a(g g8, G4.j j8, long l8, long l9) {
        throw null;
    }

    @Keep
    public static void enqueue(a a8, b b8) {
        l l8 = new l();
        long l9 = l8.e();
        a8.k(new i(b8, k.l(), l8, l9));
    }

    @Keep
    public static g execute(a a8) {
        G4.j j8 = G4.j.h(k.l());
        l l8 = new l();
        long l9 = l8.e();
        try {
            a8.e();
            FirebasePerfOkHttpClient.a(null, j8, l9, l8.c());
            return null;
        }
        catch (IOException iOException) {
            a8.q();
            j8.w(l9);
            j8.A(l8.c());
            j.d(j8);
            throw iOException;
        }
    }
}

