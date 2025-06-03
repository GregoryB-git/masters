// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l;

import android.text.Layout;
import android.graphics.Paint;
import android.text.TextDirectionHeuristics;
import android.text.TextDirectionHeuristic;
import android.text.method.TransformationMethod;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.View;
import I.s;
import e.i;
import android.util.AttributeSet;
import android.text.StaticLayout$Builder;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import android.util.Log;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import android.content.Context;
import android.widget.TextView;
import android.text.TextPaint;
import java.util.concurrent.ConcurrentHashMap;
import android.graphics.RectF;

public class x
{
    public static final RectF l;
    public static ConcurrentHashMap m;
    public static ConcurrentHashMap n;
    public int a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public int[] f;
    public boolean g;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final c k;
    
    static {
        l = new RectF();
        x.m = new ConcurrentHashMap();
        x.n = new ConcurrentHashMap();
    }
    
    public x(final TextView i) {
        this.a = 0;
        this.b = false;
        this.c = -1.0f;
        this.d = -1.0f;
        this.e = -1.0f;
        this.f = new int[0];
        this.g = false;
        this.i = i;
        this.j = ((View)i).getContext();
        c k;
        if (Build$VERSION.SDK_INT >= 29) {
            k = new b();
        }
        else {
            k = new a();
        }
        this.k = k;
    }
    
