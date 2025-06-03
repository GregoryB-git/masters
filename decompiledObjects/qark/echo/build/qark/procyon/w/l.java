// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w;

import android.os.Bundle;
import android.content.Intent;
import android.app.RemoteInput;

public abstract class l
{
    public static RemoteInput a(final l l) {
        return a.b(l);
    }
    
    public static RemoteInput[] b(final l[] array) {
        if (array == null) {
            return null;
        }
        final RemoteInput[] array2 = new RemoteInput[array.length];
        for (int i = 0; i < array.length; ++i) {
            final l l = array[i];
            array2[i] = a(null);
        }
        return array2;
    }
    
    public abstract static class a
    {
        public static void a(final Object o, final Intent intent, final Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[])o, intent, bundle);
        }
        
        public static RemoteInput b(final l l) {
            throw null;
        }
        
        public static Bundle c(final Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }
}
