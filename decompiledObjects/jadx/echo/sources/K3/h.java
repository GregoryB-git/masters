package K3;

import J3.B;
import J3.C;
import J3.C0429a;
import android.util.Base64;
import android.util.JsonReader;
import j4.InterfaceC1375a;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import l4.C1610d;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1375a f3189a = new C1610d().j(C0429a.f2691a).k(true).i();

    public interface a {
        Object a(JsonReader jsonReader);
    }

    public static B.d A(JsonReader jsonReader) {
        B.d.a a7 = B.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a7.b(l(jsonReader, new a() { // from class: K3.d
                    @Override // K3.h.a
                    public final Object a(JsonReader jsonReader2) {
                        B.d.b z7;
                        z7 = h.z(jsonReader2);
                        return z7;
                    }
                }));
            } else if (nextName.equals("orgId")) {
                a7.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.AbstractC0057e B(JsonReader jsonReader) {
        B.e.AbstractC0057e.a a7 = B.e.AbstractC0057e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "buildVersion":
                    a7.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    a7.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    a7.e(jsonReader.nextString());
                    break;
                case "platform":
                    a7.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B C(JsonReader jsonReader) {
        B.b b7 = B.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "ndkPayload":
                    b7.i(A(jsonReader));
                    break;
                case "sdkVersion":
                    b7.k(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    b7.c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    b7.b(k(jsonReader));
                    break;
                case "buildVersion":
                    b7.d(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    b7.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    b7.h(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    b7.f(jsonReader.nextString());
                    break;
                case "platform":
                    b7.j(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    b7.e(jsonReader.nextString());
                    break;
                case "session":
                    b7.l(D(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b7.a();
    }

    public static B.e D(JsonReader jsonReader) {
        B.e.b a7 = B.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "startedAt":
                    a7.m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    a7.c(jsonReader.nextString());
                    break;
                case "identifier":
                    a7.k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    a7.f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    a7.e(o(jsonReader));
                    break;
                case "events":
                    a7.g(l(jsonReader, new a() { // from class: K3.c
                        @Override // K3.h.a
                        public final Object a(JsonReader jsonReader2) {
                            B.e.d p7;
                            p7 = h.p(jsonReader2);
                            return p7;
                        }
                    }));
                    break;
                case "os":
                    a7.l(B(jsonReader));
                    break;
                case "app":
                    a7.b(j(jsonReader));
                    break;
                case "user":
                    a7.n(E(jsonReader));
                    break;
                case "generator":
                    a7.h(jsonReader.nextString());
                    break;
                case "crashed":
                    a7.d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    a7.i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.f E(JsonReader jsonReader) {
        B.e.f.a a7 = B.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("identifier")) {
                a7.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.a j(JsonReader jsonReader) {
        B.e.a.AbstractC0044a a7 = B.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "identifier":
                    a7.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    a7.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    a7.c(jsonReader.nextString());
                    break;
                case "version":
                    a7.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    a7.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    a7.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.a k(JsonReader jsonReader) {
        B.a.b a7 = B.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "buildIdMappingForArch":
                    a7.b(l(jsonReader, new a() { // from class: K3.a
                        @Override // K3.h.a
                        public final Object a(JsonReader jsonReader2) {
                            B.a.AbstractC0042a m7;
                            m7 = h.m(jsonReader2);
                            return m7;
                        }
                    }));
                    break;
                case "pid":
                    a7.d(jsonReader.nextInt());
                    break;
                case "pss":
                    a7.f(jsonReader.nextLong());
                    break;
                case "rss":
                    a7.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    a7.i(jsonReader.nextLong());
                    break;
                case "processName":
                    a7.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    a7.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    a7.j(jsonReader.nextString());
                    break;
                case "importance":
                    a7.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static C l(JsonReader jsonReader, a aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return C.a(arrayList);
    }

    public static B.a.AbstractC0042a m(JsonReader jsonReader) {
        B.a.AbstractC0042a.AbstractC0043a a7 = B.a.AbstractC0042a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "libraryName":
                    a7.d(jsonReader.nextString());
                    break;
                case "arch":
                    a7.b(jsonReader.nextString());
                    break;
                case "buildId":
                    a7.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.c n(JsonReader jsonReader) {
        B.c.a a7 = B.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a7.b(jsonReader.nextString());
            } else if (nextName.equals("value")) {
                a7.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.c o(JsonReader jsonReader) {
        B.e.c.a a7 = B.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "simulator":
                    a7.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    a7.e(jsonReader.nextString());
                    break;
                case "ram":
                    a7.h(jsonReader.nextLong());
                    break;
                case "arch":
                    a7.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    a7.d(jsonReader.nextLong());
                    break;
                case "cores":
                    a7.c(jsonReader.nextInt());
                    break;
                case "model":
                    a7.f(jsonReader.nextString());
                    break;
                case "state":
                    a7.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    a7.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.d p(JsonReader jsonReader) {
        B.e.d.b a7 = B.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "device":
                    a7.c(s(jsonReader));
                    break;
                case "app":
                    a7.b(q(jsonReader));
                    break;
                case "log":
                    a7.d(w(jsonReader));
                    break;
                case "type":
                    a7.f(jsonReader.nextString());
                    break;
                case "timestamp":
                    a7.e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.d.a q(JsonReader jsonReader) {
        B.e.d.a.AbstractC0045a a7 = B.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "background":
                    a7.b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    a7.d(t(jsonReader));
                    break;
                case "internalKeys":
                    a7.e(l(jsonReader, new a() { // from class: K3.b
                        @Override // K3.h.a
                        public final Object a(JsonReader jsonReader2) {
                            B.c n7;
                            n7 = h.n(jsonReader2);
                            return n7;
                        }
                    }));
                    break;
                case "customAttributes":
                    a7.c(l(jsonReader, new a() { // from class: K3.b
                        @Override // K3.h.a
                        public final Object a(JsonReader jsonReader2) {
                            B.c n7;
                            n7 = h.n(jsonReader2);
                            return n7;
                        }
                    }));
                    break;
                case "uiOrientation":
                    a7.f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.d.a.b.AbstractC0046a r(JsonReader jsonReader) {
        B.e.d.a.b.AbstractC0046a.AbstractC0047a a7 = B.e.d.a.b.AbstractC0046a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "name":
                    a7.c(jsonReader.nextString());
                    break;
                case "size":
                    a7.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    a7.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    a7.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.d.c s(JsonReader jsonReader) {
        B.e.d.c.a a7 = B.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "batteryLevel":
                    a7.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    a7.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    a7.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    a7.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    a7.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    a7.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.d.a.b t(JsonReader jsonReader) {
        B.e.d.a.b.AbstractC0048b a7 = B.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "appExitInfo":
                    a7.b(k(jsonReader));
                    break;
                case "threads":
                    a7.f(l(jsonReader, new a() { // from class: K3.e
                        @Override // K3.h.a
                        public final Object a(JsonReader jsonReader2) {
                            B.e.d.a.b.AbstractC0052e y7;
                            y7 = h.y(jsonReader2);
                            return y7;
                        }
                    }));
                    break;
                case "signal":
                    a7.e(x(jsonReader));
                    break;
                case "binaries":
                    a7.c(l(jsonReader, new a() { // from class: K3.f
                        @Override // K3.h.a
                        public final Object a(JsonReader jsonReader2) {
                            B.e.d.a.b.AbstractC0046a r7;
                            r7 = h.r(jsonReader2);
                            return r7;
                        }
                    }));
                    break;
                case "exception":
                    a7.d(u(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.d.a.b.c u(JsonReader jsonReader) {
        B.e.d.a.b.c.AbstractC0049a a7 = B.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "frames":
                    a7.c(l(jsonReader, new g()));
                    break;
                case "reason":
                    a7.e(jsonReader.nextString());
                    break;
                case "type":
                    a7.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    a7.b(u(jsonReader));
                    break;
                case "overflowCount":
                    a7.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.d.a.b.AbstractC0052e.AbstractC0054b v(JsonReader jsonReader) {
        B.e.d.a.b.AbstractC0052e.AbstractC0054b.AbstractC0055a a7 = B.e.d.a.b.AbstractC0052e.AbstractC0054b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "offset":
                    a7.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    a7.f(jsonReader.nextString());
                    break;
                case "pc":
                    a7.e(jsonReader.nextLong());
                    break;
                case "file":
                    a7.b(jsonReader.nextString());
                    break;
                case "importance":
                    a7.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.d.AbstractC0056d w(JsonReader jsonReader) {
        B.e.d.AbstractC0056d.a a7 = B.e.d.AbstractC0056d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("content")) {
                a7.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.d.a.b.AbstractC0050d x(JsonReader jsonReader) {
        B.e.d.a.b.AbstractC0050d.AbstractC0051a a7 = B.e.d.a.b.AbstractC0050d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "address":
                    a7.b(jsonReader.nextLong());
                    break;
                case "code":
                    a7.c(jsonReader.nextString());
                    break;
                case "name":
                    a7.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.e.d.a.b.AbstractC0052e y(JsonReader jsonReader) {
        B.e.d.a.b.AbstractC0052e.AbstractC0053a a7 = B.e.d.a.b.AbstractC0052e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "frames":
                    a7.b(l(jsonReader, new g()));
                    break;
                case "name":
                    a7.d(jsonReader.nextString());
                    break;
                case "importance":
                    a7.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public static B.d.b z(JsonReader jsonReader) {
        B.d.b.a a7 = B.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a7.c(jsonReader.nextString());
            } else if (nextName.equals("contents")) {
                a7.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return a7.a();
    }

    public B F(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                B C7 = C(jsonReader);
                jsonReader.close();
                return C7;
            } finally {
            }
        } catch (IllegalStateException e7) {
            throw new IOException(e7);
        }
    }

    public String G(B b7) {
        return f3189a.a(b7);
    }

    public B.e.d h(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                B.e.d p7 = p(jsonReader);
                jsonReader.close();
                return p7;
            } finally {
            }
        } catch (IllegalStateException e7) {
            throw new IOException(e7);
        }
    }

    public String i(B.e.d dVar) {
        return f3189a.a(dVar);
    }
}
