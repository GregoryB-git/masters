/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Bundle
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.Set
 */
package O1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.Regex;
import y1.F;

public final class b
extends BroadcastReceiver {
    public static final a b = new a(null);
    public static b c;
    public static final String d;
    public final Context a;

    static {
        d = "com.parse.bolts.measurement_event";
    }

    public b(Context context) {
        context = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue((Object)context, "context.applicationContext");
        this.a = context;
    }

    public /* synthetic */ b(Context context, g g8) {
        this(context);
    }

    public static final /* synthetic */ b a() {
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            b b8 = c;
            return b8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, b.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(b b8) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            b8.e();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, b.class);
            return;
        }
    }

    public static final /* synthetic */ void c(b b8) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            c = b8;
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, b.class);
            return;
        }
    }

    public final void d() {
        if (T1.a.d((Object)this)) {
            return;
        }
        try {
            Z.a a8 = Z.a.b(this.a);
            Intrinsics.checkNotNullExpressionValue(a8, "getInstance(applicationContext)");
            a8.e(this);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, (Object)this);
            return;
        }
    }

    public final void e() {
        if (T1.a.d((Object)this)) {
            return;
        }
        try {
            Z.a a8 = Z.a.b(this.a);
            Intrinsics.checkNotNullExpressionValue(a8, "getInstance(applicationContext)");
            a8.c(this, new IntentFilter(d));
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, (Object)this);
            return;
        }
    }

    public final void finalize() {
        if (T1.a.d((Object)this)) {
            return;
        }
        try {
            this.d();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, (Object)this);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onReceive(Context object, Intent object2) {
        if (T1.a.d((Object)this)) {
            return;
        }
        try {
            F f8 = new F((Context)object);
            String string2 = null;
            object = object2 == null ? null : object2.getStringExtra("event_name");
            String string3 = Intrinsics.i("bf_", object);
            object = object2 == null ? null : object2.getBundleExtra("event_args");
            Bundle bundle = new Bundle();
            object2 = object == null ? string2 : object.keySet();
            if (object2 != null) {
                object2 = object2.iterator();
                while (object2.hasNext()) {
                    string2 = (String)object2.next();
                    Intrinsics.checkNotNullExpressionValue(string2, "key");
                    String string4 = new Regex("[^0-9a-zA-Z _-]").replace(string2, "-");
                    string4 = new Regex("^[ -]*").replace(string4, "");
                    bundle.putString(new Regex("[ -]*$").replace(string4, ""), (String)object.get(string2));
                }
            }
            f8.d(string3, bundle);
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, (Object)this);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final b a(Context object) {
            Intrinsics.checkNotNullParameter(object, "context");
            if (b.a() != null) {
                return b.a();
            }
            object = new b((Context)object, null);
            b.b((b)((Object)object));
            b.c((b)((Object)object));
            return b.a();
        }
    }

}

