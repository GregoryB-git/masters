/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Throwable
 */
package p0;

public final class T
extends Exception {
    public final int o;

    public T(int n8) {
        this.o = n8;
    }

    public T(int n8, Exception exception) {
        super((Throwable)exception);
        this.o = n8;
    }
}

