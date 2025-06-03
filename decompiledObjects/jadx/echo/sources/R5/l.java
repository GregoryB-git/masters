package R5;

import A5.a;
import R5.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class l implements A5.a, j.a {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f5800a;

    /* renamed from: b, reason: collision with root package name */
    public k f5801b;

    public static class a implements k {
        @Override // R5.k
        public String a(List list) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // R5.k
        public List b(String str) {
            try {
                return (List) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public l() {
        this(new a());
    }

    @Override // R5.j.a
    public Boolean a(String str, Long l7) {
        return Boolean.valueOf(this.f5800a.edit().putLong(str, l7.longValue()).commit());
    }

    @Override // R5.j.a
    public Map b(String str, List list) {
        return h(str, list == null ? null : new HashSet(list));
    }

    @Override // R5.j.a
    public Boolean c(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f5800a.edit().putString(str, str2).commit());
    }

    @Override // R5.j.a
    public Boolean d(String str, List list) {
        SharedPreferences.Editor edit = this.f5800a.edit();
        Map<String, ?> all = this.f5800a.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    @Override // R5.j.a
    public Boolean e(String str, List list) {
        return Boolean.valueOf(this.f5800a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f5801b.a(list)).commit());
    }

    @Override // R5.j.a
    public Boolean f(String str, Boolean bool) {
        return Boolean.valueOf(this.f5800a.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    @Override // R5.j.a
    public Boolean g(String str, Double d7) {
        String d8 = Double.toString(d7.doubleValue());
        return Boolean.valueOf(this.f5800a.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d8).commit());
    }

    public final Map h(String str, Set set) {
        Map<String, ?> all = this.f5800a.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (set == null || set.contains(str2))) {
                hashMap.put(str2, j(str2, all.get(str2)));
            }
        }
        return hashMap;
    }

    public final void i(E5.c cVar, Context context) {
        this.f5800a = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            i.j(cVar, this);
        } catch (Exception e7) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e7);
        }
    }

    public final Object j(String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return this.f5801b.b(str2.substring(40));
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            this.f5800a.edit().remove(str).putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f5801b.a(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        i(bVar.b(), bVar.a());
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        i.j(bVar.b(), null);
    }

    @Override // R5.j.a
    public Boolean remove(String str) {
        return Boolean.valueOf(this.f5800a.edit().remove(str).commit());
    }

    public l(k kVar) {
        this.f5801b = kVar;
    }
}
