/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.core.api.ProtobufConverter
 *  com.yandex.metrica.impl.ob.Bh
 *  com.yandex.metrica.impl.ob.Bh$a
 *  com.yandex.metrica.impl.ob.xf$a
 *  com.yandex.metrica.impl.ob.xf$a$a
 *  com.yandex.metrica.impl.ob.xf$a$b
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Bh;
import com.yandex.metrica.impl.ob.xf;
import java.util.ArrayList;
import java.util.List;

public class m9
implements ProtobufConverter {
    /*
     * WARNING - void declaration
     */
    @NonNull
    public Bh a(@NonNull xf.a object2) {
        ArrayList arrayList = new ArrayList();
        for (xf.a.b b3 : ((xf.a)object2).a) {
            void var1_7;
            String string = b3.a;
            xf.a.a a8 = b3.b;
            if (a8 == null) {
                Object var1_5 = null;
            } else {
                Bh.a a10 = new Bh.a(a8.a);
            }
            arrayList.add((Object)new Pair((Object)string, (Object)var1_7));
        }
        return new Bh((List)arrayList);
    }

    @NonNull
    public xf.a a(@NonNull Bh bh2) {
        xf.a a8 = new xf.a();
        a8.a = new xf.a.b[bh2.a.size()];
        for (int i2 = 0; i2 < bh2.a.size(); ++i2) {
            xf.a.b b3 = new xf.a.b();
            Pair pair = (Pair)bh2.a.get(i2);
            b3.a = (String)pair.first;
            if (pair.second != null) {
                b3.b = new xf.a.a();
                Bh.a a10 = (Bh.a)pair.second;
                if (a10 == null) {
                    pair = null;
                } else {
                    pair = new xf.a.a();
                    pair.a = a10.a;
                }
                b3.b = pair;
            }
            a8.a[i2] = b3;
        }
        return a8;
    }
}

