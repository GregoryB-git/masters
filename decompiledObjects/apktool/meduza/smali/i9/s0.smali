.class public final synthetic Li9/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Li9/s0;->a:I

    iput-object p1, p0, Li9/s0;->b:Ljava/lang/Object;

    iput-object p2, p0, Li9/s0;->c:Ljava/lang/Object;

    iput-object p3, p0, Li9/s0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 9

    .line 1
    iget v0, p0, Li9/s0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_0
    iget-object v0, p0, Li9/s0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/util/SortedSet;

    .line 12
    .line 13
    iget-object v3, p0, Li9/s0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lj9/k;

    .line 16
    .line 17
    iget-object v4, p0, Li9/s0;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, Lj9/i;

    .line 20
    .line 21
    check-cast p1, Landroid/database/Cursor;

    .line 22
    .line 23
    invoke-virtual {v3}, Lj9/k;->d()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getBlob(I)[B

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v1, Lh9/a;

    .line 36
    .line 37
    invoke-direct {v1, v3, v4, v2, p1}, Lh9/a;-><init>(ILj9/i;[B[B)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :goto_0
    iget-object v0, p0, Li9/s0;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Li9/j1;

    .line 47
    .line 48
    iget-object v3, p0, Li9/s0;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Landroid/util/SparseArray;

    .line 51
    .line 52
    iget-object v4, p0, Li9/s0;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, [I

    .line 55
    .line 56
    check-cast p1, Landroid/database/Cursor;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-nez v3, :cond_0

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Li9/j1;->i(I)V

    .line 72
    .line 73
    .line 74
    iget-object v3, v0, Li9/j1;->a:Li9/y0;

    .line 75
    .line 76
    new-array v5, v1, [Ljava/lang/Object;

    .line 77
    .line 78
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    aput-object p1, v5, v2

    .line 83
    .line 84
    const-string p1, "DELETE FROM targets WHERE target_id = ?"

    .line 85
    .line 86
    invoke-virtual {v3, p1, v5}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-wide v5, v0, Li9/j1;->f:J

    .line 90
    .line 91
    const-wide/16 v7, 0x1

    .line 92
    .line 93
    sub-long/2addr v5, v7

    .line 94
    iput-wide v5, v0, Li9/j1;->f:J

    .line 95
    .line 96
    aget p1, v4, v2

    .line 97
    .line 98
    add-int/2addr p1, v1

    .line 99
    aput p1, v4, v2

    .line 100
    .line 101
    :cond_0
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
