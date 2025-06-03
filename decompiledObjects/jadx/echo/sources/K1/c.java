package K1;

import W5.o;
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
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3159a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final List f3160b;

    static {
        List i7;
        i7 = o.i(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);
        f3160b = i7;
    }

    public static final List a(View view) {
        if (T1.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator it = f3160b.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it2 = C1.f.b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(a((View) it2.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            T1.a.b(th, c.class);
            return null;
        }
    }

    public static final JSONObject b(View view, View clickedView) {
        if (T1.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = C1.f.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            T1.a.b(th, c.class);
            return null;
        }
    }

    public static final String d(View hostView) {
        if (T1.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String k7 = C1.f.k(hostView);
            if (k7.length() > 0) {
                return k7;
            }
            String join = TextUtils.join(" ", f3159a.c(hostView));
            Intrinsics.checkNotNullExpressionValue(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            T1.a.b(th, c.class);
            return null;
        }
    }

    public static final void e(View view, JSONObject json) {
        if (T1.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String k7 = C1.f.k(view);
                String i7 = C1.f.i(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", C1.f.c(view));
                if (k7.length() > 0) {
                    json.put("text", k7);
                }
                if (i7.length() > 0) {
                    json.put("hint", i7);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            T1.a.b(th, c.class);
        }
    }

    public final List c(View view) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : C1.f.b(view)) {
                String k7 = C1.f.k(view2);
                if (k7.length() > 0) {
                    arrayList.add(k7);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }
}
