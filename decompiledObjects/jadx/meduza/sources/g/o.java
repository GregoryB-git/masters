package g;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f5623b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f5624c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5625d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f5626e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f5627g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    public static final r.h<String, Constructor<? extends View>> f5628h = new r.h<>();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f5629a = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final View f5630a;

        /* renamed from: b, reason: collision with root package name */
        public final String f5631b;

        /* renamed from: c, reason: collision with root package name */
        public Method f5632c;

        /* renamed from: d, reason: collision with root package name */
        public Context f5633d;

        public a(View view, String str) {
            this.f5630a = view;
            this.f5631b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String sb2;
            Method method;
            if (this.f5632c == null) {
                Context context = this.f5630a.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f5631b, View.class)) != null) {
                            this.f5632c = method;
                            this.f5633d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.f5630a.getId();
                if (id == -1) {
                    sb2 = "";
                } else {
                    StringBuilder l10 = defpackage.f.l(" with id '");
                    l10.append(this.f5630a.getContext().getResources().getResourceEntryName(id));
                    l10.append("'");
                    sb2 = l10.toString();
                }
                StringBuilder l11 = defpackage.f.l("Could not find method ");
                l11.append(this.f5631b);
                l11.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                l11.append(this.f5630a.getClass());
                l11.append(sb2);
                throw new IllegalStateException(l11.toString());
            }
            try {
                this.f5632c.invoke(this.f5633d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public final View a(Context context, String str, String str2) {
        String str3;
        r.h<String, Constructor<? extends View>> hVar = f5628h;
        Constructor<? extends View> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f5623b);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f5629a);
    }
}
