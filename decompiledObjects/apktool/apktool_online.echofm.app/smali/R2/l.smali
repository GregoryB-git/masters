.class public final LR2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/EnumMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, LR2/q3$a;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, LR2/l;->a:Ljava/util/EnumMap;

    return-void
.end method

.method public constructor <init>(Ljava/util/EnumMap;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, LR2/q3$a;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, LR2/l;->a:Ljava/util/EnumMap;

    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)LR2/l;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/EnumMap;

    .line 2
    .line 3
    const-class v1, LR2/q3$a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {}, LR2/q3$a;->values()[LR2/q3$a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    array-length v2, v2

    .line 17
    if-lt v1, v2, :cond_2

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/16 v3, 0x31

    .line 25
    .line 26
    if-eq v2, v3, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-static {}, LR2/q3$a;->values()[LR2/q3$a;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    array-length v3, v2

    .line 34
    const/4 v4, 0x1

    .line 35
    :goto_0
    if-ge v1, v3, :cond_1

    .line 36
    .line 37
    aget-object v5, v2, v1

    .line 38
    .line 39
    add-int/lit8 v6, v4, 0x1

    .line 40
    .line 41
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-static {v4}, LR2/k;->e(C)LR2/k;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v0, v5, v4}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    move v4, v6

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    new-instance p0, LR2/l;

    .line 57
    .line 58
    invoke-direct {p0, v0}, LR2/l;-><init>(Ljava/util/EnumMap;)V

    .line 59
    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_2
    :goto_1
    new-instance p0, LR2/l;

    .line 63
    .line 64
    invoke-direct {p0}, LR2/l;-><init>()V

    .line 65
    .line 66
    .line 67
    return-object p0
.end method


# virtual methods
.method public final a(LR2/q3$a;)LR2/k;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/l;->a:Ljava/util/EnumMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LR2/k;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    sget-object p1, LR2/k;->p:LR2/k;

    .line 12
    .line 13
    :cond_0
    return-object p1
.end method

.method public final c(LR2/q3$a;I)V
    .locals 2

    .line 1
    sget-object v0, LR2/k;->p:LR2/k;

    .line 2
    .line 3
    const/16 v1, -0x14

    .line 4
    .line 5
    if-eq p2, v1, :cond_2

    .line 6
    .line 7
    const/16 v1, -0xa

    .line 8
    .line 9
    if-eq p2, v1, :cond_1

    .line 10
    .line 11
    if-eqz p2, :cond_2

    .line 12
    .line 13
    const/16 v1, 0x1e

    .line 14
    .line 15
    if-eq p2, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, LR2/k;->t:LR2/k;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object v0, LR2/k;->s:LR2/k;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    sget-object v0, LR2/k;->u:LR2/k;

    .line 25
    .line 26
    :goto_0
    iget-object p2, p0, LR2/l;->a:Ljava/util/EnumMap;

    .line 27
    .line 28
    invoke-virtual {p2, p1, v0}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final d(LR2/q3$a;LR2/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR2/l;->a:Ljava/util/EnumMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "1"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, LR2/q3$a;->values()[LR2/q3$a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    array-length v2, v1

    .line 13
    const/4 v3, 0x0

    .line 14
    :goto_0
    if-ge v3, v2, :cond_1

    .line 15
    .line 16
    aget-object v4, v1, v3

    .line 17
    .line 18
    iget-object v5, p0, LR2/l;->a:Ljava/util/EnumMap;

    .line 19
    .line 20
    invoke-virtual {v5, v4}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, LR2/k;

    .line 25
    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    sget-object v4, LR2/k;->p:LR2/k;

    .line 29
    .line 30
    :cond_0
    invoke-static {v4}, LR2/k;->c(LR2/k;)C

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
.end method
