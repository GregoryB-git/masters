/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.net.HttpURLConnection
 *  java.util.Arrays
 *  java.util.List
 */
package x1;

import O1.P;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.x;
import x1.B;
import x1.F;
import x1.J;

public class I
extends AsyncTask {
    public static final a d = new a(null);
    public static final String e = I.class.getCanonicalName();
    public final HttpURLConnection a;
    public final J b;
    public Exception c;

    public I(HttpURLConnection httpURLConnection, J j8) {
        Intrinsics.checkNotNullParameter((Object)j8, "requests");
        this.a = httpURLConnection;
        this.b = j8;
    }

    public I(J j8) {
        Intrinsics.checkNotNullParameter((Object)j8, "requests");
        this(null, j8);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public /* varargs */ List a(Void ... httpURLConnection) {
        if (T1.a.d((Object)this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)httpURLConnection, "params");
            httpURLConnection = this.a;
            if (httpURLConnection != null) return F.n.o(httpURLConnection, this.b);
            return this.b.i();
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, (Object)this);
        return null;
        catch (Exception exception) {}
        this.c = exception;
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(List object) {
        if (T1.a.d((Object)this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(object, "result");
            super.onPostExecute(object);
            object = this.c;
            if (object == null) return;
        }
        catch (Throwable throwable) {}
        Object object2 = P.a;
        object2 = e;
        x x8 = x.a;
        object = String.format((String)"onPostExecute: exception encountered during request: %s", (Object[])Arrays.copyOf((Object[])new Object[]{object.getMessage()}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        P.j0((String)object2, (String)object);
        return;
        T1.a.b(throwable, (Object)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onPreExecute() {
        if (T1.a.d((Object)this)) {
            return;
        }
        try {
            Object object;
            super.onPreExecute();
            if (B.D()) {
                object = P.a;
                object = e;
                Object object2 = x.a;
                object2 = String.format((String)"execute async task: %s", (Object[])Arrays.copyOf((Object[])new Object[]{this}, (int)1));
                Intrinsics.checkNotNullExpressionValue(object2, "java.lang.String.format(format, *args)");
                P.j0((String)object, (String)object2);
            }
            if (this.b.S() == null) {
                object = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
                this.b.e0((Handler)object);
            }
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, (Object)this);
    }

    public String toString() {
        Object object = new StringBuilder();
        object.append("{RequestAsyncTask: ");
        object.append(" connection: ");
        object.append((Object)this.a);
        object.append(", requests: ");
        object.append((Object)this.b);
        object.append("}");
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return object;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

