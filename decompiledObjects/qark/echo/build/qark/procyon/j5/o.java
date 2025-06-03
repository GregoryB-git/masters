// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j5;

import javax.crypto.spec.GCMParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import android.content.Context;

public class o extends h
{
    public o(final Context context, final a a) {
        super(context, a);
    }
    
    @Override
    public String c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
    }
    
    @Override
    public Cipher d() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }
    
    @Override
    public int e() {
        return 12;
    }
    
    @Override
    public AlgorithmParameterSpec f(final byte[] src) {
        return new GCMParameterSpec(128, src);
    }
}
