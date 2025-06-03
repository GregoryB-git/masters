// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.view.LayoutInflater;
import androidx.activity.OnBackPressedDispatcher;
import android.view.Window;
import androidx.lifecycle.t;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.c;
import androidx.lifecycle.u;
import android.view.MenuItem;
import android.view.Menu;
import android.content.res.Configuration;
import android.content.Intent;
import c.b;
import android.os.Parcelable;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.Iterator;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import w.a;
import androidx.activity.ComponentActivity;

public abstract class e extends ComponentActivity implements w.a.e
{
    public boolean A;
    public boolean B;
    public boolean C;
    public final i y;
    public final androidx.lifecycle.i z;
    
    public e() {
        this.y = i.b(new c());
        this.z = new androidx.lifecycle.i(this);
        this.C = true;
        this.o();
    }
    
    public static boolean q(final n n, final androidx.lifecycle.d.c c) {
        final Iterator iterator = n.r0().iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            final Fragment fragment = iterator.next();
            if (fragment == null) {
                continue;
            }
            boolean b2 = b;
            if (fragment.z() != null) {
                b2 = (b | q(fragment.s(), c));
            }
            final z h0 = fragment.h0;
            b = b2;
            if (h0 != null) {
                b = b2;
                if (h0.g().b().c(d.c.r)) {
                    fragment.h0.f(c);
                    b = true;
                }
            }
            if (!fragment.g0.b().c(d.c.r)) {
                continue;
            }
            fragment.g0.o(c);
            b = true;
        }
        return b;
    }
    
    @Override
    public final void a(final int n) {
    }
    
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        printWriter.print(s);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("  ");
        final String string = sb.toString();
        printWriter.print(string);
        printWriter.print("mCreated=");
        printWriter.print(this.A);
        printWriter.print(" mResumed=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        if (this.getApplication() != null) {
            Y.a.b(this).a(string, fileDescriptor, printWriter, array);
        }
        this.y.t().W(s, fileDescriptor, printWriter, array);
    }
    
    public final View m(final View view, final String s, final Context context, final AttributeSet set) {
        return this.y.v(view, s, context, set);
    }
    
    public n n() {
        return this.y.t();
    }
    
    public final void o() {
        this.k().d("android:support:fragments", (SavedStateRegistry.b)new SavedStateRegistry.b() {
            @Override
            public Bundle a() {
                final Bundle bundle = new Bundle();
                e.this.p();
                e.this.z.h(d.b.ON_STOP);
                final Parcelable x = e.this.y.x();
                if (x != null) {
                    bundle.putParcelable("android:support:fragments", x);
                }
                return bundle;
            }
        });
        this.f(new c.b() {
            @Override
            public void a(final Context context) {
                e.this.y.a(null);
                final Bundle a = e.this.k().a("android:support:fragments");
                if (a != null) {
                    e.this.y.w(a.getParcelable("android:support:fragments"));
                }
            }
        });
    }
    
    @Override
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        this.y.u();
        super.onActivityResult(n, n2, intent);
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.y.u();
        this.y.d(configuration);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.z.h(d.b.ON_CREATE);
        this.y.f();
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        if (n == 0) {
            return super.onCreatePanelMenu(n, menu) | this.y.g(menu, this.getMenuInflater());
        }
        return super.onCreatePanelMenu(n, menu);
    }
    
    public View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        final View m = this.m(view, s, context, set);
        if (m == null) {
            return super.onCreateView(view, s, context, set);
        }
        return m;
    }
    
    public View onCreateView(final String s, final Context context, final AttributeSet set) {
        final View m = this.m(null, s, context, set);
        if (m == null) {
            return super.onCreateView(s, context, set);
        }
        return m;
    }
    
    public void onDestroy() {
        super.onDestroy();
        this.y.h();
        this.z.h(d.b.ON_DESTROY);
    }
    
    public void onLowMemory() {
        super.onLowMemory();
        this.y.i();
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        if (super.onMenuItemSelected(n, menuItem)) {
            return true;
        }
        if (n != 0) {
            return n == 6 && this.y.e(menuItem);
        }
        return this.y.k(menuItem);
    }
    
    public void onMultiWindowModeChanged(final boolean b) {
        this.y.j(b);
    }
    
    public void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.y.u();
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        if (n == 0) {
            this.y.l(menu);
        }
        super.onPanelClosed(n, menu);
    }
    
    public void onPause() {
        super.onPause();
        this.B = false;
        this.y.m();
        this.z.h(d.b.ON_PAUSE);
    }
    
    public void onPictureInPictureModeChanged(final boolean b) {
        this.y.n(b);
    }
    
    public void onPostResume() {
        super.onPostResume();
        this.t();
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        if (n == 0) {
            return this.s(view, menu) | this.y.o(menu);
        }
        return super.onPreparePanel(n, view, menu);
    }
    
    @Override
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        this.y.u();
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    public void onResume() {
        super.onResume();
        this.B = true;
        this.y.u();
        this.y.s();
    }
    
    public void onStart() {
        super.onStart();
        this.C = false;
        if (!this.A) {
            this.A = true;
            this.y.c();
        }
        this.y.u();
        this.y.s();
        this.z.h(d.b.ON_START);
        this.y.q();
    }
    
    public void onStateNotSaved() {
        this.y.u();
    }
    
    public void onStop() {
        super.onStop();
        this.C = true;
        this.p();
        this.y.r();
        this.z.h(d.b.ON_STOP);
    }
    
    public void p() {
        while (q(this.n(), androidx.lifecycle.d.c.q)) {}
    }
    
    public void r(final Fragment fragment) {
    }
    
    public boolean s(final View view, final Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }
    
    public void t() {
        this.z.h(d.b.ON_RESUME);
        this.y.p();
    }
    
    public void u() {
        this.invalidateOptionsMenu();
    }
    
    public class c extends k implements u, androidx.activity.c, androidx.activity.result.d, r
    {
        public c() {
            super(e.this);
        }
        
        @Override
        public void a(final n n, final Fragment fragment) {
            e.this.r(fragment);
        }
        
        @Override
        public ActivityResultRegistry c() {
            return e.this.c();
        }
        
        @Override
        public t d() {
            return e.this.d();
        }
        
        @Override
        public View e(final int n) {
            return e.this.findViewById(n);
        }
        
        @Override
        public boolean f() {
            final Window window = e.this.getWindow();
            return window != null && window.peekDecorView() != null;
        }
        
        @Override
        public d g() {
            return e.this.z;
        }
        
        @Override
        public OnBackPressedDispatcher j() {
            return e.this.j();
        }
        
        @Override
        public LayoutInflater n() {
            return e.this.getLayoutInflater().cloneInContext((Context)e.this);
        }
        
        @Override
        public boolean o(final Fragment fragment) {
            return e.this.isFinishing() ^ true;
        }
        
        @Override
        public void q() {
            e.this.u();
        }
        
        public e r() {
            return e.this;
        }
    }
}
