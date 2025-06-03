/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import ru.tvrain.core.data.FirstScreenResponseItemRecord;

public class FirstScreenResponseItem
implements Serializable {
    public static final String CODE_API_BREAKING_NEWS = "api_breaking";
    public static final String CODE_API_MENU = "api_menu";
    public static final String CODE_API_OURCHOICE = "api_ourchoice";
    public static final String CODE_API_OURCHOICE_FIRST = "api_ourchoice_first";
    public static final String CODE_API_OURCHOICE_SECOND = "api_ourchoice_second";
    public static final String CODE_LITE = "Lite";
    public static final String CODE_THEMEOFTHEDAY = "api_themesoftheday";
    public static final String TEMPLATE_API_DEFAULT = "api_default";
    public static final String TEMPLATE_DEFAULT = "default";
    public static final String TEMPLATE_SLIDER = "api_slider";
    @Expose
    @SerializedName(value="code")
    public String code;
    @Expose
    @SerializedName(value="items")
    public List<FirstScreenResponseItemRecord> items;
    @Expose
    @SerializedName(value="name")
    public String name;
    @Expose
    @SerializedName(value="template")
    public String template;
}

