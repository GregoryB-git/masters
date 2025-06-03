.class public abstract Lb1/t$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "d"
.end annotation


# instance fields
.field public final a:Lb1/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb1/x<",
            "-TT;>;"
        }
    .end annotation
.end field

.field public b:Z

.field public c:I

.field public final synthetic d:Lb1/t;


# direct methods
.method public constructor <init>(Lb1/t;Lb1/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb1/x<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lb1/t$d;->d:Lb1/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lb1/t$d;->c:I

    iput-object p2, p0, Lb1/t$d;->a:Lb1/x;

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 1

    iget-boolean v0, p0, Lb1/t$d;->b:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lb1/t$d;->b:Z

    iget-object v0, p0, Lb1/t$d;->d:Lb1/t;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    invoke-virtual {v0, p1}, Lb1/t;->changeActiveCounter(I)V

    iget-boolean p1, p0, Lb1/t$d;->b:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lb1/t$d;->d:Lb1/t;

    invoke-virtual {p1, p0}, Lb1/t;->dispatchingValue(Lb1/t$d;)V

    :cond_2
    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d(Lb1/o;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public abstract e()Z
.end method
