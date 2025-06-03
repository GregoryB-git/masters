.class public final Lx0/X;
.super Lx0/p;
.source "SourceFile"


# instance fields
.field public final f:Ld0/u;


# direct methods
.method public constructor <init>(Ld0/I;Ld0/u;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lx0/p;-><init>(Ld0/I;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lx0/X;->f:Ld0/u;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public o(ILd0/I$c;J)Ld0/I$c;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lx0/p;->o(ILd0/I$c;J)Ld0/I$c;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lx0/X;->f:Ld0/u;

    .line 5
    .line 6
    iput-object p1, p2, Ld0/I$c;->c:Ld0/u;

    .line 7
    .line 8
    iget-object p1, p1, Ld0/u;->b:Ld0/u$h;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p1, Ld0/u$h;->h:Ljava/lang/Object;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    iput-object p1, p2, Ld0/I$c;->b:Ljava/lang/Object;

    .line 17
    .line 18
    return-object p2
.end method
