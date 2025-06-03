// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package U4;

import java.util.Iterator;
import B3.h;
import java.util.ArrayList;
import java.util.List;
import com.google.firebase.components.ComponentRegistrar;
import B3.e;
import B3.c;
import B3.j;

public class b implements j
{
    @Override
    public List a(final ComponentRegistrar componentRegistrar) {
        final ArrayList<c> list = new ArrayList<c>();
        for (final c c : componentRegistrar.getComponents()) {
            final String i = c.i();
            c t = c;
            if (i != null) {
                t = c.t(new a(i, c));
            }
            list.add(t);
        }
        return list;
    }
}
