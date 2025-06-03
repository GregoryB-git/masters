/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Comparator
 *  java.util.List
 *  java.util.UUID
 */
package d0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import d0.g;
import d0.z;
import g0.M;
import g0.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class m
implements Comparator,
Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator(){

        public m a(Parcel parcel) {
            return new m(parcel);
        }

        public m[] b(int n8) {
            return new m[n8];
        }
    };
    public final b[] o;
    public int p;
    public final String q;
    public final int r;

    public m(Parcel arrb) {
        this.q = arrb.readString();
        arrb = (b[])M.i((b[])arrb.createTypedArray(b.CREATOR));
        this.o = arrb;
        this.r = arrb.length;
    }

    public m(String string2, List list) {
        this(string2, false, (b[])list.toArray((Object[])new b[0]));
    }

    public /* varargs */ m(String arrobject, boolean bl, b ... arrb) {
        this.q = arrobject;
        arrobject = arrb;
        if (bl) {
            arrobject = (b[])arrb.clone();
        }
        this.o = arrobject;
        this.r = arrobject.length;
        Arrays.sort((Object[])arrobject, (Comparator)this);
    }

    public /* varargs */ m(String string2, b ... arrb) {
        this(string2, true, arrb);
    }

    public m(List list) {
        this(null, false, (b[])list.toArray((Object[])new b[0]));
    }

    public /* varargs */ m(b ... arrb) {
        this((String)null, arrb);
    }

    public static boolean b(ArrayList arrayList, int n8, UUID uUID) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!((b)arrayList.get((int)i8)).p.equals((Object)uUID)) continue;
            return true;
        }
        return false;
    }

    public static m d(m object, m object2) {
        Object object3;
        int n8;
        int n9;
        Object object4;
        ArrayList arrayList = new ArrayList();
        int n10 = 0;
        if (object != null) {
            object4 = object.q;
            object3 = object.o;
            n9 = object3.length;
            n8 = 0;
            do {
                object = object4;
                if (n8 < n9) {
                    object = object3[n8];
                    if (object.c()) {
                        arrayList.add(object);
                    }
                    ++n8;
                    continue;
                }
                break;
            } while (true);
        } else {
            object = null;
        }
        object3 = object;
        if (object2 != null) {
            object4 = object;
            if (object == null) {
                object4 = object2.q;
            }
            n9 = arrayList.size();
            object = object2.o;
            int n11 = object.length;
            n8 = n10;
            do {
                object3 = object4;
                if (n8 >= n11) break;
                object2 = object[n8];
                if (object2.c() && !m.b(arrayList, n9, object2.p)) {
                    arrayList.add(object2);
                }
                ++n8;
            } while (true);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new m((String)object3, (List)arrayList);
    }

    public int a(b b8, b b9) {
        UUID uUID = g.a;
        if (uUID.equals((Object)b8.p)) {
            if (uUID.equals((Object)b9.p)) {
                return 0;
            }
            return 1;
        }
        return b8.p.compareTo(b9.p);
    }

    public m c(String string2) {
        if (M.c(this.q, string2)) {
            return this;
        }
        return new m(string2, false, this.o);
    }

    public int describeContents() {
        return 0;
    }

    public b e(int n8) {
        return this.o[n8];
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (m.class != object.getClass()) {
                return false;
            }
            object = (m)object;
            if (M.c(this.q, object.q) && Arrays.equals((Object[])this.o, (Object[])object.o)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public m f(m m8) {
        String string2;
        String string3 = this.q;
        boolean bl = string3 == null || (string2 = m8.q) == null || TextUtils.equals((CharSequence)string3, (CharSequence)string2);
        a.f(bl);
        string3 = this.q;
        if (string3 == null) {
            string3 = m8.q;
        }
        return new m(string3, (b[])M.N0(this.o, m8.o));
    }

    public int hashCode() {
        if (this.p == 0) {
            String string2 = this.q;
            int n8 = string2 == null ? 0 : string2.hashCode();
            this.p = n8 * 31 + Arrays.hashCode((Object[])this.o);
        }
        return this.p;
    }

    public void writeToParcel(Parcel parcel, int n8) {
        parcel.writeString(this.q);
        parcel.writeTypedArray((Parcelable[])this.o, 0);
    }

    public static final class b
    implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator(){

            public b a(Parcel parcel) {
                return new b(parcel);
            }

            public b[] b(int n8) {
                return new b[n8];
            }
        };
        public int o;
        public final UUID p;
        public final String q;
        public final String r;
        public final byte[] s;

        public b(Parcel parcel) {
            this.p = new UUID(parcel.readLong(), parcel.readLong());
            this.q = parcel.readString();
            this.r = (String)M.i(parcel.readString());
            this.s = parcel.createByteArray();
        }

        public b(UUID uUID, String string2, String string3, byte[] arrby) {
            this.p = (UUID)a.e((Object)uUID);
            this.q = string2;
            this.r = z.t((String)a.e(string3));
            this.s = arrby;
        }

        public b(UUID uUID, String string2, byte[] arrby) {
            this(uUID, null, string2, arrby);
        }

        public boolean a(b b8) {
            if (this.c() && !b8.c() && this.d(b8.p)) {
                return true;
            }
            return false;
        }

        public b b(byte[] arrby) {
            return new b(this.p, this.q, this.r, arrby);
        }

        public boolean c() {
            if (this.s != null) {
                return true;
            }
            return false;
        }

        public boolean d(UUID uUID) {
            if (!g.a.equals((Object)this.p) && !uUID.equals((Object)this.p)) {
                return false;
            }
            return true;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object object) {
            boolean bl = object instanceof b;
            boolean bl2 = false;
            if (!bl) {
                return false;
            }
            if (object == this) {
                return true;
            }
            object = (b)object;
            bl = bl2;
            if (M.c(this.q, object.q)) {
                bl = bl2;
                if (M.c(this.r, object.r)) {
                    bl = bl2;
                    if (M.c((Object)this.p, (Object)object.p)) {
                        bl = bl2;
                        if (Arrays.equals((byte[])this.s, (byte[])object.s)) {
                            bl = true;
                        }
                    }
                }
            }
            return bl;
        }

        public int hashCode() {
            if (this.o == 0) {
                int n8 = this.p.hashCode();
                String string2 = this.q;
                int n9 = string2 == null ? 0 : string2.hashCode();
                this.o = ((n8 * 31 + n9) * 31 + this.r.hashCode()) * 31 + Arrays.hashCode((byte[])this.s);
            }
            return this.o;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeLong(this.p.getMostSignificantBits());
            parcel.writeLong(this.p.getLeastSignificantBits());
            parcel.writeString(this.q);
            parcel.writeString(this.r);
            parcel.writeByteArray(this.s);
        }

    }

}

