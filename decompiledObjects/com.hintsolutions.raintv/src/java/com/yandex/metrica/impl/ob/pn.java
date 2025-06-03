/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.Comparator
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.F2;
import java.util.Comparator;

public class pn
implements Comparator<F2> {
    public int compare(Object object, Object object2) {
        object = (F2)object;
        object2 = (F2)object2;
        int n4 = !TextUtils.equals((CharSequence)((F2)object).a, (CharSequence)((F2)object2).a) || !TextUtils.equals((CharSequence)((F2)object).b, (CharSequence)((F2)object2).b) ? 10 : 0;
        return n4;
    }
}

