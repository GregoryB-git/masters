.class public final Lo4/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo4/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ln7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/q<",
            "Landroid/os/HandlerThread;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ln7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/q<",
            "Landroid/os/HandlerThread;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 2

    new-instance v0, Ld9/p;

    invoke-direct {v0, p1}, Ld9/p;-><init>(I)V

    new-instance v1, Ld9/q;

    invoke-direct {v1, p1}, Ld9/q;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo4/b$a;->a:Ln7/q;

    iput-object v1, p0, Lo4/b$a;->b:Ln7/q;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lo4/j$a;)Lo4/j;
    .locals 0

    invoke-virtual {p0, p1}, Lo4/b$a;->b(Lo4/j$a;)Lo4/b;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lo4/j$a;)Lo4/b;
    .locals 6

    iget-object v0, p1, Lo4/j$a;->a:Lo4/l;

    iget-object v0, v0, Lo4/l;->a:Ljava/lang/String;

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createCodec:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lp2/m0;->i(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    new-instance v2, Lo4/b;

    iget-object v3, p0, Lo4/b$a;->a:Ln7/q;

    invoke-interface {v3}, Ln7/q;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/HandlerThread;

    iget-object v4, p0, Lo4/b$a;->b:Ln7/q;

    invoke-interface {v4}, Ln7/q;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/HandlerThread;

    const/4 v5, 0x0

    invoke-direct {v2, v0, v3, v4, v5}, Lo4/b;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-static {}, Lp2/m0;->B()V

    iget-object v1, p1, Lo4/j$a;->b:Landroid/media/MediaFormat;

    iget-object v3, p1, Lo4/j$a;->d:Landroid/view/Surface;

    iget-object p1, p1, Lo4/j$a;->e:Landroid/media/MediaCrypto;

    invoke-static {v2, v1, v3, p1}, Lo4/b;->o(Lo4/b;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    move-object v1, v2

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    move-object v0, v1

    :goto_0
    if-nez v1, :cond_0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lo4/b;->release()V

    :cond_1
    :goto_1
    throw p1
.end method
