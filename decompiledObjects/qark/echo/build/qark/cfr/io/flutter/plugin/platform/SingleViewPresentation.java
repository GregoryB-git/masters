/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.Presentation
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.view.Display
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.FrameLayout
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Thread
 */
package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.plugin.platform.j;
import io.flutter.plugin.platform.s;
import io.flutter.plugin.platform.z;

@Keep
class SingleViewPresentation
extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused = false;
    private final d state;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.a a8, d d8, View.OnFocusChangeListener onFocusChangeListener, boolean bl) {
        super((Context)new b(context), display);
        this.accessibilityEventsDelegate = a8;
        this.state = d8;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        this.getWindow().setFlags(8, 8);
        this.startFocused = bl;
    }

    public SingleViewPresentation(Context object, Display display, j j8, io.flutter.plugin.platform.a a8, int n8, View.OnFocusChangeListener onFocusChangeListener) {
        super((Context)new b((Context)object), display);
        this.accessibilityEventsDelegate = a8;
        this.viewId = n8;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = object;
        this.state = object = new d();
        d.b((d)object, j8);
        this.getWindow().setFlags(8, 8);
        this.getWindow().setType(2030);
    }

    public d detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return this.state;
    }

    public j getView() {
        d.a(this.state);
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        if (this.state.b == null) {
            this.state.b = new s(this.getContext());
        }
        if (this.state.a == null) {
            bundle = (WindowManager)this.getContext().getSystemService("window");
            d d8 = this.state;
            d8.a = new z((WindowManager)bundle, d8.b);
        }
        this.container = new FrameLayout(this.getContext());
        new c(this.getContext(), this.state.a, this.outerContext);
        d.a(this.state);
        throw null;
    }

    public static abstract class a
    extends FrameLayout {
    }

    public static class b
    extends ContextWrapper {
        public final InputMethodManager a;

        public b(Context context) {
            this(context, null);
        }

        public b(Context context, InputMethodManager inputMethodManager) {
            super(context);
            if (inputMethodManager == null) {
                inputMethodManager = (InputMethodManager)context.getSystemService("input_method");
            }
            this.a = inputMethodManager;
        }

        public Context createDisplayContext(Display display) {
            return new b(super.createDisplayContext(display), this.a);
        }

        public Object getSystemService(String string2) {
            if ("input_method".equals((Object)string2)) {
                return this.a;
            }
            return super.getSystemService(string2);
        }
    }

    public static class c
    extends ContextWrapper {
        public final z a;
        public WindowManager b;
        public final Context c;

        public c(Context context, z z8, Context context2) {
            super(context);
            this.a = z8;
            this.c = context2;
        }

        public final WindowManager a() {
            if (this.b == null) {
                this.b = this.a;
            }
            return this.b;
        }

        public final boolean b() {
            StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
            for (int i8 = 0; i8 < arrstackTraceElement.length && i8 < 11; ++i8) {
                if (!arrstackTraceElement[i8].getClassName().equals((Object)AlertDialog.class.getCanonicalName()) || !arrstackTraceElement[i8].getMethodName().equals((Object)"<init>")) continue;
                return true;
            }
            return false;
        }

        public Object getSystemService(String string2) {
            if ("window".equals((Object)string2)) {
                if (this.b()) {
                    return this.c.getSystemService(string2);
                }
                return this.a();
            }
            return super.getSystemService(string2);
        }
    }

    public static class d {
        public z a;
        public s b;

        public static /* synthetic */ j a(d d8) {
            d8.getClass();
            return null;
        }

        public static /* synthetic */ j b(d d8, j j8) {
            d8.getClass();
            return j8;
        }
    }

}

