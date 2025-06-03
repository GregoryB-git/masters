/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package w2;

import V2.k;
import android.os.Bundle;
import android.util.Log;
import w2.u;

public abstract class t {
    public final int a;
    public final k b = new k();
    public final int c;
    public final Bundle d;

    public t(int n8, int n9, Bundle bundle) {
        this.a = n8;
        this.c = n9;
        this.d = bundle;
    }

    public abstract void a(Bundle var1);

    public abstract boolean b();

    public final void c(u u8) {
        if (Log.isLoggable((String)"MessengerIpcClient", (int)3)) {
            String string2 = String.valueOf((Object)this);
            String string3 = String.valueOf((Object)((Object)u8));
            StringBuilder stringBuilder = new StringBuilder(string2.length() + 14 + string3.length());
            stringBuilder.append("Failing ");
            stringBuilder.append(string2);
            stringBuilder.append(" with ");
            stringBuilder.append(string3);
            Log.d((String)"MessengerIpcClient", (String)stringBuilder.toString());
        }
        this.b.b(u8);
    }

    public final void d(Object object) {
        if (Log.isLoggable((String)"MessengerIpcClient", (int)3)) {
            String string2 = String.valueOf((Object)this);
            String string3 = String.valueOf((Object)object);
            StringBuilder stringBuilder = new StringBuilder(string2.length() + 16 + string3.length());
            stringBuilder.append("Finishing ");
            stringBuilder.append(string2);
            stringBuilder.append(" with ");
            stringBuilder.append(string3);
            Log.d((String)"MessengerIpcClient", (String)stringBuilder.toString());
        }
        this.b.c(object);
    }

    public final String toString() {
        int n8 = this.c;
        int n9 = this.a;
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("Request { what=");
        stringBuilder.append(n8);
        stringBuilder.append(" id=");
        stringBuilder.append(n9);
        stringBuilder.append(" oneWay=");
        stringBuilder.append(this.b());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

