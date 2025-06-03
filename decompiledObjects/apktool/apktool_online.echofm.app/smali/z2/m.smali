.class public abstract Lz2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz2/m$a;
    }
.end annotation


# instance fields
.field public final a:[Lx2/d;

.field public final b:Z

.field public final c:I


# direct methods
.method public constructor <init>([Lx2/d;ZI)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz2/m;->a:[Lx2/d;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    :cond_0
    iput-boolean v0, p0, Lz2/m;->b:Z

    .line 13
    .line 14
    iput p3, p0, Lz2/m;->c:I

    .line 15
    .line 16
    return-void
.end method

.method public static a()Lz2/m$a;
    .locals 2

    .line 1
    new-instance v0, Lz2/m$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz2/m$a;-><init>(Lz2/O;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public abstract b(Ly2/a$b;LV2/k;)V
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lz2/m;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lz2/m;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()[Lx2/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/m;->a:[Lx2/d;

    .line 2
    .line 3
    return-object v0
.end method
