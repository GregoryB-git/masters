/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package a4;

import V3.f;
import V3.j;
import a4.e;
import c4.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class g {
    public final j a;
    public final c b;

    public g(f f8) {
        this.a = f8.o();
        this.b = f8.q("EventRaiser");
    }

    public void b(List list) {
        if (this.b.f()) {
            c c8 = this.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Raising ");
            stringBuilder.append(list.size());
            stringBuilder.append(" event(s)");
            c8.b(stringBuilder.toString(), new Object[0]);
        }
        list = new ArrayList((Collection)list);
        this.a.b(new Runnable((ArrayList)list){
            public final /* synthetic */ ArrayList o;
            {
                this.o = arrayList;
            }

            public void run() {
                for (e e8 : this.o) {
                    if (g.this.b.f()) {
                        c c8 = g.this.b;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Raising ");
                        stringBuilder.append(e8.toString());
                        c8.b(stringBuilder.toString(), new Object[0]);
                    }
                    e8.a();
                }
            }
        });
    }

}

