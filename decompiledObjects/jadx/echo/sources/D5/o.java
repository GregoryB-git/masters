package D5;

import E5.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final E5.k f1316a;

    /* renamed from: b, reason: collision with root package name */
    public h f1317b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f1318c;

    public class a implements k.c {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0147 A[Catch: JSONException -> 0x003f, TryCatch #6 {JSONException -> 0x003f, blocks: (B:7:0x002b, B:8:0x002f, B:13:0x00df, B:15:0x00e4, B:16:0x00ef, B:18:0x00f4, B:19:0x0108, B:21:0x010d, B:22:0x011d, B:29:0x0121, B:25:0x013b, B:27:0x0147, B:31:0x0126, B:32:0x0150, B:33:0x015a, B:34:0x018c, B:35:0x0197, B:37:0x0218, B:45:0x0232, B:61:0x0183, B:42:0x0187, B:67:0x01bb, B:79:0x01d9, B:55:0x01f5, B:73:0x0212, B:41:0x022c, B:49:0x0246, B:80:0x0034, B:83:0x0042, B:86:0x004d, B:89:0x0059, B:92:0x0065, B:95:0x0070, B:98:0x007b, B:101:0x0085, B:104:0x008f, B:107:0x0099, B:110:0x00a3, B:113:0x00ad, B:116:0x00b8, B:119:0x00c3, B:122:0x00ce, B:51:0x01de), top: B:6:0x002b, inners: #1, #4, #5, #9 }] */
        @Override // E5.k.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onMethodCall(E5.j r6, E5.k.d r7) {
            /*
                Method dump skipped, instructions count: 710
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: D5.o.a.onMethodCall(E5.j, E5.k$d):void");
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1320a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1321b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f1322c;

        static {
            int[] iArr = new int[k.values().length];
            f1322c = iArr;
            try {
                iArr[k.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1322c[k.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1322c[k.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1322c[k.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[l.values().length];
            f1321b = iArr2;
            try {
                iArr2[l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1321b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[f.values().length];
            f1320a = iArr3;
            try {
                iArr3[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1320a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1320a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1320a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f1323a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1324b;

        public c(int i7, String str) {
            this.f1323a = i7;
            this.f1324b = str;
        }
    }

    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* renamed from: o, reason: collision with root package name */
        public String f1328o;

        d(String str) {
            this.f1328o = str;
        }

        public static d e(String str) {
            for (d dVar : values()) {
                if (dVar.f1328o.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum e {
        PLAIN_TEXT("text/plain");


        /* renamed from: o, reason: collision with root package name */
        public String f1331o;

        e(String str) {
            this.f1331o = str;
        }

        public static e e(String str) {
            for (e eVar : values()) {
                if (eVar.f1331o.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* renamed from: o, reason: collision with root package name */
        public String f1337o;

        f(String str) {
            this.f1337o = str;
        }

        public static f e(String str) {
            for (f fVar : values()) {
                if (fVar.f1337o.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* renamed from: o, reason: collision with root package name */
        public final String f1344o;

        g(String str) {
            this.f1344o = str;
        }

        public static g e(String str) {
            for (g gVar : values()) {
                String str2 = gVar.f1344o;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface h {
        void a();

        void f(boolean z7);

        void g(k kVar);

        void h(List list);

        void i(i iVar);

        void j();

        void k();

        void l(String str);

        void m(c cVar);

        void n(g gVar);

        CharSequence o(e eVar);

        void p(int i7);

        void q(String str);

        boolean r();

        void s(j jVar);
    }

    public enum i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");


        /* renamed from: o, reason: collision with root package name */
        public final String f1348o;

        i(String str) {
            this.f1348o = str;
        }

        public static i e(String str) {
            for (i iVar : values()) {
                if (iVar.f1348o.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f1349a;

        /* renamed from: b, reason: collision with root package name */
        public final d f1350b;

        /* renamed from: c, reason: collision with root package name */
        public final Boolean f1351c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f1352d;

        /* renamed from: e, reason: collision with root package name */
        public final d f1353e;

        /* renamed from: f, reason: collision with root package name */
        public final Integer f1354f;

        /* renamed from: g, reason: collision with root package name */
        public final Boolean f1355g;

        public j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f1349a = num;
            this.f1350b = dVar;
            this.f1351c = bool;
            this.f1352d = num2;
            this.f1353e = dVar2;
            this.f1354f = num3;
            this.f1355g = bool2;
        }
    }

    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        /* renamed from: o, reason: collision with root package name */
        public String f1361o;

        k(String str) {
            this.f1361o = str;
        }

        public static k e(String str) {
            for (k kVar : values()) {
                if (kVar.f1361o.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* renamed from: o, reason: collision with root package name */
        public String f1365o;

        l(String str) {
            this.f1365o = str;
        }

        public static l e(String str) {
            for (l lVar : values()) {
                if (lVar.f1365o.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public o(C2105a c2105a) {
        a aVar = new a();
        this.f1318c = aVar;
        E5.k kVar = new E5.k(c2105a, "flutter/platform", E5.g.f1669a);
        this.f1316a = kVar;
        kVar.e(aVar);
    }

    public final c g(JSONObject jSONObject) {
        int i7 = jSONObject.getInt("primaryColor");
        if (i7 != 0) {
            i7 |= -16777216;
        }
        return new c(i7, jSONObject.getString("label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            D5.o$f r4 = D5.o.f.e(r4)
            int[] r8 = D5.o.b.f1320a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: D5.o.h(org.json.JSONArray):int");
    }

    public final j i(JSONObject jSONObject) {
        return new j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? d.e(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.e(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public final k j(String str) {
        int i7 = b.f1322c[k.e(str).ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    public final List k(JSONArray jSONArray) {
        l lVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            int i8 = b.f1321b[l.e(jSONArray.getString(i7)).ordinal()];
            if (i8 == 1) {
                lVar = l.TOP_OVERLAYS;
            } else if (i8 == 2) {
                lVar = l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f1317b = hVar;
    }

    public void m(boolean z7) {
        AbstractC1995b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f1316a.c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z7)));
    }
}
