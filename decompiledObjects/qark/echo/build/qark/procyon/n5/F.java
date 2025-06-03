// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n5;

import java.util.Arrays;
import java.util.Iterator;
import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.List;

public class F
{
    public final String a;
    public final List b;
    
    public F(final String a, final List list) {
        this.a = a;
        List b = list;
        if (list == null) {
            b = new ArrayList();
        }
        this.b = b;
    }
    
    public static Object f(final Object o) {
        if (o == null) {
            return null;
        }
        Object o2 = o;
        if (o instanceof List) {
            final List list = (List)o;
            o2 = new byte[list.size()];
            for (int i = 0; i < list.size(); ++i) {
                o2[i] = (byte)(int)list.get(i);
            }
        }
        return o2;
    }
    
    public void a(final SQLiteProgram sqLiteProgram) {
        final List b = this.b;
        if (b != null) {
            int n;
            for (int size = b.size(), i = 0; i < size; i = n) {
                final Object f = f(this.b.get(i));
                n = i + 1;
                if (f == null) {
                    sqLiteProgram.bindNull(n);
                }
                else if (f instanceof byte[]) {
                    sqLiteProgram.bindBlob(n, (byte[])f);
                }
                else if (f instanceof Double) {
                    sqLiteProgram.bindDouble(n, (double)f);
                }
                else {
                    long longValue;
                    if (f instanceof Integer) {
                        longValue = (int)f;
                    }
                    else if (f instanceof Long) {
                        longValue = (long)f;
                    }
                    else {
                        if (f instanceof String) {
                            sqLiteProgram.bindString(n, (String)f);
                            continue;
                        }
                        if (!(f instanceof Boolean)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Could not bind ");
                            sb.append(f);
                            sb.append(" from index ");
                            sb.append(i);
                            sb.append(": Supported types are null, byte[], double, long, boolean and String");
                            throw new IllegalArgumentException(sb.toString());
                        }
                        if (f) {
                            longValue = 1L;
                        }
                        else {
                            longValue = 0L;
                        }
                    }
                    sqLiteProgram.bindLong(n, longValue);
                }
            }
        }
    }
    
    public List b() {
        return this.b;
    }
    
    public String c() {
        return this.a;
    }
    
    public Object[] d() {
        return this.e(this.b);
    }
    
    public final Object[] e(final List list) {
        final ArrayList<Object> list2 = new ArrayList<Object>();
        if (list != null) {
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(f(iterator.next()));
            }
        }
        return list2.toArray(new Object[0]);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof F)) {
            return false;
        }
        final F f = (F)o;
        final String a = this.a;
        if (a != null) {
            if (!a.equals(f.a)) {
                return false;
            }
        }
        else if (f.a != null) {
            return false;
        }
        if (this.b.size() != f.b.size()) {
            return false;
        }
        for (int i = 0; i < this.b.size(); ++i) {
            if (this.b.get(i) instanceof byte[] && f.b.get(i) instanceof byte[]) {
                if (!Arrays.equals((byte[])this.b.get(i), (byte[])f.b.get(i))) {
                    return false;
                }
            }
            else if (!this.b.get(i).equals(f.b.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final String a = this.a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        final List b = this.b;
        String string;
        if (b != null && !b.isEmpty()) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(this.b);
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        return sb.toString();
    }
}
