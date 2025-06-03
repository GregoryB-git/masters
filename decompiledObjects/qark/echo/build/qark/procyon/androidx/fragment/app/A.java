// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class A extends Writer
{
    public final String o;
    public StringBuilder p;
    
    public A(final String o) {
        this.p = new StringBuilder(128);
        this.o = o;
    }
    
    public final void a() {
        if (this.p.length() > 0) {
            Log.d(this.o, this.p.toString());
            final StringBuilder p = this.p;
            p.delete(0, p.length());
        }
    }
    
    @Override
    public void close() {
        this.a();
    }
    
    @Override
    public void flush() {
        this.a();
    }
    
    @Override
    public void write(final char[] array, final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            final char c = array[n + i];
            if (c == '\n') {
                this.a();
            }
            else {
                this.p.append(c);
            }
        }
    }
}
