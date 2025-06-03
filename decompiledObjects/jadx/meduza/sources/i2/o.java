package i2;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import e0.s0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final o f7398b = new o();

    /* renamed from: c, reason: collision with root package name */
    public static final String f7399c = o.class.getSimpleName();

    static {
        new ArrayList(new sb.h(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static l b(Activity activity) {
        Rect rect;
        int i10;
        boolean isInMultiWindowMode;
        s0 b10;
        ec.i.e(activity, "activity");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            rect = m2.a.a(activity);
        } else {
            if (i11 >= 29) {
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                    ec.i.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                    rect = new Rect((Rect) invoke);
                } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e10) {
                    Log.w(f7399c, e10);
                    rect = c(activity);
                }
            } else if (i11 >= 28) {
                rect = c(activity);
            } else if (i11 >= 24) {
                rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                isInMultiWindowMode = activity.isInMultiWindowMode();
                if (!isInMultiWindowMode) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i12 = rect.bottom + dimensionPixelSize;
                    if (i12 == point.y) {
                        rect.bottom = i12;
                    } else {
                        int i13 = rect.right + dimensionPixelSize;
                        if (i13 == point.x) {
                            rect.right = i13;
                        }
                    }
                }
            } else {
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                ec.i.d(defaultDisplay2, "defaultDisplay");
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                Rect rect2 = new Rect();
                int i14 = point2.x;
                if (i14 == 0 || (i10 = point2.y) == 0) {
                    defaultDisplay2.getRectSize(rect2);
                } else {
                    rect2.right = i14;
                    rect2.bottom = i10;
                }
                rect = rect2;
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 30) {
            b10 = (i15 >= 30 ? new s0.d() : i15 >= 29 ? new s0.c() : new s0.b()).b();
            ec.i.d(b10, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i15 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b10 = m2.a.f9873a.b(activity);
        }
        return new l(new f2.a(rect), b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Rect c(android.app.Activity r9) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.o.c(android.app.Activity):android.graphics.Rect");
    }

    public static void d(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    @Override // i2.n
    public final l a(Activity activity) {
        Rect rect;
        s0 b10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            rect = m2.a.d(activity);
        } else {
            Object systemService = activity.getSystemService("window");
            ec.i.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            ec.i.d(defaultDisplay, "display");
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            rect = new Rect(0, 0, point.x, point.y);
        }
        if (i10 < 30) {
            b10 = (i10 >= 30 ? new s0.d() : i10 >= 29 ? new s0.c() : new s0.b()).b();
            ec.i.d(b10, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i10 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b10 = m2.a.f9873a.b(activity);
        }
        return new l(new f2.a(rect), b10);
    }
}
