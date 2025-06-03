// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R5;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import android.util.Base64;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import android.util.Log;
import android.content.Context;
import E5.c;
import java.util.HashMap;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.List;
import android.content.SharedPreferences;
import A5.a;

public class l implements A5.a, j.a
{
    public SharedPreferences a;
    public k b;
    
    public l() {
        this(new a());
    }
    
    public l(final k b) {
        this.b = b;
    }
    
    @Override
    public Boolean a(final String s, final Long n) {
        return this.a.edit().putLong(s, (long)n).commit();
    }
    
    @Override
    public Map b(final String s, final List c) {
        Set set;
        if (c == null) {
            set = null;
        }
        else {
            set = new HashSet(c);
        }
        return this.h(s, set);
    }
    
    @Override
    public Boolean c(final String s, final String s2) {
        if (!s2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !s2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") && !s2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return this.a.edit().putString(s, s2).commit();
        }
        throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
    }
    
    @Override
    public Boolean d(final String prefix, final List list) {
        final SharedPreferences$Editor edit = this.a.edit();
        final Map all = this.a.getAll();
        final ArrayList<String> list2 = new ArrayList<String>();
        for (final String e : all.keySet()) {
            if (e.startsWith(prefix) && (list == null || list.contains(e))) {
                list2.add(e);
            }
        }
        final Iterator<String> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            edit.remove((String)iterator2.next());
        }
        return edit.commit();
    }
    
    @Override
    public Boolean e(final String s, final List list) {
        final SharedPreferences$Editor edit = this.a.edit();
        final StringBuilder sb = new StringBuilder();
        sb.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
        sb.append(this.b.a(list));
        return edit.putString(s, sb.toString()).commit();
    }
    
    @Override
    public Boolean f(final String s, final Boolean b) {
        return this.a.edit().putBoolean(s, (boolean)b).commit();
    }
    
    @Override
    public Boolean g(final String s, final Double n) {
        final String string = Double.toString(n);
        final SharedPreferences$Editor edit = this.a.edit();
        final StringBuilder sb = new StringBuilder();
        sb.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu");
        sb.append(string);
        return edit.putString(s, sb.toString()).commit();
    }
    
    public final Map h(final String prefix, final Set set) {
        final Map all = this.a.getAll();
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (final String s : all.keySet()) {
            if (s.startsWith(prefix) && (set == null || set.contains(s))) {
                hashMap.put(s, this.j(s, all.get(s)));
            }
        }
        return hashMap;
    }
    
    public final void i(final c c, final Context context) {
        this.a = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            i.j(c, this);
        }
        catch (Exception ex) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", (Throwable)ex);
        }
    }
    
    public final Object j(String s, final Object o) {
        if (o instanceof String) {
            s = (String)o;
            if (s.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return this.b.b(s.substring(40));
            }
            if (s.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(s.substring(44), 36);
            }
            if (s.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(s.substring(40));
            }
        }
        else if (o instanceof Set) {
            final ArrayList list = new ArrayList((Collection<? extends E>)o);
            final SharedPreferences$Editor remove = this.a.edit().remove(s);
            final StringBuilder sb = new StringBuilder();
            sb.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
            sb.append(this.b.a(list));
            remove.putString(s, sb.toString()).apply();
            return list;
        }
        return o;
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.i(b.b(), b.a());
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        i.j(b.b(), null);
    }
    
    @Override
    public Boolean remove(final String s) {
        return this.a.edit().remove(s).commit();
    }
    
    public static class a implements k
    {
        @Override
        public String a(final List obj) {
            try {
                final ByteArrayOutputStream out = new ByteArrayOutputStream();
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
                objectOutputStream.writeObject(obj);
                objectOutputStream.flush();
                return Base64.encodeToString(out.toByteArray(), 0);
            }
            catch (IOException cause) {
                throw new RuntimeException(cause);
            }
        }
        
        @Override
        public List b(String cause) {
            try {
                cause = (ClassNotFoundException)new ObjectInputStream(new ByteArrayInputStream(Base64.decode((String)cause, 0))).readObject();
                return (List)cause;
            }
            catch (ClassNotFoundException cause) {}
            catch (IOException ex) {}
            throw new RuntimeException(cause);
        }
    }
}
