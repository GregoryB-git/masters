/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package ru.tvrain.core.data;

public class ProgramCategory {
    public String id;
    public String name;

    public ProgramCategory(String string2, String string3) {
        this.id = string2;
        this.name = string3;
    }

    public long getRowId() {
        int n3;
        block4: {
            String string2;
            block3: {
                try {
                    string2 = this.id;
                    if (string2 != null) break block3;
                    n3 = 0;
                    break block4;
                }
                catch (Exception exception) {
                    return 1000L;
                }
            }
            n3 = Integer.valueOf((String)string2);
        }
        return 1000 + n3;
    }
}

