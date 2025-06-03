.class public final Lb1/m0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lb1/p;

.field public final b:Lb1/k$a;

.field public c:Z


# direct methods
.method public constructor <init>(Lb1/p;Lb1/k$a;)V
    .locals 1

    const-string v0, "registry"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/m0$a;->a:Lb1/p;

    iput-object p2, p0, Lb1/m0$a;->b:Lb1/k$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-boolean v0, p0, Lb1/m0$a;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lb1/m0$a;->a:Lb1/p;

    iget-object v1, p0, Lb1/m0$a;->b:Lb1/k$a;

    invoke-virtual {v0, v1}, Lb1/p;->f(Lb1/k$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb1/m0$a;->c:Z

    :cond_0
    return-void
.end method
