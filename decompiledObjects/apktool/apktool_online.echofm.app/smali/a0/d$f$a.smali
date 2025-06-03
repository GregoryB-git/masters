.class public La0/d$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/d$f;->binderDied()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:La0/d$f;


# direct methods
.method public constructor <init>(La0/d$f;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$f$a;->o:La0/d$f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, La0/d$f$a;->o:La0/d$f;

    .line 2
    .line 3
    iget-object v1, v0, La0/d$f;->i:La0/d;

    .line 4
    .line 5
    iget-object v1, v1, La0/d;->s:Lt/a;

    .line 6
    .line 7
    iget-object v0, v0, La0/d$f;->f:La0/d$o;

    .line 8
    .line 9
    invoke-interface {v0}, La0/d$o;->asBinder()Landroid/os/IBinder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v1, v0}, Lt/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method
