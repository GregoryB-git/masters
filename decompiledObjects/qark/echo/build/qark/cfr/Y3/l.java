/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package Y3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class l {
    public Map a = new HashMap();
    public Object b;

    public String a(String string2) {
        Object object = new StringBuilder();
        object.append(string2);
        object.append("<value>: ");
        object.append(this.b);
        object.append("\n");
        object = object.toString();
        if (this.a.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(string2);
            stringBuilder.append("<empty>");
            return stringBuilder.toString();
        }
        Iterator iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(string2);
            stringBuilder.append(entry.getKey());
            stringBuilder.append(":\n");
            object = (l)entry.getValue();
            entry = new StringBuilder();
            entry.append(string2);
            entry.append("\t");
            stringBuilder.append(object.a(entry.toString()));
            stringBuilder.append("\n");
            object = stringBuilder.toString();
        }
        return object;
    }
}

