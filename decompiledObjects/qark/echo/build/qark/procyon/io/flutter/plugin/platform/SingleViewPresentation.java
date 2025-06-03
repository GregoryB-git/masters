// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.platform;

import android.view.ViewGroup;
import android.app.Dialog;
import android.app.AlertDialog;
import android.view.inputmethod.InputMethodManager;
import android.content.ContextWrapper;
import android.view.WindowManager;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.content.Context;
import android.view.View$OnFocusChangeListener;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import android.app.Presentation;

@Keep
class SingleViewPresentation extends Presentation
{
    private static final String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View$OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final d state;
    private int viewId;
    
    public SingleViewPresentation(final Context outerContext, final Display display, final io.flutter.plugin.platform.a accessibilityEventsDelegate, final d state, final View$OnFocusChangeListener focusChangeListener, final boolean startFocused) {
        super((Context)new b(outerContext), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.state = state;
        this.focusChangeListener = focusChangeListener;
        this.outerContext = outerContext;
        ((Dialog)this).getWindow().setFlags(8, 8);
        this.startFocused = startFocused;
    }
    
    public SingleViewPresentation(final Context outerContext, final Display display, final j j, final io.flutter.plugin.platform.a accessibilityEventsDelegate, final int viewId, final View$OnFocusChangeListener focusChangeListener) {
        super((Context)new b(outerContext), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.viewId = viewId;
        this.focusChangeListener = focusChangeListener;
        this.outerContext = outerContext;
        d.b(this.state = new d(), j);
        ((Dialog)this).getWindow().setFlags(8, 8);
        ((Dialog)this).getWindow().setType(2030);
    }
    
    public d detachState() {
        final FrameLayout container = this.container;
        if (container != null) {
            ((ViewGroup)container).removeAllViews();
        }
        return this.state;
    }
    
    public j getView() {
        d.a(this.state);
        return null;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((Dialog)this).getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        if (d.c(this.state) == null) {
            d.d(this.state, new s(((Dialog)this).getContext()));
        }
        if (d.e(this.state) == null) {
            final WindowManager windowManager = (WindowManager)((Dialog)this).getContext().getSystemService("window");
            final d state = this.state;
            d.f(state, new z(windowManager, d.c(state)));
        }
        this.container = new FrameLayout(((Dialog)this).getContext());
        new c(((Dialog)this).getContext(), d.e(this.state), this.outerContext);
        d.a(this.state);
        throw null;
    }
    
    public abstract static class a extends FrameLayout
    {
    }
    
    public static class b extends ContextWrapper
    {
        public final InputMethodManager a;
        
        public b(final Context context) {
            this(context, null);
        }
        
        public b(final Context context, InputMethodManager a) {
            super(context);
            if (a == null) {
                a = (InputMethodManager)context.getSystemService("input_method");
            }
            this.a = a;
        }
        
        public Context createDisplayContext(final Display display) {
            return (Context)new b(super.createDisplayContext(display), this.a);
        }
        
        public Object getSystemService(final String anObject) {
            if ("input_method".equals(anObject)) {
                return this.a;
            }
            return super.getSystemService(anObject);
        }
    }
    
    public static class c extends ContextWrapper
    {
        public final z a;
        public WindowManager b;
        public final Context c;
        
        public c(final Context context, final z a, final Context c) {
            super(context);
            this.a = a;
            this.c = c;
        }
        
        public final WindowManager a() {
            if (this.b == null) {
                this.b = (WindowManager)this.a;
            }
            return this.b;
        }
        
        public final boolean b() {
            final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int n = 0; n < stackTrace.length && n < 11; ++n) {
                if (stackTrace[n].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[n].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }
        
        public Object getSystemService(final String anObject) {
            if (!"window".equals(anObject)) {
                return super.getSystemService(anObject);
            }
            if (this.b()) {
                return this.c.getSystemService(anObject);
            }
            return this.a();
        }
    }
    
    public static class d
    {
        public z a;
        public s b;
        
        public static /* synthetic */ j a(final d d) {
            d.getClass();
            return null;
        }
        
        public static /* synthetic */ j b(final d d, final j j) {
            d.getClass();
            return j;
        }
        
        public static /* synthetic */ s c(final d d) {
            return d.b;
        }
        
        public static /* synthetic */ s d(final d d, final s b) {
            return d.b = b;
        }
        
        public static /* synthetic */ z e(final d d) {
            return d.a;
        }
        
        public static /* synthetic */ z f(final d d, final z a) {
            return d.a = a;
        }
    }
}
