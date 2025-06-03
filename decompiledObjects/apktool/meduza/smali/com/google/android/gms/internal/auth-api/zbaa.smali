.class public final Lcom/google/android/gms/internal/auth-api/zbaa;
.super Lk6/d;
.source "SourceFile"


# static fields
.field private static final zba:Lk6/a$g;

.field private static final zbb:Lk6/a$a;

.field private static final zbc:Lk6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk6/a$g;

    invoke-direct {v0}, Lk6/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth-api/zbaa;->zba:Lk6/a$g;

    new-instance v1, Lcom/google/android/gms/internal/auth-api/zby;

    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api/zby;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/auth-api/zbaa;->zbb:Lk6/a$a;

    new-instance v2, Lk6/a;

    const-string v3, "Auth.Api.Identity.Authorization.API"

    invoke-direct {v2, v3, v1, v0}, Lk6/a;-><init>(Ljava/lang/String;Lk6/a$a;Lk6/a$g;)V

    sput-object v2, Lcom/google/android/gms/internal/auth-api/zbaa;->zbc:Lk6/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ld6/m;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbaa;->zbc:Lk6/a;

    .line 1
    iget-object p2, p2, Ld6/m;->a:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 2
    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    .line 3
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbat;->zba()Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    .line 5
    new-instance v1, Ld6/m;

    invoke-direct {v1, p2}, Ld6/m;-><init>(Ljava/lang/String;)V

    .line 6
    sget-object p2, Lk6/d$a;->c:Lk6/d$a;

    invoke-direct {p0, p1, v0, v1, p2}, Lk6/d;-><init>(Landroid/app/Activity;Lk6/a;Lk6/a$d;Lk6/d$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ld6/m;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbaa;->zbc:Lk6/a;

    .line 7
    iget-object p2, p2, Ld6/m;->a:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 8
    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    .line 9
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbat;->zba()Ljava/lang/String;

    move-result-object p2

    .line 10
    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    .line 11
    new-instance v1, Ld6/m;

    invoke-direct {v1, p2}, Ld6/m;-><init>(Ljava/lang/String;)V

    .line 12
    sget-object p2, Lk6/d$a;->c:Lk6/d$a;

    invoke-direct {p0, p1, v0, v1, p2}, Lk6/d;-><init>(Landroid/content/Context;Lk6/a;Lk6/a$d;Lk6/d$a;)V

    return-void
.end method


# virtual methods
.method public final authorize(Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ld6/a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v1, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->a:Ljava/util/List;

    .line 5
    .line 6
    const/4 v9, 0x1

    .line 7
    const/4 v10, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    move v0, v9

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v10

    .line 19
    :goto_0
    const-string v2, "requestedScopes cannot be null or empty"

    .line 20
    .line 21
    invoke-static {v2, v0}, Lm6/j;->a(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    iget-boolean v0, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->p:Z

    .line 25
    .line 26
    iget-object v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->f:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v3, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->e:Landroid/accounts/Account;

    .line 29
    .line 30
    iget-object v4, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->b:Ljava/lang/String;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-static {v2}, Lm6/j;->e(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    move-object v6, v2

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object v6, v5

    .line 41
    :goto_1
    if-eqz v3, :cond_2

    .line 42
    .line 43
    move-object v7, v3

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move-object v7, v5

    .line 46
    :goto_2
    iget-boolean v2, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->d:Z

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    move-object v2, v4

    .line 53
    move v5, v9

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    move-object v2, v5

    .line 56
    move v5, v10

    .line 57
    :goto_3
    iget-boolean p1, p1, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;->c:Z

    .line 58
    .line 59
    if-eqz p1, :cond_6

    .line 60
    .line 61
    if-eqz v4, :cond_6

    .line 62
    .line 63
    if-eqz v2, :cond_5

    .line 64
    .line 65
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_4
    move p1, v10

    .line 73
    goto :goto_5

    .line 74
    :cond_5
    :goto_4
    move p1, v9

    .line 75
    :goto_5
    const-string v2, "two different server client ids provided"

    .line 76
    .line 77
    invoke-static {v2, p1}, Lm6/j;->a(Ljava/lang/String;Z)V

    .line 78
    .line 79
    .line 80
    move v8, v0

    .line 81
    move-object v2, v4

    .line 82
    move v3, v9

    .line 83
    goto :goto_6

    .line 84
    :cond_6
    move v3, v10

    .line 85
    move v8, v3

    .line 86
    :goto_6
    invoke-virtual {p0}, Lk6/d;->getApiOptions()Lk6/a$d;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ld6/m;

    .line 91
    .line 92
    iget-object p1, p1, Ld6/m;->a:Ljava/lang/String;

    .line 93
    .line 94
    new-instance v11, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 95
    .line 96
    move-object v0, v11

    .line 97
    move v4, v5

    .line 98
    move-object v5, v7

    .line 99
    move-object v7, p1

    .line 100
    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;-><init>(Ljava/util/List;Ljava/lang/String;ZZLandroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 101
    .line 102
    .line 103
    new-instance p1, Ll6/q$a;

    .line 104
    .line 105
    invoke-direct {p1}, Ll6/q$a;-><init>()V

    .line 106
    .line 107
    .line 108
    new-array v0, v9, [Lj6/d;

    .line 109
    .line 110
    sget-object v1, Lcom/google/android/gms/internal/auth-api/zbas;->zbc:Lj6/d;

    .line 111
    .line 112
    aput-object v1, v0, v10

    .line 113
    .line 114
    iput-object v0, p1, Ll6/q$a;->c:[Lj6/d;

    .line 115
    .line 116
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbx;

    .line 117
    .line 118
    invoke-direct {v0, p0, v11}, Lcom/google/android/gms/internal/auth-api/zbx;-><init>(Lcom/google/android/gms/internal/auth-api/zbaa;Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;)V

    .line 119
    .line 120
    .line 121
    iput-object v0, p1, Ll6/q$a;->a:Ll6/n;

    .line 122
    .line 123
    iput-boolean v10, p1, Ll6/q$a;->b:Z

    .line 124
    .line 125
    const/16 v0, 0x5fe

    .line 126
    .line 127
    iput v0, p1, Ll6/q$a;->d:I

    .line 128
    .line 129
    invoke-virtual {p1}, Ll6/q$a;->a()Ll6/s0;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p0, p1}, Lk6/d;->doRead(Ll6/q;)Lcom/google/android/gms/tasks/Task;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1
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

.method public final getAuthorizationResultFromIntent(Landroid/content/Intent;)Ld6/a;
    .locals 2

    if-eqz p1, :cond_3

    sget-object v0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "status"

    invoke-static {p1, v1, v0}, Ln6/d;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Ln6/c;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/Status;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->D()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Ld6/a;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "authorization_result"

    invoke-static {p1, v1, v0}, Ln6/d;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Ln6/c;

    move-result-object p1

    check-cast p1, Ld6/a;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Lk6/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lk6/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_1
    new-instance p1, Lk6/b;

    invoke-direct {p1, v0}, Lk6/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_2
    new-instance p1, Lk6/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->q:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lk6/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_3
    new-instance p1, Lk6/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Lk6/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1
.end method
