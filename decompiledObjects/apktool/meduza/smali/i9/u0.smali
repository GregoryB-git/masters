.class public final synthetic Li9/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/d;


# instance fields
.field public final synthetic a:Li9/v0;

.field public final synthetic b:[I

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:[Lj9/o;


# direct methods
.method public synthetic constructor <init>(Li9/v0;[ILjava/util/ArrayList;[Lj9/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/u0;->a:Li9/v0;

    iput-object p2, p0, Li9/u0;->b:[I

    iput-object p3, p0, Li9/u0;->c:Ljava/util/List;

    iput-object p4, p0, Li9/u0;->d:[Lj9/o;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-object v0, p0, Li9/u0;->a:Li9/v0;

    .line 2
    .line 3
    iget-object v1, p0, Li9/u0;->b:[I

    .line 4
    .line 5
    iget-object v2, p0, Li9/u0;->c:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, Li9/u0;->d:[Lj9/o;

    .line 8
    .line 9
    check-cast p1, Landroid/database/Cursor;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lp2/m0;->x(Ljava/lang/String;)Lj9/o;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v5, Lj9/i;

    .line 24
    .line 25
    invoke-direct {v5, p1}, Lj9/i;-><init>(Lj9/o;)V

    .line 26
    .line 27
    .line 28
    iget-object v6, v0, Li9/v0;->e:Ll3/l;

    .line 29
    .line 30
    invoke-virtual {v6, v5}, Ll3/l;->a(Lj9/i;)Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    const/4 v7, 0x1

    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    move v6, v7

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-object v6, v0, Li9/v0;->a:Li9/y0;

    .line 40
    .line 41
    const-string v8, "SELECT 1 FROM document_mutations WHERE path = ?"

    .line 42
    .line 43
    invoke-virtual {v6, v8}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    new-array v8, v7, [Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v9, v5, Lj9/i;->a:Lj9/o;

    .line 50
    .line 51
    invoke-static {v9}, Lp2/m0;->A(Lj9/e;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    aput-object v9, v8, v4

    .line 56
    .line 57
    invoke-virtual {v6, v8}, Li9/y0$d;->a([Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6}, Li9/y0$d;->e()Landroid/database/Cursor;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    :try_start_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 65
    .line 66
    .line 67
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    xor-int/2addr v8, v7

    .line 69
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 70
    .line 71
    .line 72
    xor-int/lit8 v6, v8, 0x1

    .line 73
    .line 74
    :goto_0
    if-nez v6, :cond_1

    .line 75
    .line 76
    aget v6, v1, v4

    .line 77
    .line 78
    add-int/2addr v6, v7

    .line 79
    aput v6, v1, v4

    .line 80
    .line 81
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    iget-object v0, v0, Li9/v0;->a:Li9/y0;

    .line 85
    .line 86
    new-array v1, v7, [Ljava/lang/Object;

    .line 87
    .line 88
    iget-object v2, v5, Lj9/i;->a:Lj9/o;

    .line 89
    .line 90
    invoke-static {v2}, Lp2/m0;->A(Lj9/e;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    aput-object v2, v1, v4

    .line 95
    .line 96
    const-string v2, "DELETE FROM target_documents WHERE path = ? AND target_id = 0"

    .line 97
    .line 98
    invoke-virtual {v0, v2, v1}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_1
    aput-object p1, v3, v4

    .line 102
    .line 103
    return-void

    .line 104
    :catchall_0
    move-exception p1

    .line 105
    if-eqz v6, :cond_2

    .line 106
    .line 107
    :try_start_1
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :catchall_1
    move-exception v0

    .line 112
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    :cond_2
    :goto_1
    throw p1
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
.end method
