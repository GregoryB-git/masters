package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f9320l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f9321m = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public int f9322a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9323b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f9324c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f9325d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f9326e = -1.0f;
    public int[] f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f9327g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f9328h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f9329i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f9330j;

    /* renamed from: k, reason: collision with root package name */
    public final d f9331k;

    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    public static class d extends f {
        @Override // l.e0.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) e0.e("getTextDirectionHeuristic", textView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class e extends d {
        @Override // l.e0.d, l.e0.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // l.e0.f
        public boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) e0.e("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public e0(TextView textView) {
        this.f9329i = textView;
        this.f9330j = textView.getContext();
        this.f9331k = Build.VERSION.SDK_INT >= 29 ? new e() : new d();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            Method method = f9321m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f9321m.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        if (i() && this.f9322a != 0) {
            if (this.f9323b) {
                if (this.f9329i.getMeasuredHeight() <= 0 || this.f9329i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f9331k.b(this.f9329i) ? 1048576 : (this.f9329i.getMeasuredWidth() - this.f9329i.getTotalPaddingLeft()) - this.f9329i.getTotalPaddingRight();
                int height = (this.f9329i.getHeight() - this.f9329i.getCompoundPaddingBottom()) - this.f9329i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f9320l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float c10 = c(rectF);
                    if (c10 != this.f9329i.getTextSize()) {
                        f(c10, 0);
                    }
                }
            }
            this.f9323b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 1;
        int i12 = 0;
        while (i11 <= i10) {
            int i13 = (i11 + i10) / 2;
            int i14 = this.f[i13];
            CharSequence text = this.f9329i.getText();
            TransformationMethod transformationMethod = this.f9329i.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f9329i)) != null) {
                text = transformation;
            }
            int b10 = a.b(this.f9329i);
            TextPaint textPaint = this.f9328h;
            if (textPaint == null) {
                this.f9328h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f9328h.set(this.f9329i.getPaint());
            this.f9328h.setTextSize(i14);
            StaticLayout a10 = c.a(text, (Layout.Alignment) e("getLayoutAlignment", this.f9329i, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b10, this.f9329i, this.f9328h, this.f9331k);
            if ((b10 == -1 || (a10.getLineCount() <= b10 && a10.getLineEnd(a10.getLineCount() - 1) == text.length())) && ((float) a10.getHeight()) <= rectF.bottom) {
                int i15 = i13 + 1;
                i12 = i11;
                i11 = i15;
            } else {
                i12 = i13 - 1;
                i10 = i12;
            }
        }
        return this.f[i12];
    }

    public final void f(float f10, int i10) {
        Context context = this.f9330j;
        float applyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f9329i.getPaint().getTextSize()) {
            this.f9329i.getPaint().setTextSize(applyDimension);
            boolean a10 = b.a(this.f9329i);
            if (this.f9329i.getLayout() != null) {
                this.f9323b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(this.f9329i, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (a10) {
                    this.f9329i.forceLayout();
                } else {
                    this.f9329i.requestLayout();
                }
                this.f9329i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f9322a == 1) {
            if (!this.f9327g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.f9326e - this.f9325d) / this.f9324c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f9324c) + this.f9325d);
                }
                this.f = b(iArr);
            }
            this.f9323b = true;
        } else {
            this.f9323b = false;
        }
        return this.f9323b;
    }

    public final boolean h() {
        boolean z10 = this.f.length > 0;
        this.f9327g = z10;
        if (z10) {
            this.f9322a = 1;
            this.f9325d = r0[0];
            this.f9326e = r0[r1 - 1];
            this.f9324c = -1.0f;
        }
        return z10;
    }

    public final boolean i() {
        return !(this.f9329i instanceof k);
    }

    public final void j(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f9322a = 1;
        this.f9325d = f10;
        this.f9326e = f11;
        this.f9324c = f12;
        this.f9327g = false;
    }
}
