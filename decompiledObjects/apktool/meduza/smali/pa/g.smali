.class public final Lpa/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/embedding/engine/plugins/FlutterPlugin;
.implements Lio/flutter/embedding/engine/plugins/activity/ActivityAware;
.implements Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpa/g$a;,
        Lpa/g$b;,
        Lpa/g$c;
    }
.end annotation


# instance fields
.field public final a:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Lpa/b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LongSparseArray<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public c:Lpa/g$a;

.field public d:J

.field public e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public f:Landroid/app/Activity;

.field public o:Landroid/os/Handler;

.field public p:Lx0/q0;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lpa/g;->a:Landroid/util/LongSparseArray;

    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lpa/g;->b:Landroid/util/LongSparseArray;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lpa/g;->d:J

    return-void
.end method

.method public static b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    return-object p2
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lpa/g;->a:Landroid/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/util/LongSparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lpa/g;->a:Landroid/util/LongSparseArray;

    invoke-virtual {v2, v1}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpa/b;

    invoke-virtual {v2}, Lpa/b;->a()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lpa/g;->a:Landroid/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/util/LongSparseArray;->clear()V

    iget-object v0, p0, Lpa/g;->b:Landroid/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/util/LongSparseArray;->clear()V

    return-void
.end method

.method public final c(Lpa/b;)Ljava/lang/Long;
    .locals 3

    iget-object v0, p0, Lpa/g;->a:Landroid/util/LongSparseArray;

    invoke-virtual {v0}, Landroid/util/LongSparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lpa/g;->a:Landroid/util/LongSparseArray;

    invoke-virtual {v2, v1}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_0

    iget-object p1, p0, Lpa/g;->a:Landroid/util/LongSparseArray;

    invoke-virtual {p1, v1}, Landroid/util/LongSparseArray;->keyAt(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final onAttachedToActivity(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;->getActivity()Landroid/app/Activity;

    move-result-object p1

    iput-object p1, p0, Lpa/g;->f:Landroid/app/Activity;

    return-void
.end method

.method public final onAttachedToEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 8

    const-string v0, "binding"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/embedding/engine/loader/FlutterLoader;

    invoke-direct {v0}, Lio/flutter/embedding/engine/loader/FlutterLoader;-><init>()V

    new-instance v7, Lpa/g$a;

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v1, "getApplicationContext(...)"

    invoke-static {v2, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getBinaryMessenger()Lio/flutter/plugin/common/BinaryMessenger;

    move-result-object v3

    const-string v1, "getBinaryMessenger(...)"

    invoke-static {v3, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lpa/g$d;

    invoke-direct {v4, v0}, Lpa/g$d;-><init>(Lio/flutter/embedding/engine/loader/FlutterLoader;)V

    new-instance v5, Lpa/g$e;

    invoke-direct {v5, v0}, Lpa/g$e;-><init>(Lio/flutter/embedding/engine/loader/FlutterLoader;)V

    invoke-virtual {p1}, Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;->getTextureRegistry()Lio/flutter/view/TextureRegistry;

    move-result-object v6

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lpa/g$a;-><init>(Landroid/content/Context;Lio/flutter/plugin/common/BinaryMessenger;Lpa/g$d;Lpa/g$e;Lio/flutter/view/TextureRegistry;)V

    iput-object v7, p0, Lpa/g;->c:Lpa/g$a;

    iget-object p1, v7, Lpa/g$a;->f:Lio/flutter/plugin/common/MethodChannel;

    invoke-virtual {p1, p0}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 0

    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 0

    return-void
.end method

.method public final onDetachedFromEngine(Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;)V
    .locals 2

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lpa/g;->c:Lpa/g$a;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, "BetterPlayerPlugin"

    .line 11
    .line 12
    const-string v0, "Detached from the engine before registering to it."

    .line 13
    .line 14
    invoke-static {p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lpa/g;->a()V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lpa/f;->a:Lpa/f;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    :try_start_0
    sget-object v0, Lpa/f;->b:Lu5/q;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    sget-object v0, Lpa/f;->b:Lu5/q;

    .line 28
    .line 29
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lu5/q;->q()V

    .line 33
    .line 34
    .line 35
    sput-object p1, Lpa/f;->b:Lu5/q;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "BetterPlayerCache"

    .line 44
    .line 45
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    :cond_1
    :goto_0
    iget-object v0, p0, Lpa/g;->c:Lpa/g$a;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    iget-object v0, v0, Lpa/g$a;->f:Lio/flutter/plugin/common/MethodChannel;

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lio/flutter/plugin/common/MethodChannel;->setMethodCallHandler(Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    iput-object p1, p0, Lpa/g;->c:Lpa/g$a;

    .line 58
    .line 59
    return-void
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final onMethodCall(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    const-string v2, "call"

    .line 8
    .line 9
    invoke-static {v0, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "result"

    .line 13
    .line 14
    invoke-static {v7, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v1, Lpa/g;->c:Lpa/g$a;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_42

    .line 21
    .line 22
    iget-object v2, v2, Lpa/g$a;->e:Lio/flutter/view/TextureRegistry;

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    goto/16 :goto_1a

    .line 27
    .line 28
    :cond_0
    iget-object v2, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 29
    .line 30
    const-string v4, "BetterPlayer"

    .line 31
    .line 32
    const-string v5, "cacheKey"

    .line 33
    .line 34
    const-string v6, "uri"

    .line 35
    .line 36
    const-string v8, "maxCacheFileSize"

    .line 37
    .line 38
    const-string v9, "maxCacheSize"

    .line 39
    .line 40
    const-string v10, "headers"

    .line 41
    .line 42
    const-string v11, "dataSource"

    .line 43
    .line 44
    const-string v12, ""

    .line 45
    .line 46
    if-eqz v2, :cond_11

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v13

    .line 52
    const-string v14, "url"

    .line 53
    .line 54
    sparse-switch v13, :sswitch_data_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :sswitch_0
    const-string v13, "stopPreCache"

    .line 60
    .line 61
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    goto/16 :goto_6

    .line 68
    .line 69
    :cond_1
    invoke-virtual {v0, v14}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/lang/String;

    .line 74
    .line 75
    iget-object v2, v1, Lpa/g;->c:Lpa/g$a;

    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    iget-object v2, v2, Lpa/g$a;->a:Landroid/content/Context;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    move-object v2, v3

    .line 83
    :goto_0
    if-eqz v0, :cond_3

    .line 84
    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    invoke-static {v2}, Lp2/k0;->d(Landroid/content/Context;)Lp2/k0;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    new-instance v4, Ly2/c;

    .line 95
    .line 96
    invoke-direct {v4, v2, v0}, Ly2/c;-><init>(Lp2/k0;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, v2, Lp2/k0;->d:La3/b;

    .line 100
    .line 101
    invoke-interface {v0, v4}, La3/b;->d(Ljava/lang/Runnable;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    invoke-interface {v7, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_19

    .line 108
    .line 109
    :sswitch_1
    const-string v13, "init"

    .line 110
    .line 111
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_4

    .line 116
    .line 117
    goto/16 :goto_6

    .line 118
    .line 119
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lpa/g;->a()V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_19

    .line 123
    .line 124
    :sswitch_2
    const-string v13, "clearCache"

    .line 125
    .line 126
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_5

    .line 131
    .line 132
    goto/16 :goto_6

    .line 133
    .line 134
    :cond_5
    iget-object v0, v1, Lpa/g;->c:Lpa/g$a;

    .line 135
    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    iget-object v0, v0, Lpa/g$a;->a:Landroid/content/Context;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_6
    move-object v0, v3

    .line 142
    :goto_1
    if-eqz v0, :cond_7

    .line 143
    .line 144
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 145
    .line 146
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    const-string v5, "betterPlayerCache"

    .line 151
    .line 152
    invoke-direct {v2, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v2}, Lpa/b$a;->a(Ljava/io/File;)V

    .line 156
    .line 157
    .line 158
    :cond_7
    invoke-interface {v7, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    .line 160
    .line 161
    goto/16 :goto_19

    .line 162
    .line 163
    :catch_0
    move-exception v0

    .line 164
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    invoke-interface {v7, v12, v12, v12}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_19

    .line 175
    .line 176
    :sswitch_3
    const-string v13, "preCache"

    .line 177
    .line 178
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-nez v2, :cond_8

    .line 183
    .line 184
    goto/16 :goto_6

    .line 185
    .line 186
    :cond_8
    invoke-virtual {v0, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Ljava/util/Map;

    .line 191
    .line 192
    if-eqz v0, :cond_41

    .line 193
    .line 194
    const/high16 v2, 0x6400000

    .line 195
    .line 196
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {v0, v9, v2}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, Ljava/lang/Number;

    .line 205
    .line 206
    const/high16 v4, 0xa00000

    .line 207
    .line 208
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-static {v0, v8, v4}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    check-cast v4, Ljava/lang/Number;

    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 219
    .line 220
    .line 221
    move-result-wide v15

    .line 222
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 223
    .line 224
    .line 225
    move-result-wide v17

    .line 226
    const/high16 v2, 0x300000

    .line 227
    .line 228
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    const-string v4, "preCacheSize"

    .line 233
    .line 234
    invoke-static {v0, v4, v2}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    check-cast v2, Ljava/lang/Number;

    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 241
    .line 242
    .line 243
    move-result-wide v19

    .line 244
    invoke-static {v0, v6, v12}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    check-cast v2, Ljava/lang/String;

    .line 249
    .line 250
    invoke-static {v0, v5, v3}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    check-cast v6, Ljava/lang/String;

    .line 255
    .line 256
    new-instance v11, Ljava/util/HashMap;

    .line 257
    .line 258
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 259
    .line 260
    .line 261
    invoke-static {v0, v10, v11}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, Ljava/util/Map;

    .line 266
    .line 267
    iget-object v11, v1, Lpa/g;->c:Lpa/g$a;

    .line 268
    .line 269
    if-eqz v11, :cond_9

    .line 270
    .line 271
    iget-object v11, v11, Lpa/g$a;->a:Landroid/content/Context;

    .line 272
    .line 273
    goto :goto_2

    .line 274
    :cond_9
    move-object v11, v3

    .line 275
    :goto_2
    invoke-static {v0, v10}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    new-instance v10, Ljava/util/HashMap;

    .line 279
    .line 280
    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v10, v14, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    invoke-virtual {v10, v4, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    invoke-virtual {v10, v9, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-virtual {v10, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    if-eqz v6, :cond_a

    .line 308
    .line 309
    invoke-virtual {v10, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    :cond_a
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-eqz v5, :cond_b

    .line 325
    .line 326
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    check-cast v5, Ljava/lang/String;

    .line 331
    .line 332
    const-string v6, "header_"

    .line 333
    .line 334
    invoke-static {v6, v5}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    check-cast v5, Ljava/lang/String;

    .line 343
    .line 344
    invoke-virtual {v10, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    goto :goto_3

    .line 348
    :cond_b
    if-eqz v2, :cond_c

    .line 349
    .line 350
    if-eqz v11, :cond_c

    .line 351
    .line 352
    new-instance v0, Lo2/l$a;

    .line 353
    .line 354
    const-class v4, Lcom/jhomlala/better_player/CacheWorker;

    .line 355
    .line 356
    invoke-direct {v0, v4}, Lo2/l$a;-><init>(Ljava/lang/Class;)V

    .line 357
    .line 358
    .line 359
    iget-object v4, v0, Lo2/q$a;->d:Ljava/util/LinkedHashSet;

    .line 360
    .line 361
    invoke-interface {v4, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    new-instance v2, Landroidx/work/c;

    .line 365
    .line 366
    invoke-direct {v2, v10}, Landroidx/work/c;-><init>(Ljava/util/HashMap;)V

    .line 367
    .line 368
    .line 369
    invoke-static {v2}, Landroidx/work/c;->e(Landroidx/work/c;)[B

    .line 370
    .line 371
    .line 372
    iget-object v4, v0, Lo2/q$a;->c:Lx2/s;

    .line 373
    .line 374
    iput-object v2, v4, Lx2/s;->e:Landroidx/work/c;

    .line 375
    .line 376
    invoke-virtual {v0}, Lo2/q$a;->a()Lo2/q;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    const-string v2, "build(...)"

    .line 381
    .line 382
    invoke-static {v0, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    check-cast v0, Lo2/l;

    .line 386
    .line 387
    invoke-static {v11}, Lp2/k0;->d(Landroid/content/Context;)Lp2/k0;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v2, v0}, Lo2/p;->a(Lo2/q;)Lo2/m;

    .line 392
    .line 393
    .line 394
    :cond_c
    invoke-interface {v7, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    goto/16 :goto_19

    .line 398
    .line 399
    :sswitch_4
    const-string v13, "create"

    .line 400
    .line 401
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    if-nez v2, :cond_d

    .line 406
    .line 407
    goto/16 :goto_6

    .line 408
    .line 409
    :cond_d
    iget-object v2, v1, Lpa/g;->c:Lpa/g$a;

    .line 410
    .line 411
    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    iget-object v2, v2, Lpa/g$a;->e:Lio/flutter/view/TextureRegistry;

    .line 415
    .line 416
    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    invoke-interface {v2}, Lio/flutter/view/TextureRegistry;->createSurfaceTexture()Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;

    .line 420
    .line 421
    .line 422
    move-result-object v8

    .line 423
    const-string v2, "createSurfaceTexture(...)"

    .line 424
    .line 425
    invoke-static {v8, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    new-instance v4, Lio/flutter/plugin/common/EventChannel;

    .line 429
    .line 430
    iget-object v2, v1, Lpa/g;->c:Lpa/g$a;

    .line 431
    .line 432
    if-eqz v2, :cond_e

    .line 433
    .line 434
    iget-object v2, v2, Lpa/g$a;->b:Lio/flutter/plugin/common/BinaryMessenger;

    .line 435
    .line 436
    goto :goto_4

    .line 437
    :cond_e
    move-object v2, v3

    .line 438
    :goto_4
    const-string v5, "better_player_channel/videoEvents"

    .line 439
    .line 440
    invoke-static {v5}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    invoke-interface {v8}, Lio/flutter/view/TextureRegistry$TextureEntry;->id()J

    .line 445
    .line 446
    .line 447
    move-result-wide v9

    .line 448
    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v5

    .line 455
    invoke-direct {v4, v2, v5}, Lio/flutter/plugin/common/EventChannel;-><init>(Lio/flutter/plugin/common/BinaryMessenger;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    const-string v2, "minBufferMs"

    .line 459
    .line 460
    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/MethodCall;->hasArgument(Ljava/lang/String;)Z

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    if-eqz v5, :cond_f

    .line 465
    .line 466
    const-string v5, "maxBufferMs"

    .line 467
    .line 468
    invoke-virtual {v0, v5}, Lio/flutter/plugin/common/MethodCall;->hasArgument(Ljava/lang/String;)Z

    .line 469
    .line 470
    .line 471
    move-result v6

    .line 472
    if-eqz v6, :cond_f

    .line 473
    .line 474
    const-string v6, "bufferForPlaybackMs"

    .line 475
    .line 476
    invoke-virtual {v0, v6}, Lio/flutter/plugin/common/MethodCall;->hasArgument(Ljava/lang/String;)Z

    .line 477
    .line 478
    .line 479
    move-result v9

    .line 480
    if-eqz v9, :cond_f

    .line 481
    .line 482
    const-string v9, "bufferForPlaybackAfterRebufferMs"

    .line 483
    .line 484
    invoke-virtual {v0, v9}, Lio/flutter/plugin/common/MethodCall;->hasArgument(Ljava/lang/String;)Z

    .line 485
    .line 486
    .line 487
    move-result v10

    .line 488
    if-eqz v10, :cond_f

    .line 489
    .line 490
    new-instance v10, Lpa/i;

    .line 491
    .line 492
    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    check-cast v2, Ljava/lang/Integer;

    .line 497
    .line 498
    invoke-virtual {v0, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    check-cast v5, Ljava/lang/Integer;

    .line 503
    .line 504
    invoke-virtual {v0, v6}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v6

    .line 508
    check-cast v6, Ljava/lang/Integer;

    .line 509
    .line 510
    invoke-virtual {v0, v9}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    check-cast v0, Ljava/lang/Integer;

    .line 515
    .line 516
    invoke-direct {v10, v2, v5, v6, v0}, Lpa/i;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 517
    .line 518
    .line 519
    move-object v6, v10

    .line 520
    goto :goto_5

    .line 521
    :cond_f
    move-object v6, v3

    .line 522
    :goto_5
    new-instance v0, Lpa/b;

    .line 523
    .line 524
    iget-object v2, v1, Lpa/g;->c:Lpa/g$a;

    .line 525
    .line 526
    if-eqz v2, :cond_10

    .line 527
    .line 528
    iget-object v2, v2, Lpa/g$a;->a:Landroid/content/Context;

    .line 529
    .line 530
    move-object v3, v2

    .line 531
    :cond_10
    invoke-static {v3}, Lec/i;->b(Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    move-object v2, v0

    .line 535
    move-object v5, v8

    .line 536
    move-object/from16 v7, p2

    .line 537
    .line 538
    invoke-direct/range {v2 .. v7}, Lpa/b;-><init>(Landroid/content/Context;Lio/flutter/plugin/common/EventChannel;Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;Lpa/i;Lio/flutter/plugin/common/MethodChannel$Result;)V

    .line 539
    .line 540
    .line 541
    iget-object v2, v1, Lpa/g;->a:Landroid/util/LongSparseArray;

    .line 542
    .line 543
    invoke-interface {v8}, Lio/flutter/view/TextureRegistry$TextureEntry;->id()J

    .line 544
    .line 545
    .line 546
    move-result-wide v3

    .line 547
    invoke-virtual {v2, v3, v4, v0}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    goto/16 :goto_19

    .line 551
    .line 552
    :cond_11
    :goto_6
    const-string v2, "textureId"

    .line 553
    .line 554
    invoke-virtual {v0, v2}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    check-cast v2, Ljava/lang/Number;

    .line 559
    .line 560
    invoke-static {v2}, Lec/i;->b(Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 564
    .line 565
    .line 566
    move-result-wide v13

    .line 567
    iget-object v2, v1, Lpa/g;->a:Landroid/util/LongSparseArray;

    .line 568
    .line 569
    invoke-virtual {v2, v13, v14}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    check-cast v2, Lpa/b;

    .line 574
    .line 575
    if-nez v2, :cond_12

    .line 576
    .line 577
    const-string v0, "No video player associated with texture id "

    .line 578
    .line 579
    invoke-static {v0, v13, v14}, La0/j;->i(Ljava/lang/String;J)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    const-string v2, "Unknown textureId"

    .line 584
    .line 585
    invoke-interface {v7, v2, v0, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    return-void

    .line 589
    :cond_12
    iget-object v3, v0, Lio/flutter/plugin/common/MethodCall;->method:Ljava/lang/String;

    .line 590
    .line 591
    if-eqz v3, :cond_40

    .line 592
    .line 593
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 594
    .line 595
    .line 596
    move-result v15

    .line 597
    const-wide/16 v16, 0x0

    .line 598
    .line 599
    sparse-switch v15, :sswitch_data_1

    .line 600
    .line 601
    .line 602
    goto/16 :goto_18

    .line 603
    .line 604
    :sswitch_5
    const-string v5, "setAudioTrack"

    .line 605
    .line 606
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v3

    .line 610
    if-nez v3, :cond_13

    .line 611
    .line 612
    goto/16 :goto_18

    .line 613
    .line 614
    :cond_13
    const-string v3, "name"

    .line 615
    .line 616
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    check-cast v3, Ljava/lang/String;

    .line 621
    .line 622
    const-string v5, "index"

    .line 623
    .line 624
    invoke-virtual {v0, v5}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    check-cast v0, Ljava/lang/Integer;

    .line 629
    .line 630
    if-eqz v3, :cond_3d

    .line 631
    .line 632
    if-eqz v0, :cond_3d

    .line 633
    .line 634
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 635
    .line 636
    .line 637
    move-result v0

    .line 638
    :try_start_1
    iget-object v5, v2, Lpa/b;->e:Lr5/f;

    .line 639
    .line 640
    iget-object v5, v5, Lr5/j;->c:Lr5/j$a;

    .line 641
    .line 642
    if-eqz v5, :cond_3d

    .line 643
    .line 644
    iget v6, v5, Lr5/j$a;->a:I

    .line 645
    .line 646
    const/4 v8, 0x0

    .line 647
    :goto_7
    if-ge v8, v6, :cond_3d

    .line 648
    .line 649
    iget-object v9, v5, Lr5/j$a;->b:[I

    .line 650
    .line 651
    aget v9, v9, v8

    .line 652
    .line 653
    const/4 v10, 0x1

    .line 654
    if-eq v9, v10, :cond_14

    .line 655
    .line 656
    move-object/from16 v16, v5

    .line 657
    .line 658
    move/from16 v17, v6

    .line 659
    .line 660
    goto/16 :goto_d

    .line 661
    .line 662
    :cond_14
    iget-object v9, v5, Lr5/j$a;->c:[Lz4/j0;

    .line 663
    .line 664
    aget-object v9, v9, v8

    .line 665
    .line 666
    const-string v10, "getTrackGroups(...)"

    .line 667
    .line 668
    invoke-static {v9, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    iget v10, v9, Lz4/j0;->a:I

    .line 672
    .line 673
    const/4 v11, 0x0

    .line 674
    const/4 v12, 0x0

    .line 675
    const/4 v13, 0x0

    .line 676
    :goto_8
    if-ge v11, v10, :cond_18

    .line 677
    .line 678
    invoke-virtual {v9, v11}, Lz4/j0;->a(I)Lz4/i0;

    .line 679
    .line 680
    .line 681
    move-result-object v14

    .line 682
    iget v15, v14, Lz4/i0;->a:I

    .line 683
    .line 684
    const/16 v16, 0x0

    .line 685
    .line 686
    move/from16 v22, v16

    .line 687
    .line 688
    move-object/from16 v16, v5

    .line 689
    .line 690
    move/from16 v5, v22

    .line 691
    .line 692
    :goto_9
    if-ge v5, v15, :cond_17

    .line 693
    .line 694
    move/from16 v17, v6

    .line 695
    .line 696
    iget-object v6, v14, Lz4/i0;->d:[Lv3/i0;

    .line 697
    .line 698
    aget-object v6, v6, v5

    .line 699
    .line 700
    move/from16 v18, v10

    .line 701
    .line 702
    const-string v10, "getFormat(...)"

    .line 703
    .line 704
    invoke-static {v6, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    iget-object v10, v6, Lv3/i0;->b:Ljava/lang/String;

    .line 708
    .line 709
    if-nez v10, :cond_15

    .line 710
    .line 711
    const/4 v12, 0x1

    .line 712
    :cond_15
    iget-object v6, v6, Lv3/i0;->a:Ljava/lang/String;

    .line 713
    .line 714
    if-eqz v6, :cond_16

    .line 715
    .line 716
    const-string v10, "1/15"

    .line 717
    .line 718
    invoke-static {v6, v10}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 719
    .line 720
    .line 721
    move-result v6

    .line 722
    if-eqz v6, :cond_16

    .line 723
    .line 724
    const/4 v13, 0x1

    .line 725
    :cond_16
    add-int/lit8 v5, v5, 0x1

    .line 726
    .line 727
    move/from16 v6, v17

    .line 728
    .line 729
    move/from16 v10, v18

    .line 730
    .line 731
    goto :goto_9

    .line 732
    :cond_17
    move/from16 v17, v6

    .line 733
    .line 734
    move/from16 v18, v10

    .line 735
    .line 736
    add-int/lit8 v11, v11, 0x1

    .line 737
    .line 738
    move-object/from16 v5, v16

    .line 739
    .line 740
    goto :goto_8

    .line 741
    :cond_18
    move-object/from16 v16, v5

    .line 742
    .line 743
    move/from16 v17, v6

    .line 744
    .line 745
    iget v5, v9, Lz4/j0;->a:I

    .line 746
    .line 747
    const/4 v6, 0x0

    .line 748
    :goto_a
    if-ge v6, v5, :cond_1d

    .line 749
    .line 750
    invoke-virtual {v9, v6}, Lz4/j0;->a(I)Lz4/i0;

    .line 751
    .line 752
    .line 753
    move-result-object v10

    .line 754
    iget v11, v10, Lz4/i0;->a:I

    .line 755
    .line 756
    const/4 v14, 0x0

    .line 757
    :goto_b
    if-ge v14, v11, :cond_1c

    .line 758
    .line 759
    iget-object v15, v10, Lz4/i0;->d:[Lv3/i0;

    .line 760
    .line 761
    aget-object v15, v15, v14

    .line 762
    .line 763
    iget-object v15, v15, Lv3/i0;->b:Ljava/lang/String;

    .line 764
    .line 765
    invoke-static {v3, v15}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v18

    .line 769
    if-eqz v18, :cond_19

    .line 770
    .line 771
    if-ne v0, v6, :cond_19

    .line 772
    .line 773
    goto :goto_c

    .line 774
    :cond_19
    if-nez v13, :cond_1a

    .line 775
    .line 776
    if-eqz v12, :cond_1a

    .line 777
    .line 778
    if-ne v0, v6, :cond_1a

    .line 779
    .line 780
    goto :goto_c

    .line 781
    :cond_1a
    if-eqz v13, :cond_1b

    .line 782
    .line 783
    invoke-static {v3, v15}, Lec/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    move-result v15

    .line 787
    if-eqz v15, :cond_1b

    .line 788
    .line 789
    :goto_c
    invoke-virtual {v2}, Lpa/b;->e()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 790
    .line 791
    .line 792
    goto/16 :goto_16

    .line 793
    .line 794
    :cond_1b
    add-int/lit8 v14, v14, 0x1

    .line 795
    .line 796
    goto :goto_b

    .line 797
    :cond_1c
    add-int/lit8 v6, v6, 0x1

    .line 798
    .line 799
    goto :goto_a

    .line 800
    :cond_1d
    :goto_d
    add-int/lit8 v8, v8, 0x1

    .line 801
    .line 802
    move-object/from16 v5, v16

    .line 803
    .line 804
    move/from16 v6, v17

    .line 805
    .line 806
    goto/16 :goto_7

    .line 807
    .line 808
    :catch_1
    move-exception v0

    .line 809
    new-instance v2, Ljava/lang/StringBuilder;

    .line 810
    .line 811
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 812
    .line 813
    .line 814
    const-string v3, "setAudioTrack failed"

    .line 815
    .line 816
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 827
    .line 828
    .line 829
    goto/16 :goto_16

    .line 830
    .line 831
    :sswitch_6
    const-string v0, "absolutePosition"

    .line 832
    .line 833
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    if-nez v0, :cond_1e

    .line 838
    .line 839
    goto/16 :goto_18

    .line 840
    .line 841
    :cond_1e
    iget-object v0, v2, Lpa/b;->c:Lv3/d0;

    .line 842
    .line 843
    if-eqz v0, :cond_1f

    .line 844
    .line 845
    invoke-virtual {v0}, Lv3/d0;->J()Lv3/r1;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    goto :goto_e

    .line 850
    :cond_1f
    const/4 v0, 0x0

    .line 851
    :goto_e
    if-eqz v0, :cond_21

    .line 852
    .line 853
    invoke-virtual {v0}, Lv3/r1;->p()Z

    .line 854
    .line 855
    .line 856
    move-result v3

    .line 857
    if-nez v3, :cond_21

    .line 858
    .line 859
    new-instance v3, Lv3/r1$c;

    .line 860
    .line 861
    invoke-direct {v3}, Lv3/r1$c;-><init>()V

    .line 862
    .line 863
    .line 864
    const/4 v4, 0x0

    .line 865
    invoke-virtual {v0, v4, v3}, Lv3/r1;->m(ILv3/r1$c;)Lv3/r1$c;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    iget-wide v3, v0, Lv3/r1$c;->f:J

    .line 870
    .line 871
    iget-object v0, v2, Lpa/b;->c:Lv3/d0;

    .line 872
    .line 873
    if-eqz v0, :cond_20

    .line 874
    .line 875
    invoke-virtual {v0}, Lv3/d0;->P()J

    .line 876
    .line 877
    .line 878
    move-result-wide v16

    .line 879
    :cond_20
    add-long v3, v3, v16

    .line 880
    .line 881
    goto :goto_f

    .line 882
    :cond_21
    iget-object v0, v2, Lpa/b;->c:Lv3/d0;

    .line 883
    .line 884
    if-eqz v0, :cond_22

    .line 885
    .line 886
    invoke-virtual {v0}, Lv3/d0;->P()J

    .line 887
    .line 888
    .line 889
    move-result-wide v16

    .line 890
    :cond_22
    move-wide/from16 v3, v16

    .line 891
    .line 892
    :goto_f
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    goto/16 :goto_17

    .line 897
    .line 898
    :sswitch_7
    const-string v4, "setDataSource"

    .line 899
    .line 900
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v3

    .line 904
    if-nez v3, :cond_23

    .line 905
    .line 906
    goto/16 :goto_18

    .line 907
    .line 908
    :cond_23
    invoke-virtual {v0, v11}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 913
    .line 914
    .line 915
    check-cast v0, Ljava/util/Map;

    .line 916
    .line 917
    iget-object v3, v1, Lpa/g;->b:Landroid/util/LongSparseArray;

    .line 918
    .line 919
    invoke-virtual {v1, v2}, Lpa/g;->c(Lpa/b;)Ljava/lang/Long;

    .line 920
    .line 921
    .line 922
    move-result-object v4

    .line 923
    invoke-static {v4}, Lec/i;->b(Ljava/lang/Object;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 927
    .line 928
    .line 929
    move-result-wide v13

    .line 930
    invoke-virtual {v3, v13, v14, v0}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 931
    .line 932
    .line 933
    const-string v3, "key"

    .line 934
    .line 935
    invoke-static {v0, v3, v12}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v3

    .line 939
    move-object v4, v3

    .line 940
    check-cast v4, Ljava/lang/String;

    .line 941
    .line 942
    new-instance v3, Ljava/util/HashMap;

    .line 943
    .line 944
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 945
    .line 946
    .line 947
    invoke-static {v0, v10, v3}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v3

    .line 951
    move-object v10, v3

    .line 952
    check-cast v10, Ljava/util/Map;

    .line 953
    .line 954
    const/4 v3, 0x0

    .line 955
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 956
    .line 957
    .line 958
    move-result-object v3

    .line 959
    const-string v11, "overriddenDuration"

    .line 960
    .line 961
    invoke-static {v0, v11, v3}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v11

    .line 965
    check-cast v11, Ljava/lang/Number;

    .line 966
    .line 967
    const-string v13, "asset"

    .line 968
    .line 969
    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v14

    .line 973
    if-eqz v14, :cond_26

    .line 974
    .line 975
    invoke-static {v0, v13, v12}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    check-cast v3, Ljava/lang/String;

    .line 980
    .line 981
    const-string v5, "package"

    .line 982
    .line 983
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v6

    .line 987
    if-eqz v6, :cond_24

    .line 988
    .line 989
    invoke-static {v0, v5, v12}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    check-cast v0, Ljava/lang/String;

    .line 994
    .line 995
    iget-object v5, v1, Lpa/g;->c:Lpa/g$a;

    .line 996
    .line 997
    invoke-static {v5}, Lec/i;->b(Ljava/lang/Object;)V

    .line 998
    .line 999
    .line 1000
    iget-object v5, v5, Lpa/g$a;->d:Lpa/g$b;

    .line 1001
    .line 1002
    invoke-interface {v5, v3, v0}, Lpa/g$b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    goto :goto_10

    .line 1007
    :cond_24
    iget-object v0, v1, Lpa/g;->c:Lpa/g$a;

    .line 1008
    .line 1009
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1010
    .line 1011
    .line 1012
    iget-object v0, v0, Lpa/g$a;->c:Lpa/g$c;

    .line 1013
    .line 1014
    invoke-interface {v0, v3}, Lpa/g$c;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v0

    .line 1018
    :goto_10
    iget-object v3, v1, Lpa/g;->c:Lpa/g$a;

    .line 1019
    .line 1020
    if-eqz v3, :cond_25

    .line 1021
    .line 1022
    iget-object v3, v3, Lpa/g$a;->a:Landroid/content/Context;

    .line 1023
    .line 1024
    goto :goto_11

    .line 1025
    :cond_25
    const/4 v3, 0x0

    .line 1026
    :goto_11
    invoke-static {v3}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1027
    .line 1028
    .line 1029
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1030
    .line 1031
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1032
    .line 1033
    .line 1034
    const-string v6, "asset:///"

    .line 1035
    .line 1036
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 1047
    .line 1048
    .line 1049
    move-result-wide v5

    .line 1050
    const/4 v8, 0x0

    .line 1051
    const/4 v9, 0x0

    .line 1052
    const/4 v11, 0x0

    .line 1053
    const/4 v12, 0x0

    .line 1054
    const/4 v13, 0x0

    .line 1055
    const/4 v14, 0x0

    .line 1056
    move-object/from16 v18, v11

    .line 1057
    .line 1058
    move-object/from16 v19, v12

    .line 1059
    .line 1060
    move-object/from16 v20, v13

    .line 1061
    .line 1062
    move-wide/from16 v12, v16

    .line 1063
    .line 1064
    move-wide/from16 v22, v5

    .line 1065
    .line 1066
    move-object v5, v0

    .line 1067
    move-object v6, v8

    .line 1068
    move-object v0, v9

    .line 1069
    move v9, v14

    .line 1070
    move-wide/from16 v14, v22

    .line 1071
    .line 1072
    goto/16 :goto_12

    .line 1073
    .line 1074
    :cond_26
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1075
    .line 1076
    const-string v14, "useCache"

    .line 1077
    .line 1078
    invoke-static {v0, v14, v13}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v13

    .line 1082
    check-cast v13, Ljava/lang/Boolean;

    .line 1083
    .line 1084
    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1085
    .line 1086
    .line 1087
    move-result v13

    .line 1088
    invoke-static {v0, v9, v3}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v9

    .line 1092
    check-cast v9, Ljava/lang/Number;

    .line 1093
    .line 1094
    invoke-static {v0, v8, v3}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v3

    .line 1098
    check-cast v3, Ljava/lang/Number;

    .line 1099
    .line 1100
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 1101
    .line 1102
    .line 1103
    move-result-wide v8

    .line 1104
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 1105
    .line 1106
    .line 1107
    move-result-wide v14

    .line 1108
    invoke-static {v0, v6, v12}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v3

    .line 1112
    check-cast v3, Ljava/lang/String;

    .line 1113
    .line 1114
    const/4 v6, 0x0

    .line 1115
    invoke-static {v0, v5, v6}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v5

    .line 1119
    check-cast v5, Ljava/lang/String;

    .line 1120
    .line 1121
    const-string v12, "formatHint"

    .line 1122
    .line 1123
    invoke-static {v0, v12, v6}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v12

    .line 1127
    check-cast v12, Ljava/lang/String;

    .line 1128
    .line 1129
    move-object/from16 p1, v3

    .line 1130
    .line 1131
    const-string v3, "licenseUrl"

    .line 1132
    .line 1133
    invoke-static {v0, v3, v6}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v3

    .line 1137
    check-cast v3, Ljava/lang/String;

    .line 1138
    .line 1139
    move-object/from16 v16, v3

    .line 1140
    .line 1141
    const-string v3, "clearKey"

    .line 1142
    .line 1143
    invoke-static {v0, v3, v6}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v3

    .line 1147
    check-cast v3, Ljava/lang/String;

    .line 1148
    .line 1149
    new-instance v6, Ljava/util/HashMap;

    .line 1150
    .line 1151
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 1152
    .line 1153
    .line 1154
    move-object/from16 v17, v3

    .line 1155
    .line 1156
    const-string v3, "drmHeaders"

    .line 1157
    .line 1158
    invoke-static {v0, v3, v6}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v0

    .line 1162
    check-cast v0, Ljava/util/Map;

    .line 1163
    .line 1164
    iget-object v3, v1, Lpa/g;->c:Lpa/g$a;

    .line 1165
    .line 1166
    invoke-static {v3}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1167
    .line 1168
    .line 1169
    iget-object v3, v3, Lpa/g$a;->a:Landroid/content/Context;

    .line 1170
    .line 1171
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 1172
    .line 1173
    .line 1174
    move-result-wide v18

    .line 1175
    move-object v6, v12

    .line 1176
    move-object/from16 v20, v17

    .line 1177
    .line 1178
    move-object/from16 v22, v5

    .line 1179
    .line 1180
    move-object/from16 v5, p1

    .line 1181
    .line 1182
    move-wide/from16 v23, v18

    .line 1183
    .line 1184
    move-object/from16 v18, v0

    .line 1185
    .line 1186
    move-object/from16 v19, v22

    .line 1187
    .line 1188
    move-object/from16 v0, v16

    .line 1189
    .line 1190
    move-wide/from16 v16, v8

    .line 1191
    .line 1192
    move v9, v13

    .line 1193
    move-wide v12, v14

    .line 1194
    move-wide/from16 v14, v23

    .line 1195
    .line 1196
    :goto_12
    move-object/from16 v7, p2

    .line 1197
    .line 1198
    move-object v8, v10

    .line 1199
    move-wide/from16 v10, v16

    .line 1200
    .line 1201
    move-object/from16 v16, v0

    .line 1202
    .line 1203
    move-object/from16 v17, v18

    .line 1204
    .line 1205
    move-object/from16 v18, v19

    .line 1206
    .line 1207
    move-object/from16 v19, v20

    .line 1208
    .line 1209
    invoke-virtual/range {v2 .. v19}, Lpa/b;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/util/Map;ZJJJLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    .line 1210
    .line 1211
    .line 1212
    goto/16 :goto_19

    .line 1213
    .line 1214
    :sswitch_8
    const-string v0, "dispose"

    .line 1215
    .line 1216
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v0

    .line 1220
    if-nez v0, :cond_27

    .line 1221
    .line 1222
    goto/16 :goto_18

    .line 1223
    .line 1224
    :cond_27
    invoke-virtual {v2}, Lpa/b;->a()V

    .line 1225
    .line 1226
    .line 1227
    iget-object v0, v1, Lpa/g;->a:Landroid/util/LongSparseArray;

    .line 1228
    .line 1229
    invoke-virtual {v0, v13, v14}, Landroid/util/LongSparseArray;->remove(J)V

    .line 1230
    .line 1231
    .line 1232
    iget-object v0, v1, Lpa/g;->b:Landroid/util/LongSparseArray;

    .line 1233
    .line 1234
    invoke-virtual {v0, v13, v14}, Landroid/util/LongSparseArray;->remove(J)V

    .line 1235
    .line 1236
    .line 1237
    iget-object v0, v1, Lpa/g;->o:Landroid/os/Handler;

    .line 1238
    .line 1239
    const/4 v2, 0x0

    .line 1240
    if-eqz v0, :cond_28

    .line 1241
    .line 1242
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1243
    .line 1244
    .line 1245
    iput-object v2, v1, Lpa/g;->o:Landroid/os/Handler;

    .line 1246
    .line 1247
    :cond_28
    iput-object v2, v1, Lpa/g;->p:Lx0/q0;

    .line 1248
    .line 1249
    goto/16 :goto_16

    .line 1250
    .line 1251
    :sswitch_9
    const-string v4, "setSpeed"

    .line 1252
    .line 1253
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v3

    .line 1257
    if-nez v3, :cond_29

    .line 1258
    .line 1259
    goto/16 :goto_18

    .line 1260
    .line 1261
    :cond_29
    const-string v3, "speed"

    .line 1262
    .line 1263
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v0

    .line 1267
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1268
    .line 1269
    .line 1270
    check-cast v0, Ljava/lang/Number;

    .line 1271
    .line 1272
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 1273
    .line 1274
    .line 1275
    move-result-wide v3

    .line 1276
    double-to-float v0, v3

    .line 1277
    new-instance v3, Lv3/e1;

    .line 1278
    .line 1279
    invoke-direct {v3, v0}, Lv3/e1;-><init>(F)V

    .line 1280
    .line 1281
    .line 1282
    iget-object v0, v2, Lpa/b;->c:Lv3/d0;

    .line 1283
    .line 1284
    if-eqz v0, :cond_3d

    .line 1285
    .line 1286
    invoke-virtual {v0, v3}, Lv3/d0;->c(Lv3/e1;)V

    .line 1287
    .line 1288
    .line 1289
    goto/16 :goto_16

    .line 1290
    .line 1291
    :sswitch_a
    const-string v0, "disablePictureInPicture"

    .line 1292
    .line 1293
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1294
    .line 1295
    .line 1296
    move-result v0

    .line 1297
    if-nez v0, :cond_2a

    .line 1298
    .line 1299
    goto/16 :goto_18

    .line 1300
    .line 1301
    :cond_2a
    iget-object v0, v1, Lpa/g;->o:Landroid/os/Handler;

    .line 1302
    .line 1303
    const/4 v3, 0x0

    .line 1304
    if-eqz v0, :cond_2b

    .line 1305
    .line 1306
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 1307
    .line 1308
    .line 1309
    iput-object v3, v1, Lpa/g;->o:Landroid/os/Handler;

    .line 1310
    .line 1311
    :cond_2b
    iput-object v3, v1, Lpa/g;->p:Lx0/q0;

    .line 1312
    .line 1313
    iget-object v0, v1, Lpa/g;->f:Landroid/app/Activity;

    .line 1314
    .line 1315
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1316
    .line 1317
    .line 1318
    const/4 v3, 0x0

    .line 1319
    invoke-virtual {v0, v3}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    .line 1320
    .line 1321
    .line 1322
    invoke-virtual {v2, v3}, Lpa/b;->c(Z)V

    .line 1323
    .line 1324
    .line 1325
    iget-object v0, v2, Lpa/b;->n:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 1326
    .line 1327
    if-eqz v0, :cond_2c

    .line 1328
    .line 1329
    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->d()V

    .line 1330
    .line 1331
    .line 1332
    :cond_2c
    const/4 v0, 0x0

    .line 1333
    iput-object v0, v2, Lpa/b;->n:Landroid/support/v4/media/session/MediaSessionCompat;

    .line 1334
    .line 1335
    goto/16 :goto_16

    .line 1336
    .line 1337
    :sswitch_b
    const-string v0, "position"

    .line 1338
    .line 1339
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1340
    .line 1341
    .line 1342
    move-result v0

    .line 1343
    if-nez v0, :cond_2d

    .line 1344
    .line 1345
    goto/16 :goto_18

    .line 1346
    .line 1347
    :cond_2d
    iget-object v0, v2, Lpa/b;->c:Lv3/d0;

    .line 1348
    .line 1349
    if-eqz v0, :cond_2e

    .line 1350
    .line 1351
    invoke-virtual {v0}, Lv3/d0;->P()J

    .line 1352
    .line 1353
    .line 1354
    move-result-wide v16

    .line 1355
    :cond_2e
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v0

    .line 1359
    invoke-interface {v7, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 1360
    .line 1361
    .line 1362
    const/4 v0, 0x0

    .line 1363
    invoke-virtual {v2, v0}, Lpa/b;->d(Z)V

    .line 1364
    .line 1365
    .line 1366
    goto/16 :goto_19

    .line 1367
    .line 1368
    :sswitch_c
    const-string v4, "setVolume"

    .line 1369
    .line 1370
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v3

    .line 1374
    if-nez v3, :cond_2f

    .line 1375
    .line 1376
    goto/16 :goto_18

    .line 1377
    .line 1378
    :cond_2f
    const-string v3, "volume"

    .line 1379
    .line 1380
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v0

    .line 1384
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1385
    .line 1386
    .line 1387
    check-cast v0, Ljava/lang/Number;

    .line 1388
    .line 1389
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 1390
    .line 1391
    .line 1392
    move-result-wide v3

    .line 1393
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 1394
    .line 1395
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 1396
    .line 1397
    .line 1398
    move-result-wide v3

    .line 1399
    const-wide/16 v5, 0x0

    .line 1400
    .line 1401
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 1402
    .line 1403
    .line 1404
    move-result-wide v3

    .line 1405
    double-to-float v0, v3

    .line 1406
    iget-object v2, v2, Lpa/b;->c:Lv3/d0;

    .line 1407
    .line 1408
    if-eqz v2, :cond_3d

    .line 1409
    .line 1410
    invoke-virtual {v2, v0}, Lv3/d0;->o0(F)V

    .line 1411
    .line 1412
    .line 1413
    goto/16 :goto_16

    .line 1414
    .line 1415
    :sswitch_d
    const-string v0, "pause"

    .line 1416
    .line 1417
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1418
    .line 1419
    .line 1420
    move-result v0

    .line 1421
    if-nez v0, :cond_30

    .line 1422
    .line 1423
    goto/16 :goto_18

    .line 1424
    .line 1425
    :cond_30
    iget-object v0, v2, Lpa/b;->c:Lv3/d0;

    .line 1426
    .line 1427
    if-eqz v0, :cond_3d

    .line 1428
    .line 1429
    const/4 v2, 0x0

    .line 1430
    invoke-virtual {v0, v2}, Lv3/d0;->m0(Z)V

    .line 1431
    .line 1432
    .line 1433
    goto/16 :goto_16

    .line 1434
    .line 1435
    :sswitch_e
    const/4 v0, 0x0

    .line 1436
    const-string v4, "play"

    .line 1437
    .line 1438
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1439
    .line 1440
    .line 1441
    move-result v3

    .line 1442
    if-nez v3, :cond_31

    .line 1443
    .line 1444
    goto/16 :goto_18

    .line 1445
    .line 1446
    :cond_31
    :try_start_2
    invoke-virtual {v1, v2}, Lpa/g;->c(Lpa/b;)Ljava/lang/Long;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v3

    .line 1450
    if-eqz v3, :cond_35

    .line 1451
    .line 1452
    iget-object v4, v1, Lpa/g;->b:Landroid/util/LongSparseArray;

    .line 1453
    .line 1454
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1455
    .line 1456
    .line 1457
    move-result-wide v5

    .line 1458
    invoke-virtual {v4, v5, v6}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v4

    .line 1462
    check-cast v4, Ljava/util/Map;

    .line 1463
    .line 1464
    iget-wide v5, v1, Lpa/g;->d:J

    .line 1465
    .line 1466
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1467
    .line 1468
    .line 1469
    move-result-wide v8

    .line 1470
    cmp-long v5, v8, v5

    .line 1471
    .line 1472
    if-nez v5, :cond_32

    .line 1473
    .line 1474
    iget-object v5, v1, Lpa/g;->e:Ljava/util/Map;

    .line 1475
    .line 1476
    if-eqz v5, :cond_32

    .line 1477
    .line 1478
    if-eqz v4, :cond_32

    .line 1479
    .line 1480
    if-ne v5, v4, :cond_32

    .line 1481
    .line 1482
    goto/16 :goto_15

    .line 1483
    .line 1484
    :cond_32
    iput-object v4, v1, Lpa/g;->e:Ljava/util/Map;

    .line 1485
    .line 1486
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1487
    .line 1488
    .line 1489
    move-result-wide v5

    .line 1490
    iput-wide v5, v1, Lpa/g;->d:J

    .line 1491
    .line 1492
    iget-object v3, v1, Lpa/g;->a:Landroid/util/LongSparseArray;

    .line 1493
    .line 1494
    invoke-virtual {v3}, Landroid/util/LongSparseArray;->size()I

    .line 1495
    .line 1496
    .line 1497
    move-result v3

    .line 1498
    :goto_13
    if-ge v0, v3, :cond_33

    .line 1499
    .line 1500
    iget-object v5, v1, Lpa/g;->a:Landroid/util/LongSparseArray;

    .line 1501
    .line 1502
    invoke-virtual {v5, v0}, Landroid/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v5

    .line 1506
    check-cast v5, Lpa/b;

    .line 1507
    .line 1508
    invoke-virtual {v5}, Lpa/b;->b()V

    .line 1509
    .line 1510
    .line 1511
    add-int/lit8 v0, v0, 0x1

    .line 1512
    .line 1513
    goto :goto_13

    .line 1514
    :cond_33
    const-string v0, "showNotification"

    .line 1515
    .line 1516
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1517
    .line 1518
    invoke-static {v4, v0, v3}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v0

    .line 1522
    check-cast v0, Ljava/lang/Boolean;

    .line 1523
    .line 1524
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1525
    .line 1526
    .line 1527
    move-result v0

    .line 1528
    if-eqz v0, :cond_35

    .line 1529
    .line 1530
    const-string v0, "title"

    .line 1531
    .line 1532
    invoke-static {v4, v0, v12}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v0

    .line 1536
    move-object/from16 v17, v0

    .line 1537
    .line 1538
    check-cast v17, Ljava/lang/String;

    .line 1539
    .line 1540
    const-string v0, "author"

    .line 1541
    .line 1542
    invoke-static {v4, v0, v12}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v0

    .line 1546
    move-object/from16 v18, v0

    .line 1547
    .line 1548
    check-cast v18, Ljava/lang/String;

    .line 1549
    .line 1550
    const-string v0, "imageUrl"

    .line 1551
    .line 1552
    invoke-static {v4, v0, v12}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v0

    .line 1556
    move-object/from16 v19, v0

    .line 1557
    .line 1558
    check-cast v19, Ljava/lang/String;

    .line 1559
    .line 1560
    const-string v0, "notificationChannelName"

    .line 1561
    .line 1562
    const/4 v3, 0x0

    .line 1563
    invoke-static {v4, v0, v3}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    move-object/from16 v20, v0

    .line 1568
    .line 1569
    check-cast v20, Ljava/lang/String;

    .line 1570
    .line 1571
    const-string v0, "activityName"

    .line 1572
    .line 1573
    const-string v3, "MainActivity"

    .line 1574
    .line 1575
    invoke-static {v4, v0, v3}, Lpa/g;->b(Ljava/util/Map;Ljava/lang/String;Ljava/io/Serializable;)Ljava/lang/Object;

    .line 1576
    .line 1577
    .line 1578
    move-result-object v0

    .line 1579
    move-object/from16 v21, v0

    .line 1580
    .line 1581
    check-cast v21, Ljava/lang/String;

    .line 1582
    .line 1583
    iget-object v0, v1, Lpa/g;->c:Lpa/g$a;

    .line 1584
    .line 1585
    if-eqz v0, :cond_34

    .line 1586
    .line 1587
    iget-object v0, v0, Lpa/g$a;->a:Landroid/content/Context;

    .line 1588
    .line 1589
    goto :goto_14

    .line 1590
    :cond_34
    const/4 v0, 0x0

    .line 1591
    :goto_14
    move-object/from16 v16, v0

    .line 1592
    .line 1593
    invoke-static/range {v16 .. v16}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1594
    .line 1595
    .line 1596
    move-object v15, v2

    .line 1597
    invoke-virtual/range {v15 .. v21}, Lpa/b;->i(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 1598
    .line 1599
    .line 1600
    goto :goto_15

    .line 1601
    :catch_2
    move-exception v0

    .line 1602
    const-string v3, "BetterPlayerPlugin"

    .line 1603
    .line 1604
    const-string v4, "SetupNotification failed"

    .line 1605
    .line 1606
    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1607
    .line 1608
    .line 1609
    :cond_35
    :goto_15
    iget-object v0, v2, Lpa/b;->c:Lv3/d0;

    .line 1610
    .line 1611
    if-eqz v0, :cond_3d

    .line 1612
    .line 1613
    const/4 v2, 0x1

    .line 1614
    invoke-virtual {v0, v2}, Lv3/d0;->m0(Z)V

    .line 1615
    .line 1616
    .line 1617
    goto/16 :goto_16

    .line 1618
    .line 1619
    :sswitch_f
    const-string v0, "enablePictureInPicture"

    .line 1620
    .line 1621
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1622
    .line 1623
    .line 1624
    move-result v0

    .line 1625
    if-nez v0, :cond_36

    .line 1626
    .line 1627
    goto/16 :goto_18

    .line 1628
    .line 1629
    :cond_36
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1630
    .line 1631
    const/16 v3, 0x1a

    .line 1632
    .line 1633
    if-lt v0, v3, :cond_3d

    .line 1634
    .line 1635
    iget-object v3, v1, Lpa/g;->c:Lpa/g$a;

    .line 1636
    .line 1637
    invoke-static {v3}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1638
    .line 1639
    .line 1640
    iget-object v3, v3, Lpa/g$a;->a:Landroid/content/Context;

    .line 1641
    .line 1642
    invoke-virtual {v2, v3}, Lpa/b;->h(Landroid/content/Context;)Landroid/support/v4/media/session/MediaSessionCompat;

    .line 1643
    .line 1644
    .line 1645
    iget-object v3, v1, Lpa/g;->f:Landroid/app/Activity;

    .line 1646
    .line 1647
    invoke-static {v3}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1648
    .line 1649
    .line 1650
    new-instance v4, Landroid/app/PictureInPictureParams$Builder;

    .line 1651
    .line 1652
    invoke-direct {v4}, Landroid/app/PictureInPictureParams$Builder;-><init>()V

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v4}, Landroid/app/PictureInPictureParams$Builder;->build()Landroid/app/PictureInPictureParams;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v4

    .line 1659
    invoke-virtual {v3, v4}, Landroid/app/Activity;->enterPictureInPictureMode(Landroid/app/PictureInPictureParams;)Z

    .line 1660
    .line 1661
    .line 1662
    const/16 v3, 0x18

    .line 1663
    .line 1664
    if-lt v0, v3, :cond_37

    .line 1665
    .line 1666
    new-instance v0, Landroid/os/Handler;

    .line 1667
    .line 1668
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v3

    .line 1672
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1673
    .line 1674
    .line 1675
    iput-object v0, v1, Lpa/g;->o:Landroid/os/Handler;

    .line 1676
    .line 1677
    new-instance v3, Lx0/q0;

    .line 1678
    .line 1679
    const/16 v4, 0x12

    .line 1680
    .line 1681
    invoke-direct {v3, v4, v1, v2}, Lx0/q0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1682
    .line 1683
    .line 1684
    iput-object v3, v1, Lpa/g;->p:Lx0/q0;

    .line 1685
    .line 1686
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1687
    .line 1688
    .line 1689
    :cond_37
    const/4 v0, 0x1

    .line 1690
    invoke-virtual {v2, v0}, Lpa/b;->c(Z)V

    .line 1691
    .line 1692
    .line 1693
    goto/16 :goto_16

    .line 1694
    .line 1695
    :sswitch_10
    const/4 v0, 0x0

    .line 1696
    const-string v2, "isPictureInPictureSupported"

    .line 1697
    .line 1698
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1699
    .line 1700
    .line 1701
    move-result v2

    .line 1702
    if-nez v2, :cond_38

    .line 1703
    .line 1704
    goto/16 :goto_18

    .line 1705
    .line 1706
    :cond_38
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1707
    .line 1708
    const/16 v3, 0x1a

    .line 1709
    .line 1710
    if-lt v2, v3, :cond_39

    .line 1711
    .line 1712
    iget-object v2, v1, Lpa/g;->f:Landroid/app/Activity;

    .line 1713
    .line 1714
    if-eqz v2, :cond_39

    .line 1715
    .line 1716
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v2

    .line 1720
    const-string v3, "android.software.picture_in_picture"

    .line 1721
    .line 1722
    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1723
    .line 1724
    .line 1725
    move-result v2

    .line 1726
    if-eqz v2, :cond_39

    .line 1727
    .line 1728
    const/4 v0, 0x1

    .line 1729
    :cond_39
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v0

    .line 1733
    goto :goto_17

    .line 1734
    :sswitch_11
    const-string v4, "seekTo"

    .line 1735
    .line 1736
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1737
    .line 1738
    .line 1739
    move-result v3

    .line 1740
    if-nez v3, :cond_3a

    .line 1741
    .line 1742
    goto/16 :goto_18

    .line 1743
    .line 1744
    :cond_3a
    const-string v3, "location"

    .line 1745
    .line 1746
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v0

    .line 1750
    check-cast v0, Ljava/lang/Number;

    .line 1751
    .line 1752
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1753
    .line 1754
    .line 1755
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1756
    .line 1757
    .line 1758
    move-result v0

    .line 1759
    iget-object v2, v2, Lpa/b;->c:Lv3/d0;

    .line 1760
    .line 1761
    if-eqz v2, :cond_3d

    .line 1762
    .line 1763
    int-to-long v3, v0

    .line 1764
    const/4 v0, 0x5

    .line 1765
    invoke-virtual {v2, v0, v3, v4}, Lv3/e;->T(IJ)V

    .line 1766
    .line 1767
    .line 1768
    goto :goto_16

    .line 1769
    :sswitch_12
    const/4 v4, 0x0

    .line 1770
    const-string v5, "setLooping"

    .line 1771
    .line 1772
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1773
    .line 1774
    .line 1775
    move-result v3

    .line 1776
    if-nez v3, :cond_3b

    .line 1777
    .line 1778
    goto/16 :goto_18

    .line 1779
    .line 1780
    :cond_3b
    const-string v3, "looping"

    .line 1781
    .line 1782
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v0

    .line 1786
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1787
    .line 1788
    .line 1789
    check-cast v0, Ljava/lang/Boolean;

    .line 1790
    .line 1791
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1792
    .line 1793
    .line 1794
    move-result v0

    .line 1795
    iget-object v2, v2, Lpa/b;->c:Lv3/d0;

    .line 1796
    .line 1797
    if-eqz v2, :cond_3d

    .line 1798
    .line 1799
    if-eqz v0, :cond_3c

    .line 1800
    .line 1801
    const/4 v4, 0x2

    .line 1802
    :cond_3c
    invoke-virtual {v2, v4}, Lv3/d0;->u(I)V

    .line 1803
    .line 1804
    .line 1805
    :cond_3d
    :goto_16
    const/4 v0, 0x0

    .line 1806
    :goto_17
    invoke-interface {v7, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 1807
    .line 1808
    .line 1809
    goto :goto_19

    .line 1810
    :sswitch_13
    const-string v4, "setMixWithOthers"

    .line 1811
    .line 1812
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1813
    .line 1814
    .line 1815
    move-result v3

    .line 1816
    if-nez v3, :cond_3e

    .line 1817
    .line 1818
    goto :goto_18

    .line 1819
    :cond_3e
    const-string v3, "mixWithOthers"

    .line 1820
    .line 1821
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v0

    .line 1825
    check-cast v0, Ljava/lang/Boolean;

    .line 1826
    .line 1827
    if-eqz v0, :cond_41

    .line 1828
    .line 1829
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1830
    .line 1831
    .line 1832
    move-result v0

    .line 1833
    iget-object v2, v2, Lpa/b;->c:Lv3/d0;

    .line 1834
    .line 1835
    if-eqz v2, :cond_41

    .line 1836
    .line 1837
    invoke-virtual {v2}, Lv3/d0;->u0()V

    .line 1838
    .line 1839
    .line 1840
    const/4 v8, 0x0

    .line 1841
    const/4 v7, 0x1

    .line 1842
    const/4 v4, 0x3

    .line 1843
    new-instance v9, Lx3/d;

    .line 1844
    .line 1845
    move-object v3, v9

    .line 1846
    move v5, v8

    .line 1847
    move v6, v7

    .line 1848
    invoke-direct/range {v3 .. v8}, Lx3/d;-><init>(IIIII)V

    .line 1849
    .line 1850
    .line 1851
    xor-int/lit8 v0, v0, 0x1

    .line 1852
    .line 1853
    invoke-virtual {v2, v9, v0}, Lv3/d0;->k0(Lx3/d;Z)V

    .line 1854
    .line 1855
    .line 1856
    goto :goto_19

    .line 1857
    :sswitch_14
    const-string v4, "setTrackParameters"

    .line 1858
    .line 1859
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1860
    .line 1861
    .line 1862
    move-result v3

    .line 1863
    if-nez v3, :cond_3f

    .line 1864
    .line 1865
    goto :goto_18

    .line 1866
    :cond_3f
    const-string v3, "width"

    .line 1867
    .line 1868
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v3

    .line 1872
    invoke-static {v3}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1873
    .line 1874
    .line 1875
    check-cast v3, Ljava/lang/Number;

    .line 1876
    .line 1877
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1878
    .line 1879
    .line 1880
    const-string v3, "height"

    .line 1881
    .line 1882
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v3

    .line 1886
    invoke-static {v3}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1887
    .line 1888
    .line 1889
    check-cast v3, Ljava/lang/Number;

    .line 1890
    .line 1891
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 1892
    .line 1893
    .line 1894
    const-string v3, "bitrate"

    .line 1895
    .line 1896
    invoke-virtual {v0, v3}, Lio/flutter/plugin/common/MethodCall;->argument(Ljava/lang/String;)Ljava/lang/Object;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v0

    .line 1900
    invoke-static {v0}, Lec/i;->b(Ljava/lang/Object;)V

    .line 1901
    .line 1902
    .line 1903
    check-cast v0, Ljava/lang/Number;

    .line 1904
    .line 1905
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1906
    .line 1907
    .line 1908
    invoke-virtual {v2}, Lpa/b;->g()V

    .line 1909
    .line 1910
    .line 1911
    const/4 v0, 0x0

    .line 1912
    throw v0

    .line 1913
    :cond_40
    :goto_18
    invoke-interface/range {p2 .. p2}, Lio/flutter/plugin/common/MethodChannel$Result;->notImplemented()V

    .line 1914
    .line 1915
    .line 1916
    :cond_41
    :goto_19
    return-void

    .line 1917
    :cond_42
    :goto_1a
    const-string v0, "no_activity"

    .line 1918
    .line 1919
    const-string v2, "better_player plugin requires a foreground activity"

    .line 1920
    .line 1921
    invoke-interface {v7, v0, v2, v3}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1922
    .line 1923
    .line 1924
    return-void

    .line 1925
    :sswitch_data_0
    .sparse-switch
        -0x509a5f04 -> :sswitch_4
        -0x4ebec561 -> :sswitch_3
        -0x2d410ecb -> :sswitch_2
        0x316510 -> :sswitch_1
        0x6b5284c1 -> :sswitch_0
    .end sparse-switch

    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    :sswitch_data_1
    .sparse-switch
        -0x717ee72d -> :sswitch_14
        -0x3cf5c9fd -> :sswitch_13
        -0x39e5d804 -> :sswitch_12
        -0x3603e4ed -> :sswitch_11
        -0x26d697d7 -> :sswitch_10
        -0x20a0b7a2 -> :sswitch_f
        0x348b34 -> :sswitch_e
        0x65825f6 -> :sswitch_d
        0x27f73e1c -> :sswitch_c
        0x2c929929 -> :sswitch_b
        0x33d2dbc3 -> :sswitch_a
        0x53b4c105 -> :sswitch_9
        0x63a5261f -> :sswitch_8
        0x683d6267 -> :sswitch_7
        0x6be0a3c0 -> :sswitch_6
        0x78226117 -> :sswitch_5
    .end sparse-switch
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
.end method

.method public final onReattachedToActivityForConfigChanges(Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
