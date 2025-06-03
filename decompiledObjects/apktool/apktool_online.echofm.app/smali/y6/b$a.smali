.class public final Ly6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/l;
.implements Lp6/P0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final o:Lp6/m;

.field public final p:Ljava/lang/Object;

.field public final synthetic q:Ly6/b;


# direct methods
.method public constructor <init>(Ly6/b;Lp6/m;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly6/b$a;->q:Ly6/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ly6/b$a;->o:Lp6/m;

    .line 7
    .line 8
    iput-object p3, p0, Ly6/b$a;->p:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Lu6/C;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/b$a;->o:Lp6/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lp6/m;->a(Lu6/C;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(LV5/t;Lg6/l;)V
    .locals 2

    .line 1
    invoke-static {}, Ly6/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Ly6/b$a;->q:Ly6/b;

    .line 6
    .line 7
    iget-object v1, p0, Ly6/b$a;->p:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Ly6/b$a;->o:Lp6/m;

    .line 13
    .line 14
    new-instance v0, Ly6/b$a$a;

    .line 15
    .line 16
    iget-object v1, p0, Ly6/b$a;->q:Ly6/b;

    .line 17
    .line 18
    invoke-direct {v0, v1, p0}, Ly6/b$a$a;-><init>(Ly6/b;Ly6/b$a;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1, v0}, Lp6/m;->j(Ljava/lang/Object;Lg6/l;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public c(LV5/t;Ljava/lang/Object;Lg6/l;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p3, p0, Ly6/b$a;->q:Ly6/b;

    .line 2
    .line 3
    iget-object v0, p0, Ly6/b$a;->o:Lp6/m;

    .line 4
    .line 5
    new-instance v1, Ly6/b$a$b;

    .line 6
    .line 7
    invoke-direct {v1, p3, p0}, Ly6/b$a$b;-><init>(Ly6/b;Ly6/b$a;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, v1}, Lp6/m;->g(Ljava/lang/Object;Ljava/lang/Object;Lg6/l;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-static {}, Ly6/b;->m()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget-object p3, p0, Ly6/b$a;->q:Ly6/b;

    .line 21
    .line 22
    iget-object v0, p0, Ly6/b$a;->p:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p2, p3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object p1
.end method

.method public d(Lg6/l;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/b$a;->o:Lp6/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp6/m;->d(Lg6/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic g(Ljava/lang/Object;Ljava/lang/Object;Lg6/l;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LV5/t;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Ly6/b$a;->c(LV5/t;Ljava/lang/Object;Lg6/l;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getContext()LX5/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/b$a;->o:Lp6/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp6/m;->getContext()LX5/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic j(Ljava/lang/Object;Lg6/l;)V
    .locals 0

    .line 1
    check-cast p1, LV5/t;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Ly6/b$a;->b(LV5/t;Lg6/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public o(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/b$a;->o:Lp6/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp6/m;->o(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public p(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/b$a;->o:Lp6/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp6/m;->p(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/b$a;->o:Lp6/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lp6/m;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
