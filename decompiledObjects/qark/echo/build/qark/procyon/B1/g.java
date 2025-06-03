// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B1;

import android.os.BaseBundle;
import kotlin.text.Regex;
import android.view.ViewParent;
import java.util.Collection;
import android.view.ViewGroup;
import C1.c;
import java.util.ArrayList;
import android.view.ViewTreeObserver;
import O1.r;
import O1.v;
import x1.B;
import android.view.View$OnTouchListener;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;
import O1.P;
import android.widget.ListView;
import android.widget.AdapterView;
import kotlin.text.i;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.ref.WeakReference;
import java.util.List;
import C1.b;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import x1.o;
import O1.z;
import android.app.Activity;
import T1.a;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import android.os.Looper;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import android.os.Handler;

public final class g
{
    public static final a f;
    public static final String g;
    public static g h;
    public final Handler a;
    public final Set b;
    public final Set c;
    public HashSet d;
    public final HashMap e;
    
    static {
        f = new a(null);
        g = g.class.getCanonicalName();
    }
    
    public g() {
        this.a = new Handler(Looper.getMainLooper());
        final Set<Object> setFromMap = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        Intrinsics.checkNotNullExpressionValue(setFromMap, "newSetFromMap(WeakHashMap())");
        this.b = setFromMap;
        this.c = new LinkedHashSet();
        this.d = new HashSet();
        this.e = new HashMap();
    }
    
    public static final /* synthetic */ g b() {
        if (T1.a.d(g.class)) {
            return null;
        }
        try {
            return B1.g.h;
        }
        finally {
            final Throwable t;
            T1.a.b(t, g.class);
            return null;
        }
    }
    
    public static final /* synthetic */ String c() {
        if (T1.a.d(g.class)) {
            return null;
        }
        try {
            return B1.g.g;
        }
        finally {
            final Throwable t;
            T1.a.b(t, g.class);
            return null;
        }
    }
    
