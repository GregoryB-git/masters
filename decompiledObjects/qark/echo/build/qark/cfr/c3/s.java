/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.util.Iterator
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package c3;

import c3.r;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class s {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static r a(String string2) {
        for (r r8 : a) {
            if (!r8.b(string2)) continue;
            return r8;
        }
        Iterator iterator = new StringBuilder();
        iterator.append("No KMS client does support: ");
        iterator.append(string2);
        throw new GeneralSecurityException(iterator.toString());
    }
}

