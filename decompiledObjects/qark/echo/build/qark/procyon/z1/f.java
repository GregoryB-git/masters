// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z1;

import kotlin.text.Regex;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.List;
import y1.F;
import kotlin.text.i;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;
import T1.a;
import android.view.View;
import android.os.Looper;
import java.util.LinkedHashSet;
import android.app.Activity;
import java.util.HashMap;
import kotlin.jvm.internal.g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.ref.WeakReference;
import android.os.Handler;
import java.util.Set;
import java.util.Map;
import android.view.ViewTreeObserver$OnGlobalFocusChangeListener;

public final class f implements ViewTreeObserver$OnGlobalFocusChangeListener
{
    public static final a s;
    public static final Map t;
    public final Set o;
    public final Handler p;
    public final WeakReference q;
    public final AtomicBoolean r;
    
    static {
        s = new a(null);
        t = new HashMap();
    }
    
    public f(final Activity referent) {
        this.o = new LinkedHashSet();
        this.p = new Handler(Looper.getMainLooper());
        this.q = new WeakReference((T)referent);
        this.r = new AtomicBoolean(false);
    }
    
    public static final /* synthetic */ Map b() {
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            return f.t;
        }
        finally {
            final Throwable t;
            T1.a.b(t, f.class);
            return null;
        }
    }
    
    public static final /* synthetic */ void c(final f f) {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            f.h();
        }
        finally {
            final Throwable t;
            T1.a.b(t, f.class);
        }
    }
    
    public static final void e(final View view, final f f) {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "$view");
            Intrinsics.checkNotNullParameter(f, "this$0");
            if (!(view instanceof EditText)) {
                return;
            }
            f.f(view);
        }
        finally {
            final Throwable t;
            T1.a.b(t, f.class);
        }
    }
    
    public final void d(final View view) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.g(new e(view, this));
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void f(final View view) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final String string = ((EditText)view).getText().toString();
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                final String string2 = i.f0(string).toString();
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                final String lowerCase = string2.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (lowerCase.length() == 0) {
                    return;
                }
                if (this.o.contains(lowerCase)) {
                    return;
                }
                if (lowerCase.length() > 100) {
                    return;
                }
                this.o.add(lowerCase);
                final HashMap hashMap = new HashMap();
                final List b = c.b(view);
                final Iterator<d> iterator = (Iterator<d>)d.d.c().iterator();
                List list = null;
                while (iterator.hasNext()) {
                    final d d = iterator.next();
                    final a s = f.s;
                    final String a = s.c(d.c(), lowerCase);
                    if (d.d().length() > 0) {
                        final c a2 = c.a;
                        if (!c.f(a, d.d())) {
                            continue;
                        }
                    }
                    final c a3 = c.a;
                    String c;
                    if (z1.c.e(b, d.b())) {
                        c = d.c();
                    }
                    else {
                        List a4;
                        if ((a4 = list) == null) {
                            a4 = z1.c.a(view);
                        }
                        list = a4;
                        if (!z1.c.e(a4, d.b())) {
                            continue;
                        }
                        final String c2 = d.c();
                        list = a4;
                        c = c2;
                    }
                    s.d(hashMap, c, a);
                }
                F.b.e(hashMap);
                return;
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void g(final Runnable runnable) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    runnable.run();
                    return;
                }
                this.p.post(runnable);
                return;
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void h() {
        if (T1.a.d(this)) {
            return;
        }
        Label_0066: {
            try {
                if (this.r.getAndSet(true)) {
                    return;
                }
                final G1.g a = G1.g.a;
                final View e = G1.g.e((Activity)this.q.get());
                if (e == null) {
                    return;
                }
                final ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalFocusChangeListener((ViewTreeObserver$OnGlobalFocusChangeListener)this);
                    return;
                }
            }
            finally {
                break Label_0066;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, this);
    }
    
    public void onGlobalFocusChanged(final View view, final View view2) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            if (view != null) {
                while (true) {
                    try {
                        this.d(view);
                        if (view2 != null) {
                            this.d(view2);
                            return;
                        }
                        return;
                        final Throwable t;
                        T1.a.b(t, this);
                        return;
                    }
                    finally {}
                    final Throwable t2;
                    final Throwable t = t2;
                    continue;
                }
            }
            continue;
        }
    }
    
    public static final class a
    {
        public final String c(final String s, final String s2) {
            String replace = s2;
            if (Intrinsics.a("r2", s)) {
                replace = new Regex("[^\\d.]").replace(s2, "");
            }
            return replace;
        }
        
        public final void d(final Map map, final String s, final String s2) {
            String replace = null;
            Label_0239: {
                switch (s.hashCode()) {
                    default: {
                        replace = s2;
                        break Label_0239;
                    }
                    case 3588: {
                        if (!s.equals("r6")) {
                            replace = s2;
                            break Label_0239;
                        }
                        replace = s2;
                        if (!i.v(s2, "-", false, 2, null)) {
                            break Label_0239;
                        }
                        final Object[] array = new Regex("-").c(s2, 0).toArray(new String[0]);
                        if (array != null) {
                            replace = ((String[])array)[0];
                            break Label_0239;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    case 3587: {
                        if (!s.equals("r5")) {
                            replace = s2;
                            break Label_0239;
                        }
                        break;
                    }
                    case 3586: {
                        if (!s.equals("r4")) {
                            replace = s2;
                            break Label_0239;
                        }
                        break;
                    }
                    case 3585: {
                        if (!s.equals("r3")) {
                            replace = s2;
                            break Label_0239;
                        }
                        if (!i.s(s2, "m", false, 2, null) && !i.s(s2, "b", false, 2, null) && !i.s(s2, "ge", false, 2, null)) {
                            replace = "f";
                            break Label_0239;
                        }
                        replace = "m";
                        break Label_0239;
                    }
                }
                replace = new Regex("[^a-z]+").replace(s2, "");
            }
            map.put(s, replace);
        }
        
        public final void e(final Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            final int hashCode = activity.hashCode();
            final Map b = f.b();
            final Integer value = hashCode;
            f value2;
            if ((value2 = b.get(value)) == null) {
                value2 = new f(activity, null);
                b.put(value, value2);
            }
            f.c(value2);
        }
    }
}
