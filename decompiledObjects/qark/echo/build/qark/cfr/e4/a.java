/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.ThreadLocal
 *  java.nio.ByteBuffer
 *  java.nio.CharBuffer
 *  java.nio.charset.CharacterCodingException
 *  java.nio.charset.Charset
 *  java.nio.charset.CharsetDecoder
 *  java.nio.charset.CharsetEncoder
 *  java.nio.charset.CodingErrorAction
 *  java.util.ArrayList
 *  java.util.List
 */
package e4;

import e4.g;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;

public abstract class a {
    public static b a(byte by) {
        if (by == 2) {
            return new a();
        }
        return new c();
    }

    public static class a
    implements b {
        public List a = new ArrayList();
        public int b = 0;

        @Override
        public boolean a(byte[] arrby) {
            this.a.add((Object)arrby);
            this.b += arrby.length;
            return true;
        }

        @Override
        public g b() {
            int n8;
            byte[] arrby = new byte[this.b];
            int n9 = n8 = 0;
            while (n8 < this.a.size()) {
                byte[] arrby2 = (byte[])this.a.get(n8);
                System.arraycopy((Object)arrby2, (int)0, (Object)arrby, (int)n9, (int)arrby2.length);
                n9 += arrby2.length;
                ++n8;
            }
            return new g(arrby);
        }
    }

    public static interface b {
        public boolean a(byte[] var1);

        public g b();
    }

    public static class c
    implements b {
        public static ThreadLocal c = new ThreadLocal(){

            public CharsetDecoder a() {
                CharsetDecoder charsetDecoder = Charset.forName((String)"UTF8").newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                charsetDecoder.onMalformedInput(codingErrorAction);
                charsetDecoder.onUnmappableCharacter(codingErrorAction);
                return charsetDecoder;
            }
        };
        public static ThreadLocal d = new ThreadLocal(){

            public CharsetEncoder a() {
                CharsetEncoder charsetEncoder = Charset.forName((String)"UTF8").newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                charsetEncoder.onMalformedInput(codingErrorAction);
                charsetEncoder.onUnmappableCharacter(codingErrorAction);
                return charsetEncoder;
            }
        };
        public StringBuilder a = new StringBuilder();
        public ByteBuffer b;

        @Override
        public boolean a(byte[] object) {
            if ((object = this.c((byte[])object)) != null) {
                this.a.append((String)object);
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

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final String c(byte[] object) {
            try {
                object = ByteBuffer.wrap((byte[])object);
                return ((CharsetDecoder)c.get()).decode((ByteBuffer)object).toString();
            }
            catch (CharacterCodingException characterCodingException) {
                return null;
            }
        }

    }

}

