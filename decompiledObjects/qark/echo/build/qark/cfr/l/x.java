/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.RectF
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.StaticLayout$Builder
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.text.TextPaint
 *  android.text.method.TransformationMethod
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.View
 *  android.widget.TextView
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 *  java.util.concurrent.ConcurrentHashMap
 */
package l;

import I.s;
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
import android.view.View;
import android.widget.TextView;
import e.i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import l.y;
import l.z;

public class x {
    public static final RectF l = new RectF();
    public static ConcurrentHashMap m = new ConcurrentHashMap();
    public static ConcurrentHashMap n = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final c k;

    /*
     * Enabled aggressive block sorting
     */
    public x(TextView object) {
        this.i = object;
        this.j = object.getContext();
        object = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
        this.k = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Method l(String string2) {
        Method method;
        Method method2;
        try {
            method2 = method = (Method)m.get((Object)string2);
            if (method != null) return method2;
        }
        catch (Exception exception) {}
        method2 = method = TextView.class.getDeclaredMethod(string2, new Class[0]);
        if (method == null) return method2;
        method.setAccessible(true);
        m.put((Object)string2, (Object)method);
        return method;
        method = new StringBuilder();
        method.append("Failed to retrieve TextView#");
        method.append(string2);
        method.append("() method");
        Log.w((String)"ACTVAutoSizeHelper", (String)method.toString(), (Throwable)exception);
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object n(Object object, String string2, Object object2) {
        try {
            object = x.l(string2).invoke(object, new Object[0]);
            return object;
        }
        catch (Exception exception) {}
        finally {
            Throwable throwable;
            throw throwable;
        }
    }

    public final void A(float f8, float f9, float f10) {
        if (f8 > 0.0f) {
            if (f9 > f8) {
                if (f10 > 0.0f) {
                    this.a = 1;
                    this.d = f8;
                    this.e = f9;
                    this.c = f10;
                    this.g = false;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The auto-size step granularity (");
                stringBuilder.append(f10);
                stringBuilder.append("px) is less or equal to (0px)");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Maximum auto-size text size (");
            stringBuilder.append(f9);
            stringBuilder.append("px) is less or equal to minimum auto-size text size (");
            stringBuilder.append(f8);
            stringBuilder.append("px)");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Minimum auto-size text size (");
        stringBuilder.append(f8);
        stringBuilder.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a() {
        if (!this.o()) {
            return;
        }
        if (this.b) {
            if (this.i.getMeasuredHeight() <= 0) return;
            if (this.i.getMeasuredWidth() <= 0) {
                return;
            }
            int n8 = this.k.b(this.i) ? 1048576 : this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft() - this.i.getTotalPaddingRight();
            int n9 = this.i.getHeight() - this.i.getCompoundPaddingBottom() - this.i.getCompoundPaddingTop();
            if (n8 <= 0) return;
            if (n9 <= 0) {
                return;
            }
            RectF rectF = l;
            // MONITORENTER : rectF
            rectF.setEmpty();
            rectF.right = n8;
            rectF.bottom = n9;
            float f8 = this.f(rectF);
            if (f8 != this.i.getTextSize()) {
                this.u(0, f8);
            }
            // MONITOREXIT : rectF
        }
        this.b = true;
        return;
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    public final int[] b(int[] arrn) {
        int n8;
        int n9 = arrn.length;
        if (n9 == 0) {
            return arrn;
        }
        Arrays.sort((int[])arrn);
        ArrayList arrayList = new ArrayList();
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            int n11 = arrn[n8];
            if (n11 <= 0 || Collections.binarySearch((List)arrayList, (Object)n11) >= 0) continue;
            arrayList.add((Object)n11);
        }
        if (n9 == arrayList.size()) {
            return arrn;
        }
        n9 = arrayList.size();
        arrn = new int[n9];
        for (n8 = n10; n8 < n9; ++n8) {
            arrn[n8] = (Integer)arrayList.get(n8);
        }
        return arrn;
    }

    public final void c() {
        this.a = 0;
        this.d = -1.0f;
        this.e = -1.0f;
        this.c = -1.0f;
        this.f = new int[0];
        this.b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int n8, int n9) {
        return this.e(charSequence, alignment, n8, n9);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int n8, int n9) {
        charSequence = StaticLayout.Builder.obtain((CharSequence)charSequence, (int)0, (int)charSequence.length(), (TextPaint)this.h, (int)n8);
        alignment = charSequence.setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
        n8 = n9;
        if (n9 == -1) {
            n8 = Integer.MAX_VALUE;
        }
        alignment.setMaxLines(n8);
        try {
            this.k.a((StaticLayout.Builder)charSequence, this.i);
            return charSequence.build();
        }
        catch (ClassCastException classCastException) {}
        Log.w((String)"ACTVAutoSizeHelper", (String)"Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        return charSequence.build();
    }

    public final int f(RectF rectF) {
        int n8 = this.f.length;
        if (n8 != 0) {
            int n9 = 1;
            int n10 = n8 - 1;
            n8 = 0;
            while (n9 <= n10) {
                int n11 = (n9 + n10) / 2;
                if (this.y(this.f[n11], rectF)) {
                    n8 = n9;
                    n9 = n11 + 1;
                    continue;
                }
                n10 = n8 = n11 - 1;
            }
            return this.f[n8];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public int g() {
        return Math.round((float)this.e);
    }

    public int h() {
        return Math.round((float)this.d);
    }

    public int i() {
        return Math.round((float)this.c);
    }

    public int[] j() {
        return this.f;
    }

    public int k() {
        return this.a;
    }

    public void m(int n8) {
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize((float)n8);
    }

    public boolean o() {
        if (this.z() && this.a != 0) {
            return true;
        }
        return false;
    }

    public void p(AttributeSet attributeSet, int n8) {
        TypedArray typedArray = this.j.obtainStyledAttributes(attributeSet, i.U, n8, 0);
        TextView textView = this.i;
        s.B((View)textView, textView.getContext(), i.U, attributeSet, typedArray, n8, 0);
        if (typedArray.hasValue(i.Z)) {
            this.a = typedArray.getInt(i.Z, 0);
        }
        float f8 = typedArray.hasValue(i.Y) ? typedArray.getDimension(i.Y, -1.0f) : -1.0f;
        float f9 = typedArray.hasValue(i.W) ? typedArray.getDimension(i.W, -1.0f) : -1.0f;
        float f10 = typedArray.hasValue(i.V) ? typedArray.getDimension(i.V, -1.0f) : -1.0f;
        if (typedArray.hasValue(i.X) && (n8 = typedArray.getResourceId(i.X, 0)) > 0) {
            attributeSet = typedArray.getResources().obtainTypedArray(n8);
            this.w((TypedArray)attributeSet);
            attributeSet.recycle();
        }
        typedArray.recycle();
        if (this.z()) {
            if (this.a == 1) {
                if (!this.g) {
                    attributeSet = this.j.getResources().getDisplayMetrics();
                    float f11 = f9;
                    if (f9 == -1.0f) {
                        f11 = TypedValue.applyDimension((int)2, (float)12.0f, (DisplayMetrics)attributeSet);
                    }
                    f9 = f10;
                    if (f10 == -1.0f) {
                        f9 = TypedValue.applyDimension((int)2, (float)112.0f, (DisplayMetrics)attributeSet);
                    }
                    f10 = f8;
                    if (f8 == -1.0f) {
                        f10 = 1.0f;
                    }
                    this.A(f11, f9, f10);
                }
                this.v();
                return;
            }
        } else {
            this.a = 0;
        }
    }

    public void q(int n8, int n9, int n10, int n11) {
        if (this.z()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            this.A(TypedValue.applyDimension((int)n11, (float)n8, (DisplayMetrics)displayMetrics), TypedValue.applyDimension((int)n11, (float)n9, (DisplayMetrics)displayMetrics), TypedValue.applyDimension((int)n11, (float)n10, (DisplayMetrics)displayMetrics));
            if (this.v()) {
                this.a();
            }
        }
    }

    public void r(int[] arrn, int n8) {
        if (this.z()) {
            int n9 = arrn.length;
            int n10 = 0;
            if (n9 > 0) {
                StringBuilder stringBuilder;
                int[] arrn2 = new int[n9];
                if (n8 == 0) {
                    stringBuilder = Arrays.copyOf((int[])arrn, (int)n9);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    do {
                        stringBuilder = arrn2;
                        if (n10 >= n9) break;
                        arrn2[n10] = Math.round((float)TypedValue.applyDimension((int)n8, (float)arrn[n10], (DisplayMetrics)displayMetrics));
                        ++n10;
                    } while (true);
                }
                this.f = this.b((int[])stringBuilder);
                if (!this.x()) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("None of the preset sizes is valid: ");
                    stringBuilder.append(Arrays.toString((int[])arrn));
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else {
                this.g = false;
            }
            if (this.v()) {
                this.a();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void s(int n8) {
        if (!this.z()) return;
        if (n8 != 0) {
            if (n8 == 1) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                this.A(TypedValue.applyDimension((int)2, (float)12.0f, (DisplayMetrics)displayMetrics), TypedValue.applyDimension((int)2, (float)112.0f, (DisplayMetrics)displayMetrics), 1.0f);
                if (!this.v()) return;
                this.a();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown auto-size text type: ");
            stringBuilder.append(n8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void t(float f8) {
        if (f8 != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f8);
            boolean bl = this.i.isInLayout();
            if (this.i.getLayout() != null) {
                this.b = false;
                try {
                    Method method = x.l("nullLayouts");
                    if (method != null) {
                        method.invoke((Object)this.i, new Object[0]);
                    }
                }
                catch (Exception exception) {
                    Log.w((String)"ACTVAutoSizeHelper", (String)"Failed to invoke TextView#nullLayouts() method", (Throwable)exception);
                }
                if (!bl) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }

    public void u(int n8, float f8) {
        Context context = this.j;
        context = context == null ? Resources.getSystem() : context.getResources();
        this.t(TypedValue.applyDimension((int)n8, (float)f8, (DisplayMetrics)context.getDisplayMetrics()));
    }

    public final boolean v() {
        boolean bl = this.z();
        if (bl && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                int n8 = (int)Math.floor((double)((this.e - this.d) / this.c)) + 1;
                int[] arrn = new int[n8];
                for (int i8 = 0; i8 < n8; ++i8) {
                    arrn[i8] = Math.round((float)(this.d + (float)i8 * this.c));
                }
                this.f = this.b(arrn);
            }
            this.b = true;
        } else {
            this.b = false;
        }
        return this.b;
    }

    public final void w(TypedArray typedArray) {
        int n8 = typedArray.length();
        int[] arrn = new int[n8];
        if (n8 > 0) {
            for (int i8 = 0; i8 < n8; ++i8) {
                arrn[i8] = typedArray.getDimensionPixelSize(i8, -1);
            }
            this.f = this.b(arrn);
            this.x();
        }
    }

    public final boolean x() {
        int[] arrn = this.f;
        int n8 = arrn.length;
        boolean bl = n8 > 0;
        this.g = bl;
        if (bl) {
            this.a = 1;
            this.d = arrn[0];
            this.e = arrn[n8 - 1];
            this.c = -1.0f;
        }
        return bl;
    }

    public final boolean y(int n8, RectF rectF) {
        CharSequence charSequence = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        CharSequence charSequence2 = charSequence;
        if (transformationMethod != null) {
            transformationMethod = transformationMethod.getTransformation(charSequence, (View)this.i);
            charSequence2 = charSequence;
            if (transformationMethod != null) {
                charSequence2 = transformationMethod;
            }
        }
        int n9 = this.i.getMaxLines();
        this.m(n8);
        charSequence = this.d(charSequence2, (Layout.Alignment)x.n((Object)this.i, "getLayoutAlignment", (Object)Layout.Alignment.ALIGN_NORMAL), Math.round((float)rectF.right), n9);
        if (n9 != -1 && (charSequence.getLineCount() > n9 || charSequence.getLineEnd(charSequence.getLineCount() - 1) != charSequence2.length())) {
            return false;
        }
        if ((float)charSequence.getHeight() > rectF.bottom) {
            return false;
        }
        return true;
    }

    public final boolean z() {
        return true;
    }

    public static class a
    extends c {
        @Override
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic)x.n((Object)textView, "getTextDirectionHeuristic", (Object)TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class b
    extends a {
        @Override
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(y.a(textView));
        }

        @Override
        public boolean b(TextView textView) {
            return z.a(textView);
        }
    }

    public static abstract class c {
        public abstract void a(StaticLayout.Builder var1, TextView var2);

        public boolean b(TextView textView) {
            return (Boolean)x.n((Object)textView, "getHorizontallyScrolling", (Object)Boolean.FALSE);
        }
    }

}

