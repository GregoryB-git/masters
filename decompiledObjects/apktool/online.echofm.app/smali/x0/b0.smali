.class public abstract Lx0/b0;
.super Lx0/h;
.source "SourceFile"


# static fields
.field public static final l:Ljava/lang/Void;


# instance fields
.field public final k:Lx0/x;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lx0/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lx0/h;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx0/b0;->k:Lx0/x;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic F(Ljava/lang/Object;Lx0/x$b;)Lx0/x$b;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lx0/b0;->M(Ljava/lang/Void;Lx0/x$b;)Lx0/x$b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic G(Ljava/lang/Object;JLx0/x$b;)J
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lx0/b0;->P(Ljava/lang/Void;JLx0/x$b;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public bridge synthetic H(Ljava/lang/Object;I)I
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lx0/b0;->R(Ljava/lang/Void;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic J(Ljava/lang/Object;Lx0/x;Ld0/I;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lx0/b0;->T(Ljava/lang/Void;Lx0/x;Ld0/I;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final M(Ljava/lang/Void;Lx0/x$b;)Lx0/x$b;
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lx0/b0;->N(Lx0/x$b;)Lx0/x$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public N(Lx0/x$b;)Lx0/x$b;
    .locals 0

    .line 1
    return-object p1
.end method

.method public O(JLx0/x$b;)J
    .locals 0

    .line 1
    return-wide p1
.end method

.method public final P(Ljava/lang/Void;JLx0/x$b;)J
    .locals 0

    .line 1
    invoke-virtual {p0, p2, p3, p4}, Lx0/b0;->O(JLx0/x$b;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method

.method public Q(I)I
    .locals 0

    .line 1
    return p1
.end method

.method public final R(Ljava/lang/Void;I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lx0/b0;->Q(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public abstract S(Ld0/I;)V
.end method

.method public final T(Ljava/lang/Void;Lx0/x;Ld0/I;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p3}, Lx0/b0;->S(Ld0/I;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final U()V
    .locals 2

    .line 1
    sget-object v0, Lx0/b0;->l:Ljava/lang/Void;

    .line 2
    .line 3
    iget-object v1, p0, Lx0/b0;->k:Lx0/x;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lx0/h;->K(Ljava/lang/Object;Lx0/x;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public V()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lx0/b0;->U()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public a()Ld0/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/b0;->k:Lx0/x;

    .line 2
    .line 3
    invoke-interface {v0}, Lx0/x;->a()Ld0/u;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/b0;->k:Lx0/x;

    .line 2
    .line 3
    invoke-interface {v0}, Lx0/x;->i()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j()Ld0/I;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/b0;->k:Lx0/x;

    .line 2
    .line 3
    invoke-interface {v0}, Lx0/x;->j()Ld0/I;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public l(Ld0/u;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/b0;->k:Lx0/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lx0/x;->l(Ld0/u;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final z(Li0/y;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lx0/h;->z(Li0/y;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lx0/b0;->V()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
