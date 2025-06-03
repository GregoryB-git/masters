/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.List
 */
package l1;

import F0.t;
import android.util.SparseArray;
import g0.E;
import g0.z;
import java.util.Collections;
import java.util.List;

public interface K {
    public void a(z var1, int var2);

    public void b();

    public void c(E var1, t var2, d var3);

    public static final class a {
        public final String a;
        public final int b;
        public final byte[] c;

        public a(String string2, int n8, byte[] arrby) {
            this.a = string2;
            this.b = n8;
            this.c = arrby;
        }
    }

    public static final class b {
        public final int a;
        public final String b;
        public final int c;
        public final List d;
        public final byte[] e;

        public b(int n8, String string2, int n9, List list, byte[] arrby) {
            this.a = n8;
            this.b = string2;
            this.c = n9;
            string2 = list == null ? Collections.emptyList() : Collections.unmodifiableList((List)list);
            this.d = string2;
            this.e = arrby;
        }

        public int a() {
            int n8 = this.c;
            if (n8 != 2) {
                if (n8 != 3) {
                    return 0;
                }
                return 512;
            }
            return 2048;
        }
    }

    public static interface c {
        public SparseArray a();

        public K b(int var1, b var2);
    }

    public static final class d {
        public final String a;
        public final int b;
        public final int c;
        public int d;
        public String e;

        public d(int n8, int n9) {
            this(Integer.MIN_VALUE, n8, n9);
        }

        public d(int n8, int n9, int n10) {
            String string2;
            if (n8 != Integer.MIN_VALUE) {
                string2 = new StringBuilder();
                string2.append(n8);
                string2.append("/");
                string2 = string2.toString();
            } else {
                string2 = "";
            }
            this.a = string2;
            this.b = n9;
            this.c = n10;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }

        public void a() {
            int n8 = this.d;
            n8 = n8 == Integer.MIN_VALUE ? this.b : (n8 += this.c);
            this.d = n8;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(this.d);
            this.e = stringBuilder.toString();
        }

        public String b() {
            this.d();
            return this.e;
        }

        public int c() {
            this.d();
            return this.d;
        }

        public final void d() {
            if (this.d != Integer.MIN_VALUE) {
                return;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

}

