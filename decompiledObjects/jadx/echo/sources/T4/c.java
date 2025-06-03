package T4;

import V5.o;
import V5.t;
import Z5.k;
import android.util.Log;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o6.a;
import org.json.JSONObject;
import s4.i;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final a f6221g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final X5.g f6222a;

    /* renamed from: b, reason: collision with root package name */
    public final i f6223b;

    /* renamed from: c, reason: collision with root package name */
    public final R4.b f6224c;

    /* renamed from: d, reason: collision with root package name */
    public final T4.a f6225d;

    /* renamed from: e, reason: collision with root package name */
    public final g f6226e;

    /* renamed from: f, reason: collision with root package name */
    public final y6.a f6227f;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f6228o;

        /* renamed from: p, reason: collision with root package name */
        public Object f6229p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f6230q;

        /* renamed from: s, reason: collision with root package name */
        public int f6232s;

        public b(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f6230q = obj;
            this.f6232s |= Integer.MIN_VALUE;
            return c.this.c(this);
        }
    }

    /* renamed from: T4.c$c, reason: collision with other inner class name */
    public static final class C0103c extends k implements p {

        /* renamed from: o, reason: collision with root package name */
        public Object f6233o;

        /* renamed from: p, reason: collision with root package name */
        public Object f6234p;

        /* renamed from: q, reason: collision with root package name */
        public int f6235q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f6236r;

        public C0103c(X5.d dVar) {
            super(2, dVar);
        }

        @Override // g6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, X5.d dVar) {
            return ((C0103c) create(jSONObject, dVar)).invokeSuspend(t.f6803a);
        }

        @Override // Z5.a
        public final X5.d create(Object obj, X5.d dVar) {
            C0103c c0103c = c.this.new C0103c(dVar);
            c0103c.f6236r = obj;
            return c0103c;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0181 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00df  */
        @Override // Z5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: T4.c.C0103c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends k implements p {

        /* renamed from: o, reason: collision with root package name */
        public int f6238o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6239p;

        public d(X5.d dVar) {
            super(2, dVar);
        }

        @Override // g6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, X5.d dVar) {
            return ((d) create(str, dVar)).invokeSuspend(t.f6803a);
        }

        @Override // Z5.a
        public final X5.d create(Object obj, X5.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f6239p = obj;
            return dVar2;
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            Y5.d.c();
            if (this.f6238o != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f6239p));
            return t.f6803a;
        }
    }

    public c(X5.g backgroundDispatcher, i firebaseInstallationsApi, R4.b appInfo, T4.a configsFetcher, P.f dataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f6222a = backgroundDispatcher;
        this.f6223b = firebaseInstallationsApi;
        this.f6224c = appInfo;
        this.f6225d = configsFetcher;
        this.f6226e = new g(dataStore);
        this.f6227f = y6.c.b(false, 1, null);
    }

    @Override // T4.h
    public Boolean a() {
        return this.f6226e.g();
    }

    @Override // T4.h
    public Double b() {
        return this.f6226e.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:26:0x0048, B:27:0x00b3, B:29:0x00b7, B:33:0x00c5), top: B:25:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:41:0x0084, B:43:0x008c, B:46:0x0098), top: B:40:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098 A[Catch: all -> 0x0092, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:41:0x0084, B:43:0x008c, B:46:0x0098), top: B:40:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // T4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(X5.d r15) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.c.c(X5.d):java.lang.Object");
    }

    @Override // T4.h
    public o6.a d() {
        Integer e7 = this.f6226e.e();
        if (e7 == null) {
            return null;
        }
        a.C0243a c0243a = o6.a.f18197p;
        return o6.a.h(o6.c.o(e7.intValue(), o6.d.f18207s));
    }

    public final String f(String str) {
        return new Regex("/").replace(str, "");
    }
}
