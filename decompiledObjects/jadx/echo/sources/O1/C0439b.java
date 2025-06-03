package O1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import y1.C2237F;

/* renamed from: O1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439b extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static C0439b f3815c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3817a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f3814b = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f3816d = "com.parse.bolts.measurement_event";

    /* renamed from: O1.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final C0439b a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (C0439b.a() != null) {
                return C0439b.a();
            }
            C0439b c0439b = new C0439b(context, null);
            C0439b.b(c0439b);
            C0439b.c(c0439b);
            return C0439b.a();
        }
    }

    public C0439b(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f3817a = applicationContext;
    }

    public static final /* synthetic */ C0439b a() {
        if (T1.a.d(C0439b.class)) {
            return null;
        }
        try {
            return f3815c;
        } catch (Throwable th) {
            T1.a.b(th, C0439b.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(C0439b c0439b) {
        if (T1.a.d(C0439b.class)) {
            return;
        }
        try {
            c0439b.e();
        } catch (Throwable th) {
            T1.a.b(th, C0439b.class);
        }
    }

    public static final /* synthetic */ void c(C0439b c0439b) {
        if (T1.a.d(C0439b.class)) {
            return;
        }
        try {
            f3815c = c0439b;
        } catch (Throwable th) {
            T1.a.b(th, C0439b.class);
        }
    }

    public final void d() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Z.a b7 = Z.a.b(this.f3817a);
            Intrinsics.checkNotNullExpressionValue(b7, "getInstance(applicationContext)");
            b7.e(this);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void e() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Z.a b7 = Z.a.b(this.f3817a);
            Intrinsics.checkNotNullExpressionValue(b7, "getInstance(applicationContext)");
            b7.c(this, new IntentFilter(f3816d));
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void finalize() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            d();
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            C2237F c2237f = new C2237F(context);
            Set<String> set = null;
            String i7 = Intrinsics.i("bf_", intent == null ? null : intent.getStringExtra("event_name"));
            Bundle bundleExtra = intent == null ? null : intent.getBundleExtra("event_args");
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String key : set) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, "-"), ""), ""), (String) bundleExtra.get(key));
                }
            }
            c2237f.d(i7, bundle);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public /* synthetic */ C0439b(Context context, kotlin.jvm.internal.g gVar) {
        this(context);
    }
}
