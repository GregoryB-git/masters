package l;

import I.AbstractC0421s;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import e.AbstractC1238i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1524x {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f16488l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static ConcurrentHashMap f16489m = new ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public static ConcurrentHashMap f16490n = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f16491a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16492b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f16493c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f16494d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f16495e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f16496f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f16497g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f16498h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f16499i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f16500j;

    /* renamed from: k, reason: collision with root package name */
    public final c f16501k;

    /* renamed from: l.x$a */
    public static class a extends c {
        @Override // l.C1524x.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C1524x.n(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: l.x$b */
    public static class b extends a {
        @Override // l.C1524x.a, l.C1524x.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // l.C1524x.c
        public boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* renamed from: l.x$c */
    public static class c {
        public abstract void a(StaticLayout.Builder builder, TextView textView);

        public boolean b(TextView textView) {
            return ((Boolean) C1524x.n(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C1524x(TextView textView) {
        this.f16499i = textView;
        this.f16500j = textView.getContext();
        this.f16501k = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
    }

    public static Method l(String str) {
        try {
            Method method = (Method) f16489m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f16489m.put(str, method);
            }
            return method;
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    public static Object n(Object obj, String str, Object obj2) {
        try {
            return l(str).invoke(obj, new Object[0]);
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return obj2;
        }
    }

    public final void A(float f7, float f8, float f9) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f7 + "px) is less or equal to (0px)");
        }
        if (f8 <= f7) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f8 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        }
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f9 + "px) is less or equal to (0px)");
        }
        this.f16491a = 1;
        this.f16494d = f7;
        this.f16495e = f8;
        this.f16493c = f9;
        this.f16497g = false;
    }

    public void a() {
        if (o()) {
            if (this.f16492b) {
                if (this.f16499i.getMeasuredHeight() <= 0 || this.f16499i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f16501k.b(this.f16499i) ? 1048576 : (this.f16499i.getMeasuredWidth() - this.f16499i.getTotalPaddingLeft()) - this.f16499i.getTotalPaddingRight();
                int height = (this.f16499i.getHeight() - this.f16499i.getCompoundPaddingBottom()) - this.f16499i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f16488l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float f7 = f(rectF);
                        if (f7 != this.f16499i.getTextSize()) {
                            u(0, f7);
                        }
                    } finally {
                    }
                }
            }
            this.f16492b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
        }
        return iArr2;
    }

    public final void c() {
        this.f16491a = 0;
        this.f16494d = -1.0f;
        this.f16495e = -1.0f;
        this.f16493c = -1.0f;
        this.f16496f = new int[0];
        this.f16492b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8) {
        return e(charSequence, alignment, i7, i8);
    }

    public final StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f16498h, i7);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f16499i.getLineSpacingExtra(), this.f16499i.getLineSpacingMultiplier()).setIncludePad(this.f16499i.getIncludeFontPadding()).setBreakStrategy(this.f16499i.getBreakStrategy()).setHyphenationFrequency(this.f16499i.getHyphenationFrequency());
        if (i8 == -1) {
            i8 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i8);
        try {
            this.f16501k.a(obtain, this.f16499i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    public final int f(RectF rectF) {
        int length = this.f16496f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = 1;
        int i8 = length - 1;
        int i9 = 0;
        while (i7 <= i8) {
            int i10 = (i7 + i8) / 2;
            if (y(this.f16496f[i10], rectF)) {
                int i11 = i10 + 1;
                i9 = i7;
                i7 = i11;
            } else {
                i9 = i10 - 1;
                i8 = i9;
            }
        }
        return this.f16496f[i9];
    }

    public int g() {
        return Math.round(this.f16495e);
    }

    public int h() {
        return Math.round(this.f16494d);
    }

    public int i() {
        return Math.round(this.f16493c);
    }

    public int[] j() {
        return this.f16496f;
    }

    public int k() {
        return this.f16491a;
    }

    public void m(int i7) {
        TextPaint textPaint = this.f16498h;
        if (textPaint == null) {
            this.f16498h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f16498h.set(this.f16499i.getPaint());
        this.f16498h.setTextSize(i7);
    }

    public boolean o() {
        return z() && this.f16491a != 0;
    }

    public void p(AttributeSet attributeSet, int i7) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f16500j.obtainStyledAttributes(attributeSet, AbstractC1238i.f13545U, i7, 0);
        TextView textView = this.f16499i;
        AbstractC0421s.B(textView, textView.getContext(), AbstractC1238i.f13545U, attributeSet, obtainStyledAttributes, i7, 0);
        if (obtainStyledAttributes.hasValue(AbstractC1238i.f13562Z)) {
            this.f16491a = obtainStyledAttributes.getInt(AbstractC1238i.f13562Z, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(AbstractC1238i.f13559Y) ? obtainStyledAttributes.getDimension(AbstractC1238i.f13559Y, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(AbstractC1238i.f13553W) ? obtainStyledAttributes.getDimension(AbstractC1238i.f13553W, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(AbstractC1238i.f13549V) ? obtainStyledAttributes.getDimension(AbstractC1238i.f13549V, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(AbstractC1238i.f13556X) && (resourceId = obtainStyledAttributes.getResourceId(AbstractC1238i.f13556X, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            w(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!z()) {
            this.f16491a = 0;
            return;
        }
        if (this.f16491a == 1) {
            if (!this.f16497g) {
                DisplayMetrics displayMetrics = this.f16500j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                A(dimension2, dimension3, dimension);
            }
            v();
        }
    }

    public void q(int i7, int i8, int i9, int i10) {
        if (z()) {
            DisplayMetrics displayMetrics = this.f16500j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (v()) {
                a();
            }
        }
    }

    public void r(int[] iArr, int i7) {
        if (z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f16500j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr2[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                this.f16496f = b(iArr2);
                if (!x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f16497g = false;
            }
            if (v()) {
                a();
            }
        }
    }

    public void s(int i7) {
        if (z()) {
            if (i7 == 0) {
                c();
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i7);
            }
            DisplayMetrics displayMetrics = this.f16500j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (v()) {
                a();
            }
        }
    }

    public final void t(float f7) {
        if (f7 != this.f16499i.getPaint().getTextSize()) {
            this.f16499i.getPaint().setTextSize(f7);
            boolean isInLayout = this.f16499i.isInLayout();
            if (this.f16499i.getLayout() != null) {
                this.f16492b = false;
                try {
                    Method l7 = l("nullLayouts");
                    if (l7 != null) {
                        l7.invoke(this.f16499i, new Object[0]);
                    }
                } catch (Exception e7) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (isInLayout) {
                    this.f16499i.forceLayout();
                } else {
                    this.f16499i.requestLayout();
                }
                this.f16499i.invalidate();
            }
        }
    }

    public void u(int i7, float f7) {
        Context context = this.f16500j;
        t(TypedValue.applyDimension(i7, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean v() {
        if (z() && this.f16491a == 1) {
            if (!this.f16497g || this.f16496f.length == 0) {
                int floor = ((int) Math.floor((this.f16495e - this.f16494d) / this.f16493c)) + 1;
                int[] iArr = new int[floor];
                for (int i7 = 0; i7 < floor; i7++) {
                    iArr[i7] = Math.round(this.f16494d + (i7 * this.f16493c));
                }
                this.f16496f = b(iArr);
            }
            this.f16492b = true;
        } else {
            this.f16492b = false;
        }
        return this.f16492b;
    }

    public final void w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = typedArray.getDimensionPixelSize(i7, -1);
            }
            this.f16496f = b(iArr);
            x();
        }
    }

    public final boolean x() {
        boolean z7 = this.f16496f.length > 0;
        this.f16497g = z7;
        if (z7) {
            this.f16491a = 1;
            this.f16494d = r0[0];
            this.f16495e = r0[r1 - 1];
            this.f16493c = -1.0f;
        }
        return z7;
    }

    public final boolean y(int i7, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f16499i.getText();
        TransformationMethod transformationMethod = this.f16499i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f16499i)) != null) {
            text = transformation;
        }
        int maxLines = this.f16499i.getMaxLines();
        m(i7);
        StaticLayout d7 = d(text, (Layout.Alignment) n(this.f16499i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d7.getLineCount() <= maxLines && d7.getLineEnd(d7.getLineCount() - 1) == text.length())) && ((float) d7.getHeight()) <= rectF.bottom;
    }

    public final boolean z() {
        return true;
    }
}
