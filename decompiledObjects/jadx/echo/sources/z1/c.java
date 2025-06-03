package z1;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.s;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f21627a = new c();

    public static final List a(View view) {
        if (T1.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup j7 = C1.f.j(view);
            if (j7 != null) {
                for (View view2 : C1.f.b(j7)) {
                    if (view != view2) {
                        arrayList.addAll(f21627a.c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            T1.a.b(th, c.class);
            return null;
        }
    }

    public static final List b(View view) {
        if (T1.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(C1.f.i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    Intrinsics.checkNotNullExpressionValue(resourceName, "resourceName");
                    Object[] array = new Regex("/").c(resourceName, 0).toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    String[] strArr = (String[]) array;
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            T1.a.b(th, c.class);
            return null;
        }
    }

    public static final boolean e(List indicators, List keys) {
        if (T1.a.d(c.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(indicators, "indicators");
            Intrinsics.checkNotNullParameter(keys, "keys");
            Iterator it = indicators.iterator();
            while (it.hasNext()) {
                if (f21627a.d((String) it.next(), keys)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            T1.a.b(th, c.class);
            return false;
        }
    }

    public static final boolean f(String text, String rule) {
        if (T1.a.d(c.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(rule, "rule");
            return new Regex(rule).b(text);
        } catch (Throwable th) {
            T1.a.b(th, c.class);
            return false;
        }
    }

    public final List c(View view) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (!(view instanceof TextView)) {
                Iterator it = C1.f.b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(c((View) it.next()));
                }
                return arrayList;
            }
            String obj = ((TextView) view).getText().toString();
            if (obj.length() > 0 && obj.length() < 100) {
                String lowerCase = obj.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList.add(lowerCase);
            }
            return arrayList;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final boolean d(String str, List list) {
        boolean v7;
        if (T1.a.d(this)) {
            return false;
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                v7 = s.v(str, (String) it.next(), false, 2, null);
                if (v7) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }
}
