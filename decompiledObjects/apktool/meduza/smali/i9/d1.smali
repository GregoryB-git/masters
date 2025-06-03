.class public final synthetic Li9/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li9/h1;


# direct methods
.method public synthetic constructor <init>(Li9/h1;I)V
    .locals 0

    iput p2, p0, Li9/d1;->a:I

    iput-object p1, p0, Li9/d1;->b:Li9/h1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Li9/d1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const-string v3, "Failed to decode Query data for target %s"

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_0
    iget-object v0, p0, Li9/d1;->b:Li9/h1;

    .line 14
    .line 15
    check-cast p1, Landroid/database/Cursor;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getBlob(I)[B

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :try_start_0
    invoke-static {p1}, Ll9/c;->X([B)Ll9/c;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v7, v0, Li9/h1;->b:Li9/i;

    .line 33
    .line 34
    invoke-virtual {v7, p1}, Li9/i;->d(Ll9/c;)Li9/m1;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p1, p1, Li9/m1;->a:Lg9/k0;

    .line 39
    .line 40
    invoke-virtual {p1}, Lg9/k0;->b()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v0, v0, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 45
    .line 46
    const-string v7, "UPDATE targets SET canonical_id  = ? WHERE target_id = ?"

    .line 47
    .line 48
    new-array v2, v2, [Ljava/lang/Object;

    .line 49
    .line 50
    aput-object p1, v2, v5

    .line 51
    .line 52
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    aput-object p1, v2, v4

    .line 57
    .line 58
    invoke-virtual {v0, v7, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lma/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catch_0
    new-array p1, v4, [Ljava/lang/Object;

    .line 63
    .line 64
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    aput-object v0, p1, v5

    .line 69
    .line 70
    invoke-static {v3, p1}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :goto_0
    iget-object v0, p0, Li9/d1;->b:Li9/h1;

    .line 75
    .line 76
    check-cast p1, Landroid/database/Cursor;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getBlob(I)[B

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :try_start_1
    invoke-static {p1}, Ll9/c;->X([B)Ll9/c;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1}, Lma/w;->E()Lma/w$a;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Ll9/c$a;

    .line 98
    .line 99
    invoke-virtual {p1}, Lma/w$a;->m()V

    .line 100
    .line 101
    .line 102
    iget-object v7, p1, Lma/w$a;->b:Lma/w;

    .line 103
    .line 104
    check-cast v7, Ll9/c;

    .line 105
    .line 106
    invoke-static {v7}, Ll9/c;->J(Ll9/c;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lma/w$a;->k()Lma/w;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Ll9/c;

    .line 114
    .line 115
    iget-object v0, v0, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 116
    .line 117
    const-string v7, "UPDATE targets SET target_proto = ? WHERE target_id = ?"

    .line 118
    .line 119
    new-array v2, v2, [Ljava/lang/Object;

    .line 120
    .line 121
    invoke-virtual {p1}, Lma/a;->j()[B

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    aput-object p1, v2, v5

    .line 126
    .line 127
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    aput-object p1, v2, v4

    .line 132
    .line 133
    invoke-virtual {v0, v7, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lma/b0; {:try_start_1 .. :try_end_1} :catch_1

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :catch_1
    new-array p1, v4, [Ljava/lang/Object;

    .line 138
    .line 139
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    aput-object v0, p1, v5

    .line 144
    .line 145
    invoke-static {v3, p1}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    throw v1

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
