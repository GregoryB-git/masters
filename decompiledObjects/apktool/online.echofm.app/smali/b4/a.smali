.class public Lb4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lb4/a;->a:Ljava/util/Map;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lb4/a;->a:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public b(La4/c;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, La4/c;->j()La4/e$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, La4/c;->i()Ld4/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, La4/e$a;->p:La4/e$a;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq v0, v2, :cond_1

    .line 13
    .line 14
    sget-object v4, La4/e$a;->r:La4/e$a;

    .line 15
    .line 16
    if-eq v0, v4, :cond_1

    .line 17
    .line 18
    sget-object v4, La4/e$a;->o:La4/e$a;

    .line 19
    .line 20
    if-ne v0, v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v4, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    move v4, v3

    .line 26
    :goto_1
    const-string v5, "Only child changes supported for tracking"

    .line 27
    .line 28
    invoke-static {v4, v5}, LY3/m;->g(ZLjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, La4/c;->i()Ld4/b;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Ld4/b;->s()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    xor-int/2addr v3, v4

    .line 40
    invoke-static {v3}, LY3/m;->f(Z)V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lb4/a;->a:Ljava/util/Map;

    .line 44
    .line 45
    invoke-interface {v3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_7

    .line 50
    .line 51
    iget-object v3, p0, Lb4/a;->a:Ljava/util/Map;

    .line 52
    .line 53
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, La4/c;

    .line 58
    .line 59
    invoke-virtual {v3}, La4/c;->j()La4/e$a;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-ne v0, v2, :cond_2

    .line 64
    .line 65
    sget-object v5, La4/e$a;->o:La4/e$a;

    .line 66
    .line 67
    if-ne v4, v5, :cond_2

    .line 68
    .line 69
    iget-object v0, p0, Lb4/a;->a:Ljava/util/Map;

    .line 70
    .line 71
    invoke-virtual {p1}, La4/c;->i()Ld4/b;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {p1}, La4/c;->k()Ld4/i;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {v3}, La4/c;->k()Ld4/i;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-static {v1, p1, v3}, La4/c;->d(Ld4/b;Ld4/i;Ld4/i;)La4/c;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_2
    sget-object v5, La4/e$a;->o:La4/e$a;

    .line 92
    .line 93
    if-ne v0, v5, :cond_3

    .line 94
    .line 95
    if-ne v4, v2, :cond_3

    .line 96
    .line 97
    iget-object p1, p0, Lb4/a;->a:Ljava/util/Map;

    .line 98
    .line 99
    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    if-ne v0, v5, :cond_4

    .line 104
    .line 105
    sget-object v5, La4/e$a;->r:La4/e$a;

    .line 106
    .line 107
    if-ne v4, v5, :cond_4

    .line 108
    .line 109
    iget-object p1, p0, Lb4/a;->a:Ljava/util/Map;

    .line 110
    .line 111
    invoke-virtual {v3}, La4/c;->l()Ld4/i;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v1, v0}, La4/c;->g(Ld4/b;Ld4/i;)La4/c;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_4
    sget-object v5, La4/e$a;->r:La4/e$a;

    .line 124
    .line 125
    if-ne v0, v5, :cond_5

    .line 126
    .line 127
    if-ne v4, v2, :cond_5

    .line 128
    .line 129
    iget-object v0, p0, Lb4/a;->a:Ljava/util/Map;

    .line 130
    .line 131
    invoke-virtual {p1}, La4/c;->k()Ld4/i;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {v1, p1}, La4/c;->b(Ld4/b;Ld4/i;)La4/c;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    goto :goto_2

    .line 140
    :cond_5
    if-ne v0, v5, :cond_6

    .line 141
    .line 142
    if-ne v4, v5, :cond_6

    .line 143
    .line 144
    iget-object v0, p0, Lb4/a;->a:Ljava/util/Map;

    .line 145
    .line 146
    invoke-virtual {p1}, La4/c;->k()Ld4/i;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {v3}, La4/c;->l()Ld4/i;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-static {v1, p1, v2}, La4/c;->d(Ld4/b;Ld4/i;Ld4/i;)La4/c;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    goto :goto_2

    .line 159
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v2, "Illegal combination of changes: "

    .line 167
    .line 168
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string p1, " occurred after "

    .line 175
    .line 176
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw v0

    .line 190
    :cond_7
    iget-object v0, p0, Lb4/a;->a:Ljava/util/Map;

    .line 191
    .line 192
    invoke-virtual {p1}, La4/c;->i()Ld4/b;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    :goto_2
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    :goto_3
    return-void
.end method
