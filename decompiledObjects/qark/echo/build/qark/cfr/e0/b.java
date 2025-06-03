/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 */
package e0;

import W2.k;
import d0.q;
import g0.M;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface b {
    public static final ByteBuffer a = ByteBuffer.allocateDirect((int)0).order(ByteOrder.nativeOrder());

    public boolean a();

    public void b();

    public boolean c();

    public ByteBuffer d();

    public void e();

    public void f(ByteBuffer var1);

    public void flush();

    public a g(a var1);

    public static final class a {
        public static final a e = new a(-1, -1, -1);
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int n8, int n9, int n10) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            n8 = M.A0(n10) ? M.g0(n10, n9) : -1;
            this.d = n8;
        }

        public a(q q8) {
            this(q8.C, q8.B, q8.D);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            if (this.a == object.a && this.b == object.b && this.c == object.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return k.b(this.a, this.b, this.c);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioFormat[sampleRate=");
            stringBuilder.append(this.a);
            stringBuilder.append(", channelCount=");
            stringBuilder.append(this.b);
            stringBuilder.append(", encoding=");
            stringBuilder.append(this.c);
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    public static final class b
    extends Exception {
        public final a o;

        public b(a a8) {
            this("Unhandled input format:", a8);
        }

        public b(String string2, a a8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" ");
            stringBuilder.append((Object)a8);
            super(stringBuilder.toString());
            this.o = a8;
        }
    }

}

