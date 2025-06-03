.class public final Lk2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Lm1/b;Lx0/k;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lu/a;

    const/4 v0, 0x6

    invoke-direct {p1, p3, v0}, Lu/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, p1}, Lm1/b;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b(Ld0/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld0/a<",
            "Li2/k;",
            ">;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
