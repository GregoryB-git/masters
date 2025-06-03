/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package U4;

import B3.e;
import B3.h;
import B3.j;
import U4.a;
import U4.c;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

public class b
implements j {
    public static /* synthetic */ Object b(String string2, B3.c c8, e e8) {
        return b.c(string2, c8, e8);
    }

    public static /* synthetic */ Object c(String object, B3.c c8, e e8) {
        try {
            c.b((String)object);
            object = c8.h().a(e8);
            return object;
        }
        finally {
            c.a();
        }
    }

    @Override
    public List a(ComponentRegistrar object) {
        ArrayList arrayList = new ArrayList();
        for (B3.c c8 : object.getComponents()) {
            String string2 = c8.i();
            object = c8;
            if (string2 != null) {
                object = c8.t(new a(string2, c8));
            }
            arrayList.add(object);
        }
        return arrayList;
    }
}

