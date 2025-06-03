/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.util.JsonReader
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package K3;

import J3.B;
import J3.C;
import K3.b;
import K3.c;
import K3.d;
import K3.e;
import K3.f;
import K3.g;
import android.util.Base64;
import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

public class h {
    public static final j4.a a = new l4.d().j(J3.a.a).k(true).i();

    public static B.d A(JsonReader jsonReader) {
        B.d.a a8 = B.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            if (!string2.equals((Object)"files")) {
                if (!string2.equals((Object)"orgId")) {
                    jsonReader.skipValue();
                    continue;
                }
                a8.c(jsonReader.nextString());
                continue;
            }
            a8.b(h.l(jsonReader, new d()));
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.e.e B(JsonReader jsonReader) {
        B.e.e.a a8 = B.e.e.a();
        jsonReader.beginObject();
        block12 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 1874684019: {
                    if (!string2.equals((Object)"platform")) break;
                    n9 = 3;
                    break;
                }
                case 351608024: {
                    if (!string2.equals((Object)"version")) break;
                    n9 = 2;
                    break;
                }
                case -293026577: {
                    if (!string2.equals((Object)"jailbroken")) break;
                    n9 = 1;
                    break;
                }
                case -911706486: {
                    if (!string2.equals((Object)"buildVersion")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block12;
                }
                case 3: {
                    a8.d(jsonReader.nextInt());
                    continue block12;
                }
                case 2: {
                    a8.e(jsonReader.nextString());
                    continue block12;
                }
                case 1: {
                    a8.c(jsonReader.nextBoolean());
                    continue block12;
                }
                case 0: 
            }
            a8.b(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B C(JsonReader jsonReader) {
        B.b b8 = B.b();
        jsonReader.beginObject();
        block26 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 1984987798: {
                    if (!string2.equals((Object)"session")) break;
                    n9 = 10;
                    break;
                }
                case 1975623094: {
                    if (!string2.equals((Object)"displayVersion")) break;
                    n9 = 9;
                    break;
                }
                case 1874684019: {
                    if (!string2.equals((Object)"platform")) break;
                    n9 = 8;
                    break;
                }
                case 1047652060: {
                    if (!string2.equals((Object)"firebaseInstallationId")) break;
                    n9 = 7;
                    break;
                }
                case 719853845: {
                    if (!string2.equals((Object)"installationUuid")) break;
                    n9 = 6;
                    break;
                }
                case 344431858: {
                    if (!string2.equals((Object)"gmpAppId")) break;
                    n9 = 5;
                    break;
                }
                case -911706486: {
                    if (!string2.equals((Object)"buildVersion")) break;
                    n9 = 4;
                    break;
                }
                case -1375141843: {
                    if (!string2.equals((Object)"appExitInfo")) break;
                    n9 = 3;
                    break;
                }
                case -1907185581: {
                    if (!string2.equals((Object)"appQualitySessionId")) break;
                    n9 = 2;
                    break;
                }
                case -1962630338: {
                    if (!string2.equals((Object)"sdkVersion")) break;
                    n9 = 1;
                    break;
                }
                case -2118372775: {
                    if (!string2.equals((Object)"ndkPayload")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block26;
                }
                case 10: {
                    b8.l(h.D(jsonReader));
                    continue block26;
                }
                case 9: {
                    b8.e(jsonReader.nextString());
                    continue block26;
                }
                case 8: {
                    b8.j(jsonReader.nextInt());
                    continue block26;
                }
                case 7: {
                    b8.f(jsonReader.nextString());
                    continue block26;
                }
                case 6: {
                    b8.h(jsonReader.nextString());
                    continue block26;
                }
                case 5: {
                    b8.g(jsonReader.nextString());
                    continue block26;
                }
                case 4: {
                    b8.d(jsonReader.nextString());
                    continue block26;
                }
                case 3: {
                    b8.b(h.k(jsonReader));
                    continue block26;
                }
                case 2: {
                    b8.c(jsonReader.nextString());
                    continue block26;
                }
                case 1: {
                    b8.k(jsonReader.nextString());
                    continue block26;
                }
                case 0: 
            }
            b8.i(h.A(jsonReader));
        }
        jsonReader.endObject();
        return b8.a();
    }

    public static B.e D(JsonReader jsonReader) {
        B.e.b b8 = B.e.a();
        jsonReader.beginObject();
        block28 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 2047016109: {
                    if (!string2.equals((Object)"generatorType")) break;
                    n9 = 11;
                    break;
                }
                case 1025385094: {
                    if (!string2.equals((Object)"crashed")) break;
                    n9 = 10;
                    break;
                }
                case 286956243: {
                    if (!string2.equals((Object)"generator")) break;
                    n9 = 9;
                    break;
                }
                case 3599307: {
                    if (!string2.equals((Object)"user")) break;
                    n9 = 8;
                    break;
                }
                case 96801: {
                    if (!string2.equals((Object)"app")) break;
                    n9 = 7;
                    break;
                }
                case 3556: {
                    if (!string2.equals((Object)"os")) break;
                    n9 = 6;
                    break;
                }
                case -1291329255: {
                    if (!string2.equals((Object)"events")) break;
                    n9 = 5;
                    break;
                }
                case -1335157162: {
                    if (!string2.equals((Object)"device")) break;
                    n9 = 4;
                    break;
                }
                case -1606742899: {
                    if (!string2.equals((Object)"endedAt")) break;
                    n9 = 3;
                    break;
                }
                case -1618432855: {
                    if (!string2.equals((Object)"identifier")) break;
                    n9 = 2;
                    break;
                }
                case -1907185581: {
                    if (!string2.equals((Object)"appQualitySessionId")) break;
                    n9 = 1;
                    break;
                }
                case -2128794476: {
                    if (!string2.equals((Object)"startedAt")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block28;
                }
                case 11: {
                    b8.i(jsonReader.nextInt());
                    continue block28;
                }
                case 10: {
                    b8.d(jsonReader.nextBoolean());
                    continue block28;
                }
                case 9: {
                    b8.h(jsonReader.nextString());
                    continue block28;
                }
                case 8: {
                    b8.n(h.E(jsonReader));
                    continue block28;
                }
                case 7: {
                    b8.b(h.j(jsonReader));
                    continue block28;
                }
                case 6: {
                    b8.l(h.B(jsonReader));
                    continue block28;
                }
                case 5: {
                    b8.g(h.l(jsonReader, new c()));
                    continue block28;
                }
                case 4: {
                    b8.e(h.o(jsonReader));
                    continue block28;
                }
                case 3: {
                    b8.f(jsonReader.nextLong());
                    continue block28;
                }
                case 2: {
                    b8.k(Base64.decode((String)jsonReader.nextString(), (int)2));
                    continue block28;
                }
                case 1: {
                    b8.c(jsonReader.nextString());
                    continue block28;
                }
                case 0: 
            }
            b8.m(jsonReader.nextLong());
        }
        jsonReader.endObject();
        return b8.a();
    }

    public static B.e.f E(JsonReader jsonReader) {
        B.e.f.a a8 = B.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            if (!string2.equals((Object)"identifier")) {
                jsonReader.skipValue();
                continue;
            }
            a8.b(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static /* synthetic */ B.a.a a(JsonReader jsonReader) {
        return h.m(jsonReader);
    }

    public static /* synthetic */ B.e.d.a.b.e.b b(JsonReader jsonReader) {
        return h.v(jsonReader);
    }

    public static /* synthetic */ B.c c(JsonReader jsonReader) {
        return h.n(jsonReader);
    }

    public static /* synthetic */ B.e.d.a.b.a d(JsonReader jsonReader) {
        return h.r(jsonReader);
    }

    public static /* synthetic */ B.e.d.a.b.e e(JsonReader jsonReader) {
        return h.y(jsonReader);
    }

    public static /* synthetic */ B.d.b f(JsonReader jsonReader) {
        return h.z(jsonReader);
    }

    public static /* synthetic */ B.e.d g(JsonReader jsonReader) {
        return h.p(jsonReader);
    }

    public static B.e.a j(JsonReader jsonReader) {
        B.e.a.a a8 = B.e.a.a();
        jsonReader.beginObject();
        block16 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 1975623094: {
                    if (!string2.equals((Object)"displayVersion")) break;
                    n9 = 5;
                    break;
                }
                case 719853845: {
                    if (!string2.equals((Object)"installationUuid")) break;
                    n9 = 4;
                    break;
                }
                case 351608024: {
                    if (!string2.equals((Object)"version")) break;
                    n9 = 3;
                    break;
                }
                case 213652010: {
                    if (!string2.equals((Object)"developmentPlatformVersion")) break;
                    n9 = 2;
                    break;
                }
                case -519438642: {
                    if (!string2.equals((Object)"developmentPlatform")) break;
                    n9 = 1;
                    break;
                }
                case -1618432855: {
                    if (!string2.equals((Object)"identifier")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block16;
                }
                case 5: {
                    a8.d(jsonReader.nextString());
                    continue block16;
                }
                case 4: {
                    a8.f(jsonReader.nextString());
                    continue block16;
                }
                case 3: {
                    a8.g(jsonReader.nextString());
                    continue block16;
                }
                case 2: {
                    a8.c(jsonReader.nextString());
                    continue block16;
                }
                case 1: {
                    a8.b(jsonReader.nextString());
                    continue block16;
                }
                case 0: 
            }
            a8.e(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.a k(JsonReader jsonReader) {
        B.a.b b8 = B.a.a();
        jsonReader.beginObject();
        block22 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 2125650548: {
                    if (!string2.equals((Object)"importance")) break;
                    n9 = 8;
                    break;
                }
                case 723857505: {
                    if (!string2.equals((Object)"traceFile")) break;
                    n9 = 7;
                    break;
                }
                case 722137681: {
                    if (!string2.equals((Object)"reasonCode")) break;
                    n9 = 6;
                    break;
                }
                case 202325402: {
                    if (!string2.equals((Object)"processName")) break;
                    n9 = 5;
                    break;
                }
                case 55126294: {
                    if (!string2.equals((Object)"timestamp")) break;
                    n9 = 4;
                    break;
                }
                case 113234: {
                    if (!string2.equals((Object)"rss")) break;
                    n9 = 3;
                    break;
                }
                case 111312: {
                    if (!string2.equals((Object)"pss")) break;
                    n9 = 2;
                    break;
                }
                case 110987: {
                    if (!string2.equals((Object)"pid")) break;
                    n9 = 1;
                    break;
                }
                case -1516200806: {
                    if (!string2.equals((Object)"buildIdMappingForArch")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block22;
                }
                case 8: {
                    b8.c(jsonReader.nextInt());
                    continue block22;
                }
                case 7: {
                    b8.j(jsonReader.nextString());
                    continue block22;
                }
                case 6: {
                    b8.g(jsonReader.nextInt());
                    continue block22;
                }
                case 5: {
                    b8.e(jsonReader.nextString());
                    continue block22;
                }
                case 4: {
                    b8.i(jsonReader.nextLong());
                    continue block22;
                }
                case 3: {
                    b8.h(jsonReader.nextLong());
                    continue block22;
                }
                case 2: {
                    b8.f(jsonReader.nextLong());
                    continue block22;
                }
                case 1: {
                    b8.d(jsonReader.nextInt());
                    continue block22;
                }
                case 0: 
            }
            b8.b(h.l(jsonReader, new K3.a()));
        }
        jsonReader.endObject();
        return b8.a();
    }

    public static C l(JsonReader jsonReader, a a8) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(a8.a(jsonReader));
        }
        jsonReader.endArray();
        return C.a((List)arrayList);
    }

    public static B.a.a m(JsonReader jsonReader) {
        B.a.a.a a8 = B.a.a.a();
        jsonReader.beginObject();
        block10 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 230943785: {
                    if (!string2.equals((Object)"buildId")) break;
                    n9 = 2;
                    break;
                }
                case 3002454: {
                    if (!string2.equals((Object)"arch")) break;
                    n9 = 1;
                    break;
                }
                case -609862170: {
                    if (!string2.equals((Object)"libraryName")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block10;
                }
                case 2: {
                    a8.c(jsonReader.nextString());
                    continue block10;
                }
                case 1: {
                    a8.b(jsonReader.nextString());
                    continue block10;
                }
                case 0: 
            }
            a8.d(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.c n(JsonReader jsonReader) {
        B.c.a a8 = B.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            if (!string2.equals((Object)"key")) {
                if (!string2.equals((Object)"value")) {
                    jsonReader.skipValue();
                    continue;
                }
                a8.c(jsonReader.nextString());
                continue;
            }
            a8.b(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.e.c o(JsonReader jsonReader) {
        B.e.c.a a8 = B.e.c.a();
        jsonReader.beginObject();
        block22 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 2078953423: {
                    if (!string2.equals((Object)"modelClass")) break;
                    n9 = 8;
                    break;
                }
                case 109757585: {
                    if (!string2.equals((Object)"state")) break;
                    n9 = 7;
                    break;
                }
                case 104069929: {
                    if (!string2.equals((Object)"model")) break;
                    n9 = 6;
                    break;
                }
                case 94848180: {
                    if (!string2.equals((Object)"cores")) break;
                    n9 = 5;
                    break;
                }
                case 81784169: {
                    if (!string2.equals((Object)"diskSpace")) break;
                    n9 = 4;
                    break;
                }
                case 3002454: {
                    if (!string2.equals((Object)"arch")) break;
                    n9 = 3;
                    break;
                }
                case 112670: {
                    if (!string2.equals((Object)"ram")) break;
                    n9 = 2;
                    break;
                }
                case -1969347631: {
                    if (!string2.equals((Object)"manufacturer")) break;
                    n9 = 1;
                    break;
                }
                case -1981332476: {
                    if (!string2.equals((Object)"simulator")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block22;
                }
                case 8: {
                    a8.g(jsonReader.nextString());
                    continue block22;
                }
                case 7: {
                    a8.j(jsonReader.nextInt());
                    continue block22;
                }
                case 6: {
                    a8.f(jsonReader.nextString());
                    continue block22;
                }
                case 5: {
                    a8.c(jsonReader.nextInt());
                    continue block22;
                }
                case 4: {
                    a8.d(jsonReader.nextLong());
                    continue block22;
                }
                case 3: {
                    a8.b(jsonReader.nextInt());
                    continue block22;
                }
                case 2: {
                    a8.h(jsonReader.nextLong());
                    continue block22;
                }
                case 1: {
                    a8.e(jsonReader.nextString());
                    continue block22;
                }
                case 0: 
            }
            a8.i(jsonReader.nextBoolean());
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.e.d p(JsonReader jsonReader) {
        B.e.d.b b8 = B.e.d.a();
        jsonReader.beginObject();
        block14 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 55126294: {
                    if (!string2.equals((Object)"timestamp")) break;
                    n9 = 4;
                    break;
                }
                case 3575610: {
                    if (!string2.equals((Object)"type")) break;
                    n9 = 3;
                    break;
                }
                case 107332: {
                    if (!string2.equals((Object)"log")) break;
                    n9 = 2;
                    break;
                }
                case 96801: {
                    if (!string2.equals((Object)"app")) break;
                    n9 = 1;
                    break;
                }
                case -1335157162: {
                    if (!string2.equals((Object)"device")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    b8.e(jsonReader.nextLong());
                    continue block14;
                }
                case 3: {
                    b8.f(jsonReader.nextString());
                    continue block14;
                }
                case 2: {
                    b8.d(h.w(jsonReader));
                    continue block14;
                }
                case 1: {
                    b8.b(h.q(jsonReader));
                    continue block14;
                }
                case 0: 
            }
            b8.c(h.s(jsonReader));
        }
        jsonReader.endObject();
        return b8.a();
    }

    public static B.e.d.a q(JsonReader jsonReader) {
        B.e.d.a.a a8 = B.e.d.a.a();
        jsonReader.beginObject();
        block14 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 928737948: {
                    if (!string2.equals((Object)"uiOrientation")) break;
                    n9 = 4;
                    break;
                }
                case 555169704: {
                    if (!string2.equals((Object)"customAttributes")) break;
                    n9 = 3;
                    break;
                }
                case -80231855: {
                    if (!string2.equals((Object)"internalKeys")) break;
                    n9 = 2;
                    break;
                }
                case -1090974952: {
                    if (!string2.equals((Object)"execution")) break;
                    n9 = 1;
                    break;
                }
                case -1332194002: {
                    if (!string2.equals((Object)"background")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    a8.f(jsonReader.nextInt());
                    continue block14;
                }
                case 3: {
                    a8.c(h.l(jsonReader, new b()));
                    continue block14;
                }
                case 2: {
                    a8.e(h.l(jsonReader, new b()));
                    continue block14;
                }
                case 1: {
                    a8.d(h.t(jsonReader));
                    continue block14;
                }
                case 0: 
            }
            a8.b(jsonReader.nextBoolean());
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.e.d.a.b.a r(JsonReader jsonReader) {
        B.e.d.a.b.a.a a8 = B.e.d.a.b.a.a();
        jsonReader.beginObject();
        block12 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 1153765347: {
                    if (!string2.equals((Object)"baseAddress")) break;
                    n9 = 3;
                    break;
                }
                case 3601339: {
                    if (!string2.equals((Object)"uuid")) break;
                    n9 = 2;
                    break;
                }
                case 3530753: {
                    if (!string2.equals((Object)"size")) break;
                    n9 = 1;
                    break;
                }
                case 3373707: {
                    if (!string2.equals((Object)"name")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block12;
                }
                case 3: {
                    a8.b(jsonReader.nextLong());
                    continue block12;
                }
                case 2: {
                    a8.f(Base64.decode((String)jsonReader.nextString(), (int)2));
                    continue block12;
                }
                case 1: {
                    a8.d(jsonReader.nextLong());
                    continue block12;
                }
                case 0: 
            }
            a8.c(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.e.d.c s(JsonReader jsonReader) {
        B.e.d.c.a a8 = B.e.d.c.a();
        jsonReader.beginObject();
        block16 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 1516795582: {
                    if (!string2.equals((Object)"proximityOn")) break;
                    n9 = 5;
                    break;
                }
                case 976541947: {
                    if (!string2.equals((Object)"ramUsed")) break;
                    n9 = 4;
                    break;
                }
                case 279795450: {
                    if (!string2.equals((Object)"diskUsed")) break;
                    n9 = 3;
                    break;
                }
                case -1439500848: {
                    if (!string2.equals((Object)"orientation")) break;
                    n9 = 2;
                    break;
                }
                case -1455558134: {
                    if (!string2.equals((Object)"batteryVelocity")) break;
                    n9 = 1;
                    break;
                }
                case -1708606089: {
                    if (!string2.equals((Object)"batteryLevel")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block16;
                }
                case 5: {
                    a8.f(jsonReader.nextBoolean());
                    continue block16;
                }
                case 4: {
                    a8.g(jsonReader.nextLong());
                    continue block16;
                }
                case 3: {
                    a8.d(jsonReader.nextLong());
                    continue block16;
                }
                case 2: {
                    a8.e(jsonReader.nextInt());
                    continue block16;
                }
                case 1: {
                    a8.c(jsonReader.nextInt());
                    continue block16;
                }
                case 0: 
            }
            a8.b(jsonReader.nextDouble());
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.e.d.a.b t(JsonReader jsonReader) {
        B.e.d.a.b.b b8 = B.e.d.a.b.a();
        jsonReader.beginObject();
        block14 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 1481625679: {
                    if (!string2.equals((Object)"exception")) break;
                    n9 = 4;
                    break;
                }
                case 937615455: {
                    if (!string2.equals((Object)"binaries")) break;
                    n9 = 3;
                    break;
                }
                case -902467928: {
                    if (!string2.equals((Object)"signal")) break;
                    n9 = 2;
                    break;
                }
                case -1337936983: {
                    if (!string2.equals((Object)"threads")) break;
                    n9 = 1;
                    break;
                }
                case -1375141843: {
                    if (!string2.equals((Object)"appExitInfo")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    b8.d(h.u(jsonReader));
                    continue block14;
                }
                case 3: {
                    b8.c(h.l(jsonReader, new f()));
                    continue block14;
                }
                case 2: {
                    b8.e(h.x(jsonReader));
                    continue block14;
                }
                case 1: {
                    b8.f(h.l(jsonReader, new e()));
                    continue block14;
                }
                case 0: 
            }
            b8.b(h.k(jsonReader));
        }
        jsonReader.endObject();
        return b8.a();
    }

    public static B.e.d.a.b.c u(JsonReader jsonReader) {
        B.e.d.a.b.c.a a8 = B.e.d.a.b.c.a();
        jsonReader.beginObject();
        block14 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 581754413: {
                    if (!string2.equals((Object)"overflowCount")) break;
                    n9 = 4;
                    break;
                }
                case 91997906: {
                    if (!string2.equals((Object)"causedBy")) break;
                    n9 = 3;
                    break;
                }
                case 3575610: {
                    if (!string2.equals((Object)"type")) break;
                    n9 = 2;
                    break;
                }
                case -934964668: {
                    if (!string2.equals((Object)"reason")) break;
                    n9 = 1;
                    break;
                }
                case -1266514778: {
                    if (!string2.equals((Object)"frames")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    a8.d(jsonReader.nextInt());
                    continue block14;
                }
                case 3: {
                    a8.b(h.u(jsonReader));
                    continue block14;
                }
                case 2: {
                    a8.f(jsonReader.nextString());
                    continue block14;
                }
                case 1: {
                    a8.e(jsonReader.nextString());
                    continue block14;
                }
                case 0: 
            }
            a8.c(h.l(jsonReader, new g()));
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.e.d.a.b.e.b v(JsonReader jsonReader) {
        B.e.d.a.b.e.b.a a8 = B.e.d.a.b.e.b.a();
        jsonReader.beginObject();
        block14 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 2125650548: {
                    if (!string2.equals((Object)"importance")) break;
                    n9 = 4;
                    break;
                }
                case 3143036: {
                    if (!string2.equals((Object)"file")) break;
                    n9 = 3;
                    break;
                }
                case 3571: {
                    if (!string2.equals((Object)"pc")) break;
                    n9 = 2;
                    break;
                }
                case -887523944: {
                    if (!string2.equals((Object)"symbol")) break;
                    n9 = 1;
                    break;
                }
                case -1019779949: {
                    if (!string2.equals((Object)"offset")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    a8.c(jsonReader.nextInt());
                    continue block14;
                }
                case 3: {
                    a8.b(jsonReader.nextString());
                    continue block14;
                }
                case 2: {
                    a8.e(jsonReader.nextLong());
                    continue block14;
                }
                case 1: {
                    a8.f(jsonReader.nextString());
                    continue block14;
                }
                case 0: 
            }
            a8.d(jsonReader.nextLong());
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.e.d.d w(JsonReader jsonReader) {
        B.e.d.d.a a8 = B.e.d.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            if (!string2.equals((Object)"content")) {
                jsonReader.skipValue();
                continue;
            }
            a8.b(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.e.d.a.b.d x(JsonReader jsonReader) {
        B.e.d.a.b.d.a a8 = B.e.d.a.b.d.a();
        jsonReader.beginObject();
        block10 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 3373707: {
                    if (!string2.equals((Object)"name")) break;
                    n9 = 2;
                    break;
                }
                case 3059181: {
                    if (!string2.equals((Object)"code")) break;
                    n9 = 1;
                    break;
                }
                case -1147692044: {
                    if (!string2.equals((Object)"address")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block10;
                }
                case 2: {
                    a8.d(jsonReader.nextString());
                    continue block10;
                }
                case 1: {
                    a8.c(jsonReader.nextString());
                    continue block10;
                }
                case 0: 
            }
            a8.b(jsonReader.nextLong());
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.e.d.a.b.e y(JsonReader jsonReader) {
        B.e.d.a.b.e.a a8 = B.e.d.a.b.e.a();
        jsonReader.beginObject();
        block10 : while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 2125650548: {
                    if (!string2.equals((Object)"importance")) break;
                    n9 = 2;
                    break;
                }
                case 3373707: {
                    if (!string2.equals((Object)"name")) break;
                    n9 = 1;
                    break;
                }
                case -1266514778: {
                    if (!string2.equals((Object)"frames")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    jsonReader.skipValue();
                    continue block10;
                }
                case 2: {
                    a8.c(jsonReader.nextInt());
                    continue block10;
                }
                case 1: {
                    a8.d(jsonReader.nextString());
                    continue block10;
                }
                case 0: 
            }
            a8.b(h.l(jsonReader, new g()));
        }
        jsonReader.endObject();
        return a8.a();
    }

    public static B.d.b z(JsonReader jsonReader) {
        B.d.b.a a8 = B.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String string2 = jsonReader.nextName();
            string2.hashCode();
            if (!string2.equals((Object)"filename")) {
                if (!string2.equals((Object)"contents")) {
                    jsonReader.skipValue();
                    continue;
                }
                a8.b(Base64.decode((String)jsonReader.nextString(), (int)2));
                continue;
            }
            a8.c(jsonReader.nextString());
        }
        jsonReader.endObject();
        return a8.a();
    }

    /*
     * Exception decompiling
     */
    public B F(String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:397)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:475)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public String G(B b8) {
        return a.a(b8);
    }

    /*
     * Exception decompiling
     */
    public B.e.d h(String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:397)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:475)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public String i(B.e.d d8) {
        return a.a(d8);
    }

    public static interface a {
        public Object a(JsonReader var1);
    }

}

