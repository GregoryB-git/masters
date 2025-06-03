// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.perf.network;

import java.io.IOException;
import androidx.annotation.Keep;
import I4.i;
import L4.k;
import M4.l;
import B6.b;
import B6.a;
import G4.j;
import B6.g;

public class FirebasePerfOkHttpClient
{
    public static void a(final g g, final j j, final long n, final long n2) {
        throw null;
    }
    
    @Keep
    public static void enqueue(final a a, final b b) {
        final l l = new l();
        a.k(new i(b, k.l(), l, l.e()));
    }
    
    @Keep
    public static g execute(final a a) {
        final j h = j.h(k.l());
        final l l = new l();
        final long e = l.e();
        try {
            a.e();
            a(null, h, e, l.c());
            return null;
        }
        catch (IOException ex) {
            a.q();
            h.w(e);
            h.A(l.c());
            I4.j.d(h);
            throw ex;
        }
    }
}
