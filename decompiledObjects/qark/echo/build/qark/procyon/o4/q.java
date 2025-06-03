// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o4;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import android.os.Build$VERSION;
import java.util.ArrayList;
import java.util.List;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import android.content.Context;
import android.content.SharedPreferences;

public class q
{
    public final SharedPreferences a;
    
    public q(final Context context, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("FirebaseHeartBeat");
        sb.append(str);
        this.a = context.getSharedPreferences(sb.toString(), 0);
    }
    
    public final void a() {
        // monitorenter(this)
        while (true) {
            try {
                final long long1 = this.a.getLong("fire-count", 0L);
                String s = "";
                final Iterator<Map.Entry<K, Set>> iterator = this.a.getAll().entrySet().iterator();
                String s2 = null;
                while (iterator.hasNext()) {
                    final Map.Entry<K, Set> entry = iterator.next();
                    if (entry.getValue() instanceof Set) {
                        final Iterator<String> iterator2 = entry.getValue().iterator();
                        String s3 = s2;
                        String s4 = s;
                        while (true) {
                            s = s4;
                            s2 = s3;
                            if (!iterator2.hasNext()) {
                                break;
                            }
                            final String anotherString = iterator2.next();
                            if (s3 != null && s3.compareTo(anotherString) <= 0) {
                                continue;
                            }
                            s4 = (String)entry.getKey();
                            s3 = anotherString;
                        }
                    }
                }
                final HashSet set = new HashSet(this.a.getStringSet(s, (Set)new HashSet()));
                set.remove(s2);
                this.a.edit().putStringSet(s, (Set)set).putLong("fire-count", long1 - 1L).commit();
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void b() {
        // monitorenter(this)
        while (true) {
            try {
                final SharedPreferences$Editor edit = this.a.edit();
                final Iterator<Map.Entry<K, Set>> iterator = this.a.getAll().entrySet().iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final Map.Entry<K, Set> entry = iterator.next();
                    if (entry.getValue() instanceof Set) {
                        final Set set = entry.getValue();
                        final String d = this.d(System.currentTimeMillis());
                        final String s = (String)entry.getKey();
                        if (set.contains(d)) {
                            final HashSet<String> set2 = new HashSet<String>();
                            set2.add(d);
                            ++n;
                            edit.putStringSet(s, (Set)set2);
                        }
                        else {
                            edit.remove(s);
                        }
                    }
                }
                if (n == 0) {
                    edit.remove("fire-count");
                }
                else {
                    edit.putLong("fire-count", (long)n);
                }
                edit.commit();
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public List c() {
        // monitorenter(this)
        while (true) {
            try {
                final ArrayList<r> list = new ArrayList<r>();
                for (final Map.Entry<String, V> entry : this.a.getAll().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        final HashSet c = new HashSet<Object>(entry.getValue());
                        c.remove(this.d(System.currentTimeMillis()));
                        if (c.isEmpty()) {
                            continue;
                        }
                        list.add(r.a(entry.getKey(), new ArrayList(c)));
                    }
                }
                this.l(System.currentTimeMillis());
                // monitorexit(this)
                return list;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final String d(final long n) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0073: {
            try {
                if (Build$VERSION.SDK_INT >= 26) {
                    // monitorexit(this)
                    return p.a(n.a(m.a(k.a(new Date(n)), l.a())), o.a());
                }
            }
            finally {
                break Label_0073;
            }
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(n));
        }
    }
    // monitorexit(this)
    
    public final String e(String s) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0118: {
            Label_0114: {
                try {
                    Block_6: {
                        for (final Map.Entry<K, Set> entry : this.a.getAll().entrySet()) {
                            if (entry.getValue() instanceof Set) {
                                final Iterator<String> iterator2 = entry.getValue().iterator();
                                while (iterator2.hasNext()) {
                                    if (s.equals(iterator2.next())) {
                                        break Block_6;
                                    }
                                }
                            }
                        }
                        break Label_0114;
                    }
                    final Map.Entry<K, Set> entry;
                    s = (String)entry.getKey();
                    // monitorexit(this)
                    return s;
                }
                finally {
                    break Label_0118;
                }
            }
            return null;
        }
    }
    // monitorexit(this)
    
    public boolean f(final long n, final long n2) {
        synchronized (this) {
            return this.d(n).equals(this.d(n2));
        }
    }
    
    public void g() {
        synchronized (this) {
            final String d = this.d(System.currentTimeMillis());
            this.a.edit().putString("last-used-date", d).commit();
            this.h(d);
        }
    }
    
    public final void h(final String s) {
        // monitorenter(this)
        while (true) {
            try {
                final String e = this.e(s);
                if (e == null) {
                    // monitorexit(this)
                    return;
                }
                final HashSet set = new HashSet(this.a.getStringSet(e, (Set)new HashSet()));
                set.remove(s);
                SharedPreferences$Editor sharedPreferences$Editor;
                if (set.isEmpty()) {
                    sharedPreferences$Editor = this.a.edit().remove(e);
                }
                else {
                    sharedPreferences$Editor = this.a.edit().putStringSet(e, (Set)set);
                }
                sharedPreferences$Editor.commit();
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public boolean i(final long n) {
        synchronized (this) {
            return this.j("fire-global", n);
        }
    }
    
    public boolean j(final String s, final long n) {
        // monitorenter(this)
        // monitorexit(this)
        // monitorexit(this)
        Label_0096: {
            Label_0070: {
                try {
                    if (!this.a.contains(s)) {
                        break Label_0070;
                    }
                    if (!this.f(this.a.getLong(s, -1L), n)) {
                        this.a.edit().putLong(s, n).commit();
                        // monitorexit(this)
                        return true;
                    }
                }
                finally {
                    break Label_0096;
                }
                return false;
            }
            final String s2;
            this.a.edit().putLong(s2, n).commit();
            return true;
        }
    }
    // monitorexit(this)
    
    public void k(long n, final String anObject) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0202: {
            String d;
            try {
                d = this.d(n);
                if (this.a.getString("last-used-date", "").equals(d)) {
                    final String e = this.e(d);
                    if (e == null) {
                        // monitorexit(this)
                        return;
                    }
                    if (e.equals(anObject)) {
                        // monitorexit(this)
                        return;
                    }
                    this.m(anObject, d);
                    // monitorexit(this)
                    return;
                }
            }
            finally {
                break Label_0202;
            }
            if ((n = this.a.getLong("fire-count", 0L)) + 1L == 30L) {
                this.a();
                n = this.a.getLong("fire-count", 0L);
            }
            final String s;
            final HashSet set = new HashSet<String>(this.a.getStringSet(s, (Set)new HashSet()));
            set.add(d);
            this.a.edit().putStringSet(s, (Set)set).putLong("fire-count", n + 1L).putString("last-used-date", d).commit();
            return;
        }
    }
    // monitorexit(this)
    
    public void l(final long n) {
        synchronized (this) {
            this.a.edit().putLong("fire-global", n).commit();
        }
    }
    
    public final void m(final String s, final String s2) {
        synchronized (this) {
            this.h(s2);
            final HashSet<String> set = new HashSet<String>(this.a.getStringSet(s, (Set)new HashSet()));
            set.add(s2);
            this.a.edit().putStringSet(s, (Set)set).commit();
        }
    }
}
