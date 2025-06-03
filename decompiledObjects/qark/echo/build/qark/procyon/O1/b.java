// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.os.BaseBundle;
import java.util.Iterator;
import java.util.Set;
import kotlin.text.Regex;
import android.os.Bundle;
import y1.F;
import android.content.Intent;
import android.content.IntentFilter;
import T1.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class b extends BroadcastReceiver
{
    public static final a b;
    public static b c;
    public static final String d;
    public final Context a;
    
    static {
        b = new a(null);
        d = "com.parse.bolts.measurement_event";
    }
    
    public b(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.a = applicationContext;
    }
    
    public static final /* synthetic */ b a() {
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            return O1.b.c;
        }
        finally {
            final Throwable t;
            T1.a.b(t, b.class);
            return null;
        }
    }
    
    public static final /* synthetic */ void b(final b b) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            b.e();
        }
        finally {
            final Throwable t;
            T1.a.b(t, b.class);
        }
    }
    
    public static final /* synthetic */ void c(final b c) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            O1.b.c = c;
        }
        finally {
            final Throwable t;
            T1.a.b(t, b.class);
        }
    }
    
    public final void d() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final Z.a b = Z.a.b(this.a);
            Intrinsics.checkNotNullExpressionValue(b, "getInstance(applicationContext)");
            b.e(this);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void e() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final Z.a b = Z.a.b(this.a);
            Intrinsics.checkNotNullExpressionValue(b, "getInstance(applicationContext)");
            b.c(this, new IntentFilter(O1.b.d));
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void finalize() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            this.d();
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final F f = new F(context);
                final Set<String> set = null;
                Object stringExtra;
                if (intent == null) {
                    stringExtra = null;
                }
                else {
                    stringExtra = intent.getStringExtra("event_name");
                }
                final String i = Intrinsics.i("bf_", stringExtra);
                Object bundleExtra;
                if (intent == null) {
                    bundleExtra = null;
                }
                else {
                    bundleExtra = intent.getBundleExtra("event_args");
                }
                final Bundle bundle = new Bundle();
                Set<String> keySet;
                if (bundleExtra == null) {
                    keySet = set;
                }
                else {
                    keySet = (Set<String>)((BaseBundle)bundleExtra).keySet();
                }
                if (keySet != null) {
                    for (final String s : keySet) {
                        Intrinsics.checkNotNullExpressionValue(s, "key");
                        ((BaseBundle)bundle).putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(s, "-"), ""), ""), (String)((BaseBundle)bundleExtra).get(s));
                    }
                }
                f.d(i, bundle);
                return;
                final Throwable t;
                T1.a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final class a
    {
        public final b a(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (O1.b.a() != null) {
                return O1.b.a();
            }
            final b b = new b(context, null);
            O1.b.b(b);
            O1.b.c(b);
            return O1.b.a();
        }
    }
}