    public static final /* synthetic */ void d(final g h) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            B1.g.h = h;
        }
        finally {
            final Throwable t;
            T1.a.b(t, g.class);
        }
    }
    
    public static final void j(final g g) {
        if (T1.a.d(g.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(g, "this$0");
            g.g();
        }
        finally {
            final Throwable t;
            T1.a.b(t, g.class);
        }
    }
    
    public final void e(final Activity activity) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (z.b()) {
                    return;
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    this.b.add(activity);
                    this.d.clear();
                    final HashSet d = this.e.get(activity.hashCode());
                    if (d != null) {
                        this.d = d;
                    }
                    this.i();
                    return;
                }
                throw new o("Can't add activity to CodelessMatcher on non-UI thread");
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void f(final Activity activity) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.e.remove(activity.hashCode());
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void g() {
        if (T1.a.d(this)) {
            return;
        }
        Label_0105: {
            try {
                for (final Activity activity : this.b) {
                    if (activity != null) {
                        final View e = G1.g.e(activity);
                        final String simpleName = activity.getClass().getSimpleName();
                        final Handler a = this.a;
                        final HashSet d = this.d;
                        Intrinsics.checkNotNullExpressionValue(simpleName, "activityName");
                        this.c.add(new c(e, a, d, simpleName));
                    }
                }
            }
            finally {
                break Label_0105;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, this);
    }
    
    public final void h(final Activity activity) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (z.b()) {
                    return;
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    this.b.remove(activity);
                    this.c.clear();
                    this.e.put(activity.hashCode(), this.d.clone());
                    this.d.clear();
                    return;
                }
                throw new o("Can't remove activity from CodelessMatcher on non-UI thread");
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void i() {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    this.g();
                    return;
                }
                this.a.post((Runnable)new f(this));
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
    
    public static final class a
    {
        public final g a() {
            // monitorenter(this)
            while (true) {
                try {
                    if (B1.g.b() == null) {
                        B1.g.d(new g(null));
                    }
                    final g b = B1.g.b();
                    if (b != null) {
                        // monitorexit(this)
                        return b;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
                    // monitorexit(this)
                    throw;
                }
                finally {
                    continue;
                }
                break;
            }
        }
        
        public final Bundle b(final C1.a a, final View view, final View view2) {
            Intrinsics.checkNotNullParameter(view, "rootView");
            Intrinsics.checkNotNullParameter(view2, "hostView");
            final Bundle bundle = new Bundle();
            if (a == null) {
                return bundle;
            }
            final List c = a.c();
            if (c != null) {
                for (final C1.b b : c) {
                    if (b.d() != null && b.d().length() > 0) {
                        ((BaseBundle)bundle).putString(b.a(), b.d());
                    }
                    else {
                        if (b.b().size() <= 0) {
                            continue;
                        }
                        final boolean a2 = Intrinsics.a(b.c(), "relative");
                        final c.a t = B1.g.c.t;
                        final List b2 = b.b();
                        String s;
                        View view3;
                        if (a2) {
                            s = view2.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(s, "hostView.javaClass.simpleName");
                            view3 = view2;
                        }
                        else {
                            s = view.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(s, "rootView.javaClass.simpleName");
                            view3 = view;
                        }
                        for (final b b3 : t.a(a, view3, b2, 0, -1, s)) {
                            if (b3.a() == null) {
                                continue;
                            }
                            final C1.f a3 = C1.f.a;
                            final String k = C1.f.k(b3.a());
                            if (k.length() > 0) {
                                ((BaseBundle)bundle).putString(b.a(), k);
                                break;
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }
    
    public static final class b
    {
        public final WeakReference a;
        public final String b;
        
        public b(final View referent, final String b) {
            Intrinsics.checkNotNullParameter(referent, "view");
            Intrinsics.checkNotNullParameter(b, "viewMapKey");
            this.a = new WeakReference((T)referent);
            this.b = b;
        }
        
        public final View a() {
            final WeakReference a = this.a;
            if (a == null) {
                return null;
            }
            return a.get();
        }
        
        public final String b() {
            return this.b;
        }
    }
    
    public static final class c implements ViewTreeObserver$OnGlobalLayoutListener, ViewTreeObserver$OnScrollChangedListener, Runnable
    {
        public static final a t;
        public final WeakReference o;
        public List p;
        public final Handler q;
        public final HashSet r;
        public final String s;
        
        static {
            t = new a(null);
        }
        
        public c(final View referent, final Handler q, final HashSet r, final String s) {
            Intrinsics.checkNotNullParameter(q, "handler");
            Intrinsics.checkNotNullParameter(r, "listenerSet");
            Intrinsics.checkNotNullParameter(s, "activityName");
            this.o = new WeakReference((T)referent);
            this.q = q;
            this.r = r;
            this.s = s;
            q.postDelayed((Runnable)this, 200L);
        }
        
        public final void a(final b b, final View view, final C1.a a) {
            if (a == null) {
                return;
            }
            while (true) {
                try {
                    final View a2 = b.a();
                    if (a2 == null) {
                        return;
                    }
                    final View a3 = C1.f.a(a2);
                    if (a3 != null && C1.f.a.p(a2, a3)) {
                        this.d(b, view, a);
                        return;
                    }
                    final String name = a2.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                    if (i.s(name, "com.facebook.react", false, 2, null)) {
                        return;
                    }
                    if (!(a2 instanceof AdapterView)) {
                        this.b(b, view, a);
                        return;
                    }
                    if (a2 instanceof ListView) {
                        this.c(b, view, a);
                        return;
                    }
                    return;
                    final P a4 = P.a;
                    final Exception ex;
                    P.i0(B1.g.c(), ex);
                    return;
                }
                catch (Exception ex2) {}
                final Exception ex2;
                final Exception ex = ex2;
                continue;
            }
        }
        
        public final void b(final b b, final View view, final C1.a a) {
            final View a2 = b.a();
            if (a2 == null) {
                return;
            }
            final String b2 = b.b();
            final View$OnClickListener g = C1.f.g(a2);
            boolean b3 = false;
            Label_0067: {
                if (g instanceof B1.b.a) {
                    if (g == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                    }
                    if (((B1.b.a)g).a()) {
                        b3 = true;
                        break Label_0067;
                    }
                }
                b3 = false;
            }
            if (!this.r.contains(b2) && !b3) {
                a2.setOnClickListener((View$OnClickListener)b.b(a, view, a2));
                this.r.add(b2);
            }
        }
        
        public final void c(final b b, final View view, final C1.a a) {
            final AdapterView adapterView = (AdapterView)b.a();
            if (adapterView == null) {
                return;
            }
            final String b2 = b.b();
            final AdapterView$OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            boolean b3 = false;
            Label_0070: {
                if (onItemClickListener instanceof B1.b.b) {
                    if (onItemClickListener == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                    }
                    if (((B1.b.b)onItemClickListener).a()) {
                        b3 = true;
                        break Label_0070;
                    }
                }
                b3 = false;
            }
            if (!this.r.contains(b2) && !b3) {
                adapterView.setOnItemClickListener((AdapterView$OnItemClickListener)b.c(a, view, adapterView));
                this.r.add(b2);
            }
        }
        
        public final void d(final b b, final View view, final C1.a a) {
            final View a2 = b.a();
            if (a2 == null) {
                return;
            }
            final String b2 = b.b();
            final View$OnTouchListener h = C1.f.h(a2);
            boolean b3 = false;
            Label_0067: {
                if (h instanceof h.a) {
                    if (h == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                    }
                    if (((h.a)h).a()) {
                        b3 = true;
                        break Label_0067;
                    }
                }
                b3 = false;
            }
            if (!this.r.contains(b2) && !b3) {
                a2.setOnTouchListener((View$OnTouchListener)B1.h.a(a, view, a2));
                this.r.add(b2);
            }
        }
        
        public final void e(final C1.a a, final View view) {
            if (a != null) {
                if (view == null) {
                    return;
                }
                final String a2 = a.a();
                if (a2 != null) {
                    if (a2.length() != 0) {
                        if (!Intrinsics.a(a.a(), this.s)) {
                            return;
                        }
                    }
                }
                final List d = a.d();
                if (d.size() > 25) {
                    return;
                }
                final Iterator iterator = c.t.a(a, view, d, 0, -1, this.s).iterator();
                while (iterator.hasNext()) {
                    this.a(iterator.next(), view, a);
                }
            }
        }
        
        public final void f() {
            final List p = this.p;
            if (p == null) {
                return;
            }
            if (this.o.get() != null) {
                final int n = p.size() - 1;
                if (n >= 0) {
                    int n2 = 0;
                    while (true) {
                        final int n3 = n2 + 1;
                        this.e(p.get(n2), (View)this.o.get());
                        if (n3 > n) {
                            break;
                        }
                        n2 = n3;
                    }
                }
            }
        }
        
        public void onGlobalLayout() {
            this.f();
        }
        
        public void onScrollChanged() {
            this.f();
        }
        
        public void run() {
            if (T1.a.d(this)) {
                return;
            }
            while (true) {
                try {
                    final r f = v.f(B.m());
                    if (f != null) {
                        if (!f.b()) {
                            return;
                        }
                        if ((this.p = C1.a.j.b(f.d())) != null) {
                            final View view = (View)this.o.get();
                            if (view == null) {
                                return;
                            }
                            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                                viewTreeObserver.addOnScrollChangedListener((ViewTreeObserver$OnScrollChangedListener)this);
                            }
                            this.f();
                        }
                    }
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
        
        public static final class a
        {
            public final List a(final C1.a a, final View view, final List list, final int n, int i, final String str) {
                Intrinsics.checkNotNullParameter(list, "path");
                Intrinsics.checkNotNullParameter(str, "mapKey");
                final StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('.');
                sb.append(i);
                final String string = sb.toString();
                final ArrayList<Object> list2 = new ArrayList<Object>();
                if (view == null) {
                    return list2;
                }
                Label_0307: {
                    b b;
                    if (n >= list.size()) {
                        b = new b(view, string);
                    }
                    else {
                        final C1.c c = list.get(n);
                        if (Intrinsics.a(c.a(), "..")) {
                            final ViewParent parent = view.getParent();
                            if (parent instanceof ViewGroup) {
                                final List b2 = this.b((ViewGroup)parent);
                                final int size = b2.size();
                                if (size > 0) {
                                    i = 0;
                                    while (true) {
                                        final int n2 = i + 1;
                                        list2.addAll(this.a(a, b2.get(i), list, n + 1, i, string));
                                        if (n2 >= size) {
                                            break;
                                        }
                                        i = n2;
                                    }
                                    return list2;
                                }
                            }
                            return list2;
                        }
                        if (Intrinsics.a(c.a(), ".")) {
                            list2.add(new b(view, string));
                            return list2;
                        }
                        if (!this.c(view, c, i)) {
                            return list2;
                        }
                        if (n != list.size() - 1) {
                            break Label_0307;
                        }
                        b = new b(view, string);
                    }
                    list2.add(b);
                }
                if (view instanceof ViewGroup) {
                    final List b3 = this.b((ViewGroup)view);
                    final int size2 = b3.size();
                    if (size2 > 0) {
                        i = 0;
                        while (true) {
                            final int n3 = i + 1;
                            list2.addAll(this.a(a, b3.get(i), list, n + 1, i, string));
                            if (n3 >= size2) {
                                break;
                            }
                            i = n3;
                        }
                        return list2;
                    }
                }
                return list2;
            }
            
            public final List b(final ViewGroup viewGroup) {
                final ArrayList<View> list = new ArrayList<View>();
                final int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int n = 0;
                    while (true) {
                        final int n2 = n + 1;
                        final View child = viewGroup.getChildAt(n);
                        if (child.getVisibility() == 0) {
                            Intrinsics.checkNotNullExpressionValue(child, "child");
                            list.add(child);
                        }
                        if (n2 >= childCount) {
                            break;
                        }
                        n = n2;
                    }
                    return list;
                }
                return list;
            }
            
            public final boolean c(final View view, final C1.c c, final int n) {
                if (c.e() != -1 && n != c.e()) {
                    return false;
                }
                Label_0134: {
                    if (!Intrinsics.a(view.getClass().getCanonicalName(), c.a())) {
                        if (new Regex(".*android\\..*").b(c.a())) {
                            final List v = i.V(c.a(), new String[] { "." }, false, 0, 6, null);
                            if ((((List<String>)v).isEmpty() ^ true) && Intrinsics.a(view.getClass().getSimpleName(), v.get(v.size() - 1))) {
                                break Label_0134;
                            }
                        }
                        return false;
                    }
                }
                if ((c.f() & C1.c.b.p.e()) > 0 && c.d() != view.getId()) {
                    return false;
                }
                if ((c.f() & C1.c.b.q.e()) > 0) {
                    final String h = c.h();
                    final String k = C1.f.k(view);
                    final String i = P.k(P.F0(k), "");
                    if (!Intrinsics.a(h, k) && !Intrinsics.a(h, i)) {
                        return false;
                    }
                }
                if ((c.f() & C1.c.b.s.e()) > 0) {
                    final String b = c.b();
                    String string;
                    if (view.getContentDescription() == null) {
                        string = "";
                    }
                    else {
                        string = view.getContentDescription().toString();
                    }
                    final String j = P.k(P.F0(string), "");
                    if (!Intrinsics.a(b, string) && !Intrinsics.a(b, j)) {
                        return false;
                    }
                }
                if ((c.f() & C1.c.b.t.e()) > 0) {
                    final String c2 = c.c();
                    final String l = C1.f.i(view);
                    final String m = P.k(P.F0(l), "");
                    if (!Intrinsics.a(c2, l) && !Intrinsics.a(c2, m)) {
                        return false;
                    }
                }
                if ((c.f() & C1.c.b.r.e()) > 0) {
                    final String g = c.g();
                    String string2;
                    if (view.getTag() == null) {
                        string2 = "";
                    }
                    else {
                        string2 = view.getTag().toString();
                    }
                    final String k2 = P.k(P.F0(string2), "");
                    if (!Intrinsics.a(g, string2) && !Intrinsics.a(g, k2)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }
}
