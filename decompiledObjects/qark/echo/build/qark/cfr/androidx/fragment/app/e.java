/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.Window
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Iterator
 *  java.util.List
 */
package androidx.fragment.app;

import Y.a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.k;
import androidx.fragment.app.n;
import androidx.fragment.app.r;
import androidx.fragment.app.z;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.savedstate.SavedStateRegistry;
import c.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import w.a;

public abstract class e
extends ComponentActivity
implements a.e {
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

    public static boolean q(n n8, d.c c8) {
        n8 = n8.r0().iterator();
        boolean bl = false;
        while (n8.hasNext()) {
            Fragment fragment = (Fragment)n8.next();
            if (fragment == null) continue;
            boolean bl2 = bl;
            if (fragment.z() != null) {
                bl2 = bl | e.q(fragment.s(), c8);
            }
            z z8 = fragment.h0;
            bl = bl2;
            if (z8 != null) {
                bl = bl2;
                if (z8.g().b().c(d.c.r)) {
                    fragment.h0.f(c8);
                    bl = true;
                }
            }
            if (!fragment.g0.b().c(d.c.r)) continue;
            fragment.g0.o(c8);
            bl = true;
        }
        return bl;
    }

    @Override
    public final void a(int n8) {
    }

    public void dump(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        Activity.super.dump(string2, fileDescriptor, printWriter, arrstring);
        printWriter.print(string2);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString((int)System.identityHashCode((Object)this)));
        printWriter.println(" State:");
        Object object = new StringBuilder();
        object.append(string2);
        object.append("  ");
        object = object.toString();
        printWriter.print((String)object);
        printWriter.print("mCreated=");
        printWriter.print(this.A);
        printWriter.print(" mResumed=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        if (this.getApplication() != null) {
            a.b(this).a((String)object, fileDescriptor, printWriter, arrstring);
        }
        this.y.t().W(string2, fileDescriptor, printWriter, arrstring);
    }

    public final View m(View view, String string2, Context context, AttributeSet attributeSet) {
        return this.y.v(view, string2, context, attributeSet);
    }

    public n n() {
        return this.y.t();
    }

    public final void o() {
        this.k().d("android:support:fragments", new SavedStateRegistry.b(){

            @Override
            public Bundle a() {
                Bundle bundle = new Bundle();
                e.this.p();
                e.this.z.h(d.b.ON_STOP);
                Parcelable parcelable = e.this.y.x();
                if (parcelable != null) {
                    bundle.putParcelable("android:support:fragments", parcelable);
                }
                return bundle;
            }
        });
        this.f(new b(){

            @Override
            public void a(Context context) {
                e.this.y.a(null);
                context = e.this.k().a("android:support:fragments");
                if (context != null) {
                    context = context.getParcelable("android:support:fragments");
                    e.this.y.w((Parcelable)context);
                }
            }
        });
    }

    @Override
    public void onActivityResult(int n8, int n9, Intent intent) {
        this.y.u();
        super.onActivityResult(n8, n9, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        Activity.super.onConfigurationChanged(configuration);
        this.y.u();
        this.y.d(configuration);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.z.h(d.b.ON_CREATE);
        this.y.f();
    }

    public boolean onCreatePanelMenu(int n8, Menu menu) {
        if (n8 == 0) {
            return Activity.super.onCreatePanelMenu(n8, menu) | this.y.g(menu, this.getMenuInflater());
        }
        return Activity.super.onCreatePanelMenu(n8, menu);
    }

    public View onCreateView(View view, String string2, Context context, AttributeSet attributeSet) {
        View view2 = this.m(view, string2, context, attributeSet);
        if (view2 == null) {
            return Activity.super.onCreateView(view, string2, context, attributeSet);
        }
        return view2;
    }

    public View onCreateView(String string2, Context context, AttributeSet attributeSet) {
        View view = this.m(null, string2, context, attributeSet);
        if (view == null) {
            return Activity.super.onCreateView(string2, context, attributeSet);
        }
        return view;
    }

    public void onDestroy() {
        Activity.super.onDestroy();
        this.y.h();
        this.z.h(d.b.ON_DESTROY);
    }

    public void onLowMemory() {
        Activity.super.onLowMemory();
        this.y.i();
    }

    public boolean onMenuItemSelected(int n8, MenuItem menuItem) {
        if (Activity.super.onMenuItemSelected(n8, menuItem)) {
            return true;
        }
        if (n8 != 0) {
            if (n8 != 6) {
                return false;
            }
            return this.y.e(menuItem);
        }
        return this.y.k(menuItem);
    }

    public void onMultiWindowModeChanged(boolean bl) {
        this.y.j(bl);
    }

    public void onNewIntent(Intent intent) {
        Activity.super.onNewIntent(intent);
        this.y.u();
    }

    public void onPanelClosed(int n8, Menu menu) {
        if (n8 == 0) {
            this.y.l(menu);
        }
        Activity.super.onPanelClosed(n8, menu);
    }

    public void onPause() {
        Activity.super.onPause();
        this.B = false;
        this.y.m();
        this.z.h(d.b.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean bl) {
        this.y.n(bl);
    }

    public void onPostResume() {
        Activity.super.onPostResume();
        this.t();
    }

    public boolean onPreparePanel(int n8, View view, Menu menu) {
        if (n8 == 0) {
            return this.s(view, menu) | this.y.o(menu);
        }
        return Activity.super.onPreparePanel(n8, view, menu);
    }

    @Override
    public void onRequestPermissionsResult(int n8, String[] arrstring, int[] arrn) {
        this.y.u();
        super.onRequestPermissionsResult(n8, arrstring, arrn);
    }

    public void onResume() {
        Activity.super.onResume();
        this.B = true;
        this.y.u();
        this.y.s();
    }

    public void onStart() {
        Activity.super.onStart();
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
        Activity.super.onStop();
        this.C = true;
        this.p();
        this.y.r();
        this.z.h(d.b.ON_STOP);
    }

    public void p() {
        while (e.q(this.n(), d.c.q)) {
        }
    }

    public void r(Fragment fragment) {
    }

    public boolean s(View view, Menu menu) {
        return Activity.super.onPreparePanel(0, view, menu);
    }

    public void t() {
        this.z.h(d.b.ON_RESUME);
        this.y.p();
    }

    public void u() {
        this.invalidateOptionsMenu();
    }

    public class c
    extends k
    implements u,
    androidx.activity.c,
    androidx.activity.result.d,
    r {
        public c() {
            super(e.this);
        }

        @Override
        public void a(n n8, Fragment fragment) {
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
        public View e(int n8) {
            return e.this.findViewById(n8);
        }

        @Override
        public boolean f() {
            Window window = e.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
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
        public boolean o(Fragment fragment) {
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

