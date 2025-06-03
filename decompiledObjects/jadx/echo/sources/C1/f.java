package C1;

import O1.P;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.DatePicker;
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

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f913a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final String f914b = f.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f915c = new WeakReference(null);

    /* renamed from: d, reason: collision with root package name */
    public static Method f916d;

    public static final View a(View view) {
        if (T1.a.d(f.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!f913a.q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                T1.a.b(th, f.class);
            }
        }
        return null;
    }

    public static final List b(View view) {
        int childCount;
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i7));
                    if (i8 >= childCount) {
                        break;
                    }
                    i7 = i8;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            T1.a.b(th, f.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:6:0x000a, B:9:0x0016, B:11:0x001c, B:12:0x001e, B:14:0x0024, B:15:0x0026, B:17:0x002a, B:19:0x0030, B:21:0x0036, B:22:0x0046, B:24:0x004a, B:27:0x0039, B:29:0x003d, B:31:0x004d, B:33:0x0051, B:36:0x0056, B:38:0x005a, B:40:0x005e, B:42:0x0062, B:44:0x0065, B:46:0x0069), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(android.view.View r5) {
        /*
            java.lang.Class<C1.f> r0 = C1.f.class
            boolean r1 = T1.a.d(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.lang.String r1 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)     // Catch: java.lang.Throwable -> L44
            boolean r1 = r5 instanceof android.widget.ImageView     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L15
            r1 = 2
            goto L16
        L15:
            r1 = r2
        L16:
            boolean r3 = r5.isClickable()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L1e
            r1 = r1 | 32
        L1e:
            boolean r3 = o(r5)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L26
            r1 = r1 | 512(0x200, float:7.175E-43)
        L26:
            boolean r3 = r5 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L4d
            r3 = r1 | 1025(0x401, float:1.436E-42)
            boolean r4 = r5 instanceof android.widget.Button     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L42
            r3 = r1 | 1029(0x405, float:1.442E-42)
            boolean r4 = r5 instanceof android.widget.Switch     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L39
            r1 = r1 | 9221(0x2405, float:1.2921E-41)
            goto L46
        L39:
            boolean r4 = r5 instanceof android.widget.CheckBox     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L42
            r3 = 33797(0x8405, float:4.736E-41)
            r1 = r1 | r3
            goto L46
        L42:
            r1 = r3
            goto L46
        L44:
            r5 = move-exception
            goto L7f
        L46:
            boolean r5 = r5 instanceof android.widget.EditText     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L7e
            r1 = r1 | 2048(0x800, float:2.87E-42)
            goto L7e
        L4d:
            boolean r3 = r5 instanceof android.widget.Spinner     // Catch: java.lang.Throwable -> L44
            if (r3 != 0) goto L7c
            boolean r3 = r5 instanceof android.widget.DatePicker     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L56
            goto L7c
        L56:
            boolean r3 = r5 instanceof android.widget.RatingBar     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L5e
            r5 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r5
            goto L7e
        L5e:
            boolean r3 = r5 instanceof android.widget.RadioGroup     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L65
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            goto L7e
        L65:
            boolean r3 = r5 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L7e
            C1.f r3 = C1.f.f913a     // Catch: java.lang.Throwable -> L44
            java.lang.ref.WeakReference r4 = C1.f.f915c     // Catch: java.lang.Throwable -> L44
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L44
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L44
            boolean r5 = r3.p(r5, r4)     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L7e
            r1 = r1 | 64
            goto L7e
        L7c:
            r1 = r1 | 4096(0x1000, float:5.74E-42)
        L7e:
            return r1
        L7f:
            T1.a.b(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.f.c(android.view.View):int");
    }

    public static final JSONObject d(View view) {
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.a(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f915c = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List b7 = b(view);
                int size = b7.size() - 1;
                if (size >= 0) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        jSONArray.put(d((View) b7.get(i7)));
                        if (i8 > size) {
                            break;
                        }
                        i7 = i8;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e7) {
                Log.e(f914b, "Failed to create JSONObject for view.", e7);
            }
            return jSONObject;
        } catch (Throwable th) {
            T1.a.b(th, f.class);
            return null;
        }
    }

    public static final View.OnClickListener g(View view) {
        Field declaredField;
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            T1.a.b(th, f.class);
            return null;
        }
    }

    public static final View.OnTouchListener h(View view) {
        String str;
        Field declaredField;
        try {
            if (T1.a.d(f.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        return (View.OnTouchListener) obj2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                } catch (ClassNotFoundException e7) {
                    e = e7;
                    P p7 = P.f3756a;
                    str = f914b;
                    P.i0(str, e);
                    return null;
                } catch (IllegalAccessException e8) {
                    e = e8;
                    P p8 = P.f3756a;
                    str = f914b;
                    P.i0(str, e);
                    return null;
                }
            } catch (NoSuchFieldException e9) {
                e = e9;
                P p9 = P.f3756a;
                str = f914b;
                P.i0(str, e);
                return null;
            }
        } catch (Throwable th) {
            T1.a.b(th, f.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:6:0x000a, B:8:0x000e, B:9:0x0010, B:12:0x0024, B:19:0x0017, B:21:0x001b), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String i(android.view.View r3) {
        /*
            java.lang.Class<C1.f> r0 = C1.f.class
            boolean r1 = T1.a.d(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r3 instanceof android.widget.EditText     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            android.widget.EditText r3 = (android.widget.EditText) r3     // Catch: java.lang.Throwable -> L15
        L10:
            java.lang.CharSequence r3 = r3.getHint()     // Catch: java.lang.Throwable -> L15
            goto L1f
        L15:
            r3 = move-exception
            goto L2d
        L17:
            boolean r1 = r3 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L1e
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Throwable -> L15
            goto L10
        L1e:
            r3 = r2
        L1f:
            java.lang.String r1 = ""
            if (r3 != 0) goto L24
            goto L2c
        L24:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L15
            if (r3 != 0) goto L2b
            goto L2c
        L2b:
            r1 = r3
        L2c:
            return r1
        L2d:
            T1.a.b(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.f.i(android.view.View):java.lang.String");
    }

    public static final ViewGroup j(View view) {
        if (T1.a.d(f.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, f.class);
            return null;
        }
    }

    public static final String k(View view) {
        CharSequence valueOf;
        Object selectedItem;
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    valueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else {
                int i7 = 0;
                if (view instanceof DatePicker) {
                    int year = ((DatePicker) view).getYear();
                    int month = ((DatePicker) view).getMonth();
                    int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                    x xVar = x.f16233a;
                    valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    Intrinsics.checkNotNullExpressionValue(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    Intrinsics.checkNotNullExpressionValue(currentMinute, "view.currentMinute");
                    int intValue2 = currentMinute.intValue();
                    x xVar2 = x.f16233a;
                    valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    if (childCount > 0) {
                        while (true) {
                            int i8 = i7 + 1;
                            View childAt = ((RadioGroup) view).getChildAt(i7);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                valueOf = ((RadioButton) childAt).getText();
                                break;
                            }
                            if (i8 >= childCount) {
                                break;
                            }
                            i7 = i8;
                        }
                    }
                    valueOf = null;
                } else {
                    if (view instanceof RatingBar) {
                        valueOf = String.valueOf(((RatingBar) view).getRating());
                    }
                    valueOf = null;
                }
                Intrinsics.checkNotNullExpressionValue(valueOf, "java.lang.String.format(format, *args)");
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th) {
            T1.a.b(th, f.class);
            return null;
        }
    }

    public static final boolean o(View view) {
        if (T1.a.d(f.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            f fVar = f913a;
            Class f7 = fVar.f("android.support.v4.view.NestedScrollingChild");
            if (f7 != null && f7.isInstance(parent)) {
                return true;
            }
            Class f8 = fVar.f("androidx.core.view.NestedScrollingChild");
            if (f8 != null) {
                return f8.isInstance(parent);
            }
            return false;
        } catch (Throwable th) {
            T1.a.b(th, f.class);
            return false;
        }
    }

    public static final void r(View view, View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Object obj = null;
            try {
                try {
                    field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                } catch (ClassNotFoundException | NoSuchFieldException unused) {
                    field = null;
                }
                try {
                    field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    field2 = null;
                    if (field != null) {
                    }
                    view.setOnClickListener(onClickListener);
                    return;
                }
                if (field != null || field2 == null) {
                    view.setOnClickListener(onClickListener);
                    return;
                }
                field.setAccessible(true);
                field2.setAccessible(true);
                try {
                    field.setAccessible(true);
                    obj = field.get(view);
                } catch (IllegalAccessException unused3) {
                }
                if (obj == null) {
                    view.setOnClickListener(onClickListener);
                } else {
                    field2.set(obj, onClickListener);
                }
            } catch (Exception unused4) {
            }
        } catch (Throwable th) {
            T1.a.b(th, f.class);
        }
    }

    public static final void s(View view, JSONObject json) {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String k7 = k(view);
                String i7 = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", c(view));
                json.put("id", view.getId());
                if (d.g(view)) {
                    json.put("text", "");
                    json.put("is_user_input", true);
                } else {
                    json.put("text", P.k(P.F0(k7), ""));
                }
                json.put("hint", P.k(P.F0(i7), ""));
                if (tag != null) {
                    json.put("tag", P.k(P.F0(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    json.put("description", P.k(P.F0(contentDescription.toString()), ""));
                }
                json.put("dimension", f913a.e(view));
            } catch (JSONException e7) {
                P p7 = P.f3756a;
                P.i0(f914b, e7);
            }
        } catch (Throwable th) {
            T1.a.b(th, f.class);
        }
    }

    public final JSONObject e(View view) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e7) {
                Log.e(f914b, "Failed to create JSONObject for dimension.", e7);
            }
            return jSONObject;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final Class f(String str) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final View l(float[] fArr, View view) {
        String str;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            n();
            Method method = f916d;
            if (method != null && view != null) {
                try {
                    try {
                        if (method == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        Object invoke = method.invoke(null, fArr, view);
                        if (invoke == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                        View view2 = (View) invoke;
                        if (view2.getId() > 0) {
                            Object parent = view2.getParent();
                            if (parent != null) {
                                return (View) parent;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } catch (IllegalAccessException e7) {
                        e = e7;
                        P p7 = P.f3756a;
                        str = f914b;
                        P.i0(str, e);
                        return null;
                    }
                } catch (InvocationTargetException e8) {
                    e = e8;
                    P p8 = P.f3756a;
                    str = f914b;
                    P.i0(str, e);
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final float[] m(View view) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            view.getLocationOnScreen(new int[2]);
            return new float[]{r2[0], r2[1]};
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final void n() {
        String str;
        if (T1.a.d(this)) {
            return;
        }
        try {
            if (f916d != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f916d = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e7) {
                e = e7;
                P p7 = P.f3756a;
                str = f914b;
                P.i0(str, e);
            } catch (NoSuchMethodException e8) {
                e = e8;
                P p8 = P.f3756a;
                str = f914b;
                P.i0(str, e);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final boolean p(View view, View view2) {
        View l7;
        if (T1.a.d(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (!Intrinsics.a(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup") || (l7 = l(m(view), view2)) == null) {
                return false;
            }
            return l7.getId() == view.getId();
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final boolean q(View view) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return Intrinsics.a(view.getClass().getName(), "com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }
}
