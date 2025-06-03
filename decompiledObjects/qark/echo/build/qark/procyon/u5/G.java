// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class G
{
    public long a;
    public b b;
    public long c;
    public long d;
    public boolean e;
    public a f;
    public String g;
    
    public ByteBuffer a() {
        try {
            final String g = this.g;
            byte[] bytes;
            if (g == null) {
                bytes = null;
            }
            else {
                bytes = g.getBytes("UTF-8");
            }
            int length;
            if (bytes == null) {
                length = 0;
            }
            else {
                length = bytes.length;
            }
            final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.a);
            allocateDirect.putLong(this.b.e());
            allocateDirect.putLong(this.c);
            allocateDirect.putLong(this.d);
            long n;
            if (this.e) {
                n = 1L;
            }
            else {
                n = 0L;
            }
            allocateDirect.putLong(n);
            allocateDirect.putLong(this.f.e());
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        }
        catch (UnsupportedEncodingException ex) {
            throw new AssertionError((Object)"UTF-8 not supported");
        }
    }
    
    public enum a
    {
        p("kKeyboard", 0, 0L), 
        q("kDirectionalPad", 1, 1L), 
        r("kGamepad", 2, 2L), 
        s("kJoystick", 3, 3L), 
        t("kHdmi", 4, 4L);
        
        public final long o;
        
        static {
            u = c();
        }
        
        public a(final String name, final int ordinal, final long o) {
            this.o = o;
        }
        
        public static /* synthetic */ a[] c() {
            return new a[] { a.p, a.q, a.r, a.s, a.t };
        }
        
        public long e() {
            return this.o;
        }
    }
    
    public enum b
    {
        p("kDown", 0, 0L), 
        q("kUp", 1, 1L), 
        r("kRepeat", 2, 2L);
        
        public long o;
        
        static {
            s = c();
        }
        
        public b(final String name, final int ordinal, final long o) {
            this.o = o;
        }
        
        public static /* synthetic */ b[] c() {
            return new b[] { b.p, b.q, b.r };
        }
        
        public long e() {
            return this.o;
        }
    }
}
