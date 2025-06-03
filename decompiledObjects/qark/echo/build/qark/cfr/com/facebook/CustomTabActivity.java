/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.facebook.CustomTabMainActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

@Metadata
public final class CustomTabActivity
extends Activity {
    public static final a p = new a(null);
    public static final String q = Intrinsics.i(CustomTabActivity.class.getSimpleName(), ".action_customTabRedirect");
    public static final String r = Intrinsics.i(CustomTabActivity.class.getSimpleName(), ".action_destroy");
    public BroadcastReceiver o;

    public void onActivityResult(int n8, int n9, Intent object) {
        super.onActivityResult(n8, n9, (Intent)object);
        if (n9 == 0) {
            object = new Intent(q);
            object.putExtra(CustomTabMainActivity.u, this.getIntent().getDataString());
            Z.a.b((Context)this).d((Intent)object);
            object = new BroadcastReceiver(){

                public void onReceive(Context context, Intent intent) {
                    Intrinsics.checkNotNullParameter((Object)context, "context");
                    Intrinsics.checkNotNullParameter((Object)intent, "intent");
                    this.finish();
                }
            };
            Z.a.b((Context)this).c((BroadcastReceiver)object, new IntentFilter(r));
            this.o = object;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = new Intent((Context)this, CustomTabMainActivity.class);
        bundle.setAction(q);
        bundle.putExtra(CustomTabMainActivity.u, this.getIntent().getDataString());
        bundle.addFlags(603979776);
        this.startActivityForResult((Intent)bundle, 2);
    }

    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.o;
        if (broadcastReceiver != null) {
            Z.a.b((Context)this).e(broadcastReceiver);
        }
        super.onDestroy();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

