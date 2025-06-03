// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S5;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import E5.p;
import java.util.Map;
import android.util.Log;
import java.util.ArrayList;

public abstract class a
{
    public static ArrayList a(final Throwable t) {
        final ArrayList<String> list = new ArrayList<String>(3);
        Object e;
        if (t instanceof a) {
            final a a = (a)t;
            list.add(a.o);
            list.add(a.getMessage());
            e = a.p;
        }
        else {
            list.add(t.toString());
            list.add(t.getClass().getSimpleName());
            final StringBuilder sb = new StringBuilder();
            sb.append("Cause: ");
            sb.append(t.getCause());
            sb.append(", Stacktrace: ");
            sb.append(Log.getStackTraceString(t));
            e = sb.toString();
        }
        list.add((String)e);
        return list;
    }
    
    public static class a extends RuntimeException
    {
        public final String o;
        public final Object p;
        
        public a(final String o, final String message, final Object p3) {
            super(message);
            this.o = o;
            this.p = p3;
        }
    }
    
    public interface b
    {
        Boolean a(final String p0);
        
        Boolean b(final String p0, final Boolean p1, final d p2);
        
        void c();
        
        Boolean d(final String p0, final Map p1);
        
        Boolean e();
    }
    
    public static class c extends p
    {
        public static final c d;
        
        static {
            d = new c();
        }
        
        @Override
        public Object g(final byte b, final ByteBuffer byteBuffer) {
            if (b != -128) {
                return super.g(b, byteBuffer);
            }
            return S5.a.d.a((ArrayList)this.f(byteBuffer));
        }
        
        @Override
        public void p(final ByteArrayOutputStream byteArrayOutputStream, final Object o) {
            if (o instanceof d) {
                byteArrayOutputStream.write(128);
                this.p(byteArrayOutputStream, ((d)o).h());
                return;
            }
            super.p(byteArrayOutputStream, o);
        }
    }
    
    public static final class d
    {
        public Boolean a;
        public Boolean b;
        public Map c;
        
        public static d a(final ArrayList list) {
            final d d = new d();
            d.f(list.get(0));
            d.e(list.get(1));
            d.g((Map)list.get(2));
            return d;
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
        
        public void e(final Boolean b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        
        public void f(final Boolean a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }
        
        public void g(final Map c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }
        
        public ArrayList h() {
            final ArrayList<Map> list = new ArrayList<Map>(3);
            list.add((Map)this.a);
            list.add((Map)this.b);
            list.add(this.c);
            return list;
        }
    }
}
