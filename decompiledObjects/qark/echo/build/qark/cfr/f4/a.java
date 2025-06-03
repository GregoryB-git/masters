/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 */
package f4;

import f4.b;
import java.io.IOException;
import java.util.Map;

public class a {
    public final String a;
    public final Map b;

    public a(String string2, Map map) {
        this.a = string2;
        this.b = map;
    }

    public static a c(String object) {
        if (!object.startsWith("gauth|")) {
            return null;
        }
        object = object.substring(6);
        try {
            object = b.a((String)object);
            object = new a((String)object.get((Object)"token"), (Map)object.get((Object)"auth"));
            return object;
        }
        catch (IOException iOException) {
            throw new RuntimeException("Failed to parse gauth token", (Throwable)iOException);
        }
    }

    public Map a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}

