/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Collections
 *  java.util.List
 */
package g0;

import android.util.Pair;
import g0.M;
import g0.z;
import java.util.Collections;
import java.util.List;

public abstract class d {
    public static final byte[] a = new byte[]{0, 0, 0, 1};
    public static final String[] b = new String[]{"", "A", "B", "C"};

    public static String a(int n8, int n9, int n10) {
        return String.format((String)"avc1.%02X%02X%02X", (Object[])new Object[]{n8, n9, n10});
    }

    public static List b(boolean bl) {
        byte[] arrby = bl ? new byte[]{1} : new byte[]{0};
        return Collections.singletonList((Object)arrby);
    }

    public static String c(int n8, boolean bl, int n9, int n10, int[] arrn, int n11) {
        String string2 = b[n8];
        char c8 = bl ? 'H' : 'L';
        string2 = new StringBuilder(M.G("hvc1.%s%d.%X.%c%d", new Object[]{string2, n9, n10, Character.valueOf((char)c8), n11}));
        for (n8 = arrn.length; n8 > 0 && arrn[n8 - 1] == 0; --n8) {
        }
        for (n9 = 0; n9 < n8; ++n9) {
            string2.append(String.format((String)".%02X", (Object[])new Object[]{arrn[n9]}));
        }
        return string2.toString();
    }

    public static byte[] d(byte[] arrby, int n8, int n9) {
        byte[] arrby2 = a;
        byte[] arrby3 = new byte[arrby2.length + n9];
        System.arraycopy((Object)arrby2, (int)0, (Object)arrby3, (int)0, (int)arrby2.length);
        System.arraycopy((Object)arrby, (int)n8, (Object)arrby3, (int)arrby2.length, (int)n9);
        return arrby3;
    }

    public static Pair e(byte[] object) {
        object = new z((byte[])object);
        object.T(9);
        int n8 = object.G();
        object.T(20);
        return Pair.create((Object)object.K(), (Object)n8);
    }

    public static boolean f(List list) {
        boolean bl;
        int n8 = list.size();
        boolean bl2 = bl = false;
        if (n8 == 1) {
            bl2 = bl;
            if (((byte[])list.get(0)).length == 1) {
                bl2 = bl;
                if (((byte[])list.get(0))[0] == 1) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }
}

