/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.net.ServerSocket
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.sh;
import java.io.IOException;
import java.net.ServerSocket;

class eh
implements sh {
    @Override
    @NonNull
    public ServerSocket a(int n2) throws IOException {
        return new ServerSocket(n2);
    }
}

