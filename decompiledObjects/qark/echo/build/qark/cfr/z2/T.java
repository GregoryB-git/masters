/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package z2;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import z2.o;
import z2.x;

public abstract class T {
    public final int a;

    public T(int n8) {
        this.a = n8;
    }

    public abstract void a(Status var1);

    public abstract void b(Exception var1);

    public abstract void c(x var1);

    public abstract void d(o var1, boolean var2);
}

