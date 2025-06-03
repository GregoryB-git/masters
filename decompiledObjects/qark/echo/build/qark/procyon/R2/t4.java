// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import A2.n;
import java.io.ObjectStreamConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;

public abstract class t4
{
    public static Object a(Object object) {
        if (object == null) {
            return null;
        }
        while (true) {
            try {
                final ByteArrayOutputStream out = new ByteArrayOutputStream();
                final ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
                try {
                    objectOutputStream.writeObject(object);
                    objectOutputStream.flush();
                    final ObjectStreamConstants objectStreamConstants = new ObjectInputStream(new ByteArrayInputStream(out.toByteArray()));
                    try {
                        object = ((ObjectInputStream)objectStreamConstants).readObject();
                        try {
                            objectOutputStream.close();
                            ((ObjectInputStream)objectStreamConstants).close();
                            return object;
                            Label_0082: {
                                throw;
                            }
                            // iftrue(Label_0074:, objectOutputStream == null)
                        Label_0074:
                            while (true) {
                                objectOutputStream.close();
                                break Label_0074;
                                continue;
                            }
                            // iftrue(Label_0082:, objectStreamConstants == null)
                            ((ObjectInputStream)objectStreamConstants).close();
                        }
                        catch (IOException | ClassNotFoundException ex) {
                            return null;
                        }
                    }
                    finally {}
                }
                finally {
                    final ObjectStreamConstants objectStreamConstants = null;
                }
            }
            finally {
                final ObjectOutputStream objectOutputStream;
                final ObjectStreamConstants objectStreamConstants = objectOutputStream = null;
                continue;
            }
            break;
        }
    }
    
    public static String b(final String s, final String[] array, final String[] array2) {
        n.i(array);
        n.i(array2);
        final int min = Math.min(array.length, array2.length);
        int i = 0;
        while (i < min) {
            final String anObject = array[i];
            if (s != null || anObject != null) {
                if (s != null) {
                    if (s.equals(anObject)) {
                        return array2[i];
                    }
                }
                ++i;
                continue;
            }
            return array2[i];
        }
        return null;
    }
}
