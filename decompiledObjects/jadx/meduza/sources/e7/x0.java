package e7;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference<String[]> f4749b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference<String[]> f4750c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference<String[]> f4751d = new AtomicReference<>();

    /* renamed from: a, reason: collision with root package name */
    public final b1.v f4752a;

    public x0(b1.v vVar) {
        this.f4752a = vVar;
    }

    public static String d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        m6.j.i(atomicReference);
        m6.j.b(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i10] == null) {
                        strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                    }
                    str2 = strArr3[i10];
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f4752a.m()) {
            return bundle.toString();
        }
        StringBuilder l10 = defpackage.f.l("Bundle[{");
        for (String str : bundle.keySet()) {
            if (l10.length() != 8) {
                l10.append(", ");
            }
            l10.append(f(str));
            l10.append("=");
            Object obj = bundle.get(str);
            l10.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        l10.append("}]");
        return l10.toString();
    }

    public final String b(f0 f0Var) {
        if (!this.f4752a.m()) {
            return f0Var.toString();
        }
        StringBuilder l10 = defpackage.f.l("origin=");
        l10.append(f0Var.f4194c);
        l10.append(",name=");
        l10.append(c(f0Var.f4192a));
        l10.append(",params=");
        a0 a0Var = f0Var.f4193b;
        l10.append(a0Var == null ? null : !this.f4752a.m() ? a0Var.toString() : a(a0Var.E()));
        return l10.toString();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f4752a.m() ? str : d(str, b.a0.f1565d, b.a0.f1561b, f4749b);
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder l10 = defpackage.f.l("[");
        for (Object obj : objArr) {
            String a10 = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (a10 != null) {
                if (l10.length() != 1) {
                    l10.append(", ");
                }
                l10.append(a10);
            }
        }
        l10.append("]");
        return l10.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f4752a.m() ? str : d(str, b.z.f1657b, b.z.f1656a, f4750c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        return !this.f4752a.m() ? str : str.startsWith("_exp_") ? a0.j.k("experiment_id", "(", str, ")") : d(str, p2.m0.f12890b, p2.m0.f12889a, f4751d);
    }
}
