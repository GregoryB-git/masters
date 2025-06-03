// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e4;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public abstract class a
{
    public static b a(final byte b) {
        if (b == 2) {
            return (b)new a();
        }
        return (b)new c();
    }
    
    public static class a implements b
    {
        public List a;
        public int b;
        
        public a() {
            this.b = 0;
            this.a = new ArrayList();
        }
        
        @Override
        public boolean a(final byte[] array) {
            this.a.add(array);
            this.b += array.length;
            return true;
        }
        
        @Override
        public g b() {
            final byte[] array = new byte[this.b];
            int n;
            for (int i = n = 0; i < this.a.size(); ++i) {
                final byte[] array2 = this.a.get(i);
                System.arraycopy(array2, 0, array, n, array2.length);
                n += array2.length;
            }
            return new g(array);
        }
    }
    
    public interface b
    {
        boolean a(final byte[] p0);
        
        g b();
    }
    
    public static class c implements b
    {
        public static ThreadLocal c;
        public static ThreadLocal d;
        public StringBuilder a;
        public ByteBuffer b;
        
        static {
            e4.a.c.c = new ThreadLocal() {
                public CharsetDecoder a() {
                    final CharsetDecoder decoder = Charset.forName("UTF8").newDecoder();
                    final CodingErrorAction report = CodingErrorAction.REPORT;
                    decoder.onMalformedInput(report);
                    decoder.onUnmappableCharacter(report);
                    return decoder;
                }
            };
            e4.a.c.d = new ThreadLocal() {
                public CharsetEncoder a() {
                    final CharsetEncoder encoder = Charset.forName("UTF8").newEncoder();
                    final CodingErrorAction report = CodingErrorAction.REPORT;
                    encoder.onMalformedInput(report);
                    encoder.onUnmappableCharacter(report);
                    return encoder;
                }
            };
        }
        
        public c() {
            this.a = new StringBuilder();
        }
        
        @Override
        public boolean a(final byte[] array) {
            final String c = this.c(array);
            if (c != null) {
                this.a.append(c);
                return true;
            }
            return false;
        }
        
        @Override
        public g b() {
            if (this.b != null) {
                return null;
            }
            return new g(this.a.toString());
        }
        
        public final String c(final byte[] array) {
            try {
                return e4.a.c.c.get().decode(ByteBuffer.wrap(array)).toString();
            }
            catch (CharacterCodingException ex) {
                return null;
            }
        }
    }
}
