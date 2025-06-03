.class public Lx0/L$a;
.super Lx0/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/L;->D()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic f:Lx0/L;


# direct methods
.method public constructor <init>(Lx0/L;Ld0/I;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx0/L$a;->f:Lx0/L;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lx0/p;-><init>(Ld0/I;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public g(ILd0/I$b;Z)Ld0/I$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lx0/p;->g(ILd0/I$b;Z)Ld0/I$b;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p2, Ld0/I$b;->f:Z

    .line 6
    .line 7
    return-object p2
.end method

.method public o(ILd0/I$c;J)Ld0/I$c;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lx0/p;->o(ILd0/I$c;J)Ld0/I$c;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p2, Ld0/I$c;->k:Z

    .line 6
    .line 7
    return-object p2
.end method
