package a0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e7.i6;
import io.flutter.embedding.android.KeyboardMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import v5.l;
import w3.b;
import x0.y;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements l.a {
    public /* synthetic */ j(b.a aVar, String str, long j10, long j11) {
    }

    public static final void a(int i10, View view, ViewGroup viewGroup) {
        int i11;
        ec.i.e(viewGroup, "container");
        if (i10 == 0) {
            throw null;
        }
        int i12 = i10 - 1;
        if (i12 == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (y.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i12 == 1) {
            if (y.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (y.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            i11 = 0;
        } else if (i12 == 2) {
            if (y.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            i11 = 8;
        } else {
            if (i12 != 3) {
                return;
            }
            if (y.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
            }
            i11 = 4;
        }
        view.setVisibility(i11);
    }

    public static int b(int i10, int i11, int i12) {
        return i10 | i11 | i12 | 0 | 128;
    }

    public static /* synthetic */ String c(int i10) {
        if (i10 == 1) {
            return "and";
        }
        if (i10 == 2) {
            return "or";
        }
        throw null;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }

    public static int e(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static Long f(long j10, KeyboardMap.AnonymousClass1 anonymousClass1, Long l10, long j11) {
        anonymousClass1.put(l10, Long.valueOf(j10));
        return Long.valueOf(j11);
    }

    public static String g(String str, int i10) {
        return str + i10;
    }

    public static String h(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String i(String str, long j10) {
        return str + j10;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String l(String str, StringBuilder sb2) {
        return str + ((Object) sb2);
    }

    public static String m(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder n(String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static /* synthetic */ Iterator o() {
        try {
            return Arrays.asList(new oc.b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ void p(int i10, String str) {
        if (i10 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = ec.i.class.getName();
            int i11 = 0;
            while (!stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            while (stackTrace[i11].getClassName().equals(name)) {
                i11++;
            }
            StackTraceElement stackTraceElement = stackTrace[i11];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            ec.i.g(ec.i.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void q(i6 i6Var) {
        i6Var.zzl().l();
        i6Var.d0();
    }

    public static /* synthetic */ void r(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void s(StringBuilder sb2, String str, char c10, String str2) {
        sb2.append(str);
        sb2.append(c10);
        sb2.append(str2);
    }

    public static void t(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        Log.e(str2, sb2.toString());
    }

    public static /* synthetic */ String u(int i10) {
        return i10 == 1 ? "INBOUND" : i10 == 2 ? "OUTBOUND" : "null";
    }

    public static /* synthetic */ String v(int i10) {
        return i10 == 1 ? "INVALID" : i10 == 2 ? "FOUND_DOCUMENT" : i10 == 3 ? "NO_DOCUMENT" : i10 == 4 ? "UNKNOWN_DOCUMENT" : "null";
    }

    public static /* synthetic */ String w(int i10) {
        return i10 == 1 ? "FOUND" : i10 == 2 ? "MISSING" : i10 == 3 ? "RESULT_NOT_SET" : "null";
    }

    public static /* synthetic */ String x(int i10) {
        return i10 == 1 ? "NOT_REQUIRED" : i10 == 2 ? "CONNECTED" : i10 == 3 ? "UNMETERED" : i10 == 4 ? "NOT_ROAMING" : i10 == 5 ? "METERED" : i10 == 6 ? "TEMPORARILY_UNMETERED" : "null";
    }

    public static /* synthetic */ String y(int i10) {
        return i10 == 1 ? "REMOVED" : i10 == 2 ? "VISIBLE" : i10 == 3 ? "GONE" : i10 == 4 ? "INVISIBLE" : "null";
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        w3.b bVar = (w3.b) obj;
        bVar.H0();
        bVar.s0();
        bVar.r0();
    }
}
