/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.util.List
 *  java.util.regex.Pattern
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.regex.Pattern;

public class e1 {
    private static final Pattern a = Pattern.compile((String)"com\\.yandex\\.metrica\\.(?!push)");
    private static final Pattern b = Pattern.compile((String)"com\\.yandex\\.metrica\\.push\\..*");

    private boolean a(@NonNull List<StackTraceElement> iterator, @NonNull Pattern pattern) {
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            if (!pattern.matcher((CharSequence)((StackTraceElement)iterator.next()).getClassName()).find()) continue;
            return true;
        }
        return false;
    }

    public boolean a(@NonNull List<StackTraceElement> list) {
        return this.a(list, a);
    }

    public boolean b(@NonNull List<StackTraceElement> list) {
        return this.a(list, b);
    }
}

