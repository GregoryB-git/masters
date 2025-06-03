/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import t.a;

public abstract class P2 {
    public static final a a = new a();

    public static Uri a(String string2) {
        synchronized (P2.class) {
            Throwable throwable2;
            block5 : {
                Object object;
                block4 : {
                    a a8;
                    Uri uri;
                    try {
                        a8 = a;
                        uri = (Uri)a8.get(string2);
                        object = uri;
                        if (uri != null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object = Uri.encode((String)string2);
                    uri = new StringBuilder("content://com.google.android.gms.phenotype/");
                    uri.append((String)object);
                    object = Uri.parse((String)uri.toString());
                    a8.put(string2, object);
                }
                return object;
            }
            throw throwable2;
        }
    }

    public static String b(Context object, String string2) {
        if (!string2.contains((CharSequence)"#")) {
            object = object.getPackageName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("#");
            stringBuilder.append("");
            stringBuilder.append((String)object);
            return stringBuilder.toString();
        }
        object = new StringBuilder("The passed in package cannot already have a subpackage: ");
        object.append(string2);
        throw new IllegalArgumentException(object.toString());
    }
}

