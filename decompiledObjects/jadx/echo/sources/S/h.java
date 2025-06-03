package S;

import P.k;
import R.f;
import R.h;
import S.d;
import V5.l;
import V5.t;
import W5.w;
import androidx.datastore.preferences.protobuf.AbstractC0775w;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final h f5815a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final String f5816b = "preferences_pb";

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5817a;

        static {
            int[] iArr = new int[h.b.values().length];
            iArr[h.b.BOOLEAN.ordinal()] = 1;
            iArr[h.b.FLOAT.ordinal()] = 2;
            iArr[h.b.DOUBLE.ordinal()] = 3;
            iArr[h.b.INTEGER.ordinal()] = 4;
            iArr[h.b.LONG.ordinal()] = 5;
            iArr[h.b.STRING.ordinal()] = 6;
            iArr[h.b.STRING_SET.ordinal()] = 7;
            iArr[h.b.VALUE_NOT_SET.ordinal()] = 8;
            f5817a = iArr;
        }
    }

    @Override // P.k
    public Object b(InputStream inputStream, X5.d dVar) {
        R.f a7 = R.d.f4504a.a(inputStream);
        S.a b7 = e.b(new d.b[0]);
        Map K6 = a7.K();
        Intrinsics.checkNotNullExpressionValue(K6, "preferencesProto.preferencesMap");
        for (Map.Entry entry : K6.entrySet()) {
            String name = (String) entry.getKey();
            R.h value = (R.h) entry.getValue();
            h hVar = f5815a;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            hVar.d(name, value, b7);
        }
        return b7.d();
    }

    public final void d(String str, R.h hVar, S.a aVar) {
        d.a a7;
        Object valueOf;
        h.b X6 = hVar.X();
        switch (X6 == null ? -1 : a.f5817a[X6.ordinal()]) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                throw new P.a("Value case is null.", null, 2, null);
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
            default:
                throw new l();
            case 1:
                a7 = f.a(str);
                valueOf = Boolean.valueOf(hVar.P());
                break;
            case 2:
                a7 = f.c(str);
                valueOf = Float.valueOf(hVar.S());
                break;
            case 3:
                a7 = f.b(str);
                valueOf = Double.valueOf(hVar.R());
                break;
            case 4:
                a7 = f.d(str);
                valueOf = Integer.valueOf(hVar.T());
                break;
            case 5:
                a7 = f.e(str);
                valueOf = Long.valueOf(hVar.U());
                break;
            case 6:
                a7 = f.f(str);
                valueOf = hVar.V();
                Intrinsics.checkNotNullExpressionValue(valueOf, "value.string");
                break;
            case 7:
                a7 = f.g(str);
                List M6 = hVar.W().M();
                Intrinsics.checkNotNullExpressionValue(M6, "value.stringSet.stringsList");
                valueOf = w.J(M6);
                break;
            case 8:
                throw new P.a("Value not set.", null, 2, null);
        }
        aVar.i(a7, valueOf);
    }

    @Override // P.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public d a() {
        return e.a();
    }

    public final String f() {
        return f5816b;
    }

    public final R.h g(Object obj) {
        AbstractC0775w s7;
        String str;
        if (obj instanceof Boolean) {
            s7 = R.h.Y().A(((Boolean) obj).booleanValue()).s();
            str = "newBuilder().setBoolean(value).build()";
        } else if (obj instanceof Float) {
            s7 = R.h.Y().C(((Number) obj).floatValue()).s();
            str = "newBuilder().setFloat(value).build()";
        } else if (obj instanceof Double) {
            s7 = R.h.Y().B(((Number) obj).doubleValue()).s();
            str = "newBuilder().setDouble(value).build()";
        } else if (obj instanceof Integer) {
            s7 = R.h.Y().D(((Number) obj).intValue()).s();
            str = "newBuilder().setInteger(value).build()";
        } else if (obj instanceof Long) {
            s7 = R.h.Y().E(((Number) obj).longValue()).s();
            str = "newBuilder().setLong(value).build()";
        } else if (obj instanceof String) {
            s7 = R.h.Y().F((String) obj).s();
            str = "newBuilder().setString(value).build()";
        } else {
            if (!(obj instanceof Set)) {
                throw new IllegalStateException(Intrinsics.i("PreferencesSerializer does not support type: ", obj.getClass().getName()));
            }
            s7 = R.h.Y().G(R.g.N().A((Set) obj)).s();
            str = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
        }
        Intrinsics.checkNotNullExpressionValue(s7, str);
        return (R.h) s7;
    }

    @Override // P.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object c(d dVar, OutputStream outputStream, X5.d dVar2) {
        Map a7 = dVar.a();
        f.a N6 = R.f.N();
        for (Map.Entry entry : a7.entrySet()) {
            N6.A(((d.a) entry.getKey()).a(), g(entry.getValue()));
        }
        ((R.f) N6.s()).m(outputStream);
        return t.f6803a;
    }
}
