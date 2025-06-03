.class public Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/pichillilorenzo/flutter_inappwebview_android/ISettings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/pichillilorenzo/flutter_inappwebview_android/ISettings<",
        "Landroidx/webkit/ProcessGlobalConfig;",
        ">;"
    }
.end annotation


# static fields
.field public static final LOG_TAG:Ljava/lang/String; = "ProcessGlobalConfigSettings"


# instance fields
.field public dataDirectorySuffix:Ljava/lang/String;

.field public directoryBasePaths:Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRealSettings(Landroidx/webkit/ProcessGlobalConfig;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/webkit/ProcessGlobalConfig;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->toMap()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getRealSettings(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    check-cast p1, Landroidx/webkit/ProcessGlobalConfig;

    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->getRealSettings(Landroidx/webkit/ProcessGlobalConfig;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/ISettings;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;

    move-result-object p1

    return-object p1
.end method

.method public parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "dataDirectorySuffix"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "directoryBasePaths"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;

    invoke-direct {v1}, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;-><init>()V

    check-cast v0, Ljava/util/Map;

    invoke-virtual {v1, v0}, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;->parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;

    move-result-object v0

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->directoryBasePaths:Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;

    goto :goto_0

    :cond_2
    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->dataDirectorySuffix:Ljava/lang/String;

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method public toMap()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->dataDirectorySuffix:Ljava/lang/String;

    const-string v2, "dataDirectorySuffix"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public toProcessGlobalConfig(Landroid/content/Context;)Landroidx/webkit/ProcessGlobalConfig;
    .locals 4

    .line 1
    new-instance v0, Landroidx/webkit/ProcessGlobalConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/webkit/ProcessGlobalConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->dataDirectorySuffix:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    const-string v1, "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX"

    .line 11
    .line 12
    invoke-static {p1, v1}, Lx6/b;->e0(Landroid/content/Context;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->dataDirectorySuffix:Ljava/lang/String;

    .line 19
    .line 20
    sget-object v2, Ld2/i0;->A:Ld2/z$b;

    .line 21
    .line 22
    invoke-virtual {v2, p1}, Ld2/z;->a(Landroid/content/Context;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    const-string v2, ""

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    sget-char v2, Ljava/io/File;->separatorChar:C

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-gez v2, :cond_0

    .line 43
    .line 44
    iput-object v1, v0, Landroidx/webkit/ProcessGlobalConfig;->a:Ljava/lang/String;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v0, "Suffix "

    .line 50
    .line 51
    const-string v2, " contains a path separator"

    .line 52
    .line 53
    invoke-static {v0, v1, v2}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    const-string v0, "Suffix cannot be an empty string"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    invoke-static {}, Ld2/i0;->a()Ljava/lang/UnsupportedOperationException;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    throw p1

    .line 74
    :cond_3
    :goto_0
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->directoryBasePaths:Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;

    .line 75
    .line 76
    if-eqz v1, :cond_7

    .line 77
    .line 78
    const-string v1, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS"

    .line 79
    .line 80
    invoke-static {p1, v1}, Lx6/b;->e0(Landroid/content/Context;Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_7

    .line 85
    .line 86
    new-instance v1, Ljava/io/File;

    .line 87
    .line 88
    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->directoryBasePaths:Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;

    .line 89
    .line 90
    iget-object v2, v2, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;->dataDirectoryBasePath:Ljava/lang/String;

    .line 91
    .line 92
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v2, Ljava/io/File;

    .line 96
    .line 97
    iget-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->directoryBasePaths:Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;

    .line 98
    .line 99
    iget-object v3, v3, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;->cacheDirectoryBasePath:Ljava/lang/String;

    .line 100
    .line 101
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    sget-object v3, Ld2/i0;->B:Ld2/z$a;

    .line 105
    .line 106
    invoke-virtual {v3, p1}, Ld2/z;->a(Landroid/content/Context;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_6

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/io/File;->isAbsolute()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_5

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/io/File;->isAbsolute()Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_4

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iput-object p1, v0, Landroidx/webkit/ProcessGlobalConfig;->b:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iput-object p1, v0, Landroidx/webkit/ProcessGlobalConfig;->c:Ljava/lang/String;

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 138
    .line 139
    const-string v0, "cacheDirectoryBasePath must be a non-empty absolute path"

    .line 140
    .line 141
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 146
    .line 147
    const-string v0, "dataDirectoryBasePath must be a non-empty absolute path"

    .line 148
    .line 149
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p1

    .line 153
    :cond_6
    invoke-static {}, Ld2/i0;->a()Ljava/lang/UnsupportedOperationException;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    throw p1

    .line 158
    :cond_7
    :goto_1
    return-object v0
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method
