// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v5;

import E5.o;
import E5.n;
import E5.m;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import android.app.Activity;
import android.os.Bundle;
import java.util.Iterator;
import android.content.Intent;
import io.flutter.view.TextureRegistry;
import E5.c;
import java.util.HashMap;
import y5.f;
import android.content.Context;
import android.content.ContentProvider;
import android.content.BroadcastReceiver;
import android.app.Service;
import u5.d;
import io.flutter.embedding.engine.a;
import java.util.Map;

public class b implements b, B5.b
{
    public final Map a;
    public final a b;
    public final A5.a.b c;
    public final Map d;
    public d e;
    public c f;
    public boolean g;
    public final Map h;
    public Service i;
    public final Map j;
    public BroadcastReceiver k;
    public final Map l;
    public ContentProvider m;
    
    public b(final Context context, final a b, final f f, final io.flutter.embedding.engine.b b2) {
        this.a = new HashMap();
        this.d = new HashMap();
        this.g = false;
        this.h = new HashMap();
        this.j = new HashMap();
        this.l = new HashMap();
        this.b = b;
        this.c = new A5.a.b(context, b, b.k(), b.t(), b.q().M(), new b(f, null), b2);
    }
    
    @Override
    public boolean a(final int n, final int n2, final Intent intent) {
        if (this.r()) {
            final T5.f i = T5.f.i("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                final boolean a = this.f.a(n, n2, intent);
                if (i != null) {
                    i.close();
                }
                return a;
            }
            finally {
                if (i != null) {
                    try {
                        i.close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)intent).addSuppressed(exception);
                    }
                }
            }
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
        return false;
    }
    
    @Override
    public boolean b(final int n, final String[] array, final int[] array2) {
        if (this.r()) {
            final T5.f i = T5.f.i("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                final boolean j = this.f.j(n, array, array2);
                if (i != null) {
                    i.close();
                }
                return j;
            }
            finally {
                if (i != null) {
                    try {
                        i.close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)(Object)array).addSuppressed(exception);
                    }
                }
            }
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
        return false;
    }
    
    @Override
    public void c(final A5.a a) {
        final StringBuilder sb = new StringBuilder();
        sb.append("FlutterEngineConnectionRegistry#add ");
        sb.append(a.getClass().getSimpleName());
        final T5.f i = T5.f.i(sb.toString());
        Label_0121: {
            try {
                if (this.q(a.getClass())) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Attempted to register plugin (");
                    sb2.append(a);
                    sb2.append(") but it was already registered with this FlutterEngine (");
                    sb2.append(this.b);
                    sb2.append(").");
                    t5.b.g("FlutterEngineCxnRegstry", sb2.toString());
                    if (i != null) {
                        i.close();
                    }
                    return;
                }
                break Label_0121;
            }
            finally {
                if (i != null) {
                    try {
                        i.close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)a).addSuppressed(exception);
                    }
                }
                // iftrue(Label_0235:, i == null)
                // iftrue(Label_0227:, !this.r())
                // iftrue(Label_0227:, !a instanceof B5.a)
                Block_8: {
                    while (true) {
                        while (true) {
                            final B5.a a2;
                            a2.onAttachedToActivity(this.f);
                            Label_0227: {
                                break Block_8;
                            }
                            a2 = (B5.a)a;
                            this.d.put(a.getClass(), a2);
                            continue;
                        }
                        Label_0235: {
                            return;
                        }
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Adding plugin: ");
                        sb3.append(a);
                        t5.b.f("FlutterEngineCxnRegstry", sb3.toString());
                        this.a.put(a.getClass(), a);
                        a.onAttachedToEngine(this.c);
                        continue;
                    }
                }
                i.close();
            }
        }
    }
    
    @Override
    public void d() {
        while (true) {
            if (this.r()) {
                final T5.f i = T5.f.i("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                while (true) {
                    try {
                        this.g = true;
                        final Iterator<B5.a> iterator = this.d.values().iterator();
                        while (iterator.hasNext()) {
                            iterator.next().onDetachedFromActivityForConfigChanges();
                        }
                        this.l();
                        if (i != null) {
                            i.close();
                            return;
                        }
                        return;
                        // iftrue(Label_0089:, i == null)
                        try {
                            i.close();
                        }
                        finally {
                            final Throwable t;
                            t.addSuppressed((Throwable)i);
                        }
                        t5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                        return;
                        Label_0089:;
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
    
    @Override
    public void e(final Bundle bundle) {
        if (this.r()) {
            final T5.f i = T5.f.i("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                this.f.k(bundle);
                if (i != null) {
                    i.close();
                }
                return;
            }
            finally {
                if (i != null) {
                    try {
                        i.close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)bundle).addSuppressed(exception);
                    }
                }
            }
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
    }
    
    @Override
    public void f() {
        while (true) {
            if (this.r()) {
                final T5.f i = T5.f.i("FlutterEngineConnectionRegistry#detachFromActivity");
                while (true) {
                    try {
                        final Iterator<B5.a> iterator = this.d.values().iterator();
                        while (iterator.hasNext()) {
                            iterator.next().onDetachedFromActivity();
                        }
                        this.l();
                        if (i != null) {
                            i.close();
                            return;
                        }
                        return;
                        t5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
                        return;
                        // iftrue(Label_0084:, i == null)
                        while (true) {
                            try {
                                i.close();
                            }
                            finally {
                                final Throwable t;
                                t.addSuppressed((Throwable)i);
                            }
                            continue;
                        }
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
    
    @Override
    public void g(final Bundle bundle) {
        if (this.r()) {
            final T5.f i = T5.f.i("FlutterEngineConnectionRegistry#onSaveInstanceState");
            try {
                this.f.l(bundle);
                if (i != null) {
                    i.close();
                }
                return;
            }
            finally {
                if (i != null) {
                    try {
                        i.close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)bundle).addSuppressed(exception);
                    }
                }
            }
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
    }
    
    @Override
    public void h() {
        if (this.r()) {
            final T5.f i = T5.f.i("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                this.f.m();
                if (i != null) {
                    i.close();
                }
                return;
            }
            finally {
                if (i != null) {
                    try {
                        i.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable exception;
                        t.addSuppressed(exception);
                    }
                }
            }
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
    }
    
    @Override
    public void i(final d e, final androidx.lifecycle.d d) {
        final T5.f i = T5.f.i("FlutterEngineConnectionRegistry#attachToActivity");
        while (true) {
            try {
                final d e2 = this.e;
                if (e2 != null) {
                    e2.d();
                }
                this.m();
                this.e = e;
                this.j((Activity)e.e(), d);
                if (i != null) {
                    i.close();
                }
                return;
                Label_0076: {
                    throw e;
                }
                // iftrue(Label_0076:, i == null)
                try {
                    i.close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)e).addSuppressed(exception);
                }
                throw e;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void j(final Activity activity, final androidx.lifecycle.d d) {
        this.f = new c(activity, d);
        this.b.q().f0(activity.getIntent() != null && activity.getIntent().getBooleanExtra("enable-software-rendering", false));
        this.b.q().u((Context)activity, this.b.t(), this.b.k());
        for (final B5.a a : this.d.values()) {
            if (this.g) {
                a.onReattachedToActivityForConfigChanges(this.f);
            }
            else {
                a.onAttachedToActivity(this.f);
            }
        }
        this.g = false;
    }
    
    public void k() {
        t5.b.f("FlutterEngineCxnRegstry", "Destroying.");
        this.m();
        this.x();
    }
    
    public final void l() {
        this.b.q().E();
        this.e = null;
        this.f = null;
    }
    
    public final void m() {
        if (this.r()) {
            this.f();
            return;
        }
        if (this.u()) {
            this.p();
            return;
        }
        if (this.s()) {
            this.n();
            return;
        }
        if (this.t()) {
            this.o();
        }
    }
    
    public void n() {
        if (this.s()) {
            final T5.f i = T5.f.i("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
            try {
                final Iterator<Object> iterator = this.j.values().iterator();
                if (iterator.hasNext()) {
                    android.support.v4.media.a.a(iterator.next());
                    throw null;
                }
                if (i != null) {
                    i.close();
                }
                return;
            }
            finally {
                if (i != null) {
                    try {
                        i.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable exception;
                        t.addSuppressed(exception);
                    }
                }
            }
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
    }
    
    public void o() {
        if (this.t()) {
            final T5.f i = T5.f.i("FlutterEngineConnectionRegistry#detachFromContentProvider");
            try {
                final Iterator<Object> iterator = this.l.values().iterator();
                if (iterator.hasNext()) {
                    android.support.v4.media.a.a(iterator.next());
                    throw null;
                }
                if (i != null) {
                    i.close();
                }
                return;
            }
            finally {
                if (i != null) {
                    try {
                        i.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable exception;
                        t.addSuppressed(exception);
                    }
                }
            }
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
    }
    
    @Override
    public void onNewIntent(final Intent intent) {
        if (this.r()) {
            final T5.f i = T5.f.i("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                this.f.b(intent);
                if (i != null) {
                    i.close();
                }
                return;
            }
            finally {
                if (i != null) {
                    try {
                        i.close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)intent).addSuppressed(exception);
                    }
                }
            }
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
    }
    
    public void p() {
        if (this.u()) {
            final T5.f i = T5.f.i("FlutterEngineConnectionRegistry#detachFromService");
            Label_0056: {
                try {
                    final Iterator<Object> iterator = this.h.values().iterator();
                    if (iterator.hasNext()) {
                        break Label_0056;
                    }
                    this.i = null;
                    if (i != null) {
                        i.close();
                    }
                    return;
                }
                finally {
                    if (i != null) {
                        try {
                            i.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable exception;
                            t.addSuppressed(exception);
                        }
                    }
                    final Iterator<Object> iterator;
                    android.support.v4.media.a.a(iterator.next());
                    throw null;
                }
            }
        }
        t5.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
    }
    
    public boolean q(final Class clazz) {
        return this.a.containsKey(clazz);
    }
    
    public final boolean r() {
        return this.e != null;
    }
    
    public final boolean s() {
        return this.k != null;
    }
    
    public final boolean t() {
        return this.m != null;
    }
    
    public final boolean u() {
        return this.i != null;
    }
    
    public void v(final Class clazz) {
        final A5.a a = this.a.get(clazz);
        if (a == null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("FlutterEngineConnectionRegistry#remove ");
        sb.append(clazz.getSimpleName());
        final T5.f i = T5.f.i(sb.toString());
        while (true) {
            try {
                if (a instanceof B5.a) {
                    if (this.r()) {
                        ((B5.a)a).onDetachedFromActivity();
                    }
                    this.d.remove(clazz);
                }
                a.onDetachedFromEngine(this.c);
                this.a.remove(clazz);
                if (i != null) {
                    i.close();
                }
                return;
                // iftrue(Label_0136:, i == null)
                try {
                    i.close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)clazz).addSuppressed(exception);
                }
                Label_0136: {
                    throw clazz;
                }
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void w(final Set set) {
        final Iterator<Class> iterator = set.iterator();
        while (iterator.hasNext()) {
            this.v(iterator.next());
        }
    }
    
    public void x() {
        this.w(new HashSet(this.a.keySet()));
        this.a.clear();
    }
    
    public static class b implements a
    {
        public final f a;
        
        public b(final f a) {
            this.a = a;
        }
    }
    
    public static class c implements B5.c
    {
        public final Activity a;
        public final HiddenLifecycleReference b;
        public final Set c;
        public final Set d;
        public final Set e;
        public final Set f;
        public final Set g;
        public final Set h;
        
        public c(final Activity a, final androidx.lifecycle.d d) {
            this.c = new HashSet();
            this.d = new HashSet();
            this.e = new HashSet();
            this.f = new HashSet();
            this.g = new HashSet();
            this.h = new HashSet();
            this.a = a;
            this.b = new HiddenLifecycleReference(d);
        }
        
        public boolean a(final int n, final int n2, final Intent intent) {
            final Iterator<m> iterator = new HashSet<m>(this.d).iterator();
            boolean b = false;
        Label_0016:
            while (true) {
                b = false;
                while (iterator.hasNext()) {
                    if (!iterator.next().a(n, n2, intent) && !b) {
                        continue Label_0016;
                    }
                    b = true;
                }
                break;
            }
            return b;
        }
        
        public void b(final Intent intent) {
            final Iterator<n> iterator = this.e.iterator();
            while (iterator.hasNext()) {
                iterator.next().onNewIntent(intent);
            }
        }
        
        @Override
        public Activity c() {
            return this.a;
        }
        
        @Override
        public void d(final m m) {
            this.d.remove(m);
        }
        
        @Override
        public void e(final o o) {
            this.c.add(o);
        }
        
        @Override
        public void f(final o o) {
            this.c.remove(o);
        }
        
        @Override
        public void g(final n n) {
            this.e.add(n);
        }
        
        @Override
        public void h(final m m) {
            this.d.add(m);
        }
        
        @Override
        public void i(final n n) {
            this.e.remove(n);
        }
        
        public boolean j(final int n, final String[] array, final int[] array2) {
            final Iterator<o> iterator = this.c.iterator();
            boolean b = false;
        Label_0011:
            while (true) {
                b = false;
                while (iterator.hasNext()) {
                    if (!iterator.next().b(n, array, array2) && !b) {
                        continue Label_0011;
                    }
                    b = true;
                }
                break;
            }
            return b;
        }
        
        public void k(final Bundle bundle) {
            final Iterator<Object> iterator = (Iterator<Object>)this.h.iterator();
            if (!iterator.hasNext()) {
                return;
            }
            android.support.v4.media.a.a(iterator.next());
            throw null;
        }
        
        public void l(final Bundle bundle) {
            final Iterator<Object> iterator = (Iterator<Object>)this.h.iterator();
            if (!iterator.hasNext()) {
                return;
            }
            android.support.v4.media.a.a(iterator.next());
            throw null;
        }
        
        public void m() {
            final Iterator<Object> iterator = (Iterator<Object>)this.f.iterator();
            if (!iterator.hasNext()) {
                return;
            }
            android.support.v4.media.a.a(iterator.next());
            throw null;
        }
    }
}
