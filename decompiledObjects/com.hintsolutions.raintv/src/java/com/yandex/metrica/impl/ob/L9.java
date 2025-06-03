/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.core.api.ProtobufConverter
 *  com.yandex.metrica.impl.ob.md
 *  com.yandex.metrica.impl.ob.of
 *  com.yandex.metrica.impl.ob.of$a
 *  com.yandex.metrica.impl.ob.of$b
 *  com.yandex.metrica.impl.ob.ud
 *  com.yandex.metrica.impl.ob.z
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.md;
import com.yandex.metrica.impl.ob.o9;
import com.yandex.metrica.impl.ob.of;
import com.yandex.metrica.impl.ob.ud;
import com.yandex.metrica.impl.ob.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class l9
implements ProtobufConverter {
    @NonNull
    private final o9 a;

    public l9() {
        this(new o9());
    }

    @VisibleForTesting
    public l9(@NonNull o9 o92) {
        this.a = o92;
    }

    @NonNull
    public Object fromModel(@NonNull Object object) {
        Object object2;
        md md2 = (md)object;
        object = new of();
        ((of)object).a = new of.b[md2.a.size()];
        Iterator iterator = md2.a.iterator();
        int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            object2 = (ud)iterator.next();
            of.b[] bArray = ((of)object).a;
            of.b b3 = new of.b();
            b3.a = object2.a;
            b3.b = object2.b;
            bArray[n3] = b3;
            ++n3;
        }
        object2 = md2.b;
        if (object2 != null) {
            ((of)object).b = this.a.a((z)object2);
        }
        ((of)object).c = new String[md2.c.size()];
        md2 = md2.c.iterator();
        n3 = n2;
        while (md2.hasNext()) {
            object2 = (String)md2.next();
            ((of)object).c[n3] = object2;
            ++n3;
        }
        return object;
    }

    @NonNull
    public Object toModel(@NonNull Object b3) {
        String[] stringArray;
        int n2;
        of of2 = (of)b3;
        ArrayList arrayList = new ArrayList();
        int n3 = 0;
        for (n2 = 0; n2 < ((of.b[])(b3 = of2.a)).length; ++n2) {
            b3 = b3[n2];
            arrayList.add((Object)new ud(b3.a, b3.b));
        }
        b3 = null;
        of.a a8 = of2.b;
        if (a8 != null) {
            b3 = this.a.a(a8);
        }
        a8 = new ArrayList();
        for (n2 = n3; n2 < (stringArray = of2.c).length; ++n2) {
            a8.add((Object)stringArray[n2]);
        }
        return new md((List)arrayList, (z)b3, (List)a8);
    }
}

