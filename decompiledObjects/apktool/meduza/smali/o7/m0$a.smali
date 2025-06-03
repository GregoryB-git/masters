.class public final Lo7/m0$a;
.super Lo7/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo7/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lo7/x<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final transient d:Lo7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/u<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final transient e:[Ljava/lang/Object;

.field public final transient f:I

.field public final transient o:I


# direct methods
.method public constructor <init>(Lo7/u;[Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lo7/x;-><init>()V

    iput-object p1, p0, Lo7/m0$a;->d:Lo7/u;

    iput-object p2, p0, Lo7/m0$a;->e:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lo7/m0$a;->f:I

    iput p3, p0, Lo7/m0$a;->o:I

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lo7/m0$a;->d:Lo7/u;

    invoke-virtual {v2, v0}, Lo7/u;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final h(I[Ljava/lang/Object;)I
    .locals 1

    invoke-virtual {p0}, Lo7/x;->a()Lo7/t;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo7/t;->h(I[Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lo7/m0$a;->n()Lo7/x0;

    move-result-object v0

    return-object v0
.end method

.method public final m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final n()Lo7/x0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo7/x0<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lo7/x;->a()Lo7/t;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo7/t;->r(I)Lo7/t$b;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lo7/t;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo7/t<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lo7/m0$a$a;

    invoke-direct {v0, p0}, Lo7/m0$a$a;-><init>(Lo7/m0$a;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lo7/m0$a;->o:I

    return v0
.end method
