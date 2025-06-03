/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.DatePicker
 *  android.widget.EditText
 *  android.widget.RadioGroup
 *  android.widget.RatingBar
 *  android.widget.Spinner
 *  android.widget.Switch
 *  android.widget.TimePicker
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package K1;

import C1.f;
import T1.a;
import W5.m;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    public static final c a = new c();
    public static final List b = m.i((Object[])new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final List a(View view) {
        if (a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator iterator = b.iterator();
            while (iterator.hasNext()) {
                if (!((Class)iterator.next()).isInstance((Object)view)) continue;
                return arrayList;
            }
            if (view.isClickable()) {
                arrayList.add((Object)view);
            }
            view = f.b(view).iterator();
            do {
                if (!view.hasNext()) {
                    return arrayList;
                }
                arrayList.addAll((Collection)c.a((View)view.next()));
            } while (true);
        }
        catch (Throwable throwable) {}
        a.b(throwable, c.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final JSONObject b(View view, View view2) {
        if (a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)view, "view");
            Intrinsics.checkNotNullParameter((Object)view2, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                jSONObject.put("is_interacted", true);
            }
            c.e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            view = f.b(view).iterator();
            do {
                if (!view.hasNext()) {
                    jSONObject.put("childviews", (Object)jSONArray);
                    return jSONObject;
                }
                jSONArray.put((Object)c.b((View)view.next(), view2));
            } while (true);
        }
        catch (Throwable throwable) {}
        a.b(throwable, c.class);
        return null;
    }

    public static final String d(View object) {
        block4 : {
            if (a.d(c.class)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(object, "hostView");
                String string2 = f.k((View)object);
                if (string2.length() <= 0) break block4;
                return string2;
            }
            catch (Throwable throwable) {
                a.b(throwable, c.class);
                return null;
            }
        }
        object = TextUtils.join((CharSequence)" ", (Iterable)((Iterable)a.c((View)object)));
        Intrinsics.checkNotNullExpressionValue(object, "join(\" \", childrenText)");
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void e(View view, JSONObject jSONObject) {
        if (a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)view, "view");
            Intrinsics.checkNotNullParameter((Object)jSONObject, "json");
            try {
                String string2 = f.k(view);
                String string3 = f.i(view);
                jSONObject.put("classname", (Object)view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", f.c(view));
                if (string2.length() > 0) {
                    jSONObject.put("text", (Object)string2);
                }
                if (string3.length() > 0) {
                    jSONObject.put("hint", (Object)string3);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText)view).getInputType());
                }
                return;
            }
            catch (JSONException jSONException) {
                return;
            }
        }
        catch (Throwable throwable) {}
        a.b(throwable, c.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List c(View view) {
        if (a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            view = f.b(view).iterator();
            do {
                if (!view.hasNext()) {
                    return arrayList;
                }
                View view2 = (View)view.next();
                String string2 = f.k(view2);
                if (string2.length() > 0) {
                    arrayList.add((Object)string2);
                }
                arrayList.addAll((Collection)this.c(view2));
            } while (true);
        }
        catch (Throwable throwable) {}
        a.b(throwable, this);
        return null;
    }
}

