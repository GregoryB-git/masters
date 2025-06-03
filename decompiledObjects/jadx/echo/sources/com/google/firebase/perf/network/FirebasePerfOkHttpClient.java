package com.google.firebase.perf.network;

import B6.a;
import B6.b;
import B6.g;
import G4.j;
import I4.i;
import L4.k;
import M4.l;
import androidx.annotation.Keep;
import java.io.IOException;

/* loaded from: classes.dex */
public class FirebasePerfOkHttpClient {
    public static void a(g gVar, j jVar, long j7, long j8) {
        throw null;
    }

    @Keep
    public static void enqueue(a aVar, b bVar) {
        l lVar = new l();
        aVar.k(new i(bVar, k.l(), lVar, lVar.e()));
    }

    @Keep
    public static g execute(a aVar) {
        j h7 = j.h(k.l());
        l lVar = new l();
        long e7 = lVar.e();
        try {
            aVar.e();
            a(null, h7, e7, lVar.c());
            return null;
        } catch (IOException e8) {
            aVar.q();
            h7.w(e7);
            h7.A(lVar.c());
            I4.j.d(h7);
            throw e8;
        }
    }
}
