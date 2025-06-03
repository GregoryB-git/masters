// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S0;

import java.nio.charset.CharacterCodingException;
import java.util.regex.Matcher;
import d0.x;
import java.nio.ByteBuffer;
import O0.b;
import W2.e;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Pattern;
import O0.c;

public final class a extends c
{
    public static final Pattern c;
    public final CharsetDecoder a;
    public final CharsetDecoder b;
    
    static {
        c = Pattern.compile("(.+?)='(.*?)';", 32);
    }
    
    public a() {
        this.a = e.c.newDecoder();
        this.b = e.b.newDecoder();
    }
    
    @Override
    public x b(final b b, final ByteBuffer byteBuffer) {
        final String c = this.c(byteBuffer);
        final byte[] dst = new byte[byteBuffer.limit()];
        byteBuffer.get(dst);
        String s = null;
        if (c == null) {
            return new x(new x.b[] { new S0.c(dst, null, null) });
        }
        final Matcher matcher = S0.a.c.matcher(c);
        int end = 0;
        String s2 = null;
        while (matcher.find(end)) {
            final String group = matcher.group(1);
            final String group2 = matcher.group(2);
            String s3 = s2;
            String s4 = s;
            if (group != null) {
                final String e = W2.c.e(group);
                e.hashCode();
                if (!e.equals("streamurl")) {
                    if (!e.equals("streamtitle")) {
                        s3 = s2;
                        s4 = s;
                    }
                    else {
                        s3 = s2;
                        s4 = group2;
                    }
                }
                else {
                    s4 = s;
                    s3 = group2;
                }
            }
            end = matcher.end();
            s2 = s3;
            s = s4;
        }
        return new x(new x.b[] { new S0.c(dst, s, s2) });
    }
    
    public final String c(final ByteBuffer byteBuffer) {
        while (true) {
            try {
                final String string = this.a.decode(byteBuffer).toString();
                final CharsetDecoder charsetDecoder = this.a;
                charsetDecoder.reset();
                byteBuffer.rewind();
                return string;
            }
            catch (CharacterCodingException ex) {
                goto Label_0045;
            }
            finally {
                this.a.reset();
                byteBuffer.rewind();
            }
            try {
                this.b.decode(byteBuffer).toString();
                final CharsetDecoder charsetDecoder = this.b;
                continue;
            }
            catch (CharacterCodingException ex2) {}
            break;
        }
    }
}
