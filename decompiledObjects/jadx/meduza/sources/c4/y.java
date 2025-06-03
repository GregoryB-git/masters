package c4;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import v3.a1;
import v5.e0;

/* loaded from: classes.dex */
public final class y {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f2335a;

        public a(String[] strArr) {
            this.f2335a = strArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2336a;

        public b(boolean z10) {
            this.f2336a = z10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f2337a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2338b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2339c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2340d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2341e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f2342g;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr) {
            this.f2337a = i10;
            this.f2338b = i11;
            this.f2339c = i12;
            this.f2340d = i13;
            this.f2341e = i14;
            this.f = i15;
            this.f2342g = bArr;
        }
    }

    public static p4.a a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            int i11 = e0.f15881a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                v5.m.f("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(s4.a.a(new v5.u(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    v5.m.g("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new x4.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new p4.a(arrayList);
    }

    public static a b(v5.u uVar, boolean z10, boolean z11) {
        if (z10) {
            c(3, uVar, false);
        }
        uVar.s((int) uVar.l());
        long l10 = uVar.l();
        String[] strArr = new String[(int) l10];
        for (int i10 = 0; i10 < l10; i10++) {
            strArr[i10] = uVar.s((int) uVar.l());
        }
        if (z11 && (uVar.v() & 1) == 0) {
            throw a1.a("framing bit expected to be set", null);
        }
        return new a(strArr);
    }

    public static boolean c(int i10, v5.u uVar, boolean z10) {
        if (uVar.f15976c - uVar.f15975b < 7) {
            if (z10) {
                return false;
            }
            StringBuilder l10 = defpackage.f.l("too short header: ");
            l10.append(uVar.f15976c - uVar.f15975b);
            throw a1.a(l10.toString(), null);
        }
        if (uVar.v() != i10) {
            if (z10) {
                return false;
            }
            StringBuilder l11 = defpackage.f.l("expected header type ");
            l11.append(Integer.toHexString(i10));
            throw a1.a(l11.toString(), null);
        }
        if (uVar.v() == 118 && uVar.v() == 111 && uVar.v() == 114 && uVar.v() == 98 && uVar.v() == 105 && uVar.v() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw a1.a("expected characters 'vorbis'", null);
    }
}
