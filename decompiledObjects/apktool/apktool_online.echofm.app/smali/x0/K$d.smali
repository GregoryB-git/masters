.class public final Lx0/K$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/Q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final o:I

.field public final synthetic p:Lx0/K;


# direct methods
.method public constructor <init>(Lx0/K;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx0/K$d;->p:Lx0/K;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lx0/K$d;->o:I

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic b(Lx0/K$d;)I
    .locals 0

    .line 1
    iget p0, p0, Lx0/K$d;->o:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/K$d;->p:Lx0/K;

    .line 2
    .line 3
    iget v1, p0, Lx0/K$d;->o:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lx0/K;->Z(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/K$d;->p:Lx0/K;

    .line 2
    .line 3
    iget v1, p0, Lx0/K$d;->o:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lx0/K;->R(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public j(Lk0/v0;Lj0/i;I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/K$d;->p:Lx0/K;

    .line 2
    .line 3
    iget v1, p0, Lx0/K$d;->o:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2, p3}, Lx0/K;->f0(ILk0/v0;Lj0/i;I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public m(J)I
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/K$d;->p:Lx0/K;

    .line 2
    .line 3
    iget v1, p0, Lx0/K$d;->o:I

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2}, Lx0/K;->j0(IJ)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
