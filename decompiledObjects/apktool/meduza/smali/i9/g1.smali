.class public final synthetic Li9/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Li9/g1;->a:I

    iput-object p2, p0, Li9/g1;->b:Ljava/lang/Object;

    iput-object p3, p0, Li9/g1;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Li9/g1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    iget-object v0, p0, Li9/g1;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Li9/s$a;

    .line 12
    .line 13
    iget-object v3, p0, Li9/g1;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Landroid/database/sqlite/SQLiteStatement;

    .line 16
    .line 17
    check-cast p1, Lj9/o;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Li9/s$a;->a(Lj9/o;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lj9/e;->m()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1}, Lj9/e;->s()Lj9/e;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lj9/o;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v2, v0}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lp2/m0;->A(Lj9/e;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v3, v1, p1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void

    .line 52
    :goto_0
    iget-object v0, p0, Li9/g1;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Li9/h1;

    .line 55
    .line 56
    iget-object v3, p0, Li9/g1;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ljava/lang/String;

    .line 59
    .line 60
    check-cast p1, Landroid/database/Cursor;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const/4 v4, 0x0

    .line 66
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getInt(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iget-object v5, v0, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 71
    .line 72
    const-string v6, "DELETE FROM mutations WHERE uid = ? AND batch_id = ?"

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v5, v2, v3}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    int-to-long v6, p1

    .line 82
    invoke-virtual {v5, v1, v6, v7}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_1

    .line 90
    .line 91
    move v5, v2

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move v5, v4

    .line 94
    :goto_1
    new-array v6, v1, [Ljava/lang/Object;

    .line 95
    .line 96
    aput-object v3, v6, v4

    .line 97
    .line 98
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    aput-object v7, v6, v2

    .line 103
    .line 104
    const-string v7, "Mutation batch (%s, %d) did not exist"

    .line 105
    .line 106
    invoke-static {v7, v5, v6}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, v0, Li9/h1;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 110
    .line 111
    new-array v1, v1, [Ljava/lang/Object;

    .line 112
    .line 113
    aput-object v3, v1, v4

    .line 114
    .line 115
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    aput-object p1, v1, v2

    .line 120
    .line 121
    const-string p1, "DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?"

    .line 122
    .line 123
    invoke-virtual {v0, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