    public static Method l(final String s) {
        Label_0056: {
            Method method;
            try {
                if ((method = x.m.get(s)) == null) {
                    final Method declaredMethod = TextView.class.getDeclaredMethod(s, (Class<?>[])new Class[0]);
                    if ((method = declaredMethod) != null) {
                        declaredMethod.setAccessible(true);
                        x.m.put(s, declaredMethod);
                        return declaredMethod;
                    }
                }
            }
            catch (Exception ex) {
                break Label_0056;
            }
            return method;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to retrieve TextView#");
        sb.append(s);
        sb.append("() method");
        final Exception ex;
        Log.w("ACTVAutoSizeHelper", sb.toString(), (Throwable)ex);
        return null;
    }
    
    public static Object n(Object invoke, final String str, final Object o) {
        final Throwable t;
        Label_0025: {
            try {
                invoke = l(str).invoke(invoke, new Object[0]);
                return invoke;
            }
            catch (Exception ex) {
                break Label_0025;
            }
            throw t;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to invoke TextView#");
        sb.append(str);
        sb.append("() method");
        Log.w("ACTVAutoSizeHelper", sb.toString(), t);
        return o;
    }
    
    public final void A(final float d, final float n, final float n2) {
        if (d <= 0.0f) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(d);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        }
        if (n <= d) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(n);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(d);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (n2 > 0.0f) {
            this.a = 1;
            this.d = d;
            this.e = n;
            this.c = n2;
            this.g = false;
            return;
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("The auto-size step granularity (");
        sb3.append(n2);
        sb3.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(sb3.toString());
    }
    
    public void a() {
        if (!this.o()) {
            return;
        }
        // monitorenter(l)
        while (true) {
            Label_0182: {
                if (!this.b) {
                    break Label_0182;
                }
                if (((View)this.i).getMeasuredHeight() <= 0) {
                    return;
                }
                if (((View)this.i).getMeasuredWidth() <= 0) {
                    return;
                }
                int n;
                if (this.k.b(this.i)) {
                    n = 1048576;
                }
                else {
                    n = ((View)this.i).getMeasuredWidth() - this.i.getTotalPaddingLeft() - this.i.getTotalPaddingRight();
                }
                final int n2 = ((View)this.i).getHeight() - this.i.getCompoundPaddingBottom() - this.i.getCompoundPaddingTop();
                if (n <= 0) {
                    return;
                }
                if (n2 <= 0) {
                    return;
                }
                final RectF l = x.l;
                try {
                    l.setEmpty();
                    l.right = (float)n;
                    l.bottom = (float)n2;
                    final float n3 = (float)this.f(l);
                    if (n3 != this.i.getTextSize()) {
                        this.u(0, n3);
                    }
                    // monitorexit(l)
                    this.b = true;
                    return;
                }
                // monitorexit(l)
                finally {}
            }
            continue;
        }
    }
    
    public final int[] b(int[] a) {
        final int length = a.length;
        if (length == 0) {
            return a;
        }
        Arrays.sort(a);
        final ArrayList<Comparable<? super Integer>> list = new ArrayList<Comparable<? super Integer>>();
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            final int n2 = a[i];
            if (n2 > 0 && Collections.binarySearch(list, n2) < 0) {
                list.add(n2);
            }
        }
        if (length == list.size()) {
            return a;
        }
        final int size = list.size();
        a = new int[size];
        for (int j = n; j < size; ++j) {
            a[j] = list.get(j);
        }
        return a;
    }
    
    public final void c() {
        this.a = 0;
        this.d = -1.0f;
        this.e = -1.0f;
        this.c = -1.0f;
        this.f = new int[0];
        this.b = false;
    }
    
    public StaticLayout d(final CharSequence charSequence, final Layout$Alignment layout$Alignment, final int n, final int n2) {
        return this.e(charSequence, layout$Alignment, n, n2);
    }
    
    public final StaticLayout e(CharSequence obtain, final Layout$Alignment alignment, int maxLines, final int n) {
        obtain = (CharSequence)StaticLayout$Builder.obtain(obtain, 0, obtain.length(), this.h, maxLines);
        final StaticLayout$Builder setHyphenationFrequency = ((StaticLayout$Builder)obtain).setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
        maxLines = n;
        if (n == -1) {
            maxLines = Integer.MAX_VALUE;
        }
        setHyphenationFrequency.setMaxLines(maxLines);
        while (true) {
            try {
                this.k.a((StaticLayout$Builder)obtain, this.i);
                return ((StaticLayout$Builder)obtain).build();
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                return ((StaticLayout$Builder)obtain).build();
            }
            catch (ClassCastException ex) {}
            continue;
        }
    }
    
    public final int f(final RectF rectF) {
        final int length = this.f.length;
        if (length != 0) {
            int i = 1;
            int n = length - 1;
            int n2 = 0;
            while (i <= n) {
                final int n3 = (i + n) / 2;
                if (this.y(this.f[n3], rectF)) {
                    n2 = i;
                    i = n3 + 1;
                }
                else {
                    n2 = (n = n3 - 1);
                }
            }
            return this.f[n2];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }
    
    public int g() {
        return Math.round(this.e);
    }
    
    public int h() {
        return Math.round(this.d);
    }
    
    public int i() {
        return Math.round(this.c);
    }
    
    public int[] j() {
        return this.f;
    }
    
    public int k() {
        return this.a;
    }
    
    public void m(final int n) {
        final TextPaint h = this.h;
        if (h == null) {
            this.h = new TextPaint();
        }
        else {
            ((Paint)h).reset();
        }
        this.h.set(this.i.getPaint());
        ((Paint)this.h).setTextSize((float)n);
    }
    
    public boolean o() {
        return this.z() && this.a != 0;
    }
    
    public void p(final AttributeSet set, int resourceId) {
        final TypedArray obtainStyledAttributes = this.j.obtainStyledAttributes(set, e.i.U, resourceId, 0);
        final TextView i = this.i;
        s.B((View)i, ((View)i).getContext(), e.i.U, set, obtainStyledAttributes, resourceId, 0);
        if (obtainStyledAttributes.hasValue(e.i.Z)) {
            this.a = obtainStyledAttributes.getInt(e.i.Z, 0);
        }
        float dimension;
        if (obtainStyledAttributes.hasValue(e.i.Y)) {
            dimension = obtainStyledAttributes.getDimension(e.i.Y, -1.0f);
        }
        else {
            dimension = -1.0f;
        }
        float dimension2;
        if (obtainStyledAttributes.hasValue(e.i.W)) {
            dimension2 = obtainStyledAttributes.getDimension(e.i.W, -1.0f);
        }
        else {
            dimension2 = -1.0f;
        }
        float dimension3;
        if (obtainStyledAttributes.hasValue(e.i.V)) {
            dimension3 = obtainStyledAttributes.getDimension(e.i.V, -1.0f);
        }
        else {
            dimension3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(e.i.X)) {
            resourceId = obtainStyledAttributes.getResourceId(e.i.X, 0);
            if (resourceId > 0) {
                final TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                this.w(obtainTypedArray);
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (this.z()) {
            if (this.a == 1) {
                if (!this.g) {
                    final DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    float applyDimension = dimension2;
                    if (dimension2 == -1.0f) {
                        applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    float applyDimension2 = dimension3;
                    if (dimension3 == -1.0f) {
                        applyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    float n = dimension;
                    if (dimension == -1.0f) {
                        n = 1.0f;
                    }
                    this.A(applyDimension, applyDimension2, n);
                }
                this.v();
            }
        }
        else {
            this.a = 0;
        }
    }
    
    public void q(final int n, final int n2, final int n3, final int n4) {
        if (this.z()) {
            final DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            this.A(TypedValue.applyDimension(n4, (float)n, displayMetrics), TypedValue.applyDimension(n4, (float)n2, displayMetrics), TypedValue.applyDimension(n4, (float)n3, displayMetrics));
            if (this.v()) {
                this.a();
            }
        }
    }
    
    public void r(final int[] array, final int n) {
        if (this.z()) {
            final int length = array.length;
            int n2 = 0;
            if (length > 0) {
                final int[] array2 = new int[length];
                int[] copy;
                if (n == 0) {
                    copy = Arrays.copyOf(array, length);
                }
                else {
                    final DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    while (true) {
                        copy = array2;
                        if (n2 >= length) {
                            break;
                        }
                        array2[n2] = Math.round(TypedValue.applyDimension(n, (float)array[n2], displayMetrics));
                        ++n2;
                    }
                }
                this.f = this.b(copy);
                if (!this.x()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(array));
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            else {
                this.g = false;
            }
            if (this.v()) {
                this.a();
            }
        }
    }
    
    public void s(final int i) {
        if (this.z()) {
            if (i != 0) {
                if (i != 1) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown auto-size text type: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                final DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                this.A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (this.v()) {
                    this.a();
                }
            }
            else {
                this.c();
            }
        }
    }
    
    public final void t(final float textSize) {
        if (textSize != ((Paint)this.i.getPaint()).getTextSize()) {
            ((Paint)this.i.getPaint()).setTextSize(textSize);
            final boolean inLayout = ((View)this.i).isInLayout();
            if (this.i.getLayout() != null) {
                this.b = false;
                try {
                    final Method l = l("nullLayouts");
                    if (l != null) {
                        l.invoke(this.i, new Object[0]);
                    }
                }
                catch (Exception ex) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", (Throwable)ex);
                }
                if (!inLayout) {
                    ((View)this.i).requestLayout();
                }
                else {
                    ((View)this.i).forceLayout();
                }
                ((View)this.i).invalidate();
            }
        }
    }
    
    public void u(final int n, final float n2) {
        final Context j = this.j;
        Resources resources;
        if (j == null) {
            resources = Resources.getSystem();
        }
        else {
            resources = j.getResources();
        }
        this.t(TypedValue.applyDimension(n, n2, resources.getDisplayMetrics()));
    }
    
    public final boolean v() {
        final boolean z = this.z();
        int i = 0;
        if (z && this.a == 1) {
            if (!this.g || this.f.length == 0) {
                final int n = (int)Math.floor((this.e - this.d) / this.c) + 1;
                final int[] array = new int[n];
                while (i < n) {
                    array[i] = Math.round(this.d + i * this.c);
                    ++i;
                }
                this.f = this.b(array);
            }
            this.b = true;
        }
        else {
            this.b = false;
        }
        return this.b;
    }
    
    public final void w(final TypedArray typedArray) {
        final int length = typedArray.length();
        final int[] array = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; ++i) {
                array[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f = this.b(array);
            this.x();
        }
    }
    
    public final boolean x() {
        final int[] f = this.f;
        final int length = f.length;
        final boolean g = length > 0;
        this.g = g;
        if (g) {
            this.a = 1;
            this.d = (float)f[0];
            this.e = (float)f[length - 1];
            this.c = -1.0f;
        }
        return g;
    }
    
    public final boolean y(final int n, final RectF rectF) {
        final CharSequence text = this.i.getText();
        final TransformationMethod transformationMethod = this.i.getTransformationMethod();
        CharSequence charSequence = text;
        if (transformationMethod != null) {
            final CharSequence transformation = transformationMethod.getTransformation(text, (View)this.i);
            charSequence = text;
            if (transformation != null) {
                charSequence = transformation;
            }
        }
        final int maxLines = this.i.getMaxLines();
        this.m(n);
        final StaticLayout d = this.d(charSequence, (Layout$Alignment)n(this.i, "getLayoutAlignment", Layout$Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d.getLineCount() <= maxLines && ((Layout)d).getLineEnd(d.getLineCount() - 1) == charSequence.length())) && ((Layout)d).getHeight() <= rectF.bottom;
    }
    
    public final boolean z() {
        return true;
    }
    
    public static class a extends c
    {
        @Override
        public void a(final StaticLayout$Builder staticLayout$Builder, final TextView textView) {
            staticLayout$Builder.setTextDirection((TextDirectionHeuristic)x.n(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }
    
    public static class b extends a
    {
        @Override
        public void a(final StaticLayout$Builder staticLayout$Builder, final TextView textView) {
            staticLayout$Builder.setTextDirection(y.a(textView));
        }
        
        @Override
        public boolean b(final TextView textView) {
            return z.a(textView);
        }
    }
    
    public abstract static class c
    {
        public abstract void a(final StaticLayout$Builder p0, final TextView p1);
        
        public boolean b(final TextView textView) {
            return (boolean)x.n(textView, "getHorizontallyScrolling", Boolean.FALSE);
        }
    }
}
