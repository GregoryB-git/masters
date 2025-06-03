package l2;

import a0.j;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import ec.i;
import f2.g;
import i2.b;
import i2.c;
import i2.k;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.s;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9532a;

    /* renamed from: l2.a$a, reason: collision with other inner class name */
    public static final class C0143a {
        public static int a(SidecarDeviceState sidecarDeviceState) {
            i.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    i.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) invoke).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public static int b(SidecarDeviceState sidecarDeviceState) {
            i.e(sidecarDeviceState, "sidecarDeviceState");
            int a10 = a(sidecarDeviceState);
            if (a10 < 0 || a10 > 4) {
                return 0;
            }
            return a10;
        }

        public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            i.e(sidecarWindowLayoutInfo, "info");
            try {
                try {
                    List list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? s.f14324a : list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return s.f14324a;
                }
            } catch (NoSuchFieldError unused2) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                i.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            }
        }

        public static void d(SidecarDeviceState sidecarDeviceState, int i10) {
            try {
                try {
                    sidecarDeviceState.posture = i10;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i10));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    public a(int i10) {
        j.p(3, "verificationMode");
        this.f9532a = 3;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (i.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        return (sidecarDeviceState == null || sidecarDeviceState2 == null || C0143a.b(sidecarDeviceState) != C0143a.b(sidecarDeviceState2)) ? false : true;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (i.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return i.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!b((SidecarDisplayFeature) list.get(i10), (SidecarDisplayFeature) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (i.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(C0143a.c(sidecarWindowLayoutInfo), C0143a.c(sidecarWindowLayoutInfo2));
    }

    public final k e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        i.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new k(s.f14324a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C0143a.d(sidecarDeviceState2, C0143a.b(sidecarDeviceState));
        return new k(f(C0143a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList f(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2.c g10 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g10 != null) {
                arrayList.add(g10);
            }
        }
        return arrayList;
    }

    public final i2.c g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        c.a aVar;
        b.C0108b c0108b;
        i.e(sidecarDisplayFeature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) g.a.a(sidecarDisplayFeature, this.f9532a).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f9533a).c("Feature bounds must not be 0", c.f9534a).c("TYPE_FOLD must have 0 area", d.f9535a).c("Feature be pinned to either left or top", e.f9536a).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            aVar = c.a.f7367b;
        } else {
            if (type != 2) {
                return null;
            }
            aVar = c.a.f7368c;
        }
        int b10 = C0143a.b(sidecarDeviceState);
        if (b10 == 0 || b10 == 1) {
            return null;
        }
        if (b10 == 2) {
            c0108b = b.C0108b.f7362c;
        } else {
            if (b10 != 3 && b10 == 4) {
                return null;
            }
            c0108b = b.C0108b.f7361b;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        i.d(rect, "feature.rect");
        return new i2.c(new f2.a(rect), aVar, c0108b);
    }
}
