/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.OutputStream
 *  java.lang.ClassNotFoundException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package R2;

import A2.n;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public abstract class t4 {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Object a(Object object) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        void var0_1;
        block10 : {
            if (object == null) {
                return null;
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream2 = new ObjectOutputStream((OutputStream)byteArrayOutputStream);
            byteArrayOutputStream2.writeObject(object);
            byteArrayOutputStream2.flush();
            byteArrayOutputStream = new ObjectInputStream((InputStream)new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            try {
                object = byteArrayOutputStream.readObject();
            }
            catch (Throwable throwable) {
                break block10;
            }
            try {
                byteArrayOutputStream2.close();
                byteArrayOutputStream.close();
                return object;
            }
            catch (IOException | ClassNotFoundException classNotFoundException) {
                return null;
            }
            catch (Throwable throwable) {
                byteArrayOutputStream = null;
            }
            break block10;
            catch (Throwable throwable) {
                byteArrayOutputStream2 = byteArrayOutputStream = null;
            }
        }
        if (byteArrayOutputStream2 != null) {
            byteArrayOutputStream2.close();
        }
        if (byteArrayOutputStream == null) throw var0_1;
        byteArrayOutputStream.close();
        throw var0_1;
    }

    public static String b(String string2, String[] arrstring, String[] arrstring2) {
        n.i(arrstring);
        n.i(arrstring2);
        int n8 = Math.min((int)arrstring.length, (int)arrstring2.length);
        for (int i8 = 0; i8 < n8; ++i8) {
            String string3 = arrstring[i8];
            if ((string2 != null || string3 != null) && (string2 == null || !string2.equals((Object)string3))) continue;
            return arrstring2[i8];
        }
        return null;
    }
}

