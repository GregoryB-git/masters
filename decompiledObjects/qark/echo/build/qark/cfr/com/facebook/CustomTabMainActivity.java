/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.Uri
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.facebook;

import O1.E;
import O1.P;
import O1.e;
import O1.x;
import Y1.B;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.CustomTabActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

@Metadata
public final class CustomTabMainActivity
extends Activity {
    public static final a q = new a(null);
    public static final String r = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_action");
    public static final String s = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_params");
    public static final String t = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");
    public static final String u = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_url");
    public static final String v = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");
    public static final String w = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");
    public static final String x = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");
    public boolean o = true;
    public BroadcastReceiver p;

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n8, Intent object) {
        Object object2 = this.p;
        if (object2 != null) {
            Z.a.b((Context)this).e((BroadcastReceiver)object2);
        }
        if (object != null) {
            object2 = object.getStringExtra(u);
            object2 = object2 != null ? q.b((String)object2) : new Bundle();
            E e8 = E.a;
            e8 = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(e8, "intent");
            object2 = E.m((Intent)e8, (Bundle)object2, null);
            if (object2 != null) {
                object = object2;
            }
        } else {
            object = E.a;
            object = this.getIntent();
            Intrinsics.checkNotNullExpressionValue(object, "intent");
            object = E.m((Intent)object, null, null);
        }
        this.setResult(n8, (Intent)object);
        this.finish();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onCreate(Bundle object) {
        block6 : {
            String string2;
            block7 : {
                block5 : {
                    block4 : {
                        super.onCreate((Bundle)object);
                        string2 = CustomTabActivity.q;
                        if (!Intrinsics.a(string2, this.getIntent().getAction())) break block4;
                        this.setResult(0);
                        break block5;
                    }
                    if (object != null) break block6;
                    object = this.getIntent().getStringExtra(r);
                    if (object == null) {
                        return;
                    }
                    Bundle bundle = this.getIntent().getBundleExtra(s);
                    String string3 = this.getIntent().getStringExtra(t);
                    B b8 = B.p.a(this.getIntent().getStringExtra(v));
                    object = b.a[b8.ordinal()] == 1 ? new x((String)object, bundle) : new e((String)object, bundle);
                    boolean bl = object.a(this, string3);
                    this.o = false;
                    if (bl) break block7;
                    this.setResult(0, this.getIntent().putExtra(x, true));
                }
                this.finish();
                return;
            }
            this.p = object = new BroadcastReceiver(){

                public void onReceive(Context context, Intent intent) {
                    Intrinsics.checkNotNullParameter((Object)context, "context");
                    Intrinsics.checkNotNullParameter((Object)intent, "intent");
                    context = new Intent((Context)this, CustomTabMainActivity.class);
                    context.setAction(CustomTabMainActivity.w);
                    String string2 = CustomTabMainActivity.u;
                    context.putExtra(string2, intent.getStringExtra(string2));
                    context.addFlags(603979776);
                    this.startActivity((Intent)context);
                }
            };
            Z.a.b((Context)this).c((BroadcastReceiver)object, new IntentFilter(string2));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter((Object)intent, "intent");
        super.onNewIntent(intent);
        if (Intrinsics.a(w, intent.getAction())) {
            Intent intent2 = new Intent(CustomTabActivity.r);
            Z.a.b((Context)this).d(intent2);
        } else if (!Intrinsics.a(CustomTabActivity.q, intent.getAction())) {
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

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final Bundle b(String string2) {
            string2 = Uri.parse((String)string2);
            P p8 = P.a;
            p8 = P.o0(string2.getQuery());
            p8.putAll(P.o0(string2.getFragment()));
            return p8;
        }
    }

    public abstract class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] arrn = new int[B.values().length];
            arrn[B.r.ordinal()] = 1;
            a = arrn;
        }
    }

}

