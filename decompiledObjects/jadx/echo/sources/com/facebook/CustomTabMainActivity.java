package com.facebook;

import O1.C0442e;
import O1.E;
import O1.P;
import O1.x;
import Y1.B;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

@Metadata
/* loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: q, reason: collision with root package name */
    public static final a f10216q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final String f10217r = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_action");

    /* renamed from: s, reason: collision with root package name */
    public static final String f10218s = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_params");

    /* renamed from: t, reason: collision with root package name */
    public static final String f10219t = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");

    /* renamed from: u, reason: collision with root package name */
    public static final String f10220u = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_url");

    /* renamed from: v, reason: collision with root package name */
    public static final String f10221v = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");

    /* renamed from: w, reason: collision with root package name */
    public static final String f10222w = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");

    /* renamed from: x, reason: collision with root package name */
    public static final String f10223x = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");

    /* renamed from: o, reason: collision with root package name */
    public boolean f10224o = true;

    /* renamed from: p, reason: collision with root package name */
    public BroadcastReceiver f10225p;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final Bundle b(String str) {
            Uri parse = Uri.parse(str);
            P p7 = P.f3756a;
            Bundle o02 = P.o0(parse.getQuery());
            o02.putAll(P.o0(parse.getFragment()));
            return o02;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10226a;

        static {
            int[] iArr = new int[B.valuesCustom().length];
            iArr[B.INSTAGRAM.ordinal()] = 1;
            f10226a = iArr;
        }
    }

    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intent intent2 = new Intent(CustomTabMainActivity.this, (Class<?>) CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.f10222w);
            String str = CustomTabMainActivity.f10220u;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            CustomTabMainActivity.this.startActivity(intent2);
        }
    }

    public final void a(int i7, Intent intent) {
        BroadcastReceiver broadcastReceiver = this.f10225p;
        if (broadcastReceiver != null) {
            Z.a.b(this).e(broadcastReceiver);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f10220u);
            Bundle b7 = stringExtra != null ? f10216q.b(stringExtra) : new Bundle();
            E e7 = E.f3721a;
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            Intent m7 = E.m(intent2, b7, null);
            if (m7 != null) {
                intent = m7;
            }
        } else {
            E e8 = E.f3721a;
            Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "intent");
            intent = E.m(intent3, null, null);
        }
        setResult(i7, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        String str = CustomTabActivity.f10212q;
        if (Intrinsics.a(str, getIntent().getAction())) {
            setResult(0);
        } else {
            if (bundle != null || (stringExtra = getIntent().getStringExtra(f10217r)) == null) {
                return;
            }
            Bundle bundleExtra = getIntent().getBundleExtra(f10218s);
            boolean a7 = (b.f10226a[B.f7352p.a(getIntent().getStringExtra(f10221v)).ordinal()] == 1 ? new x(stringExtra, bundleExtra) : new C0442e(stringExtra, bundleExtra)).a(this, getIntent().getStringExtra(f10219t));
            this.f10224o = false;
            if (a7) {
                c cVar = new c();
                this.f10225p = cVar;
                Z.a.b(this).c(cVar, new IntentFilter(str));
                return;
            }
            setResult(0, getIntent().putExtra(f10223x, true));
        }
        finish();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (Intrinsics.a(f10222w, intent.getAction())) {
            Z.a.b(this).d(new Intent(CustomTabActivity.f10213r));
        } else if (!Intrinsics.a(CustomTabActivity.f10212q, intent.getAction())) {
            return;
        }
        a(-1, intent);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f10224o) {
            a(0, null);
        }
        this.f10224o = true;
    }
}
