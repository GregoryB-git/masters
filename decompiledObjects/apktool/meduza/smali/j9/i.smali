.class public final Lj9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lj9/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lv4/d;

.field public static final c:Lt8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/e<",
            "Lj9/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lj9/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv4/d;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lv4/d;-><init>(I)V

    sput-object v0, Lj9/i;->b:Lv4/d;

    new-instance v1, Lt8/e;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lt8/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    sput-object v1, Lj9/i;->c:Lt8/e;

    return-void
.end method

.method public constructor <init>(Lj9/o;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lj9/i;->l(Lj9/o;)Z

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "Not a document key path: %s"

    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    iput-object p1, p0, Lj9/i;->a:Lj9/o;

    return-void
.end method

.method public static g()Lj9/i;
    .locals 3

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lj9/i;

    .line 6
    .line 7
    sget-object v2, Lj9/o;->b:Lj9/o;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    sget-object v0, Lj9/o;->b:Lj9/o;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v2, Lj9/o;

    .line 19
    .line 20
    invoke-direct {v2, v0}, Lj9/o;-><init>(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    move-object v0, v2

    .line 24
    :goto_0
    invoke-direct {v1, v0}, Lj9/i;-><init>(Lj9/o;)V

    .line 25
    .line 26
    .line 27
    return-object v1
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

.method public static h(Ljava/lang/String;)Lj9/i;
    .locals 5

    invoke-static {p0}, Lj9/o;->t(Ljava/lang/String;)Lj9/o;

    move-result-object p0

    invoke-virtual {p0}, Lj9/e;->q()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-le v0, v2, :cond_0

    invoke-virtual {p0, v3}, Lj9/e;->n(I)Ljava/lang/String;

    move-result-object v0

    const-string v4, "projects"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lj9/e;->n(I)Ljava/lang/String;

    move-result-object v0

    const-string v4, "databases"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v2}, Lj9/e;->n(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "documents"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v3

    const-string v2, "Tried to parse an invalid key: %s"

    invoke-static {v2, v0, v1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj9/e;->r()Lj9/e;

    move-result-object p0

    check-cast p0, Lj9/o;

    new-instance v0, Lj9/i;

    invoke-direct {v0, p0}, Lj9/i;-><init>(Lj9/o;)V

    return-object v0
.end method

.method public static l(Lj9/o;)Z
    .locals 0

    invoke-virtual {p0}, Lj9/e;->q()I

    move-result p0

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lj9/i;

    invoke-virtual {p0, p1}, Lj9/i;->f(Lj9/i;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Lj9/i;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lj9/i;

    iget-object v0, p0, Lj9/i;->a:Lj9/o;

    iget-object p1, p1, Lj9/i;->a:Lj9/o;

    invoke-virtual {v0, p1}, Lj9/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f(Lj9/i;)I
    .locals 1

    iget-object v0, p0, Lj9/i;->a:Lj9/o;

    iget-object p1, p1, Lj9/i;->a:Lj9/o;

    invoke-virtual {v0, p1}, Lj9/e;->i(Lj9/e;)I

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lj9/i;->a:Lj9/o;

    invoke-virtual {v0}, Lj9/e;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Lj9/o;
    .locals 1

    iget-object v0, p0, Lj9/i;->a:Lj9/o;

    invoke-virtual {v0}, Lj9/e;->s()Lj9/e;

    move-result-object v0

    check-cast v0, Lj9/o;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj9/i;->a:Lj9/o;

    invoke-virtual {v0}, Lj9/o;->h()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
