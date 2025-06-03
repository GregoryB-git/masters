.class public final Lh5/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh5/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:J

.field public final b:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Lh5/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLo7/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lh5/d$b;->a:J

    iput-object p3, p0, Lh5/d$b;->b:Lo7/t;

    return-void
.end method


# virtual methods
.method public final f(J)I
    .locals 2

    iget-wide v0, p0, Lh5/d$b;->a:J

    cmp-long p1, v0, p1

    if-lez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public final g(I)J
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lx6/b;->q(Z)V

    iget-wide v0, p0, Lh5/d$b;->a:J

    return-wide v0
.end method

.method public final h(J)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lh5/a;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Lh5/d$b;->a:J

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    iget-object p1, p0, Lh5/d$b;->b:Lo7/t;

    goto :goto_0

    :cond_0
    sget-object p1, Lo7/t;->b:Lo7/t$b;

    sget-object p1, Lo7/l0;->e:Lo7/l0;

    :goto_0
    return-object p1
.end method

.method public final i()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
