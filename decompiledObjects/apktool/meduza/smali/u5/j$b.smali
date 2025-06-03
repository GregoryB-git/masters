.class public final Lu5/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu5/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu5/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Z

.field public final b:Ljavax/crypto/Cipher;

.field public final c:Ljavax/crypto/spec/SecretKeySpec;

.field public final d:Ljava/security/SecureRandom;

.field public final e:Lv5/a;

.field public f:Z

.field public g:Lu5/o;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu5/j$b;->a:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lu5/j$b;->b:Ljavax/crypto/Cipher;

    iput-object v0, p0, Lu5/j$b;->c:Ljavax/crypto/spec/SecretKeySpec;

    iput-object v0, p0, Lu5/j$b;->d:Ljava/security/SecureRandom;

    new-instance v0, Lv5/a;

    invoke-direct {v0, p1}, Lv5/a;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Lu5/j$b;->e:Lv5/a;

    return-void
.end method

.method public static i(Lu5/i;I)I
    .locals 4

    .line 1
    iget v0, p0, Lu5/i;->a:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, Lu5/i;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v1, v0

    .line 12
    const/4 v0, 0x2

    .line 13
    if-ge p1, v0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lu5/i;->e:Lu5/m;

    .line 16
    .line 17
    invoke-static {p0}, Lf;->d(Lu5/k;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    mul-int/lit8 v1, v1, 0x1f

    .line 22
    .line 23
    const/16 v0, 0x20

    .line 24
    .line 25
    ushr-long v2, p0, v0

    .line 26
    .line 27
    xor-long/2addr p0, v2

    .line 28
    long-to-int p0, p0

    .line 29
    add-int/2addr v1, p0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    mul-int/lit8 v1, v1, 0x1f

    .line 32
    .line 33
    iget-object p0, p0, Lu5/i;->e:Lu5/m;

    .line 34
    .line 35
    invoke-virtual {p0}, Lu5/m;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    add-int/2addr v1, p0

    .line 40
    :goto_0
    return v1
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
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
.end method

.method public static j(ILjava/io/DataInputStream;)Lu5/i;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x2

    .line 10
    if-ge p0, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J

    .line 13
    .line 14
    .line 15
    move-result-wide p0

    .line 16
    new-instance v2, Lu5/l;

    .line 17
    .line 18
    invoke-direct {v2}, Lu5/l;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p1, v2, Lu5/l;->a:Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v3, "exo_len"

    .line 31
    .line 32
    invoke-virtual {p1, v3, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    iget-object p0, v2, Lu5/l;->b:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    sget-object p0, Lu5/m;->c:Lu5/m;

    .line 41
    .line 42
    invoke-virtual {p0, v2}, Lu5/m;->a(Lu5/l;)Lu5/m;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {p1}, Lu5/j;->a(Ljava/io/DataInputStream;)Lu5/m;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_0
    new-instance p1, Lu5/i;

    .line 52
    .line 53
    invoke-direct {p1, v0, v1, p0}, Lu5/i;-><init>(ILjava/lang/String;Lu5/m;)V

    .line 54
    .line 55
    .line 56
    return-object p1
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
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
.end method


# virtual methods
.method public final a(Ljava/util/HashMap;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lu5/i;",
            ">;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lu5/j$b;->e:Lv5/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv5/a;->b()Lv5/a$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lu5/j$b;->g:Lu5/o;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Lu5/o;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lu5/o;-><init>(Lv5/a$a;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lu5/j$b;->g:Lu5/o;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {v1, v0}, Lu5/o;->f(Ljava/io/OutputStream;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object v0, p0, Lu5/j$b;->g:Lu5/o;

    .line 23
    .line 24
    new-instance v1, Ljava/io/DataOutputStream;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 31
    .line 32
    .line 33
    iget-boolean v3, p0, Lu5/j$b;->a:Z

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    const/4 v5, 0x0

    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    move v3, v4

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v3, v5

    .line 42
    :goto_1
    invoke-virtual {v1, v3}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 43
    .line 44
    .line 45
    iget-boolean v3, p0, Lu5/j$b;->a:Z

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    const/16 v3, 0x10

    .line 50
    .line 51
    new-array v3, v3, [B

    .line 52
    .line 53
    iget-object v6, p0, Lu5/j$b;->d:Ljava/security/SecureRandom;

    .line 54
    .line 55
    sget v7, Lv5/e0;->a:I

    .line 56
    .line 57
    invoke-virtual {v6, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v3}, Ljava/io/OutputStream;->write([B)V

    .line 61
    .line 62
    .line 63
    new-instance v6, Ljavax/crypto/spec/IvParameterSpec;

    .line 64
    .line 65
    invoke-direct {v6, v3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    :try_start_2
    iget-object v3, p0, Lu5/j$b;->b:Ljavax/crypto/Cipher;

    .line 69
    .line 70
    iget-object v7, p0, Lu5/j$b;->c:Ljavax/crypto/spec/SecretKeySpec;

    .line 71
    .line 72
    invoke-virtual {v3, v4, v7, v6}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_2
    .catch Ljava/security/InvalidKeyException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 73
    .line 74
    .line 75
    :try_start_3
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    .line 76
    .line 77
    .line 78
    new-instance v3, Ljava/io/DataOutputStream;

    .line 79
    .line 80
    new-instance v4, Ljavax/crypto/CipherOutputStream;

    .line 81
    .line 82
    iget-object v6, p0, Lu5/j$b;->b:Ljavax/crypto/Cipher;

    .line 83
    .line 84
    invoke-direct {v4, v0, v6}, Ljavax/crypto/CipherOutputStream;-><init>(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V

    .line 85
    .line 86
    .line 87
    invoke-direct {v3, v4}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 88
    .line 89
    .line 90
    move-object v1, v3

    .line 91
    goto :goto_3

    .line 92
    :catch_0
    move-exception p1

    .line 93
    goto :goto_2

    .line 94
    :catch_1
    move-exception p1

    .line 95
    :goto_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    throw v0

    .line 101
    :cond_2
    :goto_3
    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    move v0, v5

    .line 117
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_3

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    check-cast v3, Lu5/i;

    .line 128
    .line 129
    iget v4, v3, Lu5/i;->a:I

    .line 130
    .line 131
    invoke-virtual {v1, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 132
    .line 133
    .line 134
    iget-object v4, v3, Lu5/i;->b:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v1, v4}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object v4, v3, Lu5/i;->e:Lu5/m;

    .line 140
    .line 141
    invoke-static {v4, v1}, Lu5/j;->b(Lu5/m;Ljava/io/DataOutputStream;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v3, v2}, Lu5/j$b;->i(Lu5/i;I)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    add-int/2addr v0, v3

    .line 149
    goto :goto_4

    .line 150
    :cond_3
    invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lu5/j$b;->e:Lv5/a;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 159
    .line 160
    .line 161
    iget-object p1, p1, Lv5/a;->b:Ljava/io/File;

    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 164
    .line 165
    .line 166
    sget p1, Lv5/e0;->a:I

    .line 167
    .line 168
    iput-boolean v5, p0, Lu5/j$b;->f:Z

    .line 169
    .line 170
    return-void

    .line 171
    :catchall_0
    move-exception p1

    .line 172
    goto :goto_5

    .line 173
    :catchall_1
    move-exception p1

    .line 174
    const/4 v1, 0x0

    .line 175
    :goto_5
    invoke-static {v1}, Lv5/e0;->g(Ljava/io/Closeable;)V

    .line 176
    .line 177
    .line 178
    throw p1
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

.method public final b(Lu5/i;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu5/j$b;->f:Z

    return-void
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu5/j$b;->e:Lv5/a;

    .line 2
    .line 3
    iget-object v1, v0, Lv5/a;->a:Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, Lv5/a;->b:Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 23
    :goto_1
    return v0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final d(Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lu5/i;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lu5/j$b;->f:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lu5/j$b;->a(Ljava/util/HashMap;)V

    return-void
.end method

.method public final e(J)V
    .locals 0

    return-void
.end method

.method public final f(Lu5/i;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu5/j$b;->f:Z

    return-void
.end method

.method public final g(Ljava/util/HashMap;Landroid/util/SparseArray;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lu5/i;",
            ">;",
            "Landroid/util/SparseArray<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lu5/j$b;->f:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lx6/b;->H(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lu5/j$b;->e:Lv5/a;

    .line 9
    .line 10
    iget-object v2, v0, Lv5/a;->a:Ljava/io/File;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    iget-object v0, v0, Lv5/a;->b:Ljava/io/File;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v0, v3

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    move v0, v1

    .line 31
    :goto_1
    if-nez v0, :cond_2

    .line 32
    .line 33
    goto/16 :goto_a

    .line 34
    .line 35
    :cond_2
    const/4 v0, 0x0

    .line 36
    :try_start_0
    new-instance v2, Ljava/io/BufferedInputStream;

    .line 37
    .line 38
    iget-object v4, p0, Lu5/j$b;->e:Lv5/a;

    .line 39
    .line 40
    invoke-virtual {v4}, Lv5/a;->a()Ljava/io/FileInputStream;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-direct {v2, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 45
    .line 46
    .line 47
    new-instance v4, Ljava/io/DataInputStream;

    .line 48
    .line 49
    invoke-direct {v4, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-ltz v0, :cond_a

    .line 57
    .line 58
    const/4 v5, 0x2

    .line 59
    if-le v0, v5, :cond_3

    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_3
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    and-int/2addr v6, v1

    .line 68
    if-eqz v6, :cond_5

    .line 69
    .line 70
    iget-object v6, p0, Lu5/j$b;->b:Ljavax/crypto/Cipher;

    .line 71
    .line 72
    if-nez v6, :cond_4

    .line 73
    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :cond_4
    const/16 v6, 0x10

    .line 77
    .line 78
    new-array v6, v6, [B

    .line 79
    .line 80
    invoke-virtual {v4, v6}, Ljava/io/DataInputStream;->readFully([B)V

    .line 81
    .line 82
    .line 83
    new-instance v7, Ljavax/crypto/spec/IvParameterSpec;

    .line 84
    .line 85
    invoke-direct {v7, v6}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    .line 88
    :try_start_2
    iget-object v6, p0, Lu5/j$b;->b:Ljavax/crypto/Cipher;

    .line 89
    .line 90
    iget-object v8, p0, Lu5/j$b;->c:Ljavax/crypto/spec/SecretKeySpec;

    .line 91
    .line 92
    sget v9, Lv5/e0;->a:I

    .line 93
    .line 94
    invoke-virtual {v6, v5, v8, v7}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_2
    .catch Ljava/security/InvalidKeyException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 95
    .line 96
    .line 97
    :try_start_3
    new-instance v5, Ljava/io/DataInputStream;

    .line 98
    .line 99
    new-instance v6, Ljavax/crypto/CipherInputStream;

    .line 100
    .line 101
    iget-object v7, p0, Lu5/j$b;->b:Ljavax/crypto/Cipher;

    .line 102
    .line 103
    invoke-direct {v6, v2, v7}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {v5, v6}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 107
    .line 108
    .line 109
    move-object v4, v5

    .line 110
    goto :goto_3

    .line 111
    :catch_0
    move-exception v0

    .line 112
    goto :goto_2

    .line 113
    :catch_1
    move-exception v0

    .line 114
    :goto_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 115
    .line 116
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    throw v1

    .line 120
    :cond_5
    iget-boolean v2, p0, Lu5/j$b;->a:Z

    .line 121
    .line 122
    if-eqz v2, :cond_6

    .line 123
    .line 124
    iput-boolean v1, p0, Lu5/j$b;->f:Z

    .line 125
    .line 126
    :cond_6
    :goto_3
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    move v5, v3

    .line 131
    move v6, v5

    .line 132
    :goto_4
    if-ge v5, v2, :cond_7

    .line 133
    .line 134
    invoke-static {v0, v4}, Lu5/j$b;->j(ILjava/io/DataInputStream;)Lu5/i;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    iget-object v8, v7, Lu5/i;->b:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {p1, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    iget v8, v7, Lu5/i;->a:I

    .line 144
    .line 145
    iget-object v9, v7, Lu5/i;->b:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p2, v8, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v7, v0}, Lu5/j$b;->i(Lu5/i;I)I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    add-int/2addr v6, v7

    .line 155
    add-int/lit8 v5, v5, 0x1

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_7
    invoke-virtual {v4}, Ljava/io/DataInputStream;->readInt()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    invoke-virtual {v4}, Ljava/io/InputStream;->read()I

    .line 163
    .line 164
    .line 165
    move-result v2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 166
    const/4 v5, -0x1

    .line 167
    if-ne v2, v5, :cond_8

    .line 168
    .line 169
    move v2, v1

    .line 170
    goto :goto_5

    .line 171
    :cond_8
    move v2, v3

    .line 172
    :goto_5
    if-ne v0, v6, :cond_a

    .line 173
    .line 174
    if-nez v2, :cond_9

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_9
    invoke-static {v4}, Lv5/e0;->g(Ljava/io/Closeable;)V

    .line 178
    .line 179
    .line 180
    goto :goto_a

    .line 181
    :cond_a
    :goto_6
    invoke-static {v4}, Lv5/e0;->g(Ljava/io/Closeable;)V

    .line 182
    .line 183
    .line 184
    goto :goto_9

    .line 185
    :catchall_0
    move-exception p1

    .line 186
    move-object v0, v4

    .line 187
    goto :goto_7

    .line 188
    :catch_2
    move-object v0, v4

    .line 189
    goto :goto_8

    .line 190
    :catchall_1
    move-exception p1

    .line 191
    :goto_7
    if-eqz v0, :cond_b

    .line 192
    .line 193
    invoke-static {v0}, Lv5/e0;->g(Ljava/io/Closeable;)V

    .line 194
    .line 195
    .line 196
    :cond_b
    throw p1

    .line 197
    :catch_3
    :goto_8
    if-eqz v0, :cond_c

    .line 198
    .line 199
    invoke-static {v0}, Lv5/e0;->g(Ljava/io/Closeable;)V

    .line 200
    .line 201
    .line 202
    :cond_c
    :goto_9
    move v1, v3

    .line 203
    :goto_a
    if-nez v1, :cond_d

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    .line 209
    .line 210
    .line 211
    iget-object p1, p0, Lu5/j$b;->e:Lv5/a;

    .line 212
    .line 213
    iget-object p2, p1, Lv5/a;->a:Ljava/io/File;

    .line 214
    .line 215
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 216
    .line 217
    .line 218
    iget-object p1, p1, Lv5/a;->b:Ljava/io/File;

    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 221
    .line 222
    .line 223
    :cond_d
    return-void
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
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu5/j$b;->e:Lv5/a;

    .line 2
    .line 3
    iget-object v1, v0, Lv5/a;->a:Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lv5/a;->b:Ljava/io/File;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
