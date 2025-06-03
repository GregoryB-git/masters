package R2;

import A2.AbstractC0328n;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class X1 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f5129b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f5130c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f5131d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final W1 f5132a;

    public X1(W1 w12) {
        this.f5132a = w12;
    }

    public static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        AbstractC0328n.i(strArr);
        AbstractC0328n.i(strArr2);
        AbstractC0328n.i(atomicReference);
        AbstractC0328n.a(strArr.length == strArr2.length);
        for (int i7 = 0; i7 < strArr.length; i7++) {
            Object obj = strArr[i7];
            if (str == obj || (str != null && str.equals(obj))) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i7] == null) {
                            strArr3[i7] = strArr2[i7] + "(" + strArr[i7] + ")";
                        }
                        str2 = strArr3[i7];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(I i7) {
        if (i7 == null) {
            return null;
        }
        if (!this.f5132a.a()) {
            return i7.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(i7.f4706q);
        sb.append(",name=");
        sb.append(c(i7.f4704o));
        sb.append(",params=");
        D d7 = i7.f4705p;
        sb.append(d7 != null ? !this.f5132a.a() ? d7.toString() : b(d7.g()) : null);
        return sb.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f5132a.a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f5132a.a() ? str : d(str, AbstractC0591r3.f5514c, AbstractC0591r3.f5512a, f5129b);
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String b7 = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (b7 != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(b7);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f5132a.a() ? str : d(str, AbstractC0605t3.f5541b, AbstractC0605t3.f5540a, f5130c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f5132a.a()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, AbstractC0598s3.f5528b, AbstractC0598s3.f5527a, f5131d);
        }
        return "experiment_id(" + str + ")";
    }
}
