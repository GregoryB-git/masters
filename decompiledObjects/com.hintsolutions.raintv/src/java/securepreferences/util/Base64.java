/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.AssertionError
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  securepreferences.util.Base64$Encoder
 */
package securepreferences.util;

import java.io.UnsupportedEncodingException;
import securepreferences.util.Base64;

public class Base64 {
    public static final boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    private Base64() {
    }

    public static byte[] decode(String string2, int n3) {
        return Base64.decode(string2.getBytes(), n3);
    }

    public static byte[] decode(byte[] byArray, int n3) {
        return Base64.decode(byArray, 0, byArray.length, n3);
    }

    public static byte[] decode(byte[] byArray, int n3, int n7, int n8) {
        Object object = new /* Unavailable Anonymous Inner Class!! */;
        if (object.process(byArray, n3, n7, true)) {
            n3 = object.op;
            object = object.output;
            if (n3 == (object).length) {
                return object;
            }
            byArray = new byte[n3];
            System.arraycopy((Object)object, (int)0, (Object)byArray, (int)0, (int)n3);
            return byArray;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] encode(byte[] byArray, int n3) {
        return Base64.encode(byArray, 0, byArray.length, n3);
    }

    public static byte[] encode(byte[] byArray, int n3, int n7, int n8) {
        Encoder encoder = new /* Unavailable Anonymous Inner Class!! */;
        int n9 = n7 / 3 * 4;
        boolean bl = encoder.do_padding;
        int n10 = 2;
        if (bl) {
            n8 = n9;
            if (n7 % 3 > 0) {
                n8 = n9 + 4;
            }
        } else {
            n8 = n7 % 3;
            n8 = n8 != 1 ? (n8 != 2 ? n9 : n9 + 3) : n9 + 2;
        }
        n9 = n8;
        if (encoder.do_newline) {
            n9 = n8;
            if (n7 > 0) {
                int n11 = (n7 - 1) / 57;
                n9 = encoder.do_cr ? n10 : 1;
                n9 = n8 + (n11 + 1) * n9;
            }
        }
        encoder.output = new byte[n9];
        encoder.process(byArray, n3, n7, true);
        return encoder.output;
    }

    public static String encodeToString(byte[] object, int n3) {
        try {
            object = new String(Base64.encode(object, n3), "US-ASCII");
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new AssertionError((Object)unsupportedEncodingException);
        }
    }

    public static String encodeToString(byte[] object, int n3, int n7, int n8) {
        try {
            object = new String(Base64.encode(object, n3, n7, n8), "US-ASCII");
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new AssertionError((Object)unsupportedEncodingException);
        }
    }

    public static abstract class Coder {
        public int op;
        public byte[] output;

        public abstract int maxOutputSize(int var1);

        public abstract boolean process(byte[] var1, int var2, int var3, boolean var4);
    }
}

