/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.RequiresApi
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import com.yandex.metrica.impl.ob.Hl;
import com.yandex.metrica.impl.ob.L1;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.a7;
import com.yandex.metrica.impl.ob.am;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.m7;
import com.yandex.metrica.impl.ob.z0;
import java.io.File;

@RequiresApi(value=21)
public class q7
implements a7<m7> {
    @NonNull
    private final L1 a;

    public q7(@NonNull L1 l1) {
        this.a = l1;
    }

    @Override
    public void a(@NonNull m7 m72) {
        this.a.a(m72, new am<String, c0>(){
            public final m7 a;
            {
                this.a = m72;
            }

            @Override
            public Object a(Object object) {
                return z0.a((String)object, Hl.b(this.a.b.a())).c(this.a.c.a);
            }
        });
    }

    @Override
    public void a(@NonNull Object object) {
        object = (m7)object;
        this.a.a((m7)object, new am<String, c0>(){
            public final m7 a;
            {
                this.a = m72;
            }

            @Override
            public Object a(Object object) {
                return z0.b((String)object, Hl.b(this.a.b.a())).c(this.a.c.a);
            }
        });
    }

    @Override
    public void b(@NonNull m7 m72) {
        this.a.a(m72, new /* invalid duplicate definition of identical inner class */);
    }

    @Override
    public void b(@NonNull Object object) {
        object = (m7)object;
        this.a.a((m7)object, new /* invalid duplicate definition of identical inner class */);
    }

    public static class c
    implements Zl<File> {
        @NonNull
        private final String a;

        public c(@NonNull String string) {
            this.a = string;
        }

        @Override
        public void b(Object object) {
            object = (File)object;
            CrashpadServiceHelper.a(this.a);
        }
    }
}

