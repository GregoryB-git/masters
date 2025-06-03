/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteProgram
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 */
package n5;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class F {
    public final String a;
    public final List b;

    public F(String string2, List list) {
        this.a = string2;
        string2 = list;
        if (list == null) {
            string2 = new ArrayList();
        }
        this.b = string2;
    }

    public static Object f(Object arrby) {
        if (arrby == null) {
            return null;
        }
        byte[] arrby2 = arrby;
        if (arrby instanceof List) {
            arrby = (List)arrby;
            arrby2 = new byte[arrby.size()];
            for (int i8 = 0; i8 < arrby.size(); ++i8) {
                arrby2[i8] = (byte)((Integer)arrby.get(i8)).intValue();
            }
        }
        return arrby2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(SQLiteProgram var1_1) {
        var7_2 = this.b;
        if (var7_2 == null) return;
        var4_3 = var7_2.size();
        var2_4 = 0;
        while (var2_4 < var4_3) {
            block5 : {
                block9 : {
                    block8 : {
                        block7 : {
                            block6 : {
                                block4 : {
                                    var7_2 = F.f(this.b.get(var2_4));
                                    var3_5 = var2_4 + 1;
                                    if (var7_2 != null) break block4;
                                    var1_1.bindNull(var3_5);
                                    break block5;
                                }
                                if (!(var7_2 instanceof byte[])) break block6;
                                var1_1.bindBlob(var3_5, (byte[])var7_2);
                                break block5;
                            }
                            if (!(var7_2 instanceof Double)) break block7;
                            var1_1.bindDouble(var3_5, ((Double)var7_2).doubleValue());
                            break block5;
                        }
                        if (!(var7_2 instanceof Integer)) break block8;
                        var5_6 = ((Integer)var7_2).intValue();
                        ** GOTO lbl40
                    }
                    if (!(var7_2 instanceof Long)) break block9;
                    var5_6 = (Long)var7_2;
                    ** GOTO lbl40
                }
                if (var7_2 instanceof String) {
                    var1_1.bindString(var3_5, (String)var7_2);
                } else {
                    if (!(var7_2 instanceof Boolean)) {
                        var1_1 = new StringBuilder();
                        var1_1.append("Could not bind ");
                        var1_1.append(var7_2);
                        var1_1.append(" from index ");
                        var1_1.append(var2_4);
                        var1_1.append(": Supported types are null, byte[], double, long, boolean and String");
                        throw new IllegalArgumentException(var1_1.toString());
                    }
                    var5_6 = (Boolean)var7_2 != false ? 1L : 0L;
lbl40: // 3 sources:
                    var1_1.bindLong(var3_5, var5_6);
                }
            }
            var2_4 = var3_5;
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

    public final Object[] e(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            list = list.iterator();
            while (list.hasNext()) {
                arrayList.add(F.f(list.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    public boolean equals(Object object) {
        if (object instanceof F) {
            object = (F)object;
            String string2 = this.a;
            if (string2 != null ? !string2.equals((Object)object.a) : object.a != null) {
                return false;
            }
            if (this.b.size() != object.b.size()) {
                return false;
            }
            for (int i8 = 0; i8 < this.b.size(); ++i8) {
                if (!(this.b.get(i8) instanceof byte[] && object.b.get(i8) instanceof byte[] ? !Arrays.equals((byte[])((byte[])this.b.get(i8)), (byte[])((byte[])object.b.get(i8))) : !this.b.get(i8).equals(object.b.get(i8)))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String string2 = this.a;
        if (string2 != null) {
            return string2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        Object object = this.b;
        if (object != null && !object.isEmpty()) {
            object = new StringBuilder();
            object.append(" ");
            object.append((Object)this.b);
            object = object.toString();
        } else {
            object = "";
        }
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }
}

