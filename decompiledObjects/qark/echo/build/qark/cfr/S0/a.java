/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.CharBuffer
 *  java.nio.charset.CharacterCodingException
 *  java.nio.charset.Charset
 *  java.nio.charset.CharsetDecoder
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package S0;

import O0.b;
import S0.c;
import W2.e;
import d0.x;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
extends O0.c {
    public static final Pattern c = Pattern.compile((String)"(.+?)='(.*?)';", (int)32);
    public final CharsetDecoder a = e.c.newDecoder();
    public final CharsetDecoder b = e.b.newDecoder();

    @Override
    public x b(b b8, ByteBuffer object) {
        String string2 = this.c((ByteBuffer)object);
        byte[] arrby = new byte[object.limit()];
        object.get(arrby);
        b8 = null;
        if (string2 == null) {
            return new x(new c(arrby, null, null));
        }
        Matcher matcher = c.matcher((CharSequence)string2);
        int n8 = 0;
        object = null;
        while (matcher.find(n8)) {
            String string3 = matcher.group(1);
            string2 = matcher.group(2);
            Object object2 = object;
            Object object3 = b8;
            if (string3 != null) {
                object2 = W2.c.e(string3);
                object2.hashCode();
                if (!object2.equals((Object)"streamurl")) {
                    if (!object2.equals((Object)"streamtitle")) {
                        object2 = object;
                        object3 = b8;
                    } else {
                        object2 = object;
                        object3 = string2;
                    }
                } else {
                    object3 = b8;
                    object2 = string2;
                }
            }
            n8 = matcher.end();
            object = object2;
            b8 = object3;
        }
        return new x(new c(arrby, (String)((Object)b8), (String)object));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String c(ByteBuffer byteBuffer) {
        String string2;
        CharsetDecoder charsetDecoder;
        block6 : {
            try {
                string2 = this.a.decode(byteBuffer).toString();
                charsetDecoder = this.a;
                break block6;
            }
            catch (Throwable throwable) {
                this.a.reset();
                byteBuffer.rewind();
                throw throwable;
            }
            catch (CharacterCodingException characterCodingException) {}
            this.a.reset();
            byteBuffer.rewind();
            try {
                string2 = this.b.decode(byteBuffer).toString();
                charsetDecoder = this.b;
            }
            catch (Throwable throwable) {
                this.b.reset();
                byteBuffer.rewind();
                throw throwable;
            }
            catch (CharacterCodingException characterCodingException) {}
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return string2;
        this.b.reset();
        byteBuffer.rewind();
        return null;
    }
}

