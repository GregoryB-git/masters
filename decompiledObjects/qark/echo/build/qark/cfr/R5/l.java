/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.util.Base64
 *  android.util.Log
 *  java.io.ByteArrayInputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.OutputStream
 *  java.lang.Boolean
 *  java.lang.ClassNotFoundException
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.math.BigInteger
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package R5;

import A5.a;
import E5.c;
import R5.i;
import R5.j;
import R5.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class l
implements A5.a,
j.a {
    public SharedPreferences a;
    public k b;

    public l() {
        this(new a());
    }

    public l(k k8) {
        this.b = k8;
    }

    @Override
    public Boolean a(String string2, Long l8) {
        return this.a.edit().putLong(string2, l8.longValue()).commit();
    }

    @Override
    public Map b(String string2, List list) {
        list = list == null ? null : new HashSet((Collection)list);
        return this.h(string2, (Set)list);
    }

    @Override
    public Boolean c(String string2, String string3) {
        if (!(string3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || string3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || string3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu"))) {
            return this.a.edit().putString(string2, string3).commit();
        }
        throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
    }

    @Override
    public Boolean d(String string2, List list) {
        SharedPreferences.Editor editor = this.a.edit();
        Map map = this.a.getAll();
        ArrayList arrayList = new ArrayList();
        for (String string3 : map.keySet()) {
            if (!string3.startsWith(string2) || list != null && !list.contains((Object)string3)) continue;
            arrayList.add((Object)string3);
        }
        string2 = arrayList.iterator();
        while (string2.hasNext()) {
            editor.remove((String)string2.next());
        }
        return editor.commit();
    }

    @Override
    public Boolean e(String string2, List list) {
        SharedPreferences.Editor editor = this.a.edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
        stringBuilder.append(this.b.a(list));
        return editor.putString(string2, stringBuilder.toString()).commit();
    }

    @Override
    public Boolean f(String string2, Boolean bl) {
        return this.a.edit().putBoolean(string2, bl.booleanValue()).commit();
    }

    @Override
    public Boolean g(String string2, Double object) {
        object = Double.toString((double)object.doubleValue());
        SharedPreferences.Editor editor = this.a.edit();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu");
        stringBuilder.append((String)object);
        return editor.putString(string2, stringBuilder.toString()).commit();
    }

    public final Map h(String string2, Set set) {
        Map map = this.a.getAll();
        HashMap hashMap = new HashMap();
        for (String string3 : map.keySet()) {
            if (!string3.startsWith(string2) || set != null && !set.contains((Object)string3)) continue;
            hashMap.put((Object)string3, this.j(string3, map.get((Object)string3)));
        }
        return hashMap;
    }

    public final void i(c c8, Context context) {
        this.a = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            i.j(c8, this);
            return;
        }
        catch (Exception exception) {
            Log.e((String)"SharedPreferencesPlugin", (String)"Received exception while setting up SharedPreferencesPlugin", (Throwable)exception);
            return;
        }
    }

    public final Object j(String string2, Object object) {
        if (object instanceof String) {
            string2 = (String)object;
            if (string2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return this.b.b(string2.substring(40));
            }
            if (string2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(string2.substring(44), 36);
            }
            if (string2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf((String)string2.substring(40));
            }
        } else if (object instanceof Set) {
            object = new ArrayList((Collection)((Set)object));
            SharedPreferences.Editor editor = this.a.edit().remove(string2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
            stringBuilder.append(this.b.a((List)object));
            editor.putString(string2, stringBuilder.toString()).apply();
            return object;
        }
        return object;
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.i(b8.b(), b8.a());
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        i.j(b8.b(), null);
    }

    @Override
    public Boolean remove(String string2) {
        return this.a.edit().remove(string2).commit();
    }

    public static class a
    implements k {
        @Override
        public String a(List object) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream((OutputStream)byteArrayOutputStream);
                objectOutputStream.writeObject(object);
                objectOutputStream.flush();
                object = Base64.encodeToString((byte[])byteArrayOutputStream.toByteArray(), (int)0);
                return object;
            }
            catch (IOException iOException) {
                throw new RuntimeException((Throwable)iOException);
            }
        }

        @Override
        public List b(String string2) {
            void var1_4;
            try {
                string2 = (List)new ObjectInputStream((InputStream)new ByteArrayInputStream(Base64.decode((String)string2, (int)0))).readObject();
                return string2;
            }
            catch (ClassNotFoundException classNotFoundException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            throw new RuntimeException((Throwable)var1_4);
        }
    }

}

