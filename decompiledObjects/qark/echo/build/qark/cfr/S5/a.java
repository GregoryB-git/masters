/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.ByteArrayOutputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Map
 */
package S5;

import E5.p;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

public abstract class a {
    /*
     * Enabled aggressive block sorting
     */
    public static ArrayList a(Throwable object) {
        ArrayList arrayList = new ArrayList(3);
        if (object instanceof a) {
            object = (a)((Object)object);
            arrayList.add((Object)object.o);
            arrayList.add((Object)object.getMessage());
            object = object.p;
        } else {
            arrayList.add((Object)object.toString());
            arrayList.add((Object)object.getClass().getSimpleName());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cause: ");
            stringBuilder.append((Object)object.getCause());
            stringBuilder.append(", Stacktrace: ");
            stringBuilder.append(Log.getStackTraceString((Throwable)object));
            object = stringBuilder.toString();
        }
        arrayList.add(object);
        return arrayList;
    }

    public static class a
    extends RuntimeException {
        public final String o;
        public final Object p;

        public a(String string2, String string3, Object object) {
            super(string3);
            this.o = string2;
            this.p = object;
        }
    }

    public static interface b {
        public Boolean a(String var1);

        public Boolean b(String var1, Boolean var2, d var3);

        public void c();

        public Boolean d(String var1, Map var2);

        public Boolean e();
    }

    public static class c
    extends p {
        public static final c d = new c();

        @Override
        public Object g(byte by, ByteBuffer byteBuffer) {
            if (by != -128) {
                return super.g(by, byteBuffer);
            }
            return d.a((ArrayList)this.f(byteBuffer));
        }

        @Override
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object object) {
            if (object instanceof d) {
                byteArrayOutputStream.write(128);
                this.p(byteArrayOutputStream, (Object)((d)object).h());
                return;
            }
            super.p(byteArrayOutputStream, object);
        }
    }

    public static final class d {
        public Boolean a;
        public Boolean b;
        public Map c;

        public static d a(ArrayList arrayList) {
            d d8 = new d();
            d8.f((Boolean)arrayList.get(0));
            d8.e((Boolean)arrayList.get(1));
            d8.g((Map)arrayList.get(2));
            return d8;
        }

        public Boolean b() {
            return this.b;
        }

        public Boolean c() {
            return this.a;
        }

        public Map d() {
            return this.c;
        }

        public void e(Boolean bl) {
            if (bl != null) {
                this.b = bl;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }

        public void f(Boolean bl) {
            if (bl != null) {
                this.a = bl;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }

        public void g(Map map) {
            if (map != null) {
                this.c = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }

        public ArrayList h() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add((Object)this.a);
            arrayList.add((Object)this.b);
            arrayList.add((Object)this.c);
            return arrayList;
        }
    }

}

