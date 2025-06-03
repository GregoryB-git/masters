/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Typeface
 *  com.mikepenz.iconics.typeface.IIcon
 *  com.mikepenz.iconics.typeface.ITypeface
 *  java.lang.Character
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.LinkedList
 */
package com.mikepenz.materialdrawer.icons;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.iconics.typeface.ITypeface;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class MaterialDrawerFont
implements ITypeface {
    private static final String TTF_FILE = "materialdrawerfont-font-v5.0.0.ttf";
    private static HashMap<String, Character> mChars;
    private static Typeface typeface;

    public String getAuthor() {
        return "";
    }

    public HashMap<String, Character> getCharacters() {
        if (mChars == null) {
            HashMap hashMap = new HashMap();
            for (Icon icon : Icon.values()) {
                hashMap.put((Object)icon.name(), (Object)Character.valueOf((char)icon.character));
            }
            mChars = hashMap;
        }
        return mChars;
    }

    public String getDescription() {
        return "";
    }

    public String getFontName() {
        return "MaterialDrawerFont";
    }

    public IIcon getIcon(String string) {
        return Icon.valueOf(string);
    }

    public int getIconCount() {
        return mChars.size();
    }

    public Collection<String> getIcons() {
        LinkedList linkedList = new LinkedList();
        Icon[] iconArray = Icon.values();
        int n = iconArray.length;
        for (int i = 0; i < n; ++i) {
            linkedList.add((Object)iconArray[i].name());
        }
        return linkedList;
    }

    public String getLicense() {
        return "";
    }

    public String getLicenseUrl() {
        return "";
    }

    public String getMappingPrefix() {
        return "mdf";
    }

    public Typeface getTypeface(Context context) {
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset((AssetManager)context.getAssets(), (String)"fonts/materialdrawerfont-font-v5.0.0.ttf");
            }
            catch (Exception exception) {
                return null;
            }
        }
        return typeface;
    }

    public String getUrl() {
        return "";
    }

    public String getVersion() {
        return "5.0.0";
    }

    public static final class Icon
    extends Enum<Icon>
    implements IIcon {
        private static final Icon[] $VALUES;
        public static final /* enum */ Icon mdf_arrow_drop_down;
        public static final /* enum */ Icon mdf_arrow_drop_up;
        public static final /* enum */ Icon mdf_expand_less;
        public static final /* enum */ Icon mdf_expand_more;
        public static final /* enum */ Icon mdf_person;
        private static ITypeface typeface;
        public char character;

        static {
            Icon icon;
            Icon icon2;
            Icon icon3;
            Icon icon4;
            Icon icon5;
            mdf_arrow_drop_down = icon5 = new Icon('\ue5c5');
            mdf_arrow_drop_up = icon4 = new Icon('\ue5c7');
            mdf_expand_less = icon3 = new Icon('\ue5ce');
            mdf_expand_more = icon2 = new Icon('\ue5cf');
            mdf_person = icon = new Icon('\ue7fd');
            $VALUES = new Icon[]{icon5, icon4, icon3, icon2, icon};
        }

        private Icon(char c) {
            this.character = c;
        }

        public static Icon valueOf(String string) {
            return (Icon)Enum.valueOf(Icon.class, (String)string);
        }

        public static Icon[] values() {
            return (Icon[])$VALUES.clone();
        }

        public char getCharacter() {
            return this.character;
        }

        public String getFormattedName() {
            StringBuilder stringBuilder = z2.t("{");
            stringBuilder.append(this.name());
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public String getName() {
            return this.name();
        }

        public ITypeface getTypeface() {
            if (typeface == null) {
                typeface = new MaterialDrawerFont();
            }
            return typeface;
        }
    }
}

