.class public final Lg9/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<",
            "Lj9/i;",
            "Lg9/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lg9/j;->a:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public final a(Lg9/i;)V
    .locals 7

    .line 1
    sget-object v0, Lg9/i$a;->a:Lg9/i$a;

    .line 2
    .line 3
    sget-object v1, Lg9/i$a;->d:Lg9/i$a;

    .line 4
    .line 5
    iget-object v2, p1, Lg9/i;->b:Lj9/g;

    .line 6
    .line 7
    invoke-interface {v2}, Lj9/g;->getKey()Lj9/i;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lg9/j;->a:Ljava/util/TreeMap;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lg9/i;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lg9/j;->a:Ljava/util/TreeMap;

    .line 22
    .line 23
    invoke-virtual {v0, v2, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v4, v3, Lg9/i;->a:Lg9/i$a;

    .line 28
    .line 29
    iget-object v5, p1, Lg9/i;->a:Lg9/i$a;

    .line 30
    .line 31
    sget-object v6, Lg9/i$a;->b:Lg9/i$a;

    .line 32
    .line 33
    if-eq v5, v6, :cond_1

    .line 34
    .line 35
    if-ne v4, v1, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Lg9/j;->a:Ljava/util/TreeMap;

    .line 38
    .line 39
    invoke-virtual {v0, v2, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    if-ne v5, v1, :cond_2

    .line 44
    .line 45
    if-eq v4, v0, :cond_2

    .line 46
    .line 47
    iget-object p1, p1, Lg9/i;->b:Lj9/g;

    .line 48
    .line 49
    new-instance v0, Lg9/i;

    .line 50
    .line 51
    invoke-direct {v0, v4, p1}, Lg9/i;-><init>(Lg9/i$a;Lj9/g;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    sget-object v1, Lg9/i$a;->c:Lg9/i$a;

    .line 56
    .line 57
    if-ne v5, v1, :cond_3

    .line 58
    .line 59
    if-ne v4, v1, :cond_3

    .line 60
    .line 61
    iget-object p1, p1, Lg9/i;->b:Lj9/g;

    .line 62
    .line 63
    new-instance v0, Lg9/i;

    .line 64
    .line 65
    invoke-direct {v0, v1, p1}, Lg9/i;-><init>(Lg9/i$a;Lj9/g;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    if-ne v5, v1, :cond_4

    .line 70
    .line 71
    if-ne v4, v6, :cond_4

    .line 72
    .line 73
    iget-object p1, p1, Lg9/i;->b:Lj9/g;

    .line 74
    .line 75
    new-instance v0, Lg9/i;

    .line 76
    .line 77
    invoke-direct {v0, v6, p1}, Lg9/i;-><init>(Lg9/i$a;Lj9/g;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    if-ne v5, v0, :cond_5

    .line 82
    .line 83
    if-ne v4, v6, :cond_5

    .line 84
    .line 85
    iget-object p1, p0, Lg9/j;->a:Ljava/util/TreeMap;

    .line 86
    .line 87
    invoke-virtual {p1, v2}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    if-ne v5, v0, :cond_6

    .line 92
    .line 93
    if-ne v4, v1, :cond_6

    .line 94
    .line 95
    iget-object p1, v3, Lg9/i;->b:Lj9/g;

    .line 96
    .line 97
    new-instance v1, Lg9/i;

    .line 98
    .line 99
    invoke-direct {v1, v0, p1}, Lg9/i;-><init>(Lg9/i$a;Lj9/g;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lg9/j;->a:Ljava/util/TreeMap;

    .line 103
    .line 104
    invoke-virtual {p1, v2, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_6
    if-ne v5, v6, :cond_7

    .line 109
    .line 110
    if-ne v4, v0, :cond_7

    .line 111
    .line 112
    iget-object p1, p1, Lg9/i;->b:Lj9/g;

    .line 113
    .line 114
    new-instance v0, Lg9/i;

    .line 115
    .line 116
    invoke-direct {v0, v1, p1}, Lg9/i;-><init>(Lg9/i$a;Lj9/g;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    iget-object p1, p0, Lg9/j;->a:Ljava/util/TreeMap;

    .line 120
    .line 121
    invoke-virtual {p1, v2, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    :goto_1
    return-void

    .line 125
    :cond_7
    const/4 p1, 0x2

    .line 126
    new-array p1, p1, [Ljava/lang/Object;

    .line 127
    .line 128
    const/4 v0, 0x0

    .line 129
    aput-object v5, p1, v0

    .line 130
    .line 131
    const/4 v0, 0x1

    .line 132
    aput-object v4, p1, v0

    .line 133
    .line 134
    const-string v0, "Unsupported combination of changes %s after %s"

    .line 135
    .line 136
    invoke-static {v0, p1}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    const/4 p1, 0x0

    .line 140
    throw p1
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
