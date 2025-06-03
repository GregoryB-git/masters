// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e2;

import android.util.JsonToken;
import java.io.IOException;
import android.util.JsonReader;
import java.io.Reader;

public abstract class n
{
    public static n a(final long n) {
        return new h(n);
    }
    
    public static n b(Reader reader) {
        while (true) {
            reader = (Reader)new JsonReader(reader);
            Label_0094: {
            Label_0063:
                while (true) {
                    Label_0077: {
                        try {
                            ((JsonReader)reader).beginObject();
                            if (!((JsonReader)reader).hasNext()) {
                                throw new IOException("Response is missing nextRequestWaitMillis field.");
                            }
                            if (!((JsonReader)reader).nextName().equals("nextRequestWaitMillis")) {
                                break Label_0077;
                            }
                            if (((JsonReader)reader).peek() == JsonToken.STRING) {
                                final n a = a(Long.parseLong(((JsonReader)reader).nextString()));
                                ((JsonReader)reader).close();
                                return a;
                            }
                        }
                        finally {
                            break Label_0094;
                        }
                        break Label_0063;
                    }
                    ((JsonReader)reader).skipValue();
                    continue;
                }
                final n a2 = a(((JsonReader)reader).nextLong());
                ((JsonReader)reader).close();
                return a2;
            }
            ((JsonReader)reader).close();
        }
    }
    
    public abstract long c();
}
