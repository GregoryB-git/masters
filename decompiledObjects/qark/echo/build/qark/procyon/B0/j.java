// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B0;

import java.util.HashMap;
import g0.M;
import android.os.Handler;
import g0.a;
import i0.g;
import i0.k;
import g0.t;
import java.util.Map;
import android.content.Context;
import g0.c;
import X2.w;
import X2.v;
import i0.y;

public final class j implements e, y
{
    public static final v p;
    public static final v q;
    public static final v r;
    public static final v s;
    public static final v t;
    public static final v u;
    public static j v;
    public final w a;
    public final e.a.a b;
    public final c c;
    public final boolean d;
    public final s e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public boolean n;
    public int o;
    
    static {
        final Long value = 1700000L;
        final Long value2 = 860000L;
        p = X2.v.c0(4300000L, 3200000L, 2400000L, value, value2);
        final Long value3 = 980000L;
        q = X2.v.c0(1500000L, value3, 750000L, 520000L, 290000L);
        final Long value4 = 2000000L;
        final Long value5 = 1300000L;
        final Long value6 = 1000000L;
        r = X2.v.c0(value4, value5, value6, value2, 610000L);
        s = X2.v.c0(2500000L, value, 1200000L, 970000L, 680000L);
        t = X2.v.c0(4700000L, 2800000L, 2100000L, value, value3);
        u = X2.v.c0(2700000L, value4, 1600000L, value5, value6);
    }
    
    public j(final Context context, final Map map, int f, final c c, final boolean d) {
        this.a = w.c(map);
        this.b = new e.a.a();
        this.e = new s(f);
        this.c = c;
        this.d = d;
        if (context != null) {
            final t d2 = g0.t.d(context);
            f = d2.f();
            this.m = f;
            this.k = this.m(f);
            d2.i((t.c)new i(this));
            return;
        }
        this.m = 0;
        this.k = this.m(0);
    }
    
