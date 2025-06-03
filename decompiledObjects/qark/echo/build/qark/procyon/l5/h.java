// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l5;

import org.json.JSONObject;
import java.util.Map;
import android.os.Bundle;
import android.content.Context;
import android.content.SharedPreferences;

public class h
{
    public SharedPreferences a;
    public boolean b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public String n;
    public String o;
    
    public h(final Context context) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences("audio_service_preferences", 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.getBoolean("androidResumeOnClick", true);
        this.c = this.a.getString("androidNotificationChannelId", (String)null);
        this.d = this.a.getString("androidNotificationChannelName", (String)null);
        this.e = this.a.getString("androidNotificationChannelDescription", (String)null);
        this.f = this.a.getInt("notificationColor", -1);
        this.g = this.a.getString("androidNotificationIcon", "mipmap/ic_launcher");
        this.h = this.a.getBoolean("androidShowNotificationBadge", false);
        this.i = this.a.getBoolean("androidNotificationClickStartsActivity", true);
        this.j = this.a.getBoolean("androidNotificationOngoing", false);
        this.k = this.a.getBoolean("androidStopForegroundOnPause", true);
        this.l = this.a.getInt("artDownscaleWidth", -1);
        this.m = this.a.getInt("artDownscaleHeight", -1);
        this.n = this.a.getString("activityClassName", (String)null);
        this.o = this.a.getString("androidBrowsableRootExtras", (String)null);
    }
    
    public Bundle a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        l5/h.o:Ljava/lang/String;
        //     4: ifnonnull       9
        //     7: aconst_null    
        //     8: areturn        
        //     9: new             Lorg/json/JSONObject;
        //    12: dup            
        //    13: aload_0        
        //    14: getfield        l5/h.o:Ljava/lang/String;
        //    17: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //    20: astore_1       
        //    21: new             Landroid/os/Bundle;
        //    24: dup            
        //    25: invokespecial   android/os/Bundle.<init>:()V
        //    28: astore_2       
        //    29: aload_1        
        //    30: invokevirtual   org/json/JSONObject.keys:()Ljava/util/Iterator;
        //    33: astore_3       
        //    34: aload_3        
        //    35: invokeinterface java/util/Iterator.hasNext:()Z
        //    40: ifeq            161
        //    43: aload_3        
        //    44: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    49: checkcast       Ljava/lang/String;
        //    52: astore          4
        //    54: aload_2        
        //    55: aload           4
        //    57: aload_1        
        //    58: aload           4
        //    60: invokevirtual   org/json/JSONObject.getInt:(Ljava/lang/String;)I
        //    63: invokevirtual   android/os/BaseBundle.putInt:(Ljava/lang/String;I)V
        //    66: goto            34
        //    69: aload_2        
        //    70: aload           4
        //    72: aload_1        
        //    73: aload           4
        //    75: invokevirtual   org/json/JSONObject.getBoolean:(Ljava/lang/String;)Z
        //    78: invokevirtual   android/os/BaseBundle.putBoolean:(Ljava/lang/String;Z)V
        //    81: goto            34
        //    84: aload_2        
        //    85: aload           4
        //    87: aload_1        
        //    88: aload           4
        //    90: invokevirtual   org/json/JSONObject.getDouble:(Ljava/lang/String;)D
        //    93: invokevirtual   android/os/BaseBundle.putDouble:(Ljava/lang/String;D)V
        //    96: goto            34
        //    99: aload_2        
        //   100: aload           4
        //   102: aload_1        
        //   103: aload           4
        //   105: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   108: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   111: goto            34
        //   114: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   117: astore          5
        //   119: new             Ljava/lang/StringBuilder;
        //   122: dup            
        //   123: invokespecial   java/lang/StringBuilder.<init>:()V
        //   126: astore          6
        //   128: aload           6
        //   130: ldc             "Unsupported extras value for key "
        //   132: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   135: pop            
        //   136: aload           6
        //   138: aload           4
        //   140: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   143: pop            
        //   144: aload           5
        //   146: aload           6
        //   148: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   151: invokevirtual   java/io/PrintStream.println:(Ljava/lang/String;)V
        //   154: goto            34
        //   157: astore_1       
        //   158: goto            163
        //   161: aload_2        
        //   162: areturn        
        //   163: aload_1        
        //   164: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //   167: aconst_null    
        //   168: areturn        
        //   169: astore          5
        //   171: goto            69
        //   174: astore          5
        //   176: goto            84
        //   179: astore          5
        //   181: goto            99
        //   184: astore          5
        //   186: goto            114
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      34     157    161    Ljava/lang/Exception;
        //  34     54     157    161    Ljava/lang/Exception;
        //  54     66     169    189    Ljava/lang/Exception;
        //  69     81     174    189    Ljava/lang/Exception;
        //  84     96     179    189    Ljava/lang/Exception;
        //  99     111    184    157    Ljava/lang/Exception;
        //  114    154    157    161    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 88 out of bounds for length 88
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:374)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:459)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void b() {
        this.a.edit().putBoolean("androidResumeOnClick", this.b).putString("androidNotificationChannelId", this.c).putString("androidNotificationChannelName", this.d).putString("androidNotificationChannelDescription", this.e).putInt("notificationColor", this.f).putString("androidNotificationIcon", this.g).putBoolean("androidShowNotificationBadge", this.h).putBoolean("androidNotificationClickStartsActivity", this.i).putBoolean("androidNotificationOngoing", this.j).putBoolean("androidStopForegroundOnPause", this.k).putInt("artDownscaleWidth", this.l).putInt("artDownscaleHeight", this.m).putString("activityClassName", this.n).putString("androidBrowsableRootExtras", this.o).apply();
    }
    
    public void c(final Map map) {
        String string;
        if (map != null) {
            string = new JSONObject(map).toString();
        }
        else {
            string = null;
        }
        this.o = string;
    }
}
