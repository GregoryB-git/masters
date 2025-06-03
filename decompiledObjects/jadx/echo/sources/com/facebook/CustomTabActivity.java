package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

@Metadata
/* loaded from: classes.dex */
public final class CustomTabActivity extends Activity {

    /* renamed from: p, reason: collision with root package name */
    public static final a f10211p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final String f10212q = Intrinsics.i(CustomTabActivity.class.getSimpleName(), ".action_customTabRedirect");

    /* renamed from: r, reason: collision with root package name */
    public static final String f10213r = Intrinsics.i(CustomTabActivity.class.getSimpleName(), ".action_destroy");

    /* renamed from: o, reason: collision with root package name */
    public BroadcastReceiver f10214o;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        if (i8 == 0) {
            Intent intent2 = new Intent(f10212q);
            intent2.putExtra(CustomTabMainActivity.f10220u, getIntent().getDataString());
            Z.a.b(this).d(intent2);
            b bVar = new b();
            Z.a.b(this).c(bVar, new IntentFilter(f10213r));
            this.f10214o = bVar;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction(f10212q);
        intent.putExtra(CustomTabMainActivity.f10220u, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.f10214o;
        if (broadcastReceiver != null) {
            Z.a.b(this).e(broadcastReceiver);
        }
        super.onDestroy();
    }
}
