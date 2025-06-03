package defpackage;

import a4.o;
import a4.s;
import a4.y;
import android.media.UnsupportedSchemeException;
import b9.a;
import d9.e0;
import d9.l0;
import g9.b0;
import g9.i0;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import n9.i;
import o4.n;
import o4.p;
import q0.g;
import u5.k;
import u5.m;
import v5.l;
import w3.b;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements i, n, o.c, l.a {
    public /* synthetic */ f() {
    }

    public /* synthetic */ f(b.a aVar, float f) {
    }

    public static int[] _values() {
        return g.d(8);
    }

    public static /* synthetic */ int c(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return -1;
        }
        throw null;
    }

    public static long d(k kVar) {
        byte[] bArr = ((m) kVar).f15050b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }

    public static /* synthetic */ int e(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        if (i10 == 4) {
            return 4;
        }
        throw null;
    }

    public static /* synthetic */ long f(int i10) {
        if (i10 == 1) {
            return 0L;
        }
        if (i10 == 2) {
            return 1L;
        }
        if (i10 == 3) {
            return 2L;
        }
        if (i10 == 4) {
            return 3L;
        }
        if (i10 == 5) {
            return 4L;
        }
        throw null;
    }

    public static Long g(long j10, KeyboardMap.AnonymousClass2 anonymousClass2, Long l10, long j11) {
        anonymousClass2.put(l10, Long.valueOf(j10));
        return Long.valueOf(j11);
    }

    public static String h(String str, int i10) {
        return str + i10;
    }

    public static String i(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, x0.i iVar, String str2) {
        return str + iVar + str2;
    }

    public static StringBuilder l(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder m(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static HashMap n(Class cls, a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static /* synthetic */ void o(int i10, String str) {
        if (i10 == 0) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void p(String str, int i10, String str2) {
        v5.m.f(str2, str + i10);
    }

    public static /* synthetic */ String q(int i10) {
        return i10 == 1 ? "ERROR" : i10 == 2 ? "RUNNING" : i10 == 3 ? "SUCCESS" : "null";
    }

    public static /* synthetic */ String r(int i10) {
        return i10 == 1 ? "ASCENDING" : i10 == 2 ? "DESCENDING" : i10 == 3 ? "CONTAINS" : "null";
    }

    public static /* synthetic */ String s(int i10) {
        return i10 == 1 ? "NULL_VALUE" : i10 == 2 ? "BOOLEAN_VALUE" : i10 == 3 ? "INTEGER_VALUE" : i10 == 4 ? "DOUBLE_VALUE" : i10 == 5 ? "TIMESTAMP_VALUE" : i10 == 6 ? "STRING_VALUE" : i10 == 7 ? "BYTES_VALUE" : i10 == 8 ? "REFERENCE_VALUE" : i10 == 9 ? "GEO_POINT_VALUE" : i10 == 10 ? "ARRAY_VALUE" : i10 == 11 ? "MAP_VALUE" : i10 == 12 ? "VALUETYPE_NOT_SET" : "null";
    }

    public static /* synthetic */ String t(int i10) {
        return i10 == 1 ? "EXPONENTIAL" : i10 == 2 ? "LINEAR" : "null";
    }

    public static /* synthetic */ String u(int i10) {
        return i10 == 1 ? "ATTEMPT_MIGRATION" : i10 == 2 ? "NOT_GENERATED" : i10 == 3 ? "UNREGISTERED" : i10 == 4 ? "REGISTERED" : i10 == 5 ? "REGISTER_ERROR" : "null";
    }

    public static /* synthetic */ String v(int i10) {
        return i10 == 1 ? "OK" : i10 == 2 ? "BAD_CONFIG" : "null";
    }

    @Override // o4.n
    public List a(String str, boolean z10, boolean z11) {
        return p.e(str, z10, z11);
    }

    @Override // n9.i
    public Object apply(Object obj) {
        com.google.firebase.firestore.g gVar = (com.google.firebase.firestore.g) obj;
        e0 e0Var = gVar.f3178e;
        return e0Var != null ? e0Var instanceof l0 : gVar.f3176c ? new i0(gVar) : new b0(gVar);
    }

    @Override // a4.o.c
    public o b(UUID uuid) {
        try {
            ec.i.b(uuid);
            try {
                s sVar = new s(uuid);
                sVar.f200b.setPropertyString("securityLevel", "L3");
                return sVar;
            } catch (UnsupportedSchemeException e10) {
                throw new y(e10);
            } catch (Exception e11) {
                throw new y(e11);
            }
        } catch (y unused) {
            return new a4.m();
        }
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        ((b) obj).A0();
    }
}
