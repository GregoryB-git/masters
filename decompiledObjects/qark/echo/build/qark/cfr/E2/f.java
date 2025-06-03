/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
package E2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class f {
    public static List a() {
        return Collections.emptyList();
    }

    public static List b(Object object) {
        return Collections.singletonList((Object)object);
    }

    public static /* varargs */ List c(Object ... arrobject) {
        int n8 = arrobject.length;
        if (n8 != 0) {
            if (n8 != 1) {
                return Collections.unmodifiableList((List)Arrays.asList((Object[])arrobject));
            }
            return f.b(arrobject[0]);
        }
        return f.a();
    }
}

