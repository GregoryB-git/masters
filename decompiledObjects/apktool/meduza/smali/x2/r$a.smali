.class public final Lx2/r$a;
.super Lp1/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx2/r;-><init>(Lp1/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp1/d;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lp1/j;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lp1/d;-><init>(Lp1/j;I)V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    return-object v0
.end method

.method public final e(Lt1/f;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lx2/p;

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Lt1/d;->d0(I)V

    const/4 p2, 0x0

    invoke-static {p2}, Landroidx/work/c;->e(Landroidx/work/c;)[B

    move-result-object p2

    const/4 v0, 0x2

    if-nez p2, :cond_0

    invoke-interface {p1, v0}, Lt1/d;->d0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2, v0}, Lt1/d;->T([BI)V

    :goto_0
    return-void
.end method
