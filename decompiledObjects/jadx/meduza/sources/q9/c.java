package q9;

import a0.o;
import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c implements e, f {

    /* renamed from: a, reason: collision with root package name */
    public final t9.b<g> f13370a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f13371b;

    /* renamed from: c, reason: collision with root package name */
    public final t9.b<ca.f> f13372c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<d> f13373d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f13374e;

    public c() {
        throw null;
    }

    public c(Context context, String str, Set<d> set, t9.b<ca.f> bVar, Executor executor) {
        this.f13370a = new u7.d(context, str);
        this.f13373d = set;
        this.f13374e = executor;
        this.f13372c = bVar;
        this.f13371b = context;
    }

    @Override // q9.e
    public final Task<String> a() {
        return o.a(this.f13371b) ^ true ? Tasks.forResult("") : Tasks.call(this.f13374e, new Callable() { // from class: q9.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String byteArrayOutputStream;
                c cVar = c.this;
                synchronized (cVar) {
                    g gVar = cVar.f13370a.get();
                    ArrayList c10 = gVar.c();
                    gVar.b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = 0; i10 < c10.size(); i10++) {
                        h hVar = (h) c10.get(i10);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", hVar.b());
                        jSONObject.put("dates", new JSONArray((Collection) hVar.a()));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", "2");
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                        } finally {
                        }
                    } finally {
                    }
                }
                return byteArrayOutputStream;
            }
        });
    }

    @Override // q9.f
    public final synchronized int b() {
        boolean g10;
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = this.f13370a.get();
        synchronized (gVar) {
            g10 = gVar.g(currentTimeMillis);
        }
        if (!g10) {
            return 1;
        }
        synchronized (gVar) {
            String d10 = gVar.d(System.currentTimeMillis());
            gVar.f13375a.edit().putString("last-used-date", d10).commit();
            gVar.f(d10);
        }
        return 3;
    }

    public final void c() {
        if (this.f13373d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!o.a(this.f13371b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f13374e, new y2.h(this, 3));
        }
    }
}
