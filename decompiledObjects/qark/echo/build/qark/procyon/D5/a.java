// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import E5.i;
import E5.c;
import E5.p;
import t5.b;
import java.util.HashMap;
import io.flutter.embedding.engine.FlutterJNI;

public class a
{
    public final E5.a a;
    public final FlutterJNI b;
    public b c;
    public final E5.a.d d;
    
    public a(final w5.a a, final FlutterJNI b) {
        final E5.a.d d = new E5.a.d() {
            @Override
            public void a(final Object o, final e e) {
                if (D5.a.a(D5.a.this) == null) {
                    e.a(null);
                    return;
                }
                final HashMap hashMap = (HashMap)o;
                final String str = hashMap.get("type");
                final HashMap hashMap2 = (HashMap)hashMap.get("data");
                final StringBuilder sb = new StringBuilder();
                sb.append("Received ");
                sb.append(str);
                sb.append(" message.");
                b.f("AccessibilityChannel", sb.toString());
                str.hashCode();
                final int hashCode = str.hashCode();
                int n = -1;
                switch (hashCode) {
                    case 114203431: {
                        if (!str.equals("longPress")) {
                            break;
                        }
                        n = 4;
                        break;
                    }
                    case 97604824: {
                        if (!str.equals("focus")) {
                            break;
                        }
                        n = 3;
                        break;
                    }
                    case 114595: {
                        if (!str.equals("tap")) {
                            break;
                        }
                        n = 2;
                        break;
                    }
                    case -649620375: {
                        if (!str.equals("announce")) {
                            break;
                        }
                        n = 1;
                        break;
                    }
                    case -1140076541: {
                        if (!str.equals("tooltip")) {
                            break;
                        }
                        n = 0;
                        break;
                    }
                }
                switch (n) {
                    case 4: {
                        final Integer n2 = (Integer)hashMap.get("nodeId");
                        if (n2 != null) {
                            D5.a.a(D5.a.this).f(n2);
                            break;
                        }
                        break;
                    }
                    case 3: {
                        final Integer n3 = (Integer)hashMap.get("nodeId");
                        if (n3 != null) {
                            D5.a.a(D5.a.this).e(n3);
                            break;
                        }
                        break;
                    }
                    case 2: {
                        final Integer n4 = (Integer)hashMap.get("nodeId");
                        if (n4 != null) {
                            D5.a.a(D5.a.this).g(n4);
                            break;
                        }
                        break;
                    }
                    case 1: {
                        final String s = hashMap2.get("message");
                        if (s != null) {
                            D5.a.a(D5.a.this).a(s);
                            break;
                        }
                        break;
                    }
                    case 0: {
                        final String s2 = hashMap2.get("message");
                        if (s2 != null) {
                            D5.a.a(D5.a.this).d(s2);
                            break;
                        }
                        break;
                    }
                }
                e.a(null);
            }
        };
        this.d = d;
        (this.a = new E5.a(a, "flutter/accessibility", p.a)).e((E5.a.d)d);
        this.b = b;
    }
    
    public static /* synthetic */ b a(final a a) {
        return a.c;
    }
    
    public void b(final int n, final io.flutter.view.i.g g) {
        this.b.dispatchSemanticsAction(n, g);
    }
    
    public void c(final int n, final io.flutter.view.i.g g, final Object o) {
        this.b.dispatchSemanticsAction(n, g, o);
    }
    
    public void d() {
        this.b.setSemanticsEnabled(false);
    }
    
    public void e() {
        this.b.setSemanticsEnabled(true);
    }
    
    public void f(final int accessibilityFeatures) {
        this.b.setAccessibilityFeatures(accessibilityFeatures);
    }
    
    public void g(final b b) {
        this.c = b;
        this.b.setAccessibilityDelegate((FlutterJNI.a)b);
    }
    
    public interface b extends FlutterJNI.a
    {
        void a(final String p0);
        
        void d(final String p0);
        
        void e(final int p0);
        
        void f(final int p0);
        
        void g(final int p0);
    }
}
