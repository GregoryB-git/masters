package a4;

import android.net.Uri;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import o7.x0;
import t5.s;
import v3.o0;
import v5.e0;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f164a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public o0.d f165b;

    /* renamed from: c, reason: collision with root package name */
    public b f166c;

    public static b b(o0.d dVar) {
        s.a aVar = new s.a();
        aVar.f14607b = null;
        Uri uri = dVar.f15567b;
        t tVar = new t(uri == null ? null : uri.toString(), dVar.f, aVar);
        o7.u<String, String> uVar = dVar.f15568c;
        o7.x xVar = uVar.f12057a;
        if (xVar == null) {
            xVar = uVar.c();
            uVar.f12057a = xVar;
        }
        x0 it = xVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (tVar.f205d) {
                tVar.f205d.put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = v3.h.f15394a;
        t5.u uVar2 = new t5.u();
        UUID uuid2 = dVar.f15566a;
        defpackage.g gVar = s.f198d;
        uuid2.getClass();
        boolean z10 = dVar.f15569d;
        boolean z11 = dVar.f15570e;
        int[] F = r7.a.F(dVar.f15571g);
        for (int i10 : F) {
            boolean z12 = true;
            if (i10 != 2 && i10 != 1) {
                z12 = false;
            }
            x6.b.q(z12);
        }
        b bVar = new b(uuid2, gVar, tVar, hashMap, z10, (int[]) F.clone(), z11, uVar2, 300000L);
        byte[] bArr = dVar.f15572h;
        byte[] copyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        x6.b.H(bVar.f143m.isEmpty());
        bVar.f151v = 0;
        bVar.f152w = copyOf;
        return bVar;
    }

    @Override // a4.i
    public final h a(o0 o0Var) {
        b bVar;
        o0Var.f15535b.getClass();
        o0.d dVar = o0Var.f15535b.f15597c;
        if (dVar == null || e0.f15881a < 18) {
            return h.f185a;
        }
        synchronized (this.f164a) {
            if (!e0.a(dVar, this.f165b)) {
                this.f165b = dVar;
                this.f166c = b(dVar);
            }
            bVar = this.f166c;
            bVar.getClass();
        }
        return bVar;
    }
}
