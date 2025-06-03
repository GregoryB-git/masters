// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K1;

import android.widget.TextView;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Iterator;
import java.util.Collection;
import C1.f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import T1.a;
import android.view.View;
import W5.m;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Switch;
import java.util.List;

public final class c
{
    public static final c a;
    public static final List b;
    
    static {
        a = new c();
        b = m.i(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);
    }
    
    public static final List a(final View view) {
        if (T1.a.d(c.class)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                final ArrayList<Object> list = new ArrayList<Object>();
                final Iterator<Class> iterator = c.b.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().isInstance(view)) {
                        return list;
                    }
                }
                if (view.isClickable()) {
                    list.add(view);
                }
                final Iterator<View> iterator2 = (Iterator<View>)f.b(view).iterator();
                while (iterator2.hasNext()) {
                    list.addAll(a(iterator2.next()));
                }
                return list;
                final Throwable t;
                T1.a.b(t, c.class);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final JSONObject b(final View view, final View view2) {
        if (T1.a.d(c.class)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(view2, "clickedView");
                final JSONObject jsonObject = new JSONObject();
                Label_0046: {
                    if (view != view2) {
                        break Label_0046;
                    }
                    try {
                        jsonObject.put("is_interacted", true);
                        e(view, jsonObject);
                        final JSONArray jsonArray = new JSONArray();
                        final Iterator<View> iterator = f.b(view).iterator();
                        while (iterator.hasNext()) {
                            jsonArray.put((Object)b(iterator.next(), view2));
                        }
                        jsonObject.put("childviews", (Object)jsonArray);
                        return jsonObject;
                        final Throwable t;
                        T1.a.b(t, c.class);
                        return null;
                    }
                    catch (JSONException ex) {
                        return jsonObject;
                    }
                }
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public static final String d(final View view) {
        if (T1.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "hostView");
            final String k = f.k(view);
            if (k.length() > 0) {
                return k;
            }
            final String join = TextUtils.join((CharSequence)" ", (Iterable)c.a.c(view));
            Intrinsics.checkNotNullExpressionValue(join, "join(\" \", childrenText)");
            return join;
        }
        finally {
            final Throwable t;
            T1.a.b(t, c.class);
            return null;
        }
    }
    
    public static final void e(final View view, final JSONObject jsonObject) {
        if (T1.a.d(c.class)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(jsonObject, "json");
                try {
                    final String k = f.k(view);
                    final String i = f.i(view);
                    jsonObject.put("classname", (Object)view.getClass().getSimpleName());
                    jsonObject.put("classtypebitmask", f.c(view));
                    if (k.length() > 0) {
                        jsonObject.put("text", (Object)k);
                    }
                    if (i.length() > 0) {
                        jsonObject.put("hint", (Object)i);
                    }
                    if (view instanceof EditText) {
                        jsonObject.put("inputtype", ((TextView)view).getInputType());
                    }
                    return;
                    final Throwable t;
                    T1.a.b(t, c.class);
                    return;
                }
                catch (JSONException ex) {
                    return;
                }
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final List c(final View view) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            try {
                final ArrayList<Object> list = new ArrayList<Object>();
                for (final View view2 : f.b(view)) {
                    final String k = f.k(view2);
                    if (k.length() > 0) {
                        list.add(k);
                    }
                    list.addAll(this.c(view2));
                }
                return list;
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
