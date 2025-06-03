/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package e6;

import h6.a;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import n6.b;

public final class l
implements b {
    public final BufferedReader a;

    public l(BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter((Object)bufferedReader, "reader");
        this.a = bufferedReader;
    }

    @Override
    public Iterator iterator() {
        return new Iterator(){
            public String o;
            public boolean p;

            public String b() {
                if (this.hasNext()) {
                    String string2 = this.o;
                    this.o = null;
                    Intrinsics.b(string2);
                    return string2;
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                if (this.o == null && !this.p) {
                    String string2;
                    this.o = string2 = this.a.readLine();
                    if (string2 == null) {
                        this.p = true;
                    }
                }
                if (this.o != null) {
                    return true;
                }
                return false;
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }

}

