/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 */
package D5;

import E5.a;
import E5.c;
import E5.i;
import E5.p;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.i;
import java.util.HashMap;

public class a {
    public final E5.a a;
    public final FlutterJNI b;
    public b c;
    public final a.d d;

    public a(w5.a object, FlutterJNI flutterJNI) {
        a.d d8;
        this.d = d8 = new a.d(){

            @Override
            public void a(Object object, a.e e8) {
                if (a.this.c == null) {
                    e8.a(null);
                    return;
                }
                object = (HashMap)object;
                String string2 = (String)object.get((Object)"type");
                HashMap hashMap = (HashMap)object.get((Object)"data");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Received ");
                stringBuilder.append(string2);
                stringBuilder.append(" message.");
                t5.b.f("AccessibilityChannel", stringBuilder.toString());
                string2.hashCode();
                int n8 = string2.hashCode();
                int n9 = -1;
                switch (n8) {
                    default: {
                        break;
                    }
                    case 114203431: {
                        if (!string2.equals((Object)"longPress")) break;
                        n9 = 4;
                        break;
                    }
                    case 97604824: {
                        if (!string2.equals((Object)"focus")) break;
                        n9 = 3;
                        break;
                    }
                    case 114595: {
                        if (!string2.equals((Object)"tap")) break;
                        n9 = 2;
                        break;
                    }
                    case -649620375: {
                        if (!string2.equals((Object)"announce")) break;
                        n9 = 1;
                        break;
                    }
                    case -1140076541: {
                        if (!string2.equals((Object)"tooltip")) break;
                        n9 = 0;
                    }
                }
                switch (n9) {
                    default: {
                        break;
                    }
                    case 4: {
                        object = (Integer)object.get((Object)"nodeId");
                        if (object == null) break;
                        a.this.c.f(object.intValue());
                        break;
                    }
                    case 3: {
                        object = (Integer)object.get((Object)"nodeId");
                        if (object == null) break;
                        a.this.c.e(object.intValue());
                        break;
                    }
                    case 2: {
                        object = (Integer)object.get((Object)"nodeId");
                        if (object == null) break;
                        a.this.c.g(object.intValue());
                        break;
                    }
                    case 1: {
                        object = (String)hashMap.get((Object)"message");
                        if (object == null) break;
                        a.this.c.a((String)object);
                        break;
                    }
                    case 0: {
                        object = (String)hashMap.get((Object)"message");
                        if (object == null) break;
                        a.this.c.d((String)object);
                    }
                }
                e8.a(null);
            }
        };
        this.a = object = new E5.a((c)object, "flutter/accessibility", p.a);
        object.e(d8);
        this.b = flutterJNI;
    }

    public void b(int n8, i.g g8) {
        this.b.dispatchSemanticsAction(n8, g8);
    }

    public void c(int n8, i.g g8, Object object) {
        this.b.dispatchSemanticsAction(n8, g8, object);
    }

    public void d() {
        this.b.setSemanticsEnabled(false);
    }

    public void e() {
        this.b.setSemanticsEnabled(true);
    }

    public void f(int n8) {
        this.b.setAccessibilityFeatures(n8);
    }

    public void g(b b8) {
        this.c = b8;
        this.b.setAccessibilityDelegate(b8);
    }

    public static interface b
    extends FlutterJNI.a {
        public void a(String var1);

        public void d(String var1);

        public void e(int var1);

        public void f(int var1);

        public void g(int var1);
    }

}

