.class public abstract Lo7/c;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lo7/d<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/TreeMap;)V
    .locals 0

    invoke-direct {p0, p1}, Lo7/d;-><init>(Ljava/util/TreeMap;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lo7/f;->c:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lo7/f;->c()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lo7/f;->c:Ljava/util/Map;

    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Lo7/f;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
