.class public final Lx0/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/S;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final o:Lx0/S;

.field public final p:LX2/v;


# direct methods
.method public constructor <init>(Lx0/S;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/i$a;->o:Lx0/S;

    .line 5
    .line 6
    invoke-static {p2}, LX2/v;->U(Ljava/util/Collection;)LX2/v;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lx0/i$a;->p:LX2/v;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()LX2/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/i$a;->p:LX2/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/i$a;->o:Lx0/S;

    .line 2
    .line 3
    invoke-interface {v0}, Lx0/S;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c()J
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/i$a;->o:Lx0/S;

    .line 2
    .line 3
    invoke-interface {v0}, Lx0/S;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/i$a;->o:Lx0/S;

    .line 2
    .line 3
    invoke-interface {v0}, Lx0/S;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public g(Lk0/y0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/i$a;->o:Lx0/S;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lx0/S;->g(Lk0/y0;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public h(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/i$a;->o:Lx0/S;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lx0/S;->h(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
