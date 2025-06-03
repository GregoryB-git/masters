.class public final Lcom/google/android/gms/internal/auth-api/zbag;
.super Lk6/d;
.source "SourceFile"

# interfaces
.implements Ld6/d;


# static fields
.field private static final zba:Lk6/a$g;

.field private static final zbb:Lk6/a$a;

.field private static final zbc:Lk6/a;


# instance fields
.field private final zbd:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk6/a$g;

    invoke-direct {v0}, Lk6/a$g;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth-api/zbag;->zba:Lk6/a$g;

    new-instance v1, Lcom/google/android/gms/internal/auth-api/zbad;

    invoke-direct {v1}, Lcom/google/android/gms/internal/auth-api/zbad;-><init>()V

    sput-object v1, Lcom/google/android/gms/internal/auth-api/zbag;->zbb:Lk6/a$a;

    new-instance v2, Lk6/a;

    const-string v3, "Auth.Api.Identity.CredentialSaving.API"

    invoke-direct {v2, v3, v1, v0}, Lk6/a;-><init>(Ljava/lang/String;Lk6/a$a;Lk6/a$g;)V

    sput-object v2, Lcom/google/android/gms/internal/auth-api/zbag;->zbc:Lk6/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ld6/r;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbag;->zbc:Lk6/a;

    sget-object v1, Lk6/d$a;->c:Lk6/d$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lk6/d;-><init>(Landroid/app/Activity;Lk6/a;Lk6/a$d;Lk6/d$a;)V

    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbat;->zba()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbag;->zbd:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ld6/r;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/auth-api/zbag;->zbc:Lk6/a;

    sget-object v1, Lk6/d$a;->c:Lk6/d$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lk6/d;-><init>(Landroid/content/Context;Lk6/a;Lk6/a$d;Lk6/d$a;)V

    invoke-static {}, Lcom/google/android/gms/internal/auth-api/zbat;->zba()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth-api/zbag;->zbd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getStatusFromIntent(Landroid/content/Intent;)Lcom/google/android/gms/common/api/Status;
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    return-object p1

    :cond_0
    sget-object v0, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "status"

    invoke-static {p1, v1, v0}, Ln6/d;->a(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Ln6/c;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    if-nez p1, :cond_1

    sget-object p1, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    :cond_1
    return-object p1
.end method

.method public final saveAccountLinkingToken(Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ld6/g;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v5, p1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->d:Ljava/util/List;

    .line 10
    .line 11
    iget-object v4, p1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v2, p1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->a:Landroid/app/PendingIntent;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->b:Ljava/lang/String;

    .line 16
    .line 17
    iget v7, p1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->f:I

    .line 18
    .line 19
    iget-object p1, p1, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;->e:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    iget-object v6, p0, Lcom/google/android/gms/internal/auth-api/zbag;->zbd:Ljava/lang/String;

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    const/4 v0, 0x0

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    move v1, p1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v1, v0

    .line 33
    :goto_0
    const-string v8, "Consent PendingIntent cannot be null"

    .line 34
    .line 35
    invoke-static {v8, v1}, Lm6/j;->a(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v1, "auth_code"

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const-string v8, "Invalid tokenType"

    .line 45
    .line 46
    invoke-static {v8, v1}, Lm6/j;->a(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    xor-int/2addr v1, p1

    .line 54
    const-string v8, "serviceId cannot be null or empty"

    .line 55
    .line 56
    invoke-static {v8, v1}, Lm6/j;->a(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    if-eqz v5, :cond_1

    .line 60
    .line 61
    move v1, p1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move v1, v0

    .line 64
    :goto_1
    const-string v8, "scopes cannot be null"

    .line 65
    .line 66
    invoke-static {v8, v1}, Lm6/j;->a(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    new-instance v8, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;

    .line 70
    .line 71
    move-object v1, v8

    .line 72
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;-><init>(Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Ll6/q$a;

    .line 76
    .line 77
    invoke-direct {v1}, Ll6/q$a;-><init>()V

    .line 78
    .line 79
    .line 80
    new-array p1, p1, [Lj6/d;

    .line 81
    .line 82
    sget-object v2, Lcom/google/android/gms/internal/auth-api/zbas;->zbg:Lj6/d;

    .line 83
    .line 84
    aput-object v2, p1, v0

    .line 85
    .line 86
    iput-object p1, v1, Ll6/q$a;->c:[Lj6/d;

    .line 87
    .line 88
    new-instance p1, Lcom/google/android/gms/internal/auth-api/zbab;

    .line 89
    .line 90
    invoke-direct {p1, p0, v8}, Lcom/google/android/gms/internal/auth-api/zbab;-><init>(Lcom/google/android/gms/internal/auth-api/zbag;Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;)V

    .line 91
    .line 92
    .line 93
    iput-object p1, v1, Ll6/q$a;->a:Ll6/n;

    .line 94
    .line 95
    iput-boolean v0, v1, Ll6/q$a;->b:Z

    .line 96
    .line 97
    const/16 p1, 0x5ff

    .line 98
    .line 99
    iput p1, v1, Ll6/q$a;->d:I

    .line 100
    .line 101
    invoke-virtual {v1}, Ll6/q$a;->a()Ll6/s0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p0, p1}, Lk6/d;->doRead(Ll6/q;)Lcom/google/android/gms/tasks/Task;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1
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

.method public final savePassword(Ld6/h;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld6/h;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ld6/i;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ld6/h;->a:Ld6/l;

    .line 5
    .line 6
    iget p1, p1, Ld6/h;->c:I

    .line 7
    .line 8
    iget-object v1, p0, Lcom/google/android/gms/internal/auth-api/zbag;->zbd:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v2, Ld6/h;

    .line 11
    .line 12
    invoke-direct {v2, v0, v1, p1}, Ld6/h;-><init>(Ld6/l;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Ll6/q$a;

    .line 16
    .line 17
    invoke-direct {p1}, Ll6/q$a;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    new-array v0, v0, [Lj6/d;

    .line 22
    .line 23
    sget-object v1, Lcom/google/android/gms/internal/auth-api/zbas;->zbe:Lj6/d;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    aput-object v1, v0, v3

    .line 27
    .line 28
    iput-object v0, p1, Ll6/q$a;->c:[Lj6/d;

    .line 29
    .line 30
    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbac;

    .line 31
    .line 32
    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/internal/auth-api/zbac;-><init>(Lcom/google/android/gms/internal/auth-api/zbag;Ld6/h;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p1, Ll6/q$a;->a:Ll6/n;

    .line 36
    .line 37
    iput-boolean v3, p1, Ll6/q$a;->b:Z

    .line 38
    .line 39
    const/16 v0, 0x600

    .line 40
    .line 41
    iput v0, p1, Ll6/q$a;->d:I

    .line 42
    .line 43
    invoke-virtual {p1}, Ll6/q$a;->a()Ll6/s0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, p1}, Lk6/d;->doRead(Ll6/q;)Lcom/google/android/gms/tasks/Task;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
