package t5;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import t5.e;
import v5.s;

/* loaded from: classes.dex */
public final class q implements e, l0 {

    /* renamed from: n, reason: collision with root package name */
    public static final o7.l0 f14562n = o7.t.s(4400000L, 3200000L, 2300000L, 1600000L, 810000L);

    /* renamed from: o, reason: collision with root package name */
    public static final o7.l0 f14563o = o7.t.s(1400000L, 990000L, 730000L, 510000L, 230000L);

    /* renamed from: p, reason: collision with root package name */
    public static final o7.l0 f14564p = o7.t.s(2100000L, 1400000L, 1000000L, 890000L, 640000L);

    /* renamed from: q, reason: collision with root package name */
    public static final o7.l0 f14565q = o7.t.s(2600000L, 1700000L, 1300000L, 1000000L, 700000L);

    /* renamed from: r, reason: collision with root package name */
    public static final o7.l0 f14566r = o7.t.s(5700000L, 3700000L, 2300000L, 1700000L, 990000L);

    /* renamed from: s, reason: collision with root package name */
    public static final o7.l0 f14567s = o7.t.s(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static q t;

    /* renamed from: a, reason: collision with root package name */
    public final o7.u<Integer, Long> f14568a;

    /* renamed from: b, reason: collision with root package name */
    public final e.a.C0228a f14569b = new e.a.C0228a();

    /* renamed from: c, reason: collision with root package name */
    public final i0 f14570c;

    /* renamed from: d, reason: collision with root package name */
    public final v5.c f14571d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14572e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public long f14573g;

    /* renamed from: h, reason: collision with root package name */
    public long f14574h;

    /* renamed from: i, reason: collision with root package name */
    public int f14575i;

    /* renamed from: j, reason: collision with root package name */
    public long f14576j;

    /* renamed from: k, reason: collision with root package name */
    public long f14577k;

    /* renamed from: l, reason: collision with root package name */
    public long f14578l;

    /* renamed from: m, reason: collision with root package name */
    public long f14579m;

    public q(Context context, HashMap hashMap, int i10, v5.z zVar, boolean z10) {
        int i11;
        this.f14568a = o7.u.b(hashMap);
        this.f14570c = new i0(i10);
        this.f14571d = zVar;
        this.f14572e = z10;
        if (context == null) {
            this.f14575i = 0;
            this.f14578l = k(0);
            return;
        }
        v5.s b10 = v5.s.b(context);
        synchronized (b10.f15965c) {
            i11 = b10.f15966d;
        }
        this.f14575i = i11;
        this.f14578l = k(i11);
        s.a aVar = new s.a() { // from class: t5.p
            @Override // v5.s.a
            public final void a(int i12) {
                q qVar = q.this;
                synchronized (qVar) {
                    int i13 = qVar.f14575i;
                    if ((i13 == 0 || qVar.f14572e) && i13 != i12) {
                        qVar.f14575i = i12;
                        if (i12 != 1 && i12 != 0 && i12 != 8) {
                            qVar.f14578l = qVar.k(i12);
                            long d10 = qVar.f14571d.d();
                            qVar.l(qVar.f > 0 ? (int) (d10 - qVar.f14573g) : 0, qVar.f14574h, qVar.f14578l);
                            qVar.f14573g = d10;
                            qVar.f14574h = 0L;
                            qVar.f14577k = 0L;
                            qVar.f14576j = 0L;
                            i0 i0Var = qVar.f14570c;
                            i0Var.f14515b.clear();
                            i0Var.f14517d = -1;
                            i0Var.f14518e = 0;
                            i0Var.f = 0;
                        }
                    }
                }
            }
        };
        Iterator<WeakReference<s.a>> it = b10.f15964b.iterator();
        while (it.hasNext()) {
            WeakReference<s.a> next = it.next();
            if (next.get() == null) {
                b10.f15964b.remove(next);
            }
        }
        b10.f15964b.add(new WeakReference<>(aVar));
        b10.f15963a.post(new w.g(12, b10, aVar));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] j(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c10 = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c10 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c10 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c10 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c10 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c10 = 22;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c10 = 23;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c10 = 24;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c10 = 25;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c10 = 26;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c10 = 27;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c10 = 28;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c10 = 29;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c10 = 30;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c10 = 31;
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c10 = '!';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c10 = '#';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c10 = '$';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c10 = '&';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c10 = '(';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c10 = ')';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c10 = '*';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c10 = '+';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c10 = ',';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c10 = '-';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c10 = '.';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c10 = '/';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c10 = '0';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c10 = '1';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c10 = '2';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c10 = '3';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c10 = '4';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c10 = '5';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c10 = '6';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c10 = '7';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c10 = '8';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c10 = '9';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c10 = ':';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c10 = ';';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c10 = '<';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c10 = '=';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c10 = '>';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c10 = '?';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c10 = '@';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c10 = 'A';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c10 = 'B';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c10 = 'C';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c10 = 'D';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c10 = 'E';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c10 = 'F';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c10 = 'G';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c10 = 'H';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c10 = 'I';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c10 = 'J';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c10 = 'K';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c10 = 'L';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c10 = 'M';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c10 = 'N';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c10 = 'O';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c10 = 'P';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c10 = 'Q';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c10 = 'R';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c10 = 'S';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c10 = 'T';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c10 = 'U';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c10 = 'V';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c10 = 'W';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c10 = 'X';
                    break;
                }
                break;
            case 2310:
                if (str.equals("HN")) {
                    c10 = 'Y';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c10 = 'Z';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c10 = '[';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c10 = '\\';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c10 = ']';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c10 = '^';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c10 = '_';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c10 = '`';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c10 = 'a';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c10 = 'b';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c10 = 'c';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c10 = 'd';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c10 = 'e';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c10 = 'f';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c10 = 'g';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c10 = 'h';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c10 = 'i';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c10 = 'j';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c10 = 'k';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c10 = 'l';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c10 = 'm';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c10 = 'n';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c10 = 'o';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c10 = 'p';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c10 = 'q';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c10 = 'r';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c10 = 's';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c10 = 't';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c10 = 'u';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c10 = 'v';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c10 = 'w';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c10 = 'x';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c10 = 'y';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c10 = 'z';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c10 = '{';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c10 = '|';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c10 = '}';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c10 = '~';
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c10 = 127;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c10 = 128;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c10 = 129;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c10 = 130;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c10 = 131;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c10 = 132;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c10 = 133;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c10 = 134;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c10 = 135;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c10 = 136;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c10 = 137;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c10 = 138;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c10 = 139;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c10 = 140;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c10 = 141;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c10 = 142;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c10 = 143;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c10 = 144;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c10 = 145;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c10 = 146;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c10 = 147;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c10 = 148;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c10 = 149;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c10 = 150;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c10 = 151;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c10 = 152;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c10 = 153;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c10 = 154;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c10 = 155;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c10 = 156;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c10 = 157;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c10 = 158;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c10 = 159;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c10 = 160;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c10 = 161;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c10 = 162;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c10 = 163;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c10 = 164;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c10 = 165;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c10 = 166;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c10 = 167;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c10 = 168;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c10 = 169;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c10 = 170;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c10 = 171;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c10 = 172;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c10 = 173;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c10 = 174;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c10 = 175;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c10 = 176;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c10 = 177;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c10 = 178;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c10 = 179;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c10 = 180;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c10 = 181;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c10 = 182;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c10 = 183;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c10 = 184;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c10 = 185;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c10 = 186;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c10 = 187;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c10 = 188;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c10 = 189;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c10 = 190;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c10 = 191;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c10 = 192;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c10 = 193;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c10 = 194;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c10 = 195;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c10 = 196;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c10 = 197;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c10 = 198;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c10 = 199;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c10 = 200;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c10 = 201;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c10 = 202;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c10 = 203;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c10 = 204;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c10 = 205;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c10 = 206;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c10 = 207;
                    break;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    c10 = 208;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c10 = 209;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c10 = 210;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c10 = 211;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c10 = 212;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c10 = 213;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c10 = 214;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c10 = 215;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c10 = 216;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c10 = 217;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c10 = 218;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c10 = 219;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c10 = 220;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c10 = 221;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c10 = 222;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c10 = 223;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c10 = 224;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c10 = 225;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c10 = 226;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c10 = 227;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c10 = 228;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c10 = 229;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c10 = 230;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c10 = 231;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c10 = 232;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c10 = 233;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c10 = 234;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c10 = 235;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c10 = 236;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c10 = 237;
                    break;
                }
                break;
        }
        int[] iArr = {2, 2, 0, 0, 2, 2};
        switch (c10) {
            case 0:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                break;
            case 1:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 2:
            case 166:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 3:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 4:
            case 16:
            case 25:
            case 28:
            case '8':
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 5:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 6:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 7:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '\b':
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case 188:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '\t':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '\n':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 4;
                iArr[4] = 1;
                iArr[5] = 4;
                break;
            case 11:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 0;
                break;
            case '\f':
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '\r':
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
            case 140:
            case 143:
            case 170:
            case 193:
            case 223:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 14:
            case 19:
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 15:
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 17:
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 18:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case 20:
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case 189:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case 21:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 22:
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
            case 133:
            case 153:
            case 204:
            case 225:
            case 233:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 23:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 24:
            case 132:
            case 175:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 26:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 27:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 29:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 0;
                break;
            case 30:
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 31:
            case 150:
            case 231:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case ' ':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '!':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '\"':
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '#':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 3;
                break;
            case '$':
            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case 183:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 3;
                break;
            case '(':
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 1;
                break;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '0':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case 201:
            case 207:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
            case 144:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case 194:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 2;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case 205:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
            case 200:
            case 224:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
            case 168:
            case 192:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
            case 208:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 0;
                break;
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 1;
                break;
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
            case 215:
            case 230:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
            case 190:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'd':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 'e':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 4;
                break;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
            case 141:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 4;
                break;
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
            case 219:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case 127:
            case 212:
            case 237:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 128:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 129:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 130:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 131:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case 134:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 135:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case ModuleDescriptor.MODULE_VERSION /* 136 */:
            case 217:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 137:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 138:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 139:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 142:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 145:
            case 182:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 146:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case 147:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 148:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 149:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 4;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 151:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 152:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 154:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 155:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 156:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 0;
                iArr[5] = 4;
                break;
            case 157:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case 158:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 159:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 0;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 160:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 161:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 162:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 163:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 164:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case 165:
            case 199:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 167:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 0;
                break;
            case 169:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 171:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 1;
                break;
            case 172:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 173:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case 174:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 176:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 177:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case 178:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case 179:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 180:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 3;
                iArr[5] = 3;
                break;
            case 181:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 184:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 185:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 186:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case 187:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 3;
                break;
            case 191:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case 195:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 196:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 197:
            case 210:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 198:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 202:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 203:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 206:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 209:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 211:
            case 221:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 213:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case 214:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 4;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 216:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 0;
                break;
            case 218:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 220:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 1;
                break;
            case 222:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case 226:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 227:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 228:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 1;
                break;
            case 229:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 232:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 234:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 235:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 236:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            default:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000f, code lost:
    
        if (((r3.f14554i & 8) == 8) == false) goto L14;
     */
    @Override // t5.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(t5.n r3, boolean r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L12
            r4 = 8
            int r3 = r3.f14554i     // Catch: java.lang.Throwable -> L1f
            r3 = r3 & r4
            if (r3 != r4) goto Le
            r3 = r0
            goto Lf
        Le:
            r3 = r1
        Lf:
            if (r3 != 0) goto L12
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 != 0) goto L17
            monitor-exit(r2)
            return
        L17:
            long r3 = r2.f14574h     // Catch: java.lang.Throwable -> L1f
            long r0 = (long) r5     // Catch: java.lang.Throwable -> L1f
            long r3 = r3 + r0
            r2.f14574h = r3     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r2)
            return
        L1f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.q.a(t5.n, boolean, int):void");
    }

    @Override // t5.e
    public final void b(w3.a aVar) {
        this.f14569b.a(aVar);
    }

    @Override // t5.e
    public final /* synthetic */ void c() {
    }

    @Override // t5.l0
    public final void d() {
    }

    @Override // t5.e
    public final void e(Handler handler, w3.a aVar) {
        aVar.getClass();
        e.a.C0228a c0228a = this.f14569b;
        c0228a.getClass();
        c0228a.a(aVar);
        c0228a.f14484a.add(new e.a.C0228a.C0229a(handler, aVar));
    }

    @Override // t5.e
    public final q f() {
        return this;
    }

    @Override // t5.e
    public final synchronized long g() {
        return this.f14578l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0018 A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0007, B:16:0x0018, B:19:0x001d, B:21:0x003a, B:23:0x0053, B:25:0x0065, B:26:0x005c, B:27:0x0073), top: B:5:0x0007 }] */
    @Override // t5.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h(t5.n r11, boolean r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L13
            r12 = 8
            int r11 = r11.f14554i     // Catch: java.lang.Throwable -> L7a
            r11 = r11 & r12
            if (r11 != r12) goto Le
            r11 = r1
            goto Lf
        Le:
            r11 = r0
        Lf:
            if (r11 != 0) goto L13
            r11 = r1
            goto L14
        L13:
            r11 = r0
        L14:
            if (r11 != 0) goto L18
            monitor-exit(r10)
            return
        L18:
            int r11 = r10.f     // Catch: java.lang.Throwable -> L7a
            if (r11 <= 0) goto L1d
            r0 = r1
        L1d:
            x6.b.H(r0)     // Catch: java.lang.Throwable -> L7a
            v5.c r11 = r10.f14571d     // Catch: java.lang.Throwable -> L7a
            long r11 = r11.d()     // Catch: java.lang.Throwable -> L7a
            long r2 = r10.f14573g     // Catch: java.lang.Throwable -> L7a
            long r2 = r11 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L7a
            long r2 = r10.f14576j     // Catch: java.lang.Throwable -> L7a
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L7a
            long r2 = r2 + r6
            r10.f14576j = r2     // Catch: java.lang.Throwable -> L7a
            long r2 = r10.f14577k     // Catch: java.lang.Throwable -> L7a
            long r6 = r10.f14574h     // Catch: java.lang.Throwable -> L7a
            long r2 = r2 + r6
            r10.f14577k = r2     // Catch: java.lang.Throwable -> L7a
            if (r5 <= 0) goto L73
            float r0 = (float) r6     // Catch: java.lang.Throwable -> L7a
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r0 = r0 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L7a
            float r0 = r0 / r2
            t5.i0 r2 = r10.f14570c     // Catch: java.lang.Throwable -> L7a
            double r3 = (double) r6     // Catch: java.lang.Throwable -> L7a
            double r3 = java.lang.Math.sqrt(r3)     // Catch: java.lang.Throwable -> L7a
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L7a
            r2.a(r0, r3)     // Catch: java.lang.Throwable -> L7a
            long r2 = r10.f14576j     // Catch: java.lang.Throwable -> L7a
            r6 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L5c
            long r2 = r10.f14577k     // Catch: java.lang.Throwable -> L7a
            r6 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L65
        L5c:
            t5.i0 r0 = r10.f14570c     // Catch: java.lang.Throwable -> L7a
            float r0 = r0.b()     // Catch: java.lang.Throwable -> L7a
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L7a
            r10.f14578l = r2     // Catch: java.lang.Throwable -> L7a
        L65:
            long r6 = r10.f14574h     // Catch: java.lang.Throwable -> L7a
            long r8 = r10.f14578l     // Catch: java.lang.Throwable -> L7a
            r4 = r10
            r4.l(r5, r6, r8)     // Catch: java.lang.Throwable -> L7a
            r10.f14573g = r11     // Catch: java.lang.Throwable -> L7a
            r11 = 0
            r10.f14574h = r11     // Catch: java.lang.Throwable -> L7a
        L73:
            int r11 = r10.f     // Catch: java.lang.Throwable -> L7a
            int r11 = r11 - r1
            r10.f = r11     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r10)
            return
        L7a:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.q.h(t5.n, boolean):void");
    }

    @Override // t5.l0
    public final synchronized void i(n nVar, boolean z10) {
        boolean z11 = false;
        if (z10) {
            if (!((nVar.f14554i & 8) == 8)) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f == 0) {
                this.f14573g = this.f14571d.d();
            }
            this.f++;
        }
    }

    public final long k(int i10) {
        Long l10 = this.f14568a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f14568a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void l(final int i10, final long j10, final long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f14579m) {
            return;
        }
        this.f14579m = j11;
        Iterator<e.a.C0228a.C0229a> it = this.f14569b.f14484a.iterator();
        while (it.hasNext()) {
            final e.a.C0228a.C0229a next = it.next();
            if (!next.f14487c) {
                next.f14485a.post(new Runnable() { // from class: t5.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.C0228a.C0229a c0229a = e.a.C0228a.C0229a.this;
                        c0229a.f14486b.Q(i10, j10, j11);
                    }
                });
            }
        }
    }
}
