.class public final Ld9/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ld9/t0;

.field public static final d:Ld9/t0;


# instance fields
.field public final a:Z

.field public final b:Lk9/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld9/t0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld9/t0;-><init>(ZLk9/d;)V

    sput-object v0, Ld9/t0;->c:Ld9/t0;

    new-instance v0, Ld9/t0;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v2}, Ld9/t0;-><init>(ZLk9/d;)V

    sput-object v0, Ld9/t0;->d:Ld9/t0;

    return-void
.end method

.method public constructor <init>(ZLk9/d;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Cannot specify a fieldMask for non-merge sets()"

    invoke-static {v2, v1, v0}, Lx6/b;->p(Ljava/lang/String;Z[Ljava/lang/Object;)V

    iput-boolean p1, p0, Ld9/t0;->a:Z

    iput-object p2, p0, Ld9/t0;->b:Lk9/d;

    return-void
.end method

.method public static a(Ljava/util/List;)Ld9/t0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld9/n;",
            ">;)",
            "Ld9/t0;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ld9/n;

    .line 21
    .line 22
    iget-object v1, v1, Ld9/n;->a:Lj9/l;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance p0, Ld9/t0;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    new-instance v2, Lk9/d;

    .line 32
    .line 33
    invoke-direct {v2, v0}, Lk9/d;-><init>(Ljava/util/Set;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, v1, v2}, Ld9/t0;-><init>(ZLk9/d;)V

    .line 37
    .line 38
    .line 39
    return-object p0
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
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    const-class v2, Ld9/t0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ld9/t0;

    iget-boolean v2, p0, Ld9/t0;->a:Z

    iget-boolean v3, p1, Ld9/t0;->a:Z

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Ld9/t0;->b:Lk9/d;

    iget-object p1, p1, Ld9/t0;->b:Lk9/d;

    if-eqz v2, :cond_3

    invoke-virtual {v2, p1}, Lk9/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_3
    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    move v0, v1

    :goto_0
    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Ld9/t0;->a:Z

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ld9/t0;->b:Lk9/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lk9/d;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method
