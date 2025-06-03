package t5;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o7.t;
import o7.u;
import v5.c;
import v5.s;
import v5.z;
import w.g;
import w3.a;
import x6.b;

public final class q
  implements e, l0
{
  public static final o7.l0 n;
  public static final o7.l0 o;
  public static final o7.l0 p;
  public static final o7.l0 q;
  public static final o7.l0 r;
  public static final o7.l0 s;
  public static q t;
  public final u<Integer, Long> a;
  public final e.a.a b;
  public final i0 c;
  public final c d;
  public final boolean e;
  public int f;
  public long g;
  public long h;
  public int i;
  public long j;
  public long k;
  public long l;
  public long m;
  
  static
  {
    Long localLong1 = Long.valueOf(2300000L);
    n = t.s(Long.valueOf(4400000L), Long.valueOf(3200000L), localLong1, Long.valueOf(1600000L), Long.valueOf(810000L));
    Long localLong2 = Long.valueOf(1400000L);
    Long localLong3 = Long.valueOf(990000L);
    o = t.s(localLong2, localLong3, Long.valueOf(730000L), Long.valueOf(510000L), Long.valueOf(230000L));
    Long localLong4 = Long.valueOf(1000000L);
    p = t.s(Long.valueOf(2100000L), localLong2, localLong4, Long.valueOf(890000L), Long.valueOf(640000L));
    Long localLong5 = Long.valueOf(1700000L);
    q = t.s(Long.valueOf(2600000L), localLong5, Long.valueOf(1300000L), localLong4, Long.valueOf(700000L));
    r = t.s(Long.valueOf(5700000L), Long.valueOf(3700000L), localLong1, localLong5, localLong3);
    s = t.s(Long.valueOf(2800000L), Long.valueOf(1800000L), localLong2, Long.valueOf(1100000L), Long.valueOf(870000L));
  }
  
  public q(Context paramContext, HashMap arg2, int paramInt, z paramz, boolean paramBoolean)
  {
    a = u.b(???);
    b = new e.a.a();
    c = new i0(paramInt);
    d = paramz;
    e = paramBoolean;
    if (paramContext != null)
    {
      paramContext = s.b(paramContext);
      synchronized (c)
      {
        paramInt = d;
        i = paramInt;
        l = k(paramInt);
        ??? = new p(this);
        Iterator localIterator = b.iterator();
        while (localIterator.hasNext())
        {
          paramz = (WeakReference)localIterator.next();
          if (paramz.get() == null) {
            b.remove(paramz);
          }
        }
        b.add(new WeakReference(???));
        a.post(new g(12, paramContext, ???));
      }
    }
    i = 0;
    l = k(0);
  }
  
  public static int[] j(String paramString)
  {
    paramString.getClass();
    int i1 = paramString.hashCode();
    int i2 = -1;
    switch (i1)
    {
    default: 
      break;
    case 2877: 
      if (paramString.equals("ZW")) {
        i2 = 237;
      }
      break;
    case 2867: 
      if (paramString.equals("ZM")) {
        i2 = 236;
      }
      break;
    case 2855: 
      if (paramString.equals("ZA")) {
        i2 = 235;
      }
      break;
    case 2843: 
      if (paramString.equals("YT")) {
        i2 = 234;
      }
      break;
    case 2828: 
      if (paramString.equals("YE")) {
        i2 = 233;
      }
      break;
    case 2803: 
      if (paramString.equals("XK")) {
        i2 = 232;
      }
      break;
    case 2780: 
      if (paramString.equals("WS")) {
        i2 = 231;
      }
      break;
    case 2767: 
      if (paramString.equals("WF")) {
        i2 = 230;
      }
      break;
    case 2751: 
      if (paramString.equals("VU")) {
        i2 = 229;
      }
      break;
    case 2744: 
      if (paramString.equals("VN")) {
        i2 = 228;
      }
      break;
    case 2739: 
      if (paramString.equals("VI")) {
        i2 = 227;
      }
      break;
    case 2737: 
      if (paramString.equals("VG")) {
        i2 = 226;
      }
      break;
    case 2735: 
      if (paramString.equals("VE")) {
        i2 = 225;
      }
      break;
    case 2733: 
      if (paramString.equals("VC")) {
        i2 = 224;
      }
      break;
    case 2731: 
      if (paramString.equals("VA")) {
        i2 = 223;
      }
      break;
    case 2725: 
      if (paramString.equals("UZ")) {
        i2 = 222;
      }
      break;
    case 2724: 
      if (paramString.equals("UY")) {
        i2 = 221;
      }
      break;
    case 2718: 
      if (paramString.equals("US")) {
        i2 = 220;
      }
      break;
    case 2706: 
      if (paramString.equals("UG")) {
        i2 = 219;
      }
      break;
    case 2700: 
      if (paramString.equals("UA")) {
        i2 = 218;
      }
      break;
    case 2694: 
      if (paramString.equals("TZ")) {
        i2 = 217;
      }
      break;
    case 2691: 
      if (paramString.equals("TW")) {
        i2 = 216;
      }
      break;
    case 2690: 
      if (paramString.equals("TV")) {
        i2 = 215;
      }
      break;
    case 2688: 
      if (paramString.equals("TT")) {
        i2 = 214;
      }
      break;
    case 2686: 
      if (paramString.equals("TR")) {
        i2 = 213;
      }
      break;
    case 2683: 
      if (paramString.equals("TO")) {
        i2 = 212;
      }
      break;
    case 2682: 
      if (paramString.equals("TN")) {
        i2 = 211;
      }
      break;
    case 2681: 
      if (paramString.equals("TM")) {
        i2 = 210;
      }
      break;
    case 2680: 
      if (paramString.equals("TL")) {
        i2 = 209;
      }
      break;
    case 2679: 
      if (paramString.equals("TK")) {
        i2 = 208;
      }
      break;
    case 2678: 
      if (paramString.equals("TJ")) {
        i2 = 207;
      }
      break;
    case 2676: 
      if (paramString.equals("TH")) {
        i2 = 206;
      }
      break;
    case 2675: 
      if (paramString.equals("TG")) {
        i2 = 205;
      }
      break;
    case 2672: 
      if (paramString.equals("TD")) {
        i2 = 204;
      }
      break;
    case 2671: 
      if (paramString.equals("TC")) {
        i2 = 203;
      }
      break;
    case 2663: 
      if (paramString.equals("SZ")) {
        i2 = 202;
      }
      break;
    case 2662: 
      if (paramString.equals("SY")) {
        i2 = 201;
      }
      break;
    case 2661: 
      if (paramString.equals("SX")) {
        i2 = 200;
      }
      break;
    case 2659: 
      if (paramString.equals("SV")) {
        i2 = 199;
      }
      break;
    case 2657: 
      if (paramString.equals("ST")) {
        i2 = 198;
      }
      break;
    case 2656: 
      if (paramString.equals("SS")) {
        i2 = 197;
      }
      break;
    case 2655: 
      if (paramString.equals("SR")) {
        i2 = 196;
      }
      break;
    case 2652: 
      if (paramString.equals("SO")) {
        i2 = 195;
      }
      break;
    case 2651: 
      if (paramString.equals("SN")) {
        i2 = 194;
      }
      break;
    case 2650: 
      if (paramString.equals("SM")) {
        i2 = 193;
      }
      break;
    case 2649: 
      if (paramString.equals("SL")) {
        i2 = 192;
      }
      break;
    case 2648: 
      if (paramString.equals("SK")) {
        i2 = 191;
      }
      break;
    case 2647: 
      if (paramString.equals("SJ")) {
        i2 = 190;
      }
      break;
    case 2646: 
      if (paramString.equals("SI")) {
        i2 = 189;
      }
      break;
    case 2645: 
      if (paramString.equals("SH")) {
        i2 = 188;
      }
      break;
    case 2644: 
      if (paramString.equals("SG")) {
        i2 = 187;
      }
      break;
    case 2642: 
      if (paramString.equals("SE")) {
        i2 = 186;
      }
      break;
    case 2641: 
      if (paramString.equals("SD")) {
        i2 = 185;
      }
      break;
    case 2640: 
      if (paramString.equals("SC")) {
        i2 = 184;
      }
      break;
    case 2639: 
      if (paramString.equals("SB")) {
        i2 = 183;
      }
      break;
    case 2638: 
      if (paramString.equals("SA")) {
        i2 = 182;
      }
      break;
    case 2629: 
      if (paramString.equals("RW")) {
        i2 = 181;
      }
      break;
    case 2627: 
      if (paramString.equals("RU")) {
        i2 = 180;
      }
      break;
    case 2625: 
      if (paramString.equals("RS")) {
        i2 = 179;
      }
      break;
    case 2621: 
      if (paramString.equals("RO")) {
        i2 = 178;
      }
      break;
    case 2611: 
      if (paramString.equals("RE")) {
        i2 = 177;
      }
      break;
    case 2576: 
      if (paramString.equals("QA")) {
        i2 = 176;
      }
      break;
    case 2569: 
      if (paramString.equals("PY")) {
        i2 = 175;
      }
      break;
    case 2567: 
      if (paramString.equals("PW")) {
        i2 = 174;
      }
      break;
    case 2564: 
      if (paramString.equals("PT")) {
        i2 = 173;
      }
      break;
    case 2563: 
      if (paramString.equals("PS")) {
        i2 = 172;
      }
      break;
    case 2562: 
      if (paramString.equals("PR")) {
        i2 = 171;
      }
      break;
    case 2557: 
      if (paramString.equals("PM")) {
        i2 = 170;
      }
      break;
    case 2556: 
      if (paramString.equals("PL")) {
        i2 = 169;
      }
      break;
    case 2555: 
      if (paramString.equals("PK")) {
        i2 = 168;
      }
      break;
    case 2552: 
      if (paramString.equals("PH")) {
        i2 = 167;
      }
      break;
    case 2551: 
      if (paramString.equals("PG")) {
        i2 = 166;
      }
      break;
    case 2550: 
      if (paramString.equals("PF")) {
        i2 = 165;
      }
      break;
    case 2549: 
      if (paramString.equals("PE")) {
        i2 = 164;
      }
      break;
    case 2545: 
      if (paramString.equals("PA")) {
        i2 = 163;
      }
      break;
    case 2526: 
      if (paramString.equals("OM")) {
        i2 = 162;
      }
      break;
    case 2508: 
      if (paramString.equals("NZ")) {
        i2 = 161;
      }
      break;
    case 2503: 
      if (paramString.equals("NU")) {
        i2 = 160;
      }
      break;
    case 2500: 
      if (paramString.equals("NR")) {
        i2 = 159;
      }
      break;
    case 2498: 
      if (paramString.equals("NP")) {
        i2 = 158;
      }
      break;
    case 2497: 
      if (paramString.equals("NO")) {
        i2 = 157;
      }
      break;
    case 2494: 
      if (paramString.equals("NL")) {
        i2 = 156;
      }
      break;
    case 2491: 
      if (paramString.equals("NI")) {
        i2 = 155;
      }
      break;
    case 2489: 
      if (paramString.equals("NG")) {
        i2 = 154;
      }
      break;
    case 2487: 
      if (paramString.equals("NE")) {
        i2 = 153;
      }
      break;
    case 2485: 
      if (paramString.equals("NC")) {
        i2 = 152;
      }
      break;
    case 2483: 
      if (paramString.equals("NA")) {
        i2 = 151;
      }
      break;
    case 2477: 
      if (paramString.equals("MZ")) {
        i2 = 150;
      }
      break;
    case 2476: 
      if (paramString.equals("MY")) {
        i2 = 149;
      }
      break;
    case 2475: 
      if (paramString.equals("MX")) {
        i2 = 148;
      }
      break;
    case 2474: 
      if (paramString.equals("MW")) {
        i2 = 147;
      }
      break;
    case 2473: 
      if (paramString.equals("MV")) {
        i2 = 146;
      }
      break;
    case 2472: 
      if (paramString.equals("MU")) {
        i2 = 145;
      }
      break;
    case 2471: 
      if (paramString.equals("MT")) {
        i2 = 144;
      }
      break;
    case 2470: 
      if (paramString.equals("MS")) {
        i2 = 143;
      }
      break;
    case 2469: 
      if (paramString.equals("MR")) {
        i2 = 142;
      }
      break;
    case 2468: 
      if (paramString.equals("MQ")) {
        i2 = 141;
      }
      break;
    case 2467: 
      if (paramString.equals("MP")) {
        i2 = 140;
      }
      break;
    case 2466: 
      if (paramString.equals("MO")) {
        i2 = 139;
      }
      break;
    case 2465: 
      if (paramString.equals("MN")) {
        i2 = 138;
      }
      break;
    case 2464: 
      if (paramString.equals("MM")) {
        i2 = 137;
      }
      break;
    case 2463: 
      if (paramString.equals("ML")) {
        i2 = 136;
      }
      break;
    case 2462: 
      if (paramString.equals("MK")) {
        i2 = 135;
      }
      break;
    case 2459: 
      if (paramString.equals("MH")) {
        i2 = 134;
      }
      break;
    case 2458: 
      if (paramString.equals("MG")) {
        i2 = 133;
      }
      break;
    case 2457: 
      if (paramString.equals("MF")) {
        i2 = 132;
      }
      break;
    case 2456: 
      if (paramString.equals("ME")) {
        i2 = 131;
      }
      break;
    case 2455: 
      if (paramString.equals("MD")) {
        i2 = 130;
      }
      break;
    case 2454: 
      if (paramString.equals("MC")) {
        i2 = 129;
      }
      break;
    case 2452: 
      if (paramString.equals("MA")) {
        i2 = 128;
      }
      break;
    case 2445: 
      if (paramString.equals("LY")) {
        i2 = 127;
      }
      break;
    case 2442: 
      if (paramString.equals("LV")) {
        i2 = 126;
      }
      break;
    case 2441: 
      if (paramString.equals("LU")) {
        i2 = 125;
      }
      break;
    case 2440: 
      if (paramString.equals("LT")) {
        i2 = 124;
      }
      break;
    case 2439: 
      if (paramString.equals("LS")) {
        i2 = 123;
      }
      break;
    case 2438: 
      if (paramString.equals("LR")) {
        i2 = 122;
      }
      break;
    case 2431: 
      if (paramString.equals("LK")) {
        i2 = 121;
      }
      break;
    case 2429: 
      if (paramString.equals("LI")) {
        i2 = 120;
      }
      break;
    case 2423: 
      if (paramString.equals("LC")) {
        i2 = 119;
      }
      break;
    case 2422: 
      if (paramString.equals("LB")) {
        i2 = 118;
      }
      break;
    case 2421: 
      if (paramString.equals("LA")) {
        i2 = 117;
      }
      break;
    case 2415: 
      if (paramString.equals("KZ")) {
        i2 = 116;
      }
      break;
    case 2414: 
      if (paramString.equals("KY")) {
        i2 = 115;
      }
      break;
    case 2412: 
      if (paramString.equals("KW")) {
        i2 = 114;
      }
      break;
    case 2407: 
      if (paramString.equals("KR")) {
        i2 = 113;
      }
      break;
    case 2403: 
      if (paramString.equals("KN")) {
        i2 = 112;
      }
      break;
    case 2402: 
      if (paramString.equals("KM")) {
        i2 = 111;
      }
      break;
    case 2398: 
      if (paramString.equals("KI")) {
        i2 = 110;
      }
      break;
    case 2397: 
      if (paramString.equals("KH")) {
        i2 = 109;
      }
      break;
    case 2396: 
      if (paramString.equals("KG")) {
        i2 = 108;
      }
      break;
    case 2394: 
      if (paramString.equals("KE")) {
        i2 = 107;
      }
      break;
    case 2374: 
      if (paramString.equals("JP")) {
        i2 = 106;
      }
      break;
    case 2373: 
      if (paramString.equals("JO")) {
        i2 = 105;
      }
      break;
    case 2371: 
      if (paramString.equals("JM")) {
        i2 = 104;
      }
      break;
    case 2363: 
      if (paramString.equals("JE")) {
        i2 = 103;
      }
      break;
    case 2347: 
      if (paramString.equals("IT")) {
        i2 = 102;
      }
      break;
    case 2346: 
      if (paramString.equals("IS")) {
        i2 = 101;
      }
      break;
    case 2345: 
      if (paramString.equals("IR")) {
        i2 = 100;
      }
      break;
    case 2344: 
      if (paramString.equals("IQ")) {
        i2 = 99;
      }
      break;
    case 2342: 
      if (paramString.equals("IO")) {
        i2 = 98;
      }
      break;
    case 2341: 
      if (paramString.equals("IN")) {
        i2 = 97;
      }
      break;
    case 2340: 
      if (paramString.equals("IM")) {
        i2 = 96;
      }
      break;
    case 2339: 
      if (paramString.equals("IL")) {
        i2 = 95;
      }
      break;
    case 2332: 
      if (paramString.equals("IE")) {
        i2 = 94;
      }
      break;
    case 2331: 
      if (paramString.equals("ID")) {
        i2 = 93;
      }
      break;
    case 2317: 
      if (paramString.equals("HU")) {
        i2 = 92;
      }
      break;
    case 2316: 
      if (paramString.equals("HT")) {
        i2 = 91;
      }
      break;
    case 2314: 
      if (paramString.equals("HR")) {
        i2 = 90;
      }
      break;
    case 2310: 
      if (paramString.equals("HN")) {
        i2 = 89;
      }
      break;
    case 2307: 
      if (paramString.equals("HK")) {
        i2 = 88;
      }
      break;
    case 2290: 
      if (paramString.equals("GY")) {
        i2 = 87;
      }
      break;
    case 2288: 
      if (paramString.equals("GW")) {
        i2 = 86;
      }
      break;
    case 2286: 
      if (paramString.equals("GU")) {
        i2 = 85;
      }
      break;
    case 2285: 
      if (paramString.equals("GT")) {
        i2 = 84;
      }
      break;
    case 2283: 
      if (paramString.equals("GR")) {
        i2 = 83;
      }
      break;
    case 2282: 
      if (paramString.equals("GQ")) {
        i2 = 82;
      }
      break;
    case 2281: 
      if (paramString.equals("GP")) {
        i2 = 81;
      }
      break;
    case 2279: 
      if (paramString.equals("GN")) {
        i2 = 80;
      }
      break;
    case 2278: 
      if (paramString.equals("GM")) {
        i2 = 79;
      }
      break;
    case 2277: 
      if (paramString.equals("GL")) {
        i2 = 78;
      }
      break;
    case 2274: 
      if (paramString.equals("GI")) {
        i2 = 77;
      }
      break;
    case 2273: 
      if (paramString.equals("GH")) {
        i2 = 76;
      }
      break;
    case 2272: 
      if (paramString.equals("GG")) {
        i2 = 75;
      }
      break;
    case 2271: 
      if (paramString.equals("GF")) {
        i2 = 74;
      }
      break;
    case 2270: 
      if (paramString.equals("GE")) {
        i2 = 73;
      }
      break;
    case 2269: 
      if (paramString.equals("GD")) {
        i2 = 72;
      }
      break;
    case 2267: 
      if (paramString.equals("GB")) {
        i2 = 71;
      }
      break;
    case 2266: 
      if (paramString.equals("GA")) {
        i2 = 70;
      }
      break;
    case 2252: 
      if (paramString.equals("FR")) {
        i2 = 69;
      }
      break;
    case 2249: 
      if (paramString.equals("FO")) {
        i2 = 68;
      }
      break;
    case 2247: 
      if (paramString.equals("FM")) {
        i2 = 67;
      }
      break;
    case 2244: 
      if (paramString.equals("FJ")) {
        i2 = 66;
      }
      break;
    case 2243: 
      if (paramString.equals("FI")) {
        i2 = 65;
      }
      break;
    case 2223: 
      if (paramString.equals("ET")) {
        i2 = 64;
      }
      break;
    case 2222: 
      if (paramString.equals("ES")) {
        i2 = 63;
      }
      break;
    case 2221: 
      if (paramString.equals("ER")) {
        i2 = 62;
      }
      break;
    case 2210: 
      if (paramString.equals("EG")) {
        i2 = 61;
      }
      break;
    case 2208: 
      if (paramString.equals("EE")) {
        i2 = 60;
      }
      break;
    case 2206: 
      if (paramString.equals("EC")) {
        i2 = 59;
      }
      break;
    case 2198: 
      if (paramString.equals("DZ")) {
        i2 = 58;
      }
      break;
    case 2187: 
      if (paramString.equals("DO")) {
        i2 = 57;
      }
      break;
    case 2185: 
      if (paramString.equals("DM")) {
        i2 = 56;
      }
      break;
    case 2183: 
      if (paramString.equals("DK")) {
        i2 = 55;
      }
      break;
    case 2182: 
      if (paramString.equals("DJ")) {
        i2 = 54;
      }
      break;
    case 2177: 
      if (paramString.equals("DE")) {
        i2 = 53;
      }
      break;
    case 2167: 
      if (paramString.equals("CZ")) {
        i2 = 52;
      }
      break;
    case 2166: 
      if (paramString.equals("CY")) {
        i2 = 51;
      }
      break;
    case 2165: 
      if (paramString.equals("CX")) {
        i2 = 50;
      }
      break;
    case 2164: 
      if (paramString.equals("CW")) {
        i2 = 49;
      }
      break;
    case 2163: 
      if (paramString.equals("CV")) {
        i2 = 48;
      }
      break;
    case 2162: 
      if (paramString.equals("CU")) {
        i2 = 47;
      }
      break;
    case 2159: 
      if (paramString.equals("CR")) {
        i2 = 46;
      }
      break;
    case 2156: 
      if (paramString.equals("CO")) {
        i2 = 45;
      }
      break;
    case 2155: 
      if (paramString.equals("CN")) {
        i2 = 44;
      }
      break;
    case 2154: 
      if (paramString.equals("CM")) {
        i2 = 43;
      }
      break;
    case 2153: 
      if (paramString.equals("CL")) {
        i2 = 42;
      }
      break;
    case 2152: 
      if (paramString.equals("CK")) {
        i2 = 41;
      }
      break;
    case 2150: 
      if (paramString.equals("CI")) {
        i2 = 40;
      }
      break;
    case 2149: 
      if (paramString.equals("CH")) {
        i2 = 39;
      }
      break;
    case 2148: 
      if (paramString.equals("CG")) {
        i2 = 38;
      }
      break;
    case 2147: 
      if (paramString.equals("CF")) {
        i2 = 37;
      }
      break;
    case 2145: 
      if (paramString.equals("CD")) {
        i2 = 36;
      }
      break;
    case 2142: 
      if (paramString.equals("CA")) {
        i2 = 35;
      }
      break;
    case 2136: 
      if (paramString.equals("BZ")) {
        i2 = 34;
      }
      break;
    case 2135: 
      if (paramString.equals("BY")) {
        i2 = 33;
      }
      break;
    case 2133: 
      if (paramString.equals("BW")) {
        i2 = 32;
      }
      break;
    case 2130: 
      if (paramString.equals("BT")) {
        i2 = 31;
      }
      break;
    case 2129: 
      if (paramString.equals("BS")) {
        i2 = 30;
      }
      break;
    case 2128: 
      if (paramString.equals("BR")) {
        i2 = 29;
      }
      break;
    case 2127: 
      if (paramString.equals("BQ")) {
        i2 = 28;
      }
      break;
    case 2125: 
      if (paramString.equals("BO")) {
        i2 = 27;
      }
      break;
    case 2124: 
      if (paramString.equals("BN")) {
        i2 = 26;
      }
      break;
    case 2123: 
      if (paramString.equals("BM")) {
        i2 = 25;
      }
      break;
    case 2122: 
      if (paramString.equals("BL")) {
        i2 = 24;
      }
      break;
    case 2120: 
      if (paramString.equals("BJ")) {
        i2 = 23;
      }
      break;
    case 2119: 
      if (paramString.equals("BI")) {
        i2 = 22;
      }
      break;
    case 2118: 
      if (paramString.equals("BH")) {
        i2 = 21;
      }
      break;
    case 2117: 
      if (paramString.equals("BG")) {
        i2 = 20;
      }
      break;
    case 2116: 
      if (paramString.equals("BF")) {
        i2 = 19;
      }
      break;
    case 2115: 
      if (paramString.equals("BE")) {
        i2 = 18;
      }
      break;
    case 2114: 
      if (paramString.equals("BD")) {
        i2 = 17;
      }
      break;
    case 2112: 
      if (paramString.equals("BB")) {
        i2 = 16;
      }
      break;
    case 2111: 
      if (paramString.equals("BA")) {
        i2 = 15;
      }
      break;
    case 2105: 
      if (paramString.equals("AZ")) {
        i2 = 14;
      }
      break;
    case 2103: 
      if (paramString.equals("AX")) {
        i2 = 13;
      }
      break;
    case 2102: 
      if (paramString.equals("AW")) {
        i2 = 12;
      }
      break;
    case 2100: 
      if (paramString.equals("AU")) {
        i2 = 11;
      }
      break;
    case 2099: 
      if (paramString.equals("AT")) {
        i2 = 10;
      }
      break;
    case 2098: 
      if (paramString.equals("AS")) {
        i2 = 9;
      }
      break;
    case 2096: 
      if (paramString.equals("AQ")) {
        i2 = 8;
      }
      break;
    case 2094: 
      if (paramString.equals("AO")) {
        i2 = 7;
      }
      break;
    case 2092: 
      if (paramString.equals("AM")) {
        i2 = 6;
      }
      break;
    case 2091: 
      if (paramString.equals("AL")) {
        i2 = 5;
      }
      break;
    case 2088: 
      if (paramString.equals("AI")) {
        i2 = 4;
      }
      break;
    case 2086: 
      if (paramString.equals("AG")) {
        i2 = 3;
      }
      break;
    case 2085: 
      if (paramString.equals("AF")) {
        i2 = 2;
      }
      break;
    case 2084: 
      if (paramString.equals("AE")) {
        i2 = 1;
      }
      break;
    case 2083: 
      if (paramString.equals("AD")) {
        i2 = 0;
      }
      break;
    }
    paramString = new int[6];
    switch (i2)
    {
    default: 
      paramString[0] = 2;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 236: 
      paramString[0] = 4;
      paramString[1] = 4;
      paramString[2] = 4;
      paramString[3] = 3;
      paramString[4] = 3;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 235: 
      paramString[0] = 2;
      paramString[1] = 3;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 234: 
      paramString[0] = 2;
      paramString[1] = 3;
      paramString[2] = 3;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 232: 
      paramString[0] = 1;
      paramString[1] = 2;
      paramString[2] = 1;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 229: 
      paramString[0] = 4;
      paramString[1] = 3;
      paramString[2] = 3;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 228: 
      paramString[0] = 0;
      paramString[1] = 0;
      paramString[2] = 1;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 1;
      paramString;
      return paramString;
    case 227: 
      paramString[0] = 0;
      paramString[1] = 2;
      paramString[2] = 1;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 226: 
      paramString[0] = 2;
      paramString[1] = 2;
      paramString[2] = 0;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 222: 
      paramString[0] = 2;
      paramString[1] = 2;
      paramString[2] = 3;
      paramString[3] = 4;
      paramString[4] = 3;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 220: 
      paramString[0] = 1;
      paramString[1] = 1;
      paramString[2] = 4;
      paramString[3] = 1;
      paramString[4] = 3;
      paramString[5] = 1;
      paramString;
      return paramString;
    case 218: 
      paramString[0] = 0;
      paramString[1] = 1;
      paramString[2] = 1;
      paramString[3] = 2;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 216: 
      paramString[0] = 0;
      paramString[1] = 2;
      paramString[2] = 0;
      paramString[3] = 0;
      paramString[4] = 0;
      paramString[5] = 0;
      paramString;
      return paramString;
    case 214: 
      paramString[0] = 1;
      paramString[1] = 4;
      paramString[2] = 0;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 213: 
      paramString[0] = 1;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 1;
      paramString[4] = 3;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 211: 
    case 221: 
      paramString[0] = 2;
      paramString[1] = 1;
      paramString[2] = 1;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 209: 
      paramString[0] = 4;
      paramString[1] = 2;
      paramString[2] = 4;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 206: 
      paramString[0] = 0;
      paramString[1] = 1;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 203: 
      paramString[0] = 2;
      paramString[1] = 2;
      paramString[2] = 1;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 202: 
      paramString[0] = 4;
      paramString[1] = 4;
      paramString[2] = 3;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 198: 
      paramString[0] = 2;
      paramString[1] = 2;
      paramString[2] = 1;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 197: 
    case 210: 
      paramString[0] = 4;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 196: 
      paramString[0] = 2;
      paramString[1] = 4;
      paramString[2] = 3;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 195: 
      paramString[0] = 3;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 4;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 191: 
      paramString[0] = 1;
      paramString[1] = 1;
      paramString[2] = 1;
      paramString[3] = 1;
      paramString[4] = 3;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 187: 
      paramString[0] = 2;
      paramString[1] = 3;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 3;
      paramString[5] = 3;
      paramString;
      return paramString;
    case 186: 
      paramString[0] = 0;
      paramString[1] = 1;
      paramString[2] = 1;
      paramString[3] = 1;
      paramString[4] = 0;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 185: 
      paramString[0] = 4;
      paramString[1] = 3;
      paramString[2] = 4;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 184: 
      paramString[0] = 4;
      paramString[1] = 3;
      paramString[2] = 1;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 181: 
      paramString[0] = 3;
      paramString[1] = 3;
      paramString[2] = 1;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 180: 
      paramString[0] = 1;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 0;
      paramString[4] = 3;
      paramString[5] = 3;
      paramString;
      return paramString;
    case 179: 
      paramString[0] = 2;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 178: 
      paramString[0] = 0;
      paramString[1] = 0;
      paramString[2] = 1;
      paramString[3] = 2;
      paramString[4] = 1;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 177: 
      paramString[0] = 1;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 3;
      paramString[4] = 1;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 176: 
      paramString[0] = 1;
      paramString[1] = 4;
      paramString[2] = 4;
      paramString[3] = 4;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 174: 
      paramString[0] = 2;
      paramString[1] = 2;
      paramString[2] = 4;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 173: 
      paramString[0] = 1;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 0;
      paramString[4] = 1;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 172: 
      paramString[0] = 3;
      paramString[1] = 4;
      paramString[2] = 1;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 171: 
      paramString[0] = 2;
      paramString[1] = 0;
      paramString[2] = 2;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 1;
      paramString;
      return paramString;
    case 169: 
      paramString[0] = 2;
      paramString[1] = 1;
      paramString[2] = 2;
      paramString[3] = 2;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 167: 
      paramString[0] = 2;
      paramString[1] = 1;
      paramString[2] = 3;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 0;
      paramString;
      return paramString;
    case 165: 
    case 199: 
      paramString[0] = 2;
      paramString[1] = 3;
      paramString[2] = 3;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 164: 
      paramString[0] = 1;
      paramString[1] = 2;
      paramString[2] = 4;
      paramString[3] = 4;
      paramString[4] = 3;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 163: 
      paramString[0] = 2;
      paramString[1] = 3;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 162: 
      paramString[0] = 2;
      paramString[1] = 3;
      paramString[2] = 1;
      paramString[3] = 3;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 161: 
      paramString[0] = 1;
      paramString[1] = 0;
      paramString[2] = 2;
      paramString[3] = 2;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 160: 
      paramString[0] = 4;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 159: 
      paramString[0] = 4;
      paramString[1] = 0;
      paramString[2] = 3;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 158: 
      paramString[0] = 2;
      paramString[1] = 1;
      paramString[2] = 4;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 157: 
      paramString[0] = 0;
      paramString[1] = 1;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 1;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 156: 
      paramString[0] = 0;
      paramString[1] = 2;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 0;
      paramString[5] = 4;
      paramString;
      return paramString;
    case 155: 
      paramString[0] = 2;
      paramString[1] = 3;
      paramString[2] = 4;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 154: 
      paramString[0] = 3;
      paramString[1] = 4;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 152: 
      paramString[0] = 3;
      paramString[1] = 2;
      paramString[2] = 3;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 151: 
      paramString[0] = 3;
      paramString[1] = 4;
      paramString[2] = 3;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 149: 
      paramString[0] = 1;
      paramString[1] = 0;
      paramString[2] = 4;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 148: 
      paramString[0] = 3;
      paramString[1] = 4;
      paramString[2] = 4;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 147: 
      paramString[0] = 4;
      paramString[1] = 2;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 146: 
      paramString[0] = 3;
      paramString[1] = 4;
      paramString[2] = 1;
      paramString[3] = 3;
      paramString[4] = 3;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 145: 
    case 182: 
      paramString[0] = 3;
      paramString[1] = 1;
      paramString[2] = 1;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 142: 
      paramString[0] = 4;
      paramString[1] = 2;
      paramString[2] = 3;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 139: 
      paramString[0] = 0;
      paramString[1] = 2;
      paramString[2] = 4;
      paramString[3] = 4;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 138: 
      paramString[0] = 2;
      paramString[1] = 0;
      paramString[2] = 1;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 137: 
      paramString[0] = 2;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 3;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 136: 
    case 217: 
      paramString[0] = 3;
      paramString[1] = 4;
      paramString[2] = 2;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 135: 
      paramString[0] = 2;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 1;
      paramString[4] = 3;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 134: 
      paramString[0] = 4;
      paramString[1] = 2;
      paramString[2] = 1;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 131: 
      paramString[0] = 2;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 1;
      paramString[4] = 1;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 130: 
      paramString[0] = 1;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 129: 
      paramString[0] = 0;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 128: 
      paramString[0] = 3;
      paramString[1] = 3;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 127: 
    case 212: 
    case 237: 
      paramString[0] = 3;
      paramString[1] = 2;
      paramString[2] = 4;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 125: 
      paramString[0] = 1;
      paramString[1] = 1;
      paramString[2] = 4;
      paramString[3] = 2;
      paramString[4] = 0;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 123: 
    case 219: 
      paramString[0] = 3;
      paramString[1] = 3;
      paramString[2] = 3;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 122: 
      paramString[0] = 3;
      paramString[1] = 4;
      paramString[2] = 3;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 121: 
      paramString[0] = 3;
      paramString[1] = 2;
      paramString[2] = 3;
      paramString[3] = 4;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 117: 
      paramString[0] = 1;
      paramString[1] = 2;
      paramString[2] = 1;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 114: 
      paramString[0] = 1;
      paramString[1] = 0;
      paramString[2] = 1;
      paramString[3] = 0;
      paramString[4] = 0;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 113: 
      paramString[0] = 0;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 4;
      paramString[4] = 4;
      paramString[5] = 4;
      paramString;
      return paramString;
    case 109: 
      paramString[0] = 1;
      paramString[1] = 0;
      paramString[2] = 4;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 108: 
    case 141: 
      paramString[0] = 2;
      paramString[1] = 1;
      paramString[2] = 1;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 107: 
      paramString[0] = 3;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 106: 
      paramString[0] = 0;
      paramString[1] = 3;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 4;
      paramString[5] = 4;
      paramString;
      return paramString;
    case 105: 
      paramString[0] = 2;
      paramString[1] = 0;
      paramString[2] = 1;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 104: 
      paramString[0] = 2;
      paramString[1] = 4;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 102: 
      paramString[0] = 0;
      paramString[1] = 0;
      paramString[2] = 1;
      paramString[3] = 1;
      paramString[4] = 1;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 101: 
      paramString[0] = 0;
      paramString[1] = 0;
      paramString[2] = 1;
      paramString[3] = 0;
      paramString[4] = 0;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 100: 
      paramString[0] = 4;
      paramString[1] = 2;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 99: 
    case 190: 
      paramString[0] = 3;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 98: 
    case 215: 
    case 230: 
      paramString[0] = 4;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 97: 
      paramString[0] = 1;
      paramString[1] = 1;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 1;
      paramString;
      return paramString;
    case 96: 
      paramString[0] = 0;
      paramString[1] = 2;
      paramString[2] = 0;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 95: 
      paramString[0] = 1;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 3;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 93: 
      paramString[0] = 3;
      paramString[1] = 1;
      paramString[2] = 1;
      paramString[3] = 2;
      paramString[4] = 3;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 89: 
      paramString[0] = 3;
      paramString[1] = 3;
      paramString[2] = 2;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 88: 
      paramString[0] = 0;
      paramString[1] = 1;
      paramString[2] = 1;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 0;
      paramString;
      return paramString;
    case 87: 
      paramString[0] = 3;
      paramString[1] = 0;
      paramString[2] = 1;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 86: 
      paramString[0] = 4;
      paramString[1] = 4;
      paramString[2] = 2;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 84: 
      paramString[0] = 2;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 1;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 82: 
      paramString[0] = 4;
      paramString[1] = 4;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 81: 
      paramString[0] = 3;
      paramString[1] = 1;
      paramString[2] = 1;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 80: 
      paramString[0] = 4;
      paramString[1] = 4;
      paramString[2] = 4;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 79: 
      paramString[0] = 4;
      paramString[1] = 3;
      paramString[2] = 2;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 78: 
    case 208: 
      paramString[0] = 2;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 77: 
    case 103: 
      paramString[0] = 1;
      paramString[1] = 2;
      paramString[2] = 0;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 75: 
      paramString[0] = 0;
      paramString[1] = 2;
      paramString[2] = 1;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 74: 
    case 168: 
    case 192: 
      paramString[0] = 3;
      paramString[1] = 2;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 73: 
      paramString[0] = 1;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 72: 
    case 112: 
    case 115: 
    case 119: 
    case 200: 
    case 224: 
      paramString[0] = 1;
      paramString[1] = 2;
      paramString[2] = 0;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 71: 
      paramString[0] = 0;
      paramString[1] = 1;
      paramString[2] = 1;
      paramString[3] = 2;
      paramString[4] = 1;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 70: 
    case 205: 
      paramString[0] = 3;
      paramString[1] = 4;
      paramString[2] = 1;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 69: 
      paramString[0] = 1;
      paramString[1] = 1;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 1;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 67: 
      paramString[0] = 4;
      paramString[1] = 2;
      paramString[2] = 3;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 66: 
      paramString[0] = 3;
      paramString[1] = 1;
      paramString[2] = 2;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 65: 
      paramString[0] = 0;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 2;
      paramString[4] = 0;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 64: 
    case 194: 
      paramString[0] = 4;
      paramString[1] = 4;
      paramString[2] = 3;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 59: 
      paramString[0] = 1;
      paramString[1] = 3;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 57: 
      paramString[0] = 3;
      paramString[1] = 4;
      paramString[2] = 4;
      paramString[3] = 4;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 55: 
    case 60: 
    case 92: 
    case 124: 
    case 144: 
      paramString[0] = 0;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 0;
      paramString[4] = 0;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 54: 
    case 201: 
    case 207: 
      paramString[0] = 4;
      paramString[1] = 3;
      paramString[2] = 4;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 53: 
      paramString[0] = 0;
      paramString[1] = 1;
      paramString[2] = 3;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 52: 
      paramString[0] = 0;
      paramString[1] = 0;
      paramString[2] = 2;
      paramString[3] = 0;
      paramString[4] = 1;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 51: 
    case 90: 
    case 126: 
      paramString[0] = 1;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 0;
      paramString[4] = 0;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 48: 
      paramString[0] = 2;
      paramString[1] = 3;
      paramString[2] = 0;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 47: 
    case 110: 
      paramString[0] = 4;
      paramString[1] = 2;
      paramString[2] = 4;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 46: 
      paramString[0] = 2;
      paramString[1] = 4;
      paramString[2] = 4;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 45: 
      paramString[0] = 2;
      paramString[1] = 3;
      paramString[2] = 4;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 44: 
      paramString[0] = 2;
      paramString[1] = 0;
      paramString[2] = 4;
      paramString[3] = 3;
      paramString[4] = 3;
      paramString[5] = 1;
      paramString;
      return paramString;
    case 43: 
      paramString[0] = 4;
      paramString[1] = 3;
      paramString[2] = 3;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 42: 
      paramString[0] = 1;
      paramString[1] = 1;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 3;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 40: 
    case 61: 
      paramString[0] = 3;
      paramString[1] = 4;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 39: 
      paramString[0] = 0;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 0;
      paramString[4] = 0;
      paramString[5] = 3;
      paramString;
      return paramString;
    case 38: 
    case 76: 
      paramString[0] = 3;
      paramString[1] = 3;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 37: 
    case 183: 
      paramString[0] = 4;
      paramString[1] = 2;
      paramString[2] = 4;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 36: 
    case 111: 
      paramString[0] = 4;
      paramString[1] = 3;
      paramString[2] = 3;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 35: 
      paramString[0] = 0;
      paramString[1] = 2;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 3;
      paramString[5] = 3;
      paramString;
      return paramString;
    case 34: 
    case 41: 
      paramString[0] = 2;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 33: 
      paramString[0] = 1;
      paramString[1] = 1;
      paramString[2] = 2;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 32: 
      paramString[0] = 3;
      paramString[1] = 2;
      paramString[2] = 1;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 31: 
    case 150: 
    case 231: 
      paramString[0] = 3;
      paramString[1] = 1;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 30: 
    case 118: 
      paramString[0] = 3;
      paramString[1] = 2;
      paramString[2] = 1;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 29: 
      paramString[0] = 1;
      paramString[1] = 1;
      paramString[2] = 2;
      paramString[3] = 1;
      paramString[4] = 1;
      paramString[5] = 0;
      paramString;
      return paramString;
    case 27: 
      paramString[0] = 1;
      paramString[1] = 2;
      paramString[2] = 3;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 26: 
      paramString[0] = 3;
      paramString[1] = 2;
      paramString[2] = 0;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 24: 
    case 132: 
    case 175: 
      paramString[0] = 1;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 23: 
      paramString[0] = 4;
      paramString[1] = 4;
      paramString[2] = 2;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 22: 
    case 91: 
    case 133: 
    case 153: 
    case 204: 
    case 225: 
    case 233: 
      paramString[0] = 4;
      paramString[1] = 4;
      paramString[2] = 4;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 21: 
      paramString[0] = 1;
      paramString[1] = 3;
      paramString[2] = 1;
      paramString[3] = 4;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 20: 
    case 63: 
    case 83: 
    case 189: 
      paramString[0] = 0;
      paramString[1] = 0;
      paramString[2] = 0;
      paramString[3] = 0;
      paramString[4] = 1;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 18: 
      paramString[0] = 0;
      paramString[1] = 1;
      paramString[2] = 4;
      paramString[3] = 4;
      paramString[4] = 3;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 17: 
    case 116: 
      paramString[0] = 2;
      paramString[1] = 1;
      paramString[2] = 2;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 15: 
    case 94: 
      paramString[0] = 1;
      paramString[1] = 1;
      paramString[2] = 1;
      paramString[3] = 1;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 14: 
    case 19: 
    case 58: 
      paramString[0] = 3;
      paramString[1] = 3;
      paramString[2] = 4;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 13: 
    case 50: 
    case 120: 
    case 140: 
    case 143: 
    case 170: 
    case 193: 
    case 223: 
      paramString[0] = 0;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 12: 
    case 85: 
      paramString[0] = 1;
      paramString[1] = 2;
      paramString[2] = 4;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 11: 
      paramString[0] = 0;
      paramString[1] = 2;
      paramString[2] = 1;
      paramString[3] = 1;
      paramString[4] = 3;
      paramString[5] = 0;
      paramString;
      return paramString;
    case 10: 
      paramString[0] = 1;
      paramString[1] = 2;
      paramString[2] = 1;
      paramString[3] = 4;
      paramString[4] = 1;
      paramString[5] = 4;
      paramString;
      return paramString;
    case 9: 
      paramString[0] = 2;
      paramString[1] = 2;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 8: 
    case 62: 
    case 188: 
      paramString[0] = 4;
      paramString[1] = 2;
      paramString[2] = 2;
      paramString[3] = 2;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 7: 
      paramString[0] = 4;
      paramString[1] = 4;
      paramString[2] = 4;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 6: 
      paramString[0] = 2;
      paramString[1] = 3;
      paramString[2] = 2;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 5: 
      paramString[0] = 1;
      paramString[1] = 1;
      paramString[2] = 1;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 4: 
    case 16: 
    case 25: 
    case 28: 
    case 56: 
    case 68: 
      paramString[0] = 0;
      paramString[1] = 2;
      paramString[2] = 0;
      paramString[3] = 0;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 3: 
      paramString[0] = 2;
      paramString[1] = 4;
      paramString[2] = 3;
      paramString[3] = 4;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 2: 
    case 166: 
      paramString[0] = 4;
      paramString[1] = 3;
      paramString[2] = 3;
      paramString[3] = 3;
      paramString[4] = 2;
      paramString[5] = 2;
      paramString;
      return paramString;
    case 1: 
      paramString[0] = 1;
      paramString[1] = 4;
      paramString[2] = 3;
      paramString[3] = 4;
      paramString[4] = 4;
      paramString[5] = 2;
      paramString;
      return paramString;
    }
    paramString[0] = 2;
    paramString[1] = 2;
    paramString[2] = 0;
    paramString[3] = 0;
    paramString[4] = 2;
    paramString[5] = 2;
    paramString;
    return paramString;
  }
  
  public final void a(n paramn, boolean paramBoolean, int paramInt)
  {
    int i1 = 1;
    if (paramBoolean) {}
    try
    {
      int i2 = i;
      if ((i2 & 0x8) == 8) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if (i2 == 0) {
        i2 = i1;
      } else {
        i2 = 0;
      }
      if (i2 == 0) {
        return;
      }
      h += paramInt;
      return;
    }
    finally {}
  }
  
  public final void b(a parama)
  {
    b.a(parama);
  }
  
  public final void d() {}
  
  public final void e(Handler paramHandler, a parama)
  {
    parama.getClass();
    e.a.a locala = b;
    locala.getClass();
    locala.a(parama);
    a.add(new e.a.a.a(paramHandler, parama));
  }
  
  public final q f()
  {
    return this;
  }
  
  public final long g()
  {
    try
    {
      long l1 = l;
      return l1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void h(n paramn, boolean paramBoolean)
  {
    boolean bool = false;
    if (paramBoolean) {}
    try
    {
      int i1 = i;
      if ((i1 & 0x8) == 8) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 == 0) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (i1 == 0) {
        return;
      }
      paramBoolean = bool;
      if (f > 0) {
        paramBoolean = true;
      }
      b.H(paramBoolean);
      long l1 = d.d();
      i1 = (int)(l1 - g);
      j += i1;
      long l2 = k;
      long l3 = h;
      k = (l2 + l3);
      if (i1 > 0)
      {
        float f1 = (float)l3 * 8000.0F / i1;
        c.a(f1, (int)Math.sqrt(l3));
        if ((j >= 2000L) || (k >= 524288L)) {
          l = (c.b());
        }
        l(i1, h, l);
        g = l1;
        h = 0L;
      }
      f -= 1;
      return;
    }
    finally {}
  }
  
  public final void i(n paramn, boolean paramBoolean)
  {
    int i1 = 0;
    int i2 = i1;
    if (paramBoolean) {}
    try
    {
      i2 = i;
      int i3;
      if ((i2 & 0x8) == 8) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      i2 = i1;
      if (i3 == 0) {
        i2 = 1;
      }
      if (i2 == 0) {
        return;
      }
      if (f == 0) {
        g = d.d();
      }
      f += 1;
      return;
    }
    finally {}
  }
  
  public final long k(int paramInt)
  {
    Object localObject1 = (Long)a.get(Integer.valueOf(paramInt));
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = (Long)a.get(Integer.valueOf(0));
    }
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = Long.valueOf(1000000L);
    }
    return ((Long)localObject1).longValue();
  }
  
  public final void l(int paramInt, long paramLong1, long paramLong2)
  {
    if ((paramInt == 0) && (paramLong1 == 0L) && (paramLong2 == m)) {
      return;
    }
    m = paramLong2;
    Iterator localIterator = b.a.iterator();
    while (localIterator.hasNext())
    {
      e.a.a.a locala = (e.a.a.a)localIterator.next();
      if (!c) {
        a.post(new d(locala, paramInt, paramLong1, paramLong2));
      }
    }
  }
}

/* Location:
 * Qualified Name:     t5.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */