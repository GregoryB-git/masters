/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.Writer
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class A
extends Writer {
    public final String o;
    public StringBuilder p = new StringBuilder(128);

    public A(String string2) {
        this.o = string2;
    }

    public final void a() {
        if (this.p.length() > 0) {
            Log.d((String)this.o, (String)this.p.toString());
            StringBuilder stringBuilder = this.p;
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    public void close() {
        this.a();
    }

    public void flush() {
        this.a();
    }

    public void write(char[] arrc, int n8, int n9) {
        for (int i8 = 0; i8 < n9; ++i8) {
            char c8 = arrc[n8 + i8];
            if (c8 == '\n') {
                this.a();
                continue;
            }
            this.p.append(c8);
        }
    }
}

