.class public final Lb1/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/m;


# instance fields
.field public final a:Lb1/i0;


# direct methods
.method public constructor <init>(Lb1/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/f0;->a:Lb1/i0;

    return-void
.end method


# virtual methods
.method public final a(Lb1/o;Lb1/k$a;)V
    .locals 1

    sget-object v0, Lb1/k$a;->ON_CREATE:Lb1/k$a;

    if-ne p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {p1}, Lb1/o;->getLifecycle()Lb1/k;

    move-result-object p1

    invoke-virtual {p1, p0}, Lb1/k;->c(Lb1/n;)V

    iget-object p1, p0, Lb1/f0;->a:Lb1/i0;

    invoke-virtual {p1}, Lb1/i0;->b()V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Next event must be ON_CREATE, it was "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
