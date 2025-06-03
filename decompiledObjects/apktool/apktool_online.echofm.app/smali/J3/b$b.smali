.class public final LJ3/b$b;
.super LJ3/B$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Integer;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:LJ3/B$e;

.field public j:LJ3/B$d;

.field public k:LJ3/B$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LJ3/B$b;-><init>()V

    return-void
.end method

.method public constructor <init>(LJ3/B;)V
    .locals 1

    .line 2
    invoke-direct {p0}, LJ3/B$b;-><init>()V

    invoke-virtual {p1}, LJ3/B;->l()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ3/b$b;->a:Ljava/lang/String;

    invoke-virtual {p1}, LJ3/B;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ3/b$b;->b:Ljava/lang/String;

    invoke-virtual {p1}, LJ3/B;->k()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, LJ3/b$b;->c:Ljava/lang/Integer;

    invoke-virtual {p1}, LJ3/B;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ3/b$b;->d:Ljava/lang/String;

    invoke-virtual {p1}, LJ3/B;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ3/b$b;->e:Ljava/lang/String;

    invoke-virtual {p1}, LJ3/B;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ3/b$b;->f:Ljava/lang/String;

    invoke-virtual {p1}, LJ3/B;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ3/b$b;->g:Ljava/lang/String;

    invoke-virtual {p1}, LJ3/B;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LJ3/b$b;->h:Ljava/lang/String;

    invoke-virtual {p1}, LJ3/B;->m()LJ3/B$e;

    move-result-object v0

    iput-object v0, p0, LJ3/b$b;->i:LJ3/B$e;

    invoke-virtual {p1}, LJ3/B;->j()LJ3/B$d;

    move-result-object v0

    iput-object v0, p0, LJ3/b$b;->j:LJ3/B$d;

    invoke-virtual {p1}, LJ3/B;->c()LJ3/B$a;

    move-result-object p1

    iput-object p1, p0, LJ3/b$b;->k:LJ3/B$a;

    return-void
.end method

.method public synthetic constructor <init>(LJ3/B;LJ3/b$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LJ3/b$b;-><init>(LJ3/B;)V

    return-void
.end method


# virtual methods
.method public a()LJ3/B;
    .locals 15

    .line 1
    iget-object v0, p0, LJ3/b$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, " sdkVersion"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_0
    iget-object v0, p0, LJ3/b$b;->b:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, " gmpAppId"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_1
    iget-object v0, p0, LJ3/b$b;->c:Ljava/lang/Integer;

    .line 46
    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, " platform"

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :cond_2
    iget-object v0, p0, LJ3/b$b;->d:Ljava/lang/String;

    .line 67
    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v1, " installationUuid"

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    :cond_3
    iget-object v0, p0, LJ3/b$b;->g:Ljava/lang/String;

    .line 88
    .line 89
    if-nez v0, :cond_4

    .line 90
    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, " buildVersion"

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    :cond_4
    iget-object v0, p0, LJ3/b$b;->h:Ljava/lang/String;

    .line 109
    .line 110
    if-nez v0, :cond_5

    .line 111
    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, " displayVersion"

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_6

    .line 134
    .line 135
    new-instance v0, LJ3/b;

    .line 136
    .line 137
    iget-object v3, p0, LJ3/b$b;->a:Ljava/lang/String;

    .line 138
    .line 139
    iget-object v4, p0, LJ3/b$b;->b:Ljava/lang/String;

    .line 140
    .line 141
    iget-object v1, p0, LJ3/b$b;->c:Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    iget-object v6, p0, LJ3/b$b;->d:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v7, p0, LJ3/b$b;->e:Ljava/lang/String;

    .line 150
    .line 151
    iget-object v8, p0, LJ3/b$b;->f:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v9, p0, LJ3/b$b;->g:Ljava/lang/String;

    .line 154
    .line 155
    iget-object v10, p0, LJ3/b$b;->h:Ljava/lang/String;

    .line 156
    .line 157
    iget-object v11, p0, LJ3/b$b;->i:LJ3/B$e;

    .line 158
    .line 159
    iget-object v12, p0, LJ3/b$b;->j:LJ3/B$d;

    .line 160
    .line 161
    iget-object v13, p0, LJ3/b$b;->k:LJ3/B$a;

    .line 162
    .line 163
    const/4 v14, 0x0

    .line 164
    move-object v2, v0

    .line 165
    invoke-direct/range {v2 .. v14}, LJ3/b;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJ3/B$e;LJ3/B$d;LJ3/B$a;LJ3/b$a;)V

    .line 166
    .line 167
    .line 168
    return-object v0

    .line 169
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 170
    .line 171
    new-instance v2, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string v3, "Missing required properties:"

    .line 177
    .line 178
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw v0
.end method

.method public b(LJ3/B$a;)LJ3/B$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/b$b;->k:LJ3/B$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Ljava/lang/String;)LJ3/B$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/b$b;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public d(Ljava/lang/String;)LJ3/B$b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, LJ3/b$b;->g:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "Null buildVersion"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public e(Ljava/lang/String;)LJ3/B$b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, LJ3/b$b;->h:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "Null displayVersion"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public f(Ljava/lang/String;)LJ3/B$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/b$b;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public g(Ljava/lang/String;)LJ3/B$b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, LJ3/b$b;->b:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "Null gmpAppId"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public h(Ljava/lang/String;)LJ3/B$b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, LJ3/b$b;->d:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "Null installationUuid"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public i(LJ3/B$d;)LJ3/B$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/b$b;->j:LJ3/B$d;

    .line 2
    .line 3
    return-object p0
.end method

.method public j(I)LJ3/B$b;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, LJ3/b$b;->c:Ljava/lang/Integer;

    .line 6
    .line 7
    return-object p0
.end method

.method public k(Ljava/lang/String;)LJ3/B$b;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, LJ3/b$b;->a:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 7
    .line 8
    const-string v0, "Null sdkVersion"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public l(LJ3/B$e;)LJ3/B$b;
    .locals 0

    .line 1
    iput-object p1, p0, LJ3/b$b;->i:LJ3/B$e;

    .line 2
    .line 3
    return-object p0
.end method
