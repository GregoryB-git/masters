.class public final Ld2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf2/g;


# static fields
.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/util/Set;

.field public static final g:Ld2/a;

.field public static final h:Ld2/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const-string v0, "hts/frbslgiggolai.o/0clgbthfra=snpoo"

    .line 2
    .line 3
    const-string v1, "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ld2/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Ld2/a;->c:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "hts/frbslgigp.ogepscmv/ieo/eaybtho"

    .line 12
    .line 13
    const-string v2, "tp:/ieaeogn-agolai.o/1frlglgc/aclg"

    .line 14
    .line 15
    invoke-static {v1, v2}, Ld2/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sput-object v1, Ld2/a;->d:Ljava/lang/String;

    .line 20
    .line 21
    const-string v2, "AzSCki82AwsLzKd5O8zo"

    .line 22
    .line 23
    const-string v3, "IayckHiZRO1EFl1aGoK"

    .line 24
    .line 25
    invoke-static {v2, v3}, Ld2/e;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sput-object v2, Ld2/a;->e:Ljava/lang/String;

    .line 30
    .line 31
    new-instance v3, Ljava/util/HashSet;

    .line 32
    .line 33
    const-string v4, "proto"

    .line 34
    .line 35
    invoke-static {v4}, Lc2/b;->b(Ljava/lang/String;)Lc2/b;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v5, "json"

    .line 40
    .line 41
    invoke-static {v5}, Lc2/b;->b(Ljava/lang/String;)Lc2/b;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const/4 v6, 0x2

    .line 46
    new-array v6, v6, [Lc2/b;

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    aput-object v4, v6, v7

    .line 50
    .line 51
    const/4 v4, 0x1

    .line 52
    aput-object v5, v6, v4

    .line 53
    .line 54
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    sput-object v3, Ld2/a;->f:Ljava/util/Set;

    .line 66
    .line 67
    new-instance v3, Ld2/a;

    .line 68
    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-direct {v3, v0, v4}, Ld2/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sput-object v3, Ld2/a;->g:Ld2/a;

    .line 74
    .line 75
    new-instance v0, Ld2/a;

    .line 76
    .line 77
    invoke-direct {v0, v1, v2}, Ld2/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    sput-object v0, Ld2/a;->h:Ld2/a;

    .line 81
    .line 82
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld2/a;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ld2/a;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static c([B)Ld2/a;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "UTF-8"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 10
    .line 11
    .line 12
    const-string p0, "1$"

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_3

    .line 19
    .line 20
    const/4 p0, 0x2

    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "\\"

    .line 26
    .line 27
    invoke-static {v1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1, p0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    array-length v1, v0

    .line 36
    if-ne v1, p0, :cond_2

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    aget-object p0, v0, p0

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    aget-object v0, v0, v1

    .line 49
    .line 50
    new-instance v1, Ld2/a;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    :cond_0
    invoke-direct {v1, p0, v0}, Ld2/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    const-string v0, "Missing endpoint in CCTDestination extras"

    .line 66
    .line 67
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p0

    .line 71
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 72
    .line 73
    const-string v0, "Extra is not a valid encoded LegacyFlgDestination"

    .line 74
    .line 75
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p0

    .line 79
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    const-string v0, "Version marker missing from extras"

    .line 82
    .line 83
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, Ld2/a;->f:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()[B
    .locals 4

    .line 1
    iget-object v0, p0, Ld2/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Ld2/a;->a:Ljava/lang/String;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    const/4 v1, 0x4

    .line 12
    new-array v1, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const-string v3, "1$"

    .line 16
    .line 17
    aput-object v3, v1, v2

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    iget-object v3, p0, Ld2/a;->a:Ljava/lang/String;

    .line 21
    .line 22
    aput-object v3, v1, v2

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    const-string v3, "\\"

    .line 26
    .line 27
    aput-object v3, v1, v2

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string v0, ""

    .line 32
    .line 33
    :cond_1
    const/4 v2, 0x3

    .line 34
    aput-object v0, v1, v2

    .line 35
    .line 36
    const-string v0, "%s%s%s%s"

    .line 37
    .line 38
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "UTF-8"

    .line 43
    .line 44
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "cct"

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ld2/a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ld2/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()[B
    .locals 1

    .line 1
    invoke-virtual {p0}, Ld2/a;->b()[B

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
