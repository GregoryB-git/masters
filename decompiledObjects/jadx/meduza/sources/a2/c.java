package a2;

import a0.j;
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
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import w.k;
import x.d;

/* loaded from: classes.dex */
public final class c {

    public static class a implements TypeEvaluator<d.a[]> {

        /* renamed from: a, reason: collision with root package name */
        public d.a[] f35a;

        @Override // android.animation.TypeEvaluator
        public final d.a[] evaluate(float f, d.a[] aVarArr, d.a[] aVarArr2) {
            d.a[] aVarArr3 = aVarArr;
            d.a[] aVarArr4 = aVarArr2;
            if (!x.d.a(aVarArr3, aVarArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!x.d.a(this.f35a, aVarArr3)) {
                this.f35a = x.d.e(aVarArr3);
            }
            for (int i10 = 0; i10 < aVarArr3.length; i10++) {
                d.a aVar = this.f35a[i10];
                d.a aVar2 = aVarArr3[i10];
                d.a aVar3 = aVarArr4[i10];
                aVar.getClass();
                aVar.f16496a = aVar2.f16496a;
                int i11 = 0;
                while (true) {
                    float[] fArr = aVar2.f16497b;
                    if (i11 < fArr.length) {
                        aVar.f16497b[i11] = (aVar3.f16497b[i11] * f) + ((1.0f - f) * fArr[i11]);
                        i11++;
                    }
                }
            }
            return this.f35a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x033b, code lost:
    
        if (r2.hasNext() == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x033d, code lost:
    
        r1[r13] = (android.animation.Animator) r2.next();
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0349, code lost:
    
        if (r28 != 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x034b, code lost:
    
        r27.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x034f, code lost:
    
        r27.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0352, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0329, code lost:
    
        if (r27 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x032b, code lost:
    
        if (r12 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x032d, code lost:
    
        r1 = new android.animation.Animator[r12.size()];
        r2 = r12.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, android.content.res.XmlResourceParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.c.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static Keyframe b(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    public static PropertyValuesHolder c(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder ofInt;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i11);
        boolean z10 = peekValue != null;
        int i13 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i12);
        boolean z11 = peekValue2 != null;
        int i14 = z11 ? peekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && d(i13)) || (z11 && d(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            d.a[] c10 = x.d.c(string);
            d.a[] c11 = x.d.c(string2);
            if (c10 == null && c11 == null) {
                return null;
            }
            if (c10 == null) {
                if (c11 != null) {
                    return PropertyValuesHolder.ofObject(str, new a(), c11);
                }
                return null;
            }
            a aVar = new a();
            if (c11 == null) {
                ofObject = PropertyValuesHolder.ofObject(str, aVar, c10);
            } else {
                if (!x.d.a(c10, c11)) {
                    throw new InflateException(j.k(" Can't morph from ", string, " to ", string2));
                }
                ofObject = PropertyValuesHolder.ofObject(str, aVar, c10, c11);
            }
            return ofObject;
        }
        d dVar = i10 == 3 ? d.f36a : null;
        if (z12) {
            if (z10) {
                float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z11) {
                    ofInt = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofInt = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
        } else {
            if (!z10) {
                if (z11) {
                    ofInt = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : d(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
                }
                if (propertyValuesHolder == null && dVar != null) {
                    propertyValuesHolder.setEvaluator(dVar);
                    return propertyValuesHolder;
                }
            }
            int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : d(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            if (z11) {
                ofInt = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : d(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            } else {
                ofInt = PropertyValuesHolder.ofInt(str, dimension2);
            }
        }
        propertyValuesHolder = ofInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    public static boolean d(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        TypedArray f = k.f(resources, theme, attributeSet, a2.a.f21g);
        TypedArray f10 = k.f(resources, theme, attributeSet, a2.a.f25k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long c10 = k.c(f, xmlResourceParser, "duration", 1, 300);
        int i10 = 0;
        long c11 = k.c(f, xmlResourceParser, "startOffset", 2, 0);
        int c12 = k.c(f, xmlResourceParser, "valueType", 7, 4);
        if (k.e(xmlResourceParser, "valueFrom") && k.e(xmlResourceParser, "valueTo")) {
            if (c12 == 4) {
                TypedValue peekValue = f.peekValue(5);
                boolean z10 = peekValue != null;
                int i11 = z10 ? peekValue.type : 0;
                TypedValue peekValue2 = f.peekValue(6);
                boolean z11 = peekValue2 != null;
                c12 = ((z10 && d(i11)) || (z11 && d(z11 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder c13 = c(f, c12, 5, 6, "");
            if (c13 != null) {
                valueAnimator3.setValues(c13);
            }
        }
        valueAnimator3.setDuration(c10);
        valueAnimator3.setStartDelay(c11);
        valueAnimator3.setRepeatCount(k.c(f, xmlResourceParser, "repeatCount", 3, 0));
        valueAnimator3.setRepeatMode(k.c(f, xmlResourceParser, "repeatMode", 4, 1));
        if (f10 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String d10 = k.d(f10, xmlResourceParser, "pathData", 1);
            if (d10 != null) {
                String d11 = k.d(f10, xmlResourceParser, "propertyXName", 2);
                String d12 = k.d(f10, xmlResourceParser, "propertyYName", 3);
                if (d11 == null && d12 == null) {
                    throw new InflateException(f10.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d13 = x.d.d(d10);
                PathMeasure pathMeasure = new PathMeasure(d13, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f11 = 0.0f;
                do {
                    f11 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f11));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d13, false);
                int min = Math.min(100, ((int) (f11 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f12 = f11 / (min - 1);
                valueAnimator = valueAnimator3;
                typedArray = f;
                int i12 = 0;
                float f13 = 0.0f;
                while (true) {
                    if (i10 >= min) {
                        break;
                    }
                    int i13 = min;
                    pathMeasure2.getPosTan(f13 - ((Float) arrayList.get(i12)).floatValue(), fArr3, null);
                    fArr[i10] = fArr3[0];
                    fArr2[i10] = fArr3[1];
                    f13 += f12;
                    int i14 = i12 + 1;
                    if (i14 < arrayList.size() && f13 > ((Float) arrayList.get(i14)).floatValue()) {
                        pathMeasure2.nextContour();
                        i12 = i14;
                    }
                    i10++;
                    min = i13;
                }
                PropertyValuesHolder ofFloat = d11 != null ? PropertyValuesHolder.ofFloat(d11, fArr) : null;
                PropertyValuesHolder ofFloat2 = d12 != null ? PropertyValuesHolder.ofFloat(d12, fArr2) : null;
                if (ofFloat == null) {
                    i10 = 0;
                    objectAnimator2.setValues(ofFloat2);
                } else {
                    i10 = 0;
                    if (ofFloat2 == null) {
                        objectAnimator2.setValues(ofFloat);
                    } else {
                        objectAnimator2.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = f;
                objectAnimator2.setPropertyName(k.d(f10, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = f;
        }
        if (k.e(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            i10 = typedArray2.getResourceId(i10, i10);
        } else {
            typedArray2 = typedArray;
        }
        if (i10 > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, i10));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (f10 != null) {
            f10.recycle();
        }
        return valueAnimator2;
    }
}
