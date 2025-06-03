/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.NoSuchElementException
 */
package y0;

import java.util.NoSuchElementException;

public interface n {
    public static final n a = new n(){

        @Override
        public long a() {
            throw new NoSuchElementException();
        }

        @Override
        public long b() {
            throw new NoSuchElementException();
        }

        @Override
        public boolean next() {
            return false;
        }
    };

    public long a();

    public long b();

    public boolean next();

}

