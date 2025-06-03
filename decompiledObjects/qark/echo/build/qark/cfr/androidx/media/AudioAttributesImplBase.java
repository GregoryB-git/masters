/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package androidx.media;

import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

public class AudioAttributesImplBase
implements AudioAttributesImpl {
    public int a;
    public int b;
    public int c;
    public int d;

    public AudioAttributesImplBase() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
    }

    public AudioAttributesImplBase(int n8, int n9, int n10, int n11) {
        this.b = n8;
        this.c = n9;
        this.a = n10;
        this.d = n11;
    }

    @Override
    public int a() {
        int n8 = this.d;
        if (n8 != -1) {
            return n8;
        }
        return AudioAttributesCompat.c(false, this.c, this.a);
    }

    @Override
    public Object b() {
        return null;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        int n8;
        int n9 = this.c;
        int n10 = this.a();
        if (n10 == 6) {
            n8 = n9 | 4;
        } else {
            n8 = n9;
            if (n10 == 7) {
                n8 = n9 | 1;
            }
        }
        return n8 & 273;
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof AudioAttributesImplBase;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (AudioAttributesImplBase)object;
        bl = bl2;
        if (this.b == object.c()) {
            bl = bl2;
            if (this.c == object.d()) {
                bl = bl2;
                if (this.a == object.e()) {
                    bl = bl2;
                    if (this.d == object.d) {
                        bl = true;
                    }
                }
            }
        }
        return bl;
    }

    public int hashCode() {
        return Arrays.hashCode((Object[])new Object[]{this.b, this.c, this.a, this.d});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            stringBuilder.append(" stream=");
            stringBuilder.append(this.d);
            stringBuilder.append(" derived");
        }
        stringBuilder.append(" usage=");
        stringBuilder.append(AudioAttributesCompat.e(this.a));
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(" flags=0x");
        stringBuilder.append(Integer.toHexString((int)this.c).toUpperCase());
        return stringBuilder.toString();
    }

    public static class a
    implements AudioAttributesImpl.a {
        public int a = 0;
        public int b = 0;
        public int c = 0;
        public int d = -1;

        @Override
        public AudioAttributesImpl a() {
            return new AudioAttributesImplBase(this.b, this.c, this.a, this.d);
        }

        public a e(int n8) {
            int n9 = n8;
            if (n8 != 0) {
                n9 = n8;
                if (n8 != 1) {
                    n9 = n8;
                    if (n8 != 2) {
                        n9 = n8;
                        if (n8 != 3) {
                            n9 = n8;
                            if (n8 != 4) {
                                n9 = 0;
                            }
                        }
                    }
                }
            }
            this.b = n9;
            return this;
        }

        public a f(int n8) {
            this.c = n8 & 1023 | this.c;
            return this;
        }

        /*
         * Enabled aggressive block sorting
         */
        public a g(int n8) {
            int n9 = n8;
            switch (n8) {
                default: {
                    n9 = 0;
                }
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: {
                    break;
                }
                case 16: {
                    n9 = 12;
                }
            }
            this.a = n9;
            return this;
        }
    }

}

