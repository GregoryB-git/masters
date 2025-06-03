/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashSet
 */
package d0;

import java.util.HashSet;

public abstract class v {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static void a(String string2) {
        synchronized (v.class) {
            Throwable throwable2;
            block4 : {
                block3 : {
                    try {
                        if (!a.add((Object)string2)) break block3;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(b);
                        stringBuilder.append(", ");
                        stringBuilder.append(string2);
                        b = stringBuilder.toString();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public static String b() {
        synchronized (v.class) {
            String string2 = b;
            return string2;
        }
    }
}

