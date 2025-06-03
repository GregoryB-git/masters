package defpackage;

import a4.o;
import a4.s;
import a4.y;
import android.media.UnsupportedSchemeException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.UUID;
import k4.j;
import n7.e;
import oc.a;
import v3.o0;
import v5.l;
import v5.m;
import w3.b;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements o.c, e, l.a {
    public /* synthetic */ g() {
    }

    public /* synthetic */ g(b.a aVar, o0 o0Var, int i10) {
    }

    public static /* synthetic */ int a(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 == 6) {
            return 99;
        }
        throw null;
    }

    public static String c(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String d(String str, String str2) {
        return str + str2;
    }

    public static String e(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String f(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static StringBuilder g(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static /* synthetic */ Iterator h() {
        try {
            return Arrays.asList(new a()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static Map i(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* synthetic */ void j(int i10) {
        if (i10 == 0) {
            throw new NullPointerException("null reference");
        }
    }

    public static void k(int i10, HashMap hashMap, String str, int i11, String str2, int i12, String str3, int i13, String str4) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
        hashMap.put(str3, Integer.valueOf(i12));
        hashMap.put(str4, Integer.valueOf(i13));
    }

    public static /* synthetic */ String l(int i10) {
        if (i10 == 1) {
            return "LIMIT_TO_FIRST";
        }
        if (i10 == 2) {
            return "LIMIT_TO_LAST";
        }
        throw null;
    }

    public static /* synthetic */ String m(int i10) {
        return i10 == 1 ? "IDLE" : i10 == 2 ? "QUEUING" : i10 == 3 ? "QUEUED" : i10 == 4 ? "RUNNING" : "null";
    }

    public static /* synthetic */ String n(int i10) {
        return i10 == 1 ? "HEADER" : i10 == 2 ? "HEADER_EXTRA_LEN" : i10 == 3 ? "HEADER_EXTRA" : i10 == 4 ? "HEADER_NAME" : i10 == 5 ? "HEADER_COMMENT" : i10 == 6 ? "HEADER_CRC" : i10 == 7 ? "INITIALIZE_INFLATER" : i10 == 8 ? "INFLATING" : i10 == 9 ? "INFLATER_NEEDS_INPUT" : i10 == 10 ? "TRAILER" : "null";
    }

    public static /* synthetic */ String o(int i10) {
        return i10 == 1 ? "HEADER" : i10 == 2 ? "BODY" : "null";
    }

    public static /* synthetic */ String p(int i10) {
        return i10 == 1 ? "TLS" : i10 == 2 ? "PLAINTEXT" : "null";
    }

    public static /* synthetic */ String q(int i10) {
        return i10 == 1 ? "HAS_LOCAL_MUTATIONS" : i10 == 2 ? "HAS_COMMITTED_MUTATIONS" : i10 == 3 ? "SYNCED" : "null";
    }

    public static /* synthetic */ String r(int i10) {
        return i10 == 1 ? "OK" : i10 == 2 ? "TRANSIENT_ERROR" : i10 == 3 ? "FATAL_ERROR" : i10 == 4 ? "INVALID_PAYLOAD" : "null";
    }

    public static /* synthetic */ String s(int i10) {
        return i10 == 1 ? "BEGIN_ARRAY" : i10 == 2 ? "END_ARRAY" : i10 == 3 ? "BEGIN_OBJECT" : i10 == 4 ? "END_OBJECT" : i10 == 5 ? "NAME" : i10 == 6 ? "STRING" : i10 == 7 ? "NUMBER" : i10 == 8 ? "BOOLEAN" : i10 == 9 ? "NULL" : i10 == 10 ? "END_DOCUMENT" : "null";
    }

    public static /* synthetic */ String t(int i10) {
        return i10 == 1 ? "NONE" : i10 == 2 ? "ADDING" : i10 == 3 ? "REMOVING" : "null";
    }

    public static /* synthetic */ String u(int i10) {
        return i10 == 1 ? "OK" : i10 == 2 ? "BAD_CONFIG" : i10 == 3 ? "AUTH_ERROR" : "null";
    }

    @Override // n7.e
    public Object apply(Object obj) {
        return (j) obj;
    }

    @Override // a4.o.c
    public o b(UUID uuid) {
        try {
            try {
                try {
                    return new s(uuid);
                } catch (UnsupportedSchemeException e10) {
                    throw new y(e10);
                }
            } catch (Exception e11) {
                throw new y(e11);
            }
        } catch (y unused) {
            m.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new a4.m();
        }
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        ((b) obj).O();
    }
}
