package androidx.work;

import androidx.work.c;
import ec.i;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o2.f;

/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends f {
    @Override // o2.f
    public final c a(ArrayList arrayList) {
        Object newInstance;
        c.a aVar = new c.a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((c) it.next()).f1455a);
            i.d(unmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = hashMap.get(str);
                i.d(str, Constants.KEY);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (i.a(cls2, cls)) {
                        i.d(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        i.b(componentType);
                        Object newInstance2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newInstance2, 0, length);
                        System.arraycopy(value, 0, newInstance2, length, length2);
                        i.d(newInstance2, "newArray");
                        value = newInstance2;
                        i.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(str, value);
                    } else {
                        if (!i.a(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        newInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newInstance, 0, length3);
                        Array.set(newInstance, length3, value);
                        i.d(newInstance, "newArray");
                        value = newInstance;
                        i.d(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(str, value);
                    }
                } else if (cls.isArray()) {
                    i.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                } else {
                    newInstance = Array.newInstance(cls, 1);
                    Array.set(newInstance, 0, value);
                    i.d(newInstance, "newArray");
                    value = newInstance;
                    i.d(value, "if (existingValue == nul…      }\n                }");
                    hashMap.put(str, value);
                }
            }
        }
        aVar.a(hashMap);
        c cVar = new c(aVar.f1456a);
        c.e(cVar);
        return cVar;
    }
}
