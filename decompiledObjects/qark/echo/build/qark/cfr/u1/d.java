/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorInflater
 *  android.animation.AnimatorSet
 *  android.animation.Keyframe
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.animation.TimeInterpolator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.util.Xml
 *  android.view.InflateException
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package u1;

import A.g;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
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
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u1.c;
import u1.e;
import z.k;

public abstract class d {
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f8) {
        return d.b(context, resources, theme, xmlPullParser, Xml.asAttributeSet((XmlPullParser)xmlPullParser), null, 0, f8);
    }

    public static Animator b(Context stringBuilder, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int n8, float f8) {
        int n9;
        ArrayList arrayList;
        PropertyValuesHolder[] arrpropertyValuesHolder;
        int n10;
        block12 : {
            int n11 = xmlPullParser.getDepth();
            arrpropertyValuesHolder = null;
            arrayList = null;
            do {
                int n12 = xmlPullParser.next();
                n10 = 0;
                n9 = 0;
                if (n12 == 3 && xmlPullParser.getDepth() <= n11 || n12 == 1) break block12;
                if (n12 != 2) continue;
                PropertyValuesHolder[] arrpropertyValuesHolder2 = xmlPullParser.getName();
                if (arrpropertyValuesHolder2.equals((Object)"objectAnimator")) {
                    arrpropertyValuesHolder2 = d.n((Context)stringBuilder, resources, theme, attributeSet, f8, xmlPullParser);
                } else if (arrpropertyValuesHolder2.equals((Object)"animator")) {
                    arrpropertyValuesHolder2 = d.l((Context)stringBuilder, resources, theme, attributeSet, null, f8, xmlPullParser);
                } else if (arrpropertyValuesHolder2.equals((Object)"set")) {
                    arrpropertyValuesHolder2 = new AnimatorSet();
                    arrpropertyValuesHolder = k.k(resources, theme, attributeSet, u1.a.h);
                    d.b((Context)stringBuilder, resources, theme, xmlPullParser, attributeSet, (AnimatorSet)arrpropertyValuesHolder2, k.g((TypedArray)arrpropertyValuesHolder, xmlPullParser, "ordering", 0, 0), f8);
                    arrpropertyValuesHolder.recycle();
                } else {
                    if (!arrpropertyValuesHolder2.equals((Object)"propertyValuesHolder")) break;
                    arrpropertyValuesHolder2 = d.p((Context)stringBuilder, resources, theme, xmlPullParser, Xml.asAttributeSet((XmlPullParser)xmlPullParser));
                    if (arrpropertyValuesHolder2 != null && arrpropertyValuesHolder instanceof ValueAnimator) {
                        ((ValueAnimator)arrpropertyValuesHolder).setValues(arrpropertyValuesHolder2);
                    }
                    n9 = 1;
                    arrpropertyValuesHolder2 = arrpropertyValuesHolder;
                }
                arrpropertyValuesHolder = arrpropertyValuesHolder2;
                if (animatorSet == null) continue;
                arrpropertyValuesHolder = arrpropertyValuesHolder2;
                if (n9 != 0) continue;
                ArrayList arrayList2 = arrayList;
                if (arrayList == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add((Object)arrpropertyValuesHolder2);
                arrpropertyValuesHolder = arrpropertyValuesHolder2;
                arrayList = arrayList2;
            } while (true);
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown animator name: ");
            stringBuilder.append(xmlPullParser.getName());
            throw new RuntimeException(stringBuilder.toString());
        }
        if (animatorSet != null && arrayList != null) {
            stringBuilder = new Animator[arrayList.size()];
            resources = arrayList.iterator();
            n9 = n10;
            while (resources.hasNext()) {
                stringBuilder[n9] = (Animator)resources.next();
                ++n9;
            }
            if (n8 == 0) {
                animatorSet.playTogether((Animator[])stringBuilder);
                return arrpropertyValuesHolder;
            }
            animatorSet.playSequentially((Animator[])stringBuilder);
        }
        return arrpropertyValuesHolder;
    }

    public static Keyframe c(Keyframe keyframe, float f8) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat((float)f8);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt((float)f8);
        }
        return Keyframe.ofObject((float)f8);
    }

    public static void d(Keyframe[] arrkeyframe, float f8, int n8, int n9) {
        f8 /= (float)(n9 - n8 + 2);
        while (n8 <= n9) {
            arrkeyframe[n8].setFraction(arrkeyframe[n8 - 1].getFraction() + f8);
            ++n8;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static PropertyValuesHolder e(TypedArray object, int n8, int n9, int n10, String string2) {
        Object object2 = object.peekValue(n9);
        boolean bl = object2 != null;
        int n11 = bl ? object2.type : 0;
        object2 = object.peekValue(n10);
        boolean bl2 = object2 != null;
        int n12 = bl2 ? object2.type : 0;
        int n13 = n8;
        if (n8 == 4) {
            n13 = bl && d.h(n11) || bl2 && d.h(n12) ? 3 : 0;
        }
        n8 = n13 == 0 ? 1 : 0;
        object2 = null;
        String string3 = null;
        if (n13 == 2) {
            String string4 = object.getString(n9);
            string3 = object.getString(n10);
            g.b[] arrb = g.d(string4);
            g.b[] arrb2 = g.d(string3);
            if (arrb == null) {
                object = object2;
                if (arrb2 == null) return object;
            }
            if (arrb == null) {
                object = object2;
                if (arrb2 == null) return object;
                return PropertyValuesHolder.ofObject((String)string2, (TypeEvaluator)new a(), (Object[])new Object[]{arrb2});
            }
            object = new a();
            if (arrb2 == null) {
                return PropertyValuesHolder.ofObject((String)string2, (TypeEvaluator)object, (Object[])new Object[]{arrb});
            }
            if (g.b(arrb, arrb2)) {
                return PropertyValuesHolder.ofObject((String)string2, (TypeEvaluator)object, (Object[])new Object[]{arrb, arrb2});
            }
            object = new StringBuilder();
            object.append(" Can't morph from ");
            object.append(string4);
            object.append(" to ");
            object.append(string3);
            throw new InflateException(object.toString());
        }
        e e8 = n13 == 3 ? e.a() : null;
        if (n8 != 0) {
            if (bl) {
                float f8 = n11 == 5 ? object.getDimension(n9, 0.0f) : object.getFloat(n9, 0.0f);
                if (bl2) {
                    float f9 = n12 == 5 ? object.getDimension(n10, 0.0f) : object.getFloat(n10, 0.0f);
                    object = PropertyValuesHolder.ofFloat((String)string2, (float[])new float[]{f8, f9});
                } else {
                    object = PropertyValuesHolder.ofFloat((String)string2, (float[])new float[]{f8});
                }
            } else {
                float f10 = n12 == 5 ? object.getDimension(n10, 0.0f) : object.getFloat(n10, 0.0f);
                object = PropertyValuesHolder.ofFloat((String)string2, (float[])new float[]{f10});
            }
            object2 = object;
        } else if (bl) {
            n8 = n11 == 5 ? (int)object.getDimension(n9, 0.0f) : (d.h(n11) ? object.getColor(n9, 0) : object.getInt(n9, 0));
            if (bl2) {
                n9 = n12 == 5 ? (int)object.getDimension(n10, 0.0f) : (d.h(n12) ? object.getColor(n10, 0) : object.getInt(n10, 0));
                object2 = PropertyValuesHolder.ofInt((String)string2, (int[])new int[]{n8, n9});
            } else {
                object2 = PropertyValuesHolder.ofInt((String)string2, (int[])new int[]{n8});
            }
        } else {
            object2 = string3;
            if (bl2) {
                n8 = n12 == 5 ? (int)object.getDimension(n10, 0.0f) : (d.h(n12) ? object.getColor(n10, 0) : object.getInt(n10, 0));
                object2 = PropertyValuesHolder.ofInt((String)string2, (int[])new int[]{n8});
            }
        }
        object = object2;
        if (object2 == null) return object;
        object = object2;
        if (e8 == null) return object;
        object2.setEvaluator((TypeEvaluator)e8);
        return object2;
    }

    public static int f(TypedArray typedArray, int n8, int n9) {
        block3 : {
            block2 : {
                TypedValue typedValue = typedArray.peekValue(n8);
                int n10 = 1;
                int n11 = 0;
                n8 = typedValue != null ? 1 : 0;
                int n12 = n8 != 0 ? typedValue.type : 0;
                typedArray = typedArray.peekValue(n9);
                n9 = typedArray != null ? n10 : 0;
                n10 = n9 != 0 ? typedArray.type : 0;
                if (n8 != 0 && d.h(n12)) break block2;
                n8 = n11;
                if (n9 == 0) break block3;
                n8 = n11;
                if (!d.h(n10)) break block3;
            }
            n8 = 3;
        }
        return n8;
    }

    public static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        resources = k.k(resources, theme, attributeSet, u1.a.j);
        int n8 = 0;
        theme = k.l((TypedArray)resources, xmlPullParser, "value", 0);
        int n9 = n8;
        if (theme != null) {
            n9 = n8;
            if (d.h(theme.type)) {
                n9 = 3;
            }
        }
        resources.recycle();
        return n9;
    }

    public static boolean h(int n8) {
        if (n8 >= 28 && n8 <= 31) {
            return true;
        }
        return false;
    }

    public static Animator i(Context context, int n8) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator((Context)context, (int)n8);
        }
        return d.j(context, context.getResources(), context.getTheme(), n8);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int n8) {
        return d.k(context, resources, theme, n8, 1.0f);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Animator k(Context var0, Resources var1_4, Resources.Theme var2_5, int var3_6, float var4_7) {
        block5 : {
            var6_8 = null;
            var7_9 = null;
            var5_10 = null;
            try {
                var5_10 = var8_11 = var1_4.getAnimation(var3_6);
                var6_8 = var8_11;
                var7_9 = var8_11;
                var0 = d.a(var0, var1_4, var2_5, (XmlPullParser)var8_11, var4_7);
                if (var8_11 == null) return var0;
            }
            catch (Throwable var0_1) {
                break block5;
            }
            catch (IOException var0_2) {
            }
            catch (XmlPullParserException var0_3) {
                ** GOTO lbl30
            }
            var8_11.close();
            return var0;
            var5_10 = var6_8;
            {
                var1_4 = new StringBuilder();
                var5_10 = var6_8;
                var1_4.append("Can't load animation resource ID #0x");
                var5_10 = var6_8;
                var1_4.append(Integer.toHexString((int)var3_6));
                var5_10 = var6_8;
                var1_4 = new Resources.NotFoundException(var1_4.toString());
                var5_10 = var6_8;
                var1_4.initCause((Throwable)var0_2);
                var5_10 = var6_8;
                throw var1_4;
lbl30: // 1 sources:
                var5_10 = var7_9;
                var1_4 = new StringBuilder();
                var5_10 = var7_9;
                var1_4.append("Can't load animation resource ID #0x");
                var5_10 = var7_9;
                var1_4.append(Integer.toHexString((int)var3_6));
                var5_10 = var7_9;
                var1_4 = new Resources.NotFoundException(var1_4.toString());
                var5_10 = var7_9;
                var1_4.initCause((Throwable)var0_3);
                var5_10 = var7_9;
                throw var1_4;
            }
        }
        if (var5_10 == null) throw var0_1;
        var5_10.close();
        throw var0_1;
    }

    public static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f8, XmlPullParser xmlPullParser) {
        TypedArray typedArray = k.k(resources, theme, attributeSet, u1.a.g);
        theme = k.k(resources, theme, attributeSet, u1.a.k);
        resources = valueAnimator;
        if (valueAnimator == null) {
            resources = new ValueAnimator();
        }
        d.q((ValueAnimator)resources, typedArray, (TypedArray)theme, f8, xmlPullParser);
        int n8 = k.h(typedArray, xmlPullParser, "interpolator", 0, 0);
        if (n8 > 0) {
            resources.setInterpolator((TimeInterpolator)c.a(context, n8));
        }
        typedArray.recycle();
        if (theme != null) {
            theme.recycle();
        }
        return resources;
    }

    public static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int n8, XmlPullParser xmlPullParser) {
        theme = k.k(resources, theme, attributeSet, u1.a.j);
        float f8 = k.f((TypedArray)theme, xmlPullParser, "fraction", 3, -1.0f);
        resources = k.l((TypedArray)theme, xmlPullParser, "value", 0);
        boolean bl = resources != null;
        int n9 = n8;
        if (n8 == 4) {
            n9 = bl && d.h(resources.type) ? 3 : 0;
        }
        resources = bl ? (n9 != 0 ? (n9 != 1 && n9 != 3 ? null : Keyframe.ofInt((float)f8, (int)k.g((TypedArray)theme, xmlPullParser, "value", 0, 0))) : Keyframe.ofFloat((float)f8, (float)k.f((TypedArray)theme, xmlPullParser, "value", 0, 0.0f))) : (n9 == 0 ? Keyframe.ofFloat((float)f8) : Keyframe.ofInt((float)f8));
        n8 = k.h((TypedArray)theme, xmlPullParser, "interpolator", 1, 0);
        if (n8 > 0) {
            resources.setInterpolator((TimeInterpolator)c.a(context, n8));
        }
        theme.recycle();
        return resources;
    }

    public static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f8, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        d.l(context, resources, theme, attributeSet, (ValueAnimator)objectAnimator, f8, xmlPullParser);
        return objectAnimator;
    }

    public static PropertyValuesHolder o(Context object, Resources object2, Resources.Theme theme, XmlPullParser xmlPullParser, String string2, int n8) {
        Object var14_6 = null;
        ArrayList arrayList = null;
        int n9 = n8;
        while ((n8 = xmlPullParser.next()) != 3 && n8 != 1) {
            if (!xmlPullParser.getName().equals((Object)"keyframe")) continue;
            n8 = n9;
            if (n9 == 4) {
                n8 = d.g((Resources)object2, theme, Xml.asAttributeSet((XmlPullParser)xmlPullParser), xmlPullParser);
            }
            Keyframe keyframe = d.m((Context)object, (Resources)object2, theme, Xml.asAttributeSet((XmlPullParser)xmlPullParser), n8, xmlPullParser);
            ArrayList arrayList2 = arrayList;
            if (keyframe != null) {
                arrayList2 = arrayList;
                if (arrayList == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add((Object)keyframe);
            }
            xmlPullParser.next();
            arrayList = arrayList2;
            n9 = n8;
        }
        object = var14_6;
        if (arrayList != null) {
            int n10 = arrayList.size();
            object = var14_6;
            if (n10 > 0) {
                int n11 = 0;
                object = (Keyframe)arrayList.get(0);
                object2 = (Keyframe)arrayList.get(n10 - 1);
                float f8 = object2.getFraction();
                n8 = n10;
                if (f8 < 1.0f) {
                    if (f8 < 0.0f) {
                        object2.setFraction(1.0f);
                        n8 = n10;
                    } else {
                        arrayList.add(arrayList.size(), (Object)d.c((Keyframe)object2, 1.0f));
                        n8 = n10 + 1;
                    }
                }
                f8 = object.getFraction();
                n10 = n8;
                if (f8 != 0.0f) {
                    if (f8 < 0.0f) {
                        object.setFraction(0.0f);
                        n10 = n8;
                    } else {
                        arrayList.add(0, (Object)d.c((Keyframe)object, 0.0f));
                        n10 = n8 + 1;
                    }
                }
                object = new Keyframe[n10];
                arrayList.toArray((Object[])object);
                for (n8 = n11; n8 < n10; ++n8) {
                    object2 = object[n8];
                    if (object2.getFraction() >= 0.0f) continue;
                    if (n8 == 0) {
                        object2.setFraction(0.0f);
                        continue;
                    }
                    int n12 = n10 - 1;
                    if (n8 == n12) {
                        object2.setFraction(1.0f);
                        continue;
                    }
                    n11 = n8 + 1;
                    int n13 = n8;
                    while (n11 < n12 && object[n11].getFraction() < 0.0f) {
                        n13 = n11++;
                    }
                    d.d((Keyframe[])object, object[n13 + 1].getFraction() - object[n8 - 1].getFraction(), n8, n13);
                }
                object = object2 = PropertyValuesHolder.ofKeyframe((String)string2, (Keyframe[])object);
                if (n9 == 3) {
                    object2.setEvaluator((TypeEvaluator)e.a());
                    object = object2;
                }
            }
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static PropertyValuesHolder[] p(Context arrpropertyValuesHolder, Resources arrpropertyValuesHolder2, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int n8;
        int n9;
        Object var10_5 = null;
        PropertyValuesHolder propertyValuesHolder = null;
        do {
            n8 = xmlPullParser.getEventType();
            n9 = 0;
            if (n8 == 3 || n8 == 1) break;
            if (n8 == 2 && xmlPullParser.getName().equals((Object)"propertyValuesHolder")) {
                PropertyValuesHolder propertyValuesHolder2;
                TypedArray typedArray = k.k((Resources)arrpropertyValuesHolder2, theme, attributeSet, u1.a.i);
                String string2 = k.i(typedArray, xmlPullParser, "propertyName", 3);
                n9 = k.g(typedArray, xmlPullParser, "valueType", 2, 4);
                PropertyValuesHolder propertyValuesHolder3 = propertyValuesHolder2 = d.o((Context)arrpropertyValuesHolder, (Resources)arrpropertyValuesHolder2, theme, xmlPullParser, string2, n9);
                if (propertyValuesHolder2 == null) {
                    propertyValuesHolder3 = d.e(typedArray, n9, 0, 1, string2);
                }
                propertyValuesHolder2 = propertyValuesHolder;
                if (propertyValuesHolder3 != null) {
                    propertyValuesHolder2 = propertyValuesHolder;
                    if (propertyValuesHolder == null) {
                        propertyValuesHolder2 = new ArrayList();
                    }
                    propertyValuesHolder2.add((Object)propertyValuesHolder3);
                }
                typedArray.recycle();
                propertyValuesHolder = propertyValuesHolder2;
            }
            xmlPullParser.next();
        } while (true);
        arrpropertyValuesHolder = var10_5;
        if (propertyValuesHolder != null) {
            n8 = propertyValuesHolder.size();
            arrpropertyValuesHolder2 = new PropertyValuesHolder[n8];
            do {
                arrpropertyValuesHolder = arrpropertyValuesHolder2;
                if (n9 >= n8) break;
                arrpropertyValuesHolder2[n9] = (PropertyValuesHolder)propertyValuesHolder.get(n9);
                ++n9;
            } while (true);
        }
        return arrpropertyValuesHolder;
    }

    public static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f8, XmlPullParser xmlPullParser) {
        int n8;
        long l8 = k.g(typedArray, xmlPullParser, "duration", 1, 300);
        long l9 = k.g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int n9 = n8 = k.g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (k.j(xmlPullParser, "valueFrom")) {
            n9 = n8;
            if (k.j(xmlPullParser, "valueTo")) {
                int n10 = n8;
                if (n8 == 4) {
                    n10 = d.f(typedArray, 5, 6);
                }
                PropertyValuesHolder propertyValuesHolder = d.e(typedArray, n10, 5, 6, "");
                n9 = n10;
                if (propertyValuesHolder != null) {
                    valueAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                    n9 = n10;
                }
            }
        }
        valueAnimator.setDuration(l8);
        valueAnimator.setStartDelay(l9);
        valueAnimator.setRepeatCount(k.g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(k.g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            d.r(valueAnimator, typedArray2, n9, f8, xmlPullParser);
        }
    }

    public static void r(ValueAnimator valueAnimator, TypedArray typedArray, int n8, float f8, XmlPullParser object) {
        valueAnimator = (ObjectAnimator)valueAnimator;
        String string2 = k.i(typedArray, (XmlPullParser)object, "pathData", 1);
        if (string2 != null) {
            String string3 = k.i(typedArray, (XmlPullParser)object, "propertyXName", 2);
            object = k.i(typedArray, (XmlPullParser)object, "propertyYName", 3);
            if (n8 != 2) {
                // empty if block
            }
            if (string3 == null && object == null) {
                valueAnimator = new StringBuilder();
                valueAnimator.append(typedArray.getPositionDescription());
                valueAnimator.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(valueAnimator.toString());
            }
            d.s(g.e(string2), (ObjectAnimator)valueAnimator, f8 * 0.5f, string3, (String)object);
            return;
        }
        valueAnimator.setPropertyName(k.i(typedArray, (XmlPullParser)object, "propertyName", 0));
    }

    public static void s(Path path, ObjectAnimator objectAnimator, float f8, String string2, String string3) {
        float f9;
        int n8;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        arrayList.add((Object)Float.valueOf((float)0.0f));
        float f11 = 0.0f;
        do {
            f9 = f11 + pathMeasure.getLength();
            arrayList.add((Object)Float.valueOf((float)f9));
            f11 = f9;
        } while (pathMeasure.nextContour());
        path = new PathMeasure(path, false);
        int n9 = Math.min((int)100, (int)((int)(f9 / f8) + 1));
        float[] arrf = new float[n9];
        float[] arrf2 = new float[n9];
        float[] arrf3 = new float[2];
        f11 = f9 / (float)(n9 - 1);
        int n10 = n8 = 0;
        f8 = f10;
        do {
            pathMeasure = null;
            if (n8 >= n9) break;
            path.getPosTan(f8 - ((Float)arrayList.get(n10)).floatValue(), arrf3, null);
            arrf[n8] = arrf3[0];
            arrf2[n8] = arrf3[1];
            f8 += f11;
            int n11 = n10 + 1;
            int n12 = n10;
            if (n11 < arrayList.size()) {
                n12 = n10;
                if (f8 > ((Float)arrayList.get(n11)).floatValue()) {
                    path.nextContour();
                    n12 = n11;
                }
            }
            ++n8;
            n10 = n12;
        } while (true);
        path = string2 != null ? PropertyValuesHolder.ofFloat((String)string2, (float[])arrf) : null;
        string2 = pathMeasure;
        if (string3 != null) {
            string2 = PropertyValuesHolder.ofFloat((String)string3, (float[])arrf2);
        }
        if (path == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{string2});
            return;
        }
        if (string2 == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{path});
            return;
        }
        objectAnimator.setValues(new PropertyValuesHolder[]{path, string2});
    }

    public static class a
    implements TypeEvaluator {
        public g.b[] a;

        public g.b[] a(float f8, g.b[] arrb, g.b[] arrb2) {
            if (g.b(arrb, arrb2)) {
                if (!g.b(this.a, arrb)) {
                    this.a = g.f(arrb);
                }
                for (int i8 = 0; i8 < arrb.length; ++i8) {
                    this.a[i8].d(arrb[i8], arrb2[i8], f8);
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

}

