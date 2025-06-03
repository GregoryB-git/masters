// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

public abstract class e0
{
    public static String a(final f f) {
        return b((b)new b() {
            @Override
            public byte a(final int n) {
                return f.d(n);
            }
            
            @Override
            public int size() {
                return f.size();
            }
        });
    }
    
    public static String b(final b b) {
        final StringBuilder sb = new StringBuilder(b.size());
        for (int i = 0; i < b.size(); ++i) {
            int a = b.a(i);
            String str;
            if (a != 34) {
                if (a != 39) {
                    if (a != 92) {
                        switch (a) {
                            default: {
                                if (a < 32 || a > 126) {
                                    sb.append('\\');
                                    sb.append((char)((a >>> 6 & 0x3) + 48));
                                    sb.append((char)((a >>> 3 & 0x7) + 48));
                                    a = (a & 0x7) + 48;
                                }
                                sb.append((char)a);
                                continue;
                            }
                            case 13: {
                                str = "\\r";
                                break;
                            }
                            case 12: {
                                str = "\\f";
                                break;
                            }
                            case 11: {
                                str = "\\v";
                                break;
                            }
                            case 10: {
                                str = "\\n";
                                break;
                            }
                            case 9: {
                                str = "\\t";
                                break;
                            }
                            case 8: {
                                str = "\\b";
                                break;
                            }
                            case 7: {
                                str = "\\a";
                                break;
                            }
                        }
                    }
                    else {
                        str = "\\\\";
                    }
                }
                else {
                    str = "\\'";
                }
            }
            else {
                str = "\\\"";
            }
            sb.append(str);
        }
        return sb.toString();
    }
    
    public static String c(final String s) {
        return a(f.i(s));
    }
    
    public interface b
    {
        byte a(final int p0);
        
        int size();
    }
}
