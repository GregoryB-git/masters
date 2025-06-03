.class public final Lxc/z$a;
.super Lxc/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxc/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lxc/z;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(J)Lxc/z;
    .locals 0

    return-object p0
.end method

.method public final f()V
    .locals 0

    return-void
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;)Lxc/z;
    .locals 0

    const-string p1, "unit"

    invoke-static {p3, p1}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
