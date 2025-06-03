package k2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e0.s0;
import ec.i;
import i2.b;
import i2.c;
import i2.k;
import i2.l;
import i2.o;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {
    public static i2.c a(l lVar, FoldingFeature foldingFeature) {
        c.a aVar;
        b.C0108b c0108b;
        int type = foldingFeature.getType();
        boolean z10 = true;
        if (type == 1) {
            aVar = c.a.f7367b;
        } else {
            if (type != 2) {
                return null;
            }
            aVar = c.a.f7368c;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c0108b = b.C0108b.f7361b;
        } else {
            if (state != 2) {
                return null;
            }
            c0108b = b.C0108b.f7362c;
        }
        Rect bounds = foldingFeature.getBounds();
        i.d(bounds, "oemFeature.bounds");
        f2.a aVar2 = new f2.a(bounds);
        Rect a10 = lVar.a();
        if ((aVar2.f5304d - aVar2.f5302b == 0 && aVar2.f5303c - aVar2.f5301a == 0) || ((aVar2.f5303c - aVar2.f5301a != a10.width() && aVar2.f5304d - aVar2.f5302b != a10.height()) || ((aVar2.f5303c - aVar2.f5301a < a10.width() && aVar2.f5304d - aVar2.f5302b < a10.height()) || (aVar2.f5303c - aVar2.f5301a == a10.width() && aVar2.f5304d - aVar2.f5302b == a10.height())))) {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        i.d(bounds2, "oemFeature.bounds");
        return new i2.c(new f2.a(bounds2), aVar, c0108b);
    }

    public static k b(Context context, WindowLayoutInfo windowLayoutInfo) {
        l b10;
        i.e(context, "context");
        i.e(windowLayoutInfo, "info");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            o.f7398b.getClass();
            if (i10 < 30) {
                Context context2 = context;
                while (context2 instanceof ContextWrapper) {
                    boolean z10 = context2 instanceof Activity;
                    if (!z10 && !(context2 instanceof InputMethodService)) {
                        ContextWrapper contextWrapper = (ContextWrapper) context2;
                        if (contextWrapper.getBaseContext() != null) {
                            context2 = contextWrapper.getBaseContext();
                            i.d(context2, "iterator.baseContext");
                        }
                    }
                    if (z10) {
                        b10 = o.b((Activity) context);
                    } else {
                        if (!(context2 instanceof InputMethodService)) {
                            throw new IllegalArgumentException(context + " is not a UiContext");
                        }
                        Object systemService = context.getSystemService("window");
                        i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                        i.d(defaultDisplay, "wm.defaultDisplay");
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        Rect rect = new Rect(0, 0, point.x, point.y);
                        int i11 = Build.VERSION.SDK_INT;
                        s0 b11 = (i11 >= 30 ? new s0.d() : i11 >= 29 ? new s0.c() : new s0.b()).b();
                        i.d(b11, "Builder().build()");
                        b10 = new l(rect, b11);
                    }
                }
                throw new IllegalArgumentException("Context " + context + " is not a UiContext");
            }
            b10 = m2.a.c(context);
        } else {
            if (i10 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            o.f7398b.getClass();
            b10 = o.b((Activity) context);
        }
        return c(b10, windowLayoutInfo);
    }

    public static k c(l lVar, WindowLayoutInfo windowLayoutInfo) {
        i2.c cVar;
        i.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        i.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                i.d(foldingFeature, "feature");
                cVar = a(lVar, foldingFeature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new k(arrayList);
    }
}
