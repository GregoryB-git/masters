/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.vn;
import com.yandex.metrica.impl.ob.xn;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class wn
implements xn<List<vn>> {
    @Override
    public vn a(@Nullable Object object) {
        Object object2 = (List)object;
        object = new LinkedList();
        Iterator iterator = object2.iterator();
        boolean bl2 = true;
        while (iterator.hasNext()) {
            object2 = (vn)iterator.next();
            if (((vn)object2).b()) continue;
            object.add((Object)((vn)object2).a());
            bl2 = false;
        }
        object = bl2 ? vn.a(this) : vn.a(this, TextUtils.join((CharSequence)", ", (Iterable)object));
        return object;
    }
}

