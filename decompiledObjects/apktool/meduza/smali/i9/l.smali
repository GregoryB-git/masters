.class public final synthetic Li9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Li9/l;->a:I

    iput-object p1, p0, Li9/l;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Li9/l;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :pswitch_0
    iget-object v0, p0, Li9/l;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Li9/w0;

    .line 11
    .line 12
    check-cast p1, Landroid/database/Cursor;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getBlob(I)[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v2, Lma/h;->b:Lma/h$h;

    .line 22
    .line 23
    array-length v2, p1

    .line 24
    invoke-static {p1, v1, v2}, Lma/h;->m([BII)Lma/h$h;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, v0, Li9/w0;->f:Lma/h;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    iget-object v0, p0, Li9/l;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Li9/q$d;

    .line 34
    .line 35
    check-cast p1, Li9/m1;

    .line 36
    .line 37
    sget v1, Li9/q;->e:I

    .line 38
    .line 39
    iget-wide v1, p1, Li9/m1;->c:J

    .line 40
    .line 41
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0, p1}, Li9/q$d;->a(Ljava/lang/Long;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_2
    iget-object v0, p0, Li9/l;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Li9/f;

    .line 52
    .line 53
    check-cast p1, Lj9/k;

    .line 54
    .line 55
    invoke-interface {v0, p1}, Li9/f;->a(Lj9/k;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :goto_0
    iget-object v0, p0, Li9/l;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Li9/j1$a;

    .line 62
    .line 63
    check-cast p1, Landroid/database/Cursor;

    .line 64
    .line 65
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p1}, Lp2/m0;->x(Ljava/lang/String;)Lj9/o;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance v1, Lj9/i;

    .line 74
    .line 75
    invoke-direct {v1, p1}, Lj9/i;-><init>(Lj9/o;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, v0, Li9/j1$a;->a:Lt8/e;

    .line 79
    .line 80
    invoke-virtual {p1, v1}, Lt8/e;->a(Ljava/lang/Object;)Lt8/e;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, v0, Li9/j1$a;->a:Lt8/e;

    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
