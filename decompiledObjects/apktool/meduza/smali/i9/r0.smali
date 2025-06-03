.class public final synthetic Li9/r0;
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

    iput p1, p0, Li9/r0;->a:I

    iput-object p2, p0, Li9/r0;->b:Ljava/lang/Object;

    iput-object p3, p0, Li9/r0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Li9/r0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_0
    iget-object v0, p0, Li9/r0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Li9/t0;

    .line 13
    .line 14
    iget-object v4, p0, Li9/r0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, Lj9/g;

    .line 17
    .line 18
    check-cast p1, Lh9/d;

    .line 19
    .line 20
    iget-object v5, v0, Li9/t0;->a:Li9/y0;

    .line 21
    .line 22
    const/4 v6, 0x5

    .line 23
    new-array v6, v6, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {p1}, Lh9/d;->i()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    aput-object v7, v6, v3

    .line 34
    .line 35
    iget-object v0, v0, Li9/t0;->c:Ljava/lang/String;

    .line 36
    .line 37
    aput-object v0, v6, v2

    .line 38
    .line 39
    invoke-virtual {p1}, Lh9/d;->f()[B

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    aput-object v0, v6, v1

    .line 44
    .line 45
    invoke-virtual {p1}, Lh9/d;->g()[B

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/4 v0, 0x3

    .line 50
    aput-object p1, v6, v0

    .line 51
    .line 52
    invoke-interface {v4}, Lj9/g;->getKey()Lj9/i;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Lj9/i;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const/4 v0, 0x4

    .line 61
    aput-object p1, v6, v0

    .line 62
    .line 63
    const-string p1, "DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?"

    .line 64
    .line 65
    invoke-virtual {v5, p1, v6}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :goto_0
    iget-object v0, p0, Li9/r0;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, [Z

    .line 72
    .line 73
    iget-object v4, p0, Li9/r0;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v4, Landroid/database/sqlite/SQLiteStatement;

    .line 76
    .line 77
    check-cast p1, Landroid/database/Cursor;

    .line 78
    .line 79
    aput-boolean v2, v0, v3

    .line 80
    .line 81
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p1}, Lp2/m0;->x(Ljava/lang/String;)Lj9/o;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lj9/e;->q()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    int-to-long v5, v0

    .line 97
    invoke-virtual {v4, v2, v5, v6}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v1, p1}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    const/4 v0, -0x1

    .line 108
    if-eq p1, v0, :cond_0

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_0
    move v2, v3

    .line 112
    :goto_1
    new-array p1, v3, [Ljava/lang/Object;

    .line 113
    .line 114
    const-string v0, "Failed to update document path"

    .line 115
    .line 116
    invoke-static {v0, v2, p1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
