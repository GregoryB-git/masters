// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m4;

import k4.a;
import j4.e;
import java.util.HashMap;
import k4.b;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import j4.d;
import java.util.Map;

public class h
{
    public final Map a;
    public final Map b;
    public final d c;
    
    public h(final Map a, final Map b, final d c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static a a() {
        return new a();
    }
    
    public void b(final Object o, final OutputStream outputStream) {
        new f(outputStream, this.a, this.b, this.c).t(o);
    }
    
    public byte[] c(final Object o) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.b(o, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            return byteArrayOutputStream.toByteArray();
        }
    }
    
    public static final class a implements b
    {
        public static final d d;
        public final Map a;
        public final Map b;
        public d c;
        
        static {
            d = new g();
        }
        
        public a() {
            this.a = new HashMap();
            this.b = new HashMap();
            this.c = a.d;
        }
        
        public h c() {
            return new h(new HashMap(this.a), new HashMap(this.b), this.c);
        }
        
        public a d(final k4.a a) {
            a.a(this);
            return this;
        }
        
        public a f(final Class clazz, final d d) {
            this.a.put(clazz, d);
            this.b.remove(clazz);
            return this;
        }
    }
}
