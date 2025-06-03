// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

public abstract class d implements n
{
    public static d d(final char c) {
        return new b(c);
    }
    
    public static d f() {
        return d.p;
    }
    
    public static String g(final char c) {
        final int n = 0;
        final char[] array;
        final char[] data = array = new char[6];
        array[0] = '\\';
        array[1] = 'u';
        array[3] = (array[2] = '\0');
        array[5] = (array[4] = '\0');
        char c2 = c;
        for (int i = n; i < 4; ++i) {
            data[5 - i] = "0123456789ABCDEF".charAt(c2 & '\u000f');
            c2 >>= 4;
        }
        return String.copyValueOf(data);
    }
    
    public boolean b(final Character c) {
        return this.e(c);
    }
    
    public int c(final CharSequence charSequence, int i) {
        final int length = charSequence.length();
        m.l(i, length);
        while (i < length) {
            if (this.e(charSequence.charAt(i))) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public abstract boolean e(final char p0);
    
    public abstract static class a extends d
    {
    }
    
    public static final class b extends a
    {
        public final char o;
        
        public b(final char o) {
            this.o = o;
        }
        
        @Override
        public boolean e(final char c) {
            return c == this.o;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.is('");
            sb.append(g(this.o));
            sb.append("')");
            return sb.toString();
        }
    }
    
    public abstract static class c extends a
    {
        public final String o;
        
        public c(final String s) {
            this.o = (String)m.j(s);
        }
        
        @Override
        public final String toString() {
            return this.o;
        }
    }
    
    public static final class d extends c
    {
        public static final W2.d p;
        
        static {
            p = new d();
        }
        
        public d() {
            super("CharMatcher.none()");
        }
        
        @Override
        public int c(final CharSequence charSequence, final int n) {
            m.l(n, charSequence.length());
            return -1;
        }
        
        @Override
        public boolean e(final char c) {
            return false;
        }
    }
}
