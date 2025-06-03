// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u1;

import android.graphics.PathMeasure;
import android.graphics.Path;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.content.res.Resources$NotFoundException;
import android.animation.AnimatorInflater;
import android.os.Build$VERSION;
import android.util.TypedValue;
import android.animation.TypeEvaluator;
import android.view.InflateException;
import A.g;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.content.res.TypedArray;
import java.util.Iterator;
import java.util.ArrayList;
import z.k;
import android.animation.ValueAnimator;
import android.util.AttributeSet;
import android.animation.AnimatorSet;
import android.util.Xml;
import android.animation.Animator;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.Context;

public abstract class d
{
    public static Animator a(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final float n) {
        return b(context, resources, resources$Theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, n);
    }
    
    public static Animator b(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final AttributeSet set, final AnimatorSet set2, final int n, final float n2) {
        final int depth = xmlPullParser.getDepth();
        Object o = null;
        ArrayList<ValueAnimator> list = null;
        while (true) {
            final int next = xmlPullParser.next();
            final int n3 = 0;
            boolean b = false;
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                if (set2 != null && list != null) {
                    final Animator[] array = new Animator[list.size()];
                    final Iterator<ValueAnimator> iterator = list.iterator();
                    int n4 = n3;
                    while (iterator.hasNext()) {
                        array[n4] = (Animator)iterator.next();
                        ++n4;
                    }
                    if (n == 0) {
                        set2.playTogether(array);
                        return (Animator)o;
                    }
                    set2.playSequentially(array);
                }
                return (Animator)o;
            }
            if (next != 2) {
                continue;
            }
            final String name = xmlPullParser.getName();
            Object e;
            if (name.equals("objectAnimator")) {
                e = n(context, resources, resources$Theme, set, n2, xmlPullParser);
            }
            else if (name.equals("animator")) {
                e = l(context, resources, resources$Theme, set, null, n2, xmlPullParser);
            }
            else if (name.equals("set")) {
                e = new AnimatorSet();
                final TypedArray k = z.k.k(resources, resources$Theme, set, u1.a.h);
                b(context, resources, resources$Theme, xmlPullParser, set, (AnimatorSet)e, z.k.g(k, xmlPullParser, "ordering", 0, 0), n2);
                k.recycle();
            }
            else {
                if (!name.equals("propertyValuesHolder")) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unknown animator name: ");
                    sb.append(xmlPullParser.getName());
                    throw new RuntimeException(sb.toString());
                }
                final PropertyValuesHolder[] p8 = p(context, resources, resources$Theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                if (p8 != null && o instanceof ValueAnimator) {
                    ((ValueAnimator)o).setValues(p8);
                }
                b = true;
                e = o;
            }
            o = e;
            if (set2 == null) {
                continue;
            }
            o = e;
            if (b) {
                continue;
            }
            ArrayList<ValueAnimator> list2;
            if ((list2 = list) == null) {
                list2 = new ArrayList<ValueAnimator>();
            }
            list2.add((ValueAnimator)e);
            o = e;
            list = list2;
        }
    }
    
    public static Keyframe c(final Keyframe keyframe, final float n) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(n);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(n);
        }
        return Keyframe.ofObject(n);
    }
    
    public static void d(final Keyframe[] array, float n, int i, final int n2) {
        n /= n2 - i + 2;
        while (i <= n2) {
            array[i].setFraction(array[i - 1].getFraction() + n);
            ++i;
        }
    }
    
    public static PropertyValuesHolder e(final TypedArray typedArray, int n, int n2, final int n3, final String s) {
        final TypedValue peekValue = typedArray.peekValue(n2);
        final boolean b = peekValue != null;
        int type;
        if (b) {
            type = peekValue.type;
        }
        else {
            type = 0;
        }
        final TypedValue peekValue2 = typedArray.peekValue(n3);
        final boolean b2 = peekValue2 != null;
        int type2;
        if (b2) {
            type2 = peekValue2.type;
        }
        else {
            type2 = 0;
        }
        int n4 = n;
        if (n == 4) {
            if ((b && h(type)) || (b2 && h(type2))) {
                n4 = 3;
            }
            else {
                n4 = 0;
            }
        }
        if (n4 == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        final PropertyValuesHolder propertyValuesHolder = null;
        final PropertyValuesHolder propertyValuesHolder2 = null;
        PropertyValuesHolder propertyValuesHolder3;
        if (n4 == 2) {
            final String string = typedArray.getString(n2);
            final String string2 = typedArray.getString(n3);
            final g.b[] d = g.d(string);
            final g.b[] d2 = g.d(string2);
            if (d == null) {
                propertyValuesHolder3 = propertyValuesHolder;
                if (d2 == null) {
                    return propertyValuesHolder3;
                }
            }
            if (d != null) {
                final a a = new a();
                PropertyValuesHolder propertyValuesHolder4;
                if (d2 != null) {
                    if (!g.b(d, d2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(" Can't morph from ");
                        sb.append(string);
                        sb.append(" to ");
                        sb.append(string2);
                        throw new InflateException(sb.toString());
                    }
                    propertyValuesHolder4 = PropertyValuesHolder.ofObject(s, (TypeEvaluator)a, new Object[] { d, d2 });
                }
                else {
                    propertyValuesHolder4 = PropertyValuesHolder.ofObject(s, (TypeEvaluator)a, new Object[] { d });
                }
                return propertyValuesHolder4;
            }
            propertyValuesHolder3 = propertyValuesHolder;
            if (d2 != null) {
                return PropertyValuesHolder.ofObject(s, (TypeEvaluator)new a(), new Object[] { d2 });
            }
        }
        else {
            Object a2;
            if (n4 == 3) {
                a2 = e.a();
            }
            else {
                a2 = null;
            }
            PropertyValuesHolder propertyValuesHolder6;
            if (n != 0) {
                PropertyValuesHolder propertyValuesHolder5;
                if (b) {
                    float n5;
                    if (type == 5) {
                        n5 = typedArray.getDimension(n2, 0.0f);
                    }
                    else {
                        n5 = typedArray.getFloat(n2, 0.0f);
                    }
                    if (b2) {
                        float n6;
                        if (type2 == 5) {
                            n6 = typedArray.getDimension(n3, 0.0f);
                        }
                        else {
                            n6 = typedArray.getFloat(n3, 0.0f);
                        }
                        propertyValuesHolder5 = PropertyValuesHolder.ofFloat(s, new float[] { n5, n6 });
                    }
                    else {
                        propertyValuesHolder5 = PropertyValuesHolder.ofFloat(s, new float[] { n5 });
                    }
                }
                else {
                    float n7;
                    if (type2 == 5) {
                        n7 = typedArray.getDimension(n3, 0.0f);
                    }
                    else {
                        n7 = typedArray.getFloat(n3, 0.0f);
                    }
                    propertyValuesHolder5 = PropertyValuesHolder.ofFloat(s, new float[] { n7 });
                }
                propertyValuesHolder6 = propertyValuesHolder5;
            }
            else if (b) {
                if (type == 5) {
                    n = (int)typedArray.getDimension(n2, 0.0f);
                }
                else if (h(type)) {
                    n = typedArray.getColor(n2, 0);
                }
                else {
                    n = typedArray.getInt(n2, 0);
                }
                if (b2) {
                    if (type2 == 5) {
                        n2 = (int)typedArray.getDimension(n3, 0.0f);
                    }
                    else if (h(type2)) {
                        n2 = typedArray.getColor(n3, 0);
                    }
                    else {
                        n2 = typedArray.getInt(n3, 0);
                    }
                    propertyValuesHolder6 = PropertyValuesHolder.ofInt(s, new int[] { n, n2 });
                }
                else {
                    propertyValuesHolder6 = PropertyValuesHolder.ofInt(s, new int[] { n });
                }
            }
            else {
                propertyValuesHolder6 = propertyValuesHolder2;
                if (b2) {
                    if (type2 == 5) {
                        n = (int)typedArray.getDimension(n3, 0.0f);
                    }
                    else if (h(type2)) {
                        n = typedArray.getColor(n3, 0);
                    }
                    else {
                        n = typedArray.getInt(n3, 0);
                    }
                    propertyValuesHolder6 = PropertyValuesHolder.ofInt(s, new int[] { n });
                }
            }
            if ((propertyValuesHolder3 = propertyValuesHolder6) != null) {
                propertyValuesHolder3 = propertyValuesHolder6;
                if (a2 != null) {
                    propertyValuesHolder6.setEvaluator((TypeEvaluator)a2);
                    propertyValuesHolder3 = propertyValuesHolder6;
                }
            }
        }
        return propertyValuesHolder3;
    }
    
    public static int f(final TypedArray typedArray, int n, int n2) {
        final TypedValue peekValue = typedArray.peekValue(n);
        final int n3 = 1;
        final int n4 = 0;
        if (peekValue != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        int type;
        if (n != 0) {
            type = peekValue.type;
        }
        else {
            type = 0;
        }
        final TypedValue peekValue2 = typedArray.peekValue(n2);
        if (peekValue2 != null) {
            n2 = n3;
        }
        else {
            n2 = 0;
        }
        int type2;
        if (n2 != 0) {
            type2 = peekValue2.type;
        }
        else {
            type2 = 0;
        }
        if (n == 0 || !h(type)) {
            n = n4;
            if (n2 == 0) {
                return n;
            }
            n = n4;
            if (!h(type2)) {
                return n;
            }
        }
        n = 3;
        return n;
    }
    
    public static int g(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final XmlPullParser xmlPullParser) {
        final TypedArray k = z.k.k(resources, resources$Theme, set, u1.a.j);
        final boolean b = false;
        final TypedValue l = z.k.l(k, xmlPullParser, "value", 0);
        int n = b ? 1 : 0;
        if (l != null) {
            n = (b ? 1 : 0);
            if (h(l.type)) {
                n = 3;
            }
        }
        k.recycle();
        return n;
    }
    
    public static boolean h(final int n) {
        return n >= 28 && n <= 31;
    }
    
    public static Animator i(final Context context, final int n) {
        if (Build$VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, n);
        }
        return j(context, context.getResources(), context.getTheme(), n);
    }
    
    public static Animator j(final Context context, final Resources resources, final Resources$Theme resources$Theme, final int n) {
        return k(context, resources, resources$Theme, n, 1.0f);
    }
    
    public static Animator k(final Context context, final Resources resources, final Resources$Theme resources$Theme, final int i, final float n) {
        XmlResourceParser animation = null;
        try {
            try {
                final XmlResourceParser xmlResourceParser2;
                final XmlResourceParser xmlResourceParser = xmlResourceParser2 = (animation = resources.getAnimation(i));
                final Animator a = a(context, resources, resources$Theme, (XmlPullParser)xmlResourceParser, n);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                return a;
            }
            finally {
                if (animation != null) {
                    animation.close();
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Can't load animation resource ID #0x");
                sb.append(Integer.toHexString(i));
                final Resources$NotFoundException ex = new Resources$NotFoundException(sb.toString());
                final IOException cause;
                ((Throwable)ex).initCause(cause);
                throw ex;
            }
        }
        catch (IOException ex2) {}
        catch (XmlPullParserException ex3) {}
    }
    
    public static ValueAnimator l(final Context context, final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final ValueAnimator valueAnimator, final float n, final XmlPullParser xmlPullParser) {
        final TypedArray k = z.k.k(resources, resources$Theme, set, u1.a.g);
        final TypedArray i = z.k.k(resources, resources$Theme, set, u1.a.k);
        ValueAnimator valueAnimator2 = valueAnimator;
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        }
        q(valueAnimator2, k, i, n, xmlPullParser);
        final int h = z.k.h(k, xmlPullParser, "interpolator", 0, 0);
        if (h > 0) {
            valueAnimator2.setInterpolator((TimeInterpolator)c.a(context, h));
        }
        k.recycle();
        if (i != null) {
            i.recycle();
        }
        return valueAnimator2;
    }
    
    public static Keyframe m(final Context context, final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, int h, final XmlPullParser xmlPullParser) {
        final TypedArray k = z.k.k(resources, resources$Theme, set, u1.a.j);
        final float f = z.k.f(k, xmlPullParser, "fraction", 3, -1.0f);
        final TypedValue l = z.k.l(k, xmlPullParser, "value", 0);
        final boolean b = l != null;
        int n = h;
        if (h == 4) {
            if (b && h(l.type)) {
                n = 3;
            }
            else {
                n = 0;
            }
        }
        Keyframe keyframe;
        if (b) {
            if (n != 0) {
                if (n != 1 && n != 3) {
                    keyframe = null;
                }
                else {
                    keyframe = Keyframe.ofInt(f, z.k.g(k, xmlPullParser, "value", 0, 0));
                }
            }
            else {
                keyframe = Keyframe.ofFloat(f, z.k.f(k, xmlPullParser, "value", 0, 0.0f));
            }
        }
        else if (n == 0) {
            keyframe = Keyframe.ofFloat(f);
        }
        else {
            keyframe = Keyframe.ofInt(f);
        }
        h = z.k.h(k, xmlPullParser, "interpolator", 1, 0);
        if (h > 0) {
            keyframe.setInterpolator((TimeInterpolator)c.a(context, h));
        }
        k.recycle();
        return keyframe;
    }
    
    public static ObjectAnimator n(final Context context, final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final float n, final XmlPullParser xmlPullParser) {
        final ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, resources$Theme, set, (ValueAnimator)objectAnimator, n, xmlPullParser);
        return objectAnimator;
    }
    
    public static PropertyValuesHolder o(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final String s, int i) {
        final PropertyValuesHolder propertyValuesHolder = null;
        ArrayList<Keyframe> list = null;
        int n = i;
        while (true) {
            i = xmlPullParser.next();
            if (i == 3 || i == 1) {
                break;
            }
            if (!xmlPullParser.getName().equals("keyframe")) {
                continue;
            }
            if ((i = n) == 4) {
                i = g(resources, resources$Theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
            }
            final Keyframe m = m(context, resources, resources$Theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
            ArrayList<Keyframe> list2 = list;
            if (m != null) {
                if ((list2 = list) == null) {
                    list2 = new ArrayList<Keyframe>();
                }
                list2.add(m);
            }
            xmlPullParser.next();
            list = list2;
            n = i;
        }
        PropertyValuesHolder ofKeyframe = propertyValuesHolder;
        if (list != null) {
            final int size = list.size();
            ofKeyframe = propertyValuesHolder;
            if (size > 0) {
                final int n2 = 0;
                final Keyframe keyframe = list.get(0);
                final Keyframe keyframe2 = list.get(size - 1);
                final float fraction = keyframe2.getFraction();
                i = size;
                if (fraction < 1.0f) {
                    if (fraction < 0.0f) {
                        keyframe2.setFraction(1.0f);
                        i = size;
                    }
                    else {
                        list.add(list.size(), c(keyframe2, 1.0f));
                        i = size + 1;
                    }
                }
                final float fraction2 = keyframe.getFraction();
                int n3 = i;
                if (fraction2 != 0.0f) {
                    if (fraction2 < 0.0f) {
                        keyframe.setFraction(0.0f);
                        n3 = i;
                    }
                    else {
                        list.add(0, c(keyframe, 0.0f));
                        n3 = i + 1;
                    }
                }
                final Keyframe[] a = new Keyframe[n3];
                list.toArray(a);
                Keyframe keyframe3;
                int n4;
                int n5;
                int n6;
                for (i = n2; i < n3; ++i) {
                    keyframe3 = a[i];
                    if (keyframe3.getFraction() < 0.0f) {
                        if (i == 0) {
                            keyframe3.setFraction(0.0f);
                        }
                        else {
                            n4 = n3 - 1;
                            if (i == n4) {
                                keyframe3.setFraction(1.0f);
                            }
                            else {
                                n5 = i + 1;
                                n6 = i;
                                while (n5 < n4 && a[n5].getFraction() < 0.0f) {
                                    n6 = n5;
                                    ++n5;
                                }
                                d(a, a[n6 + 1].getFraction() - a[i - 1].getFraction(), i, n6);
                            }
                        }
                    }
                }
                final PropertyValuesHolder propertyValuesHolder2 = ofKeyframe = PropertyValuesHolder.ofKeyframe(s, a);
                if (n == 3) {
                    propertyValuesHolder2.setEvaluator((TypeEvaluator)e.a());
                    ofKeyframe = propertyValuesHolder2;
                }
            }
        }
        return ofKeyframe;
    }
    
    public static PropertyValuesHolder[] p(final Context context, final Resources resources, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser, final AttributeSet set) {
        final PropertyValuesHolder[] array = null;
        ArrayList<PropertyValuesHolder> list = null;
        int index;
        while (true) {
            final int eventType = xmlPullParser.getEventType();
            index = 0;
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    final TypedArray k = z.k.k(resources, resources$Theme, set, u1.a.i);
                    final String i = z.k.i(k, xmlPullParser, "propertyName", 3);
                    final int g = z.k.g(k, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder e;
                    if ((e = o(context, resources, resources$Theme, xmlPullParser, i, g)) == null) {
                        e = e(k, g, 0, 1, i);
                    }
                    ArrayList<PropertyValuesHolder> list2 = list;
                    if (e != null) {
                        if ((list2 = list) == null) {
                            list2 = new ArrayList<PropertyValuesHolder>();
                        }
                        list2.add(e);
                    }
                    k.recycle();
                    list = list2;
                }
            }
            xmlPullParser.next();
        }
        PropertyValuesHolder[] array2 = array;
        if (list != null) {
            final int size = list.size();
            final PropertyValuesHolder[] array3 = new PropertyValuesHolder[size];
            while (true) {
                array2 = array3;
                if (index >= size) {
                    break;
                }
                array3[index] = list.get(index);
                ++index;
            }
        }
        return array2;
    }
    
    public static void q(final ValueAnimator valueAnimator, final TypedArray typedArray, final TypedArray typedArray2, final float n, final XmlPullParser xmlPullParser) {
        final long duration = k.g(typedArray, xmlPullParser, "duration", 1, 300);
        final long startDelay = k.g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int g;
        final int n2 = g = k.g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (k.j(xmlPullParser, "valueFrom")) {
            g = n2;
            if (k.j(xmlPullParser, "valueTo")) {
                int f;
                if ((f = n2) == 4) {
                    f = f(typedArray, 5, 6);
                }
                final PropertyValuesHolder e = e(typedArray, f, 5, 6, "");
                g = f;
                if (e != null) {
                    valueAnimator.setValues(new PropertyValuesHolder[] { e });
                    g = f;
                }
            }
        }
        valueAnimator.setDuration(duration);
        valueAnimator.setStartDelay(startDelay);
        valueAnimator.setRepeatCount(k.g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(k.g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, g, n, xmlPullParser);
        }
    }
    
    public static void r(final ValueAnimator valueAnimator, final TypedArray typedArray, final int n, final float n2, final XmlPullParser xmlPullParser) {
        final ObjectAnimator objectAnimator = (ObjectAnimator)valueAnimator;
        final String i = k.i(typedArray, xmlPullParser, "pathData", 1);
        if (i == null) {
            objectAnimator.setPropertyName(k.i(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        final String j = k.i(typedArray, xmlPullParser, "propertyXName", 2);
        final String k = z.k.i(typedArray, xmlPullParser, "propertyYName", 3);
        if (n != 2) {}
        if (j == null && k == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append(" propertyXName or propertyYName is needed for PathData");
            throw new InflateException(sb.toString());
        }
        s(g.e(i), objectAnimator, n2 * 0.5f, j, k);
    }
    
    public static void s(final Path path, final ObjectAnimator objectAnimator, float n, final String s, final String s2) {
        final PathMeasure pathMeasure = new PathMeasure(path, false);
        final ArrayList<Float> list = new ArrayList<Float>();
        final float n2 = 0.0f;
        list.add(0.0f);
        float n3 = 0.0f;
        float f;
        do {
            f = n3 + pathMeasure.getLength();
            list.add(f);
            n3 = f;
        } while (pathMeasure.nextContour());
        final PathMeasure pathMeasure2 = new PathMeasure(path, false);
        final int min = Math.min(100, (int)(f / n) + 1);
        final float[] array = new float[min];
        final float[] array2 = new float[min];
        final float[] array3 = new float[2];
        final float n4 = f / (min - 1);
        int index;
        int n5 = index = 0;
        n = n2;
        PropertyValuesHolder propertyValuesHolder;
        while (true) {
            propertyValuesHolder = null;
            if (n5 >= min) {
                break;
            }
            pathMeasure2.getPosTan(n - list.get(index), array3, (float[])null);
            array[n5] = array3[0];
            array2[n5] = array3[1];
            n += n4;
            final int index2 = index + 1;
            int n6 = index;
            if (index2 < list.size()) {
                n6 = index;
                if (n > list.get(index2)) {
                    pathMeasure2.nextContour();
                    n6 = index2;
                }
            }
            ++n5;
            index = n6;
        }
        PropertyValuesHolder ofFloat;
        if (s != null) {
            ofFloat = PropertyValuesHolder.ofFloat(s, array);
        }
        else {
            ofFloat = null;
        }
        PropertyValuesHolder ofFloat2 = propertyValuesHolder;
        if (s2 != null) {
            ofFloat2 = PropertyValuesHolder.ofFloat(s2, array2);
        }
        if (ofFloat == null) {
            ((ValueAnimator)objectAnimator).setValues(new PropertyValuesHolder[] { ofFloat2 });
            return;
        }
        if (ofFloat2 == null) {
            ((ValueAnimator)objectAnimator).setValues(new PropertyValuesHolder[] { ofFloat });
            return;
        }
        ((ValueAnimator)objectAnimator).setValues(new PropertyValuesHolder[] { ofFloat, ofFloat2 });
    }
    
    public static class a implements TypeEvaluator
    {
        public g.b[] a;
        
        public g.b[] a(final float n, final g.b[] array, final g.b[] array2) {
            if (g.b(array, array2)) {
                if (!g.b(this.a, array)) {
                    this.a = g.f(array);
                }
                for (int i = 0; i < array.length; ++i) {
                    this.a[i].d(array[i], array2[i], n);
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }
}
