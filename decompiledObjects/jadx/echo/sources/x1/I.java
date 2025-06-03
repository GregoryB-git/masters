package x1;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class I extends AsyncTask {

    /* renamed from: d, reason: collision with root package name */
    public static final a f20921d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final String f20922e = I.class.getCanonicalName();

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f20923a;

    /* renamed from: b, reason: collision with root package name */
    public final J f20924b;

    /* renamed from: c, reason: collision with root package name */
    public Exception f20925c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public I(HttpURLConnection httpURLConnection, J requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f20923a = httpURLConnection;
        this.f20924b = requests;
    }

    public List a(Void... params) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            try {
                HttpURLConnection httpURLConnection = this.f20923a;
                return httpURLConnection == null ? this.f20924b.i() : F.f20890n.o(httpURLConnection, this.f20924b);
            } catch (Exception e7) {
                this.f20925c = e7;
                return null;
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public void b(List result) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(result, "result");
            super.onPostExecute(result);
            Exception exc = this.f20925c;
            if (exc != null) {
                O1.P p7 = O1.P.f3756a;
                String str = f20922e;
                kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                O1.P.j0(str, format);
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return a((Void[]) objArr);
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            b((List) obj);
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (C2146B.D()) {
                O1.P p7 = O1.P.f3756a;
                String str = f20922e;
                kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                O1.P.j0(str, format);
            }
            if (this.f20924b.S() == null) {
                this.f20924b.e0(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f20923a + ", requests: " + this.f20924b + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I(J requests) {
        this(null, requests);
        Intrinsics.checkNotNullParameter(requests, "requests");
    }
}
