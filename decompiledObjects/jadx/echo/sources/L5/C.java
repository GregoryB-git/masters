package L5;

import E5.k;
import V2.C0660k;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public final C0660k f3392a = new C0660k();

    /* renamed from: b, reason: collision with root package name */
    public final E5.k f3393b;

    public C(E5.k kVar) {
        this.f3393b = kVar;
    }

    public Object c(final Map map) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: L5.B
            @Override // java.lang.Runnable
            public final void run() {
                C.this.d(map);
            }
        });
        return V2.m.a(this.f3392a.a());
    }

    public final /* synthetic */ void d(Map map) {
        this.f3393b.d("FirebaseDatabase#callTransactionHandler", map, new a());
    }

    public class a implements k.d {
        public a() {
        }

        @Override // E5.k.d
        public void a(Object obj) {
            C.this.f3392a.c(obj);
        }

        @Override // E5.k.d
        public void b(String str, String str2, Object obj) {
            Map hashMap = new HashMap();
            if (str2 == null) {
                str2 = "An unknown error occurred";
            }
            if (obj instanceof Map) {
                hashMap = (Map) obj;
            }
            C.this.f3392a.b(new y(str, str2, hashMap));
        }

        @Override // E5.k.d
        public void c() {
        }
    }
}
