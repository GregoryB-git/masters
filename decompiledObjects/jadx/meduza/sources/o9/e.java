package o9;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import o9.f;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: j, reason: collision with root package name */
    public static final TaskCompletionSource<Void> f12090j = new TaskCompletionSource<>();

    /* renamed from: k, reason: collision with root package name */
    public static boolean f12091k;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f12092a;

    /* renamed from: b, reason: collision with root package name */
    public final OkHttpClient f12093b;

    /* renamed from: c, reason: collision with root package name */
    public final q f12094c;

    /* renamed from: d, reason: collision with root package name */
    public final o9.a f12095d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12096e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f12097g;

    /* renamed from: h, reason: collision with root package name */
    public String f12098h;

    /* renamed from: i, reason: collision with root package name */
    public v5.n f12099i;

    public static final class a implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TaskCompletionSource<p> f12100a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f12101b;

        public a(TaskCompletionSource<p> taskCompletionSource, e eVar) {
            this.f12100a = taskCompletionSource;
            this.f12101b = eVar;
        }

        @Override // okhttp3.Callback
        public final void a(Call call, Response response) {
            f.a aVar;
            Charset charset;
            Object obj;
            ec.i.e(call, "ignored");
            ec.i.e(response, "response");
            f.a aVar2 = f.a.OK;
            int i10 = response.f12337c;
            if (i10 == 200) {
                aVar = f.a.OK;
            } else if (i10 == 409) {
                aVar = f.a.ABORTED;
            } else if (i10 == 429) {
                aVar = f.a.RESOURCE_EXHAUSTED;
            } else if (i10 == 400) {
                aVar = f.a.INVALID_ARGUMENT;
            } else if (i10 == 401) {
                aVar = f.a.UNAUTHENTICATED;
            } else if (i10 == 403) {
                aVar = f.a.PERMISSION_DENIED;
            } else if (i10 == 404) {
                aVar = f.a.NOT_FOUND;
            } else if (i10 == 503) {
                aVar = f.a.UNAVAILABLE;
            } else if (i10 != 504) {
                switch (i10) {
                    case 499:
                        aVar = f.a.CANCELLED;
                        break;
                    case 500:
                        aVar = f.a.INTERNAL;
                        break;
                    case 501:
                        aVar = f.a.UNIMPLEMENTED;
                        break;
                    default:
                        aVar = f.a.UNKNOWN;
                        break;
                }
            } else {
                aVar = f.a.DEADLINE_EXCEEDED;
            }
            ResponseBody responseBody = response.f12340o;
            ec.i.b(responseBody);
            xc.h H = responseBody.H();
            try {
                MediaType g10 = responseBody.g();
                if (g10 != null) {
                    charset = Util.f12379i;
                    try {
                        String str = g10.f12263b;
                        if (str != null) {
                            charset = Charset.forName(str);
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                } else {
                    charset = Util.f12379i;
                }
                String S = H.S(Util.b(H, charset));
                Util.e(H);
                int i11 = f.f12102c;
                ec.i.e(this.f12101b.f12094c, "serializer");
                String name = aVar.name();
                try {
                    JSONObject jSONObject = new JSONObject(S).getJSONObject("error");
                    if (jSONObject.opt("status") instanceof String) {
                        String string = jSONObject.getString("status");
                        ec.i.d(string, "error.getString(\"status\")");
                        aVar = f.a.valueOf(string);
                        name = aVar.name();
                    }
                    if (jSONObject.opt(Constants.MESSAGE) instanceof String) {
                        String string2 = jSONObject.getString(Constants.MESSAGE);
                        ec.i.d(string2, "error.getString(\"message\")");
                        if (!(string2.length() == 0)) {
                            String string3 = jSONObject.getString(Constants.MESSAGE);
                            ec.i.d(string3, "error.getString(\"message\")");
                            name = string3;
                        }
                    }
                    obj = jSONObject.opt("details");
                    if (obj != null) {
                        try {
                            obj = q.a(obj);
                        } catch (IllegalArgumentException unused2) {
                            aVar = f.a.INTERNAL;
                            name = "INTERNAL";
                        } catch (JSONException unused3) {
                        }
                    }
                } catch (IllegalArgumentException unused4) {
                    obj = null;
                } catch (JSONException unused5) {
                    obj = null;
                }
                f fVar = aVar == f.a.OK ? null : new f(name, aVar, obj);
                if (fVar != null) {
                    this.f12100a.setException(fVar);
                    return;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(S);
                    Object opt = jSONObject2.opt("data");
                    if (opt == null) {
                        opt = jSONObject2.opt("result");
                    }
                    if (opt == null) {
                        this.f12100a.setException(new f("Response is missing data field.", f.a.INTERNAL, (Object) null));
                    } else {
                        this.f12101b.f12094c.getClass();
                        this.f12100a.setResult(new p(q.a(opt)));
                    }
                } catch (JSONException e10) {
                    this.f12100a.setException(new f("Response is not valid JSON object.", f.a.INTERNAL, (Throwable) e10));
                }
            } catch (Throwable th) {
                Util.e(H);
                throw th;
            }
        }

        @Override // okhttp3.Callback
        public final void b(Call call, IOException iOException) {
            ec.i.e(call, "ignored");
            ec.i.e(iOException, "e");
            this.f12100a.setException(iOException instanceof InterruptedIOException ? new f("DEADLINE_EXCEEDED", f.a.DEADLINE_EXCEEDED, (Throwable) iOException) : new f("INTERNAL", f.a.INTERNAL, (Throwable) iOException));
        }
    }

    public e(Context context, String str, String str2, o9.a aVar, @y7.c Executor executor, @y7.d Executor executor2) {
        boolean z10;
        ec.i.e(context, "context");
        ec.i.e(executor, "executor");
        ec.i.e(executor2, "uiExecutor");
        this.f12092a = executor;
        this.f12098h = "https://%1$s-%2$s.cloudfunctions.net/%3$s";
        this.f12093b = new OkHttpClient();
        this.f12094c = new q();
        m6.j.i(aVar);
        this.f12095d = aVar;
        m6.j.i(str);
        this.f12096e = str;
        int i10 = 1;
        try {
            new URL(str2);
            z10 = false;
        } catch (MalformedURLException unused) {
            z10 = true;
        }
        if (z10) {
            this.f = str2;
            str2 = null;
        } else {
            this.f = "us-central1";
        }
        this.f12097g = str2;
        synchronized (f12090j) {
            if (f12091k) {
                return;
            }
            f12091k = true;
            rb.h hVar = rb.h.f13851a;
            executor2.execute(new g.e(context, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task<o9.p> a(java.net.URL r5, java.lang.Object r6, o9.n r7, o9.m r8) {
        /*
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            o9.q r1 = r4.f12094c
            r1.getClass()
            java.lang.Object r6 = o9.q.b(r6)
            java.lang.String r1 = "data"
            r0.put(r1, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>(r0)
            java.lang.String r0 = "application/json"
            r1 = 0
            okhttp3.MediaType r0 = okhttp3.MediaType.a(r0)     // Catch: java.lang.IllegalArgumentException -> L20
            goto L21
        L20:
            r0 = r1
        L21:
            java.lang.String r6 = r6.toString()
            java.nio.charset.Charset r2 = okhttp3.internal.Util.f12379i
            if (r0 == 0) goto L4e
            java.lang.String r3 = r0.f12263b     // Catch: java.lang.IllegalArgumentException -> L32
            if (r3 == 0) goto L32
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch: java.lang.IllegalArgumentException -> L32
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 != 0) goto L4d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "; charset=utf-8"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            okhttp3.MediaType r0 = okhttp3.MediaType.a(r0)     // Catch: java.lang.IllegalArgumentException -> L4b
            goto L4e
        L4b:
            r0 = r1
            goto L4e
        L4d:
            r2 = r3
        L4e:
            byte[] r6 = r6.getBytes(r2)
            okhttp3.RequestBody r6 = okhttp3.RequestBody.c(r0, r6)
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            java.lang.String r5 = r5.toString()
            okhttp3.HttpUrl$Builder r2 = new okhttp3.HttpUrl$Builder
            r2.<init>()
            r2.b(r1, r5)
            okhttp3.HttpUrl r5 = r2.a()
            r0.f12326a = r5
            java.lang.String r5 = "POST"
            r0.b(r5, r6)
            ec.i.b(r7)
            java.lang.String r5 = r7.f12130a
            if (r5 == 0) goto L8f
            java.lang.String r5 = "Bearer "
            java.lang.StringBuilder r5 = defpackage.f.l(r5)
            java.lang.String r6 = r7.f12130a
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            okhttp3.Headers$Builder r6 = r0.f12328c
            java.lang.String r1 = "Authorization"
            r6.d(r1, r5)
        L8f:
            java.lang.String r5 = r7.f12131b
            if (r5 == 0) goto L9a
            okhttp3.Headers$Builder r6 = r0.f12328c
            java.lang.String r1 = "Firebase-Instance-ID-Token"
            r6.d(r1, r5)
        L9a:
            java.lang.String r5 = r7.f12132c
            if (r5 == 0) goto La5
            okhttp3.Headers$Builder r6 = r0.f12328c
            java.lang.String r7 = "X-Firebase-AppCheck"
            r6.d(r7, r5)
        La5:
            okhttp3.OkHttpClient r5 = r4.f12093b
            java.lang.String r6 = "client"
            ec.i.e(r5, r6)
            okhttp3.OkHttpClient$Builder r6 = new okhttp3.OkHttpClient$Builder
            r6.<init>(r5)
            long r1 = r8.f12127a
            java.util.concurrent.TimeUnit r5 = r8.f12128b
            int r5 = okhttp3.internal.Util.d(r1, r5)
            r6.f12302x = r5
            long r1 = r8.f12127a
            java.util.concurrent.TimeUnit r5 = r8.f12128b
            int r5 = okhttp3.internal.Util.d(r1, r5)
            r6.f12304z = r5
            okhttp3.OkHttpClient r5 = new okhttp3.OkHttpClient
            r5.<init>(r6)
            okhttp3.Request r6 = r0.a()
            okhttp3.Call r5 = r5.a(r6)
            com.google.android.gms.tasks.TaskCompletionSource r6 = new com.google.android.gms.tasks.TaskCompletionSource
            r6.<init>()
            o9.e$a r7 = new o9.e$a
            r7.<init>(r6, r4)
            r5.C(r7)
            com.google.android.gms.tasks.Task r5 = r6.getTask()
            java.lang.String r6 = "tcs.task"
            ec.i.d(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.e.a(java.net.URL, java.lang.Object, o9.n, o9.m):com.google.android.gms.tasks.Task");
    }
}
