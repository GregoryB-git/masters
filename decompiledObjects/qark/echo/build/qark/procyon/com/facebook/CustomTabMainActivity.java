// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.facebook;

import O1.P;
import android.net.Uri;
import android.content.IntentFilter;
import O1.e;
import O1.x;
import Y1.B;
import x1.o;
import O1.E;
import android.os.Bundle;
import android.content.Context;
import Z.a;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import android.content.BroadcastReceiver;
import kotlin.Metadata;
import android.app.Activity;

@Metadata
public final class CustomTabMainActivity extends Activity
{
    public static final a q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public boolean o;
    public BroadcastReceiver p;
    
    static {
        q = new a(null);
        r = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_action");
        s = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_params");
        t = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");
        u = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_url");
        v = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");
        w = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");
        x = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");
    }
    
    public CustomTabMainActivity() {
        this.o = true;
    }
    
    public final void a(final int n, Intent intent) {
        final BroadcastReceiver p2 = this.p;
        if (p2 != null) {
            Z.a.b((Context)this).e(p2);
        }
        if (intent != null) {
            final String stringExtra = intent.getStringExtra(CustomTabMainActivity.u);
            Bundle a;
            if (stringExtra != null) {
                a = CustomTabMainActivity.q.b(stringExtra);
            }
            else {
                a = new Bundle();
            }
            final E a2 = E.a;
            final Intent intent2 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            final Intent m = E.m(intent2, a, null);
            if (m != null) {
                intent = m;
            }
        }
        else {
            final E a3 = E.a;
            intent = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "intent");
            intent = E.m(intent, null, null);
        }
        this.setResult(n, intent);
        this.finish();
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final String q = CustomTabActivity.q;
        Label_0028: {
            if (!Intrinsics.a(q, this.getIntent().getAction())) {
                if (bundle == null) {
                    final String stringExtra = this.getIntent().getStringExtra(CustomTabMainActivity.r);
                    if (stringExtra == null) {
                        return;
                    }
                    final Bundle bundleExtra = this.getIntent().getBundleExtra(CustomTabMainActivity.s);
                    final String stringExtra2 = this.getIntent().getStringExtra(CustomTabMainActivity.t);
                    e e;
                    if (b.a[B.p.a(this.getIntent().getStringExtra(CustomTabMainActivity.v)).ordinal()] == 1) {
                        e = new x(stringExtra, bundleExtra);
                    }
                    else {
                        e = new e(stringExtra, bundleExtra);
                    }
                    final boolean a = e.a(this, stringExtra2);
                    this.o = false;
                    if (!a) {
                        this.setResult(0, this.getIntent().putExtra(CustomTabMainActivity.x, true));
                        break Label_0028;
                    }
                    final BroadcastReceiver p = new BroadcastReceiver() {
                        public final /* synthetic */ CustomTabMainActivity a;
                        
                        public void onReceive(final Context context, final Intent intent) {
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(intent, "intent");
                            final Intent intent2 = new Intent((Context)this.a, (Class)CustomTabMainActivity.class);
                            intent2.setAction(CustomTabMainActivity.w);
                            final String u = CustomTabMainActivity.u;
                            intent2.putExtra(u, intent.getStringExtra(u));
                            intent2.addFlags(603979776);
                            ((Context)this.a).startActivity(intent2);
                        }
                    };
                    this.p = p;
                    Z.a.b((Context)this).c(p, new IntentFilter(q));
                }
                return;
            }
            this.setResult(0);
        }
        this.finish();
    }
    
    public void onNewIntent(final Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (Intrinsics.a(CustomTabMainActivity.w, intent.getAction())) {
            Z.a.b((Context)this).d(new Intent(CustomTabActivity.r));
        }
        else if (!Intrinsics.a(CustomTabActivity.q, intent.getAction())) {
            return;
        }
        this.a(-1, intent);
    }
    
    public void onResume() {
        super.onResume();
        if (this.o) {
            this.a(0, null);
        }
        this.o = true;
    }
    
    public static final class a
    {
        public final Bundle b(final String s) {
            final Uri parse = Uri.parse(s);
            final P a = P.a;
            final Bundle o0 = P.o0(parse.getQuery());
            o0.putAll(P.o0(parse.getFragment()));
            return o0;
        }
    }
}
