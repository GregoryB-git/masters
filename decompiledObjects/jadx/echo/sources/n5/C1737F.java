package n5;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: n5.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1737F {

    /* renamed from: a, reason: collision with root package name */
    public final String f17995a;

    /* renamed from: b, reason: collision with root package name */
    public final List f17996b;

    public C1737F(String str, List list) {
        this.f17995a = str;
        this.f17996b = list == null ? new ArrayList() : list;
    }

    public static Object f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            bArr[i7] = (byte) ((Integer) list.get(i7)).intValue();
        }
        return bArr;
    }

    public void a(SQLiteProgram sQLiteProgram) {
        long j7;
        List list = this.f17996b;
        if (list != null) {
            int size = list.size();
            int i7 = 0;
            while (i7 < size) {
                Object f7 = f(this.f17996b.get(i7));
                int i8 = i7 + 1;
                if (f7 == null) {
                    sQLiteProgram.bindNull(i8);
                } else if (f7 instanceof byte[]) {
                    sQLiteProgram.bindBlob(i8, (byte[]) f7);
                } else if (f7 instanceof Double) {
                    sQLiteProgram.bindDouble(i8, ((Double) f7).doubleValue());
                } else {
                    if (f7 instanceof Integer) {
                        j7 = ((Integer) f7).intValue();
                    } else if (f7 instanceof Long) {
                        j7 = ((Long) f7).longValue();
                    } else if (f7 instanceof String) {
                        sQLiteProgram.bindString(i8, (String) f7);
                    } else {
                        if (!(f7 instanceof Boolean)) {
                            throw new IllegalArgumentException("Could not bind " + f7 + " from index " + i7 + ": Supported types are null, byte[], double, long, boolean and String");
                        }
                        j7 = ((Boolean) f7).booleanValue() ? 1L : 0L;
                    }
                    sQLiteProgram.bindLong(i8, j7);
                }
                i7 = i8;
            }
        }
    }

    public List b() {
        return this.f17996b;
    }

    public String c() {
        return this.f17995a;
    }

    public Object[] d() {
        return e(this.f17996b);
    }

    public final Object[] e(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(f(it.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1737F)) {
            return false;
        }
        C1737F c1737f = (C1737F) obj;
        String str = this.f17995a;
        if (str != null) {
            if (!str.equals(c1737f.f17995a)) {
                return false;
            }
        } else if (c1737f.f17995a != null) {
            return false;
        }
        if (this.f17996b.size() != c1737f.f17996b.size()) {
            return false;
        }
        for (int i7 = 0; i7 < this.f17996b.size(); i7++) {
            if ((this.f17996b.get(i7) instanceof byte[]) && (c1737f.f17996b.get(i7) instanceof byte[])) {
                if (!Arrays.equals((byte[]) this.f17996b.get(i7), (byte[]) c1737f.f17996b.get(i7))) {
                    return false;
                }
            } else if (!this.f17996b.get(i7).equals(c1737f.f17996b.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f17995a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17995a);
        List list = this.f17996b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + this.f17996b;
        }
        sb.append(str);
        return sb.toString();
    }
}
