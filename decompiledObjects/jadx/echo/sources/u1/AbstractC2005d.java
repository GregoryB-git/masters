package u1;

import A.g;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z.k;

/* renamed from: u1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2005d {

    /* renamed from: u1.d$a */
    public static class a implements TypeEvaluator {

        /* renamed from: a, reason: collision with root package name */
        public g.b[] f19689a;

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g.b[] evaluate(float f7, g.b[] bVarArr, g.b[] bVarArr2) {
            if (!A.g.b(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!A.g.b(this.f19689a, bVarArr)) {
                this.f19689a = A.g.f(bVarArr);
            }
            for (int i7 = 0; i7 < bVarArr.length; i7++) {
                this.f19689a[i7].d(bVarArr[i7], bVarArr2[i7], f7);
            }
            return this.f19689a;
        }
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f7) {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.AbstractC2005d.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe c(Keyframe keyframe, float f7) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f7) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f7) : Keyframe.ofObject(f7);
    }

    public static void d(Keyframe[] keyframeArr, float f7, int i7, int i8) {
        float f8 = f7 / ((i8 - i7) + 2);
        while (i7 <= i8) {
            keyframeArr[i7].setFraction(keyframeArr[i7 - 1].getFraction() + f8);
            i7++;
        }
    }

    public static PropertyValuesHolder e(TypedArray typedArray, int i7, int i8, int i9, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i8);
        boolean z7 = peekValue != null;
        int i10 = z7 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i9);
        boolean z8 = peekValue2 != null;
        int i11 = z8 ? peekValue2.type : 0;
        if (i7 == 4) {
            i7 = ((z7 && h(i10)) || (z8 && h(i11))) ? 3 : 0;
        }
        boolean z9 = i7 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i7 != 2) {
            C2006e a7 = i7 == 3 ? C2006e.a() : null;
            if (z9) {
                if (z7) {
                    float dimension = i10 == 5 ? typedArray.getDimension(i8, 0.0f) : typedArray.getFloat(i8, 0.0f);
                    if (z8) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i11 == 5 ? typedArray.getDimension(i9, 0.0f) : typedArray.getFloat(i9, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z7) {
                int dimension2 = i10 == 5 ? (int) typedArray.getDimension(i8, 0.0f) : h(i10) ? typedArray.getColor(i8, 0) : typedArray.getInt(i8, 0);
                if (z8) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : h(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z8) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i11 == 5 ? (int) typedArray.getDimension(i9, 0.0f) : h(i11) ? typedArray.getColor(i9, 0) : typedArray.getInt(i9, 0));
            }
            if (propertyValuesHolder == null || a7 == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(a7);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i8);
        String string2 = typedArray.getString(i9);
        g.b[] d7 = A.g.d(string);
        g.b[] d8 = A.g.d(string2);
        if (d7 == null && d8 == null) {
            return null;
        }
        if (d7 == null) {
            if (d8 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), d8);
            }
            return null;
        }
        a aVar = new a();
        if (d8 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, d7);
        } else {
            if (!A.g.b(d7, d8)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, aVar, d7, d8);
        }
        return ofObject;
    }

    public static int f(TypedArray typedArray, int i7, int i8) {
        TypedValue peekValue = typedArray.peekValue(i7);
        boolean z7 = peekValue != null;
        int i9 = z7 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i8);
        boolean z8 = peekValue2 != null;
        return ((z7 && h(i9)) || (z8 && h(z8 ? peekValue2.type : 0))) ? 3 : 0;
    }

    public static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k7 = k.k(resources, theme, attributeSet, AbstractC2002a.f19673j);
        int i7 = 0;
        TypedValue l7 = k.l(k7, xmlPullParser, "value", 0);
        if (l7 != null && h(l7.type)) {
            i7 = 3;
        }
        k7.recycle();
        return i7;
    }

    public static boolean h(int i7) {
        return i7 >= 28 && i7 <= 31;
    }

    public static Animator i(Context context, int i7) {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i7) : j(context, context.getResources(), context.getTheme(), i7);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i7) {
        return k(context, resources, theme, i7, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i7, float f7) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i7);
                    return a(context, resources, theme, xmlResourceParser, f7);
                } catch (XmlPullParserException e7) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i7));
                    notFoundException.initCause(e7);
                    throw notFoundException;
                }
            } catch (IOException e8) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i7));
                notFoundException2.initCause(e8);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    public static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f7, XmlPullParser xmlPullParser) {
        TypedArray k7 = k.k(resources, theme, attributeSet, AbstractC2002a.f19670g);
        TypedArray k8 = k.k(resources, theme, attributeSet, AbstractC2002a.f19674k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        q(valueAnimator, k7, k8, f7, xmlPullParser);
        int h7 = k.h(k7, xmlPullParser, "interpolator", 0, 0);
        if (h7 > 0) {
            valueAnimator.setInterpolator(AbstractC2004c.a(context, h7));
        }
        k7.recycle();
        if (k8 != null) {
            k8.recycle();
        }
        return valueAnimator;
    }

    public static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i7, XmlPullParser xmlPullParser) {
        TypedArray k7 = k.k(resources, theme, attributeSet, AbstractC2002a.f19673j);
        float f7 = k.f(k7, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue l7 = k.l(k7, xmlPullParser, "value", 0);
        boolean z7 = l7 != null;
        if (i7 == 4) {
            i7 = (z7 && h(l7.type)) ? 3 : 0;
        }
        Keyframe ofInt = z7 ? i7 != 0 ? (i7 == 1 || i7 == 3) ? Keyframe.ofInt(f7, k.g(k7, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(f7, k.f(k7, xmlPullParser, "value", 0, 0.0f)) : i7 == 0 ? Keyframe.ofFloat(f7) : Keyframe.ofInt(f7);
        int h7 = k.h(k7, xmlPullParser, "interpolator", 1, 0);
        if (h7 > 0) {
            ofInt.setInterpolator(AbstractC2004c.a(context, h7));
        }
        k7.recycle();
        return ofInt;
    }

    public static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f7, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f7, xmlPullParser);
        return objectAnimator;
    }

    public static PropertyValuesHolder o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i7) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i7 == 4) {
                    i7 = g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m7 = m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i7, xmlPullParser);
                if (m7 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m7);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i8 = 0; i8 < size; i8++) {
                Keyframe keyframe3 = keyframeArr[i8];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i8 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i9 = size - 1;
                        if (i8 == i9) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i10 = i8;
                            for (int i11 = i8 + 1; i11 < i9 && keyframeArr[i11].getFraction() < 0.0f; i11++) {
                                i10 = i11;
                            }
                            d(keyframeArr, keyframeArr[i10 + 1].getFraction() - keyframeArr[i8 - 1].getFraction(), i8, i10);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i7 == 3) {
                propertyValuesHolder.setEvaluator(C2006e.a());
            }
        }
        return propertyValuesHolder;
    }

    public static PropertyValuesHolder[] p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i7;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("propertyValuesHolder")) {
                TypedArray k7 = k.k(resources, theme, attributeSet, AbstractC2002a.f19672i);
                String i8 = k.i(k7, xmlPullParser, "propertyName", 3);
                int g7 = k.g(k7, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder o7 = o(context, resources, theme, xmlPullParser, i8, g7);
                if (o7 == null) {
                    o7 = e(k7, g7, 0, 1, i8);
                }
                if (o7 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(o7);
                }
                k7.recycle();
            }
            xmlPullParser.next();
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i7 = 0; i7 < size; i7++) {
                propertyValuesHolderArr[i7] = (PropertyValuesHolder) arrayList.get(i7);
            }
        }
        return propertyValuesHolderArr;
    }

    public static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f7, XmlPullParser xmlPullParser) {
        long g7 = k.g(typedArray, xmlPullParser, "duration", 1, 300);
        long g8 = k.g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int g9 = k.g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (k.j(xmlPullParser, "valueFrom") && k.j(xmlPullParser, "valueTo")) {
            if (g9 == 4) {
                g9 = f(typedArray, 5, 6);
            }
            PropertyValuesHolder e7 = e(typedArray, g9, 5, 6, "");
            if (e7 != null) {
                valueAnimator.setValues(e7);
            }
        }
        valueAnimator.setDuration(g7);
        valueAnimator.setStartDelay(g8);
        valueAnimator.setRepeatCount(k.g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(k.g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, g9, f7, xmlPullParser);
        }
    }

    public static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i7, float f7, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String i8 = k.i(typedArray, xmlPullParser, "pathData", 1);
        if (i8 == null) {
            objectAnimator.setPropertyName(k.i(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String i9 = k.i(typedArray, xmlPullParser, "propertyXName", 2);
        String i10 = k.i(typedArray, xmlPullParser, "propertyYName", 3);
        if (i7 != 2) {
        }
        if (i9 != null || i10 != null) {
            s(A.g.e(i8), objectAnimator, f7 * 0.5f, i9, i10);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    public static void s(Path path, ObjectAnimator objectAnimator, float f7, String str, String str2) {
        int i7 = 1;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f8 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f9 = 0.0f;
        do {
            f9 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f9));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f9 / f7)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f10 = f9 / (min - 1);
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f8 - ((Float) arrayList.get(i9)).floatValue(), fArr3, null);
            fArr[i8] = fArr3[0];
            fArr2[i8] = fArr3[1];
            f8 += f10;
            int i10 = i9 + 1;
            if (i10 < arrayList.size() && f8 > ((Float) arrayList.get(i10)).floatValue()) {
                pathMeasure2.nextContour();
                i9 = i10;
            }
            i7 = 1;
            i8++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[i7];
            propertyValuesHolderArr[0] = ofFloat2;
            objectAnimator.setValues(propertyValuesHolderArr);
        } else if (ofFloat2 == null) {
            PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[i7];
            propertyValuesHolderArr2[0] = ofFloat;
            objectAnimator.setValues(propertyValuesHolderArr2);
        } else {
            PropertyValuesHolder[] propertyValuesHolderArr3 = new PropertyValuesHolder[2];
            propertyValuesHolderArr3[0] = ofFloat;
            propertyValuesHolderArr3[i7] = ofFloat2;
            objectAnimator.setValues(propertyValuesHolderArr3);
        }
    }
}
