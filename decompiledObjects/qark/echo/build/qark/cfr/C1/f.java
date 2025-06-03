/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.AdapterView
 *  android.widget.Button
 *  android.widget.CheckBox
 *  android.widget.DatePicker
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.RadioButton
 *  android.widget.RadioGroup
 *  android.widget.RatingBar
 *  android.widget.Spinner
 *  android.widget.Switch
 *  android.widget.TextView
 *  android.widget.TimePicker
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.NoSuchFieldException
 *  java.lang.NoSuchMethodException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package C1;

import C1.d;
import O1.P;
import T1.a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    public static final f a = new f();
    public static final String b = f.class.getCanonicalName();
    public static WeakReference c = new WeakReference((Object)null);
    public static Method d;

    public static final View a(View view) {
        if (a.d(f.class)) {
            return null;
        }
        while (view != null) {
            block5 : {
                if (!a.q(view)) break block5;
                return view;
            }
            try {
                view = view.getParent();
                if (!(view instanceof View)) break;
            }
            catch (Throwable throwable) {
                a.b(throwable, f.class);
                break;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final List b(View view) {
        int n8;
        int n9;
        ArrayList arrayList;
        if (a.d(f.class)) {
            return null;
        }
        try {
            arrayList = new ArrayList();
            if (!(view instanceof ViewGroup) || (n8 = ((ViewGroup)view).getChildCount()) <= 0) return arrayList;
            n9 = 0;
        }
        catch (Throwable throwable) {}
        do {
            int n10 = n9 + 1;
            arrayList.add((Object)((ViewGroup)view).getChildAt(n9));
            if (n10 >= n8) {
                return arrayList;
            }
            n9 = n10;
            continue;
            break;
        } while (true);
        a.b(throwable, f.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int c(View view) {
        int n8;
        int n9;
        Throwable throwable2;
        block17 : {
            block15 : {
                block18 : {
                    block20 : {
                        block19 : {
                            block14 : {
                                block16 : {
                                    block13 : {
                                        block12 : {
                                            if (a.d(f.class)) {
                                                return 0;
                                            }
                                            try {
                                                Intrinsics.checkNotNullParameter((Object)view, "view");
                                                n9 = view instanceof ImageView ? 2 : 0;
                                                n8 = n9;
                                                if (!view.isClickable()) break block12;
                                            }
                                            catch (Throwable throwable2) {}
                                            n8 = n9 | 32;
                                        }
                                        n9 = n8;
                                        if (!f.o(view)) break block13;
                                        n9 = n8 | 512;
                                    }
                                    if (!(view instanceof TextView)) break block14;
                                    n8 = n9 | 1025;
                                    if (!(view instanceof Button)) break block15;
                                    n8 = n9 | 1029;
                                    if (!(view instanceof Switch)) break block16;
                                    n9 |= 9221;
                                    break block17;
                                }
                                if (!(view instanceof CheckBox)) break block15;
                                n9 |= 33797;
                                break block17;
                            }
                            if (view instanceof Spinner) return n9 | 4096;
                            if (view instanceof DatePicker) break block18;
                            if (!(view instanceof RatingBar)) break block19;
                            return n9 | 65536;
                        }
                        if (!(view instanceof RadioGroup)) break block20;
                        return n9 | 16384;
                    }
                    n8 = n9;
                    if (!(view instanceof ViewGroup)) return n8;
                    boolean bl = a.p(view, (View)c.get());
                    n8 = n9;
                    if (!bl) return n8;
                    return n9 | 64;
                }
                return n9 | 4096;
            }
            n9 = n8;
        }
        n8 = n9;
        if (!(view instanceof EditText)) return n8;
        return n9 | 2048;
        a.b(throwable2, f.class);
        return 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final JSONObject d(View view) {
        if (a.d(f.class)) {
            return null;
        }
        Intrinsics.checkNotNullParameter((Object)view, "view");
        if (Intrinsics.a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
            f.c = new WeakReference((Object)view);
        }
        jSONObject = new JSONObject();
        f.s(view, jSONObject);
        jSONArray = new JSONArray();
        view = f.b(view);
        n8 = view.size() - 1;
        if (n8 < 0) ** GOTO lbl21
        n9 = 0;
        do {
            block10 : {
                n10 = n9 + 1;
                try {
                    jSONArray.put((Object)f.d((View)view.get(n9)));
                    if (n10 <= n8) break block10;
lbl21: // 2 sources:
                    jSONObject.put("childviews", (Object)jSONArray);
                    return jSONObject;
                }
                catch (Throwable throwable) {}
                a.b(throwable, f.class);
                return null;
            }
            n9 = n10;
        } while (true);
        catch (JSONException jSONException) {}
        Log.e((String)f.b, (String)"Failed to create JSONObject for view.", (Throwable)jSONException);
        return jSONObject;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final View.OnClickListener g(View object) {
        if (a.d(f.class)) {
            return null;
        }
        try {
            Field field = Class.forName((String)"android.view.View").getDeclaredField("mListenerInfo");
            if (field != null) {
                field.setAccessible(true);
            }
            if ((object = field.get(object)) == null) {
                return null;
            }
            field = Class.forName((String)"android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            if (field == null) {
                return null;
            }
            field.setAccessible(true);
            object = field.get(object);
            if (object != null) {
                return (View.OnClickListener)object;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        }
        catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException classNotFoundException) {
            return null;
        }
        catch (Throwable throwable) {}
        a.b(throwable, f.class);
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final View.OnTouchListener h(View object) {
        void var1_4;
        block9 : {
            if (a.d(f.class)) {
                return null;
            }
            try {
                Field field = Class.forName((String)"android.view.View").getDeclaredField("mListenerInfo");
                if (field != null) {
                    field.setAccessible(true);
                }
                if ((object = field.get(object)) == null) {
                    return null;
                }
                field = Class.forName((String)"android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                if (field == null) return null;
                field.setAccessible(true);
                object = field.get(object);
                if (object == null) throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                return (View.OnTouchListener)object;
            }
            catch (Throwable throwable) {}
            a.b(throwable, f.class);
            return null;
            catch (IllegalAccessException illegalAccessException) {}
            object = P.a;
            object = b;
            break block9;
            catch (ClassNotFoundException classNotFoundException) {}
            object = P.a;
            object = b;
            break block9;
            catch (NoSuchFieldException noSuchFieldException) {}
            object = P.a;
            object = b;
        }
        P.i0((String)object, (Exception)var1_4);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String i(View object) {
        if (a.d(f.class)) {
            return null;
        }
        try {
            if (object instanceof EditText) {
                object = (EditText)object;
            } else {
                if (!(object instanceof TextView)) {
                    return "";
                }
                object = (TextView)object;
            }
            object = object.getHint();
            if (object == null) {
                return "";
            }
            if ((object = object.toString()) == null) {
                return "";
            }
            return object;
        }
        catch (Throwable throwable) {}
        a.b(throwable, f.class);
        return null;
    }

    public static final ViewGroup j(View view) {
        Throwable throwable2;
        block5 : {
            if (a.d(f.class)) {
                return null;
            }
            if (view == null) {
                return null;
            }
            try {
                view = view.getParent();
                if (view instanceof ViewGroup) {
                    view = (ViewGroup)view;
                    return view;
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            return null;
        }
        a.b(throwable2, f.class);
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static final String k(View var0) {
        block18 : {
            block16 : {
                block17 : {
                    block21 : {
                        block20 : {
                            block19 : {
                                if (a.d(f.class)) {
                                    return null;
                                }
                                if (!(var0 instanceof TextView)) break block19;
                                var6_2 = ((TextView)var0).getText();
                                if (var0 instanceof Switch) {
                                    if (!((Switch)var0).isChecked()) break block16;
                                    var0 = "1";
                                    break block17;
                                }
                                ** GOTO lbl53
                            }
                            if (!(var0 instanceof Spinner)) break block20;
                            if (((Spinner)var0).getCount() <= 0 || (var0 = ((Spinner)var0).getSelectedItem()) == null) ** GOTO lbl-1000
                            var6_2 = var0.toString();
                            ** GOTO lbl53
                        }
                        var5_3 = var0 instanceof DatePicker;
                        var1_4 = 0;
                        if (!var5_3) break block21;
                        var1_4 = ((DatePicker)var0).getYear();
                        var2_5 = ((DatePicker)var0).getMonth();
                        var3_8 = ((DatePicker)var0).getDayOfMonth();
                        var0 = x.a;
                        var6_2 = String.format((String)"%04d-%02d-%02d", (Object[])Arrays.copyOf((Object[])new Object[]{var1_4, var2_5, var3_8}, (int)3));
lbl25: // 2 sources:
                        do {
                            Intrinsics.checkNotNullExpressionValue(var6_2, "java.lang.String.format(format, *args)");
                            ** GOTO lbl53
                            break;
                        } while (true);
                    }
                    if (var0 instanceof TimePicker) {
                        var6_2 = ((TimePicker)var0).getCurrentHour();
                        Intrinsics.checkNotNullExpressionValue(var6_2, "view.currentHour");
                        var1_4 = var6_2.intValue();
                        var0 = ((TimePicker)var0).getCurrentMinute();
                        Intrinsics.checkNotNullExpressionValue(var0, "view.currentMinute");
                        var2_6 = var0.intValue();
                        var0 = x.a;
                        var6_2 = String.format((String)"%02d:%02d", (Object[])Arrays.copyOf((Object[])new Object[]{var1_4, var2_6}, (int)2));
                        ** continue;
                    }
                    if (!(var0 instanceof RadioGroup)) ** GOTO lbl49
                    var3_9 = ((RadioGroup)var0).getCheckedRadioButtonId();
                    var4_10 = ((RadioGroup)var0).getChildCount();
                    if (var4_10 <= 0) ** GOTO lbl-1000
lbl43: // 2 sources:
                    var2_7 = var1_4 + 1;
                    try {
                        block22 : {
                            var6_2 = ((RadioGroup)var0).getChildAt(var1_4);
                            if (var6_2.getId() != var3_9 || !(var6_2 instanceof RadioButton)) break block18;
                            var6_2 = ((RadioButton)var6_2).getText();
                            break block22;
lbl49: // 1 sources:
                            if (var0 instanceof RatingBar) {
                                var6_2 = String.valueOf((float)((RatingBar)var0).getRating());
                            } else lbl-1000: // 4 sources:
                            {
                                var6_2 = null;
                            }
                        }
lbl54: // 2 sources:
                        if (var6_2 == null) {
                            return "";
                        }
                        var0 = var6_2.toString();
                        if (var0 == null) {
                            return "";
                        }
                        return var0;
                    }
                    catch (Throwable var0_1) {
                        ** continue;
                    }
lbl60: // 1 sources:
                    do {
                        a.b(var0_1, f.class);
                        return null;
                        break;
                    } while (true);
                }
lbl64: // 2 sources:
                do {
                    var6_2 = var0;
                    ** GOTO lbl54
                    break;
                } while (true);
            }
            var0 = "0";
            ** while (true)
        }
        if (var2_7 >= var4_10) ** GOTO lbl-1000
        var1_4 = var2_7;
        ** GOTO lbl43
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean o(View view) {
        boolean bl = a.d(f.class);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        try {
            view = view.getParent();
            if (view instanceof AdapterView) {
                return true;
            }
            f f8 = a;
            Class class_ = f8.f("android.support.v4.view.NestedScrollingChild");
            if (class_ != null && class_.isInstance((Object)view)) {
                return true;
            }
            f8 = f8.f("androidx.core.view.NestedScrollingChild");
            bl = bl2;
            if (f8 == null) return bl;
            boolean bl3 = f8.isInstance((Object)view);
            bl = bl2;
            if (!bl3) return bl;
            return true;
        }
        catch (Throwable throwable) {}
        a.b(throwable, f.class);
        return false;
    }

    /*
     * Exception decompiling
     */
    public static final void r(View var0, View.OnClickListener var1_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void s(View object, JSONObject jSONObject) {
        if (a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(object, "view");
            Intrinsics.checkNotNullParameter((Object)jSONObject, "json");
            String string2 = f.k((View)object);
            String string3 = f.i((View)object);
            Object object2 = object.getTag();
            CharSequence charSequence = object.getContentDescription();
            jSONObject.put("classname", (Object)object.getClass().getCanonicalName());
            jSONObject.put("classtypebitmask", f.c((View)object));
            jSONObject.put("id", object.getId());
            boolean bl = d.g((View)object);
            if (!bl) {
                jSONObject.put("text", (Object)P.k(P.F0(string2), ""));
            } else {
                jSONObject.put("text", (Object)"");
                jSONObject.put("is_user_input", true);
            }
            jSONObject.put("hint", (Object)P.k(P.F0(string3), ""));
            if (object2 != null) {
                jSONObject.put("tag", (Object)P.k(P.F0(object2.toString()), ""));
            }
            if (charSequence != null) {
                jSONObject.put("description", (Object)P.k(P.F0(charSequence.toString()), ""));
            }
            jSONObject.put("dimension", (Object)a.e((View)object));
            return;
        }
        catch (Throwable throwable) {}
        a.b(throwable, f.class);
        return;
        catch (JSONException jSONException) {}
        object = P.a;
        P.i0(b, (Exception)jSONException);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final JSONObject e(View view) {
        Throwable throwable2222;
        block5 : {
            JSONObject jSONObject;
            if (a.d(this)) {
                return null;
            }
            try {
                jSONObject = new JSONObject();
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            }
            catch (Throwable throwable2222) {
                break block5;
            }
            catch (JSONException jSONException) {
                Log.e((String)b, (String)"Failed to create JSONObject for dimension.", (Throwable)jSONException);
                return jSONObject;
            }
        }
        a.b(throwable2222, this);
        return null;
    }

    public final Class f(String string2) {
        if (a.d(this)) {
            return null;
        }
        try {
            string2 = Class.forName((String)string2);
            return string2;
        }
        catch (Throwable throwable) {
            a.b(throwable, this);
            return null;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final View l(float[] object, View object2) {
        void var1_3;
        block7 : {
            if (a.d(this)) {
                return null;
            }
            try {
                this.n();
                Method method = d;
                if (method == null) return null;
                if (object2 == null) {
                    return null;
                }
                if (method == null) throw new IllegalStateException("Required value was null.".toString());
                object = method.invoke((Object)null, new Object[]{object, object2});
                if (object == null) throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                if ((object = (View)object).getId() <= 0) return null;
                if ((object = object.getParent()) == null) throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                return (View)object;
            }
            catch (Throwable throwable) {}
            a.b(throwable, this);
            return null;
            catch (InvocationTargetException invocationTargetException) {}
            object2 = P.a;
            object2 = b;
            break block7;
            catch (IllegalAccessException illegalAccessException) {}
            object2 = P.a;
            object2 = b;
        }
        P.i0((String)object2, (Exception)var1_3);
        return null;
    }

    public final float[] m(View view) {
        int[] arrn;
        if (a.d(this)) {
            return null;
        }
        try {
            arrn = new int[2];
            view.getLocationOnScreen(arrn);
        }
        catch (Throwable throwable) {
            a.b(throwable, this);
            return null;
        }
        float f8 = arrn[0];
        float f9 = arrn[1];
        return new float[]{f8, f9};
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void n() {
        Object object;
        void var1_3;
        block7 : {
            if (a.d(this)) {
                return;
            }
            try {
                Method method = d;
                if (method != null) {
                    return;
                }
                d = method = Class.forName((String)"com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", new Class[]{float[].class, ViewGroup.class});
                if (method == null) throw new IllegalStateException("Required value was null.".toString());
                method.setAccessible(true);
                return;
            }
            catch (Throwable throwable) {}
            a.b(throwable, this);
            return;
            catch (NoSuchMethodException noSuchMethodException) {}
            object = P.a;
            object = b;
            break block7;
            catch (ClassNotFoundException classNotFoundException) {}
            object = P.a;
            object = b;
        }
        P.i0((String)object, (Exception)var1_3);
    }

    public final boolean p(View view, View view2) {
        Throwable throwable2;
        block6 : {
            block5 : {
                if (a.d(this)) {
                    return false;
                }
                try {
                    Intrinsics.checkNotNullParameter((Object)view, "view");
                    if (!Intrinsics.a(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") || (view2 = this.l(this.m(view), view2)) == null) break block5;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                int n8 = view2.getId();
                int n9 = view.getId();
                if (n8 == n9) {
                    return true;
                }
            }
            return false;
        }
        a.b(throwable2, this);
        return false;
    }

    public final boolean q(View view) {
        if (a.d(this)) {
            return false;
        }
        try {
            boolean bl = Intrinsics.a(view.getClass().getName(), "com.facebook.react.ReactRootView");
            return bl;
        }
        catch (Throwable throwable) {
            a.b(throwable, this);
            return false;
        }
    }
}

