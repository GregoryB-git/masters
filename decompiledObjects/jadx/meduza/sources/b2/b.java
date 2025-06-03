package b2;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* loaded from: classes.dex */
public final class b extends ObjectInputStream {
    public b(ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
    }

    @Override // java.io.ObjectInputStream
    public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        Class<?> cls = Class.forName(objectStreamClass.getName(), false, b.class.getClassLoader());
        return cls != null ? cls : super.resolveClass(objectStreamClass);
    }
}
