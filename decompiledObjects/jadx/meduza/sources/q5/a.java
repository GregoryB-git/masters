package q5;

import h5.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import q5.f;
import v5.e0;
import v5.u;

/* loaded from: classes.dex */
public final class a extends h5.f {

    /* renamed from: m, reason: collision with root package name */
    public final u f13277m = new u();

    @Override // h5.f
    public final h5.g h(byte[] bArr, int i10, boolean z10) {
        h5.a a10;
        this.f13277m.E(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            u uVar = this.f13277m;
            int i11 = uVar.f15976c - uVar.f15975b;
            if (i11 <= 0) {
                return new b(arrayList);
            }
            if (i11 < 8) {
                throw new h5.i("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int f = uVar.f();
            if (this.f13277m.f() == 1987343459) {
                u uVar2 = this.f13277m;
                int i12 = f - 8;
                CharSequence charSequence = null;
                a.C0105a c0105a = null;
                while (i12 > 0) {
                    if (i12 < 8) {
                        throw new h5.i("Incomplete vtt cue box header found.");
                    }
                    int f10 = uVar2.f();
                    int f11 = uVar2.f();
                    int i13 = f10 - 8;
                    byte[] bArr2 = uVar2.f15974a;
                    int i14 = uVar2.f15975b;
                    int i15 = e0.f15881a;
                    String str = new String(bArr2, i14, i13, n7.d.f11284c);
                    uVar2.H(i13);
                    i12 = (i12 - 8) - i13;
                    if (f11 == 1937011815) {
                        f.d dVar = new f.d();
                        f.e(str, dVar);
                        c0105a = dVar.a();
                    } else if (f11 == 1885436268) {
                        charSequence = f.f(null, str.trim(), Collections.emptyList());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (c0105a != null) {
                    c0105a.f7110a = charSequence;
                    a10 = c0105a.a();
                } else {
                    Pattern pattern = f.f13302a;
                    f.d dVar2 = new f.d();
                    dVar2.f13317c = charSequence;
                    a10 = dVar2.a().a();
                }
                arrayList.add(a10);
            } else {
                this.f13277m.H(f - 8);
            }
        }
    }
}
