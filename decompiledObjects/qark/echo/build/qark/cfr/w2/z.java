/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package w2;

import V2.b;
import V2.j;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;

public final class z
implements b {
    public static final /* synthetic */ z a;

    static /* synthetic */ {
        a = new z();
    }

    @Override
    public final Object a(j j8) {
        if (j8.n()) {
            return (Bundle)j8.j();
        }
        if (Log.isLoggable((String)"Rpc", (int)3)) {
            String string2 = String.valueOf((Object)j8.i());
            StringBuilder stringBuilder = new StringBuilder(string2.length() + 22);
            stringBuilder.append("Error making request: ");
            stringBuilder.append(string2);
            Log.d((String)"Rpc", (String)stringBuilder.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", (Throwable)j8.i());
    }
}

