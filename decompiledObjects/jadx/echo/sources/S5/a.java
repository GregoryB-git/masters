package S5;

import E5.p;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: S5.a$a, reason: collision with other inner class name */
    public static class C0096a extends RuntimeException {

        /* renamed from: o, reason: collision with root package name */
        public final String f5906o;

        /* renamed from: p, reason: collision with root package name */
        public final Object f5907p;

        public C0096a(String str, String str2, Object obj) {
            super(str2);
            this.f5906o = str;
            this.f5907p = obj;
        }
    }

    public interface b {
        Boolean a(String str);

        Boolean b(String str, Boolean bool, d dVar);

        void c();

        Boolean d(String str, Map map);

        Boolean e();
    }

    public static class c extends p {

        /* renamed from: d, reason: collision with root package name */
        public static final c f5908d = new c();

        @Override // E5.p
        public Object g(byte b7, ByteBuffer byteBuffer) {
            return b7 != Byte.MIN_VALUE ? super.g(b7, byteBuffer) : d.a((ArrayList) f(byteBuffer));
        }

        @Override // E5.p
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof d)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((d) obj).h());
            }
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public Boolean f5909a;

        /* renamed from: b, reason: collision with root package name */
        public Boolean f5910b;

        /* renamed from: c, reason: collision with root package name */
        public Map f5911c;

        public static d a(ArrayList arrayList) {
            d dVar = new d();
            dVar.f((Boolean) arrayList.get(0));
            dVar.e((Boolean) arrayList.get(1));
            dVar.g((Map) arrayList.get(2));
            return dVar;
        }

        public Boolean b() {
            return this.f5910b;
        }

        public Boolean c() {
            return this.f5909a;
        }

        public Map d() {
            return this.f5911c;
        }

        public void e(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            this.f5910b = bool;
        }

        public void f(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
            }
            this.f5909a = bool;
        }

        public void g(Map map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            this.f5911c = map;
        }

        public ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(this.f5909a);
            arrayList.add(this.f5910b);
            arrayList.add(this.f5911c);
            return arrayList;
        }
    }

    public static ArrayList a(Throwable th) {
        Object obj;
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C0096a) {
            C0096a c0096a = (C0096a) th;
            arrayList.add(c0096a.f5906o);
            arrayList.add(c0096a.getMessage());
            obj = c0096a.f5907p;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
