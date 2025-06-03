.class public final Lea/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lea/z;

.field public static final b:La9/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lea/z;

    .line 2
    .line 3
    invoke-direct {v0}, Lea/z;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lea/z;->a:Lea/z;

    .line 7
    .line 8
    new-instance v0, La9/e;

    .line 9
    .line 10
    invoke-direct {v0}, La9/e;-><init>()V

    .line 11
    .line 12
    .line 13
    const-class v1, Lea/y;

    .line 14
    .line 15
    sget-object v2, Lea/g;->a:Lea/g;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, La9/e;->a(Ljava/lang/Class;Ly8/d;)Lz8/a;

    .line 18
    .line 19
    .line 20
    const-class v1, Lea/f0;

    .line 21
    .line 22
    sget-object v2, Lea/h;->a:Lea/h;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, La9/e;->a(Ljava/lang/Class;Ly8/d;)Lz8/a;

    .line 25
    .line 26
    .line 27
    const-class v1, Lea/j;

    .line 28
    .line 29
    sget-object v2, Lea/e;->a:Lea/e;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, La9/e;->a(Ljava/lang/Class;Ly8/d;)Lz8/a;

    .line 32
    .line 33
    .line 34
    const-class v1, Lea/b;

    .line 35
    .line 36
    sget-object v2, Lea/d;->a:Lea/d;

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, La9/e;->a(Ljava/lang/Class;Ly8/d;)Lz8/a;

    .line 39
    .line 40
    .line 41
    const-class v1, Lea/a;

    .line 42
    .line 43
    sget-object v2, Lea/c;->a:Lea/c;

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, La9/e;->a(Ljava/lang/Class;Ly8/d;)Lz8/a;

    .line 46
    .line 47
    .line 48
    const-class v1, Lea/s;

    .line 49
    .line 50
    sget-object v2, Lea/f;->a:Lea/f;

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, La9/e;->a(Ljava/lang/Class;Ly8/d;)Lz8/a;

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    iput-boolean v1, v0, La9/e;->d:Z

    .line 57
    .line 58
    new-instance v1, La9/d;

    .line 59
    .line 60
    invoke-direct {v1, v0}, La9/d;-><init>(La9/e;)V

    .line 61
    .line 62
    .line 63
    sput-object v1, Lea/z;->b:La9/d;

    .line 64
    .line 65
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lu7/f;)Lea/b;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lu7/f;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu7/f;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-string v1, "firebaseApp.applicationContext"

    .line 7
    .line 8
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v3, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v5, 0x1c

    .line 27
    .line 28
    if-lt v4, v5, :cond_0

    .line 29
    .line 30
    invoke-static {v0}, Lcom/google/android/recaptcha/internal/a;->e(Landroid/content/pm/PackageInfo;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget v4, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 40
    .line 41
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :goto_0
    move-object v5, v4

    .line 46
    new-instance v9, Lea/b;

    .line 47
    .line 48
    invoke-virtual {p0}, Lu7/f;->a()V

    .line 49
    .line 50
    .line 51
    iget-object v4, p0, Lu7/f;->c:Lu7/j;

    .line 52
    .line 53
    iget-object v10, v4, Lu7/j;->b:Ljava/lang/String;

    .line 54
    .line 55
    const-string v4, "firebaseApp.options.applicationId"

    .line 56
    .line 57
    invoke-static {v10, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 61
    .line 62
    const-string v4, "MODEL"

    .line 63
    .line 64
    invoke-static {v11, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sget-object v12, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 68
    .line 69
    const-string v4, "RELEASE"

    .line 70
    .line 71
    invoke-static {v12, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v13, Lea/a;

    .line 75
    .line 76
    const-string v4, "packageName"

    .line 77
    .line 78
    invoke-static {v3, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 82
    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    move-object v4, v5

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    move-object v4, v0

    .line 88
    :goto_1
    sget-object v6, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 89
    .line 90
    const-string v0, "MANUFACTURER"

    .line 91
    .line 92
    invoke-static {v6, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lu7/f;->a()V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lu7/f;->a:Landroid/content/Context;

    .line 99
    .line 100
    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    invoke-static {v0}, Lea/t;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_4

    .line 120
    .line 121
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    move-object v14, v8

    .line 126
    check-cast v14, Lea/s;

    .line 127
    .line 128
    iget v14, v14, Lea/s;->b:I

    .line 129
    .line 130
    if-ne v14, v7, :cond_3

    .line 131
    .line 132
    const/4 v14, 0x1

    .line 133
    goto :goto_2

    .line 134
    :cond_3
    move v14, v2

    .line 135
    :goto_2
    if-eqz v14, :cond_2

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_4
    const/4 v8, 0x0

    .line 139
    :goto_3
    check-cast v8, Lea/s;

    .line 140
    .line 141
    if-nez v8, :cond_5

    .line 142
    .line 143
    invoke-static {}, Lea/t;->b()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    new-instance v8, Lea/s;

    .line 148
    .line 149
    invoke-direct {v8, v7, v2, v0, v2}, Lea/s;-><init>(IILjava/lang/String;Z)V

    .line 150
    .line 151
    .line 152
    :cond_5
    move-object v7, v8

    .line 153
    invoke-virtual {p0}, Lu7/f;->a()V

    .line 154
    .line 155
    .line 156
    iget-object p0, p0, Lu7/f;->a:Landroid/content/Context;

    .line 157
    .line 158
    invoke-static {p0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {p0}, Lea/t;->a(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    move-object v2, v13

    .line 166
    invoke-direct/range {v2 .. v8}, Lea/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lea/s;Ljava/util/ArrayList;)V

    .line 167
    .line 168
    .line 169
    invoke-direct {v9, v10, v11, v12, v13}, Lea/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lea/a;)V

    .line 170
    .line 171
    .line 172
    return-object v9
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
