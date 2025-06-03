// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.facebook;

import android.os.Bundle;
import android.content.IntentFilter;
import android.content.Context;
import Z.a;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import android.content.BroadcastReceiver;
import kotlin.Metadata;
import android.app.Activity;

@Metadata
public final class CustomTabActivity extends Activity
{
    public static final a p;
    public static final String q;
    public static final String r;
    public BroadcastReceiver o;
    
    static {
        p = new a(null);
        q = Intrinsics.i(CustomTabActivity.class.getSimpleName(), ".action_customTabRedirect");
        r = Intrinsics.i(CustomTabActivity.class.getSimpleName(), ".action_destroy");
    }
    
    public void onActivityResult(final int n, final int n2, Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n2 == 0) {
            intent = new Intent(CustomTabActivity.q);
            intent.putExtra(CustomTabMainActivity.u, this.getIntent().getDataString());
            Z.a.b((Context)this).d(intent);
            final BroadcastReceiver o = new BroadcastReceiver() {
                public final /* synthetic */ CustomTabActivity a;
                
                public void onReceive(final Context context, final Intent intent) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(intent, "intent");
                    this.a.finish();
                }
            };
            Z.a.b((Context)this).c(o, new IntentFilter(CustomTabActivity.r));
            this.o = o;
        }
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = new Intent((Context)this, (Class)CustomTabMainActivity.class);
        intent.setAction(CustomTabActivity.q);
        intent.putExtra(CustomTabMainActivity.u, this.getIntent().getDataString());
        intent.addFlags(603979776);
        this.startActivityForResult(intent, 2);
    }
    
    public void onDestroy() {
        final BroadcastReceiver o = this.o;
        if (o != null) {
            Z.a.b((Context)this).e(o);
        }
        super.onDestroy();
    }
    
    public static final class a
    {
    }
}
