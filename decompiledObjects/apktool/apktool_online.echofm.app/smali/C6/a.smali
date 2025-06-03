.class public abstract LC6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B

.field public static final b:[Ljava/lang/String;

.field public static final c:LB6/h;

.field public static final d:LB6/f;

.field public static final e:LD6/c;

.field public static final f:LD6/c;

.field public static final g:LD6/c;

.field public static final h:LD6/c;

.field public static final i:LD6/c;

.field public static final j:Ljava/nio/charset/Charset;

.field public static final k:Ljava/nio/charset/Charset;

.field public static final l:Ljava/nio/charset/Charset;

.field public static final m:Ljava/nio/charset/Charset;

.field public static final n:Ljava/nio/charset/Charset;

.field public static final o:Ljava/nio/charset/Charset;

.field public static final p:Ljava/util/TimeZone;

.field public static final q:Ljava/util/Comparator;

.field public static final r:Ljava/lang/reflect/Method;

.field public static final s:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-class v0, Ljava/lang/Throwable;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v2, v1, [B

    .line 5
    .line 6
    sput-object v2, LC6/a;->a:[B

    .line 7
    .line 8
    new-array v3, v1, [Ljava/lang/String;

    .line 9
    .line 10
    sput-object v3, LC6/a;->b:[Ljava/lang/String;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {v3, v2}, LB6/h;->b(LB6/d;[B)LB6/h;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    sput-object v4, LC6/a;->c:LB6/h;

    .line 18
    .line 19
    invoke-static {v3, v2}, LB6/f;->a(LB6/d;[B)LB6/f;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sput-object v2, LC6/a;->d:LB6/f;

    .line 24
    .line 25
    const-string v2, "efbbbf"

    .line 26
    .line 27
    invoke-static {v2}, LD6/c;->h(Ljava/lang/String;)LD6/c;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sput-object v2, LC6/a;->e:LD6/c;

    .line 32
    .line 33
    const-string v2, "feff"

    .line 34
    .line 35
    invoke-static {v2}, LD6/c;->h(Ljava/lang/String;)LD6/c;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    sput-object v2, LC6/a;->f:LD6/c;

    .line 40
    .line 41
    const-string v2, "fffe"

    .line 42
    .line 43
    invoke-static {v2}, LD6/c;->h(Ljava/lang/String;)LD6/c;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    sput-object v2, LC6/a;->g:LD6/c;

    .line 48
    .line 49
    const-string v2, "0000ffff"

    .line 50
    .line 51
    invoke-static {v2}, LD6/c;->h(Ljava/lang/String;)LD6/c;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sput-object v2, LC6/a;->h:LD6/c;

    .line 56
    .line 57
    const-string v2, "ffff0000"

    .line 58
    .line 59
    invoke-static {v2}, LD6/c;->h(Ljava/lang/String;)LD6/c;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    sput-object v2, LC6/a;->i:LD6/c;

    .line 64
    .line 65
    const-string v2, "UTF-8"

    .line 66
    .line 67
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    sput-object v2, LC6/a;->j:Ljava/nio/charset/Charset;

    .line 72
    .line 73
    const-string v2, "ISO-8859-1"

    .line 74
    .line 75
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    sput-object v2, LC6/a;->k:Ljava/nio/charset/Charset;

    .line 80
    .line 81
    const-string v2, "UTF-16BE"

    .line 82
    .line 83
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    sput-object v2, LC6/a;->l:Ljava/nio/charset/Charset;

    .line 88
    .line 89
    const-string v2, "UTF-16LE"

    .line 90
    .line 91
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    sput-object v2, LC6/a;->m:Ljava/nio/charset/Charset;

    .line 96
    .line 97
    const-string v2, "UTF-32BE"

    .line 98
    .line 99
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    sput-object v2, LC6/a;->n:Ljava/nio/charset/Charset;

    .line 104
    .line 105
    const-string v2, "UTF-32LE"

    .line 106
    .line 107
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    sput-object v2, LC6/a;->o:Ljava/nio/charset/Charset;

    .line 112
    .line 113
    const-string v2, "GMT"

    .line 114
    .line 115
    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    sput-object v2, LC6/a;->p:Ljava/util/TimeZone;

    .line 120
    .line 121
    new-instance v2, LC6/a$a;

    .line 122
    .line 123
    invoke-direct {v2}, LC6/a$a;-><init>()V

    .line 124
    .line 125
    .line 126
    sput-object v2, LC6/a;->q:Ljava/util/Comparator;

    .line 127
    .line 128
    :try_start_0
    const-string v2, "addSuppressed"

    .line 129
    .line 130
    const/4 v4, 0x1

    .line 131
    new-array v4, v4, [Ljava/lang/Class;

    .line 132
    .line 133
    aput-object v0, v4, v1

    .line 134
    .line 135
    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 136
    .line 137
    .line 138
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    :catch_0
    sput-object v3, LC6/a;->r:Ljava/lang/reflect/Method;

    .line 140
    .line 141
    const-string v0, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"

    .line 142
    .line 143
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    sput-object v0, LC6/a;->s:Ljava/util/regex/Pattern;

    .line 148
    .line 149
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    const-string v0, "["

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const-string v0, "]"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v2, 0x1

    .line 31
    sub-int/2addr v0, v2

    .line 32
    invoke-static {p0, v2, v0}, LC6/a;->g(Ljava/lang/String;II)Ljava/net/InetAddress;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-static {p0, v0, v2}, LC6/a;->g(Ljava/lang/String;II)Ljava/net/InetAddress;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    if-nez v0, :cond_1

    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_1
    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    array-length v1, v0

    .line 54
    const/16 v2, 0x10

    .line 55
    .line 56
    if-ne v1, v2, :cond_2

    .line 57
    .line 58
    invoke-static {v0}, LC6/a;->j([B)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    .line 64
    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v2, "Invalid IPv6 address: \'"

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p0, "\'"

    .line 79
    .line 80
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    throw v0

    .line 91
    :cond_3
    :try_start_0
    invoke-static {p0}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    return-object v1

    .line 108
    :cond_4
    invoke-static {p0}, LC6/a;->d(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_5
    return-object p0

    .line 116
    :catch_0
    return-object v1
.end method

.method public static b(JJJ)V
    .locals 4

    .line 1
    or-long v0, p2, p4

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    cmp-long v0, p2, p0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    sub-long/2addr p0, p2

    .line 14
    cmp-long p0, p0, p4

    .line 15
    .line 16
    if-ltz p0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw p0
.end method

.method public static c(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catch_0
    move-exception p0

    .line 8
    throw p0

    .line 9
    :catch_1
    :cond_0
    :goto_0
    return-void
.end method

.method public static d(Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/16 v3, 0x1f

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-le v2, v3, :cond_2

    .line 17
    .line 18
    const/16 v3, 0x7f

    .line 19
    .line 20
    if-lt v2, v3, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const-string v3, " #%/:?@[\\]"

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/lang/String;->indexOf(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, -0x1

    .line 30
    if-eq v2, v3, :cond_1

    .line 31
    .line 32
    return v4

    .line 33
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    :goto_1
    return v4

    .line 37
    :cond_3
    return v0
.end method

.method public static e(C)I
    .locals 2

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x39

    .line 6
    .line 7
    if-gt p0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, 0x61

    .line 12
    .line 13
    if-lt p0, v0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x66

    .line 16
    .line 17
    if-gt p0, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x57

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const/16 v0, 0x41

    .line 23
    .line 24
    if-lt p0, v0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x46

    .line 27
    .line 28
    if-gt p0, v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 p0, p0, -0x37

    .line 31
    .line 32
    return p0

    .line 33
    :cond_2
    const/4 p0, -0x1

    .line 34
    return p0
.end method

.method public static f(Ljava/lang/String;II[BI)Z
    .locals 7

    .line 1
    move v0, p4

    .line 2
    :goto_0
    const/4 v1, 0x0

    .line 3
    if-ge p1, p2, :cond_8

    .line 4
    .line 5
    array-length v2, p3

    .line 6
    if-ne v0, v2, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    if-eq v0, p4, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/16 v3, 0x2e

    .line 16
    .line 17
    if-eq v2, v3, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    :cond_2
    move v2, p1

    .line 23
    move v3, v1

    .line 24
    :goto_1
    if-ge v2, p2, :cond_6

    .line 25
    .line 26
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/16 v5, 0x30

    .line 31
    .line 32
    if-lt v4, v5, :cond_6

    .line 33
    .line 34
    const/16 v6, 0x39

    .line 35
    .line 36
    if-le v4, v6, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    if-nez v3, :cond_4

    .line 40
    .line 41
    if-eq p1, v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    mul-int/lit8 v3, v3, 0xa

    .line 45
    .line 46
    add-int/2addr v3, v4

    .line 47
    sub-int/2addr v3, v5

    .line 48
    const/16 v4, 0xff

    .line 49
    .line 50
    if-le v3, v4, :cond_5

    .line 51
    .line 52
    return v1

    .line 53
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_6
    :goto_2
    sub-int p1, v2, p1

    .line 57
    .line 58
    if-nez p1, :cond_7

    .line 59
    .line 60
    return v1

    .line 61
    :cond_7
    add-int/lit8 p1, v0, 0x1

    .line 62
    .line 63
    int-to-byte v1, v3

    .line 64
    aput-byte v1, p3, v0

    .line 65
    .line 66
    move v0, p1

    .line 67
    move p1, v2

    .line 68
    goto :goto_0

    .line 69
    :cond_8
    add-int/lit8 p4, p4, 0x4

    .line 70
    .line 71
    if-eq v0, p4, :cond_9

    .line 72
    .line 73
    return v1

    .line 74
    :cond_9
    const/4 p0, 0x1

    .line 75
    return p0
.end method

.method public static g(Ljava/lang/String;II)Ljava/net/InetAddress;
    .locals 12

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, -0x1

    .line 7
    move v4, v2

    .line 8
    move v5, v3

    .line 9
    move v6, v5

    .line 10
    :goto_0
    const/4 v7, 0x0

    .line 11
    if-ge p1, p2, :cond_c

    .line 12
    .line 13
    if-ne v4, v0, :cond_0

    .line 14
    .line 15
    return-object v7

    .line 16
    :cond_0
    add-int/lit8 v8, p1, 0x2

    .line 17
    .line 18
    const/4 v9, 0x2

    .line 19
    if-gt v8, p2, :cond_3

    .line 20
    .line 21
    const-string v10, "::"

    .line 22
    .line 23
    invoke-virtual {p0, p1, v10, v2, v9}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 24
    .line 25
    .line 26
    move-result v10

    .line 27
    if-eqz v10, :cond_3

    .line 28
    .line 29
    if-eq v5, v3, :cond_1

    .line 30
    .line 31
    return-object v7

    .line 32
    :cond_1
    add-int/lit8 v4, v4, 0x2

    .line 33
    .line 34
    move v5, v4

    .line 35
    if-ne v8, p2, :cond_2

    .line 36
    .line 37
    goto :goto_5

    .line 38
    :cond_2
    move v6, v8

    .line 39
    goto :goto_1

    .line 40
    :cond_3
    if-eqz v4, :cond_4

    .line 41
    .line 42
    const-string v8, ":"

    .line 43
    .line 44
    const/4 v10, 0x1

    .line 45
    invoke-virtual {p0, p1, v8, v2, v10}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    if-eqz v8, :cond_5

    .line 50
    .line 51
    add-int/lit8 p1, p1, 0x1

    .line 52
    .line 53
    :cond_4
    move v6, p1

    .line 54
    goto :goto_1

    .line 55
    :cond_5
    const-string v8, "."

    .line 56
    .line 57
    invoke-virtual {p0, p1, v8, v2, v10}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_7

    .line 62
    .line 63
    add-int/lit8 p1, v4, -0x2

    .line 64
    .line 65
    invoke-static {p0, v6, p2, v1, p1}, LC6/a;->f(Ljava/lang/String;II[BI)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_6

    .line 70
    .line 71
    return-object v7

    .line 72
    :cond_6
    add-int/lit8 v4, v4, 0x2

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_7
    return-object v7

    .line 76
    :goto_1
    move v8, v2

    .line 77
    move p1, v6

    .line 78
    :goto_2
    if-ge p1, p2, :cond_9

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    invoke-static {v10}, LC6/a;->e(C)I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-ne v10, v3, :cond_8

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_8
    shl-int/lit8 v8, v8, 0x4

    .line 92
    .line 93
    add-int/2addr v8, v10

    .line 94
    add-int/lit8 p1, p1, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_9
    :goto_3
    sub-int v10, p1, v6

    .line 98
    .line 99
    if-eqz v10, :cond_b

    .line 100
    .line 101
    const/4 v11, 0x4

    .line 102
    if-le v10, v11, :cond_a

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_a
    add-int/lit8 v7, v4, 0x1

    .line 106
    .line 107
    ushr-int/lit8 v10, v8, 0x8

    .line 108
    .line 109
    and-int/lit16 v10, v10, 0xff

    .line 110
    .line 111
    int-to-byte v10, v10

    .line 112
    aput-byte v10, v1, v4

    .line 113
    .line 114
    add-int/2addr v4, v9

    .line 115
    and-int/lit16 v8, v8, 0xff

    .line 116
    .line 117
    int-to-byte v8, v8

    .line 118
    aput-byte v8, v1, v7

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_b
    :goto_4
    return-object v7

    .line 122
    :cond_c
    :goto_5
    if-eq v4, v0, :cond_e

    .line 123
    .line 124
    if-ne v5, v3, :cond_d

    .line 125
    .line 126
    return-object v7

    .line 127
    :cond_d
    sub-int p0, v4, v5

    .line 128
    .line 129
    rsub-int/lit8 p1, p0, 0x10

    .line 130
    .line 131
    invoke-static {v1, v5, v1, p1, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 132
    .line 133
    .line 134
    sub-int/2addr v0, v4

    .line 135
    add-int/2addr v0, v5

    .line 136
    invoke-static {v1, v5, v0, v2}, Ljava/util/Arrays;->fill([BIIB)V

    .line 137
    .line 138
    .line 139
    :cond_e
    :try_start_0
    invoke-static {v1}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 140
    .line 141
    .line 142
    move-result-object p0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    return-object p0

    .line 144
    :catch_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 145
    .line 146
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 147
    .line 148
    .line 149
    throw p0
.end method

.method public static h(Ljava/lang/String;IIC)I
    .locals 1

    .line 1
    :goto_0
    if-ge p1, p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ne v0, p3, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    return p2
.end method

.method public static i(Ljava/lang/String;IILjava/lang/String;)I
    .locals 2

    .line 1
    :goto_0
    if-ge p1, p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p3, v0}, Ljava/lang/String;->indexOf(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    return p1

    .line 15
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    return p2
.end method

.method public static j([B)Ljava/lang/String;
    .locals 8

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    array-length v4, p0

    .line 6
    const/16 v5, 0x10

    .line 7
    .line 8
    if-ge v2, v4, :cond_2

    .line 9
    .line 10
    move v4, v2

    .line 11
    :goto_1
    if-ge v4, v5, :cond_0

    .line 12
    .line 13
    aget-byte v6, p0, v4

    .line 14
    .line 15
    if-nez v6, :cond_0

    .line 16
    .line 17
    add-int/lit8 v6, v4, 0x1

    .line 18
    .line 19
    aget-byte v6, p0, v6

    .line 20
    .line 21
    if-nez v6, :cond_0

    .line 22
    .line 23
    add-int/lit8 v4, v4, 0x2

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    sub-int v5, v4, v2

    .line 27
    .line 28
    if-le v5, v3, :cond_1

    .line 29
    .line 30
    const/4 v6, 0x4

    .line 31
    if-lt v5, v6, :cond_1

    .line 32
    .line 33
    move v0, v2

    .line 34
    move v3, v5

    .line 35
    :cond_1
    add-int/lit8 v2, v4, 0x2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    new-instance v2, LD6/a;

    .line 39
    .line 40
    invoke-direct {v2}, LD6/a;-><init>()V

    .line 41
    .line 42
    .line 43
    :cond_3
    :goto_2
    array-length v4, p0

    .line 44
    if-ge v1, v4, :cond_6

    .line 45
    .line 46
    const/16 v4, 0x3a

    .line 47
    .line 48
    if-ne v1, v0, :cond_4

    .line 49
    .line 50
    invoke-virtual {v2, v4}, LD6/a;->D(I)LD6/a;

    .line 51
    .line 52
    .line 53
    add-int/2addr v1, v3

    .line 54
    if-ne v1, v5, :cond_3

    .line 55
    .line 56
    invoke-virtual {v2, v4}, LD6/a;->D(I)LD6/a;

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    if-lez v1, :cond_5

    .line 61
    .line 62
    invoke-virtual {v2, v4}, LD6/a;->D(I)LD6/a;

    .line 63
    .line 64
    .line 65
    :cond_5
    aget-byte v4, p0, v1

    .line 66
    .line 67
    and-int/lit16 v4, v4, 0xff

    .line 68
    .line 69
    shl-int/lit8 v4, v4, 0x8

    .line 70
    .line 71
    add-int/lit8 v6, v1, 0x1

    .line 72
    .line 73
    aget-byte v6, p0, v6

    .line 74
    .line 75
    and-int/lit16 v6, v6, 0xff

    .line 76
    .line 77
    or-int/2addr v4, v6

    .line 78
    int-to-long v6, v4

    .line 79
    invoke-virtual {v2, v6, v7}, LD6/a;->E(J)LD6/a;

    .line 80
    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x2

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    invoke-virtual {v2}, LD6/a;->u()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method

.method public static k(Ljava/lang/String;II)I
    .locals 2

    .line 1
    :goto_0
    if-ge p1, p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x9

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0xc

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    const/16 v1, 0xd

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    if-eq v0, v1, :cond_0

    .line 26
    .line 27
    return p1

    .line 28
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return p2
.end method

.method public static l(Ljava/lang/String;II)I
    .locals 2

    .line 1
    add-int/lit8 p2, p2, -0x1

    .line 2
    .line 3
    :goto_0
    if-lt p2, p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x9

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    const/16 v1, 0xa

    .line 14
    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    const/16 v1, 0xc

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    const/16 v1, 0xd

    .line 22
    .line 23
    if-eq v0, v1, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    add-int/lit8 p2, p2, 0x1

    .line 30
    .line 31
    return p2

    .line 32
    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return p1
.end method
