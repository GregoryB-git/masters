package l;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import h.AbstractC1324c;

/* renamed from: l.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1494B {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f16268a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f16269b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f16270c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public static Class f16271d;

    static {
        try {
            f16271d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Drawable drawable) {
        Drawable drawable2;
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof B.b) {
                drawable2 = ((B.b) drawable).a();
            } else if (drawable instanceof AbstractC1324c) {
                drawable2 = ((AbstractC1324c) drawable).a();
            } else {
                if (!(drawable instanceof ScaleDrawable)) {
                    return true;
                }
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return a(drawable2);
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable3 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!a(drawable3)) {
                return false;
            }
        }
        return true;
    }

    public static PorterDuff.Mode c(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void b(Drawable drawable) {
    }
}
