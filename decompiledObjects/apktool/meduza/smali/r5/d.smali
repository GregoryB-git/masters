.class public final synthetic Lr5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr5/f$h$a;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    iput-object p1, p0, Lr5/d;->b:Ljava/lang/Object;

    iput-object p2, p0, Lr5/d;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Lr5/d;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILz4/i0;[I)Lo7/l0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lr5/d;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lr5/f;

    .line 6
    .line 7
    iget-object v2, v0, Lr5/d;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lr5/f$c;

    .line 10
    .line 11
    iget-boolean v11, v0, Lr5/d;->a:Z

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v12, Lr5/e;

    .line 17
    .line 18
    invoke-direct {v12, v1}, Lr5/e;-><init>(Lr5/f;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lo7/t;->b:Lo7/t$b;

    .line 22
    .line 23
    new-instance v1, Lo7/t$a;

    .line 24
    .line 25
    invoke-direct {v1}, Lo7/t$a;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    move-object/from16 v14, p2

    .line 30
    .line 31
    move v13, v3

    .line 32
    :goto_0
    iget v3, v14, Lz4/i0;->a:I

    .line 33
    .line 34
    if-ge v13, v3, :cond_0

    .line 35
    .line 36
    new-instance v15, Lr5/f$a;

    .line 37
    .line 38
    aget v8, p3, v13

    .line 39
    .line 40
    move-object v3, v15

    .line 41
    move/from16 v4, p1

    .line 42
    .line 43
    move-object/from16 v5, p2

    .line 44
    .line 45
    move v6, v13

    .line 46
    move-object v7, v2

    .line 47
    move v9, v11

    .line 48
    move-object v10, v12

    .line 49
    invoke-direct/range {v3 .. v10}, Lr5/f$a;-><init>(ILz4/i0;ILr5/f$c;IZLr5/e;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v15}, Lo7/t$a;->c(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v13, v13, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v1}, Lo7/t$a;->e()Lo7/l0;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    return-object v1
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lr5/d;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lr5/d;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/Intent;

    iget-boolean v2, p0, Lr5/d;->a:Z

    sget-object v3, Laa/j;->c:Ljava/lang/Object;

    invoke-static {}, Lv6/e;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x192

    if-eq v3, v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, v1, v2}, Laa/j;->a(Landroid/content/Context;Landroid/content/Intent;Z)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lm/b;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lm/b;-><init>(I)V

    new-instance v1, Le0/d;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Le0/d;-><init>(I)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :cond_1
    :goto_0
    return-object p1
.end method