    public static int[] l(final String s) {
        int n = 4;
        s.hashCode();
        Label_6540: {
            switch (s) {
                case "ZW": {
                    n = 238;
                    break Label_6540;
                }
                case "ZM": {
                    n = 237;
                    break Label_6540;
                }
                case "ZA": {
                    n = 236;
                    break Label_6540;
                }
                case "YT": {
                    n = 235;
                    break Label_6540;
                }
                case "YE": {
                    n = 234;
                    break Label_6540;
                }
                case "XK": {
                    n = 233;
                    break Label_6540;
                }
                case "WS": {
                    n = 232;
                    break Label_6540;
                }
                case "WF": {
                    n = 231;
                    break Label_6540;
                }
                case "VU": {
                    n = 230;
                    break Label_6540;
                }
                case "VN": {
                    n = 229;
                    break Label_6540;
                }
                case "VI": {
                    n = 228;
                    break Label_6540;
                }
                case "VG": {
                    n = 227;
                    break Label_6540;
                }
                case "VE": {
                    n = 226;
                    break Label_6540;
                }
                case "VC": {
                    n = 225;
                    break Label_6540;
                }
                case "VA": {
                    n = 224;
                    break Label_6540;
                }
                case "UZ": {
                    n = 223;
                    break Label_6540;
                }
                case "UY": {
                    n = 222;
                    break Label_6540;
                }
                case "US": {
                    n = 221;
                    break Label_6540;
                }
                case "UG": {
                    n = 220;
                    break Label_6540;
                }
                case "UA": {
                    n = 219;
                    break Label_6540;
                }
                case "TZ": {
                    n = 218;
                    break Label_6540;
                }
                case "TW": {
                    n = 217;
                    break Label_6540;
                }
                case "TV": {
                    n = 216;
                    break Label_6540;
                }
                case "TT": {
                    n = 215;
                    break Label_6540;
                }
                case "TR": {
                    n = 214;
                    break Label_6540;
                }
                case "TO": {
                    n = 213;
                    break Label_6540;
                }
                case "TN": {
                    n = 212;
                    break Label_6540;
                }
                case "TM": {
                    n = 211;
                    break Label_6540;
                }
                case "TL": {
                    n = 210;
                    break Label_6540;
                }
                case "TJ": {
                    n = 209;
                    break Label_6540;
                }
                case "TH": {
                    n = 208;
                    break Label_6540;
                }
                case "TG": {
                    n = 207;
                    break Label_6540;
                }
                case "TD": {
                    n = 206;
                    break Label_6540;
                }
                case "TC": {
                    n = 205;
                    break Label_6540;
                }
                case "SZ": {
                    n = 204;
                    break Label_6540;
                }
                case "SY": {
                    n = 203;
                    break Label_6540;
                }
                case "SX": {
                    n = 202;
                    break Label_6540;
                }
                case "SV": {
                    n = 201;
                    break Label_6540;
                }
                case "ST": {
                    n = 200;
                    break Label_6540;
                }
                case "SS": {
                    n = 199;
                    break Label_6540;
                }
                case "SR": {
                    n = 198;
                    break Label_6540;
                }
                case "SO": {
                    n = 197;
                    break Label_6540;
                }
                case "SN": {
                    n = 196;
                    break Label_6540;
                }
                case "SM": {
                    n = 195;
                    break Label_6540;
                }
                case "SL": {
                    n = 194;
                    break Label_6540;
                }
                case "SK": {
                    n = 193;
                    break Label_6540;
                }
                case "SJ": {
                    n = 192;
                    break Label_6540;
                }
                case "SI": {
                    n = 191;
                    break Label_6540;
                }
                case "SH": {
                    n = 190;
                    break Label_6540;
                }
                case "SG": {
                    n = 189;
                    break Label_6540;
                }
                case "SE": {
                    n = 188;
                    break Label_6540;
                }
                case "SD": {
                    n = 187;
                    break Label_6540;
                }
                case "SC": {
                    n = 186;
                    break Label_6540;
                }
                case "SB": {
                    n = 185;
                    break Label_6540;
                }
                case "SA": {
                    n = 184;
                    break Label_6540;
                }
                case "RW": {
                    n = 183;
                    break Label_6540;
                }
                case "RU": {
                    n = 182;
                    break Label_6540;
                }
                case "RS": {
                    n = 181;
                    break Label_6540;
                }
                case "RO": {
                    n = 180;
                    break Label_6540;
                }
                case "RE": {
                    n = 179;
                    break Label_6540;
                }
                case "QA": {
                    n = 178;
                    break Label_6540;
                }
                case "PY": {
                    n = 177;
                    break Label_6540;
                }
                case "PW": {
                    n = 176;
                    break Label_6540;
                }
                case "PT": {
                    n = 175;
                    break Label_6540;
                }
                case "PS": {
                    n = 174;
                    break Label_6540;
                }
                case "PR": {
                    n = 173;
                    break Label_6540;
                }
                case "PM": {
                    n = 172;
                    break Label_6540;
                }
                case "PL": {
                    n = 171;
                    break Label_6540;
                }
                case "PK": {
                    n = 170;
                    break Label_6540;
                }
                case "PH": {
                    n = 169;
                    break Label_6540;
                }
                case "PG": {
                    n = 168;
                    break Label_6540;
                }
                case "PF": {
                    n = 167;
                    break Label_6540;
                }
                case "PE": {
                    n = 166;
                    break Label_6540;
                }
                case "PA": {
                    n = 165;
                    break Label_6540;
                }
                case "OM": {
                    n = 164;
                    break Label_6540;
                }
                case "NZ": {
                    n = 163;
                    break Label_6540;
                }
                case "NU": {
                    n = 162;
                    break Label_6540;
                }
                case "NR": {
                    n = 161;
                    break Label_6540;
                }
                case "NP": {
                    n = 160;
                    break Label_6540;
                }
                case "NO": {
                    n = 159;
                    break Label_6540;
                }
                case "NL": {
                    n = 158;
                    break Label_6540;
                }
                case "NI": {
                    n = 157;
                    break Label_6540;
                }
                case "NG": {
                    n = 156;
                    break Label_6540;
                }
                case "NF": {
                    n = 155;
                    break Label_6540;
                }
                case "NE": {
                    n = 154;
                    break Label_6540;
                }
                case "NC": {
                    n = 153;
                    break Label_6540;
                }
                case "NA": {
                    n = 152;
                    break Label_6540;
                }
                case "MZ": {
                    n = 151;
                    break Label_6540;
                }
                case "MY": {
                    n = 150;
                    break Label_6540;
                }
                case "MX": {
                    n = 149;
                    break Label_6540;
                }
                case "MW": {
                    n = 148;
                    break Label_6540;
                }
                case "MV": {
                    n = 147;
                    break Label_6540;
                }
                case "MU": {
                    n = 146;
                    break Label_6540;
                }
                case "MT": {
                    n = 145;
                    break Label_6540;
                }
                case "MS": {
                    n = 144;
                    break Label_6540;
                }
                case "MR": {
                    n = 143;
                    break Label_6540;
                }
                case "MQ": {
                    n = 142;
                    break Label_6540;
                }
                case "MP": {
                    n = 141;
                    break Label_6540;
                }
                case "MO": {
                    n = 140;
                    break Label_6540;
                }
                case "MN": {
                    n = 139;
                    break Label_6540;
                }
                case "MM": {
                    n = 138;
                    break Label_6540;
                }
                case "ML": {
                    n = 137;
                    break Label_6540;
                }
                case "MK": {
                    n = 136;
                    break Label_6540;
                }
                case "MH": {
                    n = 135;
                    break Label_6540;
                }
                case "MG": {
                    n = 134;
                    break Label_6540;
                }
                case "MF": {
                    n = 133;
                    break Label_6540;
                }
                case "ME": {
                    n = 132;
                    break Label_6540;
                }
                case "MD": {
                    n = 131;
                    break Label_6540;
                }
                case "MC": {
                    n = 130;
                    break Label_6540;
                }
                case "MA": {
                    n = 129;
                    break Label_6540;
                }
                case "LY": {
                    n = 128;
                    break Label_6540;
                }
                case "LV": {
                    n = 127;
                    break Label_6540;
                }
                case "LU": {
                    n = 126;
                    break Label_6540;
                }
                case "LT": {
                    n = 125;
                    break Label_6540;
                }
                case "LS": {
                    n = 124;
                    break Label_6540;
                }
                case "LR": {
                    n = 123;
                    break Label_6540;
                }
                case "LK": {
                    n = 122;
                    break Label_6540;
                }
                case "LI": {
                    n = 121;
                    break Label_6540;
                }
                case "LC": {
                    n = 120;
                    break Label_6540;
                }
                case "LB": {
                    n = 119;
                    break Label_6540;
                }
                case "LA": {
                    n = 118;
                    break Label_6540;
                }
                case "KZ": {
                    n = 117;
                    break Label_6540;
                }
                case "KY": {
                    n = 116;
                    break Label_6540;
                }
                case "KW": {
                    n = 115;
                    break Label_6540;
                }
                case "KR": {
                    n = 114;
                    break Label_6540;
                }
                case "KN": {
                    n = 113;
                    break Label_6540;
                }
                case "KM": {
                    n = 112;
                    break Label_6540;
                }
                case "KI": {
                    n = 111;
                    break Label_6540;
                }
                case "KH": {
                    n = 110;
                    break Label_6540;
                }
                case "KG": {
                    n = 109;
                    break Label_6540;
                }
                case "KE": {
                    n = 108;
                    break Label_6540;
                }
                case "JP": {
                    n = 107;
                    break Label_6540;
                }
                case "JO": {
                    n = 106;
                    break Label_6540;
                }
                case "JM": {
                    n = 105;
                    break Label_6540;
                }
                case "JE": {
                    n = 104;
                    break Label_6540;
                }
                case "IT": {
                    n = 103;
                    break Label_6540;
                }
                case "IS": {
                    n = 102;
                    break Label_6540;
                }
                case "IR": {
                    n = 101;
                    break Label_6540;
                }
                case "IQ": {
                    n = 100;
                    break Label_6540;
                }
                case "IO": {
                    n = 99;
                    break Label_6540;
                }
                case "IN": {
                    n = 98;
                    break Label_6540;
                }
                case "IM": {
                    n = 97;
                    break Label_6540;
                }
                case "IL": {
                    n = 96;
                    break Label_6540;
                }
                case "IE": {
                    n = 95;
                    break Label_6540;
                }
                case "ID": {
                    n = 94;
                    break Label_6540;
                }
                case "HU": {
                    n = 93;
                    break Label_6540;
                }
                case "HT": {
                    n = 92;
                    break Label_6540;
                }
                case "HR": {
                    n = 91;
                    break Label_6540;
                }
                case "HK": {
                    n = 90;
                    break Label_6540;
                }
                case "GY": {
                    n = 89;
                    break Label_6540;
                }
                case "GW": {
                    n = 88;
                    break Label_6540;
                }
                case "GU": {
                    n = 87;
                    break Label_6540;
                }
                case "GT": {
                    n = 86;
                    break Label_6540;
                }
                case "GR": {
                    n = 85;
                    break Label_6540;
                }
                case "GQ": {
                    n = 84;
                    break Label_6540;
                }
                case "GP": {
                    n = 83;
                    break Label_6540;
                }
                case "GN": {
                    n = 82;
                    break Label_6540;
                }
                case "GM": {
                    n = 81;
                    break Label_6540;
                }
                case "GL": {
                    n = 80;
                    break Label_6540;
                }
                case "GI": {
                    n = 79;
                    break Label_6540;
                }
                case "GH": {
                    n = 78;
                    break Label_6540;
                }
                case "GG": {
                    n = 77;
                    break Label_6540;
                }
                case "GF": {
                    n = 76;
                    break Label_6540;
                }
                case "GE": {
                    n = 75;
                    break Label_6540;
                }
                case "GD": {
                    n = 74;
                    break Label_6540;
                }
                case "GB": {
                    n = 73;
                    break Label_6540;
                }
                case "GA": {
                    n = 72;
                    break Label_6540;
                }
                case "FR": {
                    n = 71;
                    break Label_6540;
                }
                case "FO": {
                    n = 70;
                    break Label_6540;
                }
                case "FM": {
                    n = 69;
                    break Label_6540;
                }
                case "FK": {
                    n = 68;
                    break Label_6540;
                }
                case "FJ": {
                    n = 67;
                    break Label_6540;
                }
                case "FI": {
                    n = 66;
                    break Label_6540;
                }
                case "ET": {
                    n = 65;
                    break Label_6540;
                }
                case "ES": {
                    n = 64;
                    break Label_6540;
                }
                case "ER": {
                    n = 63;
                    break Label_6540;
                }
                case "EG": {
                    n = 62;
                    break Label_6540;
                }
                case "EE": {
                    n = 61;
                    break Label_6540;
                }
                case "EC": {
                    n = 60;
                    break Label_6540;
                }
                case "DZ": {
                    n = 59;
                    break Label_6540;
                }
                case "DO": {
                    n = 58;
                    break Label_6540;
                }
                case "DM": {
                    n = 57;
                    break Label_6540;
                }
                case "DK": {
                    n = 56;
                    break Label_6540;
                }
                case "DJ": {
                    n = 55;
                    break Label_6540;
                }
                case "DE": {
                    n = 54;
                    break Label_6540;
                }
                case "CZ": {
                    n = 53;
                    break Label_6540;
                }
                case "CY": {
                    n = 52;
                    break Label_6540;
                }
                case "CX": {
                    n = 51;
                    break Label_6540;
                }
                case "CW": {
                    n = 50;
                    break Label_6540;
                }
                case "CV": {
                    n = 49;
                    break Label_6540;
                }
                case "CU": {
                    n = 48;
                    break Label_6540;
                }
                case "CR": {
                    n = 47;
                    break Label_6540;
                }
                case "CO": {
                    n = 46;
                    break Label_6540;
                }
                case "CN": {
                    n = 45;
                    break Label_6540;
                }
                case "CM": {
                    n = 44;
                    break Label_6540;
                }
                case "CL": {
                    n = 43;
                    break Label_6540;
                }
                case "CK": {
                    n = 42;
                    break Label_6540;
                }
                case "CI": {
                    n = 41;
                    break Label_6540;
                }
                case "CH": {
                    n = 40;
                    break Label_6540;
                }
                case "CG": {
                    n = 39;
                    break Label_6540;
                }
                case "CF": {
                    n = 38;
                    break Label_6540;
                }
                case "CD": {
                    n = 37;
                    break Label_6540;
                }
                case "CA": {
                    n = 36;
                    break Label_6540;
                }
                case "BZ": {
                    n = 35;
                    break Label_6540;
                }
                case "BY": {
                    n = 34;
                    break Label_6540;
                }
                case "BW": {
                    n = 33;
                    break Label_6540;
                }
                case "BT": {
                    n = 32;
                    break Label_6540;
                }
                case "BS": {
                    n = 31;
                    break Label_6540;
                }
                case "BR": {
                    n = 30;
                    break Label_6540;
                }
                case "BQ": {
                    n = 29;
                    break Label_6540;
                }
                case "BO": {
                    n = 28;
                    break Label_6540;
                }
                case "BN": {
                    n = 27;
                    break Label_6540;
                }
                case "BM": {
                    n = 26;
                    break Label_6540;
                }
                case "BL": {
                    n = 25;
                    break Label_6540;
                }
                case "BJ": {
                    n = 24;
                    break Label_6540;
                }
                case "BI": {
                    n = 23;
                    break Label_6540;
                }
                case "BH": {
                    n = 22;
                    break Label_6540;
                }
                case "BG": {
                    n = 21;
                    break Label_6540;
                }
                case "BF": {
                    n = 20;
                    break Label_6540;
                }
                case "BE": {
                    n = 19;
                    break Label_6540;
                }
                case "BD": {
                    n = 18;
                    break Label_6540;
                }
                case "BB": {
                    n = 17;
                    break Label_6540;
                }
                case "BA": {
                    n = 16;
                    break Label_6540;
                }
                case "AZ": {
                    n = 15;
                    break Label_6540;
                }
                case "AX": {
                    n = 14;
                    break Label_6540;
                }
                case "AW": {
                    n = 13;
                    break Label_6540;
                }
                case "AU": {
                    n = 12;
                    break Label_6540;
                }
                case "AT": {
                    n = 11;
                    break Label_6540;
                }
                case "AS": {
                    n = 10;
                    break Label_6540;
                }
                case "AR": {
                    n = 9;
                    break Label_6540;
                }
                case "AQ": {
                    n = 8;
                    break Label_6540;
                }
                case "AO": {
                    n = 7;
                    break Label_6540;
                }
                case "AM": {
                    n = 6;
                    break Label_6540;
                }
                case "AL": {
                    n = 5;
                    break Label_6540;
                }
                case "AI": {
                    break Label_6540;
                }
                case "AG": {
                    n = 3;
                    break Label_6540;
                }
                case "AF": {
                    n = 2;
                    break Label_6540;
                }
                case "AE": {
                    n = 1;
                    break Label_6540;
                }
                case "AD": {
                    n = 0;
                    break Label_6540;
                }
                default:
                    break;
            }
            n = -1;
        }
        final int[] array = new int[6];
        switch (n) {
            default: {
                final int[] array2 = array;
                array2[1] = (array2[0] = 2);
                array2[3] = (array2[2] = 2);
                array2[5] = (array2[4] = 2);
                return array;
            }
            case 237: {
                final int[] array3 = array;
                array3[0] = 4;
                array3[2] = (array3[1] = 4);
                array3[3] = 3;
                array3[5] = (array3[4] = 2);
                return array;
            }
            case 236: {
                final int[] array4 = array;
                array4[0] = 2;
                array4[1] = 4;
                array4[2] = 2;
                array4[4] = (array4[3] = 1);
                array4[5] = 2;
                return array;
            }
            case 233: {
                final int[] array5 = array;
                array5[array5[0] = 1] = 2;
                array5[3] = (array5[2] = 1);
                array5[5] = (array5[4] = 2);
                return array;
            }
            case 229: {
                final int[] array6 = array;
                array6[1] = (array6[0] = 0);
                array6[2] = 1;
                array6[3] = 2;
                array6[5] = (array6[4] = 2);
                return array;
            }
            case 228: {
                final int[] array7 = array;
                array7[0] = 0;
                array7[array7[1] = 2] = 1;
                array7[3] = 2;
                array7[5] = (array7[4] = 2);
                return array;
            }
            case 227: {
                final int[] array8 = array;
                array8[1] = (array8[0] = 2);
                array8[3] = (array8[2] = 1);
                array8[4] = 2;
                array8[5] = 4;
                return array;
            }
            case 223: {
                final int[] array9 = array;
                array9[0] = 1;
                array9[array9[1] = 2] = 3;
                array9[array9[3] = 4] = 3;
                array9[5] = 2;
                return array;
            }
            case 222: {
                final int[] array10 = array;
                array10[array10[0] = 2] = (array10[1] = 1);
                array10[3] = 2;
                array10[4] = 1;
                array10[5] = 2;
                return array;
            }
            case 221: {
                final int[] array11 = array;
                array11[0] = 2;
                array11[array11[1] = 2] = 4;
                array11[3] = 1;
                array11[4] = 3;
                array11[5] = 1;
                return array;
            }
            case 220: {
                final int[] array12 = array;
                array12[1] = (array12[0] = 3);
                array12[2] = 2;
                array12[3] = 3;
                array12[4] = 4;
                array12[5] = 2;
                return array;
            }
            case 218: {
                final int[] array13 = array;
                array13[0] = 3;
                array13[1] = 4;
                array13[2] = 2;
                array13[3] = 1;
                array13[4] = 3;
                array13[5] = 2;
                return array;
            }
            case 217: {
                final int[] array14 = array;
                array14[1] = (array14[0] = 0);
                array14[3] = (array14[2] = 0);
                array14[5] = (array14[4] = 0);
                return array;
            }
            case 215: {
                final int[] array15 = array;
                array15[0] = 2;
                array15[1] = 4;
                array15[2] = 1;
                array15[3] = 0;
                array15[5] = (array15[4] = 2);
                return array;
            }
            case 213: {
                final int[] array16 = array;
                array16[0] = 3;
                array16[array16[1] = 2] = 4;
                array16[3] = 3;
                array16[5] = (array16[4] = 2);
                return array;
            }
            case 212: {
                final int[] array17 = array;
                array17[0] = 3;
                array17[1] = 1;
                array17[3] = (array17[2] = 1);
                array17[5] = (array17[4] = 2);
                return array;
            }
            case 207: {
                final int[] array18 = array;
                array18[0] = 3;
                array18[1] = 4;
                array18[2] = 1;
                array18[3] = 0;
                array18[5] = (array18[4] = 2);
                return array;
            }
            case 205: {
                final int[] array19 = array;
                array19[0] = 3;
                array19[array19[1] = 2] = 1;
                array19[3] = 2;
                array19[5] = (array19[4] = 2);
                return array;
            }
            case 201: {
                final int[] array20 = array;
                array20[0] = 2;
                array20[1] = 3;
                array20[2] = 2;
                array20[3] = 1;
                array20[5] = (array20[4] = 2);
                return array;
            }
            case 200: {
                final int[] array21 = array;
                array21[0] = 2;
                array21[array21[1] = 2] = 1;
                array21[3] = 2;
                array21[5] = (array21[4] = 2);
                return array;
            }
            case 198: {
                final int[] array22 = array;
                array22[array22[0] = 2] = (array22[1] = 4);
                array22[3] = 1;
                array22[5] = (array22[4] = 2);
                return array;
            }
            case 197: {
                final int[] array23 = array;
                array23[0] = 2;
                array23[array23[1] = 2] = 3;
                array23[array23[3] = 4] = 4;
                array23[5] = 2;
                return array;
            }
            case 196: {
                final int[] array24 = array;
                array24[1] = (array24[0] = 4);
                array24[array24[2] = 3] = 2;
                array24[5] = (array24[4] = 2);
                return array;
            }
            case 193: {
                final int[] array25 = array;
                array25[0] = 0;
                array25[1] = 1;
                array25[3] = (array25[2] = 1);
                array25[5] = (array25[4] = 2);
                return array;
            }
            case 189: {
                final int[] array26 = array;
                array26[0] = 2;
                array26[1] = 3;
                array26[array26[2] = 3] = 3;
                array26[5] = (array26[4] = 1);
                return array;
            }
            case 185:
            case 238: {
                final int[] array27 = array;
                array27[0] = 4;
                array27[array27[1] = 2] = 4;
                array27[3] = 3;
                array27[5] = (array27[4] = 2);
                return array;
            }
            case 184: {
                final int[] array28 = array;
                array28[0] = 3;
                array28[2] = (array28[1] = 1);
                array28[4] = (array28[3] = 2);
                array28[5] = 0;
                return array;
            }
            case 183: {
                final int[] array29 = array;
                array29[1] = (array29[0] = 3);
                array29[2] = 2;
                array29[3] = 0;
                array29[5] = (array29[4] = 2);
                return array;
            }
            case 182: {
                final int[] array30 = array;
                array30[0] = 1;
                array30[2] = (array30[1] = 0);
                array30[3] = 1;
                array30[5] = (array30[4] = 3);
                return array;
            }
            case 181: {
                final int[] array31 = array;
                array31[0] = 1;
                array31[2] = (array31[1] = 0);
                array31[3] = 1;
                array31[5] = (array31[4] = 2);
                return array;
            }
            case 180: {
                final int[] array32 = array;
                array32[1] = (array32[0] = 0);
                array32[3] = (array32[2] = 1);
                array32[4] = 3;
                array32[5] = 2;
                return array;
            }
            case 179: {
                final int[] array33 = array;
                array33[0] = 0;
                array33[1] = 3;
                array33[2] = 2;
                array33[3] = 3;
                array33[4] = 1;
                array33[5] = 2;
                return array;
            }
            case 178: {
                final int[] array34 = array;
                array34[0] = 1;
                array34[2] = (array34[1] = 4);
                array34[array34[3] = 4] = 4;
                array34[5] = 2;
                return array;
            }
            case 176: {
                final int[] array35 = array;
                array35[0] = 2;
                array35[array35[1] = 2] = 4;
                array35[3] = 1;
                array35[5] = (array35[4] = 2);
                return array;
            }
            case 174: {
                final int[] array36 = array;
                array36[0] = 3;
                array36[1] = 4;
                array36[2] = 1;
                array36[3] = 3;
                array36[5] = (array36[4] = 2);
                return array;
            }
            case 173: {
                final int[] array37 = array;
                array37[0] = 2;
                array37[1] = 0;
                array37[2] = 2;
                array37[3] = 1;
                array37[4] = 2;
                array37[5] = 0;
                return array;
            }
            case 171: {
                final int[] array38 = array;
                array38[array38[0] = 1] = 0;
                array38[3] = (array38[2] = 2);
                array38[5] = (array38[4] = 4);
                return array;
            }
            case 170: {
                final int[] array39 = array;
                array39[1] = (array39[0] = 3);
                array39[array39[2] = 3] = 3;
                array39[5] = (array39[4] = 2);
                return array;
            }
            case 169: {
                final int[] array40 = array;
                array40[0] = 2;
                array40[1] = 1;
                array40[2] = 2;
                array40[3] = 3;
                array40[4] = 2;
                array40[5] = 1;
                return array;
            }
            case 167: {
                final int[] array41 = array;
                array41[1] = (array41[0] = 2);
                array41[array41[2] = 3] = 1;
                array41[5] = (array41[4] = 2);
                return array;
            }
            case 166: {
                final int[] array42 = array;
                array42[0] = 1;
                array42[array42[1] = 2] = 4;
                array42[array42[3] = 4] = 3;
                array42[5] = 2;
                return array;
            }
            case 164: {
                final int[] array43 = array;
                array43[0] = 2;
                array43[1] = 3;
                array43[2] = 1;
                array43[3] = 2;
                array43[4] = 4;
                array43[5] = 2;
                return array;
            }
            case 163: {
                final int[] array44 = array;
                array44[1] = (array44[0] = 0);
                array44[2] = 1;
                array44[3] = 2;
                array44[4] = 4;
                array44[5] = 2;
                return array;
            }
            case 160: {
                final int[] array45 = array;
                array45[0] = 2;
                array45[array45[1] = 2] = 4;
                array45[3] = 3;
                array45[5] = (array45[4] = 2);
                return array;
            }
            case 159: {
                final int[] array46 = array;
                array46[1] = (array46[0] = 0);
                array46[2] = 3;
                array46[4] = (array46[3] = 0);
                array46[5] = 2;
                return array;
            }
            case 158: {
                final int[] array47 = array;
                array47[0] = 2;
                array47[1] = 1;
                array47[2] = 4;
                array47[3] = 3;
                array47[4] = 0;
                array47[5] = 4;
                return array;
            }
            case 156: {
                final int[] array48 = array;
                array48[0] = 3;
                array48[1] = 4;
                array48[2] = 2;
                array48[3] = 1;
                array48[5] = (array48[4] = 2);
                return array;
            }
            case 153:
            case 235: {
                final int[] array49 = array;
                array49[0] = 2;
                array49[1] = 3;
                array49[array49[2] = 3] = 4;
                array49[5] = (array49[4] = 2);
                return array;
            }
            case 152: {
                final int[] array50 = array;
                array50[0] = 3;
                array50[1] = 4;
                array50[array50[2] = 3] = 2;
                array50[5] = (array50[4] = 2);
                return array;
            }
            case 151:
            case 232: {
                final int[] array51 = array;
                array51[0] = 3;
                array51[1] = 1;
                array51[3] = (array51[2] = 2);
                array51[5] = (array51[4] = 2);
                return array;
            }
            case 150: {
                final int[] array52 = array;
                array52[array52[0] = 1] = 0;
                array52[array52[2] = 4] = (array52[3] = 1);
                array52[5] = 0;
                return array;
            }
            case 149: {
                final int[] array53 = array;
                array53[array53[0] = 2] = (array53[1] = 4);
                array53[array53[3] = 4] = 3;
                array53[5] = 2;
                return array;
            }
            case 148: {
                final int[] array54 = array;
                array54[0] = 3;
                array54[array54[1] = 2] = 2;
                array54[3] = 1;
                array54[5] = (array54[4] = 2);
                return array;
            }
            case 147: {
                final int[] array55 = array;
                array55[0] = 3;
                array55[array55[1] = 2] = 1;
                array55[3] = 3;
                array55[4] = 4;
                array55[5] = 2;
                return array;
            }
            case 146: {
                final int[] array56 = array;
                array56[0] = 3;
                array56[1] = 1;
                array56[2] = 0;
                array56[3] = 2;
                array56[5] = (array56[4] = 2);
                return array;
            }
            case 142: {
                final int[] array57 = array;
                array57[0] = 2;
                array57[1] = 1;
                array57[2] = 2;
                array57[3] = 3;
                array57[5] = (array57[4] = 2);
                return array;
            }
            case 140: {
                final int[] array58 = array;
                array58[0] = 0;
                array58[array58[1] = 2] = 4;
                array58[array58[3] = 4] = 3;
                array58[5] = 1;
                return array;
            }
            case 139: {
                final int[] array59 = array;
                array59[0] = 2;
                array59[1] = 0;
                array59[3] = (array59[2] = 2);
                array59[5] = (array59[4] = 2);
                return array;
            }
            case 136: {
                final int[] array60 = array;
                array60[0] = 1;
                array60[2] = (array60[1] = 0);
                array60[3] = 1;
                array60[4] = 3;
                array60[5] = 2;
                return array;
            }
            case 135:
            case 211:
            case 216:
            case 231: {
                final int[] array61 = array;
                array61[0] = 4;
                array61[array61[1] = 2] = 2;
                array61[3] = 4;
                array61[5] = (array61[4] = 2);
                return array;
            }
            case 133: {
                final int[] array62 = array;
                array62[0] = 1;
                array62[array62[1] = 2] = 2;
                array62[3] = 3;
                array62[5] = (array62[4] = 2);
                return array;
            }
            case 132: {
                final int[] array63 = array;
                array63[array63[0] = 2] = (array63[1] = 0);
                array63[3] = 1;
                array63[4] = 3;
                array63[5] = 2;
                return array;
            }
            case 131: {
                final int[] array64 = array;
                array64[array64[0] = 1] = 0;
                array64[3] = (array64[2] = 0);
                array64[5] = (array64[4] = 2);
                return array;
            }
            case 129: {
                final int[] array65 = array;
                array65[0] = 3;
                array65[array65[1] = 3] = (array65[2] = 1);
                array65[5] = (array65[4] = 2);
                return array;
            }
            case 126: {
                final int[] array66 = array;
                array66[0] = 4;
                array66[1] = 0;
                array66[array66[2] = 3] = 2;
                array66[4] = 1;
                array66[5] = 3;
                return array;
            }
            case 125: {
                final int[] array67 = array;
                array67[0] = 0;
                array67[1] = 1;
                array67[2] = 0;
                array67[3] = 1;
                array67[4] = 0;
                array67[5] = 2;
                return array;
            }
            case 124:
            case 168: {
                final int[] array68 = array;
                array68[0] = 4;
                array68[1] = 3;
                array68[array68[2] = 3] = 3;
                array68[5] = (array68[4] = 2);
                return array;
            }
            case 122:
            case 138: {
                final int[] array69 = array;
                array69[0] = 3;
                array69[1] = 2;
                array69[array69[2] = 3] = 3;
                array69[4] = 4;
                array69[5] = 2;
                return array;
            }
            case 120: {
                final int[] array70 = array;
                array70[1] = (array70[0] = 2);
                array70[3] = (array70[2] = 1);
                array70[5] = (array70[4] = 2);
                return array;
            }
            case 119: {
                final int[] array71 = array;
                array71[0] = 3;
                array71[2] = (array71[1] = 1);
                array71[3] = 2;
                array71[5] = (array71[4] = 2);
                return array;
            }
            case 118: {
                final int[] array72 = array;
                array72[0] = 1;
                array72[array72[1] = 2] = 1;
                array72[3] = 3;
                array72[5] = (array72[4] = 2);
                return array;
            }
            case 117: {
                final int[] array73 = array;
                array73[0] = 2;
                array73[1] = 1;
                array73[3] = (array73[2] = 2);
                array73[4] = 3;
                array73[5] = 2;
                return array;
            }
            case 114: {
                final int[] array74 = array;
                array74[0] = 0;
                array74[array74[1] = 2] = 2;
                array74[3] = 4;
                array74[5] = (array74[4] = 4);
                return array;
            }
            case 112:
            case 230: {
                final int[] array75 = array;
                array75[0] = 4;
                array75[1] = 3;
                array75[array75[2] = 3] = 2;
                array75[5] = (array75[4] = 2);
                return array;
            }
            case 110: {
                final int[] array76 = array;
                array76[array76[0] = 1] = 0;
                array76[2] = 4;
                array76[3] = 2;
                array76[5] = (array76[4] = 2);
                return array;
            }
            case 109: {
                final int[] array77 = array;
                array77[array77[0] = 2] = (array77[1] = 1);
                array77[3] = 2;
                array77[5] = (array77[4] = 2);
                return array;
            }
            case 108: {
                final int[] array78 = array;
                array78[0] = 3;
                array78[array78[1] = 2] = 1;
                array78[4] = (array78[3] = 1);
                array78[5] = 2;
                return array;
            }
            case 107: {
                final int[] array79 = array;
                array79[0] = 0;
                array79[1] = 3;
                array79[2] = 2;
                array79[3] = 3;
                array79[4] = 4;
                array79[5] = 2;
                return array;
            }
            case 105: {
                final int[] array80 = array;
                array80[0] = 2;
                array80[1] = 4;
                array80[array80[2] = 3] = 1;
                array80[5] = (array80[4] = 2);
                return array;
            }
            case 103: {
                final int[] array81 = array;
                array81[0] = 0;
                array81[2] = (array81[1] = 1);
                array81[3] = 2;
                array81[4] = 1;
                array81[5] = 2;
                return array;
            }
            case 101: {
                final int[] array82 = array;
                array82[0] = 4;
                array82[1] = 2;
                array82[array82[2] = 3] = 3;
                array82[4] = 4;
                array82[5] = 3;
                return array;
            }
            case 100: {
                final int[] array83 = array;
                array83[0] = 3;
                array83[1] = 2;
                array83[array83[2] = 3] = 2;
                array83[5] = (array83[4] = 2);
                return array;
            }
            case 99: {
                final int[] array84 = array;
                array84[0] = 3;
                array84[array84[1] = 2] = 2;
                array84[3] = 0;
                array84[5] = (array84[4] = 2);
                return array;
            }
            case 98: {
                final int[] array85 = array;
                array85[array85[0] = 1] = 1;
                array85[2] = 3;
                array85[4] = (array85[3] = 2);
                array85[5] = 3;
                return array;
            }
            case 96: {
                final int[] array86 = array;
                array86[0] = 1;
                array86[array86[1] = 2] = 2;
                array86[3] = 3;
                array86[4] = 4;
                array86[5] = 2;
                return array;
            }
            case 95: {
                final int[] array87 = array;
                array87[0] = 1;
                array87[2] = (array87[1] = 1);
                array87[4] = (array87[3] = 1);
                array87[5] = 2;
                return array;
            }
            case 94: {
                final int[] array88 = array;
                array88[0] = 3;
                array88[1] = 1;
                array88[array88[2] = 3] = 3;
                array88[4] = 2;
                array88[5] = 4;
                return array;
            }
            case 91:
            case 115: {
                final int[] array89 = array;
                array89[0] = 1;
                array89[2] = (array89[1] = 0);
                array89[4] = (array89[3] = 0);
                array89[5] = 2;
                return array;
            }
            case 90: {
                final int[] array90 = array;
                array90[0] = 0;
                array90[1] = 1;
                array90[2] = 0;
                array90[4] = (array90[3] = 1);
                array90[5] = 0;
                return array;
            }
            case 89: {
                final int[] array91 = array;
                array91[0] = 3;
                array91[2] = (array91[1] = 1);
                array91[3] = 3;
                array91[5] = (array91[4] = 2);
                return array;
            }
            case 88: {
                final int[] array92 = array;
                array92[1] = (array92[0] = 4);
                array92[2] = 1;
                array92[3] = 2;
                array92[5] = (array92[4] = 2);
                return array;
            }
            case 87: {
                final int[] array93 = array;
                array93[1] = (array93[0] = 2);
                array93[array93[2] = 4] = (array93[3] = 3);
                array93[5] = 2;
                return array;
            }
            case 86: {
                final int[] array94 = array;
                array94[0] = 2;
                array94[1] = 1;
                array94[2] = 2;
                array94[3] = 1;
                array94[5] = (array94[4] = 2);
                return array;
            }
            case 85: {
                final int[] array95 = array;
                array95[array95[0] = 1] = 0;
                array95[3] = (array95[2] = 0);
                array95[4] = 1;
                array95[5] = 2;
                return array;
            }
            case 83: {
                final int[] array96 = array;
                array96[array96[0] = 2] = (array96[1] = 1);
                array96[3] = 3;
                array96[5] = (array96[4] = 2);
                return array;
            }
            case 82: {
                final int[] array97 = array;
                array97[0] = 3;
                array97[2] = (array97[1] = 4);
                array97[3] = 2;
                array97[5] = (array97[4] = 2);
                return array;
            }
            case 81:
            case 199: {
                final int[] array98 = array;
                array98[0] = 4;
                array98[1] = 3;
                array98[2] = 2;
                array98[3] = 4;
                array98[5] = (array98[4] = 2);
                return array;
            }
            case 80:
            case 130: {
                final int[] array99 = array;
                array99[0] = 1;
                array99[array99[1] = 2] = 2;
                array99[3] = 0;
                array99[5] = (array99[4] = 2);
                return array;
            }
            case 79:
            case 97:
            case 104: {
                final int[] array100 = array;
                array100[0] = 0;
                array100[array100[1] = 2] = 0;
                array100[3] = 1;
                array100[5] = (array100[4] = 2);
                return array;
            }
            case 78: {
                final int[] array101 = array;
                array101[1] = (array101[0] = 3);
                array101[array101[2] = 3] = 2;
                array101[5] = (array101[4] = 2);
                return array;
            }
            case 77: {
                final int[] array102 = array;
                array102[0] = 0;
                array102[1] = 2;
                array102[3] = (array102[2] = 1);
                array102[5] = (array102[4] = 2);
                return array;
            }
            case 76: {
                final int[] array103 = array;
                array103[0] = 3;
                array103[1] = 2;
                array103[array103[2] = 3] = 3;
                array103[5] = (array103[4] = 2);
                return array;
            }
            case 75: {
                final int[] array104 = array;
                array104[array104[0] = 1] = 1;
                array104[2] = 0;
                array104[3] = 2;
                array104[5] = (array104[4] = 2);
                return array;
            }
            case 74: {
                final int[] array105 = array;
                array105[1] = (array105[0] = 2);
                array105[3] = (array105[2] = 0);
                array105[5] = (array105[4] = 2);
                return array;
            }
            case 73: {
                final int[] array106 = array;
                array106[array106[0] = 1] = 1;
                array106[array106[2] = 3] = 2;
                array106[5] = (array106[4] = 2);
                return array;
            }
            case 72: {
                final int[] array107 = array;
                array107[0] = 3;
                array107[1] = 4;
                array107[3] = (array107[2] = 0);
                array107[5] = (array107[4] = 2);
                return array;
            }
            case 71: {
                final int[] array108 = array;
                array108[array108[0] = 1] = 1;
                array108[3] = (array108[2] = 1);
                array108[4] = 0;
                array108[5] = 2;
                return array;
            }
            case 70: {
                final int[] array109 = array;
                array109[0] = 0;
                array109[array109[1] = 2] = 2;
                array109[3] = 0;
                array109[5] = (array109[4] = 2);
                return array;
            }
            case 69: {
                final int[] array110 = array;
                array110[0] = 4;
                array110[array110[1] = 2] = 4;
                array110[3] = 0;
                array110[5] = (array110[4] = 2);
                return array;
            }
            case 68:
            case 155:
            case 192: {
                final int[] array111 = array;
                array111[0] = 3;
                array111[1] = 2;
                array111[3] = (array111[2] = 2);
                array111[5] = (array111[4] = 2);
                return array;
            }
            case 67: {
                final int[] array112 = array;
                array112[0] = 3;
                array112[array112[1] = 2] = 2;
                array112[3] = 3;
                array112[5] = (array112[4] = 2);
                return array;
            }
            case 66: {
                final int[] array113 = array;
                array113[0] = 0;
                array113[2] = (array113[1] = 0);
                array113[3] = 1;
                array113[4] = 0;
                array113[5] = 2;
                return array;
            }
            case 65: {
                final int[] array114 = array;
                array114[0] = 4;
                array114[1] = 3;
                array114[2] = 4;
                array114[array114[3] = 4] = 4;
                array114[5] = 2;
                return array;
            }
            case 64: {
                final int[] array115 = array;
                array115[1] = (array115[0] = 0);
                array115[3] = (array115[2] = 0);
                array115[4] = 1;
                array115[5] = 0;
                return array;
            }
            case 60: {
                final int[] array116 = array;
                array116[array116[0] = 1] = 3;
                array116[2] = 2;
                array116[3] = 1;
                array116[5] = (array116[4] = 2);
                return array;
            }
            case 59:
            case 209: {
                final int[] array117 = array;
                array117[0] = 3;
                array117[array117[1] = 3] = (array117[2] = 4);
                array117[5] = (array117[4] = 2);
                return array;
            }
            case 58:
            case 123: {
                final int[] array118 = array;
                array118[0] = 3;
                array118[1] = 4;
                array118[3] = (array118[2] = 4);
                array118[5] = (array118[4] = 2);
                return array;
            }
            case 56: {
                final int[] array119 = array;
                array119[1] = (array119[0] = 0);
                array119[2] = 2;
                array119[4] = (array119[3] = 0);
                array119[5] = 2;
                return array;
            }
            case 54: {
                final int[] array120 = array;
                array120[0] = 0;
                array120[1] = 1;
                array120[array120[2] = 4] = (array120[3] = 2);
                array120[5] = 1;
                return array;
            }
            case 53: {
                final int[] array121 = array;
                array121[1] = (array121[0] = 0);
                array121[2] = 2;
                array121[3] = 0;
                array121[4] = 1;
                array121[5] = 2;
                return array;
            }
            case 52: {
                final int[] array122 = array;
                array122[array122[0] = 1] = 0;
                array122[2] = 1;
                array122[4] = (array122[3] = 0);
                array122[5] = 2;
                return array;
            }
            case 49: {
                final int[] array123 = array;
                array123[0] = 2;
                array123[1] = 3;
                array123[2] = 0;
                array123[3] = 1;
                array123[5] = (array123[4] = 2);
                return array;
            }
            case 48:
            case 111:
            case 161:
            case 210: {
                final int[] array124 = array;
                array124[0] = 4;
                array124[1] = 2;
                array124[3] = (array124[2] = 4);
                array124[5] = (array124[4] = 2);
                return array;
            }
            case 47:
            case 157: {
                final int[] array125 = array;
                array125[0] = 2;
                array125[1] = 4;
                array125[3] = (array125[2] = 4);
                array125[5] = (array125[4] = 2);
                return array;
            }
            case 46: {
                final int[] array126 = array;
                array126[0] = 2;
                array126[1] = 3;
                array126[array126[2] = 3] = 2;
                array126[5] = (array126[4] = 2);
                return array;
            }
            case 45: {
                final int[] array127 = array;
                array127[0] = 2;
                array127[1] = 0;
                array127[3] = (array127[2] = 1);
                array127[4] = 3;
                array127[5] = 1;
                return array;
            }
            case 44:
            case 143: {
                final int[] array128 = array;
                array128[0] = 4;
                array128[1] = 3;
                array128[array128[2] = 3] = 4;
                array128[5] = (array128[4] = 2);
                return array;
            }
            case 43:
            case 208: {
                final int[] array129 = array;
                array129[0] = 0;
                array129[1] = 1;
                array129[3] = (array129[2] = 2);
                array129[5] = (array129[4] = 2);
                return array;
            }
            case 40: {
                final int[] array130 = array;
                array130[0] = 0;
                array130[1] = 1;
                array130[2] = 0;
                array130[4] = (array130[3] = 0);
                array130[5] = 2;
                return array;
            }
            case 39:
            case 62:
            case 134: {
                final int[] array131 = array;
                array131[0] = 3;
                array131[1] = 4;
                array131[array131[2] = 3] = 3;
                array131[5] = (array131[4] = 2);
                return array;
            }
            case 38: {
                final int[] array132 = array;
                array132[0] = 4;
                array132[array132[1] = 2] = 4;
                array132[3] = 2;
                array132[5] = (array132[4] = 2);
                return array;
            }
            case 37:
            case 137: {
                final int[] array133 = array;
                array133[0] = 3;
                array133[array133[1] = 3] = (array133[2] = 2);
                array133[5] = (array133[4] = 2);
                return array;
            }
            case 36:
            case 219: {
                final int[] array134 = array;
                array134[0] = 0;
                array134[array134[1] = 2] = 1;
                array134[3] = 2;
                array134[5] = (array134[4] = 3);
                return array;
            }
            case 35:
            case 42: {
                final int[] array135 = array;
                array135[0] = 2;
                array135[array135[1] = 2] = 2;
                array135[3] = 1;
                array135[5] = (array135[4] = 2);
                return array;
            }
            case 34: {
                final int[] array136 = array;
                array136[array136[0] = 1] = 2;
                array136[array136[2] = 3] = 3;
                array136[5] = (array136[4] = 2);
                return array;
            }
            case 33: {
                final int[] array137 = array;
                array137[0] = 3;
                array137[array137[1] = 2] = 1;
                array137[3] = 0;
                array137[5] = (array137[4] = 2);
                return array;
            }
            case 32: {
                final int[] array138 = array;
                array138[0] = 3;
                array138[1] = 1;
                array138[3] = (array138[2] = 2);
                array138[4] = 3;
                array138[5] = 2;
                return array;
            }
            case 31: {
                final int[] array139 = array;
                array139[0] = 3;
                array139[1] = 2;
                array139[3] = (array139[2] = 1);
                array139[5] = (array139[4] = 2);
                return array;
            }
            case 30: {
                final int[] array140 = array;
                array140[array140[0] = 1] = 1;
                array140[3] = (array140[2] = 1);
                array140[4] = 2;
                array140[5] = 4;
                return array;
            }
            case 28: {
                final int[] array141 = array;
                array141[array141[0] = 1] = 2;
                array141[3] = (array141[2] = 4);
                array141[5] = (array141[4] = 2);
                return array;
            }
            case 27: {
                final int[] array142 = array;
                array142[0] = 3;
                array142[1] = 2;
                array142[3] = (array142[2] = 0);
                array142[5] = (array142[4] = 2);
                return array;
            }
            case 26: {
                final int[] array143 = array;
                array143[0] = 0;
                array143[1] = 2;
                array143[3] = (array143[2] = 0);
                array143[5] = (array143[4] = 2);
                return array;
            }
            case 25:
            case 141:
            case 177: {
                final int[] array144 = array;
                array144[array144[0] = 1] = 2;
                array144[3] = (array144[2] = 2);
                array144[5] = (array144[4] = 2);
                return array;
            }
            case 24: {
                final int[] array145 = array;
                array145[1] = (array145[0] = 4);
                array145[2] = 2;
                array145[3] = 3;
                array145[5] = (array145[4] = 2);
                return array;
            }
            case 23:
            case 84:
            case 92:
            case 154:
            case 226:
            case 234: {
                final int[] array146 = array;
                array146[1] = (array146[0] = 4);
                array146[3] = (array146[2] = 4);
                array146[5] = (array146[4] = 2);
                return array;
            }
            case 22: {
                final int[] array147 = array;
                array147[array147[0] = 1] = 3;
                array147[2] = 1;
                array147[3] = 3;
                array147[4] = 4;
                array147[5] = 2;
                return array;
            }
            case 21:
            case 175:
            case 191: {
                final int[] array148 = array;
                array148[1] = (array148[0] = 0);
                array148[3] = (array148[2] = 0);
                array148[4] = 1;
                array148[5] = 2;
                return array;
            }
            case 20:
            case 187:
            case 203:
            case 206: {
                final int[] array149 = array;
                array149[0] = 4;
                array149[array149[1] = 3] = (array149[2] = 4);
                array149[5] = (array149[4] = 2);
                return array;
            }
            case 19: {
                final int[] array150 = array;
                array150[1] = (array150[0] = 0);
                array150[2] = 1;
                array150[3] = 0;
                array150[4] = 1;
                array150[5] = 2;
                return array;
            }
            case 18: {
                final int[] array151 = array;
                array151[0] = 2;
                array151[1] = 1;
                array151[array151[2] = 3] = 2;
                array151[4] = 4;
                array151[5] = 2;
                return array;
            }
            case 16:
            case 106:
            case 214: {
                final int[] array152 = array;
                array152[array152[0] = 1] = 1;
                array152[3] = (array152[2] = 1);
                array152[5] = (array152[4] = 2);
                return array;
            }
            case 15:
            case 55:
            case 128:
            case 194: {
                final int[] array153 = array;
                array153[0] = 4;
                array153[1] = 2;
                array153[array153[2] = 3] = 3;
                array153[5] = (array153[4] = 2);
                return array;
            }
            case 14:
            case 51:
            case 121:
            case 144:
            case 172:
            case 195:
            case 224: {
                final int[] array154 = array;
                array154[0] = 0;
                array154[1] = 2;
                array154[3] = (array154[2] = 2);
                array154[5] = (array154[4] = 2);
                return array;
            }
            case 13: {
                final int[] array155 = array;
                array155[1] = (array155[0] = 2);
                array155[array155[2] = 3] = 4;
                array155[5] = (array155[4] = 2);
                return array;
            }
            case 12: {
                final int[] array156 = array;
                array156[0] = 0;
                array156[array156[1] = 3] = (array156[2] = 1);
                array156[4] = 3;
                array156[5] = 0;
                return array;
            }
            case 11:
            case 61:
            case 93:
            case 102:
            case 127:
            case 145:
            case 188: {
                final int[] array157 = array;
                array157[0] = 0;
                array157[2] = (array157[1] = 0);
                array157[4] = (array157[3] = 0);
                array157[5] = 2;
                return array;
            }
            case 10: {
                final int[] array158 = array;
                array158[1] = (array158[0] = 2);
                array158[array158[2] = 3] = 3;
                array158[5] = (array158[4] = 2);
                return array;
            }
            case 9: {
                final int[] array159 = array;
                array159[1] = (array159[0] = 2);
                array159[3] = (array159[2] = 2);
                array159[4] = 1;
                array159[5] = 2;
                return array;
            }
            case 8:
            case 63:
            case 162:
            case 186:
            case 190: {
                final int[] array160 = array;
                array160[0] = 4;
                array160[1] = 2;
                array160[3] = (array160[2] = 2);
                array160[5] = (array160[4] = 2);
                return array;
            }
            case 7: {
                final int[] array161 = array;
                array161[0] = 3;
                array161[2] = (array161[1] = 4);
                array161[3] = 3;
                array161[5] = (array161[4] = 2);
                return array;
            }
            case 6:
            case 165: {
                final int[] array162 = array;
                array162[0] = 2;
                array162[1] = 3;
                array162[2] = 2;
                array162[3] = 3;
                array162[5] = (array162[4] = 2);
                return array;
            }
            case 5: {
                final int[] array163 = array;
                array163[0] = 1;
                array163[2] = (array163[1] = 1);
                array163[3] = 2;
                array163[5] = (array163[4] = 2);
                return array;
            }
            case 3:
            case 41: {
                final int[] array164 = array;
                array164[0] = 2;
                array164[1] = 4;
                array164[array164[2] = 3] = 4;
                array164[5] = (array164[4] = 2);
                return array;
            }
            case 2:
            case 204: {
                final int[] array165 = array;
                array165[1] = (array165[0] = 4);
                array165[array165[2] = 3] = 4;
                array165[5] = (array165[4] = 2);
                return array;
            }
            case 1: {
                final int[] array166 = array;
                array166[array166[0] = 1] = 4;
                array166[2] = 2;
                array166[3] = 3;
                array166[4] = 4;
                array166[5] = 1;
                return array;
            }
            case 0:
            case 4:
            case 17:
            case 29:
            case 50:
            case 57:
            case 113:
            case 116:
            case 202:
            case 225: {
                final int[] array167 = array;
                array167[array167[0] = 1] = 2;
                array167[3] = (array167[2] = 0);
                array167[5] = (array167[4] = 2);
                return array;
            }
        }
    }
    
