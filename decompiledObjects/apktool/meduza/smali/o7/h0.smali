.class public final Lo7/h0;
.super Lo7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lo7/c<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public transient f:Ln7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/q<",
            "+",
            "Ljava/util/List<",
            "TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/TreeMap;Lo7/g0;)V
    .locals 0

    invoke-direct {p0, p1}, Lo7/c;-><init>(Ljava/util/TreeMap;)V

    iput-object p2, p0, Lo7/h0;->f:Ln7/q;

    return-void
.end method


# virtual methods
.method public final c()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lo7/d;->d:Ljava/util/Map;

    instance-of v1, v0, Ljava/util/NavigableMap;

    if-eqz v1, :cond_0

    new-instance v0, Lo7/d$e;

    iget-object v1, p0, Lo7/d;->d:Ljava/util/Map;

    check-cast v1, Ljava/util/NavigableMap;

    invoke-direct {v0, p0, v1}, Lo7/d$e;-><init>(Lo7/d;Ljava/util/NavigableMap;)V

    goto :goto_0

    :cond_0
    instance-of v0, v0, Ljava/util/SortedMap;

    if-eqz v0, :cond_1

    new-instance v0, Lo7/d$h;

    iget-object v1, p0, Lo7/d;->d:Ljava/util/Map;

    check-cast v1, Ljava/util/SortedMap;

    invoke-direct {v0, p0, v1}, Lo7/d$h;-><init>(Lo7/d;Ljava/util/SortedMap;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lo7/d$b;

    iget-object v1, p0, Lo7/d;->d:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Lo7/d$b;-><init>(Lo7/d;Ljava/util/Map;)V

    :goto_0
    return-object v0
.end method

.method public final d()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lo7/d;->d:Ljava/util/Map;

    instance-of v1, v0, Ljava/util/NavigableMap;

    if-eqz v1, :cond_0

    new-instance v0, Lo7/d$f;

    iget-object v1, p0, Lo7/d;->d:Ljava/util/Map;

    check-cast v1, Ljava/util/NavigableMap;

    invoke-direct {v0, p0, v1}, Lo7/d$f;-><init>(Lo7/d;Ljava/util/NavigableMap;)V

    goto :goto_0

    :cond_0
    instance-of v0, v0, Ljava/util/SortedMap;

    if-eqz v0, :cond_1

    new-instance v0, Lo7/d$i;

    iget-object v1, p0, Lo7/d;->d:Ljava/util/Map;

    check-cast v1, Ljava/util/SortedMap;

    invoke-direct {v0, p0, v1}, Lo7/d$i;-><init>(Lo7/d;Ljava/util/SortedMap;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lo7/d$d;

    iget-object v1, p0, Lo7/d;->d:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Lo7/d$d;-><init>(Lo7/d;Ljava/util/Map;)V

    :goto_0
    return-object v0
.end method
