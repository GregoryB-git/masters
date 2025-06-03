package n8;

import a0.j;
import a9.d;
import a9.e;
import android.util.Base64;
import android.util.JsonReader;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m8.a0;
import m8.b;
import m8.c;
import m8.f;
import m8.f0;
import m8.h;
import m8.i;
import m8.k;
import m8.l;
import m8.m;
import m8.n;
import m8.p;
import m8.q;
import m8.s;
import m8.t;
import m8.u;
import m8.y;
import m8.z;
import w3.v;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f11321a;

    /* renamed from: n8.a$a, reason: collision with other inner class name */
    public interface InterfaceC0173a<T> {
        T c(JsonReader jsonReader);
    }

    static {
        e eVar = new e();
        m8.a.f10376a.a(eVar);
        eVar.f245d = true;
        f11321a = new d(eVar);
    }

    public static s a(JsonReader jsonReader) {
        s.a aVar = new s.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    aVar.f10680d = jsonReader.nextLong();
                    aVar.f = (byte) (aVar.f | 2);
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    aVar.f10678b = nextString;
                    break;
                case "pc":
                    aVar.f10677a = jsonReader.nextLong();
                    aVar.f = (byte) (aVar.f | 1);
                    break;
                case "file":
                    aVar.f10679c = jsonReader.nextString();
                    break;
                case "importance":
                    aVar.f10681e = jsonReader.nextInt();
                    aVar.f = (byte) (aVar.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static m8.e b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(Constants.KEY)) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (nextName.equals("value")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new m8.e(str, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(" key");
        }
        if (str2 == null) {
            sb2.append(" value");
        }
        throw new IllegalStateException(j.l("Missing required properties:", sb2));
    }

    public static c c(JsonReader jsonReader) {
        c.a aVar = new c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    aVar.f10554i = d(jsonReader, new v(16));
                    break;
                case "pid":
                    aVar.f10547a = jsonReader.nextInt();
                    aVar.f10555j = (byte) (aVar.f10555j | 1);
                    break;
                case "pss":
                    aVar.f10551e = jsonReader.nextLong();
                    aVar.f10555j = (byte) (aVar.f10555j | 8);
                    break;
                case "rss":
                    aVar.f = jsonReader.nextLong();
                    aVar.f10555j = (byte) (16 | aVar.f10555j);
                    break;
                case "timestamp":
                    aVar.f10552g = jsonReader.nextLong();
                    aVar.f10555j = (byte) (aVar.f10555j | 32);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    aVar.f10548b = nextString;
                    break;
                case "reasonCode":
                    aVar.f10549c = jsonReader.nextInt();
                    aVar.f10555j = (byte) (aVar.f10555j | 2);
                    break;
                case "traceFile":
                    aVar.f10553h = jsonReader.nextString();
                    break;
                case "importance":
                    aVar.f10550d = jsonReader.nextInt();
                    aVar.f10555j = (byte) (aVar.f10555j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static <T> List<T> d(JsonReader jsonReader, InterfaceC0173a<T> interfaceC0173a) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(interfaceC0173a.c(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static l e(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        l.a aVar = new l.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c15 = 3;
            char c16 = 4;
            char c17 = 1;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals(Constants.TIMESTAMP)) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            int i10 = 16;
            if (c10 == 0) {
                u.a aVar2 = new u.a();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    switch (nextName2.hashCode()) {
                        case -1708606089:
                            if (nextName2.equals("batteryLevel")) {
                                c14 = 0;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case -1455558134:
                            if (nextName2.equals("batteryVelocity")) {
                                c14 = 1;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case -1439500848:
                            if (nextName2.equals("orientation")) {
                                c14 = 2;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 279795450:
                            if (nextName2.equals("diskUsed")) {
                                c14 = 3;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 976541947:
                            if (nextName2.equals("ramUsed")) {
                                c14 = 4;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 1516795582:
                            if (nextName2.equals("proximityOn")) {
                                c14 = 5;
                                break;
                            }
                            c14 = 65535;
                            break;
                        default:
                            c14 = 65535;
                            break;
                    }
                    switch (c14) {
                        case 0:
                            aVar2.f10696a = Double.valueOf(jsonReader.nextDouble());
                            break;
                        case 1:
                            aVar2.f10697b = jsonReader.nextInt();
                            aVar2.f10701g = (byte) (aVar2.f10701g | 1);
                            break;
                        case 2:
                            aVar2.f10699d = jsonReader.nextInt();
                            aVar2.f10701g = (byte) (aVar2.f10701g | 4);
                            break;
                        case 3:
                            aVar2.f = jsonReader.nextLong();
                            aVar2.f10701g = (byte) (aVar2.f10701g | 16);
                            break;
                        case 4:
                            aVar2.f10700e = jsonReader.nextLong();
                            aVar2.f10701g = (byte) (aVar2.f10701g | 8);
                            break;
                        case 5:
                            aVar2.f10698c = jsonReader.nextBoolean();
                            aVar2.f10701g = (byte) (aVar2.f10701g | 2);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                aVar.f10636d = aVar2.a();
            } else if (c10 == 1) {
                jsonReader.beginObject();
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    if (nextName3.equals("assignments")) {
                        list = d(jsonReader, new v(15));
                        if (list == null) {
                            throw new NullPointerException("Null rolloutAssignments");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (list == null) {
                    throw new IllegalStateException("Missing required properties: rolloutAssignments");
                }
                aVar.f = new y(list);
            } else if (c10 == 2) {
                jsonReader.beginObject();
                byte b10 = 0;
                List list2 = null;
                int i11 = 0;
                Boolean bool = null;
                t tVar = null;
                List list3 = null;
                List list4 = null;
                n nVar = null;
                while (jsonReader.hasNext()) {
                    String nextName4 = jsonReader.nextName();
                    nextName4.getClass();
                    switch (nextName4.hashCode()) {
                        case -1405314732:
                            if (nextName4.equals("appProcessDetails")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1332194002:
                            if (nextName4.equals("background")) {
                                c11 = c17;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1090974952:
                            if (nextName4.equals("execution")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -80231855:
                            if (nextName4.equals("internalKeys")) {
                                c11 = c15;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 555169704:
                            if (nextName4.equals("customAttributes")) {
                                c11 = c16;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 928737948:
                            if (nextName4.equals("uiOrientation")) {
                                c11 = 5;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1847730860:
                            if (nextName4.equals("currentProcessDetails")) {
                                c11 = 6;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            list2 = d(jsonReader, new e0.e(22));
                            c15 = 3;
                            c16 = 4;
                            i10 = 16;
                            c17 = 1;
                        case 1:
                            bool = Boolean.valueOf(jsonReader.nextBoolean());
                            c15 = 3;
                            c16 = 4;
                            i10 = 16;
                            c17 = 1;
                        case 2:
                            jsonReader.beginObject();
                            List list5 = null;
                            p pVar = null;
                            c cVar = null;
                            q qVar = null;
                            List list6 = null;
                            while (jsonReader.hasNext()) {
                                String nextName5 = jsonReader.nextName();
                                nextName5.getClass();
                                switch (nextName5.hashCode()) {
                                    case -1375141843:
                                        if (nextName5.equals("appExitInfo")) {
                                            c12 = 0;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case -1337936983:
                                        if (nextName5.equals("threads")) {
                                            c12 = c17;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case -902467928:
                                        if (nextName5.equals("signal")) {
                                            c12 = 2;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 937615455:
                                        if (nextName5.equals("binaries")) {
                                            c12 = c15;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 1481625679:
                                        if (nextName5.equals(Constants.EXCEPTION)) {
                                            c12 = c16;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    default:
                                        c12 = 65535;
                                        break;
                                }
                                switch (c12) {
                                    case 0:
                                        cVar = c(jsonReader);
                                        c15 = 3;
                                        c16 = 4;
                                        c17 = 1;
                                    case 1:
                                        list5 = d(jsonReader, new r3.j(17));
                                        c15 = 3;
                                        c16 = 4;
                                        c17 = 1;
                                    case 2:
                                        long j10 = 0;
                                        jsonReader.beginObject();
                                        byte b11 = 0;
                                        String str = null;
                                        String str2 = null;
                                        while (jsonReader.hasNext()) {
                                            String nextName6 = jsonReader.nextName();
                                            nextName6.getClass();
                                            switch (nextName6.hashCode()) {
                                                case -1147692044:
                                                    if (nextName6.equals("address")) {
                                                        c13 = 0;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 3059181:
                                                    if (nextName6.equals("code")) {
                                                        c13 = 1;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                case 3373707:
                                                    if (nextName6.equals("name")) {
                                                        c13 = 2;
                                                        break;
                                                    }
                                                    c13 = 65535;
                                                    break;
                                                default:
                                                    c13 = 65535;
                                                    break;
                                            }
                                            switch (c13) {
                                                case 0:
                                                    b11 = (byte) (b11 | 1);
                                                    j10 = jsonReader.nextLong();
                                                    break;
                                                case 1:
                                                    String nextString = jsonReader.nextString();
                                                    if (nextString == null) {
                                                        throw new NullPointerException("Null code");
                                                    }
                                                    str2 = nextString;
                                                    break;
                                                case 2:
                                                    String nextString2 = jsonReader.nextString();
                                                    if (nextString2 == null) {
                                                        throw new NullPointerException("Null name");
                                                    }
                                                    str = nextString2;
                                                    break;
                                                default:
                                                    jsonReader.skipValue();
                                                    break;
                                            }
                                        }
                                        jsonReader.endObject();
                                        if (b11 != 1 || str == null || str2 == null) {
                                            StringBuilder sb2 = new StringBuilder();
                                            if (str == null) {
                                                sb2.append(" name");
                                            }
                                            if (str2 == null) {
                                                sb2.append(" code");
                                            }
                                            if ((1 & b11) == 0) {
                                                sb2.append(" address");
                                            }
                                            throw new IllegalStateException(j.l("Missing required properties:", sb2));
                                        }
                                        qVar = new q(str, str2, j10);
                                        c15 = 3;
                                        c16 = 4;
                                        c17 = 1;
                                        break;
                                    case 3:
                                        list6 = d(jsonReader, new e0.d(24));
                                        if (list6 == null) {
                                            throw new NullPointerException("Null binaries");
                                        }
                                    case 4:
                                        pVar = f(jsonReader);
                                    default:
                                        jsonReader.skipValue();
                                        c17 = 1;
                                }
                            }
                            jsonReader.endObject();
                            if (qVar == null || list6 == null) {
                                StringBuilder sb3 = new StringBuilder();
                                if (qVar == null) {
                                    sb3.append(" signal");
                                }
                                if (list6 == null) {
                                    sb3.append(" binaries");
                                }
                                throw new IllegalStateException(j.l("Missing required properties:", sb3));
                            }
                            nVar = new n(list5, pVar, cVar, qVar, list6);
                            c15 = 3;
                            c16 = 4;
                            i10 = 16;
                            c17 = 1;
                            break;
                        case 3:
                            list4 = d(jsonReader, new e0.d(23));
                            i10 = 16;
                            c17 = 1;
                        case 4:
                            list3 = d(jsonReader, new r3.j(i10));
                            i10 = 16;
                            c17 = 1;
                        case 5:
                            b10 = (byte) (b10 | 1);
                            i11 = jsonReader.nextInt();
                            i10 = 16;
                            c17 = 1;
                        case 6:
                            tVar = g(jsonReader);
                            i10 = 16;
                            c17 = 1;
                        default:
                            jsonReader.skipValue();
                            i10 = 16;
                            c17 = 1;
                    }
                }
                jsonReader.endObject();
                if (b10 != 1 || nVar == null) {
                    StringBuilder sb4 = new StringBuilder();
                    if (nVar == null) {
                        sb4.append(" execution");
                    }
                    if ((1 & b10) == 0) {
                        sb4.append(" uiOrientation");
                    }
                    throw new IllegalStateException(j.l("Missing required properties:", sb4));
                }
                aVar.f10635c = new m(nVar, list3, list4, bool, tVar, list2, i11);
            } else if (c10 == 3) {
                jsonReader.beginObject();
                String str3 = null;
                while (jsonReader.hasNext()) {
                    if (jsonReader.nextName().equals("content")) {
                        str3 = jsonReader.nextString();
                        if (str3 == null) {
                            throw new NullPointerException("Null content");
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (str3 == null) {
                    throw new IllegalStateException("Missing required properties: content");
                }
                aVar.f10637e = new m8.v(str3);
            } else if (c10 == 4) {
                String nextString3 = jsonReader.nextString();
                if (nextString3 == null) {
                    throw new NullPointerException("Null type");
                }
                aVar.f10634b = nextString3;
            } else if (c10 != 5) {
                jsonReader.skipValue();
            } else {
                aVar.f10633a = jsonReader.nextLong();
                aVar.f10638g = (byte) (aVar.f10638g | 1);
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static p f(JsonReader jsonReader) {
        jsonReader.beginObject();
        byte b10 = 0;
        int i10 = 0;
        String str = null;
        String str2 = null;
        List list = null;
        p pVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            nextName.hashCode();
            switch (nextName) {
                case "frames":
                    list = d(jsonReader, new v(17));
                    if (list == null) {
                        throw new NullPointerException("Null frames");
                    }
                    break;
                case "reason":
                    str2 = jsonReader.nextString();
                    break;
                case "type":
                    str = jsonReader.nextString();
                    if (str == null) {
                        throw new NullPointerException("Null type");
                    }
                    break;
                case "causedBy":
                    pVar = f(jsonReader);
                    break;
                case "overflowCount":
                    i10 = jsonReader.nextInt();
                    b10 = (byte) (b10 | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (b10 == 1 && str != null && list != null) {
            return new p(str, str2, list, pVar, i10);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(" type");
        }
        if (list == null) {
            sb2.append(" frames");
        }
        if ((b10 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(j.l("Missing required properties:", sb2));
    }

    public static t g(JsonReader jsonReader) {
        t.a aVar = new t.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    aVar.f10687b = jsonReader.nextInt();
                    aVar.f10690e = (byte) (aVar.f10690e | 1);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    aVar.f10686a = nextString;
                    break;
                case "defaultProcess":
                    aVar.f10689d = jsonReader.nextBoolean();
                    aVar.f10690e = (byte) (aVar.f10690e | 4);
                    break;
                case "importance":
                    aVar.f10688c = jsonReader.nextInt();
                    aVar.f10690e = (byte) (aVar.f10690e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static b h(JsonReader jsonReader) {
        char c10;
        char c11;
        Charset charset = f0.f10579a;
        b.a aVar = new b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            List list = null;
            switch (c10) {
                case 0:
                    jsonReader.beginObject();
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            list = d(jsonReader, new e0.e(21));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        } else if (nextName2.equals("orgId")) {
                            str = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                    aVar.f10533k = new f(list, str);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    aVar.f10524a = nextString;
                    break;
                case 2:
                    aVar.f10529g = jsonReader.nextString();
                    break;
                case 3:
                    aVar.f10534l = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    aVar.f10530h = nextString2;
                    break;
                case 5:
                    aVar.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    aVar.f10525b = nextString3;
                    break;
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    aVar.f10527d = nextString4;
                    break;
                case '\b':
                    aVar.f10528e = jsonReader.nextString();
                    break;
                case '\t':
                    aVar.f10526c = jsonReader.nextInt();
                    aVar.f10535m = (byte) (aVar.f10535m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    aVar.f10531i = nextString5;
                    break;
                case 11:
                    h.a aVar2 = new h.a();
                    aVar2.f = false;
                    aVar2.f10604m = (byte) (aVar2.f10604m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals(Constants.IDENTIFIER)) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals(io.flutter.plugins.firebase.auth.Constants.USER)) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c11 = 11;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                aVar2.f10596d = jsonReader.nextLong();
                                aVar2.f10604m = (byte) (aVar2.f10604m | 1);
                                break;
                            case 1:
                                aVar2.f10595c = jsonReader.nextString();
                                break;
                            case 2:
                                aVar2.f10594b = new String(Base64.decode(jsonReader.nextString(), 2), f0.f10579a);
                                break;
                            case 3:
                                aVar2.f10597e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                k.a aVar3 = new k.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    nextName4.hashCode();
                                    switch (nextName4) {
                                        case "simulator":
                                            aVar3.f = jsonReader.nextBoolean();
                                            aVar3.f10627j = (byte) (aVar3.f10627j | 16);
                                            break;
                                        case "manufacturer":
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            aVar3.f10625h = nextString6;
                                            break;
                                        case "ram":
                                            aVar3.f10622d = jsonReader.nextLong();
                                            aVar3.f10627j = (byte) (aVar3.f10627j | 4);
                                            break;
                                        case "arch":
                                            aVar3.f10619a = jsonReader.nextInt();
                                            aVar3.f10627j = (byte) (aVar3.f10627j | 1);
                                            break;
                                        case "diskSpace":
                                            aVar3.f10623e = jsonReader.nextLong();
                                            aVar3.f10627j = (byte) (aVar3.f10627j | 8);
                                            break;
                                        case "cores":
                                            aVar3.f10621c = jsonReader.nextInt();
                                            aVar3.f10627j = (byte) (aVar3.f10627j | 2);
                                            break;
                                        case "model":
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            aVar3.f10620b = nextString7;
                                            break;
                                        case "state":
                                            aVar3.f10624g = jsonReader.nextInt();
                                            aVar3.f10627j = (byte) (aVar3.f10627j | 32);
                                            break;
                                        case "modelClass":
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            aVar3.f10626i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.f10601j = aVar3.a();
                                break;
                            case 5:
                                aVar2.f10602k = d(jsonReader, new e0.d(22));
                                break;
                            case 6:
                                z.a aVar4 = new z.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    nextName5.hashCode();
                                    switch (nextName5) {
                                        case "buildVersion":
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            aVar4.f10721c = nextString9;
                                            break;
                                        case "jailbroken":
                                            aVar4.f10722d = jsonReader.nextBoolean();
                                            aVar4.f10723e = (byte) (aVar4.f10723e | 2);
                                            break;
                                        case "version":
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            aVar4.f10720b = nextString10;
                                            break;
                                        case "platform":
                                            aVar4.f10719a = jsonReader.nextInt();
                                            aVar4.f10723e = (byte) (aVar4.f10723e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar2.f10600i = aVar4.a();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    nextName6.hashCode();
                                    switch (nextName6) {
                                        case "identifier":
                                            str2 = jsonReader.nextString();
                                            if (str2 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                        case "developmentPlatform":
                                            str6 = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            str7 = jsonReader.nextString();
                                            break;
                                        case "version":
                                            str3 = jsonReader.nextString();
                                            if (str3 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                        case "installationUuid":
                                            str5 = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            str4 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str2 != null && str3 != null) {
                                    aVar2.f10598g = new i(str2, str3, str4, str5, str6, str7);
                                    break;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (str2 == null) {
                                        sb2.append(" identifier");
                                    }
                                    if (str3 == null) {
                                        sb2.append(" version");
                                    }
                                    throw new IllegalStateException(j.l("Missing required properties:", sb2));
                                }
                                break;
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals(Constants.IDENTIFIER)) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 == null) {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                                aVar2.f10599h = new a0(str8);
                                break;
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                aVar2.f10593a = nextString11;
                                break;
                            case '\n':
                                aVar2.f = jsonReader.nextBoolean();
                                aVar2.f10604m = (byte) (aVar2.f10604m | 2);
                                break;
                            case 11:
                                aVar2.f10603l = jsonReader.nextInt();
                                aVar2.f10604m = (byte) (aVar2.f10604m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.f10532j = aVar2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static b i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                b h10 = h(jsonReader);
                jsonReader.close();
                return h10;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