    public static j n(final Context context) {
        // monitorenter(j.class)
        while (true) {
            try {
                if (j.v == null) {
                    j.v = new b(context).a();
                }
                // monitorexit(j.class)
                return j.v;
                // monitorexit(j.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static boolean o(final k k, final boolean b) {
        return b && !k.d(8);
    }
    
    @Override
    public y a() {
        return this;
    }
    
    @Override
    public void c(final e.a a) {
        this.b.e(a);
    }
    
    @Override
    public long d() {
        synchronized (this) {
            return this.k;
        }
    }
    
    @Override
    public void e(final g g, final k k, final boolean b, final int n) {
        synchronized (this) {
            if (!o(k, b)) {
                return;
            }
            this.h += n;
        }
    }
    
    @Override
    public void f(final g g, final k k, final boolean b) {
    }
    
    @Override
    public void g(final g g, final k k, final boolean b) {
        // monitorenter(this)
        while (true) {
            try {
                if (!o(k, b)) {
                    // monitorexit(this)
                    return;
                }
                if (this.f == 0) {
                    this.g = this.c.b();
                }
                ++this.f;
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void h(final g g, final k k, final boolean b) {
        // monitorenter(this)
        while (true) {
            try {
                if (!o(k, b)) {
                    // monitorexit(this)
                    return;
                }
                g0.a.f(this.f > 0);
                final long b2 = this.c.b();
                final int n = (int)(b2 - this.g);
                this.i += n;
                final long j = this.j;
                final long h = this.h;
                this.j = j + h;
                if (n > 0) {
                    this.e.c((int)Math.sqrt((double)h), h * 8000.0f / n);
                    if (this.i >= 2000L || this.j >= 524288L) {
                        this.k = (long)this.e.f(0.5f);
                    }
                    this.p(n, this.h, this.k);
                    this.g = b2;
                    this.h = 0L;
                }
                --this.f;
                // monitorexit(this)
                return;
            }
            // monitorexit(this)
            finally {}
            continue;
        }
    }
    
    @Override
    public void i(final Handler handler, final e.a a) {
        a.e(handler);
        a.e(a);
        this.b.b(handler, a);
    }
    
    public final long m(final int i) {
        Long n;
        if ((n = (Long)this.a.get(i)) == null) {
            n = (Long)this.a.get(0);
        }
        Long value;
        if ((value = n) == null) {
            value = 1000000L;
        }
        return value;
    }
    
    public final void p(final int n, final long n2, final long l) {
        if (n == 0 && n2 == 0L && l == this.l) {
            return;
        }
        this.l = l;
        this.b.c(n, n2, l);
    }
    
    public final void q(int o) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0157: {
            int m;
            try {
                m = this.m;
                if (m != 0 && !this.d) {
                    // monitorexit(this)
                    return;
                }
            }
            finally {
                break Label_0157;
            }
            if (this.n) {
                o = this.o;
            }
            if (m == o) {
                // monitorexit(this)
                return;
            }
            this.m = o;
            if (o != 1 && o != 0 && o != 8) {
                this.k = this.m(o);
                final long b = this.c.b();
                if (this.f > 0) {
                    o = (int)(b - this.g);
                }
                else {
                    o = 0;
                }
                this.p(o, this.h, this.k);
                this.g = b;
                this.h = 0L;
                this.j = 0L;
                this.i = 0L;
                this.e.i();
                // monitorexit(this)
                return;
            }
            return;
        }
        // monitorexit(this)
        throw;
    }
    
    public static final class b
    {
        public final Context a;
        public Map b;
        public int c;
        public c d;
        public boolean e;
        
        public b(final Context context) {
            Context applicationContext;
            if (context == null) {
                applicationContext = null;
            }
            else {
                applicationContext = context.getApplicationContext();
            }
            this.a = applicationContext;
            this.b = b(M.R(context));
            this.c = 2000;
            this.d = c.a;
            this.e = true;
        }
        
        public static Map b(final String s) {
            final int[] k = l(s);
            final HashMap<Integer, Long> hashMap = new HashMap<Integer, Long>(8);
            hashMap.put(0, 1000000L);
            final v p = j.p;
            hashMap.put(2, p.get(k[0]));
            hashMap.put(3, j.q.get(k[1]));
            hashMap.put(4, j.r.get(k[2]));
            hashMap.put(5, j.s.get(k[3]));
            hashMap.put(10, j.t.get(k[4]));
            hashMap.put(9, j.u.get(k[5]));
            hashMap.put(7, p.get(k[0]));
            return hashMap;
        }
        
        public j a() {
            return new j(this.a, this.b, this.c, this.d, this.e, null);
        }
    }
}
