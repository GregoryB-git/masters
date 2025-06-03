package eb;

import eb.h;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import n7.g;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: k, reason: collision with root package name */
    public static final c f5034k;

    /* renamed from: a, reason: collision with root package name */
    public final q f5035a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5036b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5037c;

    /* renamed from: d, reason: collision with root package name */
    public final eb.b f5038d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5039e;
    public final Object[][] f;

    /* renamed from: g, reason: collision with root package name */
    public final List<h.a> f5040g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f5041h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f5042i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f5043j;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public q f5044a;

        /* renamed from: b, reason: collision with root package name */
        public Executor f5045b;

        /* renamed from: c, reason: collision with root package name */
        public String f5046c;

        /* renamed from: d, reason: collision with root package name */
        public eb.b f5047d;

        /* renamed from: e, reason: collision with root package name */
        public String f5048e;
        public Object[][] f;

        /* renamed from: g, reason: collision with root package name */
        public List<h.a> f5049g;

        /* renamed from: h, reason: collision with root package name */
        public Boolean f5050h;

        /* renamed from: i, reason: collision with root package name */
        public Integer f5051i;

        /* renamed from: j, reason: collision with root package name */
        public Integer f5052j;
    }

    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f5053a;

        public b(String str) {
            this.f5053a = str;
        }

        public final String toString() {
            return this.f5053a;
        }
    }

    static {
        a aVar = new a();
        aVar.f = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        aVar.f5049g = Collections.emptyList();
        f5034k = new c(aVar);
    }

    public c(a aVar) {
        this.f5035a = aVar.f5044a;
        this.f5036b = aVar.f5045b;
        this.f5037c = aVar.f5046c;
        this.f5038d = aVar.f5047d;
        this.f5039e = aVar.f5048e;
        this.f = aVar.f;
        this.f5040g = aVar.f5049g;
        this.f5041h = aVar.f5050h;
        this.f5042i = aVar.f5051i;
        this.f5043j = aVar.f5052j;
    }

    public static a b(c cVar) {
        a aVar = new a();
        aVar.f5044a = cVar.f5035a;
        aVar.f5045b = cVar.f5036b;
        aVar.f5046c = cVar.f5037c;
        aVar.f5047d = cVar.f5038d;
        aVar.f5048e = cVar.f5039e;
        aVar.f = cVar.f;
        aVar.f5049g = cVar.f5040g;
        aVar.f5050h = cVar.f5041h;
        aVar.f5051i = cVar.f5042i;
        aVar.f5052j = cVar.f5043j;
        return aVar;
    }

    public final <T> T a(b<T> bVar) {
        x6.b.y(bVar, Constants.KEY);
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f;
            if (i10 >= objArr.length) {
                return null;
            }
            if (bVar.equals(objArr[i10][0])) {
                return (T) this.f[i10][1];
            }
            i10++;
        }
    }

    public final <T> c c(b<T> bVar, T t) {
        x6.b.y(bVar, Constants.KEY);
        x6.b.y(t, "value");
        a b10 = b(this);
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.f;
            if (i10 >= objArr.length) {
                i10 = -1;
                break;
            }
            if (bVar.equals(objArr[i10][0])) {
                break;
            }
            i10++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.f.length + (i10 == -1 ? 1 : 0), 2);
        b10.f = objArr2;
        Object[][] objArr3 = this.f;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i10 == -1) {
            b10.f[this.f.length] = new Object[]{bVar, t};
        } else {
            b10.f[i10] = new Object[]{bVar, t};
        }
        return new c(b10);
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(this.f5035a, "deadline");
        b10.a(this.f5037c, "authority");
        b10.a(this.f5038d, "callCredentials");
        Executor executor = this.f5036b;
        b10.a(executor != null ? executor.getClass() : null, "executor");
        b10.a(this.f5039e, "compressorName");
        b10.a(Arrays.deepToString(this.f), "customOptions");
        b10.c("waitForReady", Boolean.TRUE.equals(this.f5041h));
        b10.a(this.f5042i, "maxInboundMessageSize");
        b10.a(this.f5043j, "maxOutboundMessageSize");
        b10.a(this.f5040g, "streamTracerFactories");
        return b10.toString();
    }
}
