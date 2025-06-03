/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package H3;

import E3.f;
import M3.g;
import java.io.File;
import java.io.IOException;

public class t {
    public final String a;
    public final g b;

    public t(String string2, g g8) {
        this.a = string2;
        this.b = g8;
    }

    public boolean a() {
        try {
            boolean bl = this.b().createNewFile();
            return bl;
        }
        catch (IOException iOException) {
            f f8 = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error creating marker: ");
            stringBuilder.append(this.a);
            f8.e(stringBuilder.toString(), (Throwable)iOException);
            return false;
        }
    }

    public final File b() {
        return this.b.e(this.a);
    }

    public boolean c() {
        return this.b().exists();
    }

    public boolean d() {
        return this.b().delete();
    }
}

