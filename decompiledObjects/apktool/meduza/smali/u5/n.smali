.class public final Lu5/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu5/d;


# instance fields
.field public final a:J

.field public final b:Ljava/util/TreeSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeSet<",
            "Lu5/g;",
            ">;"
        }
    .end annotation
.end field

.field public c:J


# direct methods
.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lu5/n;->a:J

    new-instance p1, Ljava/util/TreeSet;

    new-instance p2, Lq5/i;

    const/4 v0, 0x2

    invoke-direct {p2, v0}, Lq5/i;-><init>(I)V

    invoke-direct {p1, p2}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iput-object p1, p0, Lu5/n;->b:Ljava/util/TreeSet;

    return-void
.end method


# virtual methods
.method public final a(Lu5/g;)V
    .locals 4

    iget-object v0, p0, Lu5/n;->b:Ljava/util/TreeSet;

    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->remove(Ljava/lang/Object;)Z

    iget-wide v0, p0, Lu5/n;->c:J

    iget-wide v2, p1, Lu5/g;->c:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lu5/n;->c:J

    return-void
.end method

.method public final b(Lu5/a;J)V
    .locals 2

    const-wide/16 v0, -0x1

    cmp-long v0, p2, v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lu5/n;->f(Lu5/a;J)V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final d(Lu5/a;Lu5/g;)V
    .locals 4

    iget-object v0, p0, Lu5/n;->b:Ljava/util/TreeSet;

    invoke-virtual {v0, p2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    iget-wide v0, p0, Lu5/n;->c:J

    iget-wide v2, p2, Lu5/g;->c:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lu5/n;->c:J

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lu5/n;->f(Lu5/a;J)V

    return-void
.end method

.method public final e(Lu5/a;Lu5/g;Lu5/r;)V
    .locals 0

    invoke-virtual {p0, p2}, Lu5/n;->a(Lu5/g;)V

    invoke-virtual {p0, p1, p3}, Lu5/n;->d(Lu5/a;Lu5/g;)V

    return-void
.end method

.method public final f(Lu5/a;J)V
    .locals 4

    :goto_0
    iget-wide v0, p0, Lu5/n;->c:J

    add-long/2addr v0, p2

    iget-wide v2, p0, Lu5/n;->a:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lu5/n;->b:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lu5/n;->b:Ljava/util/TreeSet;

    invoke-virtual {v0}, Ljava/util/TreeSet;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu5/g;

    invoke-interface {p1, v0}, Lu5/a;->g(Lu5/g;)V

    goto :goto_0

    :cond_0
    return-void
.end method
