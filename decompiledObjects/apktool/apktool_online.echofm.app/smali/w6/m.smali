.class public final Lw6/m;
.super Lp6/F;
.source "SourceFile"


# static fields
.field public static final q:Lw6/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw6/m;

    .line 2
    .line 3
    invoke-direct {v0}, Lw6/m;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw6/m;->q:Lw6/m;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lp6/F;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public E(LX5/g;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    sget-object p1, Lw6/c;->w:Lw6/c;

    .line 2
    .line 3
    sget-object v0, Lw6/l;->h:Lw6/i;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, p2, v0, v1}, Lw6/f;->I(Ljava/lang/Runnable;Lw6/i;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public G(I)Lp6/F;
    .locals 1

    .line 1
    invoke-static {p1}, Lu6/n;->a(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Lw6/l;->d:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lp6/F;->G(I)Lp6/F;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
