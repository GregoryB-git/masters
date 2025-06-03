// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K3;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import J3.C;
import android.util.Base64;
import J3.B;
import android.util.JsonReader;
import l4.d;
import j4.a;

public class h
{
    public static final j4.a a;
    
    static {
        a = new d().j(J3.a.a).k(true).i();
    }
    
    public static B.d A(final JsonReader jsonReader) {
        final B.d.a a = B.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("files")) {
                if (!nextName.equals("orgId")) {
                    jsonReader.skipValue();
                }
                else {
                    a.c(jsonReader.nextString());
                }
            }
            else {
                a.b(l(jsonReader, (a)new K3.d()));
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.e B(final JsonReader jsonReader) {
        final B.e.e.a a = B.e.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 1874684019: {
                    if (!nextName.equals("platform")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 351608024: {
                    if (!nextName.equals("version")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -293026577: {
                    if (!nextName.equals("jailbroken")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -911706486: {
                    if (!nextName.equals("buildVersion")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 3: {
                    a.d(jsonReader.nextInt());
                    continue;
                }
                case 2: {
                    a.e(jsonReader.nextString());
                    continue;
                }
                case 1: {
                    a.c(jsonReader.nextBoolean());
                    continue;
                }
                case 0: {
                    a.b(jsonReader.nextString());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B C(final JsonReader jsonReader) {
        final B.b b = B.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 1984987798: {
                    if (!nextName.equals("session")) {
                        break;
                    }
                    n = 10;
                    break;
                }
                case 1975623094: {
                    if (!nextName.equals("displayVersion")) {
                        break;
                    }
                    n = 9;
                    break;
                }
                case 1874684019: {
                    if (!nextName.equals("platform")) {
                        break;
                    }
                    n = 8;
                    break;
                }
                case 1047652060: {
                    if (!nextName.equals("firebaseInstallationId")) {
                        break;
                    }
                    n = 7;
                    break;
                }
                case 719853845: {
                    if (!nextName.equals("installationUuid")) {
                        break;
                    }
                    n = 6;
                    break;
                }
                case 344431858: {
                    if (!nextName.equals("gmpAppId")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case -911706486: {
                    if (!nextName.equals("buildVersion")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case -1375141843: {
                    if (!nextName.equals("appExitInfo")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -1907185581: {
                    if (!nextName.equals("appQualitySessionId")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1962630338: {
                    if (!nextName.equals("sdkVersion")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -2118372775: {
                    if (!nextName.equals("ndkPayload")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 10: {
                    b.l(D(jsonReader));
                    continue;
                }
                case 9: {
                    b.e(jsonReader.nextString());
                    continue;
                }
                case 8: {
                    b.j(jsonReader.nextInt());
                    continue;
                }
                case 7: {
                    b.f(jsonReader.nextString());
                    continue;
                }
                case 6: {
                    b.h(jsonReader.nextString());
                    continue;
                }
                case 5: {
                    b.g(jsonReader.nextString());
                    continue;
                }
                case 4: {
                    b.d(jsonReader.nextString());
                    continue;
                }
                case 3: {
                    b.b(k(jsonReader));
                    continue;
                }
                case 2: {
                    b.c(jsonReader.nextString());
                    continue;
                }
                case 1: {
                    b.k(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    b.i(A(jsonReader));
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return b.a();
    }
    
    public static B.e D(final JsonReader jsonReader) {
        final B.e.b a = B.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 2047016109: {
                    if (!nextName.equals("generatorType")) {
                        break;
                    }
                    n = 11;
                    break;
                }
                case 1025385094: {
                    if (!nextName.equals("crashed")) {
                        break;
                    }
                    n = 10;
                    break;
                }
                case 286956243: {
                    if (!nextName.equals("generator")) {
                        break;
                    }
                    n = 9;
                    break;
                }
                case 3599307: {
                    if (!nextName.equals("user")) {
                        break;
                    }
                    n = 8;
                    break;
                }
                case 96801: {
                    if (!nextName.equals("app")) {
                        break;
                    }
                    n = 7;
                    break;
                }
                case 3556: {
                    if (!nextName.equals("os")) {
                        break;
                    }
                    n = 6;
                    break;
                }
                case -1291329255: {
                    if (!nextName.equals("events")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case -1335157162: {
                    if (!nextName.equals("device")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case -1606742899: {
                    if (!nextName.equals("endedAt")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -1618432855: {
                    if (!nextName.equals("identifier")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1907185581: {
                    if (!nextName.equals("appQualitySessionId")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -2128794476: {
                    if (!nextName.equals("startedAt")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 11: {
                    a.i(jsonReader.nextInt());
                    continue;
                }
                case 10: {
                    a.d(jsonReader.nextBoolean());
                    continue;
                }
                case 9: {
                    a.h(jsonReader.nextString());
                    continue;
                }
                case 8: {
                    a.n(E(jsonReader));
                    continue;
                }
                case 7: {
                    a.b(j(jsonReader));
                    continue;
                }
                case 6: {
                    a.l(B(jsonReader));
                    continue;
                }
                case 5: {
                    a.g(l(jsonReader, (a)new c()));
                    continue;
                }
                case 4: {
                    a.e(o(jsonReader));
                    continue;
                }
                case 3: {
                    a.f(jsonReader.nextLong());
                    continue;
                }
                case 2: {
                    a.k(Base64.decode(jsonReader.nextString(), 2));
                    continue;
                }
                case 1: {
                    a.c(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.m(jsonReader.nextLong());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.f E(final JsonReader jsonReader) {
        final B.e.f.a a = B.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            }
            else {
                a.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.a j(final JsonReader jsonReader) {
        final B.e.a.a a = B.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 1975623094: {
                    if (!nextName.equals("displayVersion")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case 719853845: {
                    if (!nextName.equals("installationUuid")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case 351608024: {
                    if (!nextName.equals("version")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 213652010: {
                    if (!nextName.equals("developmentPlatformVersion")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -519438642: {
                    if (!nextName.equals("developmentPlatform")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1618432855: {
                    if (!nextName.equals("identifier")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 5: {
                    a.d(jsonReader.nextString());
                    continue;
                }
                case 4: {
                    a.f(jsonReader.nextString());
                    continue;
                }
                case 3: {
                    a.g(jsonReader.nextString());
                    continue;
                }
                case 2: {
                    a.c(jsonReader.nextString());
                    continue;
                }
                case 1: {
                    a.b(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.e(jsonReader.nextString());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.a k(final JsonReader jsonReader) {
        final B.a.b a = B.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 2125650548: {
                    if (!nextName.equals("importance")) {
                        break;
                    }
                    n = 8;
                    break;
                }
                case 723857505: {
                    if (!nextName.equals("traceFile")) {
                        break;
                    }
                    n = 7;
                    break;
                }
                case 722137681: {
                    if (!nextName.equals("reasonCode")) {
                        break;
                    }
                    n = 6;
                    break;
                }
                case 202325402: {
                    if (!nextName.equals("processName")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case 55126294: {
                    if (!nextName.equals("timestamp")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case 113234: {
                    if (!nextName.equals("rss")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 111312: {
                    if (!nextName.equals("pss")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case 110987: {
                    if (!nextName.equals("pid")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1516200806: {
                    if (!nextName.equals("buildIdMappingForArch")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 8: {
                    a.c(jsonReader.nextInt());
                    continue;
                }
                case 7: {
                    a.j(jsonReader.nextString());
                    continue;
                }
                case 6: {
                    a.g(jsonReader.nextInt());
                    continue;
                }
                case 5: {
                    a.e(jsonReader.nextString());
                    continue;
                }
                case 4: {
                    a.i(jsonReader.nextLong());
                    continue;
                }
                case 3: {
                    a.h(jsonReader.nextLong());
                    continue;
                }
                case 2: {
                    a.f(jsonReader.nextLong());
                    continue;
                }
                case 1: {
                    a.d(jsonReader.nextInt());
                    continue;
                }
                case 0: {
                    a.b(l(jsonReader, (a)new K3.a()));
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static C l(final JsonReader jsonReader, final a a) {
        final ArrayList<Object> list = new ArrayList<Object>();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            list.add(a.a(jsonReader));
        }
        jsonReader.endArray();
        return C.a(list);
    }
    
    public static B.a.a m(final JsonReader jsonReader) {
        final B.a.a.a a = B.a.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 230943785: {
                    if (!nextName.equals("buildId")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case 3002454: {
                    if (!nextName.equals("arch")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -609862170: {
                    if (!nextName.equals("libraryName")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 2: {
                    a.c(jsonReader.nextString());
                    continue;
                }
                case 1: {
                    a.b(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.d(jsonReader.nextString());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.c n(final JsonReader jsonReader) {
        final B.c.a a = B.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("key")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                }
                else {
                    a.c(jsonReader.nextString());
                }
            }
            else {
                a.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.c o(final JsonReader jsonReader) {
        final B.e.c.a a = B.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 2078953423: {
                    if (!nextName.equals("modelClass")) {
                        break;
                    }
                    n = 8;
                    break;
                }
                case 109757585: {
                    if (!nextName.equals("state")) {
                        break;
                    }
                    n = 7;
                    break;
                }
                case 104069929: {
                    if (!nextName.equals("model")) {
                        break;
                    }
                    n = 6;
                    break;
                }
                case 94848180: {
                    if (!nextName.equals("cores")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case 81784169: {
                    if (!nextName.equals("diskSpace")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case 3002454: {
                    if (!nextName.equals("arch")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 112670: {
                    if (!nextName.equals("ram")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1969347631: {
                    if (!nextName.equals("manufacturer")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1981332476: {
                    if (!nextName.equals("simulator")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 8: {
                    a.g(jsonReader.nextString());
                    continue;
                }
                case 7: {
                    a.j(jsonReader.nextInt());
                    continue;
                }
                case 6: {
                    a.f(jsonReader.nextString());
                    continue;
                }
                case 5: {
                    a.c(jsonReader.nextInt());
                    continue;
                }
                case 4: {
                    a.d(jsonReader.nextLong());
                    continue;
                }
                case 3: {
                    a.b(jsonReader.nextInt());
                    continue;
                }
                case 2: {
                    a.h(jsonReader.nextLong());
                    continue;
                }
                case 1: {
                    a.e(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.i(jsonReader.nextBoolean());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.d p(final JsonReader jsonReader) {
        final B.e.d.b a = B.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 55126294: {
                    if (!nextName.equals("timestamp")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case 3575610: {
                    if (!nextName.equals("type")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 107332: {
                    if (!nextName.equals("log")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case 96801: {
                    if (!nextName.equals("app")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1335157162: {
                    if (!nextName.equals("device")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 4: {
                    a.e(jsonReader.nextLong());
                    continue;
                }
                case 3: {
                    a.f(jsonReader.nextString());
                    continue;
                }
                case 2: {
                    a.d(w(jsonReader));
                    continue;
                }
                case 1: {
                    a.b(q(jsonReader));
                    continue;
                }
                case 0: {
                    a.c(s(jsonReader));
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.d.a q(final JsonReader jsonReader) {
        final B.e.d.a.a a = B.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 928737948: {
                    if (!nextName.equals("uiOrientation")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case 555169704: {
                    if (!nextName.equals("customAttributes")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -80231855: {
                    if (!nextName.equals("internalKeys")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1090974952: {
                    if (!nextName.equals("execution")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1332194002: {
                    if (!nextName.equals("background")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 4: {
                    a.f(jsonReader.nextInt());
                    continue;
                }
                case 3: {
                    a.c(l(jsonReader, (a)new b()));
                    continue;
                }
                case 2: {
                    a.e(l(jsonReader, (a)new b()));
                    continue;
                }
                case 1: {
                    a.d(t(jsonReader));
                    continue;
                }
                case 0: {
                    a.b(jsonReader.nextBoolean());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.d.a.b.a r(final JsonReader jsonReader) {
        final B.e.d.a.b.a.a a = B.e.d.a.b.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 1153765347: {
                    if (!nextName.equals("baseAddress")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 3601339: {
                    if (!nextName.equals("uuid")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case 3530753: {
                    if (!nextName.equals("size")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case 3373707: {
                    if (!nextName.equals("name")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 3: {
                    a.b(jsonReader.nextLong());
                    continue;
                }
                case 2: {
                    a.f(Base64.decode(jsonReader.nextString(), 2));
                    continue;
                }
                case 1: {
                    a.d(jsonReader.nextLong());
                    continue;
                }
                case 0: {
                    a.c(jsonReader.nextString());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.d.c s(final JsonReader jsonReader) {
        final B.e.d.c.a a = B.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 1516795582: {
                    if (!nextName.equals("proximityOn")) {
                        break;
                    }
                    n = 5;
                    break;
                }
                case 976541947: {
                    if (!nextName.equals("ramUsed")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case 279795450: {
                    if (!nextName.equals("diskUsed")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -1439500848: {
                    if (!nextName.equals("orientation")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1455558134: {
                    if (!nextName.equals("batteryVelocity")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1708606089: {
                    if (!nextName.equals("batteryLevel")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 5: {
                    a.f(jsonReader.nextBoolean());
                    continue;
                }
                case 4: {
                    a.g(jsonReader.nextLong());
                    continue;
                }
                case 3: {
                    a.d(jsonReader.nextLong());
                    continue;
                }
                case 2: {
                    a.e(jsonReader.nextInt());
                    continue;
                }
                case 1: {
                    a.c(jsonReader.nextInt());
                    continue;
                }
                case 0: {
                    a.b(jsonReader.nextDouble());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.d.a.b t(final JsonReader jsonReader) {
        final B.e.d.a.b.b a = B.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 1481625679: {
                    if (!nextName.equals("exception")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case 937615455: {
                    if (!nextName.equals("binaries")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case -902467928: {
                    if (!nextName.equals("signal")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -1337936983: {
                    if (!nextName.equals("threads")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1375141843: {
                    if (!nextName.equals("appExitInfo")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 4: {
                    a.d(u(jsonReader));
                    continue;
                }
                case 3: {
                    a.c(l(jsonReader, (a)new f()));
                    continue;
                }
                case 2: {
                    a.e(x(jsonReader));
                    continue;
                }
                case 1: {
                    a.f(l(jsonReader, (a)new e()));
                    continue;
                }
                case 0: {
                    a.b(k(jsonReader));
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.d.a.b.c u(final JsonReader jsonReader) {
        final B.e.d.a.b.c.a a = B.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 581754413: {
                    if (!nextName.equals("overflowCount")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case 91997906: {
                    if (!nextName.equals("causedBy")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 3575610: {
                    if (!nextName.equals("type")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -934964668: {
                    if (!nextName.equals("reason")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1266514778: {
                    if (!nextName.equals("frames")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 4: {
                    a.d(jsonReader.nextInt());
                    continue;
                }
                case 3: {
                    a.b(u(jsonReader));
                    continue;
                }
                case 2: {
                    a.f(jsonReader.nextString());
                    continue;
                }
                case 1: {
                    a.e(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.c(l(jsonReader, (a)new g()));
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.d.a.b.e.b v(final JsonReader jsonReader) {
        final B.e.d.a.b.e.b.a a = B.e.d.a.b.e.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 2125650548: {
                    if (!nextName.equals("importance")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case 3143036: {
                    if (!nextName.equals("file")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 3571: {
                    if (!nextName.equals("pc")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case -887523944: {
                    if (!nextName.equals("symbol")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1019779949: {
                    if (!nextName.equals("offset")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 4: {
                    a.c(jsonReader.nextInt());
                    continue;
                }
                case 3: {
                    a.b(jsonReader.nextString());
                    continue;
                }
                case 2: {
                    a.e(jsonReader.nextLong());
                    continue;
                }
                case 1: {
                    a.f(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.d(jsonReader.nextLong());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.d.d w(final JsonReader jsonReader) {
        final B.e.d.d.a a = B.e.d.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            }
            else {
                a.b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.d.a.b.d x(final JsonReader jsonReader) {
        final B.e.d.a.b.d.a a = B.e.d.a.b.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 3373707: {
                    if (!nextName.equals("name")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case 3059181: {
                    if (!nextName.equals("code")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1147692044: {
                    if (!nextName.equals("address")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 2: {
                    a.d(jsonReader.nextString());
                    continue;
                }
                case 1: {
                    a.c(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.b(jsonReader.nextLong());
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.e.d.a.b.e y(final JsonReader jsonReader) {
        final B.e.d.a.b.e.a a = B.e.d.a.b.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            final int hashCode = nextName.hashCode();
            int n = -1;
            switch (hashCode) {
                case 2125650548: {
                    if (!nextName.equals("importance")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case 3373707: {
                    if (!nextName.equals("name")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1266514778: {
                    if (!nextName.equals("frames")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            switch (n) {
                default: {
                    jsonReader.skipValue();
                    continue;
                }
                case 2: {
                    a.c(jsonReader.nextInt());
                    continue;
                }
                case 1: {
                    a.d(jsonReader.nextString());
                    continue;
                }
                case 0: {
                    a.b(l(jsonReader, (a)new g()));
                    continue;
                }
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public static B.d.b z(final JsonReader jsonReader) {
        final B.d.b.a a = B.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            final String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("filename")) {
                if (!nextName.equals("contents")) {
                    jsonReader.skipValue();
                }
                else {
                    a.b(Base64.decode(jsonReader.nextString(), 2));
                }
            }
            else {
                a.c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.a();
    }
    
    public B F(String s) {
        final Throwable cause;
        try {
            final Object o;
            s = (IllegalStateException)(o = new JsonReader((Reader)new StringReader((String)s)));
            final B b = C((JsonReader)o);
            final IllegalStateException ex = s;
            ((JsonReader)ex).close();
            return b;
        }
        catch (IllegalStateException s) {
            throw new IOException(cause);
        }
        try {
            final Object o = s;
            final B b = C((JsonReader)o);
            final IllegalStateException ex = s;
            ((JsonReader)ex).close();
            return b;
        }
        finally {
            try {
                ((JsonReader)s).close();
            }
            finally {
                final Throwable t;
                t.addSuppressed(cause);
            }
        }
        throw new IOException(cause);
    }
    
    public String G(final B b) {
        return h.a.a(b);
    }
    
    public B.e.d h(String s) {
        final Throwable cause;
        try {
            final Object o;
            s = (IllegalStateException)(o = new JsonReader((Reader)new StringReader((String)s)));
            final B.e.d d = p((JsonReader)o);
            final IllegalStateException ex = s;
            ((JsonReader)ex).close();
            return d;
        }
        catch (IllegalStateException s) {
            throw new IOException(cause);
        }
        try {
            final Object o = s;
            final B.e.d d = p((JsonReader)o);
            final IllegalStateException ex = s;
            ((JsonReader)ex).close();
            return d;
        }
        finally {
            try {
                ((JsonReader)s).close();
            }
            finally {
                final Throwable t;
                t.addSuppressed(cause);
            }
        }
        throw new IOException(cause);
    }
    
    public String i(final B.e.d d) {
        return h.a.a(d);
    }
    
    public interface a
    {
        Object a(final JsonReader p0);
    }
}
