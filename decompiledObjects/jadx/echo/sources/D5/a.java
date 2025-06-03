package D5;

import E5.a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.i;
import java.util.HashMap;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final E5.a f1273a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f1274b;

    /* renamed from: c, reason: collision with root package name */
    public b f1275c;

    /* renamed from: d, reason: collision with root package name */
    public final a.d f1276d;

    /* renamed from: D5.a$a, reason: collision with other inner class name */
    public class C0018a implements a.d {
        public C0018a() {
        }

        @Override // E5.a.d
        public void a(Object obj, a.e eVar) {
            HashMap hashMap;
            HashMap hashMap2;
            if (a.this.f1275c == null) {
                eVar.a(null);
                return;
            }
            hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            hashMap2 = (HashMap) hashMap.get("data");
            AbstractC1995b.f("AccessibilityChannel", "Received " + str + " message.");
            str.hashCode();
            switch (str) {
                case "tooltip":
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        a.this.f1275c.d(str2);
                        break;
                    }
                    break;
                case "announce":
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        a.this.f1275c.a(str3);
                        break;
                    }
                    break;
                case "tap":
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        a.this.f1275c.g(num.intValue());
                        break;
                    }
                    break;
                case "focus":
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        a.this.f1275c.e(num2.intValue());
                        break;
                    }
                    break;
                case "longPress":
                    Integer num3 = (Integer) hashMap.get("nodeId");
                    if (num3 != null) {
                        a.this.f1275c.f(num3.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    public interface b extends FlutterJNI.a {
        void a(String str);

        void d(String str);

        void e(int i7);

        void f(int i7);

        void g(int i7);
    }

    public a(C2105a c2105a, FlutterJNI flutterJNI) {
        C0018a c0018a = new C0018a();
        this.f1276d = c0018a;
        E5.a aVar = new E5.a(c2105a, "flutter/accessibility", E5.p.f1682a);
        this.f1273a = aVar;
        aVar.e(c0018a);
        this.f1274b = flutterJNI;
    }

    public void b(int i7, i.g gVar) {
        this.f1274b.dispatchSemanticsAction(i7, gVar);
    }

    public void c(int i7, i.g gVar, Object obj) {
        this.f1274b.dispatchSemanticsAction(i7, gVar, obj);
    }

    public void d() {
        this.f1274b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f1274b.setSemanticsEnabled(true);
    }

    public void f(int i7) {
        this.f1274b.setAccessibilityFeatures(i7);
    }

    public void g(b bVar) {
        this.f1275c = bVar;
        this.f1274b.setAccessibilityDelegate(bVar);
    }
}
