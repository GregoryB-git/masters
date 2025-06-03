/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package S;

import P.f;
import P.k;
import S.b;
import S.h;
import e6.g;
import g6.a;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.I;

public final class c {
    public static final c a = new c();

    public final f a(Q.b b8, List list, I i8, final a a8) {
        Intrinsics.checkNotNullParameter((Object)list, "migrations");
        Intrinsics.checkNotNullParameter(i8, "scope");
        Intrinsics.checkNotNullParameter(a8, "produceFile");
        return new b(P.g.a.a(h.a, b8, list, i8, new a(){

            public final File a() {
                h h8;
                File file = (File)a8.invoke();
                String string2 = g.k(file);
                if (Intrinsics.a(string2, (h8 = h.a).f())) {
                    return file;
                }
                string2 = new StringBuilder();
                string2.append("File extension for file: ");
                string2.append((Object)file);
                string2.append(" does not match required extension for Preferences file: ");
                string2.append(h8.f());
                throw new IllegalStateException(string2.toString().toString());
            }
        }));
    }

}

