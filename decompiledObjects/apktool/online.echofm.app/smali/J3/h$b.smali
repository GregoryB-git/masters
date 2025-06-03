.class public final LJ3/h$b;
.super LJ3/B$e$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Long;

.field public e:Ljava/lang/Long;

.field public f:Ljava/lang/Boolean;

.field public g:LJ3/B$e$a;

.field public h:LJ3/B$e$f;

.field public i:LJ3/B$e$e;

.field public j:LJ3/B$e$c;

.field public k:LJ3/C;

.field public l:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LJ3/B$e$b;-><init>()V

    return-void
.end method

.method public constructor <init>(LJ3/B$e;)V
    .locals 2

    .line 2
    invoke-direct {p0}, LJ3/B$e$b;-><init>()V

    invoke-virtual {p1}, LJ3/B$e;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ3/h$b;->a:Ljava/lang/String;

    invoke-virtual {p1}, LJ3/B$e;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ3/h$b;->b:Ljava/lang/String;

    invoke-virtual {p1}, LJ3/B$e;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ3/h$b;->c:Ljava/lang/String;

    invoke-virtual {p1}, LJ3/B$e;->l()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, LJ3/h$b;->d:Ljava/lang/Long;

    invoke-virtual {p1}, LJ3/B$e;->e()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, LJ3/h$b;->e:Ljava/lang/Long;

    invoke-virtual {p1}, LJ3/B$e;->n()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, LJ3/h$b;->f:Ljava/lang/Boolean;

    invoke-virtual {p1}, LJ3/B$e;->b()LJ3/B$e$a;

    move-result-object v0

    iput-object v0, p0, LJ3/h$b;->g:LJ3/B$e$a;

    invoke-virtual {p1}, LJ3/B$e;->m()LJ3/B$e$f;

    move-result-object v0

    iput-object v0, p0, LJ3/h$b;->h:LJ3/B$e$f;

    invoke-virtual {p1}, LJ3/B$e;->k()LJ3/B$e$e;

    move-result-object v0

    iput-object v0, p0, LJ3/h$b;->i:LJ3/B$e$e;

    invoke-virtual {p1}, LJ3/B$e;->d()LJ3/B$e$c;

    move-result-object v0

    iput-object v0, p0, LJ3/h$b;->j:LJ3/B$e$c;

    invoke-virtual {p1}, LJ3/B$e;->f()LJ3/C;

    move-result-object v0

    iput-object v0, p0, LJ3/h$b;->k:LJ3/C;

    invoke-virtual {p1}, LJ3/B$e;->h()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, LJ3/h$b;->l:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(LJ3/B$e;LJ3/h$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LJ3/h$b;-><init>(LJ3/B$e;)V

    return-void
.end method


# virtual methods
.method public a()LJ3/B$e;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LJ3/h$b;->a:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, " generator"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    :cond_0
    iget-object v1, v0, LJ3/h$b;->b:Ljava/lang/String;

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v2, " identifier"

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :cond_1
    iget-object v1, v0, LJ3/h$b;->d:Ljava/lang/Long;

    .line 48
    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v2, " startedAt"

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    :cond_2
    iget-object v1, v0, LJ3/h$b;->f:Ljava/lang/Boolean;

    .line 69
    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v2, " crashed"

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    :cond_3
    iget-object v1, v0, LJ3/h$b;->g:LJ3/B$e$a;

    .line 90
    .line 91
    if-nez v1, :cond_4

    .line 92
    .line 93
    new-instance v1, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v2, " app"

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    :cond_4
    iget-object v1, v0, LJ3/h$b;->l:Ljava/lang/Integer;

    .line 111
    .line 112
    if-nez v1, :cond_5

    .line 113
    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string v2, " generatorType"

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_6

    .line 136
    .line 137
    new-instance v1, LJ3/h;

    .line 138
    .line 139
    iget-object v4, v0, LJ3/h$b;->a:Ljava/lang/String;

    .line 140
    .line 141
    iget-object v5, v0, LJ3/h$b;->b:Ljava/lang/String;

    .line 142
    .line 143
    iget-object v6, v0, LJ3/h$b;->c:Ljava/lang/String;

    .line 144
    .line 145
    iget-object v2, v0, LJ3/h$b;->d:Ljava/lang/Long;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 148
    .line 149
    .line 150
    move-result-wide v7

    .line 151
    iget-object v9, v0, LJ3/h$b;->e:Ljava/lang/Long;

    .line 152
    .line 153
    iget-object v2, v0, LJ3/h$b;->f:Ljava/lang/Boolean;

    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    iget-object v11, v0, LJ3/h$b;->g:LJ3/B$e$a;

    .line 160
    .line 161
    iget-object v12, v0, LJ3/h$b;->h:LJ3/B$e$f;

    .line 162
    .line 163
    iget-object v13, v0, LJ3/h$b;->i:LJ3/B$e$e;

    .line 164
    .line 165
    iget-object v14, v0, LJ3/h$b;->j:LJ3/B$e$c;

    .line 166
    .line 167
    iget-object v15, v0, LJ3/h$b;->k:LJ3/C;

    .line 168
    .line 169
    iget-object v2, v0, LJ3/h$b;->l:Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v16

    .line 175
    const/16 v17, 0x0

    .line 176
    .line 177
    move-object v3, v1

    .line 178
    invoke-direct/range {v3 .. v17}, LJ3/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;ZLJ3/B$e$a;LJ3/B$e$f;LJ3/B$e$e;LJ3/B$e$c;LJ3/C;ILJ3/h$a;)V

    .line 179
    .line 180
    .line 181
    return-object v1

    .line 182
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 183
    .line 184
    new-instance v3, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const-string v4, "Missing required properties:"

    .line 190
    .line 191
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw v1
.end method

.method public b(LJ3/B$e$a;)LJ3/B$e$b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, LJ3/h$b;->g:LJ3/B$e$a;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "Null app"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public c(Ljava/lang/String;)LJ3/B$e$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/h$b;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public d(Z)LJ3/B$e$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LJ3/h$b;->f:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-object p0
.end method

.method public e(LJ3/B$e$c;)LJ3/B$e$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/h$b;->j:LJ3/B$e$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public f(Ljava/lang/Long;)LJ3/B$e$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/h$b;->e:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method

.method public g(LJ3/C;)LJ3/B$e$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/h$b;->k:LJ3/C;

    .line 2
    .line 3
    return-object p0
.end method

.method public h(Ljava/lang/String;)LJ3/B$e$b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, LJ3/h$b;->a:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "Null generator"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public i(I)LJ3/B$e$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LJ3/h$b;->l:Ljava/lang/Integer;

    .line 6
    .line 7
    return-object p0
.end method

.method public j(Ljava/lang/String;)LJ3/B$e$b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, LJ3/h$b;->b:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "Null identifier"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public l(LJ3/B$e$e;)LJ3/B$e$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/h$b;->i:LJ3/B$e$e;

    .line 2
    .line 3
    return-object p0
.end method

.method public m(J)LJ3/B$e$b;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LJ3/h$b;->d:Ljava/lang/Long;

    .line 6
    .line 7
    return-object p0
.end method

.method public n(LJ3/B$e$f;)LJ3/B$e$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/h$b;->h:LJ3/B$e$f;

    .line 2
    .line 3
    return-object p0
.end method
