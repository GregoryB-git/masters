package g1;

import W2.e;
import android.text.Layout;
import c1.C0816e;
import c1.k;
import c1.s;
import c1.t;
import com.android.installreferrer.api.InstallReferrerClient;
import f0.C1280a;
import g0.AbstractC1297a;
import g0.InterfaceC1303g;
import g0.M;
import g0.o;
import g0.z;
import g1.C1313c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1312b implements t {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f14356g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14357a;

    /* renamed from: b, reason: collision with root package name */
    public final C1311a f14358b;

    /* renamed from: d, reason: collision with root package name */
    public Map f14360d;

    /* renamed from: e, reason: collision with root package name */
    public float f14361e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public float f14362f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    public final z f14359c = new z();

    public C1312b(List list) {
        if (list == null || list.isEmpty()) {
            this.f14357a = false;
            this.f14358b = null;
            return;
        }
        this.f14357a = true;
        String H6 = M.H((byte[]) list.get(0));
        AbstractC1297a.a(H6.startsWith("Format:"));
        this.f14358b = (C1311a) AbstractC1297a.e(C1311a.a(H6));
        k(new z((byte[]) list.get(1)), e.f6821c);
    }

    public static int e(long j7, List list, List list2) {
        int i7;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i7 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j7) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j7) {
                i7 = size + 1;
                break;
            }
            size--;
        }
        list.add(i7, Long.valueOf(j7));
        list2.add(i7, i7 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i7 - 1)));
        return i7;
    }

    public static float f(int i7) {
        if (i7 == 0) {
            return 0.05f;
        }
        if (i7 != 1) {
            return i7 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f0.C1280a g(java.lang.String r8, g1.C1313c r9, g1.C1313c.b r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C1312b.g(java.lang.String, g1.c, g1.c$b, float, float):f0.a");
    }

    public static Map m(z zVar, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1313c.a aVar = null;
        while (true) {
            String s7 = zVar.s(charset);
            if (s7 == null || (zVar.a() != 0 && zVar.h(charset) == '[')) {
                break;
            }
            if (s7.startsWith("Format:")) {
                aVar = C1313c.a.a(s7);
            } else if (s7.startsWith("Style:")) {
                if (aVar == null) {
                    o.h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + s7);
                } else {
                    C1313c b7 = C1313c.b(s7, aVar);
                    if (b7 != null) {
                        linkedHashMap.put(b7.f14363a, b7);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long n(String str) {
        Matcher matcher = f14356g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) M.i(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) M.i(matcher.group(2))) * 60000000) + (Long.parseLong((String) M.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) M.i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    public static int o(int i7) {
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                break;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                o.h("SsaParser", "Unknown alignment: " + i7);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static int p(int i7) {
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                break;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                o.h("SsaParser", "Unknown alignment: " + i7);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static Layout.Alignment q(int i7) {
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return null;
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                o.h("SsaParser", "Unknown alignment: " + i7);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // c1.t
    public /* synthetic */ k a(byte[] bArr, int i7, int i8) {
        return s.a(this, bArr, i7, i8);
    }

    @Override // c1.t
    public /* synthetic */ void b() {
        s.b(this);
    }

    @Override // c1.t
    public void c(byte[] bArr, int i7, int i8, t.b bVar, InterfaceC1303g interfaceC1303g) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.f14359c.R(bArr, i7 + i8);
        this.f14359c.T(i7);
        Charset h7 = h(this.f14359c);
        if (!this.f14357a) {
            k(this.f14359c, h7);
        }
        j(this.f14359c, arrayList3, arrayList4, h7);
        ArrayList arrayList5 = (bVar.f10048a == -9223372036854775807L || !bVar.f10049b) ? null : new ArrayList();
        int i9 = 0;
        while (i9 < arrayList3.size()) {
            List list = (List) arrayList3.get(i9);
            if (list.isEmpty() && i9 != 0) {
                arrayList = arrayList3;
                arrayList2 = arrayList4;
            } else {
                if (i9 == arrayList3.size() - 1) {
                    throw new IllegalStateException();
                }
                long longValue = ((Long) arrayList4.get(i9)).longValue();
                long longValue2 = ((Long) arrayList4.get(i9 + 1)).longValue() - ((Long) arrayList4.get(i9)).longValue();
                arrayList = arrayList3;
                arrayList2 = arrayList4;
                long j7 = bVar.f10048a;
                if (j7 == -9223372036854775807L || longValue >= j7) {
                    interfaceC1303g.accept(new C0816e(list, longValue, longValue2));
                } else if (arrayList5 != null) {
                    arrayList5.add(new C0816e(list, longValue, longValue2));
                }
            }
            i9++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        }
        if (arrayList5 != null) {
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                interfaceC1303g.accept((C0816e) it.next());
            }
        }
    }

    @Override // c1.t
    public int d() {
        return 1;
    }

    public final Charset h(z zVar) {
        Charset O6 = zVar.O();
        return O6 != null ? O6 : e.f6821c;
    }

    public final void i(String str, C1311a c1311a, List list, List list2) {
        int i7;
        StringBuilder sb;
        AbstractC1297a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", c1311a.f14355e);
        if (split.length != c1311a.f14355e) {
            sb = new StringBuilder();
            sb.append("Skipping dialogue line with fewer columns than format: ");
        } else {
            long n7 = n(split[c1311a.f14351a]);
            if (n7 == -9223372036854775807L) {
                sb = new StringBuilder();
            } else {
                long n8 = n(split[c1311a.f14352b]);
                if (n8 != -9223372036854775807L) {
                    Map map = this.f14360d;
                    C1313c c1313c = (map == null || (i7 = c1311a.f14353c) == -1) ? null : (C1313c) map.get(split[i7].trim());
                    String str2 = split[c1311a.f14354d];
                    C1280a g7 = g(C1313c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), c1313c, C1313c.b.b(str2), this.f14361e, this.f14362f);
                    int e7 = e(n8, list2, list);
                    for (int e8 = e(n7, list2, list); e8 < e7; e8++) {
                        ((List) list.get(e8)).add(g7);
                    }
                    return;
                }
                sb = new StringBuilder();
            }
            sb.append("Skipping invalid timing: ");
        }
        sb.append(str);
        o.h("SsaParser", sb.toString());
    }

    public final void j(z zVar, List list, List list2, Charset charset) {
        C1311a c1311a = this.f14357a ? this.f14358b : null;
        while (true) {
            String s7 = zVar.s(charset);
            if (s7 == null) {
                return;
            }
            if (s7.startsWith("Format:")) {
                c1311a = C1311a.a(s7);
            } else if (s7.startsWith("Dialogue:")) {
                if (c1311a == null) {
                    o.h("SsaParser", "Skipping dialogue line before complete format: " + s7);
                } else {
                    i(s7, c1311a, list, list2);
                }
            }
        }
    }

    public final void k(z zVar, Charset charset) {
        while (true) {
            String s7 = zVar.s(charset);
            if (s7 == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(s7)) {
                l(zVar, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(s7)) {
                this.f14360d = m(zVar, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(s7)) {
                o.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(s7)) {
                return;
            }
        }
    }

    public final void l(z zVar, Charset charset) {
        while (true) {
            String s7 = zVar.s(charset);
            if (s7 == null) {
                return;
            }
            if (zVar.a() != 0 && zVar.h(charset) == '[') {
                return;
            }
            String[] split = s7.split(":");
            if (split.length == 2) {
                String e7 = W2.c.e(split[0].trim());
                e7.hashCode();
                if (e7.equals("playresx")) {
                    this.f14361e = Float.parseFloat(split[1].trim());
                } else if (e7.equals("playresy")) {
                    try {
                        this.f14362f = Float.parseFloat(split[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }
}
